package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class j81 implements n51 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f29017a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f29018b;

    public final void a(i81 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f29017a.add(listener);
        if (this.f29018b) {
            listener.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.n51
    public final void b() {
        this.f29018b = true;
        Iterator it = this.f29017a.iterator();
        while (it.hasNext()) {
            ((n51) it.next()).b();
        }
    }

    public final void b(i81 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f29017a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.n51
    public final void a() {
        this.f29018b = false;
        Iterator it = this.f29017a.iterator();
        while (it.hasNext()) {
            ((n51) it.next()).a();
        }
    }
}
