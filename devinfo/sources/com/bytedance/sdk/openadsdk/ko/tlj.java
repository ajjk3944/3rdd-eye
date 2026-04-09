package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.zih;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class tlj extends com.bytedance.sdk.openadsdk.core.le.lh {
    protected com.bytedance.sdk.openadsdk.core.le.pno fkw;

    /* renamed from: le, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.le.pno f8559le;

    /* renamed from: lh, reason: collision with root package name */
    protected zih f8560lh;
    protected com.bytedance.sdk.openadsdk.core.le.lh ouw;
    protected com.bytedance.sdk.openadsdk.core.le.yu vt;
    protected com.bytedance.sdk.openadsdk.core.le.pno yu;

    public tlj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ouw(context);
    }

    public static com.bytedance.sdk.openadsdk.core.le.lh fkw(Context context) {
        return new com.bytedance.sdk.openadsdk.core.le.lh(context);
    }

    public static com.bytedance.sdk.openadsdk.core.le.yu le(Context context) {
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return yuVar;
    }

    public static PAGLogoView pno(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    public static zih ra(Context context) {
        zih zihVar = new zih(context);
        zihVar.setScaleType(ImageView.ScaleType.FIT_XY);
        zihVar.setBackgroundColor(0);
        return zihVar;
    }

    public FrameLayout getTtAdContainer() {
        return this.ouw;
    }

    public TextView getTtFullAdAppName() {
        return this.yu;
    }

    public TextView getTtFullAdDesc() {
        return this.fkw;
    }

    public TextView getTtFullAdDownload() {
        return this.f8559le;
    }

    public zih getTtFullAdIcon() {
        return this.f8560lh;
    }

    public ImageView getTtFullImg() {
        return this.vt;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno lh(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar.setMaxLines(1);
        pnoVar.setSingleLine();
        pnoVar.setTextColor(Color.parseColor("#FF999999"));
        pnoVar.setTextSize(2, 12.0f);
        return pnoVar;
    }

    public abstract void ouw(Context context);

    public com.bytedance.sdk.openadsdk.core.le.pno vt(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar.setMaxLines(1);
        pnoVar.setTextColor(Color.parseColor("#FF999999"));
        pnoVar.setTextSize(2, 16.0f);
        return pnoVar;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno yu(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_backup_btn_1"));
        pnoVar.setGravity(17);
        pnoVar.setText(vpp.ouw(context, "tt_video_download_apk"));
        pnoVar.setTextColor(-1);
        pnoVar.setTextSize(2, 14.0f);
        return pnoVar;
    }
}
