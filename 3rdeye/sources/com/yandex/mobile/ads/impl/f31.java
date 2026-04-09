package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes3.dex */
public final class f31 extends RecyclerView.h<b31> {

    /* renamed from: a, reason: collision with root package name */
    private final List<jj0> f27191a;

    /* renamed from: b, reason: collision with root package name */
    private final c31 f27192b;

    public f31(ej0 imageProvider, List<jj0> imageValues, a8<?> adResponse) {
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f27191a = imageValues;
        this.f27192b = new c31(imageProvider, adResponse);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f27191a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        b31 holderImage = (b31) f10;
        kotlin.jvm.internal.l.f(holderImage, "holderImage");
        holderImage.a(this.f27191a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.l.f(parent, "parent");
        return this.f27192b.a(parent);
    }
}
