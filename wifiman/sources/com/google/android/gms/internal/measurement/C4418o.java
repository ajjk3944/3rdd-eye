package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4418o implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f35407a;

    C4418o(Iterator it) {
        this.f35407a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35407a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C4465u((String) this.f35407a.next());
    }
}
