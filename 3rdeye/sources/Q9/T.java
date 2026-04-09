package Q9;

import g0.C4356c;

/* compiled from: Tuples.kt */
/* loaded from: classes3.dex */
public abstract class T<K, V, R> implements M9.b<R> {

    /* renamed from: a, reason: collision with root package name */
    public final M9.b<K> f11456a;

    /* renamed from: b, reason: collision with root package name */
    public final M9.b<V> f11457b;

    public T(M9.b bVar, M9.b bVar2) {
        this.f11456a = bVar;
        this.f11457b = bVar2;
    }

    public abstract K a(R r9);

    public abstract V b(R r9);

    public abstract R c(K k10, V v10);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M9.b
    public final R deserialize(P9.d dVar) {
        O9.e descriptor = getDescriptor();
        P9.b bVarD = dVar.d(descriptor);
        Object obj = G0.f11423a;
        Object objH = obj;
        Object objH2 = objH;
        while (true) {
            int iX = bVarD.x(getDescriptor());
            if (iX == -1) {
                if (objH == obj) {
                    throw new M9.i("Element 'key' is missing");
                }
                if (objH2 == obj) {
                    throw new M9.i("Element 'value' is missing");
                }
                R r9 = (R) c(objH, objH2);
                bVarD.b(descriptor);
                return r9;
            }
            if (iX == 0) {
                objH = bVarD.h(getDescriptor(), 0, this.f11456a, null);
            } else {
                if (iX != 1) {
                    throw new M9.i(C4356c.h(iX, "Invalid index: "));
                }
                objH2 = bVarD.h(getDescriptor(), 1, this.f11457b, null);
            }
        }
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, R r9) {
        P9.c cVarD = eVar.d(getDescriptor());
        cVarD.y(getDescriptor(), 0, this.f11456a, a(r9));
        cVarD.y(getDescriptor(), 1, this.f11457b, b(r9));
        cVarD.b(getDescriptor());
    }
}
