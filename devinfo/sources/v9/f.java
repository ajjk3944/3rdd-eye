package v9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o9.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f extends b {
    public final PieChart g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f36006h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f36007i;
    public final Paint j;

    /* renamed from: k, reason: collision with root package name */
    public final TextPaint f36008k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f36009l;

    /* renamed from: m, reason: collision with root package name */
    public StaticLayout f36010m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f36011n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f36012o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF[] f36013p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f36014q;

    /* renamed from: r, reason: collision with root package name */
    public Canvas f36015r;

    /* renamed from: s, reason: collision with root package name */
    public final Path f36016s;

    /* renamed from: t, reason: collision with root package name */
    public final RectF f36017t;

    /* renamed from: u, reason: collision with root package name */
    public final Path f36018u;

    /* renamed from: v, reason: collision with root package name */
    public final Path f36019v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f36020w;

    public f(PieChart pieChart, l9.a aVar, w9.h hVar) {
        super(aVar, hVar);
        this.f36012o = new RectF();
        this.f36013p = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.f36016s = new Path();
        this.f36017t = new RectF();
        this.f36018u = new Path();
        this.f36019v = new Path();
        this.f36020w = new RectF();
        this.g = pieChart;
        Paint paint = new Paint(1);
        this.f36006h = paint;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f36007i = paint2;
        paint2.setColor(-1);
        paint2.setStyle(style);
        paint2.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.f36008k = textPaint;
        textPaint.setColor(-16777216);
        textPaint.setTextSize(w9.g.c(12.0f));
        this.f35986f.setTextSize(w9.g.c(13.0f));
        this.f35986f.setColor(-1);
        Paint paint3 = this.f35986f;
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        Paint paint4 = new Paint(1);
        this.f36009l = paint4;
        paint4.setColor(-1);
        paint4.setTextAlign(align);
        paint4.setTextSize(w9.g.c(13.0f));
        Paint paint5 = new Paint(1);
        this.j = paint5;
        paint5.setStyle(Paint.Style.STROKE);
    }

    public static float H(w9.d dVar, float f10, float f11, float f12, float f13, float f14, float f15) {
        double d10 = (f14 + f15) * 0.017453292f;
        float fCos = (((float) Math.cos(d10)) * f10) + dVar.f36546b;
        float fSin = (((float) Math.sin(d10)) * f10) + dVar.f36547c;
        double d11 = ((f15 / 2.0f) + f14) * 0.017453292f;
        float fCos2 = (((float) Math.cos(d11)) * f10) + dVar.f36546b;
        float fSin2 = (((float) Math.sin(d11)) * f10) + dVar.f36547c;
        return (float) ((f10 - ((float) (Math.tan(((180.0d - f11) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow(fSin - f13, 2.0d) + Math.pow(fCos - f12, 2.0d)) / 2.0d)))) - Math.sqrt(Math.pow(fSin2 - ((fSin + f13) / 2.0f), 2.0d) + Math.pow(fCos2 - ((fCos + f12) / 2.0f), 2.0d)));
    }

    @Override // v9.b
    public final void D(Canvas canvas) {
        PieChart pieChart;
        ArrayList arrayList;
        int i4;
        int i10;
        int i11;
        PieChart pieChart2;
        float f10;
        int i12;
        boolean z3;
        float f11;
        int i13;
        o9.h hVar;
        float f12;
        int i14;
        float[] fArr;
        float f13;
        float f14;
        float f15;
        float f16;
        RectF rectF;
        int i15;
        RectF rectF2;
        int i16;
        float f17;
        int i17;
        w9.h hVar2 = (w9.h) this.f218b;
        int i18 = (int) hVar2.f36565c;
        int i19 = (int) hVar2.f36566d;
        WeakReference weakReference = this.f36014q;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : (Bitmap) weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != i18 || bitmapCreateBitmap.getHeight() != i19) {
            if (i18 <= 0 || i19 <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i18, i19, Bitmap.Config.ARGB_4444);
            this.f36014q = new WeakReference(bitmapCreateBitmap);
            this.f36015r = new Canvas(bitmapCreateBitmap);
        }
        boolean z10 = false;
        bitmapCreateBitmap.eraseColor(0);
        PieChart pieChart3 = this.g;
        ArrayList arrayList2 = ((o9.g) pieChart3.getData()).f30440i;
        int size = arrayList2.size();
        int i20 = 0;
        while (i20 < size) {
            Object obj = arrayList2.get(i20);
            int i21 = i20 + 1;
            o9.h hVar3 = (o9.h) obj;
            boolean z11 = hVar3.f30448i;
            List list = hVar3.j;
            if (!z11 || list.size() <= 0) {
                pieChart = pieChart3;
                arrayList = arrayList2;
                i4 = size;
                i10 = i21;
            } else {
                float rotationAngle = pieChart3.getRotationAngle();
                this.f35983c.getClass();
                RectF circleBox = pieChart3.getCircleBox();
                int size2 = list.size();
                float[] drawAngles = pieChart3.getDrawAngles();
                w9.d centerCircleBox = pieChart3.getCenterCircleBox();
                float radius = pieChart3.getRadius();
                boolean z12 = (!pieChart3.L || pieChart3.M) ? z10 : true;
                float holeRadius = z12 ? (pieChart3.getHoleRadius() / 100.0f) * radius : 0.0f;
                float holeRadius2 = (radius - ((pieChart3.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                RectF rectF3 = new RectF();
                boolean z13 = z12 && pieChart3.O;
                int i22 = 0;
                int i23 = 0;
                while (i23 < size2) {
                    ArrayList arrayList3 = arrayList2;
                    if (Math.abs(((i) hVar3.d(i23)).f30453a) > w9.g.f36558d) {
                        i22++;
                    }
                    i23++;
                    arrayList2 = arrayList3;
                }
                arrayList = arrayList2;
                float f18 = i22 <= 1 ? 0.0f : hVar3.f30468o;
                float f19 = 0.0f;
                int i24 = 0;
                while (i24 < size2) {
                    float f20 = drawAngles[i24];
                    float f21 = f18;
                    if (Math.abs(hVar3.d(i24).f30453a) <= w9.g.f36558d) {
                        f10 = (f20 * 1.0f) + f19;
                        i12 = i22;
                        pieChart2 = pieChart3;
                        i11 = size;
                    } else {
                        if (pieChart3.h()) {
                            i11 = size;
                            int i25 = 0;
                            while (true) {
                                q9.b[] bVarArr = pieChart3.f29019z;
                                pieChart2 = pieChart3;
                                if (i25 >= bVarArr.length) {
                                    break;
                                }
                                if (((int) bVarArr[i25].f32227a) != i24) {
                                    i25++;
                                    pieChart3 = pieChart2;
                                } else if (!z13) {
                                    f10 = (f20 * 1.0f) + f19;
                                    i12 = i22;
                                }
                            }
                        } else {
                            pieChart2 = pieChart3;
                            i11 = size;
                        }
                        boolean z14 = f21 > 0.0f && f20 <= 180.0f;
                        ArrayList arrayList4 = hVar3.f30441a;
                        int iIntValue = ((Integer) arrayList4.get(i24 % arrayList4.size())).intValue();
                        Paint paint = this.f35984d;
                        paint.setColor(iIntValue);
                        float f22 = i22 == 1 ? 0.0f : f21 / (radius * 0.017453292f);
                        float f23 = (((f22 / 2.0f) + f19) * 1.0f) + rotationAngle;
                        float f24 = (f20 - f22) * 1.0f;
                        if (f24 < 0.0f) {
                            z3 = z14;
                            f11 = 0.0f;
                        } else {
                            z3 = z14;
                            f11 = f24;
                        }
                        i13 = i21;
                        Path path = this.f36016s;
                        path.reset();
                        hVar = hVar3;
                        if (z13) {
                            float f25 = radius - holeRadius2;
                            f12 = rotationAngle;
                            double d10 = f23 * 0.017453292f;
                            float fCos = (((float) Math.cos(d10)) * f25) + centerCircleBox.f36546b;
                            float fSin = (f25 * ((float) Math.sin(d10))) + centerCircleBox.f36547c;
                            i14 = size2;
                            fArr = drawAngles;
                            rectF3.set(fCos - holeRadius2, fSin - holeRadius2, fCos + holeRadius2, fSin + holeRadius2);
                        } else {
                            f12 = rotationAngle;
                            i14 = size2;
                            fArr = drawAngles;
                        }
                        double d11 = f23 * 0.017453292f;
                        float fCos2 = (((float) Math.cos(d11)) * radius) + centerCircleBox.f36546b;
                        float fSin2 = (((float) Math.sin(d11)) * radius) + centerCircleBox.f36547c;
                        if (f11 < 360.0f || f11 % 360.0f > w9.g.f36558d) {
                            f13 = fSin2;
                            f14 = 360.0f;
                            f15 = fCos2;
                            if (z13) {
                                path.arcTo(rectF3, f23 + 180.0f, -180.0f);
                            }
                            path.arcTo(circleBox, f23, f11);
                        } else {
                            f14 = 360.0f;
                            f13 = fSin2;
                            f15 = fCos2;
                            path.addCircle(centerCircleBox.f36546b, centerCircleBox.f36547c, radius, Path.Direction.CW);
                        }
                        float f26 = centerCircleBox.f36546b;
                        float f27 = centerCircleBox.f36547c;
                        float f28 = f11;
                        RectF rectF4 = this.f36017t;
                        rectF4.set(f26 - holeRadius, f27 - holeRadius, f26 + holeRadius, f27 + holeRadius);
                        if (!z12 || (holeRadius <= 0.0f && !z3)) {
                            f16 = holeRadius;
                            float f29 = f13;
                            rectF = rectF3;
                            i15 = i24;
                            float f30 = f15;
                            i12 = i22;
                            if (f28 % f14 > w9.g.f36558d) {
                                if (z3) {
                                    float fH = H(centerCircleBox, radius, f20 * 1.0f, f30, f29, f23, f28);
                                    double d12 = ((f28 / 2.0f) + f23) * 0.017453292f;
                                    path.lineTo((((float) Math.cos(d12)) * fH) + centerCircleBox.f36546b, (fH * ((float) Math.sin(d12))) + centerCircleBox.f36547c);
                                } else {
                                    path.lineTo(centerCircleBox.f36546b, centerCircleBox.f36547c);
                                }
                            }
                        } else {
                            if (z3) {
                                rectF2 = rectF3;
                                i16 = i24;
                                f17 = holeRadius;
                                i17 = 1;
                                float fH2 = H(centerCircleBox, radius, f20 * 1.0f, f15, f13, f23, f28);
                                if (fH2 < 0.0f) {
                                    fH2 = -fH2;
                                }
                                holeRadius = Math.max(f17, fH2);
                            } else {
                                rectF2 = rectF3;
                                i16 = i24;
                                f17 = holeRadius;
                                i17 = 1;
                            }
                            float f31 = (i22 == i17 || holeRadius == 0.0f) ? 0.0f : f21 / (holeRadius * 0.017453292f);
                            float f32 = (((f31 / 2.0f) + f19) * 1.0f) + f12;
                            float f33 = (f20 - f31) * 1.0f;
                            if (f33 < 0.0f) {
                                f33 = 0.0f;
                            }
                            float f34 = f32 + f33;
                            if (f11 < 360.0f || f28 % f14 > w9.g.f36558d) {
                                if (z13) {
                                    float f35 = radius - holeRadius2;
                                    i12 = i22;
                                    f16 = f17;
                                    double d13 = f34 * 0.017453292f;
                                    float fCos3 = (((float) Math.cos(d13)) * f35) + centerCircleBox.f36546b;
                                    float fSin3 = (f35 * ((float) Math.sin(d13))) + centerCircleBox.f36547c;
                                    rectF2.set(fCos3 - holeRadius2, fSin3 - holeRadius2, fCos3 + holeRadius2, fSin3 + holeRadius2);
                                    path.arcTo(rectF2, f34, 180.0f);
                                    rectF = rectF2;
                                    i15 = i16;
                                } else {
                                    i12 = i22;
                                    f16 = f17;
                                    double d14 = f34 * 0.017453292f;
                                    rectF = rectF2;
                                    i15 = i16;
                                    path.lineTo((((float) Math.cos(d14)) * holeRadius) + centerCircleBox.f36546b, (holeRadius * ((float) Math.sin(d14))) + centerCircleBox.f36547c);
                                }
                                path.arcTo(rectF4, f34, -f33);
                            } else {
                                path.addCircle(centerCircleBox.f36546b, centerCircleBox.f36547c, holeRadius, Path.Direction.CCW);
                                i12 = i22;
                                f16 = f17;
                                rectF = rectF2;
                                i15 = i16;
                            }
                        }
                        path.close();
                        this.f36015r.drawPath(path, paint);
                        f10 = (f20 * 1.0f) + f19;
                        f19 = f10;
                        i24 = i15 + 1;
                        rectF3 = rectF;
                        f18 = f21;
                        size = i11;
                        pieChart3 = pieChart2;
                        i21 = i13;
                        hVar3 = hVar;
                        drawAngles = fArr;
                        rotationAngle = f12;
                        size2 = i14;
                        i22 = i12;
                        holeRadius = f16;
                    }
                    i13 = i21;
                    hVar = hVar3;
                    f12 = rotationAngle;
                    i14 = size2;
                    fArr = drawAngles;
                    rectF = rectF3;
                    i15 = i24;
                    f16 = holeRadius;
                    f19 = f10;
                    i24 = i15 + 1;
                    rectF3 = rectF;
                    f18 = f21;
                    size = i11;
                    pieChart3 = pieChart2;
                    i21 = i13;
                    hVar3 = hVar;
                    drawAngles = fArr;
                    rotationAngle = f12;
                    size2 = i14;
                    i22 = i12;
                    holeRadius = f16;
                }
                pieChart = pieChart3;
                i4 = size;
                i10 = i21;
                w9.d.c(centerCircleBox);
            }
            arrayList2 = arrayList;
            size = i4;
            pieChart3 = pieChart;
            i20 = i10;
            z10 = false;
        }
    }

    @Override // v9.b
    public final void E(Canvas canvas) {
        float radius;
        RectF rectF;
        PieChart pieChart = this.g;
        if (pieChart.L && this.f36015r != null) {
            float radius2 = pieChart.getRadius();
            float holeRadius = (pieChart.getHoleRadius() / 100.0f) * radius2;
            w9.d centerCircleBox = pieChart.getCenterCircleBox();
            Paint paint = this.f36006h;
            if (Color.alpha(paint.getColor()) > 0) {
                this.f36015r.drawCircle(centerCircleBox.f36546b, centerCircleBox.f36547c, holeRadius, paint);
            }
            Paint paint2 = this.f36007i;
            if (Color.alpha(paint2.getColor()) > 0 && pieChart.getTransparentCircleRadius() > pieChart.getHoleRadius()) {
                int alpha = paint2.getAlpha();
                float transparentCircleRadius = (pieChart.getTransparentCircleRadius() / 100.0f) * radius2;
                this.f35983c.getClass();
                paint2.setAlpha((int) (alpha * 1.0f * 1.0f));
                Path path = this.f36018u;
                path.reset();
                path.addCircle(centerCircleBox.f36546b, centerCircleBox.f36547c, transparentCircleRadius, Path.Direction.CW);
                path.addCircle(centerCircleBox.f36546b, centerCircleBox.f36547c, holeRadius, Path.Direction.CCW);
                this.f36015r.drawPath(path, paint2);
                paint2.setAlpha(alpha);
            }
            w9.d.c(centerCircleBox);
        }
        canvas.drawBitmap((Bitmap) this.f36014q.get(), 0.0f, 0.0f, (Paint) null);
        CharSequence centerText = pieChart.getCenterText();
        if (!pieChart.T || centerText == null) {
            return;
        }
        w9.d centerCircleBox2 = pieChart.getCenterCircleBox();
        w9.d centerTextOffset = pieChart.getCenterTextOffset();
        float f10 = centerCircleBox2.f36546b + centerTextOffset.f36546b;
        float f11 = centerCircleBox2.f36547c + centerTextOffset.f36547c;
        if (!pieChart.L || pieChart.M) {
            radius = pieChart.getRadius();
        } else {
            radius = (pieChart.getHoleRadius() / 100.0f) * pieChart.getRadius();
        }
        RectF[] rectFArr = this.f36013p;
        RectF rectF2 = rectFArr[0];
        rectF2.left = f10 - radius;
        rectF2.top = f11 - radius;
        rectF2.right = f10 + radius;
        rectF2.bottom = f11 + radius;
        RectF rectF3 = rectFArr[1];
        rectF3.set(rectF2);
        float centerTextRadiusPercent = pieChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF3.inset((rectF3.width() - (rectF3.width() * centerTextRadiusPercent)) / 2.0f, (rectF3.height() - (rectF3.height() * centerTextRadiusPercent)) / 2.0f);
        }
        boolean zEquals = centerText.equals(this.f36011n);
        RectF rectF4 = this.f36012o;
        if (zEquals && rectF3.equals(rectF4)) {
            rectF = rectF2;
        } else {
            rectF4.set(rectF3);
            this.f36011n = centerText;
            rectF = rectF2;
            this.f36010m = new StaticLayout(centerText, 0, centerText.length(), this.f36008k, (int) Math.max(Math.ceil(rectF4.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.f36010m.getHeight();
        canvas.save();
        Path path2 = this.f36019v;
        path2.reset();
        path2.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path2);
        canvas.translate(rectF3.left, ((rectF3.height() - height) / 2.0f) + rectF3.top);
        this.f36010m.draw(canvas);
        canvas.restore();
        w9.d.c(centerCircleBox2);
        w9.d.c(centerTextOffset);
    }

    @Override // v9.b
    public final void F(Canvas canvas, q9.b[] bVarArr) {
        float f10;
        o9.h hVarI;
        PieChart pieChart;
        boolean z3;
        float f11;
        float[] fArr;
        float f12;
        Paint paint;
        float f13;
        RectF rectF;
        int i4;
        float f14;
        float f15;
        float fH;
        int i10;
        RectF rectF2;
        Paint paint2;
        float fMax;
        q9.b[] bVarArr2 = bVarArr;
        PieChart pieChart2 = this.g;
        boolean z10 = pieChart2.L && !pieChart2.M;
        if (z10 && pieChart2.O) {
            return;
        }
        this.f35983c.getClass();
        float rotationAngle = pieChart2.getRotationAngle();
        float[] drawAngles = pieChart2.getDrawAngles();
        float[] absoluteAngles = pieChart2.getAbsoluteAngles();
        w9.d centerCircleBox = pieChart2.getCenterCircleBox();
        float radius = pieChart2.getRadius();
        float f16 = 0.0f;
        float holeRadius = z10 ? (pieChart2.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF3 = this.f36020w;
        rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i11 = 0;
        while (i11 < bVarArr2.length) {
            int i12 = (int) bVarArr2[i11].f32227a;
            if (i12 >= drawAngles.length) {
                pieChart = pieChart2;
                z3 = z10;
                f11 = rotationAngle;
                fArr = drawAngles;
                f10 = f16;
            } else {
                o9.g gVar = (o9.g) pieChart2.getData();
                f10 = f16;
                if (bVarArr2[i11].f32231e == 0) {
                    hVarI = gVar.i();
                } else {
                    gVar.getClass();
                    hVarI = null;
                }
                if (hVarI != null) {
                    int size = hVarI.j.size();
                    int i13 = 0;
                    int i14 = 0;
                    while (i14 < size) {
                        PieChart pieChart3 = pieChart2;
                        if (Math.abs(((i) hVarI.d(i14)).f30453a) > w9.g.f36558d) {
                            i13++;
                        }
                        i14++;
                        pieChart2 = pieChart3;
                    }
                    pieChart = pieChart2;
                    float f17 = i12 == 0 ? f10 : absoluteAngles[i12 - 1] * 1.0f;
                    float f18 = i13 <= 1 ? f10 : hVarI.f30468o;
                    float f19 = drawAngles[i12];
                    float f20 = hVarI.f30469p;
                    float f21 = radius + f20;
                    z3 = z10;
                    rectF3.set(pieChart.getCircleBox());
                    float f22 = -f20;
                    rectF3.inset(f22, f22);
                    boolean z11 = f18 > f10 && f19 <= 180.0f;
                    ArrayList arrayList = hVarI.f30441a;
                    int iIntValue = ((Integer) arrayList.get(i12 % arrayList.size())).intValue();
                    Paint paint3 = this.f35984d;
                    paint3.setColor(iIntValue);
                    float f23 = i13 == 1 ? f10 : f18 / (radius * 0.017453292f);
                    float f24 = i13 == 1 ? f10 : f18 / (f21 * 0.017453292f);
                    float f25 = (((f23 / 2.0f) + f17) * 1.0f) + rotationAngle;
                    float f26 = (f19 - f23) * 1.0f;
                    if (f26 < f10) {
                        f26 = f10;
                    }
                    float f27 = (((f24 / 2.0f) + f17) * 1.0f) + rotationAngle;
                    float f28 = (f19 - f24) * 1.0f;
                    if (f28 < f10) {
                        f28 = f10;
                    }
                    boolean z12 = z11;
                    Path path = this.f36016s;
                    path.reset();
                    if (f26 < 360.0f || f26 % 360.0f > w9.g.f36558d) {
                        f12 = f17;
                        f11 = rotationAngle;
                        double d10 = f27 * 0.017453292f;
                        path.moveTo((((float) Math.cos(d10)) * f21) + centerCircleBox.f36546b, (((float) Math.sin(d10)) * f21) + centerCircleBox.f36547c);
                        path.arcTo(rectF3, f27, f28);
                    } else {
                        f12 = f17;
                        path.addCircle(centerCircleBox.f36546b, centerCircleBox.f36547c, f21, Path.Direction.CW);
                        f11 = rotationAngle;
                    }
                    if (z12) {
                        double d11 = f25 * 0.017453292f;
                        float fCos = (((float) Math.cos(d11)) * radius) + centerCircleBox.f36546b;
                        float fSin = (((float) Math.sin(d11)) * radius) + centerCircleBox.f36547c;
                        paint = paint3;
                        f14 = f26;
                        f13 = holeRadius;
                        rectF = rectF3;
                        i4 = i11;
                        f15 = f25;
                        fH = H(centerCircleBox, radius, f19 * 1.0f, fCos, fSin, f15, f14);
                    } else {
                        paint = paint3;
                        f13 = holeRadius;
                        rectF = rectF3;
                        i4 = i11;
                        f14 = f26;
                        f15 = f25;
                        fH = f10;
                    }
                    float f29 = centerCircleBox.f36546b;
                    i10 = i4;
                    float f30 = centerCircleBox.f36547c;
                    rectF2 = rectF;
                    fArr = drawAngles;
                    RectF rectF4 = this.f36017t;
                    rectF4.set(f29 - f13, f30 - f13, f29 + f13, f30 + f13);
                    if (!z3 || (f13 <= f10 && !z12)) {
                        paint2 = paint;
                        if (f14 % 360.0f > w9.g.f36558d) {
                            if (z12) {
                                double d12 = ((f14 / 2.0f) + f15) * 0.017453292f;
                                path.lineTo((((float) Math.cos(d12)) * fH) + centerCircleBox.f36546b, (fH * ((float) Math.sin(d12))) + centerCircleBox.f36547c);
                            } else {
                                path.lineTo(centerCircleBox.f36546b, centerCircleBox.f36547c);
                            }
                        }
                    } else {
                        if (z12) {
                            if (fH < f10) {
                                fH = -fH;
                            }
                            fMax = Math.max(f13, fH);
                        } else {
                            fMax = f13;
                        }
                        float f31 = (i13 == 1 || fMax == f10) ? f10 : f18 / (fMax * 0.017453292f);
                        float f32 = (((f31 / 2.0f) + f12) * 1.0f) + f11;
                        float f33 = (f19 - f31) * 1.0f;
                        if (f33 < f10) {
                            f33 = f10;
                        }
                        float f34 = f32 + f33;
                        if (f26 < 360.0f || f14 % 360.0f > w9.g.f36558d) {
                            double d13 = f34 * 0.017453292f;
                            paint2 = paint;
                            path.lineTo((((float) Math.cos(d13)) * fMax) + centerCircleBox.f36546b, (fMax * ((float) Math.sin(d13))) + centerCircleBox.f36547c);
                            path.arcTo(rectF4, f34, -f33);
                        } else {
                            path.addCircle(centerCircleBox.f36546b, centerCircleBox.f36547c, fMax, Path.Direction.CCW);
                            paint2 = paint;
                        }
                    }
                    path.close();
                    this.f36015r.drawPath(path, paint2);
                    i11 = i10 + 1;
                    bVarArr2 = bVarArr;
                    holeRadius = f13;
                    f16 = f10;
                    pieChart2 = pieChart;
                    z10 = z3;
                    drawAngles = fArr;
                    rectF3 = rectF2;
                    rotationAngle = f11;
                } else {
                    pieChart = pieChart2;
                    z3 = z10;
                    f11 = rotationAngle;
                    fArr = drawAngles;
                }
            }
            f13 = holeRadius;
            rectF2 = rectF3;
            i10 = i11;
            i11 = i10 + 1;
            bVarArr2 = bVarArr;
            holeRadius = f13;
            f16 = f10;
            pieChart2 = pieChart;
            z10 = z3;
            drawAngles = fArr;
            rectF3 = rectF2;
            rotationAngle = f11;
        }
        w9.d.c(centerCircleBox);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[PHI: r3
  0x005e: PHI (r3v4 float) = (r3v3 float), (r3v45 float), (r3v45 float) binds: [B:3:0x003a, B:5:0x0043, B:7:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(android.graphics.Canvas r50) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.f.G(android.graphics.Canvas):void");
    }

    public final void I(Canvas canvas, String str, float f10, float f11, int i4) {
        Paint paint = this.f35986f;
        paint.setColor(i4);
        canvas.drawText(str, f10, f11, paint);
    }
}
