package com.yandex.mobile.ads.impl;

import A9.C0583j;
import A9.InterfaceC0581i;
import com.yandex.mobile.ads.impl.md2;
import java.util.List;

/* loaded from: classes3.dex */
public final class nd2 implements xp1<List<? extends za2>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC0581i<md2> f30847a;

    public nd2(C0583j c0583j) {
        this.f30847a = c0583j;
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(fb2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        error.a();
        fp0.b(new Object[0]);
        if (this.f30847a.isActive()) {
            this.f30847a.resumeWith(new md2.a(error));
        }
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(List<? extends za2> list) {
        List<? extends za2> result = list;
        kotlin.jvm.internal.l.f(result, "result");
        if (this.f30847a.isActive()) {
            this.f30847a.resumeWith(new md2.b(result));
        }
    }
}
