package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ul extends yzg {
    private TextView emc;

    public ul(Context context, View view, int i, int i3, int i6, JSONObject jSONObject) {
        super(context, view, i, i3, i6, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.ycc.yzg
    public void emc(Context context, View view) {
        addView(view);
        this.emc = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.ycc.yzg
    public void setShakeText(String str) {
        if (this.emc == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.emc.setText(str);
            return;
        }
        try {
            this.emc.setText(com.bytedance.sdk.component.utils.rie.ypw(this.emc.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e6) {
            e6.getMessage();
        }
    }
}
