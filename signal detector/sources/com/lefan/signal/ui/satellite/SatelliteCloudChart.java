package com.lefan.signal.ui.satellite;

import F4.e;
import R2.a;
import V4.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class SatelliteCloudChart extends View implements SensorEventListener, Runnable {

    /* renamed from: C, reason: collision with root package name */
    public int f19205C;

    /* renamed from: D, reason: collision with root package name */
    public float f19206D;

    /* renamed from: E, reason: collision with root package name */
    public float f19207E;

    /* renamed from: F, reason: collision with root package name */
    public float f19208F;

    /* renamed from: G, reason: collision with root package name */
    public float f19209G;

    /* renamed from: H, reason: collision with root package name */
    public float f19210H;

    /* renamed from: I, reason: collision with root package name */
    public float f19211I;

    /* renamed from: J, reason: collision with root package name */
    public final Paint f19212J;

    /* renamed from: K, reason: collision with root package name */
    public float f19213K;

    /* renamed from: L, reason: collision with root package name */
    public float f19214L;
    public final Paint M;

    /* renamed from: N, reason: collision with root package name */
    public final Paint f19215N;

    /* renamed from: O, reason: collision with root package name */
    public final Paint f19216O;

    /* renamed from: P, reason: collision with root package name */
    public final Paint f19217P;

    /* renamed from: Q, reason: collision with root package name */
    public final Paint f19218Q;

    /* renamed from: R, reason: collision with root package name */
    public float f19219R;

    /* renamed from: S, reason: collision with root package name */
    public final Paint f19220S;

    /* renamed from: T, reason: collision with root package name */
    public final ArrayList f19221T;

    /* renamed from: U, reason: collision with root package name */
    public final Path f19222U;

    /* renamed from: V, reason: collision with root package name */
    public final float f19223V;

    /* renamed from: W, reason: collision with root package name */
    public final float[] f19224W;

    /* renamed from: a, reason: collision with root package name */
    public boolean f19225a;

    /* renamed from: a0, reason: collision with root package name */
    public final float[] f19226a0;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f19227b;
    public final float[] b0;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f19228c;

    /* renamed from: c0, reason: collision with root package name */
    public final float[] f19229c0;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f19230d;

    /* renamed from: d0, reason: collision with root package name */
    public float f19231d0;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f19232e;

    /* renamed from: f, reason: collision with root package name */
    public final Bitmap f19233f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap f19234g;

    /* renamed from: h, reason: collision with root package name */
    public final Bitmap f19235h;
    public final Bitmap i;

    /* renamed from: j, reason: collision with root package name */
    public final SensorManager f19236j;

    /* renamed from: k, reason: collision with root package name */
    public final Sensor f19237k;

    /* renamed from: l, reason: collision with root package name */
    public final Sensor f19238l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f19239m;

    /* renamed from: n, reason: collision with root package name */
    public float f19240n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SatelliteCloudChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19225a = true;
        this.f19227b = BitmapFactory.decodeResource(getResources(), R.drawable.flag_us);
        this.f19228c = BitmapFactory.decodeResource(getResources(), R.drawable.flag_china);
        this.f19230d = BitmapFactory.decodeResource(getResources(), R.drawable.flag_india);
        this.f19232e = BitmapFactory.decodeResource(getResources(), R.drawable.flag_japan);
        this.f19233f = BitmapFactory.decodeResource(getResources(), R.drawable.flag_eu);
        this.f19234g = BitmapFactory.decodeResource(getResources(), R.drawable.flag_russia);
        this.f19235h = BitmapFactory.decodeResource(getResources(), R.drawable.flag_unknown);
        this.i = BitmapFactory.decodeResource(getResources(), R.drawable.flag_satellite_used);
        this.f19239m = new Handler(Looper.getMainLooper());
        Paint paint = new Paint();
        this.f19212J = paint;
        Paint paint2 = new Paint();
        this.M = paint2;
        Paint paint3 = new Paint();
        this.f19215N = paint3;
        Paint paint4 = new Paint();
        this.f19216O = paint4;
        Paint paint5 = new Paint();
        this.f19217P = paint5;
        this.f19218Q = new Paint();
        Paint paint6 = new Paint();
        this.f19220S = paint6;
        paint2.setAntiAlias(true);
        paint2.setColor(getContext().getColor(R.color.view_bg2));
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setShadowLayer(20.0f, 0.0f, 0.0f, getContext().getColor(R.color.text_color));
        paint6.setAntiAlias(true);
        paint6.setColor(getContext().getColor(R.color.view_sub_color));
        paint6.setStyle(Paint.Style.STROKE);
        paint3.setColor(getContext().getColor(R.color.text_color));
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        paint5.setColor(getContext().getColor(R.color.text_color));
        paint4.setColor(getContext().getColor(R.color.view_sub_color));
        paint.setTextAlign(align);
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.f19236j = sensorManager;
        this.f19237k = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
        this.f19238l = sensorManager != null ? sensorManager.getDefaultSensor(2) : null;
        this.f19221T = new ArrayList();
        this.f19222U = new Path();
        this.f19223V = 0.97f;
        this.f19224W = new float[9];
        this.f19226a0 = new float[9];
        this.b0 = new float[3];
        this.f19229c0 = new float[3];
    }

    private final void getMyDirection() {
        float[] fArr = this.b0;
        float[] fArr2 = this.f19229c0;
        float[] fArr3 = this.f19224W;
        if (SensorManager.getRotationMatrix(fArr3, this.f19226a0, fArr, fArr2)) {
            SensorManager.getOrientation(fArr3, new float[3]);
            float degrees = (((float) Math.toDegrees(r0[0])) + 720) % 360;
            if (Math.abs(degrees - this.f19231d0) > 2.0f) {
                this.f19231d0 = degrees;
                this.f19240n = degrees;
                invalidate();
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19225a) {
            SensorManager sensorManager = this.f19236j;
            if (sensorManager != null) {
                sensorManager.registerListener(this, this.f19237k, 1);
            }
            if (sensorManager != null) {
                sensorManager.registerListener(this, this.f19238l, 1);
            }
            this.f19239m.postDelayed(this, 50L);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SensorManager sensorManager = this.f19236j;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.f19239m.removeCallbacks(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2;
        String str;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        float f2 = this.f19206D;
        canvas.drawCircle(f2, f2, this.f19207E, this.M);
        float f5 = -this.f19240n;
        float f6 = this.f19206D;
        canvas.rotate(f5, f6, f6);
        float f7 = this.f19206D;
        float f8 = this.f19208F;
        Paint paint = this.f19220S;
        canvas.drawCircle(f7, f7, f8, paint);
        float f9 = this.f19206D;
        float f10 = 3;
        canvas.drawCircle(f9, f9, (this.f19208F * 1) / f10, paint);
        float f11 = this.f19206D;
        int i3 = 2;
        float f12 = 2;
        canvas.drawCircle(f11, f11, (this.f19208F * f12) / f10, paint);
        float f13 = this.f19206D;
        float f14 = this.f19208F;
        canvas.drawLine(f13 - f14, f13, f14 + f13, f13, paint);
        float f15 = this.f19206D;
        float f16 = this.f19208F;
        canvas.drawLine(f15, f15 - f16, f15, f15 + f16, paint);
        int i6 = 0;
        for (int i7 = 0; i7 < 360; i7++) {
            int i8 = i7 % 2;
            Paint paint2 = this.f19216O;
            if (i8 != 0) {
                float f17 = this.f19206D;
                float f18 = f17 - this.f19209G;
                canvas2 = canvas;
                canvas2.drawLine(f17, f18, f17, f18 + this.f19210H, paint2);
            } else if (i7 % 10 == 0) {
                float f19 = this.f19206D;
                float f20 = f19 - this.f19209G;
                canvas2 = canvas;
                canvas2.drawLine(f19, f20, f19, (this.f19210H * f12) + f20, this.f19217P);
                Paint paint3 = this.f19212J;
                Paint paint4 = this.f19218Q;
                Path path = this.f19222U;
                if (i7 == 0) {
                    path.reset();
                    float f21 = this.f19206D;
                    path.moveTo(f21, (this.f19210H * f12) + (f21 - this.f19209G));
                    path.lineTo(this.f19206D - (this.f19214L / f12), this.f19219R);
                    path.lineTo((this.f19214L / f12) + this.f19206D, this.f19219R);
                    path.close();
                    paint4.setColor(-65536);
                    canvas2.drawPath(path, paint4);
                    paint3.setColor(-1);
                    canvas2.drawText("N", this.f19206D, this.f19213K, paint3);
                } else if (i7 == 90) {
                    path.reset();
                    float f22 = this.f19206D;
                    path.moveTo(f22, (this.f19210H * f12) + (f22 - this.f19209G));
                    path.lineTo(this.f19206D - (this.f19214L / f12), this.f19219R);
                    path.lineTo((this.f19214L / f12) + this.f19206D, this.f19219R);
                    path.close();
                    paint4.setColor(-7829368);
                    canvas2.drawPath(path, paint4);
                    paint3.setColor(-1);
                    canvas2.drawText("E", this.f19206D, this.f19213K, paint3);
                } else if (i7 == 180) {
                    path.reset();
                    float f23 = this.f19206D;
                    path.moveTo(f23, (this.f19210H * f12) + (f23 - this.f19209G));
                    path.lineTo(this.f19206D - (this.f19214L / f12), this.f19219R);
                    path.lineTo((this.f19214L / f12) + this.f19206D, this.f19219R);
                    path.close();
                    paint4.setColor(-16776961);
                    canvas2.drawPath(path, paint4);
                    paint3.setColor(-1);
                    canvas2.drawText("S", this.f19206D, this.f19213K, paint3);
                } else if (i7 != 270) {
                    Integer numValueOf = Integer.valueOf(i7);
                    if (a.f3390d) {
                        Locale locale = e.f1457a;
                        str = String.format(e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    } else {
                        str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    }
                    canvas2.drawText(str, this.f19206D, this.f19211I, this.f19215N);
                } else {
                    path.reset();
                    float f24 = this.f19206D;
                    path.moveTo(f24, (this.f19210H * f12) + (f24 - this.f19209G));
                    path.lineTo(this.f19206D - (this.f19214L / f12), this.f19219R);
                    path.lineTo((this.f19214L / f12) + this.f19206D, this.f19219R);
                    path.close();
                    paint4.setColor(-7829368);
                    canvas2.drawPath(path, paint4);
                    paint3.setColor(-1);
                    canvas2.drawText("W", this.f19206D, this.f19213K, paint3);
                }
            } else {
                canvas2 = canvas;
                float f25 = this.f19206D;
                float f26 = f25 - this.f19209G;
                canvas2.drawLine(f25, f26, f25, (this.f19210H * f12) + f26, paint2);
            }
            float f27 = this.f19206D;
            canvas2.rotate(1.0f, f27, f27);
        }
        float f28 = this.f19206D;
        canvas.rotate(1.0f, f28, f28);
        ArrayList arrayList = new ArrayList(this.f19221T);
        int size = arrayList.size();
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            l lVar = (l) obj;
            float f29 = lVar.f3907c;
            if (f29 >= 0.0f) {
                float f30 = 90;
                float f31 = ((f30 - f29) / f30) * this.f19208F;
                double d6 = lVar.f3906b - f30;
                int i9 = lVar.f3909e;
                Bitmap bitmap = this.f19235h;
                switch (i9) {
                    case 1:
                        bitmap = this.f19227b;
                        i.d(bitmap, "usBitmap");
                        break;
                    case 2:
                        i.d(bitmap, "unknownBitmap");
                        break;
                    case 3:
                        bitmap = this.f19234g;
                        i.d(bitmap, "russiaBitmap");
                        break;
                    case 4:
                        bitmap = this.f19232e;
                        i.d(bitmap, "japanBitmap");
                        break;
                    case 5:
                        bitmap = this.f19228c;
                        i.d(bitmap, "chBitmap");
                        break;
                    case 6:
                        bitmap = this.f19233f;
                        i.d(bitmap, "euBitmap");
                        break;
                    case 7:
                        bitmap = this.f19230d;
                        i.d(bitmap, "indiaBitmap");
                        break;
                    default:
                        i.d(bitmap, "unknownBitmap");
                        break;
                }
                i = i3;
                double d7 = f31;
                double dCos = ((Math.cos(Math.toRadians(d6)) * d7) + this.f19206D) - (this.f19205C / 4);
                double dSin = (Math.sin(Math.toRadians(d6)) * d7) + this.f19206D;
                if (lVar.f3905a) {
                    canvas.drawBitmap(this.i, (float) (dCos - (r4.getWidth() / i)), (float) (dSin - (r4.getHeight() / i)), (Paint) null);
                }
                canvas.drawBitmap(bitmap, (float) (dCos - (bitmap.getWidth() / i)), (float) (dSin - (bitmap.getHeight() / i)), (Paint) null);
            } else {
                i = i3;
            }
            i3 = i;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        float size = View.MeasureSpec.getSize(i);
        float f2 = size / 2.0f;
        this.f19206D = f2;
        float f5 = 10;
        this.f19207E = (9.5f * f2) / f5;
        this.f19209G = (f2 * 9.2f) / f5;
        float f6 = size / 1000.0f;
        float f7 = 30 * f6;
        this.f19205C = (int) f7;
        float f8 = 3 * f6;
        this.f19216O.setStrokeWidth(f8);
        this.f19217P.setStrokeWidth(f8);
        this.f19215N.setTextSize(25 * f6);
        this.f19210H = 5 * f6;
        float f9 = this.f19206D;
        float f10 = this.f19209G;
        this.f19211I = (40 * f6) + (f9 - f10);
        this.f19219R = (60 * f6) + (f9 - f10);
        this.f19214L = 50 * f6;
        this.f19218Q.setTextSize(35 * f6);
        float f11 = this.f19206D;
        float f12 = this.f19209G;
        this.f19213K = (55 * f6) + (f11 - f12);
        this.f19208F = f12 - (f6 * 65);
        this.f19212J.setTextSize(f7);
        setMeasuredDimension(i, i);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            int type = sensorEvent.sensor.getType();
            float f2 = this.f19223V;
            if (type == 1) {
                float[] fArr = this.b0;
                float f5 = fArr[0] * f2;
                float f6 = 1;
                float[] fArr2 = sensorEvent.values;
                fArr[0] = ((f6 - f2) * fArr2[0]) + f5;
                fArr[1] = ((f6 - f2) * fArr2[1]) + (fArr[1] * f2);
                fArr[2] = ((f6 - f2) * fArr2[2]) + (fArr[2] * f2);
            }
            if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = this.f19229c0;
                float f7 = fArr3[0] * f2;
                float f8 = 1;
                float[] fArr4 = sensorEvent.values;
                fArr3[0] = ((f8 - f2) * fArr4[0]) + f7;
                fArr3[1] = ((f8 - f2) * fArr4[1]) + (fArr3[1] * f2);
                fArr3[2] = ((f8 - f2) * fArr4[2]) + (fArr3[2] * f2);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        Handler handler = this.f19239m;
        SensorManager sensorManager = this.f19236j;
        if (!z6 || !this.f19225a) {
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
            handler.removeCallbacks(this);
        } else {
            if (sensorManager != null) {
                sensorManager.registerListener(this, this.f19237k, 1);
            }
            if (sensorManager != null) {
                sensorManager.registerListener(this, this.f19238l, 1);
            }
            handler.postDelayed(this, 50L);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        getMyDirection();
        this.f19239m.postDelayed(this, 50L);
    }

    public final void setSatellites(List<l> list) {
        i.e(list, "list");
        ArrayList arrayList = this.f19221T;
        arrayList.clear();
        arrayList.addAll(list);
        invalidate();
    }

    public final void setUseCompass(boolean z6) {
        if (z6 == this.f19225a) {
            return;
        }
        this.f19225a = z6;
        Handler handler = this.f19239m;
        SensorManager sensorManager = this.f19236j;
        if (z6) {
            if (sensorManager != null) {
                sensorManager.registerListener(this, this.f19237k, 1);
            }
            if (sensorManager != null) {
                sensorManager.registerListener(this, this.f19238l, 1);
            }
            handler.postDelayed(this, 50L);
            return;
        }
        this.f19240n = 0.0f;
        invalidate();
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        handler.removeCallbacks(this);
    }
}
