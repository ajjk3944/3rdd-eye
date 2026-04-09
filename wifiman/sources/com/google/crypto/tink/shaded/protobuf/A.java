package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class A extends AbstractC5076c implements B, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final A f38425c;

    /* renamed from: d, reason: collision with root package name */
    public static final B f38426d;

    /* renamed from: b, reason: collision with root package name */
    private final List f38427b;

    static {
        A a10 = new A();
        f38425c = a10;
        a10.n();
        f38426d = a10;
    }

    public A() {
        this(10);
    }

    private static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC5081h ? ((AbstractC5081h) obj).X0() : AbstractC5097y.i((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.B
    public Object B(int i10) {
        return this.f38427b.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, com.google.crypto.tink.shaded.protobuf.AbstractC5097y.d
    public /* bridge */ /* synthetic */ boolean E() {
        return super.E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.B
    public void E0(AbstractC5081h abstractC5081h) {
        b();
        this.f38427b.add(abstractC5081h);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f38427b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.B
    public List d() {
        return Collections.unmodifiableList(this.f38427b);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        b();
        this.f38427b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f38427b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5081h) {
            AbstractC5081h abstractC5081h = (AbstractC5081h) obj;
            String strX0 = abstractC5081h.X0();
            if (abstractC5081h.J()) {
                this.f38427b.set(i10, strX0);
            }
            return strX0;
        }
        byte[] bArr = (byte[]) obj;
        String strI = AbstractC5097y.i(bArr);
        if (AbstractC5097y.g(bArr)) {
            this.f38427b.set(i10, strI);
        }
        return strI;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.B
    public B h() {
        return E() ? new k0(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5097y.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public A p(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f38427b);
        return new A(arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        b();
        Object objRemove = this.f38427b.remove(i10);
        ((AbstractList) this).modCount++;
        return f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        b();
        return f(this.f38427b.set(i10, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38427b.size();
    }

    public A(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof B) {
            collection = ((B) collection).d();
        }
        boolean zAddAll = this.f38427b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private A(ArrayList arrayList) {
        this.f38427b = arrayList;
    }
}
