package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Ia {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f39621a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39622b;

    public Ia() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f39621a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f39621a.toString();
    }

    public Ia(boolean z10) {
        this.f39621a = new HashMap();
        this.f39622b = z10;
    }
}
