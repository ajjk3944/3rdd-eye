package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.yandex.mobile.ads.impl.kk;

/* loaded from: classes3.dex */
public final class al0 implements kk.a<mx> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p9.l<mx, C1992A> f24718a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p9.l<fi2, C1992A> f24719b;

    /* JADX WARN: Multi-variable type inference failed */
    public al0(p9.l<? super mx, C1992A> lVar, p9.l<? super fi2, C1992A> lVar2) {
        this.f24718a = lVar;
        this.f24719b = lVar2;
    }

    @Override // com.yandex.mobile.ads.impl.rq1.a
    public final void a(fi2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f24719b.invoke(error);
    }

    @Override // com.yandex.mobile.ads.impl.rq1.b
    public final void a(Object obj) {
        mx response = (mx) obj;
        kotlin.jvm.internal.l.f(response, "response");
        this.f24718a.invoke(response);
    }
}
