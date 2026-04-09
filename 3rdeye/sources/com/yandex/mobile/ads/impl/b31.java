package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class b31 extends RecyclerView.F {

    /* renamed from: a, reason: collision with root package name */
    private final jg2<ImageView, jj0> f25077a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b31(ImageView imageView, rj0 imageViewAdapter) {
        super(imageView);
        kotlin.jvm.internal.l.f(imageView, "imageView");
        kotlin.jvm.internal.l.f(imageViewAdapter, "imageViewAdapter");
        this.f25077a = new jg2<>(imageViewAdapter);
    }

    public final void a(jj0 value) {
        kotlin.jvm.internal.l.f(value, "value");
        this.f25077a.b(value);
    }
}
