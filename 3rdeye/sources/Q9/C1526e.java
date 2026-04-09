package Q9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: CollectionSerializers.kt */
/* renamed from: Q9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1526e<E> extends AbstractC1559w<E, List<? extends E>, ArrayList<E>> {

    /* renamed from: b, reason: collision with root package name */
    public final C1524d f11478b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1526e(M9.b<E> element) {
        super(element);
        kotlin.jvm.internal.l.f(element, "element");
        O9.e elementDesc = element.getDescriptor();
        kotlin.jvm.internal.l.f(elementDesc, "elementDesc");
        this.f11478b = new C1524d(elementDesc);
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
    public final Object g(Object obj) {
        kotlin.jvm.internal.l.f(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f11478b;
    }

    @Override // Q9.AbstractC1518a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.l.f(arrayList, "<this>");
        return arrayList;
    }

    @Override // Q9.AbstractC1558v
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.l.f(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
