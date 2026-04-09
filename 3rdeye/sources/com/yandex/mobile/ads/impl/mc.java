package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class mc {

    /* renamed from: a, reason: collision with root package name */
    private final Object f30338a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<oc, Object> f30339b = new WeakHashMap<>();

    private final void a(gc gcVar) {
        ArrayList arrayList;
        synchronized (this.f30338a) {
            arrayList = new ArrayList(this.f30339b.keySet());
            this.f30339b.clear();
            C1992A c1992a = C1992A.f18074a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oc ocVar = (oc) it.next();
            if (ocVar != null) {
                ocVar.a(gcVar);
            }
        }
    }

    public final void b(gc advertisingInfoHolder) {
        kotlin.jvm.internal.l.f(advertisingInfoHolder, "advertisingInfoHolder");
        a(advertisingInfoHolder);
    }

    public final void b(oc listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f30338a) {
            this.f30339b.remove(listener);
        }
    }

    public final void a() {
        a((gc) null);
    }

    public final void a(oc listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f30338a) {
            this.f30339b.put(listener, null);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
