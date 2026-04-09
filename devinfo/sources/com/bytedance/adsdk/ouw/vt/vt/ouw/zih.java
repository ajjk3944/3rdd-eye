package com.bytedance.adsdk.ouw.vt.vt.ouw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class zih implements com.bytedance.adsdk.ouw.vt.vt.ouw {

    /* renamed from: lh, reason: collision with root package name */
    protected com.bytedance.adsdk.ouw.vt.yu.lh f6815lh;
    protected com.bytedance.adsdk.ouw.vt.vt.ouw ouw;
    protected com.bytedance.adsdk.ouw.vt.vt.ouw vt;

    public zih(com.bytedance.adsdk.ouw.vt.yu.lh lhVar) {
        this.f6815lh = lhVar;
    }

    public final void ouw(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.ouw = ouwVar;
    }

    public String toString() {
        return vt();
    }

    public final void vt(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.vt = ouwVar;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        return this.ouw.vt() + this.f6815lh.rn + this.vt.vt();
    }
}
