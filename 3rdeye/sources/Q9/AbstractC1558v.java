package Q9;

import java.util.Iterator;

/* compiled from: CollectionSerializers.kt */
/* renamed from: Q9.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1558v<Element, Collection, Builder> extends AbstractC1518a<Element, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    public final M9.b<Element> f11535a;

    public AbstractC1558v(M9.b bVar) {
        this.f11535a = bVar;
    }

    @Override // Q9.AbstractC1518a
    public void f(P9.b bVar, int i, Object obj) {
        i(i, obj, bVar.h(getDescriptor(), i, this.f11535a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // M9.b
    public void serialize(P9.e eVar, Collection collection) {
        int iD = d(collection);
        O9.e descriptor = getDescriptor();
        P9.c cVarV = eVar.v(descriptor, iD);
        Iterator<Element> itC = c(collection);
        for (int i = 0; i < iD; i++) {
            cVarV.y(getDescriptor(), i, this.f11535a, itC.next());
        }
        cVarV.b(descriptor);
    }
}
