package ud;

import java.util.Iterator;
import java.util.ListIterator;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f35295c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f35296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f35297e;

    public c(d dVar, int i4, int i10) {
        this.f35297e = dVar;
        this.f35295c = i4;
        this.f35296d = i10;
    }

    @Override // ud.a
    public final Object[] c() {
        return this.f35297e.c();
    }

    @Override // ud.a
    public final int d() {
        return this.f35297e.f() + this.f35295c + this.f35296d;
    }

    @Override // ud.a
    public final int f() {
        return this.f35297e.f() + this.f35295c;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        t.e(i4, this.f35296d);
        return this.f35297e.get(i4 + this.f35295c);
    }

    @Override // ud.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // ud.d, java.util.List
    /* renamed from: j */
    public final d subList(int i4, int i10) {
        t.g(i4, i10, this.f35296d);
        int i11 = this.f35295c;
        return this.f35297e.subList(i4 + i11, i10 + i11);
    }

    @Override // ud.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35296d;
    }

    @Override // ud.d, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i4) {
        return listIterator(i4);
    }
}
