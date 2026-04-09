package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends com.bytedance.sdk.openadsdk.core.le.yu {
    private float ouw;
    private int vt;

    private le(Context context) {
        super(context);
        this.ouw = 2.25f;
        this.vt = 12;
        ouw();
    }

    private void ouw() {
        setBackground(yu.ouw());
        setImageResource(vpp.yu(getContext(), "tt_close_btn"));
        int iOuw = osn.ouw(getContext(), this.ouw);
        setPadding(iOuw, iOuw, iOuw, iOuw);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static com.bytedance.sdk.openadsdk.core.le.yu vt(Context context) {
        return new le(context, (byte) 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.yu, android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iOuw = osn.ouw(getContext(), this.vt);
            layoutParams.width = iOuw;
            layoutParams.height = iOuw;
        }
        super.setLayoutParams(layoutParams);
    }

    private le(Context context, byte b10) {
        super(context);
        this.ouw = 5.0f;
        this.vt = 28;
        ouw();
    }

    public static com.bytedance.sdk.openadsdk.core.le.yu ouw(Context context) {
        return new le(context);
    }
}
