package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.ypw.emc.ypw.emc;
import com.bytedance.adsdk.ypw.xq.ypw.ru;
import com.bytedance.adsdk.ypw.xq.ypw.yzg;
import java.util.List;

/* loaded from: classes.dex */
public class qh implements gbl, sz, emc.InterfaceC0106emc {
    private final boolean bw;
    private boolean cf;
    private final ru.emc dg;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> gbl;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, PointF> msw;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> ru;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> sup;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> sz;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> uym;
    private final com.bytedance.adsdk.ypw.zz xq;
    private final boolean ycc;
    private final String ypw;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> zz;
    private final Path emc = new Path();
    private final ypw qh = new ypw();

    /* renamed from: com.bytedance.adsdk.ypw.emc.emc.qh$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[ru.emc.values().length];
            emc = iArr;
            try {
                iArr[ru.emc.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[ru.emc.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public qh(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.ru ruVar) {
        this.xq = zzVar;
        this.ypw = ruVar.emc();
        ru.emc emcVarYpw = ruVar.ypw();
        this.dg = emcVarYpw;
        this.bw = ruVar.ru();
        this.ycc = ruVar.gbl();
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc = ruVar.xq().emc();
        this.uym = emcVarEmc;
        com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emcVarEmc2 = ruVar.dg().emc();
        this.msw = emcVarEmc2;
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc3 = ruVar.bw().emc();
        this.zz = emcVarEmc3;
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc4 = ruVar.uym().emc();
        this.gbl = emcVarEmc4;
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc5 = ruVar.zz().emc();
        this.sz = emcVarEmc5;
        ru.emc emcVar2 = ru.emc.STAR;
        if (emcVarYpw == emcVar2) {
            this.ru = ruVar.ycc().emc();
            this.sup = ruVar.msw().emc();
        } else {
            this.ru = null;
            this.sup = null;
        }
        emcVar.emc(emcVarEmc);
        emcVar.emc(emcVarEmc2);
        emcVar.emc(emcVarEmc3);
        emcVar.emc(emcVarEmc4);
        emcVar.emc(emcVarEmc5);
        if (emcVarYpw == emcVar2) {
            emcVar.emc(this.ru);
            emcVar.emc(this.sup);
        }
        emcVarEmc.emc(this);
        emcVarEmc2.emc(this);
        emcVarEmc3.emc(this);
        emcVarEmc4.emc(this);
        emcVarEmc5.emc(this);
        if (emcVarYpw == emcVar2) {
            this.ru.emc(this);
            this.sup.emc(this);
        }
    }

    private void bw() {
        double d10;
        int iFloor = (int) Math.floor(this.uym.uym().floatValue());
        double radians = Math.toRadians((this.zz == null ? 0.0d : r2.uym().floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = this.sz.uym().floatValue() / 100.0f;
        float fFloatValue2 = this.gbl.uym().floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        this.emc.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double d14 = radians + d13;
        double dCeil = Math.ceil(d11);
        int i10 = 0;
        while (i10 < dCeil) {
            float fCos2 = (float) (Math.cos(d14) * d12);
            int i11 = i10;
            double d15 = d14;
            float fSin2 = (float) (d12 * Math.sin(d14));
            if (fFloatValue != 0.0f) {
                d10 = dCeil;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f10 = fFloatValue2 * fFloatValue * 0.25f;
                this.emc.cubicTo(fCos - (f10 * fCos3), fSin - (f10 * fSin3), fCos2 + (((float) Math.cos(dAtan22)) * f10), fSin2 + (f10 * ((float) Math.sin(dAtan22))), fCos2, fSin2);
                fCos = fCos2;
                fSin = fSin2;
            } else {
                fSin = fSin2;
                d10 = dCeil;
                fCos = fCos2;
                this.emc.lineTo(fCos, fSin);
            }
            d14 = d15 + d13;
            i10 = i11 + 1;
            dCeil = d10;
        }
        PointF pointFUym = this.msw.uym();
        this.emc.offset(pointFUym.x, pointFUym.y);
        this.emc.close();
    }

    private void xq() {
        float f10;
        float f11;
        int i10;
        float fCos;
        float fSin;
        float f12;
        float f13;
        double d10;
        float f14;
        int i11;
        float f15;
        double d11;
        float f16;
        float f17;
        double d12;
        float f18;
        float f19;
        float fFloatValue = this.uym.uym().floatValue();
        double radians = Math.toRadians((this.zz == null ? 0.0d : r2.uym().floatValue()) - 90.0d);
        double d13 = fFloatValue;
        float f20 = (float) (6.283185307179586d / d13);
        if (this.ycc) {
            f20 *= -1.0f;
        }
        float f21 = f20 / 2.0f;
        float f22 = fFloatValue - ((int) fFloatValue);
        int i12 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
        if (i12 != 0) {
            radians += (1.0f - f22) * f21;
        }
        float fFloatValue2 = this.gbl.uym().floatValue();
        float fFloatValue3 = this.ru.uym().floatValue();
        com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> emcVar = this.sup;
        float fFloatValue4 = emcVar != null ? emcVar.uym().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> emcVar2 = this.sz;
        float fFloatValue5 = emcVar2 != null ? emcVar2.uym().floatValue() / 100.0f : 0.0f;
        if (i12 != 0) {
            f14 = ((fFloatValue2 - fFloatValue3) * f22) + fFloatValue3;
            f11 = 0.0f;
            i10 = i12;
            double d14 = f14;
            f10 = 2.0f;
            float fCos2 = (float) (d14 * Math.cos(radians));
            fSin = (float) (d14 * Math.sin(radians));
            this.emc.moveTo(fCos2, fSin);
            d10 = radians + ((f20 * f22) / 2.0f);
            f12 = f22;
            fCos = fCos2;
            f13 = f21;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            i10 = i12;
            double d15 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d15);
            fSin = (float) (d15 * Math.sin(radians));
            this.emc.moveTo(fCos, fSin);
            f12 = f22;
            f13 = f21;
            d10 = radians + f13;
            f14 = 0.0f;
        }
        double dCeil = Math.ceil(d13) * 2.0d;
        int i13 = 0;
        boolean z10 = false;
        double d16 = d10;
        float f23 = fSin;
        float f24 = fCos;
        double d17 = d16;
        while (true) {
            double d18 = i13;
            if (d18 >= dCeil) {
                PointF pointFUym = this.msw.uym();
                this.emc.offset(pointFUym.x, pointFUym.y);
                this.emc.close();
                return;
            }
            float f25 = z10 ? fFloatValue2 : fFloatValue3;
            if (f14 == f11 || d18 != dCeil - 2.0d) {
                i11 = i13;
                f15 = f13;
            } else {
                i11 = i13;
                f15 = (f20 * f12) / f10;
            }
            if (f14 == f11 || d18 != dCeil - 1.0d) {
                d11 = d18;
                f16 = f25;
            } else {
                d11 = d18;
                f16 = f14;
            }
            double d19 = f16;
            float fCos3 = (float) (d19 * Math.cos(d17));
            float f26 = f20;
            float fSin2 = (float) (d19 * Math.sin(d17));
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.emc.lineTo(fCos3, fSin2);
                f19 = fCos3;
                f18 = fSin2;
                f17 = f13;
                d12 = d17;
            } else {
                f17 = f13;
                d12 = d17;
                double dAtan2 = (float) (Math.atan2(f23, f24) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f27 = f24;
                float f28 = f23;
                f18 = fSin2;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f29 = z10 ? fFloatValue4 : fFloatValue5;
                float f30 = z10 ? fFloatValue5 : fFloatValue4;
                float f31 = (z10 ? fFloatValue3 : fFloatValue2) * f29 * 0.47829f;
                float f32 = fCos4 * f31;
                float f33 = f31 * fSin3;
                float f34 = (z10 ? fFloatValue2 : fFloatValue3) * f30 * 0.47829f;
                float f35 = fCos5 * f34;
                float f36 = f34 * fSin4;
                if (i10 != 0) {
                    if (i11 == 0) {
                        f32 *= f12;
                        f33 *= f12;
                    } else if (d11 == dCeil - 1.0d) {
                        f35 *= f12;
                        f36 *= f12;
                    }
                }
                f19 = fCos3;
                this.emc.cubicTo(f27 - f32, f28 - f33, fCos3 + f35, f18 + f36, f19, f18);
            }
            d17 = d12 + f15;
            z10 = !z10;
            i13 = i11 + 1;
            f13 = f17;
            f24 = f19;
            f23 = f18;
            f20 = f26;
        }
    }

    private void ypw() {
        this.cf = false;
        this.xq.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.sz
    public Path dg() {
        if (this.cf) {
            return this.emc;
        }
        this.emc.reset();
        if (this.bw) {
            this.cf = true;
            return this.emc;
        }
        int i10 = AnonymousClass1.emc[this.dg.ordinal()];
        if (i10 == 1) {
            xq();
        } else if (i10 == 2) {
            bw();
        }
        this.emc.close();
        this.qh.emc(this.emc);
        this.cf = true;
        return this.emc;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0106emc
    public void emc() {
        ypw();
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<xq> list, List<xq> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            xq xqVar = list.get(i10);
            if (xqVar instanceof ylm) {
                ylm ylmVar = (ylm) xqVar;
                if (ylmVar.ypw() == yzg.emc.SIMULTANEOUSLY) {
                    this.qh.emc(ylmVar);
                    ylmVar.emc(this);
                }
            }
        }
    }
}
