package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import km.i;
import m9.c;
import n9.e;
import v9.b;
import v9.f;
import w9.d;
import w9.g;
import w9.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class PieChart extends c {
    public final RectF H;
    public boolean I;
    public float[] J;
    public float[] K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public CharSequence P;
    public final d Q;
    public float R;
    public float S;
    public boolean T;
    public float U;
    public float V;
    public float W;

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = 270.0f;
        this.E = 270.0f;
        this.F = true;
        this.G = 0.0f;
        this.H = new RectF();
        this.I = true;
        this.J = new float[1];
        this.K = new float[1];
        this.L = true;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = "";
        this.Q = d.b(0.0f, 0.0f);
        this.R = 50.0f;
        this.S = 55.0f;
        this.T = true;
        this.U = 100.0f;
        this.V = 360.0f;
        this.W = 0.0f;
    }

    @Override // m9.b
    public final void a() {
        float requiredBaseOffset;
        float requiredBaseOffset2;
        float requiredBaseOffset3;
        float requiredBaseOffset4;
        float fMin;
        float f10;
        float f11;
        float f12;
        float fC;
        float fMin2;
        float fMin3;
        e eVar = this.f29005l;
        h hVar = this.f29012s;
        if (eVar == null || !eVar.f29850a) {
            requiredBaseOffset = 0.0f;
            requiredBaseOffset2 = 0.0f;
            requiredBaseOffset3 = 0.0f;
            requiredBaseOffset4 = 0.0f;
        } else {
            float fMin4 = Math.min(eVar.f29866r, hVar.f36565c * eVar.f29865q);
            int iC = i3.e.c(this.f29005l.f29858i);
            if (iC == 0) {
                int i4 = this.f29005l.f29857h;
                if (i4 == 1 || i4 == 3) {
                    float requiredLegendOffset = getRequiredLegendOffset();
                    e eVar2 = this.f29005l;
                    fMin = Math.min(eVar2.f29867s + requiredLegendOffset, hVar.f36566d * eVar2.f29865q);
                    int iC2 = i3.e.c(this.f29005l.f29857h);
                    if (iC2 == 0) {
                        f11 = 0.0f;
                        f10 = 0.0f;
                    } else if (iC2 == 2) {
                        f10 = fMin;
                        fMin = 0.0f;
                        f11 = 0.0f;
                    }
                    f12 = 0.0f;
                    requiredBaseOffset2 = f11 + getRequiredBaseOffset();
                    requiredBaseOffset4 = getRequiredBaseOffset() + f12;
                    requiredBaseOffset = fMin + getRequiredBaseOffset();
                    requiredBaseOffset3 = f10 + getRequiredBaseOffset();
                }
            } else if (iC == 1) {
                e eVar3 = this.f29005l;
                int i10 = eVar3.g;
                if (i10 != 1 && i10 != 3) {
                    fC = 0.0f;
                } else if (eVar3.f29857h == 2) {
                    fC = g.c(13.0f) + fMin4;
                } else {
                    float fC2 = g.c(8.0f) + fMin4;
                    e eVar4 = this.f29005l;
                    float f13 = eVar4.f29867s + eVar4.f29868t;
                    d center = getCenter();
                    float width = this.f29005l.g == 3 ? (getWidth() - fC2) + 15.0f : fC2 - 15.0f;
                    float f14 = f13 + 15.0f;
                    float fI = i(width, f14);
                    float radius = getRadius();
                    float fJ = j(width, f14);
                    d dVarB = d.b(0.0f, 0.0f);
                    double d10 = radius;
                    double d11 = fJ;
                    dVarB.f36546b = (float) ((Math.cos(Math.toRadians(d11)) * d10) + center.f36546b);
                    float fSin = (float) ((Math.sin(Math.toRadians(d11)) * d10) + center.f36547c);
                    dVarB.f36547c = fSin;
                    float fI2 = i(dVarB.f36546b, fSin);
                    fC = (f14 < center.f36547c || ((float) getHeight()) - fC2 <= ((float) getWidth())) ? fI < fI2 ? (fI2 - fI) + g.c(5.0f) : 0.0f : fC2;
                    d.c(center);
                    d.c(dVarB);
                }
                int iC3 = i3.e.c(this.f29005l.g);
                if (iC3 != 0) {
                    if (iC3 == 1) {
                        int iC4 = i3.e.c(this.f29005l.f29857h);
                        if (iC4 != 0) {
                            if (iC4 == 2) {
                                e eVar5 = this.f29005l;
                                fMin2 = Math.min(eVar5.f29867s, hVar.f36566d * eVar5.f29865q);
                            }
                            f11 = 0.0f;
                        } else {
                            e eVar6 = this.f29005l;
                            fMin3 = Math.min(eVar6.f29867s, hVar.f36566d * eVar6.f29865q);
                            fMin2 = 0.0f;
                            f11 = 0.0f;
                            f12 = 0.0f;
                            float f15 = fMin3;
                            f10 = fMin2;
                            fMin = f15;
                            requiredBaseOffset2 = f11 + getRequiredBaseOffset();
                            requiredBaseOffset4 = getRequiredBaseOffset() + f12;
                            requiredBaseOffset = fMin + getRequiredBaseOffset();
                            requiredBaseOffset3 = f10 + getRequiredBaseOffset();
                        }
                    } else if (iC3 == 2) {
                        f12 = fC;
                        fMin2 = 0.0f;
                        f11 = 0.0f;
                        fMin3 = 0.0f;
                        float f152 = fMin3;
                        f10 = fMin2;
                        fMin = f152;
                        requiredBaseOffset2 = f11 + getRequiredBaseOffset();
                        requiredBaseOffset4 = getRequiredBaseOffset() + f12;
                        requiredBaseOffset = fMin + getRequiredBaseOffset();
                        requiredBaseOffset3 = f10 + getRequiredBaseOffset();
                    }
                    fMin2 = 0.0f;
                    f11 = 0.0f;
                } else {
                    f11 = fC;
                    fMin2 = 0.0f;
                }
                fMin3 = 0.0f;
                f12 = 0.0f;
                float f1522 = fMin3;
                f10 = fMin2;
                fMin = f1522;
                requiredBaseOffset2 = f11 + getRequiredBaseOffset();
                requiredBaseOffset4 = getRequiredBaseOffset() + f12;
                requiredBaseOffset = fMin + getRequiredBaseOffset();
                requiredBaseOffset3 = f10 + getRequiredBaseOffset();
            }
            fMin = 0.0f;
            f11 = 0.0f;
            f10 = 0.0f;
            f12 = 0.0f;
            requiredBaseOffset2 = f11 + getRequiredBaseOffset();
            requiredBaseOffset4 = getRequiredBaseOffset() + f12;
            requiredBaseOffset = fMin + getRequiredBaseOffset();
            requiredBaseOffset3 = f10 + getRequiredBaseOffset();
        }
        float fC3 = g.c(this.G);
        float extraTopOffset = getExtraTopOffset() + requiredBaseOffset;
        float extraRightOffset = getExtraRightOffset() + requiredBaseOffset4;
        float extraBottomOffset = getExtraBottomOffset() + requiredBaseOffset3;
        float fMax = Math.max(fC3, getExtraLeftOffset() + requiredBaseOffset2);
        float fMax2 = Math.max(fC3, extraTopOffset);
        float fMax3 = Math.max(fC3, extraRightOffset);
        float fMax4 = Math.max(fC3, Math.max(getRequiredBaseOffset(), extraBottomOffset));
        hVar.f36564b.set(fMax, fMax2, hVar.f36565c - fMax3, hVar.f36566d - fMax4);
        if (this.f28996a) {
            Log.i("MPAndroidChart", "offsetLeft: " + fMax + ", offsetTop: " + fMax2 + ", offsetRight: " + fMax3 + ", offsetBottom: " + fMax4);
        }
        if (this.f28997b == null) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        d centerOffsets = getCenterOffsets();
        float f16 = ((o9.g) this.f28997b).i().f30469p;
        float f17 = centerOffsets.f36546b;
        float f18 = centerOffsets.f36547c;
        this.H.set((f17 - diameter) + f16, (f18 - diameter) + f16, (f17 + diameter) - f16, (f18 + diameter) - f16);
        d.c(centerOffsets);
    }

    @Override // m9.c, m9.b
    public final void e() {
        super.e();
        this.f29010q = new f(this, this.f29013t, this.f29012s);
        this.f29003i = null;
        i iVar = new i(11, false);
        new ArrayList();
        iVar.f28426b = this;
        this.f29011r = iVar;
    }

    public float[] getAbsoluteAngles() {
        return this.K;
    }

    public d getCenterCircleBox() {
        RectF rectF = this.H;
        return d.b(rectF.centerX(), rectF.centerY());
    }

    public CharSequence getCenterText() {
        return this.P;
    }

    public d getCenterTextOffset() {
        d dVar = this.Q;
        return d.b(dVar.f36546b, dVar.f36547c);
    }

    public float getCenterTextRadiusPercent() {
        return this.U;
    }

    public RectF getCircleBox() {
        return this.H;
    }

    public float[] getDrawAngles() {
        return this.J;
    }

    public float getHoleRadius() {
        return this.R;
    }

    public float getMaxAngle() {
        return this.V;
    }

    public float getMinAngleForSlices() {
        return this.W;
    }

    @Override // m9.c
    public float getRadius() {
        RectF rectF = this.H;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // m9.c
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // m9.c
    public float getRequiredLegendOffset() {
        return this.f29009p.f35987c.getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.S;
    }

    @Override // m9.b
    @Deprecated
    public n9.g getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // m9.b, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b bVar = this.f29010q;
        if (bVar != null && (bVar instanceof f)) {
            f fVar = (f) bVar;
            Canvas canvas = fVar.f36015r;
            if (canvas != null) {
                canvas.setBitmap(null);
                fVar.f36015r = null;
            }
            WeakReference weakReference = fVar.f36014q;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                fVar.f36014q.clear();
                fVar.f36014q = null;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // m9.b, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f28997b == null) {
            return;
        }
        this.f29010q.D(canvas);
        if (h()) {
            this.f29010q.F(canvas, this.f29019z);
        }
        this.f29010q.E(canvas);
        this.f29010q.G(canvas);
        this.f29009p.E(canvas);
        b(canvas);
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.P = "";
        } else {
            this.P = charSequence;
        }
    }

    public void setCenterTextColor(int i4) {
        ((f) this.f29010q).f36008k.setColor(i4);
    }

    public void setCenterTextRadiusPercent(float f10) {
        this.U = f10;
    }

    public void setCenterTextSize(float f10) {
        ((f) this.f29010q).f36008k.setTextSize(g.c(f10));
    }

    public void setCenterTextSizePixels(float f10) {
        ((f) this.f29010q).f36008k.setTextSize(f10);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((f) this.f29010q).f36008k.setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z3) {
        this.T = z3;
    }

    public void setDrawEntryLabels(boolean z3) {
        this.I = z3;
    }

    public void setDrawHoleEnabled(boolean z3) {
        this.L = z3;
    }

    public void setDrawRoundedSlices(boolean z3) {
        this.O = z3;
    }

    @Deprecated
    public void setDrawSliceText(boolean z3) {
        this.I = z3;
    }

    public void setDrawSlicesUnderHole(boolean z3) {
        this.M = z3;
    }

    public void setEntryLabelColor(int i4) {
        ((f) this.f29010q).f36009l.setColor(i4);
    }

    public void setEntryLabelTextSize(float f10) {
        ((f) this.f29010q).f36009l.setTextSize(g.c(f10));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((f) this.f29010q).f36009l.setTypeface(typeface);
    }

    public void setHoleColor(int i4) {
        ((f) this.f29010q).f36006h.setColor(i4);
    }

    public void setHoleRadius(float f10) {
        this.R = f10;
    }

    public void setMaxAngle(float f10) {
        if (f10 > 360.0f) {
            f10 = 360.0f;
        }
        if (f10 < 90.0f) {
            f10 = 90.0f;
        }
        this.V = f10;
    }

    public void setMinAngleForSlices(float f10) {
        float f11 = this.V;
        if (f10 > f11 / 2.0f) {
            f10 = f11 / 2.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.W = f10;
    }

    public void setTransparentCircleAlpha(int i4) {
        ((f) this.f29010q).f36007i.setAlpha(i4);
    }

    public void setTransparentCircleColor(int i4) {
        Paint paint = ((f) this.f29010q).f36007i;
        int alpha = paint.getAlpha();
        paint.setColor(i4);
        paint.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f10) {
        this.S = f10;
    }

    public void setUsePercentValues(boolean z3) {
        this.N = z3;
    }
}
