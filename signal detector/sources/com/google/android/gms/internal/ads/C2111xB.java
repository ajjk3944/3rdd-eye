package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.xB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2111xB implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f17552a;

    /* renamed from: b, reason: collision with root package name */
    public int f17553b;

    /* renamed from: c, reason: collision with root package name */
    public int f17554c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AB f17555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AB f17557f;

    public C2111xB(AB ab, char c6) {
        Objects.requireNonNull(ab);
        this.f17555d = ab;
        this.f17552a = ab.f6951e;
        this.f17553b = ab.isEmpty() ? -1 : 0;
        this.f17554c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17553b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c2219zB;
        AB ab = this.f17555d;
        if (ab.f6951e != this.f17552a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f17553b;
        this.f17554c = i;
        switch (this.f17556e) {
            case 0:
                c2219zB = this.f17557f.b()[i];
                break;
            case 1:
                c2219zB = new C2219zB(this.f17557f, i);
                break;
            default:
                c2219zB = this.f17557f.c()[i];
                break;
        }
        int i3 = this.f17553b + 1;
        if (i3 >= ab.f6952f) {
            i3 = -1;
        }
        this.f17553b = i3;
        return c2219zB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AB ab = this.f17555d;
        if (ab.f6951e != this.f17552a) {
            throw new ConcurrentModificationException();
        }
        AbstractC0582Jp.i0("no calls to next() since the last call to remove()", this.f17554c >= 0);
        this.f17552a += 32;
        ab.remove(ab.b()[this.f17554c]);
        this.f17553b--;
        this.f17554c = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2111xB(AB ab, int i) {
        this(ab, (char) 0);
        this.f17556e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(ab);
                this.f17557f = ab;
                this(ab, (char) 0);
                break;
            case 2:
                Objects.requireNonNull(ab);
                this.f17557f = ab;
                this(ab, (char) 0);
                break;
            default:
                Objects.requireNonNull(ab);
                this.f17557f = ab;
                break;
        }
    }
}
