package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class A extends AbstractC3967c implements B, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final A f30763c;

    /* renamed from: d, reason: collision with root package name */
    public static final B f30764d;

    /* renamed from: b, reason: collision with root package name */
    private final List f30765b;

    static {
        A a10 = new A();
        f30763c = a10;
        a10.n();
        f30764d = a10;
    }

    public A() {
        this(10);
    }

    private static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC3971g ? ((AbstractC3971g) obj).N0() : AbstractC3987x.j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public Object B(int i10) {
        return this.f30765b.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3967c, androidx.datastore.preferences.protobuf.AbstractC3987x.b
    public /* bridge */ /* synthetic */ boolean E() {
        return super.E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3967c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3967c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f30765b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public List d() {
        return Collections.unmodifiableList(this.f30765b);
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public void d0(AbstractC3971g abstractC3971g) {
        b();
        this.f30765b.add(abstractC3971g);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        b();
        this.f30765b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3967c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f30765b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3971g) {
            AbstractC3971g abstractC3971g = (AbstractC3971g) obj;
            String strN0 = abstractC3971g.N0();
            if (abstractC3971g.F()) {
                this.f30765b.set(i10, strN0);
            }
            return strN0;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = AbstractC3987x.j(bArr);
        if (AbstractC3987x.g(bArr)) {
            this.f30765b.set(i10, strJ);
        }
        return strJ;
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public B h() {
        return E() ? new l0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3967c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3987x.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public A p(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f30765b);
        return new A(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        b();
        Object objRemove = this.f30765b.remove(i10);
        ((AbstractList) this).modCount++;
        return f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        b();
        return f(this.f30765b.set(i10, str));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3967c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3967c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f30765b.size();
    }

    public A(int i10) {
        this(new ArrayList(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3967c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof B) {
            collection = ((B) collection).d();
        }
        boolean zAddAll = this.f30765b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3967c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private A(ArrayList arrayList) {
        this.f30765b = arrayList;
    }
}
