package app.thirdeye.scanner.network;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Signal Graph View - Custom view to display WiFi signal strength graph
 * Similar to "Who uses my wifi" app signal monitor
 */
public class SignalGraphView extends View {
    private static final int GRID_COLOR = Color.parseColor("#333333");
    private static final int SIGNAL_COLOR = Color.parseColor("#4A90E2");
    private static final int FILL_COLOR = Color.parseColor("#334A90E2");
    private static final int TEXT_COLOR = Color.parseColor("#FFFFFF");
    private static final int BASELINE_COLOR = Color.parseColor("#666666");
    
    private Paint signalPaint;
    private Paint fillPaint;
    private Paint gridPaint;
    private Paint textPaint;
    private Paint baselinePaint;
    
    private List<WiFiSignalMonitor.SignalDataPoint> dataPoints;
    private int maxDataPoints = 60;
    
    // Signal range: -90 dBm (worst) to -30 dBm (best)
    private static final int MIN_SIGNAL = -90;
    private static final int MAX_SIGNAL = -30;
    
    public SignalGraphView(Context context) {
        super(context);
        init();
    }
    
    public SignalGraphView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    
    public SignalGraphView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    
    private void init() {
        dataPoints = new ArrayList<>();
        
        // Signal line paint
        signalPaint = new Paint();
        signalPaint.setColor(SIGNAL_COLOR);
        signalPaint.setStrokeWidth(4f);
        signalPaint.setStyle(Paint.Style.STROKE);
        signalPaint.setAntiAlias(true);
        
        // Fill paint
        fillPaint = new Paint();
        fillPaint.setColor(FILL_COLOR);
        fillPaint.setStyle(Paint.Style.FILL);
        fillPaint.setAntiAlias(true);
        
        // Grid paint
        gridPaint = new Paint();
        gridPaint.setColor(GRID_COLOR);
        gridPaint.setStrokeWidth(1f);
        gridPaint.setStyle(Paint.Style.STROKE);
        gridPaint.setAntiAlias(true);
        
        // Text paint
        textPaint = new Paint();
        textPaint.setColor(TEXT_COLOR);
        textPaint.setTextSize(24f);
        textPaint.setAntiAlias(true);
        
        // Baseline paint
        baselinePaint = new Paint();
        baselinePaint.setColor(BASELINE_COLOR);
        baselinePaint.setStrokeWidth(2f);
        baselinePaint.setStyle(Paint.Style.STROKE);
        baselinePaint.setAntiAlias(true);
        baselinePaint.setPathEffect(new android.graphics.DashPathEffect(new float[]{10, 10}, 0));
    }
    
    public void setDataPoints(List<WiFiSignalMonitor.SignalDataPoint> dataPoints) {
        this.dataPoints = new ArrayList<>(dataPoints);
        invalidate();
    }
    
    public void setMaxDataPoints(int maxDataPoints) {
        this.maxDataPoints = maxDataPoints;
    }
    
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        
        int width = getWidth();
        int height = getHeight();
        
        if (width == 0 || height == 0) {
            return;
        }
        
        // Draw background grid
        drawGrid(canvas, width, height);
        
        // Draw baseline (average signal)
        drawBaseline(canvas, width, height);
        
        // Draw signal graph
        if (dataPoints != null && dataPoints.size() > 1) {
            drawSignalGraph(canvas, width, height);
        }
    }
    
    private void drawGrid(Canvas canvas, int width, int height) {
        // Draw horizontal grid lines
        int gridLines = 5;
        for (int i = 0; i <= gridLines; i++) {
            float y = (height / (float) gridLines) * i;
            canvas.drawLine(0, y, width, y, gridPaint);
        }
        
        // Draw vertical grid lines
        int verticalLines = 10;
        for (int i = 0; i <= verticalLines; i++) {
            float x = (width / (float) verticalLines) * i;
            canvas.drawLine(x, 0, x, height, gridPaint);
        }
    }
    
    private void drawBaseline(Canvas canvas, int width, int height) {
        if (dataPoints == null || dataPoints.isEmpty()) {
            return;
        }
        
        // Calculate average signal
        int sum = 0;
        for (WiFiSignalMonitor.SignalDataPoint point : dataPoints) {
            sum += point.signalStrength;
        }
        float average = sum / (float) dataPoints.size();
        
        // Convert to Y coordinate
        float y = signalToY(average, height);
        
        // Draw dashed line
        canvas.drawLine(0, y, width, y, baselinePaint);
    }
    
    private void drawSignalGraph(Canvas canvas, int width, int height) {
        Path linePath = new Path();
        Path fillPath = new Path();
        
        int pointCount = Math.min(dataPoints.size(), maxDataPoints);
        float xStep = width / (float) (maxDataPoints - 1);
        
        // Start from the oldest data point we want to show
        int startIndex = Math.max(0, dataPoints.size() - maxDataPoints);
        
        boolean firstPoint = true;
        for (int i = 0; i < pointCount; i++) {
            WiFiSignalMonitor.SignalDataPoint point = dataPoints.get(startIndex + i);
            
            float x = i * xStep;
            float y = signalToY(point.signalStrength, height);
            
            if (firstPoint) {
                linePath.moveTo(x, y);
                fillPath.moveTo(x, height);
                fillPath.lineTo(x, y);
                firstPoint = false;
            } else {
                linePath.lineTo(x, y);
                fillPath.lineTo(x, y);
            }
        }
        
        // Complete fill path
        if (pointCount > 0) {
            fillPath.lineTo((pointCount - 1) * xStep, height);
            fillPath.close();
        }
        
        // Draw fill first
        canvas.drawPath(fillPath, fillPaint);
        
        // Draw line on top
        canvas.drawPath(linePath, signalPaint);
    }
    
    /**
     * Convert signal strength (dBm) to Y coordinate
     */
    private float signalToY(float signal, int height) {
        // Normalize signal to 0-1 range
        float normalized = (signal - MIN_SIGNAL) / (float) (MAX_SIGNAL - MIN_SIGNAL);
        
        // Clamp to 0-1
        normalized = Math.max(0, Math.min(1, normalized));
        
        // Invert Y axis (0 at top, height at bottom)
        return height * (1 - normalized);
    }
}
