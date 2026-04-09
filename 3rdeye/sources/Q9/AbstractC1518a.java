package Q9;

import java.util.Iterator;

/* compiled from: CollectionSerializers.kt */
/* renamed from: Q9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1518a<Element, Collection, Builder> implements M9.b<Collection> {
    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract Iterator<Element> c(Collection collection);

    public abstract int d(Collection collection);

    @Override // M9.b
    public Collection deserialize(P9.d dVar) {
        return (Collection) e(dVar);
    }

    public final Object e(P9.d dVar) {
        Builder builderA = a();
        int iB = b(builderA);
        P9.b bVarD = dVar.d(getDescriptor());
        while (true) {
            int iX = bVarD.x(getDescriptor());
            if (iX == -1) {
                bVarD.b(getDescriptor());
                return h(builderA);
            }
            f(bVarD, iX + iB, builderA);
        }
    }

    public abstract void f(P9.b bVar, int i, Object obj);

    public abstract Builder g(Collection collection);

    public abstract Collection h(Builder builder);
}
