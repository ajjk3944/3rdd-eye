package com.vungle.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: NativeAdOptionsView.kt */
/* loaded from: classes2.dex */
public final class P extends FrameLayout {
    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    public static final a Companion = new a(null);
    private ImageView icon;

    /* compiled from: NativeAdOptionsView.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.icon = new ImageView(context);
        int iDpToPixels = com.vungle.ads.internal.util.s.INSTANCE.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels);
        ImageView imageView = this.icon;
        if (imageView == null) {
            kotlin.jvm.internal.l.l("icon");
            throw null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = this.icon;
        if (imageView2 != null) {
            addView(imageView2);
        } else {
            kotlin.jvm.internal.l.l("icon");
            throw null;
        }
    }

    public final void destroy() {
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            kotlin.jvm.internal.l.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
    }

    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.icon;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.l.l("icon");
        throw null;
    }

    public final void renderTo(FrameLayout rootView, int i) {
        kotlin.jvm.internal.l.f(rootView, "rootView");
        if (getParent() != null) {
            ViewParent parent = getParent();
            kotlin.jvm.internal.l.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        rootView.addView(this);
        com.vungle.ads.internal.util.s sVar = com.vungle.ads.internal.util.s.INSTANCE;
        Context context = getContext();
        kotlin.jvm.internal.l.e(context, "context");
        int iDpToPixels = sVar.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels);
        if (i == 0) {
            layoutParams.gravity = 8388659;
        } else if (i == 1) {
            layoutParams.gravity = 8388661;
        } else if (i == 2) {
            layoutParams.gravity = 8388691;
        } else if (i != 3) {
            layoutParams.gravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        setLayoutParams(layoutParams);
        rootView.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.l.f(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.l.f(context, "context");
        initView(context);
    }
}
