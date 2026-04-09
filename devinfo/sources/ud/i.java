package ud;

import j$.util.Objects;
import java.util.AbstractMap;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f35309c;

    public i(j jVar) {
        this.f35309c = jVar;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        j jVar = this.f35309c;
        t.e(i4, jVar.f35312f);
        Object[] objArr = jVar.f35311e;
        int i10 = i4 * 2;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35309c.f35312f;
    }
}
