package com.bytedance.sdk.openadsdk.core.gbl.ypw.ycc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class emc extends com.bytedance.adsdk.ugeno.zz.ypw.emc {
    private final com.bytedance.adsdk.ugeno.zz.ypw.emc emc;
    private final com.bytedance.adsdk.ugeno.zz.ypw.emc ypw;

    public emc(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.zz.ypw.emc emcVar = new com.bytedance.adsdk.ugeno.zz.ypw.emc(context);
        this.emc = emcVar;
        addView(emcVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.zz.ypw.emc emcVar2 = new com.bytedance.adsdk.ugeno.zz.ypw.emc(context);
        this.ypw = emcVar2;
        emcVar2.setBackgroundColor(0);
        addView(emcVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.zz.ypw.emc getMarkView() {
        return this.ypw;
    }

    public com.bytedance.adsdk.ugeno.zz.ypw.emc getVideoView() {
        return this.emc;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.ypw.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.ypw.setOnTouchListener(onTouchListener);
    }
}
