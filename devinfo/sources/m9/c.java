package m9;

import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieChart;
import java.util.ArrayList;
import o9.h;
import o9.i;
import u9.g;
import w9.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c extends b {
    public float D;
    public float E;
    public boolean F;
    public float G;

    @Override // android.view.View
    public final void computeScroll() {
        u9.b bVar = this.f29007n;
        if (bVar instanceof g) {
            g gVar = (g) bVar;
            b bVar2 = gVar.f35215d;
            if (gVar.f35221i == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            c cVar = (c) bVar2;
            gVar.f35221i = cVar.getDragDecelerationFrictionCoef() * gVar.f35221i;
            cVar.setRotationAngle((gVar.f35221i * ((jCurrentAnimationTimeMillis - gVar.f35220h) / 1000.0f)) + cVar.getRotationAngle());
            gVar.f35220h = jCurrentAnimationTimeMillis;
            if (Math.abs(gVar.f35221i) < 0.001d) {
                gVar.f35221i = 0.0f;
            } else {
                DisplayMetrics displayMetrics = w9.g.f36555a;
                bVar2.postInvalidateOnAnimation();
            }
        }
    }

    @Override // m9.b
    public void e() {
        super.e();
        g gVar = new g(this);
        gVar.f35218e = d.b(0.0f, 0.0f);
        gVar.f35219f = 0.0f;
        gVar.g = new ArrayList();
        gVar.f35220h = 0L;
        gVar.f35221i = 0.0f;
        this.f29007n = gVar;
    }

    @Override // m9.b
    public final void f() {
        float f10;
        if (this.f28997b == null) {
            return;
        }
        PieChart pieChart = (PieChart) this;
        int iE = ((o9.g) pieChart.f28997b).e();
        float f11 = 0.0f;
        if (pieChart.J.length != iE) {
            pieChart.J = new float[iE];
        } else {
            for (int i4 = 0; i4 < iE; i4++) {
                pieChart.J[i4] = 0.0f;
            }
        }
        if (pieChart.K.length != iE) {
            pieChart.K = new float[iE];
        } else {
            for (int i10 = 0; i10 < iE; i10++) {
                pieChart.K[i10] = 0.0f;
            }
        }
        float fJ = ((o9.g) pieChart.f28997b).j();
        ArrayList arrayList = ((o9.g) pieChart.f28997b).f30440i;
        float f12 = pieChart.W;
        boolean z3 = f12 != 0.0f && ((float) iE) * f12 <= pieChart.V;
        float[] fArr = new float[iE];
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = ((o9.g) pieChart.f28997b).f30440i;
            if (i11 >= (arrayList2 == null ? 0 : arrayList2.size())) {
                break;
            }
            h hVar = (h) arrayList.get(i11);
            int i13 = 0;
            while (i13 < hVar.j.size()) {
                float fAbs = (Math.abs(((i) hVar.d(i13)).f30453a) / fJ) * pieChart.V;
                if (z3) {
                    float f15 = pieChart.W;
                    f10 = f11;
                    float f16 = fAbs - f15;
                    if (f16 <= f10) {
                        fArr[i12] = f15;
                        f13 += -f16;
                    } else {
                        fArr[i12] = fAbs;
                        f14 += f16;
                    }
                } else {
                    f10 = f11;
                }
                pieChart.J[i12] = fAbs;
                if (i12 == 0) {
                    pieChart.K[i12] = fAbs;
                } else {
                    float[] fArr2 = pieChart.K;
                    fArr2[i12] = fArr2[i12 - 1] + fAbs;
                }
                i12++;
                i13++;
                f11 = f10;
            }
            i11++;
        }
        if (z3) {
            for (int i14 = 0; i14 < iE; i14++) {
                float f17 = fArr[i14];
                float f18 = f17 - (((f17 - pieChart.W) / f14) * f13);
                fArr[i14] = f18;
                if (i14 == 0) {
                    pieChart.K[0] = fArr[0];
                } else {
                    float[] fArr3 = pieChart.K;
                    fArr3[i14] = fArr3[i14 - 1] + f18;
                }
            }
            pieChart.J = fArr;
        }
        if (this.f29005l != null) {
            this.f29009p.C(this.f28997b);
        }
        a();
    }

    public float getDiameter() {
        RectF rectF = this.f29012s.f36564b;
        rectF.left = getExtraLeftOffset() + rectF.left;
        rectF.top = getExtraTopOffset() + rectF.top;
        rectF.right -= getExtraRightOffset();
        rectF.bottom -= getExtraBottomOffset();
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // m9.b, r9.b
    public int getMaxVisibleCount() {
        return this.f28997b.e();
    }

    public float getMinOffset() {
        return this.G;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.E;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.D;
    }

    @Override // m9.b, r9.b
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // m9.b, r9.b
    public float getYChartMin() {
        return 0.0f;
    }

    public final float i(float f10, float f11) {
        d centerOffsets = getCenterOffsets();
        float f12 = centerOffsets.f36546b;
        float f13 = f10 > f12 ? f10 - f12 : f12 - f10;
        float fSqrt = (float) Math.sqrt(Math.pow(f11 > centerOffsets.f36547c ? f11 - r1 : r1 - f11, 2.0d) + Math.pow(f13, 2.0d));
        d.c(centerOffsets);
        return fSqrt;
    }

    public final float j(float f10, float f11) {
        d centerOffsets = getCenterOffsets();
        double d10 = f10 - centerOffsets.f36546b;
        double d11 = f11 - centerOffsets.f36547c;
        float degrees = (float) Math.toDegrees(Math.acos(d11 / Math.sqrt((d11 * d11) + (d10 * d10))));
        if (f10 > centerOffsets.f36546b) {
            degrees = 360.0f - degrees;
        }
        float f12 = degrees + 90.0f;
        if (f12 > 360.0f) {
            f12 -= 360.0f;
        }
        d.c(centerOffsets);
        return f12;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u9.b bVar;
        return (!this.j || (bVar = this.f29007n) == null) ? super.onTouchEvent(motionEvent) : bVar.onTouch(this, motionEvent);
    }

    public void setMinOffset(float f10) {
        this.G = f10;
    }

    public void setRotationAngle(float f10) {
        this.E = f10;
        DisplayMetrics displayMetrics = w9.g.f36555a;
        while (f10 < 0.0f) {
            f10 += 360.0f;
        }
        this.D = f10 % 360.0f;
    }

    public void setRotationEnabled(boolean z3) {
        this.F = z3;
    }
}
