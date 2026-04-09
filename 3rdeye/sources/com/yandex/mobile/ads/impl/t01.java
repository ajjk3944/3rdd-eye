package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class t01 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f33353a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f33354b = new ArrayList();

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f33353a) {
            arrayList = new ArrayList(this.f33354b);
            this.f33354b.clear();
            C1992A c1992a = C1992A.f18074a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uk0 uk0Var = (uk0) it.next();
            if (uk0Var != null) {
                uk0Var.a();
            }
        }
    }

    public final void a(uk0 initializationObserver) {
        kotlin.jvm.internal.l.f(initializationObserver, "initializationObserver");
        synchronized (this.f33353a) {
            this.f33354b.add(initializationObserver);
        }
    }
}
