package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class f extends x {

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlinx.serialization.b element) {
        super(element);
        kotlin.jvm.internal.p.e(element, "element");
        this.f22850b = new e(element.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22850b;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        kotlin.jvm.internal.p.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i10) {
        kotlin.jvm.internal.p.e(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // kotlinx.serialization.internal.w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i10, Object obj) {
        kotlin.jvm.internal.p.e(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public List l(ArrayList arrayList) {
        kotlin.jvm.internal.p.e(arrayList, "<this>");
        return arrayList;
    }
}
