package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.openadsdk.activity.vt;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class lh {
    protected String fkw;

    /* renamed from: lh, reason: collision with root package name */
    protected String f7758lh;
    protected final Activity ouw;
    protected final vpp vt;
    protected final vt yu;

    public lh(Activity activity, vpp vppVar, vt vtVar) {
        this.ouw = activity;
        this.vt = vppVar;
        if (vppVar != null) {
            od odVarOuw = od.ouw(vppVar);
            this.f7758lh = odVarOuw == null ? null : odVarOuw.zih;
        }
        if (activity != null) {
            this.fkw = String.valueOf(activity.hashCode());
        }
        this.yu = vtVar;
    }

    public pno cf() {
        return null;
    }

    public boolean fkw() {
        return true;
    }

    public fkw jg() {
        return null;
    }

    public abstract List<vpp> ko();

    public pno mwh() {
        return null;
    }

    public void ouw() {
    }

    public abstract void ouw(int i4);

    public abstract boolean ouw(pno pnoVar, int i4);

    public abstract int pno();

    public abstract com.bytedance.sdk.openadsdk.component.reward.top.lh ryl();

    public abstract void th();

    public abstract int tlj();

    public abstract void vm();

    public void vt() {
    }

    public abstract void vt(pno pnoVar, int i4);

    public boolean yu() {
        return false;
    }

    public void ouw(float f10) {
    }

    public void vt(Activity activity) {
    }

    public void ouw(int i4, int i10) {
    }

    public void ouw(Activity activity) {
    }

    public void ouw(Bundle bundle) {
    }

    public void ouw(View view) {
    }

    public void ouw(View view, boolean z3) {
    }

    public void ouw(ouw ouwVar, boolean z3) {
    }

    public void ouw(pno pnoVar) {
    }

    public void ouw(pno pnoVar, pno pnoVar2, vt.fkw fkwVar) {
    }

    public void ouw(pno pnoVar, vt.fkw fkwVar) {
    }

    public void ouw(pno pnoVar, boolean z3) {
    }

    public void ouw(pno pnoVar, boolean z3, boolean z10, boolean z11, int i4) {
    }

    public void ouw(Map<String, Object> map, pno pnoVar) {
    }

    public void ouw(boolean z3) {
    }

    public void bly() {
    }

    public void le() {
    }

    public void lh() {
    }

    public void ra() {
    }

    public void rn() {
    }

    public void zih() {
    }
}
