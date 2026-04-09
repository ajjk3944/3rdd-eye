package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ve {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34518a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f34519b = new ArrayList();

    public final void a(ue appMetricaIdentifiers) {
        ArrayList arrayList;
        kotlin.jvm.internal.l.f(appMetricaIdentifiers, "appMetricaIdentifiers");
        synchronized (this.f34518a) {
            arrayList = new ArrayList(this.f34519b);
            this.f34519b.clear();
            C1992A c1992a = C1992A.f18074a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((li0) it.next()).a(appMetricaIdentifiers);
        }
    }

    public final void a() {
        synchronized (this.f34518a) {
            this.f34519b.clear();
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void a(li0 observer) {
        kotlin.jvm.internal.l.f(observer, "observer");
        synchronized (this.f34518a) {
            this.f34519b.add(observer);
        }
    }
}
