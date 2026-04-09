package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class b41 implements z31 {
    @Override // com.yandex.mobile.ads.impl.z31
    public final View a(View container, String assetName) {
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(assetName, "assetName");
        View viewFindViewWithTag = container.findViewWithTag(assetName);
        if (viewFindViewWithTag != null) {
            return viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final CheckBox b(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("mute_button");
        if (viewFindViewWithTag instanceof CheckBox) {
            return (CheckBox) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final CustomizableMediaView c(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("media");
        if (viewFindViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView d(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("price");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView e(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("call_to_action");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView f(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("warning");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final ImageView g(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("favicon");
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView h(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("age");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final View i(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("rating");
        if (viewFindViewWithTag != null) {
            return viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView j(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag(AppIntroBaseFragmentKt.ARG_TITLE);
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final ProgressBar k(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("video_progress");
        if (viewFindViewWithTag instanceof ProgressBar) {
            return (ProgressBar) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final ImageView l(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("feedback");
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView m(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("sponsored");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView n(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("domain");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final ImageView o(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("icon");
        if (viewFindViewWithTag instanceof ImageView) {
            return (ImageView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView p(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("review_count");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z31
    public final TextView a(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("body");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }
}
