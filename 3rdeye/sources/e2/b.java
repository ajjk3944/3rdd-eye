package E2;

import D2.c;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Vector;

/* compiled from: TFLiteObjectDetectionAPIModel.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final c f1364k = new c();

    /* renamed from: a, reason: collision with root package name */
    public boolean f1365a;

    /* renamed from: b, reason: collision with root package name */
    public int f1366b;

    /* renamed from: c, reason: collision with root package name */
    public Vector<String> f1367c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1368d;

    /* renamed from: e, reason: collision with root package name */
    public float[][][] f1369e;

    /* renamed from: f, reason: collision with root package name */
    public float[][] f1370f;

    /* renamed from: g, reason: collision with root package name */
    public float[][] f1371g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f1372h;
    public ByteBuffer i;

    /* renamed from: j, reason: collision with root package name */
    public org.tensorflow.lite.a f1373j;

    public static b a(AssetManager assetManager) throws IOException {
        b bVar = new b();
        bVar.f1367c = new Vector<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open("file:///android_asset/labelmap.txt".split("file:///android_asset/")[1])));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                bVar.f1366b = 300;
                try {
                    AssetFileDescriptor assetFileDescriptorOpenFd = assetManager.openFd("detect.tflite");
                    bVar.f1373j = new org.tensorflow.lite.a(new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength()));
                    bVar.f1365a = true;
                    int i = bVar.f1366b;
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i * 3);
                    bVar.i = byteBufferAllocateDirect;
                    byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                    int i10 = bVar.f1366b;
                    bVar.f1368d = new int[i10 * i10];
                    bVar.f1373j.c(4);
                    Class cls = Float.TYPE;
                    bVar.f1369e = (float[][][]) Array.newInstance((Class<?>) cls, 1, 10, 4);
                    bVar.f1370f = (float[][]) Array.newInstance((Class<?>) cls, 1, 10);
                    bVar.f1371g = (float[][]) Array.newInstance((Class<?>) cls, 1, 10);
                    bVar.f1372h = new float[1];
                    return bVar;
                } catch (Exception e4) {
                    throw new RuntimeException(e4);
                }
            }
            f1364k.f(line, new Object[0]);
            bVar.f1367c.add(line);
        }
    }
}
