package com.liuzh.deviceinfo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.location.GnssStatus;
import android.util.AttributeSet;
import android.view.View;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class GpsSkyView extends View {
    public boolean[] A;
    public boolean[] B;
    public boolean[] C;
    public int[] D;
    public int[] E;
    public int F;
    public boolean G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public int f21313a;

    /* renamed from: b, reason: collision with root package name */
    public int f21314b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21315c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f21316d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f21317e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f21318f;
    public final int[] g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f21319h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f21320i;
    public final Paint j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f21321k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f21322l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f21323m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f21324n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f21325o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f21326p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f21327q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f21328r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f21329s;

    /* renamed from: t, reason: collision with root package name */
    public double f21330t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21331u;

    /* renamed from: v, reason: collision with root package name */
    public float[] f21332v;

    /* renamed from: w, reason: collision with root package name */
    public float[] f21333w;

    /* renamed from: x, reason: collision with root package name */
    public float[] f21334x;

    /* renamed from: y, reason: collision with root package name */
    public float f21335y;

    /* renamed from: z, reason: collision with root package name */
    public float f21336z;

    public GpsSkyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21330t = 0.0d;
        this.f21335y = 0.0f;
        this.f21336z = 0.0f;
        this.G = false;
        this.H = false;
        this.f21319h = context;
        this.f21315c = d.p(5.0f, getResources().getDisplayMetrics());
        Paint paint = new Paint();
        this.f21320i = paint;
        paint.setColor(-1);
        Paint paint2 = this.f21320i;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f21320i.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.j = paint3;
        paint3.setColor(-3355444);
        this.j.setStyle(style);
        this.j.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f21321k = paint4;
        paint4.setColor(-16777216);
        Paint paint5 = this.f21321k;
        Paint.Style style2 = Paint.Style.STROKE;
        paint5.setStyle(style2);
        this.f21321k.setStrokeWidth(2.0f);
        this.f21321k.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f21322l = paint6;
        paint6.setColor(this.f21319h.getColor(R.color.md_grey_700));
        this.f21322l.setStyle(style2);
        this.f21322l.setAntiAlias(true);
        Paint paint7 = new Paint();
        this.f21323m = paint7;
        paint7.setColor(this.f21319h.getColor(R.color.md_yellow_700));
        this.f21323m.setStyle(style);
        this.f21323m.setAntiAlias(true);
        Paint paint8 = new Paint();
        this.f21324n = paint8;
        paint8.setColor(-16777216);
        this.f21324n.setStyle(style2);
        this.f21324n.setStrokeWidth(2.0f);
        this.f21324n.setAntiAlias(true);
        Paint paint9 = new Paint();
        this.f21325o = paint9;
        paint9.setColor(-16777216);
        this.f21325o.setStyle(style2);
        this.f21325o.setStrokeWidth(8.0f);
        this.f21325o.setAntiAlias(true);
        this.f21316d = new float[]{0.0f, 10.0f, 20.0f, 30.0f};
        this.f21317e = new int[]{this.f21319h.getColor(R.color.md_grey_700), this.f21319h.getColor(R.color.md_red_700), this.f21319h.getColor(R.color.md_yellow_700), this.f21319h.getColor(R.color.md_green_700)};
        this.f21318f = new float[]{10.0f, 21.67f, 33.3f, 45.0f};
        this.g = new int[]{this.f21319h.getColor(R.color.md_grey_700), this.f21319h.getColor(R.color.md_red_700), this.f21319h.getColor(R.color.md_yellow_700), this.f21319h.getColor(R.color.md_green_700)};
        Paint paint10 = new Paint();
        this.f21326p = paint10;
        paint10.setColor(-16777216);
        this.f21326p.setStyle(style2);
        this.f21326p.setStrokeWidth(4.0f);
        this.f21326p.setAntiAlias(true);
        Paint paint11 = new Paint();
        this.f21327q = paint11;
        paint11.setColor(-7829368);
        this.f21327q.setStyle(style);
        this.f21327q.setStrokeWidth(4.0f);
        this.f21327q.setAntiAlias(true);
        Paint paint12 = new Paint();
        this.f21328r = paint12;
        paint12.setColor(-16777216);
        this.f21328r.setStyle(style2);
        this.f21328r.setTextSize(d.p(this.f21315c * 0.7f, getResources().getDisplayMetrics()));
        this.f21328r.setAntiAlias(true);
        Paint paint13 = new Paint();
        this.f21329s = paint13;
        paint13.setColor(context.getColor(R.color.color11000000));
        this.f21329s.setStyle(style);
        this.f21329s.setStrokeWidth(4.0f);
        this.f21329s.setAntiAlias(true);
        setFocusable(true);
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13) {
        double radians = Math.toRadians(-this.f21330t);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f14 = (f10 + f12) / 2.0f;
        float f15 = (f11 + f13) / 2.0f;
        float f16 = f10 - f14;
        float f17 = f15 - f11;
        float f18 = f12 - f14;
        float f19 = f15 - f13;
        float f20 = -fSin;
        canvas.drawLine((fSin * f17) + (fCos * f16) + f14, (-((f17 * fCos) + (f16 * f20))) + f15, (fSin * f19) + (fCos * f18) + f14, (-((fCos * f19) + (f20 * f18))) + f15, this.f21322l);
    }

    public final float b(int i4, float f10) {
        return (1.0f - (f10 / 90.0f)) * ((i4 >> 1) - this.f21315c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i4;
        int i10;
        float[] fArr;
        int length;
        int[] iArr;
        int i11;
        boolean z3;
        int iRgb;
        Paint paint;
        int iP;
        int i12;
        int iMin = Math.min(this.f21314b, this.f21313a);
        int i13 = iMin / 2;
        float f10 = i13;
        canvas.drawCircle(f10, f10, f10, this.f21331u ? this.f21320i : this.j);
        float f11 = f10 * 2.0f;
        a(canvas, 0.0f, f10, f11, f10);
        a(canvas, f10, 0.0f, f10, f11);
        Canvas canvas2 = canvas;
        canvas2.drawCircle(f10, f10, b(iMin, 60.0f), this.f21322l);
        canvas2.drawCircle(f10, f10, b(iMin, 30.0f), this.f21322l);
        float f12 = 0.0f;
        canvas2.drawCircle(f10, f10, b(iMin, 0.0f), this.f21322l);
        canvas2.drawCircle(f10, f10, f10, this.f21321k);
        float f13 = iMin >> 1;
        Math.toRadians(-this.f21330t);
        float fB = b(iMin, 90.0f);
        float f14 = 0.05f * f13;
        float f15 = (0.1f * f13) + fB;
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(f13, fB);
        path.lineTo(f13 + f14, f15);
        path.lineTo(f13 - f14, f15);
        path.lineTo(f13, fB);
        path.close();
        Matrix matrix = new Matrix();
        matrix.postRotate((float) (-this.f21330t), f13, f13);
        path.transform(matrix);
        canvas2.drawPath(path, this.f21326p);
        canvas2.drawPath(path, this.f21327q);
        if (this.f21333w != null) {
            int i14 = this.F;
            int i15 = 0;
            while (i15 < i14) {
                float f16 = this.f21333w[i15];
                if (f16 == f12 && this.f21334x[i15] == f12) {
                    i12 = iMin;
                } else {
                    float f17 = this.f21334x[i15];
                    float f18 = this.f21332v[i15];
                    int i16 = this.D[i15];
                    int i17 = this.E[i15];
                    boolean z10 = this.C[i15];
                    if (f18 == f12) {
                        i11 = i17;
                        z3 = z10;
                        i4 = 0;
                        i10 = 1;
                        paint = this.f21329s;
                    } else {
                        Paint paint2 = new Paint(this.f21323m);
                        synchronized (this) {
                            try {
                                if (!this.G || this.H) {
                                    i4 = 0;
                                    i10 = 1;
                                    fArr = this.f21318f;
                                    length = fArr.length;
                                    iArr = this.g;
                                } else {
                                    fArr = this.f21316d;
                                    i4 = 0;
                                    length = fArr.length;
                                    i10 = 1;
                                    iArr = this.f21317e;
                                }
                                if (f18 <= fArr[i4]) {
                                    iRgb = iArr[i4];
                                } else {
                                    int i18 = length - 1;
                                    if (f18 >= fArr[i18]) {
                                        iRgb = iArr[i18];
                                    } else {
                                        int i19 = i4;
                                        while (true) {
                                            if (i19 < i18) {
                                                float f19 = fArr[i19];
                                                int i20 = i19 + 1;
                                                float f20 = fArr[i20];
                                                if (f18 < f19 || f18 > f20) {
                                                    i19 = i20;
                                                    i17 = i17;
                                                    z10 = z10;
                                                } else {
                                                    int i21 = iArr[i19];
                                                    int iRed = Color.red(i21);
                                                    int iGreen = Color.green(i21);
                                                    int iBlue = Color.blue(i21);
                                                    int i22 = iArr[i20];
                                                    i11 = i17;
                                                    z3 = z10;
                                                    float f21 = (f18 - f19) / (f20 - f19);
                                                    float f22 = 1.0f - f21;
                                                    iRgb = Color.rgb((int) ((iRed * f22) + (Color.red(i22) * f21)), (int) ((iGreen * f22) + (Color.green(i22) * f21)), (int) ((iBlue * f22) + (Color.blue(i22) * f21)));
                                                }
                                            } else {
                                                i11 = i17;
                                                z3 = z10;
                                                iRgb = -65281;
                                            }
                                        }
                                    }
                                }
                                i11 = i17;
                                z3 = z10;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        paint2.setColor(iRgb);
                        paint = paint2;
                    }
                    Paint paint3 = z3 ? this.f21325o : this.f21324n;
                    double dB = b(iMin, f16);
                    double radians = (float) Math.toRadians((float) (f17 - this.f21330t));
                    double d10 = i13;
                    float fSin = (float) ((Math.sin(radians) * dB) + d10);
                    float fCos = (float) (d10 - (Math.cos(radians) * dB));
                    if (d.f21254c) {
                        switch (i11) {
                            case 1:
                                iP = i4;
                                break;
                            case 2:
                                iP = 6;
                                break;
                            case 3:
                                iP = i10;
                                break;
                            case 4:
                                iP = 3;
                                break;
                            case 5:
                                iP = 2;
                                break;
                            case 6:
                                iP = 4;
                                break;
                            case 7:
                                iP = 5;
                                break;
                            default:
                                iP = -1;
                                break;
                        }
                    } else {
                        iP = com.bumptech.glide.d.p(i16);
                    }
                    switch (iP) {
                        case 0:
                            i12 = iMin;
                            canvas2.drawCircle(fSin, fCos, this.f21315c, paint);
                            canvas2.drawCircle(fSin, fCos, this.f21315c, paint3);
                            break;
                        case 1:
                            i12 = iMin;
                            float f23 = this.f21315c;
                            canvas2.drawRect(fSin - f23, fCos - f23, fSin + f23, f23 + fCos, paint);
                            float f24 = this.f21315c;
                            float f25 = fSin - f24;
                            float f26 = fCos - f24;
                            float f27 = fSin + f24;
                            float f28 = fCos + f24;
                            canvas2 = canvas;
                            canvas2.drawRect(f25, f26, f27, f28, paint3);
                            break;
                        case 2:
                            i12 = iMin;
                            Path path2 = new Path();
                            path2.moveTo(fSin, fCos - this.f21315c);
                            path2.lineTo(fSin - this.f21315c, fCos - (r4 / 3));
                            path2.lineTo(fSin - ((r4 / 3) * 2), this.f21315c + fCos);
                            path2.lineTo(((r4 / 3) * 2) + fSin, this.f21315c + fCos);
                            path2.lineTo(this.f21315c + fSin, fCos - (r3 / 3));
                            path2.close();
                            canvas2.drawPath(path2, paint);
                            canvas2.drawPath(path2, paint3);
                            break;
                        case 3:
                            i12 = iMin;
                            Path path3 = new Path();
                            float f29 = this.f21315c;
                            path3.moveTo(fSin - (f29 * 0.6f), fCos - f29);
                            path3.lineTo(fSin - (this.f21315c * 1.4f), fCos);
                            float f30 = this.f21315c;
                            path3.lineTo(fSin - (f30 * 0.6f), f30 + fCos);
                            float f31 = this.f21315c;
                            path3.lineTo((f31 * 0.6f) + fSin, f31 + fCos);
                            path3.lineTo((this.f21315c * 1.4f) + fSin, fCos);
                            float f32 = this.f21315c;
                            path3.lineTo((0.6f * f32) + fSin, fCos - f32);
                            path3.close();
                            canvas2.drawPath(path3, paint);
                            canvas2.drawPath(path3, paint3);
                            break;
                        case 4:
                            float f33 = this.f21315c;
                            float f34 = fCos - f33;
                            float f35 = fCos + f33;
                            Path path4 = new Path();
                            i12 = iMin;
                            path4.setFillType(Path.FillType.EVEN_ODD);
                            path4.moveTo(fSin, f34);
                            path4.lineTo(fSin - f33, f35);
                            path4.lineTo(f33 + fSin, f35);
                            path4.lineTo(fSin, f34);
                            path4.close();
                            canvas2.drawPath(path4, paint);
                            canvas2.drawPath(path4, paint3);
                            break;
                        case 5:
                            float f36 = this.f21315c;
                            float f37 = 1.5f * f36;
                            RectF rectF = new RectF(fSin - f37, fCos - f36, f37 + fSin, f36 + fCos);
                            canvas2.drawOval(rectF, paint);
                            canvas2.drawOval(rectF, paint3);
                            i12 = iMin;
                            break;
                        case 6:
                            Path path5 = new Path();
                            path5.moveTo(fSin, fCos - this.f21315c);
                            path5.lineTo(fSin - (this.f21315c * 1.5f), fCos);
                            path5.lineTo(fSin, this.f21315c + fCos);
                            path5.lineTo((this.f21315c * 1.5f) + fSin, fCos);
                            path5.close();
                            canvas2.drawPath(path5, paint);
                            canvas2.drawPath(path5, paint3);
                            i12 = iMin;
                            break;
                        default:
                            i12 = iMin;
                            break;
                    }
                    String strValueOf = String.valueOf(i16);
                    double d11 = this.f21315c;
                    canvas2.drawText(strValueOf, fSin - ((int) (1.4d * d11)), fCos + ((int) (d11 * 3.8d)), this.f21328r);
                }
                i15++;
                iMin = i12;
                f12 = 0.0f;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        int iMin = Math.min(View.MeasureSpec.getSize(i4), View.MeasureSpec.getSize(i10));
        setMeasuredDimension(iMin, iMin);
        this.f21313a = iMin;
        this.f21314b = iMin;
    }

    public synchronized void setGnssStatus(GnssStatus gnssStatus) {
        int i4 = 0;
        try {
            this.G = false;
            this.H = false;
            if (this.D == null) {
                this.D = new int[255];
                this.f21332v = new float[255];
                this.f21333w = new float[255];
                this.f21334x = new float[255];
                this.E = new int[255];
                this.A = new boolean[255];
                this.B = new boolean[255];
                this.C = new boolean[255];
            }
            int satelliteCount = gnssStatus.getSatelliteCount();
            this.F = 0;
            this.f21336z = 0.0f;
            this.f21335y = 0.0f;
            int i10 = 0;
            float cn0DbHz = 0.0f;
            float cn0DbHz2 = 0.0f;
            while (true) {
                int i11 = this.F;
                if (i11 >= satelliteCount) {
                    break;
                }
                this.f21332v[i11] = gnssStatus.getCn0DbHz(i11);
                float[] fArr = this.f21333w;
                int i12 = this.F;
                fArr[i12] = gnssStatus.getElevationDegrees(i12);
                float[] fArr2 = this.f21334x;
                int i13 = this.F;
                fArr2[i13] = gnssStatus.getAzimuthDegrees(i13);
                int[] iArr = this.D;
                int i14 = this.F;
                iArr[i14] = gnssStatus.getSvid(i14);
                int[] iArr2 = this.E;
                int i15 = this.F;
                iArr2[i15] = gnssStatus.getConstellationType(i15);
                boolean[] zArr = this.A;
                int i16 = this.F;
                zArr[i16] = gnssStatus.hasEphemerisData(i16);
                boolean[] zArr2 = this.B;
                int i17 = this.F;
                zArr2[i17] = gnssStatus.hasAlmanacData(i17);
                boolean[] zArr3 = this.C;
                int i18 = this.F;
                zArr3[i18] = gnssStatus.usedInFix(i18);
                if (gnssStatus.getCn0DbHz(this.F) != 0.0f) {
                    i4++;
                    cn0DbHz += gnssStatus.getCn0DbHz(this.F);
                }
                if (gnssStatus.usedInFix(this.F)) {
                    i10++;
                    cn0DbHz2 += gnssStatus.getCn0DbHz(this.F);
                }
                this.F++;
            }
            if (i4 > 0) {
                this.f21336z = cn0DbHz / i4;
            }
            if (i10 > 0) {
                this.f21335y = cn0DbHz2 / i10;
            }
            this.f21331u = true;
            invalidate();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSats(android.location.GpsStatus r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.view.GpsSkyView.setSats(android.location.GpsStatus):void");
    }
}
