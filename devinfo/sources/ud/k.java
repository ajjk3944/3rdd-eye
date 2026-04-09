package ud;

import com.google.android.gms.internal.play_billing.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends f {

    /* renamed from: d, reason: collision with root package name */
    public final transient s f35313d;

    /* renamed from: e, reason: collision with root package name */
    public final transient l f35314e;

    public k(s sVar, l lVar) {
        this.f35313d = sVar;
        this.f35314e = lVar;
    }

    @Override // ud.a
    public final int a(Object[] objArr) {
        return this.f35314e.a(objArr);
    }

    @Override // ud.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f35313d.get(obj) != null;
    }

    @Override // ud.f
    public final d g() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ac.h iterator() {
        return this.f35314e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((m) this.f35313d).g;
    }
}
