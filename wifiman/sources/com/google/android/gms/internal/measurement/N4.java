package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class N4 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f35075a;

    public N4(Iterator it) {
        this.f35075a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35075a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f35075a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f35075a.remove();
    }
}
