package com.bytedance.adsdk.ugeno.ouw;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {

    /* renamed from: lh, reason: collision with root package name */
    private Context f6910lh;
    public List<ouw> ouw;
    private List<lh> vt;
    private com.bytedance.adsdk.ugeno.vt.lh yu;

    public le(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, List<lh> list) {
        this.yu = lhVar;
        this.f6910lh = context;
        this.vt = list;
        vt();
    }

    private void vt() {
        this.ouw = new ArrayList();
        List<lh> list = this.vt;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < this.vt.size(); i4++) {
            lh lhVar = this.vt.get(i4);
            if (lhVar != null) {
                this.ouw.add(new ouw(this.f6910lh, this.yu, lhVar));
            }
        }
    }

    public final void ouw() {
        List<ouw> list = this.ouw;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ouw ouwVar : this.ouw) {
            if (ouwVar != null) {
                ouwVar.lh();
            }
        }
    }

    public final ouw ouw(String str) {
        List<ouw> list = this.ouw;
        if (list != null && !list.isEmpty()) {
            for (ouw ouwVar : this.ouw) {
                if (ouwVar != null && TextUtils.equals(ouwVar.vt, str)) {
                    return ouwVar;
                }
            }
        }
        return null;
    }
}
