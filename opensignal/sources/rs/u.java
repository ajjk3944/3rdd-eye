package rs;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class u extends AbstractList implements RandomAccess, v {

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f21777d = new h0(new u());

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21778a;

    public u() {
        this.f21778a = new ArrayList();
    }

    @Override // rs.v
    public final h0 L() {
        return new h0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f21778a.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f21778a.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f21778a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // rs.v
    public final List f() {
        return Collections.unmodifiableList(this.f21778a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ArrayList arrayList = this.f21778a;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            String strP = eVar.p();
            if (eVar.j()) {
                arrayList.set(i10, strP);
            }
            return strP;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = s.f21775a;
        try {
            String str = new String(bArr, "UTF-8");
            if (e0.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
            return str;
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("UTF-8 not supported?", e4);
        }
    }

    @Override // rs.v
    public final void h(w wVar) {
        this.f21778a.add(wVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        Object objRemove = this.f21778a.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof e) {
            return ((e) objRemove).p();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = s.f21775a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("UTF-8 not supported?", e4);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Object obj2 = this.f21778a.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof e) {
            return ((e) obj2).p();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = s.f21775a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("UTF-8 not supported?", e4);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21778a.size();
    }

    @Override // rs.v
    public final e y(int i10) {
        e wVar;
        ArrayList arrayList = this.f21778a;
        Object obj = arrayList.get(i10);
        if (obj instanceof e) {
            wVar = (e) obj;
        } else if (obj instanceof String) {
            try {
                wVar = new w(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e4) {
                throw new RuntimeException("UTF-8 not supported?", e4);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            wVar = new w(bArr2);
        }
        if (wVar != obj) {
            arrayList.set(i10, wVar);
        }
        return wVar;
    }

    public u(v vVar) {
        this.f21778a = new ArrayList(vVar.size());
        addAll(vVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection instanceof v) {
            collection = ((v) collection).f();
        }
        boolean zAddAll = this.f21778a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
