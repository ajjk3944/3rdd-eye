package com.bytedance.adsdk.vt.ouw.ouw;

import com.bytedance.adsdk.vt.lh.vt.th;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zin implements lh, ouw.InterfaceC0040ouw {
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> fkw;

    /* renamed from: le, reason: collision with root package name */
    private final String f7175le;

    /* renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f7176lh;
    public final boolean ouw;
    private final List<ouw.InterfaceC0040ouw> ra = new ArrayList();
    final th.ouw vt;
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> yu;

    public zin(com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.th thVar) {
        this.f7175le = thVar.ouw;
        this.ouw = thVar.f7123le;
        this.vt = thVar.vt;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = thVar.f7124lh.ouw();
        this.f7176lh = ouwVarOuw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw2 = thVar.yu.ouw();
        this.yu = ouwVarOuw2;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = thVar.fkw.ouw();
        this.fkw = ouwVarOuw3;
        ouwVar.ouw(ouwVarOuw);
        ouwVar.ouw(ouwVarOuw2);
        ouwVar.ouw(ouwVarOuw3);
        ouwVarOuw.ouw(this);
        ouwVarOuw2.ouw(this);
        ouwVarOuw3.ouw(this);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        for (int i4 = 0; i4 < this.ra.size(); i4++) {
            this.ra.get(i4).ouw();
        }
    }

    public final void ouw(ouw.InterfaceC0040ouw interfaceC0040ouw) {
        this.ra.add(interfaceC0040ouw);
    }
}
