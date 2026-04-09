package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f4924a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterator f4925d;

    public c(d dVar, Iterator it, Iterator it2) {
        this.f4924a = it;
        this.f4925d = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4924a.hasNext()) {
            return true;
        }
        return this.f4925d.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f4924a;
        if (it.hasNext()) {
            return new q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f4925d;
        if (it2.hasNext()) {
            return new q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
