package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4481w implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f35512a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4465u f35513b;

    C4481w(C4465u c4465u) {
        this.f35513b = c4465u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35512a < this.f35513b.f35486a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f35512a >= this.f35513b.f35486a.length()) {
            throw new NoSuchElementException();
        }
        String str = this.f35513b.f35486a;
        int i10 = this.f35512a;
        this.f35512a = i10 + 1;
        return new C4465u(String.valueOf(str.charAt(i10)));
    }
}
