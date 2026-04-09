package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.vt.lh.vt.th;
import com.bytedance.adsdk.vt.lh.vt.tlj;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.List;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jg implements cf, mwh, ouw.InterfaceC0040ouw {
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> bly;

    /* renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f7143cf;
    private final boolean fkw;
    private boolean ko;

    /* renamed from: le, reason: collision with root package name */
    private final boolean f7145le;

    /* renamed from: lh, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.bly f7146lh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> mwh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> pno;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ra;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ryl;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> tlj;
    private final String vt;
    private final tlj.ouw yu;
    private final Path ouw = new Path();

    /* renamed from: jg, reason: collision with root package name */
    private final vt f7144jg = new vt();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.vt.ouw.ouw.jg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[tlj.ouw.values().length];
            ouw = iArr;
            try {
                iArr[tlj.ouw.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[tlj.ouw.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public jg(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.tlj tljVar) {
        this.f7146lh = blyVar;
        this.vt = tljVar.ouw;
        tlj.ouw ouwVar2 = tljVar.vt;
        this.yu = ouwVar2;
        this.fkw = tljVar.tlj;
        this.f7145le = tljVar.f7126cf;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = tljVar.f7128lh.ouw();
        this.ra = ouwVarOuw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw2 = tljVar.yu.ouw();
        this.pno = ouwVarOuw2;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = tljVar.fkw.ouw();
        this.bly = ouwVarOuw3;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw4 = tljVar.ra.ouw();
        this.f7143cf = ouwVarOuw4;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw5 = tljVar.bly.ouw();
        this.mwh = ouwVarOuw5;
        tlj.ouw ouwVar3 = tlj.ouw.STAR;
        if (ouwVar2 == ouwVar3) {
            this.tlj = tljVar.f7127le.ouw();
            this.ryl = tljVar.pno.ouw();
        } else {
            this.tlj = null;
            this.ryl = null;
        }
        ouwVar.ouw(ouwVarOuw);
        ouwVar.ouw(ouwVarOuw2);
        ouwVar.ouw(ouwVarOuw3);
        ouwVar.ouw(ouwVarOuw4);
        ouwVar.ouw(ouwVarOuw5);
        if (ouwVar2 == ouwVar3) {
            ouwVar.ouw(this.tlj);
            ouwVar.ouw(this.ryl);
        }
        ouwVarOuw.ouw(this);
        ouwVarOuw2.ouw(this);
        ouwVarOuw3.ouw(this);
        ouwVarOuw4.ouw(this);
        ouwVarOuw5.ouw(this);
        if (ouwVar2 == ouwVar3) {
            this.tlj.ouw(this);
            this.ryl.ouw(this);
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            lh lhVar = list.get(i4);
            if (lhVar instanceof zin) {
                zin zinVar = (zin) lhVar;
                if (zinVar.vt == th.ouw.SIMULTANEOUSLY) {
                    this.f7144jg.ouw(zinVar);
                    zinVar.ouw(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        double d10;
        float fSin;
        float fC;
        float f15;
        float f16;
        double d11;
        int i4;
        float f17;
        float f18;
        float f19;
        float f20;
        double d12;
        if (this.ko) {
            return this.ouw;
        }
        this.ouw.reset();
        if (this.fkw) {
            this.ko = true;
            return this.ouw;
        }
        int i10 = AnonymousClass1.ouw[this.yu.ordinal()];
        if (i10 == 1) {
            float fFloatValue = this.ra.le().floatValue();
            double radians = Math.toRadians((this.bly != null ? r2.le().floatValue() : 0.0d) - 90.0d);
            double d13 = fFloatValue;
            float f21 = (float) (6.283185307179586d / d13);
            if (this.f7145le) {
                f21 *= -1.0f;
            }
            float f22 = f21 / 2.0f;
            float f23 = fFloatValue - ((int) fFloatValue);
            if (f23 != 0.0f) {
                radians += (1.0f - f23) * f22;
            }
            float fFloatValue2 = this.f7143cf.le().floatValue();
            float fFloatValue3 = this.tlj.le().floatValue();
            com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar = this.ryl;
            float fFloatValue4 = ouwVar != null ? ouwVar.le().floatValue() / 100.0f : 0.0f;
            com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar2 = this.mwh;
            float fFloatValue5 = ouwVar2 != null ? ouwVar2.le().floatValue() / 100.0f : 0.0f;
            if (f23 != 0.0f) {
                fC = c.c(fFloatValue2, fFloatValue3, f23, fFloatValue3);
                f12 = 2.0f;
                double d14 = fC;
                f10 = f23;
                f11 = f21;
                float fCos = (float) (Math.cos(radians) * d14);
                fSin = (float) (Math.sin(radians) * d14);
                this.ouw.moveTo(fCos, fSin);
                d10 = radians + ((f11 * f10) / 2.0f);
                f13 = fCos;
                f14 = f22;
            } else {
                f10 = f23;
                f11 = f21;
                f12 = 2.0f;
                double d15 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d15);
                float fSin2 = (float) (d15 * Math.sin(radians));
                this.ouw.moveTo(fCos2, fSin2);
                f13 = fCos2;
                f14 = f22;
                d10 = radians + f14;
                fSin = fSin2;
                fC = 0.0f;
            }
            double dCeil = Math.ceil(d13) * 2.0d;
            double d16 = d10;
            int i11 = 0;
            boolean z3 = false;
            while (true) {
                double d17 = i11;
                if (d17 >= dCeil) {
                    break;
                }
                float f24 = z3 ? fFloatValue2 : fFloatValue3;
                float f25 = (fC == 0.0f || d17 != dCeil - 2.0d) ? f14 : (f11 * f10) / f12;
                if (fC == 0.0f || d17 != dCeil - 1.0d) {
                    f15 = f14;
                    f16 = f24;
                } else {
                    f15 = f14;
                    f16 = fC;
                }
                double d18 = f16;
                float fCos3 = (float) (Math.cos(d16) * d18);
                float fSin3 = (float) (Math.sin(d16) * d18);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    this.ouw.lineTo(fCos3, fSin3);
                    f18 = fCos3;
                    f17 = fSin3;
                    d11 = dCeil;
                    i4 = i11;
                } else {
                    d11 = dCeil;
                    float f26 = fSin;
                    i4 = i11;
                    double dAtan2 = (float) (Math.atan2(fSin, f13) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f27 = f13;
                    f17 = fSin3;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f28 = z3 ? fFloatValue4 : fFloatValue5;
                    float f29 = z3 ? fFloatValue5 : fFloatValue4;
                    float f30 = (z3 ? fFloatValue3 : fFloatValue2) * f28 * 0.47829f;
                    float f31 = fCos4 * f30;
                    float f32 = f30 * fSin4;
                    float f33 = (z3 ? fFloatValue2 : fFloatValue3) * f29 * 0.47829f;
                    float f34 = fCos5 * f33;
                    float f35 = f33 * fSin5;
                    if (f23 != 0.0f) {
                        if (i4 == 0) {
                            f31 *= f10;
                            f32 *= f10;
                        } else if (d17 == d11 - 1.0d) {
                            f34 *= f10;
                            f35 *= f10;
                        }
                    }
                    f18 = fCos3;
                    this.ouw.cubicTo(f27 - f31, f26 - f32, fCos3 + f34, f17 + f35, f18, f17);
                }
                d16 += f25;
                z3 = !z3;
                i11 = i4 + 1;
                f14 = f15;
                dCeil = d11;
                f13 = f18;
                fSin = f17;
            }
            PointF pointFLe = this.pno.le();
            this.ouw.offset(pointFLe.x, pointFLe.y);
            this.ouw.close();
        } else if (i10 == 2) {
            int iFloor = (int) Math.floor(this.ra.le().floatValue());
            double radians2 = Math.toRadians((this.bly != null ? r14.le().floatValue() : 0.0d) - 90.0d);
            double d19 = iFloor;
            float fFloatValue6 = this.mwh.le().floatValue() / 100.0f;
            float fFloatValue7 = this.f7143cf.le().floatValue();
            double d20 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d20);
            float fSin6 = (float) (Math.sin(radians2) * d20);
            this.ouw.moveTo(fCos6, fSin6);
            double d21 = (float) (6.283185307179586d / d19);
            double d22 = radians2 + d21;
            double dCeil2 = Math.ceil(d19);
            float f36 = fCos6;
            int i12 = 0;
            while (i12 < dCeil2) {
                float fCos7 = (float) (Math.cos(d22) * d20);
                float fSin7 = (float) (Math.sin(d22) * d20);
                if (fFloatValue6 != 0.0f) {
                    f19 = fFloatValue6;
                    f20 = fFloatValue7;
                    d12 = d22;
                    double dAtan23 = (float) (Math.atan2(fSin6, f36) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    float f37 = f36;
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f38 = f20 * f19 * 0.25f;
                    this.ouw.cubicTo(f37 - (fCos8 * f38), fSin6 - (f38 * fSin8), fCos7 + (((float) Math.cos(dAtan24)) * f38), fSin7 + (f38 * ((float) Math.sin(dAtan24))), fCos7, fSin7);
                    f36 = fCos7;
                    fSin6 = fSin7;
                } else {
                    f19 = fFloatValue6;
                    f20 = fFloatValue7;
                    d12 = d22;
                    f36 = fCos7;
                    fSin6 = fSin7;
                    this.ouw.lineTo(f36, fSin6);
                }
                d22 = d12 + d21;
                i12++;
                fFloatValue6 = f19;
                fFloatValue7 = f20;
            }
            PointF pointFLe2 = this.pno.le();
            this.ouw.offset(pointFLe2.x, pointFLe2.y);
            this.ouw.close();
        }
        this.ouw.close();
        this.f7144jg.ouw(this.ouw);
        this.ko = true;
        return this.ouw;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        this.ko = false;
        this.f7146lh.invalidateSelf();
    }
}
