package Zi;

import Zg.AbstractC3682n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class P0 extends AbstractC3737w {

    /* renamed from: b, reason: collision with root package name */
    private final th.d f25581b;

    /* renamed from: c, reason: collision with root package name */
    private final Xi.f f25582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(th.d kClass, Vi.b eSerializer) {
        super(eSerializer, null);
        AbstractC6492s.i(kClass, "kClass");
        AbstractC6492s.i(eSerializer, "eSerializer");
        this.f25581b = kClass;
        this.f25582c = new C3700d(eSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public ArrayList q(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return new ArrayList(AbstractC3682n.e(objArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Object[] r(ArrayList arrayList) {
        AbstractC6492s.i(arrayList, "<this>");
        return A0.r(arrayList, this.f25581b);
    }

    @Override // Zi.AbstractC3737w, Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25582c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList g() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int h(ArrayList arrayList) {
        AbstractC6492s.i(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void i(ArrayList arrayList, int i10) {
        AbstractC6492s.i(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterator j(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return AbstractC6477c.a(objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public int k(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(ArrayList arrayList, int i10, Object obj) {
        AbstractC6492s.i(arrayList, "<this>");
        arrayList.add(i10, obj);
    }
}
