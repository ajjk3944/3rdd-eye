package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class ne2 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f30851a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f30852b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne2(Context context, ProgressBar progressBar, ImageView imageView) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(progressBar, "progressBar");
        this.f30851a = progressBar;
        this.f30852b = imageView;
    }

    public final ImageView a() {
        return this.f30852b;
    }

    public final ProgressBar b() {
        return this.f30851a;
    }
}
