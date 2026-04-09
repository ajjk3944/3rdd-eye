package y0;

import g1.o;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import nk.k;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: b, reason: collision with root package name */
    public static final h f37308b = new h(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f37309a;

    public h(Object[] objArr) {
        this.f37309a = objArr;
    }

    @Override // y0.b
    public final b a(int i4, Object obj) {
        com.bumptech.glide.c.g(i4, size());
        if (i4 == size()) {
            return c(obj);
        }
        int size = size();
        Object[] objArr = this.f37309a;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            m.R(0, i4, 6, objArr, objArr2);
            m.N(i4 + 1, i4, size(), objArr, objArr2);
            objArr2[i4] = obj;
            return new h(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        k.d(objArrCopyOf, "copyOf(...)");
        m.N(i4 + 1, i4, size() - 1, objArr, objArrCopyOf);
        objArrCopyOf[i4] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new d(objArrCopyOf, objArr3, size() + 1, 0);
    }

    @Override // y0.b
    public final b c(Object obj) {
        int size = size();
        Object[] objArr = this.f37309a;
        if (size >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new d(objArr, objArr2, size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
        k.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size()] = obj;
        return new h(objArrCopyOf);
    }

    @Override // y0.b
    public final b d(Collection collection) {
        if (collection.size() + size() > 32) {
            e eVarF = f();
            eVarF.addAll(collection);
            return eVarF.d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f37309a, collection.size() + size());
        k.d(objArrCopyOf, "copyOf(...)");
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new h(objArrCopyOf);
    }

    @Override // y0.b
    public final e f() {
        return new e(this, null, this.f37309a, 0);
    }

    @Override // y0.b
    public final b g(o oVar) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.f37309a;
        Object[] objArrCopyOf = objArr;
        boolean z3 = false;
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = objArr[i4];
            if (((Boolean) oVar.invoke(obj)).booleanValue()) {
                if (!z3) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    k.d(objArrCopyOf, "copyOf(...)");
                    z3 = true;
                    size = i4;
                }
            } else if (z3) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f37308b : new h(m.T(objArrCopyOf, 0, size));
    }

    @Override // java.util.List
    public final Object get(int i4) {
        com.bumptech.glide.c.f(i4, size());
        return this.f37309a[i4];
    }

    @Override // zj.a
    public final int getSize() {
        return this.f37309a.length;
    }

    @Override // y0.b
    public final b i(int i4) {
        com.bumptech.glide.c.f(i4, size());
        if (size() == 1) {
            return f37308b;
        }
        int size = size() - 1;
        Object[] objArr = this.f37309a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
        k.d(objArrCopyOf, "copyOf(...)");
        m.N(i4, i4 + 1, size(), objArr, objArrCopyOf);
        return new h(objArrCopyOf);
    }

    @Override // zj.e, java.util.List
    public final int indexOf(Object obj) {
        return m.b0(obj, this.f37309a);
    }

    @Override // y0.b
    public final b j(int i4, Object obj) {
        com.bumptech.glide.c.f(i4, size());
        Object[] objArr = this.f37309a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        k.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i4] = obj;
        return new h(objArrCopyOf);
    }

    @Override // zj.e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f37309a;
        k.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i4 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length2 = i10;
                }
            }
        }
        return -1;
    }

    @Override // zj.e, java.util.List
    public final ListIterator listIterator(int i4) {
        com.bumptech.glide.c.g(i4, size());
        return new c(this.f37309a, i4, size());
    }
}
