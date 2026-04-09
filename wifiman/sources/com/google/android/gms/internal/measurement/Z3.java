package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class Z3 extends AbstractC4311b4 {

    /* renamed from: a, reason: collision with root package name */
    private int f35169a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f35170b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ V3 f35171c;

    Z3(V3 v32) {
        this.f35171c = v32;
        this.f35170b = v32.S();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35169a < this.f35170b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4320c4
    public final byte zza() {
        int i10 = this.f35169a;
        if (i10 >= this.f35170b) {
            throw new NoSuchElementException();
        }
        this.f35169a = i10 + 1;
        return this.f35171c.J(i10);
    }
}
