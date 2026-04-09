package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
final class r51 extends kotlin.jvm.internal.m implements InterfaceC5480a<Bitmap> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ej0 f32481b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ jj0 f32482c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r51(ej0 ej0Var, jj0 jj0Var) {
        super(0);
        this.f32481b = ej0Var;
        this.f32482c = jj0Var;
    }

    @Override // p9.InterfaceC5480a
    public final Bitmap invoke() {
        return this.f32481b.b(this.f32482c);
    }
}
