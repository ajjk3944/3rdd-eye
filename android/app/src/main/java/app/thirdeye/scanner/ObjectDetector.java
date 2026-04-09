package app.thirdeye.scanner;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Log;

import org.tensorflow.lite.Interpreter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ObjectDetector {
    private static final String TAG = "ObjectDetector";
    private static final int INPUT_SIZE = 300;
    private static final int NUM_DETECTIONS = 10;
    private static final float DETECTION_THRESHOLD = 0.6f; // Increased from 0.5 to 0.6 for better accuracy
    
    // Priority objects for camera detection (cameras, phones, electronics)
    private static final String[] PRIORITY_OBJECTS = {
        "cell phone", "laptop", "tv", "remote", "keyboard", "mouse", "clock"
    };
    
    private Interpreter interpreter;
    private Vector<String> labels;
    private int[] intValues;
    private ByteBuffer imgData;
    private float[][][] outputLocations;
    private float[][] outputClasses;
    private float[][] outputScores;
    private float[] numDetections;
    
    public static class Detection {
        public String id;
        public String title;
        public Float confidence;
        public RectF location;
        
        public Detection(String id, String title, Float confidence, RectF location) {
            this.id = id;
            this.title = title;
            this.confidence = confidence;
            this.location = location;
        }
    }
    
    public ObjectDetector(AssetManager assetManager) throws IOException {
        // Load labels
        labels = new Vector<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(assetManager.open("labelmap.txt")));
        String line;
        while ((line = br.readLine()) != null) {
            labels.add(line);
        }
        br.close();
        
        // Load TFLite model
        MappedByteBuffer tfliteModel = loadModelFile(assetManager, "detect.tflite");
        Interpreter.Options options = new Interpreter.Options();
        interpreter = new Interpreter(tfliteModel, options);
        
        // Initialize buffers
        imgData = ByteBuffer.allocateDirect(INPUT_SIZE * INPUT_SIZE * 3);
        imgData.order(ByteOrder.nativeOrder());
        intValues = new int[INPUT_SIZE * INPUT_SIZE];
        
        // Initialize output arrays
        outputLocations = new float[1][NUM_DETECTIONS][4];
        outputClasses = new float[1][NUM_DETECTIONS];
        outputScores = new float[1][NUM_DETECTIONS];
        numDetections = new float[1];
        
        Log.d(TAG, "ObjectDetector initialized with " + labels.size() + " labels");
    }
    
    private MappedByteBuffer loadModelFile(AssetManager assetManager, String modelPath) throws IOException {
        AssetFileDescriptor fileDescriptor = assetManager.openFd(modelPath);
        FileInputStream inputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
        FileChannel fileChannel = inputStream.getChannel();
        long startOffset = fileDescriptor.getStartOffset();
        long declaredLength = fileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
    }
    
    public List<Detection> detectObjects(Bitmap bitmap) {
        if (bitmap == null) {
            return new ArrayList<>();
        }
        
        // Resize bitmap to INPUT_SIZE x INPUT_SIZE
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, INPUT_SIZE, INPUT_SIZE, true);
        
        // Convert bitmap to ByteBuffer
        resizedBitmap.getPixels(intValues, 0, INPUT_SIZE, 0, 0, INPUT_SIZE, INPUT_SIZE);
        imgData.rewind();
        
        for (int i = 0; i < INPUT_SIZE; ++i) {
            for (int j = 0; j < INPUT_SIZE; ++j) {
                int pixelValue = intValues[i * INPUT_SIZE + j];
                // Extract RGB values and normalize
                imgData.put((byte) ((pixelValue >> 16) & 0xFF));
                imgData.put((byte) ((pixelValue >> 8) & 0xFF));
                imgData.put((byte) (pixelValue & 0xFF));
            }
        }
        
        // Run inference
        Object[] inputArray = {imgData};
        Map<Integer, Object> outputMap = new HashMap<>();
        outputMap.put(0, outputLocations);
        outputMap.put(1, outputClasses);
        outputMap.put(2, outputScores);
        outputMap.put(3, numDetections);
        
        interpreter.runForMultipleInputsOutputs(inputArray, outputMap);
        
        // Parse results with improved filtering
        List<Detection> detections = new ArrayList<>();
        for (int i = 0; i < NUM_DETECTIONS; i++) {
            float confidence = outputScores[0][i];
            
            if (confidence >= DETECTION_THRESHOLD) {
                float[] location = outputLocations[0][i];
                int classIndex = (int) outputClasses[0][i];
                
                // Get label (add 1 to index as labels are 1-indexed)
                String label = "";
                if (classIndex + 1 < labels.size()) {
                    label = labels.get(classIndex + 1);
                }
                
                // Skip "???" labels
                if (label.equals("???") || label.trim().isEmpty()) {
                    continue;
                }
                
                // Boost confidence for priority objects (electronics)
                boolean isPriority = false;
                for (String priorityObj : PRIORITY_OBJECTS) {
                    if (label.toLowerCase().contains(priorityObj)) {
                        isPriority = true;
                        break;
                    }
                }
                
                // Create RectF (coordinates are normalized 0-1)
                RectF rectF = new RectF(
                    location[1] * INPUT_SIZE,  // left
                    location[0] * INPUT_SIZE,  // top
                    location[3] * INPUT_SIZE,  // right
                    location[2] * INPUT_SIZE   // bottom
                );
                
                detections.add(new Detection(
                    String.valueOf(i),
                    label,
                    confidence,
                    rectF
                ));
                
                String priorityTag = isPriority ? " [PRIORITY]" : "";
                Log.d(TAG, "Detection " + i + ": " + label + " (" + (confidence * 100) + "%)" + priorityTag);
            }
        }
        
        return detections;
    }
    
    public void close() {
        if (interpreter != null) {
            interpreter.close();
            interpreter = null;
        }
    }
}
