package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class yw0 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f36084a;

    /* renamed from: b, reason: collision with root package name */
    private final ij0 f36085b;

    public /* synthetic */ yw0(a8 a8Var) {
        this(a8Var, new ij0());
    }

    public final ov1 a(CustomizableMediaView mediaView, ej0 imageProvider, cx0 mediaViewRenderController) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        ImageView imageView = new ImageView(mediaView.getContext());
        this.f36085b.getClass();
        Context context = mediaView.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        if (!s80.a(context, r80.f32551e)) {
            mediaView.removeAllViews();
        }
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        rj0 rj0Var = new rj0(imageView, imageProvider, this.f36084a);
        return new ov1(mediaView, rj0Var, mediaViewRenderController, new jg2(rj0Var));
    }

    public yw0(a8<?> adResponse, ij0 imageSubViewBinder) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(imageSubViewBinder, "imageSubViewBinder");
        this.f36084a = adResponse;
        this.f36085b = imageSubViewBinder;
    }
}
