package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw fkw;

    /* renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f7993lh;
    public final vpp ouw;
    public final String vt;
    public boolean yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, int i4, int i10, int i11);

        void ouw(String str, JSONObject jSONObject);
    }

    public yu(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.fkw = ouwVar;
        this.ouw = ouwVar.vt;
        this.vt = ouwVar.fkw;
    }
}
