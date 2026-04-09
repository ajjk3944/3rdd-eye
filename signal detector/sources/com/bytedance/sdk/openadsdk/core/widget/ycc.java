package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class ycc extends com.bytedance.sdk.openadsdk.core.ycc.dg {
    private float emc;
    private int ypw;

    public ycc(Context context) {
        super(context);
        this.emc = 2.25f;
        this.ypw = 12;
        emc();
    }

    private void emc() {
        setBackground(dg.emc());
        setImageResource(rie.dg(getContext(), "tt_close_btn"));
        int iYpw = vw.ypw(getContext(), this.emc);
        setPadding(iYpw, iYpw, iYpw, iYpw);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static com.bytedance.sdk.openadsdk.core.ycc.dg ypw(Context context) {
        return new ycc(context, 28, 5.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ycc.dg, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iYpw = vw.ypw(getContext(), this.ypw);
            layoutParams.width = iYpw;
            layoutParams.height = iYpw;
        }
        super.setLayoutParams(layoutParams);
    }

    public ycc(Context context, int i, float f2) {
        super(context);
        this.emc = f2;
        this.ypw = i;
        emc();
    }

    public static com.bytedance.sdk.openadsdk.core.ycc.dg emc(Context context) {
        return new ycc(context);
    }
}
