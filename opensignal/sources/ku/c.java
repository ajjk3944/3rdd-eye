package ku;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: b, reason: collision with root package name */
    public final b f14531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gu.a aVar) {
        super(aVar);
        br.l.e(aVar, "element");
        iu.e descriptor = aVar.getDescriptor();
        br.l.e(descriptor, "elementDesc");
        this.f14531b = new b(descriptor);
    }

    @Override // ku.a
    public final Object a() {
        return new ArrayList();
    }

    @Override // ku.a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        br.l.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // ku.a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        br.l.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // ku.a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        br.l.e(collection, "<this>");
        return collection.size();
    }

    @Override // ku.a
    public final Object g(Object obj) {
        br.l.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return this.f14531b;
    }

    @Override // ku.a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        br.l.e(arrayList, "<this>");
        return arrayList;
    }

    @Override // ku.n
    public final void i(Object obj, int i10, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        br.l.e(arrayList, "<this>");
        arrayList.add(i10, obj2);
    }
}
