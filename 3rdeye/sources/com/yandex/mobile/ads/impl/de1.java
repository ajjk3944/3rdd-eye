package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class de1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26149a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<pa2, Object> f26150b = new WeakHashMap<>();

    public final boolean a() {
        boolean z10;
        synchronized (this.f26149a) {
            z10 = !this.f26150b.isEmpty();
        }
        return z10;
    }

    public final void b() {
        ArrayList arrayList;
        synchronized (this.f26149a) {
            arrayList = new ArrayList(this.f26150b.keySet());
            this.f26150b.clear();
            C1992A c1992a = C1992A.f18074a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pa2 pa2Var = (pa2) it.next();
            if (pa2Var != null) {
                pa2Var.a();
            }
        }
    }

    public final void a(pa2 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f26149a) {
            this.f26150b.put(listener, null);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void b(pa2 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f26149a) {
            this.f26150b.remove(listener);
        }
    }
}
