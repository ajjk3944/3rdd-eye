package com.yandex.mobile.ads.impl;

import A9.C0575f;

/* loaded from: classes3.dex */
public final class sx implements qx {

    /* renamed from: a, reason: collision with root package name */
    private final as0 f33310a;

    /* renamed from: b, reason: collision with root package name */
    private final io1 f33311b;

    /* renamed from: c, reason: collision with root package name */
    private final xw f33312c;

    /* renamed from: d, reason: collision with root package name */
    private final A9.A f33313d;

    /* renamed from: e, reason: collision with root package name */
    private mx f33314e;

    /* renamed from: f, reason: collision with root package name */
    private final K9.a f33315f;

    public sx(as0 localDataSource, io1 remoteDataSource, xw dataMerger, A9.A ioDispatcher) {
        kotlin.jvm.internal.l.f(localDataSource, "localDataSource");
        kotlin.jvm.internal.l.f(remoteDataSource, "remoteDataSource");
        kotlin.jvm.internal.l.f(dataMerger, "dataMerger");
        kotlin.jvm.internal.l.f(ioDispatcher, "ioDispatcher");
        this.f33310a = localDataSource;
        this.f33311b = remoteDataSource;
        this.f33312c = dataMerger;
        this.f33313d = ioDispatcher;
        this.f33315f = K9.f.a();
    }

    @Override // com.yandex.mobile.ads.impl.qx
    public final Object a(boolean z10, h9.c cVar) {
        return C0575f.h(this.f33313d, new rx(this, z10, null), cVar);
    }

    @Override // com.yandex.mobile.ads.impl.qx
    public final boolean a() {
        return this.f33310a.a().c().a();
    }

    @Override // com.yandex.mobile.ads.impl.qx
    public final void a(boolean z10) {
        this.f33310a.a(z10);
    }
}
