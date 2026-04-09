package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Yb {

    /* renamed from: a, reason: collision with root package name */
    public final C4499b3 f40414a;

    /* renamed from: b, reason: collision with root package name */
    public final C4782m2 f40415b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f40416c;

    public Yb(C4499b3 c4499b3, C4782m2 c4782m2) {
        ArrayList arrayList = new ArrayList();
        this.f40416c = arrayList;
        this.f40414a = c4499b3;
        arrayList.add(c4499b3);
        this.f40415b = c4782m2;
        arrayList.add(c4782m2);
    }

    public final synchronized void a() {
        Iterator it = this.f40416c.iterator();
        while (it.hasNext()) {
            ((InterfaceC4878pk) it.next()).onCreate();
        }
    }

    public final synchronized void a(Fa fa2) {
        this.f40416c.add(fa2);
    }
}
