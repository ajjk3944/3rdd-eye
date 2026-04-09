package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class rp1 extends sp1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qw0 f32738a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f32739b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ byte[] f32740c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f32741d;

    public rp1(qw0 qw0Var, byte[] bArr, int i, int i10) {
        this.f32738a = qw0Var;
        this.f32739b = i;
        this.f32740c = bArr;
        this.f32741d = i10;
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    public final long a() {
        return this.f32739b;
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    public final qw0 b() {
        return this.f32738a;
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    public final void a(ia.f sink) throws IOException {
        kotlin.jvm.internal.l.f(sink, "sink");
        sink.A0(this.f32741d, this.f32739b, this.f32740c);
    }
}
