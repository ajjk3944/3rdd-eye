package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui;

import C2.h;
import F2.a;
import N7.C1094a9;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.hardware.camera2.CameraAccessException;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Size;
import android.util.TypedValue;
import android.widget.Toast;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.customview.OverlayView;
import com.zipoapps.premiumhelper.e;
import g0.C4356c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class DetectorActivity extends com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a implements ImageReader.OnImageAvailableListener {

    /* renamed from: L, reason: collision with root package name */
    public static final D2.c f22126L = new D2.c();

    /* renamed from: M, reason: collision with root package name */
    public static final d f22127M = d.TF_OD_API;

    /* renamed from: N, reason: collision with root package name */
    public static final Size f22128N = new Size(640, 480);

    /* renamed from: A, reason: collision with root package name */
    public Integer f22129A;

    /* renamed from: B, reason: collision with root package name */
    public E2.b f22130B;

    /* renamed from: C, reason: collision with root package name */
    public long f22131C;

    /* renamed from: D, reason: collision with root package name */
    public Bitmap f22132D = null;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f22133E = null;

    /* renamed from: F, reason: collision with root package name */
    public Bitmap f22134F = null;

    /* renamed from: G, reason: collision with root package name */
    public boolean f22135G = false;

    /* renamed from: H, reason: collision with root package name */
    public long f22136H = 0;

    /* renamed from: I, reason: collision with root package name */
    public Matrix f22137I;

    /* renamed from: J, reason: collision with root package name */
    public Matrix f22138J;

    /* renamed from: K, reason: collision with root package name */
    public F2.a f22139K;

    /* renamed from: z, reason: collision with root package name */
    public OverlayView f22140z;

    public class a implements OverlayView.a {
        public a() {
        }

        @Override // com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.customview.OverlayView.a
        public final void a(Canvas canvas) {
            F2.a aVar = DetectorActivity.this.f22139K;
            synchronized (aVar) {
                try {
                    boolean z10 = aVar.f1593j % 180 == 90;
                    float fMin = Math.min(canvas.getHeight() / (z10 ? aVar.f1592h : aVar.i), canvas.getWidth() / (z10 ? aVar.i : aVar.f1592h));
                    aVar.f1591g = D2.b.b(aVar.f1592h, aVar.i, (int) ((z10 ? r5 : r4) * fMin), (int) (fMin * (z10 ? r4 : r5)), aVar.f1593j);
                    for (a.C0027a c0027a : aVar.f1588d) {
                        RectF rectF = new RectF(c0027a.f1594a);
                        aVar.f1591g.mapRect(rectF);
                        aVar.f1589e.setColor(c0027a.f1596c);
                        float fMin2 = Math.min(rectF.width(), rectF.height()) / 8.0f;
                        canvas.drawRoundRect(rectF, fMin2, fMin2, aVar.f1589e);
                        String str = !TextUtils.isEmpty(c0027a.f1597d) ? String.format("%s %.2f", c0027a.f1597d, Float.valueOf(c0027a.f1595b * 100.0f)) : String.format("%.2f", Float.valueOf(c0027a.f1595b * 100.0f));
                        D2.a aVar2 = aVar.f1590f;
                        float f10 = rectF.left + fMin2;
                        float f11 = rectF.top;
                        String str2 = str + "%";
                        Paint paint = aVar.f1589e;
                        Paint paint2 = aVar2.f1032b;
                        float fMeasureText = paint2.measureText(str2);
                        float textSize = paint2.getTextSize();
                        Paint paint3 = new Paint(paint);
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setAlpha(160);
                        canvas.drawRect(f10, ((int) textSize) + f11, ((int) fMeasureText) + f10, f11, paint3);
                        canvas.drawText(str2, f10, f11 + textSize, aVar2.f1031a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            DetectorActivity.this.getClass();
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f22142b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                DetectorActivity.this.f22160q.setText(DetectorActivity.this.f22147c + "x" + DetectorActivity.this.f22148d);
                DetectorActivity.this.f22161r.setText(DetectorActivity.this.f22134F.getWidth() + "x" + DetectorActivity.this.f22134F.getHeight());
                DetectorActivity.this.f22162s.setText(C1094a9.f(new StringBuilder(), DetectorActivity.this.f22131C, "ms"));
            }
        }

        public b(long j4) {
            this.f22142b = j4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            char c10 = 1;
            DetectorActivity.f22126L.c("Running detection on image " + this.f22142b, new Object[0]);
            long jUptimeMillis = SystemClock.uptimeMillis();
            DetectorActivity detectorActivity = DetectorActivity.this;
            E2.b bVar = detectorActivity.f22130B;
            Bitmap bitmap = detectorActivity.f22133E;
            bVar.getClass();
            Trace.beginSection("recognizeImage");
            Trace.beginSection("preprocessBitmap");
            bitmap.getPixels(bVar.f1368d, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            bVar.i.rewind();
            for (int i = 0; i < bVar.f1366b; i++) {
                int i10 = 0;
                while (true) {
                    int i11 = bVar.f1366b;
                    if (i10 < i11) {
                        int i12 = bVar.f1368d[(i11 * i) + i10];
                        if (bVar.f1365a) {
                            bVar.i.put((byte) ((i12 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
                            bVar.i.put((byte) ((i12 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
                            bVar.i.put((byte) (i12 & KotlinVersion.MAX_COMPONENT_VALUE));
                        } else {
                            bVar.i.putFloat((((i12 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - 128.0f) / 128.0f);
                            bVar.i.putFloat((((i12 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - 128.0f) / 128.0f);
                            bVar.i.putFloat(((i12 & KotlinVersion.MAX_COMPONENT_VALUE) - 128.0f) / 128.0f);
                        }
                        i10++;
                    }
                }
            }
            Trace.endSection();
            Trace.beginSection("feed");
            Class cls = Float.TYPE;
            bVar.f1369e = (float[][][]) Array.newInstance((Class<?>) cls, 1, 10, 4);
            bVar.f1370f = (float[][]) Array.newInstance((Class<?>) cls, 1, 10);
            bVar.f1371g = (float[][]) Array.newInstance((Class<?>) cls, 1, 10);
            bVar.f1372h = new float[1];
            Object[] objArr = {bVar.i};
            HashMap map = new HashMap();
            map.put(0, bVar.f1369e);
            map.put(1, bVar.f1370f);
            map.put(2, bVar.f1371g);
            map.put(3, bVar.f1372h);
            Trace.endSection();
            Trace.beginSection("run");
            bVar.f1373j.a(objArr, map);
            Trace.endSection();
            ArrayList arrayList = new ArrayList(10);
            int i13 = 0;
            while (i13 < 10) {
                float[] fArr = bVar.f1369e[0][i13];
                float f10 = fArr[c10];
                float f11 = bVar.f1366b;
                arrayList.add(new E2.a(C4356c.h(i13, ""), bVar.f1367c.get(((int) bVar.f1370f[0][i13]) + 1), Float.valueOf(bVar.f1371g[0][i13]), new RectF(f10 * f11, fArr[0] * f11, fArr[3] * f11, fArr[2] * f11)));
                i13++;
                c10 = c10;
            }
            char c11 = c10;
            Trace.endSection();
            DetectorActivity.this.f22131C = SystemClock.uptimeMillis() - jUptimeMillis;
            DetectorActivity detectorActivity2 = DetectorActivity.this;
            detectorActivity2.f22134F = Bitmap.createBitmap(detectorActivity2.f22133E);
            Canvas canvas = new Canvas(DetectorActivity.this.f22134F);
            Paint paint = new Paint();
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(2.0f);
            int i14 = c.f22145a[DetectorActivity.f22127M.ordinal()];
            LinkedList linkedList = new LinkedList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                E2.a aVar = (E2.a) it.next();
                aVar.getClass();
                RectF rectF = new RectF(aVar.f1363d);
                if (aVar.f1362c.floatValue() >= 0.5f) {
                    canvas.drawRect(rectF, paint);
                    DetectorActivity.this.f22138J.mapRect(rectF);
                    aVar.f1363d = rectF;
                    linkedList.add(aVar);
                }
            }
            F2.a aVar2 = DetectorActivity.this.f22139K;
            long j4 = this.f22142b;
            synchronized (aVar2) {
                D2.c cVar = aVar2.f1586b;
                Integer numValueOf = Integer.valueOf(linkedList.size());
                Long lValueOf = Long.valueOf(j4);
                Object[] objArr2 = new Object[2];
                objArr2[0] = numValueOf;
                objArr2[c11] = lValueOf;
                cVar.c("Processing %d results from %d", objArr2);
                aVar2.a(linkedList);
            }
            DetectorActivity.this.f22140z.postInvalidate();
            DetectorActivity detectorActivity3 = DetectorActivity.this;
            detectorActivity3.f22135G = false;
            detectorActivity3.runOnUiThread(new a());
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22145a;

        static {
            int[] iArr = new int[d.values().length];
            f22145a = iArr;
            try {
                iArr[d.TF_OD_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum d {
        TF_OD_API
    }

    @Override // com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a
    public final Size l() {
        return f22128N;
    }

    @Override // com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a
    public final void m(Size size, int i) {
        float fApplyDimension = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setTextSize(fApplyDimension);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(false);
        paint.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        Paint paint2 = new Paint();
        paint2.setTextSize(fApplyDimension);
        paint2.setColor(-16777216);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setStrokeWidth(fApplyDimension / 8.0f);
        paint2.setAntiAlias(false);
        paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        Typeface typeface = Typeface.MONOSPACE;
        paint.setTypeface(typeface);
        paint2.setTypeface(typeface);
        this.f22139K = new F2.a(this);
        try {
            this.f22130B = E2.b.a(getAssets());
        } catch (IOException e4) {
            e4.printStackTrace();
            f22126L.b(e4, "Exception initializing classifier!", new Object[0]);
            Toast.makeText(getApplicationContext(), "Classifier could not be initialized", 0).show();
            finish();
        }
        this.f22147c = size.getWidth();
        this.f22148d = size.getHeight();
        int rotation = getWindowManager().getDefaultDisplay().getRotation();
        Integer numValueOf = Integer.valueOf(i - (rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90));
        this.f22129A = numValueOf;
        D2.c cVar = f22126L;
        cVar.c("Camera orientation relative to screen canvas: %d", numValueOf);
        cVar.c("Initializing at size %dx%d", Integer.valueOf(this.f22147c), Integer.valueOf(this.f22148d));
        int i10 = this.f22147c;
        int i11 = this.f22148d;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f22132D = Bitmap.createBitmap(i10, i11, config);
        this.f22133E = Bitmap.createBitmap(300, 300, config);
        this.f22137I = D2.b.b(this.f22147c, this.f22148d, 300, 300, this.f22129A.intValue());
        Matrix matrix = new Matrix();
        this.f22138J = matrix;
        this.f22137I.invert(matrix);
        OverlayView overlayView = (OverlayView) findViewById(R.id.tracking_overlay);
        this.f22140z = overlayView;
        overlayView.f22183b.add(new a());
        F2.a aVar = this.f22139K;
        int i12 = this.f22147c;
        int i13 = this.f22148d;
        int iIntValue = this.f22129A.intValue();
        synchronized (aVar) {
            aVar.f1592h = i12;
            aVar.i = i13;
            aVar.f1593j = iIntValue;
        }
    }

    @Override // com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a
    public final void n() {
        long j4 = this.f22136H + 1;
        this.f22136H = j4;
        this.f22140z.postInvalidate();
        if (this.f22135G) {
            Runnable runnable = this.f22155l;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        this.f22135G = true;
        f22126L.c("Preparing image " + j4 + " for detection in bg thread.", new Object[0]);
        Bitmap bitmap = this.f22132D;
        this.f22156m.run();
        int[] iArr = this.f22153j;
        int i = this.f22147c;
        bitmap.setPixels(iArr, 0, i, 0, 0, i, this.f22148d);
        Runnable runnable2 = this.f22155l;
        if (runnable2 != null) {
            runnable2.run();
        }
        new Canvas(this.f22133E).drawBitmap(this.f22132D, this.f22137I, null);
        o(new b(j4));
    }

    @Override // com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a, androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) throws CameraAccessException {
        super.onCreate(bundle);
        e.f37006D.getClass();
        e.a.a().f37021k.s("object_detector", new Bundle[0]);
    }

    @Override // com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a
    public final void q(final int i) {
        o(new Runnable() { // from class: C2.i
            @Override // java.lang.Runnable
            public final void run() {
                org.tensorflow.lite.a aVar = this.f902b.f22130B.f1373j;
                if (aVar != null) {
                    aVar.c(i);
                }
            }
        });
    }

    @Override // com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a
    public final void r(boolean z10) {
        o(new h(this, z10));
    }
}
