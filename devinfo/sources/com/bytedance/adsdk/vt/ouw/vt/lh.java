package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.vt.ouw.vt.ouw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements ouw.InterfaceC0040ouw {
    private final ouw<Float, Float> fkw;

    /* renamed from: le, reason: collision with root package name */
    private final ouw<Float, Float> f7178le;

    /* renamed from: lh, reason: collision with root package name */
    private final ouw<Float, Float> f7179lh;
    private final ouw.InterfaceC0040ouw ouw;
    private boolean ra = true;
    private final ouw<Integer, Integer> vt;
    private final ouw<Float, Float> yu;

    public lh(ouw.InterfaceC0040ouw interfaceC0040ouw, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.fkw.tlj tljVar) {
        this.ouw = interfaceC0040ouw;
        ouw<Integer, Integer> ouwVarOuw = tljVar.ouw.ouw();
        this.vt = ouwVarOuw;
        ouwVarOuw.ouw(this);
        ouwVar.ouw(ouwVarOuw);
        ouw<Float, Float> ouwVarOuw2 = tljVar.vt.ouw();
        this.f7179lh = ouwVarOuw2;
        ouwVarOuw2.ouw(this);
        ouwVar.ouw(ouwVarOuw2);
        ouw<Float, Float> ouwVarOuw3 = tljVar.f7040lh.ouw();
        this.yu = ouwVarOuw3;
        ouwVarOuw3.ouw(this);
        ouwVar.ouw(ouwVarOuw3);
        ouw<Float, Float> ouwVarOuw4 = tljVar.yu.ouw();
        this.fkw = ouwVarOuw4;
        ouwVarOuw4.ouw(this);
        ouwVar.ouw(ouwVarOuw4);
        ouw<Float, Float> ouwVarOuw5 = tljVar.fkw.ouw();
        this.f7178le = ouwVarOuw5;
        ouwVarOuw5.ouw(this);
        ouwVar.ouw(ouwVarOuw5);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        this.ra = true;
        this.ouw.ouw();
    }

    public final void ouw(Paint paint) {
        if (this.ra) {
            this.ra = false;
            double dFloatValue = this.yu.le().floatValue() * 0.017453292519943295d;
            float fFloatValue = this.fkw.le().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.vt.le().intValue();
            paint.setShadowLayer(this.f7178le.le().floatValue(), fSin, fCos, Color.argb(Math.round(this.f7179lh.le().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
