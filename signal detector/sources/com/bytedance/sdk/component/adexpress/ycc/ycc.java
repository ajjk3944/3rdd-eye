package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc extends sra {
    private ul emc;

    public ycc(Context context, int i, int i3, int i6, JSONObject jSONObject) {
        super(context);
        emc(context, i, i3, i6, jSONObject);
    }

    private void emc(Context context, int i, int i3, int i6, JSONObject jSONObject) {
        ul ulVar = new ul(context, com.bytedance.sdk.component.adexpress.xq.emc.xq(context), i, i3, i6, jSONObject);
        this.emc = ulVar;
        addView(ulVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.emc.setLayoutParams(layoutParams);
    }

    public ul getShakeView() {
        return this.emc;
    }

    public void setShakeText(String str) {
        if (this.emc == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.emc.setShakeText("");
        } else {
            this.emc.setShakeText(str);
        }
    }
}
