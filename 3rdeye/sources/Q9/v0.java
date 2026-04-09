package Q9;

import c9.C2088i;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import w9.InterfaceC5748c;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes3.dex */
public final class v0<ElementKlass, Element extends ElementKlass> extends AbstractC1558v<Element, Element[], ArrayList<Element>> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5748c<ElementKlass> f11536b;

    /* renamed from: c, reason: collision with root package name */
    public final C1522c f11537c;

    public v0(InterfaceC5748c<ElementKlass> interfaceC5748c, M9.b<Element> bVar) {
        super(bVar);
        this.f11536b = interfaceC5748c;
        O9.e elementDesc = bVar.getDescriptor();
        kotlin.jvm.internal.l.f(elementDesc, "elementDesc");
        this.f11537c = new C1522c(elementDesc);
    }

    @Override // Q9.AbstractC1518a
    public final Object a() {
        return new ArrayList();
    }

    @Override // Q9.AbstractC1518a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.l.f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // Q9.AbstractC1518a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        kotlin.jvm.internal.l.f(objArr, "<this>");
        return T1.B.q(objArr);
    }

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        kotlin.jvm.internal.l.f(objArr, "<this>");
        return objArr.length;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        kotlin.jvm.internal.l.f(null, "<this>");
        C2088i.a(null);
        throw null;
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f11537c;
    }

    @Override // Q9.AbstractC1518a
    public final Object h(Object obj) throws NegativeArraySizeException {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.l.f(arrayList, "<this>");
        InterfaceC5748c<ElementKlass> eClass = this.f11536b;
        kotlin.jvm.internal.l.f(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) E.u.C(eClass), arrayList.size());
        kotlin.jvm.internal.l.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.l.e(array, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return array;
    }

    @Override // Q9.AbstractC1558v
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.l.f(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
