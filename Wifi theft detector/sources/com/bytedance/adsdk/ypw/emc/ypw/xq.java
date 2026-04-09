package com.bytedance.adsdk.ypw.emc.ypw;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.ypw.emc.ypw.emc;

/* loaded from: classes.dex */
public class xq implements emc.InterfaceC0106emc {
    private final emc<Float, Float> bw;
    private final emc<Float, Float> dg;
    private final emc.InterfaceC0106emc emc;
    private boolean uym = true;
    private final emc<Float, Float> xq;
    private final emc<Float, Float> ycc;
    private final emc<Integer, Integer> ypw;

    public xq(emc.InterfaceC0106emc interfaceC0106emc, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.bw.ru ruVar) {
        this.emc = interfaceC0106emc;
        emc<Integer, Integer> emcVarEmc = ruVar.emc().emc();
        this.ypw = emcVarEmc;
        emcVarEmc.emc(this);
        emcVar.emc(emcVarEmc);
        emc<Float, Float> emcVarEmc2 = ruVar.ypw().emc();
        this.xq = emcVarEmc2;
        emcVarEmc2.emc(this);
        emcVar.emc(emcVarEmc2);
        emc<Float, Float> emcVarEmc3 = ruVar.xq().emc();
        this.dg = emcVarEmc3;
        emcVarEmc3.emc(this);
        emcVar.emc(emcVarEmc3);
        emc<Float, Float> emcVarEmc4 = ruVar.dg().emc();
        this.bw = emcVarEmc4;
        emcVarEmc4.emc(this);
        emcVar.emc(emcVarEmc4);
        emc<Float, Float> emcVarEmc5 = ruVar.bw().emc();
        this.ycc = emcVarEmc5;
        emcVarEmc5.emc(this);
        emcVar.emc(emcVarEmc5);
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0106emc
    public void emc() {
        this.uym = true;
        this.emc.emc();
    }

    public void emc(Paint paint) {
        if (this.uym) {
            this.uym = false;
            double dFloatValue = this.dg.uym().floatValue() * 0.017453292519943295d;
            float fFloatValue = this.bw.uym().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.ypw.uym().intValue();
            paint.setShadowLayer(this.ycc.uym().floatValue(), fSin, fCos, Color.argb(Math.round(this.xq.uym().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
