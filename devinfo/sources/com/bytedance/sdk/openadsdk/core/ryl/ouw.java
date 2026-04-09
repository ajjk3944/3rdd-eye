package com.bytedance.sdk.openadsdk.core.ryl;

import android.text.TextUtils;
import java.util.Set;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public int bly;
    public String fkw;

    /* renamed from: le, reason: collision with root package name */
    public String f8410le;

    /* renamed from: lh, reason: collision with root package name */
    public lh f8411lh;
    public double pno;
    public String ra;
    public String ryl;
    public int tlj;
    public vt vt;
    public String yu;
    public final com.bytedance.sdk.openadsdk.core.model.yu ouw = new com.bytedance.sdk.openadsdk.core.model.yu();

    /* renamed from: cf, reason: collision with root package name */
    public String f8409cf = "VAST_ACTION_BUTTON";

    public final void ouw(vt vtVar) {
        if (vtVar != null) {
            vtVar.bly = this.ra;
        }
        this.vt = vtVar;
    }

    public final JSONArray vt() {
        Set<tlj> set = this.ouw.vt;
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (tlj tljVar : set) {
            if (tljVar != null) {
                jSONArray.put(tljVar.ouw());
            }
        }
        return jSONArray;
    }

    public final void ouw(lh lhVar) {
        if (lhVar != null) {
            lhVar.bly = this.ra;
        }
        this.f8411lh = lhVar;
    }

    public final String ouw() {
        lh lhVar;
        String str = this.f8410le;
        if (!TextUtils.isEmpty(this.ryl)) {
            String str2 = this.ryl;
            this.ryl = null;
            return str2;
        }
        String str3 = this.f8409cf;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            vt vtVar = this.vt;
            if (vtVar != null && !TextUtils.isEmpty(vtVar.pno)) {
                str = this.vt.pno;
            }
        } else if (str3.equals("VAST_END_CARD") && (lhVar = this.f8411lh) != null && !TextUtils.isEmpty(lhVar.pno)) {
            str = this.f8411lh.pno;
        }
        this.f8409cf = "VAST_ACTION_BUTTON";
        return str;
    }

    public final void ouw(Set<tlj> set) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVar = this.ouw;
        if (set == null || set.isEmpty()) {
            return;
        }
        yuVar.vt.addAll(set);
    }
}
