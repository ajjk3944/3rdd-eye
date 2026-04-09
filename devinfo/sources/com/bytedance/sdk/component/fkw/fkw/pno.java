package com.bytedance.sdk.component.fkw.fkw;

import com.bytedance.sdk.component.fkw.rn;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends ouw {

    /* renamed from: lh, reason: collision with root package name */
    private String f7445lh;
    private Throwable ouw;
    private int vt;

    public pno(int i4, String str, Throwable th2) {
        this.vt = i4;
        this.f7445lh = str;
        this.ouw = th2;
    }

    private void vt(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        rn rnVar = lhVar.yu;
        if (rnVar != null) {
            rnVar.ouw(this.vt, this.f7445lh, this.ouw);
        }
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        lhVar.ex = new com.bytedance.sdk.component.fkw.lh.ouw(this.vt, this.f7445lh, this.ouw);
        String strRa = lhVar.ra();
        Map<String, List<com.bytedance.sdk.component.fkw.lh.lh>> map = lhVar.jqy.ouw;
        List<com.bytedance.sdk.component.fkw.lh.lh> list = map.get(strRa);
        if (list == null) {
            vt(lhVar);
            return;
        }
        synchronized (list) {
            try {
                Iterator<com.bytedance.sdk.component.fkw.lh.lh> it = list.iterator();
                while (it.hasNext()) {
                    vt(it.next());
                }
                list.clear();
                map.remove(strRa);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "failed";
    }
}
