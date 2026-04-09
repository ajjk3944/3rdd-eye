package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class c31 {

    /* renamed from: a, reason: collision with root package name */
    private final ej0 f25521a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f25522b;

    public static final class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewParent parent = view != null ? view.getParent() : null;
            ViewParent parent2 = parent != null ? parent.getParent() : null;
            Q1.f fVar = parent2 instanceof Q1.f ? (Q1.f) parent2 : null;
            if (fVar != null) {
                fVar.callOnClick();
            }
        }
    }

    public c31(ej0 imageProvider, a8<?> adResponse) {
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f25521a = imageProvider;
        this.f25522b = adResponse;
    }

    public final b31 a(ViewGroup parent) {
        kotlin.jvm.internal.l.f(parent, "parent");
        Context context = parent.getContext();
        kotlin.jvm.internal.l.c(context);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new a());
        return new b31(imageView, new rj0(imageView, this.f25521a, this.f25522b));
    }
}
