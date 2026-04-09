package com.bytedance.sdk.openadsdk.xq;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class gbl extends View {
    private final int emc;

    public gbl(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        setMeasuredDimension(getMeasuredWidth(), this.emc);
    }

    public gbl(Context context, int i) {
        super(context);
        setBackgroundColor(i);
        this.emc = vw.ypw(getContext(), 0.66f);
    }
}
