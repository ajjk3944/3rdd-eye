package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4342f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f35217a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Iterator f35218b;

    C4342f(C4351g c4351g, Iterator it, Iterator it2) {
        this.f35217a = it;
        this.f35218b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f35217a.hasNext()) {
            return true;
        }
        return this.f35218b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f35217a.hasNext()) {
            return new C4465u(((Integer) this.f35217a.next()).toString());
        }
        if (this.f35218b.hasNext()) {
            return new C4465u((String) this.f35218b.next());
        }
        throw new NoSuchElementException();
    }
}
