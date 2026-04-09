package Q9;

import Q9.AbstractC1551q0;
import java.util.Iterator;

/* compiled from: CollectionSerializers.kt */
/* renamed from: Q9.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1554s0<Element, Array, Builder extends AbstractC1551q0<Array>> extends AbstractC1558v<Element, Array, Builder> {

    /* renamed from: b, reason: collision with root package name */
    public final C1552r0 f11531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1554s0(M9.b<Element> primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.l.f(primitiveSerializer, "primitiveSerializer");
        this.f11531b = new C1552r0(primitiveSerializer.getDescriptor());
    }

    @Override // Q9.AbstractC1518a
    public final Object a() {
        return g(j());
    }

    @Override // Q9.AbstractC1518a
    public final int b(Object obj) {
        AbstractC1551q0 abstractC1551q0 = (AbstractC1551q0) obj;
        kotlin.jvm.internal.l.f(abstractC1551q0, "<this>");
        return abstractC1551q0.d();
    }

    @Override // Q9.AbstractC1518a
    public final Iterator<Element> c(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // Q9.AbstractC1518a, M9.b
    public final Array deserialize(P9.d dVar) {
        return (Array) e(dVar);
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f11531b;
    }

    @Override // Q9.AbstractC1518a
    public final Object h(Object obj) {
        AbstractC1551q0 abstractC1551q0 = (AbstractC1551q0) obj;
        kotlin.jvm.internal.l.f(abstractC1551q0, "<this>");
        return abstractC1551q0.a();
    }

    @Override // Q9.AbstractC1558v
    public final void i(int i, Object obj, Object obj2) {
        kotlin.jvm.internal.l.f((AbstractC1551q0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Array j();

    public abstract void k(P9.c cVar, Array array, int i);

    @Override // Q9.AbstractC1558v, M9.b
    public final void serialize(P9.e eVar, Array array) {
        int iD = d(array);
        C1552r0 c1552r0 = this.f11531b;
        P9.c cVarV = eVar.v(c1552r0, iD);
        k(cVarV, array, iD);
        cVarV.b(c1552r0);
    }
}
