package com.bytedance.sdk.openadsdk.component.bly;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.zih;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class lh extends com.bytedance.sdk.openadsdk.core.le.ra {
    zih bly;

    /* renamed from: cf, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.le.pno f7862cf;
    com.bytedance.sdk.openadsdk.core.le.pno fkw;

    /* renamed from: le, reason: collision with root package name */
    zih f7863le;

    /* renamed from: lh, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.le.yu f7864lh;
    com.bytedance.sdk.openadsdk.core.le.yu ouw;
    final ra pno;
    com.bytedance.sdk.openadsdk.core.le.pno ra;
    com.bytedance.sdk.openadsdk.core.widget.lh ryl;
    com.bytedance.sdk.openadsdk.core.le.pno tlj;
    com.bytedance.sdk.openadsdk.core.le.lh vt;
    PAGLogoView yu;

    public lh(Context context) {
        super(context);
        this.pno = new ra(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.le.yu getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.yu;
    }

    public abstract com.bytedance.sdk.openadsdk.core.le.pno getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.le.yu getBackImage() {
        return this.ouw;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getClickButton() {
        return this.fkw;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getContent() {
        return this.f7862cf;
    }

    public com.bytedance.sdk.openadsdk.core.widget.lh getDspAdChoice() {
        return this.ryl;
    }

    public zih getHostAppIcon() {
        return this.f7863le;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getHostAppName() {
        return this.ra;
    }

    public zih getIconOnlyView() {
        return this.bly;
    }

    public com.bytedance.sdk.openadsdk.core.le.yu getImageView() {
        return this.f7864lh;
    }

    public com.bytedance.sdk.openadsdk.core.le.fkw getOverlayLayout() {
        return null;
    }

    public abstract rn getScoreBar();

    public com.bytedance.sdk.openadsdk.core.le.pno getTitle() {
        return this.tlj;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getTopCountDown() {
        ra raVar = this.pno;
        if (raVar != null) {
            return raVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        ra raVar = this.pno;
        if (raVar != null) {
            return raVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.le.yu getTopSkip() {
        ra raVar = this.pno;
        if (raVar != null) {
            return raVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.le.lh getVideoContainer() {
        return this.vt;
    }
}
