package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class qbp extends th {
    private TextView ouw;

    public qbp(Context context, View view, int i4, int i10, int i11, JSONObject jSONObject) {
        super(context, view, i4, i10, i11, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.th
    public final void ouw(View view) {
        addView(view);
        this.ouw = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.th
    public void setShakeText(String str) {
        if (this.ouw == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.ouw.setText(str);
            return;
        }
        try {
            this.ouw.setText(com.bytedance.sdk.component.utils.vpp.vt(this.ouw.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.ko.fkw("shakeClickView", e2.getMessage());
        }
    }
}
