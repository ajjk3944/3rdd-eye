package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class yb1 implements te1, i11 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<zb1> f35696a = new CopyOnWriteArrayList<>();

    public final void a(zb1 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f35696a.add(listener);
    }

    public final void b(zb1 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f35696a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.i11
    public final void a() {
        Iterator<zb1> it = this.f35696a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.te1
    public final void a(boolean z10) {
        Iterator<zb1> it = this.f35696a.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.te1
    public final void c() {
    }
}
