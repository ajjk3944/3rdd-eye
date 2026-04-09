package Q9;

import N7.H7;
import c9.C2078B;
import java.util.Iterator;
import java.util.Map;

/* compiled from: CollectionSerializers.kt */
/* renamed from: Q9.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1521b0<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC1518a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    public final M9.b<Key> f11475a;

    /* renamed from: b, reason: collision with root package name */
    public final M9.b<Value> f11476b;

    public AbstractC1521b0(M9.b bVar, M9.b bVar2) {
        this.f11475a = bVar;
        this.f11476b = bVar2;
    }

    @Override // Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        Map builder = (Map) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        Object objH = bVar.h(getDescriptor(), i, this.f11475a, null);
        int iX = bVar.x(getDescriptor());
        if (iX != i + 1) {
            throw new IllegalArgumentException(H7.n(i, iX, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objH);
        M9.b<Value> bVar2 = this.f11476b;
        builder.put(objH, (!zContainsKey || (bVar2.getDescriptor().e() instanceof O9.d)) ? bVar.h(getDescriptor(), iX, bVar2, null) : bVar.h(getDescriptor(), iX, bVar2, C2078B.n(builder, objH)));
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Collection collection) {
        int iD = d(collection);
        O9.e descriptor = getDescriptor();
        P9.c cVarV = eVar.v(descriptor, iD);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itC = c(collection);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itC.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i10 = i + 1;
            cVarV.y(getDescriptor(), i, this.f11475a, key);
            i += 2;
            cVarV.y(getDescriptor(), i10, this.f11476b, value);
        }
        cVarV.b(descriptor);
    }
}
