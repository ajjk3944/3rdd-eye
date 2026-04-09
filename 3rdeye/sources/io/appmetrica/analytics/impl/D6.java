package io.appmetrica.analytics.impl;

import c9.C2095p;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class D6 implements Ya {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f39288a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ya
    public final void a(Throwable th, U u8) {
        Iterator it = this.f39288a.iterator();
        while (it.hasNext()) {
            ((Ya) it.next()).a(th, u8);
        }
    }

    public final void a(Ya... yaArr) {
        C2095p.c0(this.f39288a, yaArr);
    }

    public final void a(List<? extends Ya> list) {
        this.f39288a.addAll(list);
    }

    public final void a() {
        this.f39288a.clear();
    }
}
