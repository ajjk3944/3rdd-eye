package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc extends sra {
    private ul emc;

    public ycc(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        emc(context, i10, i11, i12, jSONObject);
    }

    private void emc(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        ul ulVar = new ul(context, com.bytedance.sdk.component.adexpress.xq.emc.xq(context), i10, i11, i12, jSONObject);
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
