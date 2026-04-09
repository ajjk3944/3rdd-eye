package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends Button {
    public pno(Context context) {
        super(context);
        setId(com.bytedance.sdk.openadsdk.utils.rn.f8716gh);
        Context context2 = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, osn.ouw(context2, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context2, "tt_browser_download_selector"));
        setText(vpp.ouw(context2, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
