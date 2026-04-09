package com.bytedance.sdk.component.fkw.fkw;

import com.bytedance.sdk.component.fkw.rn;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh<T> extends ouw {

    /* renamed from: lh, reason: collision with root package name */
    private boolean f7444lh;
    private T ouw;
    private com.bytedance.sdk.component.fkw.le vt;

    public mwh(T t10, com.bytedance.sdk.component.fkw.le leVar, boolean z3) {
        this.ouw = t10;
        this.vt = leVar;
        this.f7444lh = z3;
    }

    private Map<String, String> vt() {
        com.bytedance.sdk.component.fkw.le leVar = this.vt;
        if (leVar != null) {
            return leVar.fkw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
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

    private void vt(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        rn rnVar = lhVar.yu;
        if (rnVar != null) {
            rnVar.ouw(new com.bytedance.sdk.component.fkw.lh.yu().ouw(lhVar, this.ouw, vt(), this.f7444lh));
        }
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "success";
    }
}
