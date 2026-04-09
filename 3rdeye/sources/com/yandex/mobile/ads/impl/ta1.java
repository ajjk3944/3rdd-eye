package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class ta1 implements za1 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<za1> f33512a = new CopyOnWriteArrayList<>();

    public final void a(za1 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f33512a.add(listener);
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void b() {
        Iterator<za1> it = this.f33512a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void a(long j4, long j10) {
        Iterator<za1> it = this.f33512a.iterator();
        while (it.hasNext()) {
            it.next().a(j4, j10);
        }
    }

    public final void b(za1 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f33512a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void a() {
        Iterator<za1> it = this.f33512a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
