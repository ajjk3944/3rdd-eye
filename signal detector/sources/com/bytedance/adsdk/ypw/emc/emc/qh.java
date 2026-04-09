package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.ypw.emc.ypw.emc;
import com.bytedance.adsdk.ypw.xq.ypw.ru;
import com.bytedance.adsdk.ypw.xq.ypw.yzg;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.List;

/* loaded from: classes.dex */
public class qh implements gbl, sz, emc.InterfaceC0021emc {
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
        double d6;
        int iFloor = (int) Math.floor(this.uym.uym().floatValue());
        double radians = Math.toRadians((this.zz == null ? 0.0d : r2.uym().floatValue()) - 90.0d);
        double d7 = iFloor;
        float fFloatValue = this.sz.uym().floatValue() / 100.0f;
        float fFloatValue2 = this.gbl.uym().floatValue();
        double d8 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d8);
        float fSin = (float) (Math.sin(radians) * d8);
        this.emc.moveTo(fCos, fSin);
        double d9 = (float) (6.283185307179586d / d7);
        double d10 = radians + d9;
        double dCeil = Math.ceil(d7);
        int i = 0;
        while (i < dCeil) {
            float fCos2 = (float) (Math.cos(d10) * d8);
            int i3 = i;
            double d11 = d10;
            float fSin2 = (float) (Math.sin(d10) * d8);
            if (fFloatValue != 0.0f) {
                d6 = dCeil;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f2 = fFloatValue2 * fFloatValue * 0.25f;
                this.emc.cubicTo(fCos - (f2 * fCos3), fSin - (f2 * fSin3), fCos2 + (((float) Math.cos(dAtan22)) * f2), fSin2 + (f2 * ((float) Math.sin(dAtan22))), fCos2, fSin2);
                fCos = fCos2;
                fSin = fSin2;
            } else {
                fSin = fSin2;
                d6 = dCeil;
                fCos = fCos2;
                this.emc.lineTo(fCos, fSin);
            }
            d10 = d11 + d9;
            i = i3 + 1;
            dCeil = d6;
        }
        PointF pointFUym = this.msw.uym();
        this.emc.offset(pointFUym.x, pointFUym.y);
        this.emc.close();
    }

    private void xq() {
        float f2;
        float f5;
        int i;
        float fCos;
        float fSin;
        float f6;
        float f7;
        double d6;
        float fH;
        int i3;
        float f8;
        double d7;
        float f9;
        float f10;
        double d8;
        float f11;
        float f12;
        float fFloatValue = this.uym.uym().floatValue();
        double radians = Math.toRadians((this.zz == null ? 0.0d : r2.uym().floatValue()) - 90.0d);
        double d9 = fFloatValue;
        float f13 = (float) (6.283185307179586d / d9);
        if (this.ycc) {
            f13 *= -1.0f;
        }
        float f14 = f13 / 2.0f;
        float f15 = fFloatValue - ((int) fFloatValue);
        int i6 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i6 != 0) {
            radians += (1.0f - f15) * f14;
        }
        float fFloatValue2 = this.gbl.uym().floatValue();
        float fFloatValue3 = this.ru.uym().floatValue();
        com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> emcVar = this.sup;
        float fFloatValue4 = emcVar != null ? emcVar.uym().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> emcVar2 = this.sz;
        float fFloatValue5 = emcVar2 != null ? emcVar2.uym().floatValue() / 100.0f : 0.0f;
        if (i6 != 0) {
            fH = AbstractC1135f5.h(fFloatValue2, fFloatValue3, f15, fFloatValue3);
            f5 = 0.0f;
            i = i6;
            double d10 = fH;
            f2 = 2.0f;
            float fCos2 = (float) (Math.cos(radians) * d10);
            fSin = (float) (Math.sin(radians) * d10);
            this.emc.moveTo(fCos2, fSin);
            d6 = radians + ((f13 * f15) / 2.0f);
            f6 = f15;
            fCos = fCos2;
            f7 = f14;
        } else {
            f2 = 2.0f;
            f5 = 0.0f;
            i = i6;
            double d11 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d11);
            fSin = (float) (d11 * Math.sin(radians));
            this.emc.moveTo(fCos, fSin);
            f6 = f15;
            f7 = f14;
            d6 = radians + f7;
            fH = 0.0f;
        }
        double dCeil = Math.ceil(d9) * 2.0d;
        int i7 = 0;
        boolean z6 = false;
        double d12 = d6;
        float f16 = fSin;
        float f17 = fCos;
        double d13 = d12;
        while (true) {
            double d14 = i7;
            if (d14 >= dCeil) {
                PointF pointFUym = this.msw.uym();
                this.emc.offset(pointFUym.x, pointFUym.y);
                this.emc.close();
                return;
            }
            float f18 = z6 ? fFloatValue2 : fFloatValue3;
            if (fH == f5 || d14 != dCeil - 2.0d) {
                i3 = i7;
                f8 = f7;
            } else {
                i3 = i7;
                f8 = (f13 * f6) / f2;
            }
            if (fH == f5 || d14 != dCeil - 1.0d) {
                d7 = d14;
                f9 = f18;
            } else {
                d7 = d14;
                f9 = fH;
            }
            double d15 = f9;
            float fCos3 = (float) (Math.cos(d13) * d15);
            float f19 = f13;
            float fSin2 = (float) (Math.sin(d13) * d15);
            if (fFloatValue4 == f5 && fFloatValue5 == f5) {
                this.emc.lineTo(fCos3, fSin2);
                f12 = fCos3;
                f11 = fSin2;
                f10 = f7;
                d8 = d13;
            } else {
                f10 = f7;
                d8 = d13;
                double dAtan2 = (float) (Math.atan2(f16, f17) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f20 = f17;
                float f21 = f16;
                f11 = fSin2;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f22 = z6 ? fFloatValue4 : fFloatValue5;
                float f23 = z6 ? fFloatValue5 : fFloatValue4;
                float f24 = (z6 ? fFloatValue3 : fFloatValue2) * f22 * 0.47829f;
                float f25 = fCos4 * f24;
                float f26 = f24 * fSin3;
                float f27 = (z6 ? fFloatValue2 : fFloatValue3) * f23 * 0.47829f;
                float f28 = fCos5 * f27;
                float f29 = f27 * fSin4;
                if (i != 0) {
                    if (i3 == 0) {
                        f25 *= f6;
                        f26 *= f6;
                    } else if (d7 == dCeil - 1.0d) {
                        f28 *= f6;
                        f29 *= f6;
                    }
                }
                f12 = fCos3;
                this.emc.cubicTo(f20 - f25, f21 - f26, fCos3 + f28, f11 + f29, f12, f11);
            }
            d13 = d8 + f8;
            z6 = !z6;
            i7 = i3 + 1;
            f7 = f10;
            f17 = f12;
            f16 = f11;
            f13 = f19;
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
        int i = AnonymousClass1.emc[this.dg.ordinal()];
        if (i == 1) {
            xq();
        } else if (i == 2) {
            bw();
        }
        this.emc.close();
        this.qh.emc(this.emc);
        this.cf = true;
        return this.emc;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0021emc
    public void emc() {
        ypw();
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<xq> list, List<xq> list2) {
        for (int i = 0; i < list.size(); i++) {
            xq xqVar = list.get(i);
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
