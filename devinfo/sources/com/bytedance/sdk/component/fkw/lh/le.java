package com.bytedance.sdk.component.fkw.lh;

import android.content.Context;
import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.ryl;
import com.bytedance.sdk.component.fkw.vm;
import com.bytedance.sdk.component.fkw.zih;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {
    public com.bytedance.sdk.component.fkw.yu fkw;

    /* renamed from: le, reason: collision with root package name */
    public ryl f7450le;
    private ExecutorService pno;
    public final mwh vt;
    public Map<String, List<lh>> ouw = new ConcurrentHashMap();

    /* renamed from: lh, reason: collision with root package name */
    public Map<String, zih> f7451lh = new HashMap();
    Map<String, vm> yu = new HashMap();
    private Map<String, com.bytedance.sdk.component.fkw.lh> ra = new HashMap();

    public le(Context context, mwh mwhVar) {
        this.vt = mwhVar;
        com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw(context, mwhVar.pno());
    }

    private com.bytedance.sdk.component.fkw.lh lh(com.bytedance.sdk.component.fkw.vt vtVar) {
        com.bytedance.sdk.component.fkw.lh lhVarRa = this.vt.ra();
        return lhVarRa != null ? lhVarRa : new com.bytedance.sdk.component.fkw.lh.ouw.ouw.vt(vtVar.pno(), vtVar.ouw(), vt());
    }

    public final Collection<com.bytedance.sdk.component.fkw.lh> ouw() {
        return this.ra.values();
    }

    public final com.bytedance.sdk.component.fkw.lh vt(com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar == null) {
            vtVar = com.bytedance.sdk.component.fkw.lh.ouw.ouw.bly();
        }
        String string = vtVar.pno().toString();
        com.bytedance.sdk.component.fkw.lh lhVar = this.ra.get(string);
        if (lhVar != null) {
            return lhVar;
        }
        com.bytedance.sdk.component.fkw.lh lhVarLh = lh(vtVar);
        this.ra.put(string, lhVarLh);
        return lhVarLh;
    }

    public final vm ouw(com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar == null) {
            vtVar = com.bytedance.sdk.component.fkw.lh.ouw.ouw.bly();
        }
        String string = vtVar.pno().toString();
        vm vmVarLe = this.yu.get(string);
        if (vmVarLe == null) {
            vmVarLe = this.vt.le();
            if (vmVarLe == null) {
                vmVarLe = new com.bytedance.sdk.component.fkw.lh.ouw.vt.vt(vtVar.vt());
            }
            this.yu.put(string, vmVarLe);
        }
        return vmVarLe;
    }

    private ExecutorService lh() {
        ExecutorService executorServiceVt = this.vt.vt();
        return executorServiceVt != null ? executorServiceVt : com.bytedance.sdk.component.fkw.ouw.lh.ouw();
    }

    public final ExecutorService vt() {
        ExecutorService executorServiceOuw;
        qbp qbpVarLh = this.vt.lh();
        if (qbpVarLh != null && (executorServiceOuw = qbpVarLh.ouw()) != null) {
            return executorServiceOuw;
        }
        if (this.pno == null) {
            this.pno = lh();
        }
        return this.pno;
    }
}
