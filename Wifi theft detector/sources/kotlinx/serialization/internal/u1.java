package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class u1 extends w {

    /* renamed from: b, reason: collision with root package name */
    public final r9.c f22919b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(r9.c kClass, kotlinx.serialization.b eSerializer) {
        super(eSerializer, null);
        kotlin.jvm.internal.p.e(kClass, "kClass");
        kotlin.jvm.internal.p.e(eSerializer, "eSerializer");
        this.f22919b = kClass;
        this.f22920c = new d(eSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22920c;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        kotlin.jvm.internal.p.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i10) {
        kotlin.jvm.internal.p.e(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator d(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        return kotlin.jvm.internal.b.a(objArr);
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int e(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        return objArr.length;
    }

    @Override // kotlinx.serialization.internal.w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i10, Object obj) {
        kotlin.jvm.internal.p.e(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        return new ArrayList(z8.m.c(objArr));
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object[] l(ArrayList arrayList) {
        kotlin.jvm.internal.p.e(arrayList, "<this>");
        return k1.n(arrayList, this.f22919b);
    }
}
