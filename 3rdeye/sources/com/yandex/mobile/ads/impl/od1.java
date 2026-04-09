package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class od1 implements z31 {

    /* renamed from: a, reason: collision with root package name */
    private final int f31351a;

    public od1(int i) {
        this.f31351a = i;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final View a(View container, String assetName) {
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(assetName, "assetName");
        View viewFindViewWithTag = container.findViewWithTag(assetName + "_" + this.f31351a);
        if (viewFindViewWithTag != null) {
            return viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final CheckBox b(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("mute_button_" + this.f31351a);
        if (viewFindViewWithTag instanceof CheckBox) {
            return (CheckBox) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final CustomizableMediaView c(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("media_" + this.f31351a);
        if (viewFindViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView d(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("price_" + this.f31351a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView e(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("call_to_action_" + this.f31351a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView f(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("warning_" + this.f31351a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final ImageView g(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("favicon_" + this.f31351a);
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView h(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("age_" + this.f31351a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final View i(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("rating_" + this.f31351a);
        if (viewFindViewWithTag != null) {
            return viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView j(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("title_" + this.f31351a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final ProgressBar k(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        return (ProgressBar) container.findViewWithTag("video_progress_" + this.f31351a);
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final ImageView l(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("feedback_" + this.f31351a);
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView m(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("sponsored_" + this.f31351a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView n(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("domain_" + this.f31351a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final ImageView o(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("icon_" + this.f31351a);
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView p(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("review_count_" + this.f31351a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView a(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("body_" + this.f31351a);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }
}
