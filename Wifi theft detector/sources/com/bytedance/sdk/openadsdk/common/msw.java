package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class msw extends Button {
    public msw(Context context) {
        super(context);
        emc();
    }

    private void emc() {
        setId(com.bytedance.sdk.openadsdk.utils.vk.ej);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, vw.ypw(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_browser_download_selector"));
        setText(rie.emc(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
