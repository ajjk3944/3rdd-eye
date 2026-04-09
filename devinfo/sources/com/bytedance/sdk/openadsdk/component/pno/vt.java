package com.bytedance.sdk.openadsdk.component.pno;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.ra;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends com.bytedance.sdk.openadsdk.core.mwh.yu.ouw {
    public vt(Context context, ViewGroup viewGroup, vpp vppVar) {
        super(context, viewGroup, vppVar, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.ouw
    public final void ksc() throws JSONException {
        ko.ouw ouwVar = new ko.ouw();
        ouwVar.ouw(rn());
        ouwVar.vt(th());
        ouwVar.vt = zih();
        ouwVar.ryl = vm();
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.fkw(this.ra, ouwVar);
    }

    public final void ouw(ko.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.ra, ouwVar, (ra) null);
    }
}
