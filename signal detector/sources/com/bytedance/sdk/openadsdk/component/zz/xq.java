package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.aa;
import com.bytedance.sdk.openadsdk.core.widget.vk;

/* loaded from: classes.dex */
public abstract class xq extends com.bytedance.sdk.openadsdk.core.ycc.uym {
    com.bytedance.sdk.openadsdk.core.ycc.msw bw;
    PAGLogoView dg;
    com.bytedance.sdk.openadsdk.core.ycc.dg emc;
    com.bytedance.sdk.openadsdk.core.ycc.msw gbl;
    final uym msw;
    com.bytedance.sdk.openadsdk.core.ycc.msw ru;
    com.bytedance.sdk.openadsdk.core.widget.xq sup;
    com.bytedance.sdk.openadsdk.core.ycc.msw uym;
    com.bytedance.sdk.openadsdk.core.ycc.dg xq;
    aa ycc;
    com.bytedance.sdk.openadsdk.core.ycc.xq ypw;
    aa zz;

    public xq(Context context) {
        super(context);
        this.msw = new uym(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.ycc.dg getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.dg;
    }

    public abstract com.bytedance.sdk.openadsdk.core.ycc.msw getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.ycc.dg getBackImage() {
        return this.emc;
    }

    public com.bytedance.sdk.openadsdk.core.ycc.msw getClickButton() {
        return this.bw;
    }

    public com.bytedance.sdk.openadsdk.core.ycc.msw getContent() {
        return this.gbl;
    }

    public com.bytedance.sdk.openadsdk.core.widget.xq getDspAdChoice() {
        return this.sup;
    }

    public aa getHostAppIcon() {
        return this.ycc;
    }

    public com.bytedance.sdk.openadsdk.core.ycc.msw getHostAppName() {
        return this.uym;
    }

    public aa getIconOnlyView() {
        return this.zz;
    }

    public com.bytedance.sdk.openadsdk.core.ycc.dg getImageView() {
        return this.xq;
    }

    public com.bytedance.sdk.openadsdk.core.ycc.bw getOverlayLayout() {
        return null;
    }

    public abstract vk getScoreBar();

    public com.bytedance.sdk.openadsdk.core.ycc.msw getTitle() {
        return this.ru;
    }

    public com.bytedance.sdk.openadsdk.core.ycc.msw getTopCountDown() {
        uym uymVar = this.msw;
        if (uymVar != null) {
            return uymVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        uym uymVar = this.msw;
        if (uymVar != null) {
            return uymVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.ycc.dg getTopSkip() {
        uym uymVar = this.msw;
        if (uymVar != null) {
            return uymVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.ycc.xq getVideoContainer() {
        return this.ypw;
    }
}
