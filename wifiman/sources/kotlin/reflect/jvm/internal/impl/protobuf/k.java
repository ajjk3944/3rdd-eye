package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class k extends AbstractList implements RandomAccess, l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f51998b = new k().h();

    /* renamed from: a, reason: collision with root package name */
    private final List f51999a;

    public k() {
        this.f51999a = new ArrayList();
    }

    private static d e(Object obj) {
        return obj instanceof d ? (d) obj : obj instanceof String ? d.j((String) obj) : d.g((byte[]) obj);
    }

    private static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).A() : i.b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public d C0(int i10) {
        Object obj = this.f51999a.get(i10);
        d dVarE = e(obj);
        if (dVarE != obj) {
            this.f51999a.set(i10, dVarE);
        }
        return dVarE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public void P0(d dVar) {
        this.f51999a.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f51999a.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f51999a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public List d() {
        return Collections.unmodifiableList(this.f51999a);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f51999a.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strA = dVar.A();
            if (dVar.s()) {
                this.f51999a.set(i10, strA);
            }
            return strA;
        }
        byte[] bArr = (byte[]) obj;
        String strB = i.b(bArr);
        if (i.a(bArr)) {
            this.f51999a.set(i10, strB);
        }
        return strB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public l h() {
        return new t(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f51999a.remove(i10);
        ((AbstractList) this).modCount++;
        return f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return f(this.f51999a.set(i10, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f51999a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        if (collection instanceof l) {
            collection = ((l) collection).d();
        }
        boolean zAddAll = this.f51999a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public k(l lVar) {
        this.f51999a = new ArrayList(lVar.size());
        addAll(lVar);
    }
}
