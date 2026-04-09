package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f5065a;

    public i(Iterator it) {
        this.f5065a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5065a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new q((String) this.f5065a.next());
    }
}
