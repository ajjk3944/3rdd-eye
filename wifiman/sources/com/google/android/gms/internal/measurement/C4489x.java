package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4489x implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f35522a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4465u f35523b;

    C4489x(C4465u c4465u) {
        this.f35523b = c4465u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35522a < this.f35523b.f35486a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f35522a >= this.f35523b.f35486a.length()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f35522a;
        this.f35522a = i10 + 1;
        return new C4465u(String.valueOf(i10));
    }
}
