package Zi;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zi.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3704f extends AbstractC3739x {

    /* renamed from: b, reason: collision with root package name */
    private final Xi.f f25625b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3704f(Vi.b element) {
        super(element);
        AbstractC6492s.i(element, "element");
        this.f25625b = new C3702e(element.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public ArrayList q(List list) {
        AbstractC6492s.i(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public List r(ArrayList arrayList) {
        AbstractC6492s.i(arrayList, "<this>");
        return arrayList;
    }

    @Override // Zi.AbstractC3737w, Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25625b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public ArrayList g() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int h(ArrayList arrayList) {
        AbstractC6492s.i(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(ArrayList arrayList, int i10) {
        AbstractC6492s.i(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(ArrayList arrayList, int i10, Object obj) {
        AbstractC6492s.i(arrayList, "<this>");
        arrayList.add(i10, obj);
    }
}
