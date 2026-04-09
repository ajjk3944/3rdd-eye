package w0;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f36397a;

    /* renamed from: b, reason: collision with root package name */
    public b f36398b;

    /* renamed from: c, reason: collision with root package name */
    public int f36399c = 0;

    public e(Object[] objArr) {
        this.f36397a = objArr;
    }

    public final void a(int i4, Object obj) {
        int i10 = this.f36399c + 1;
        if (this.f36397a.length < i10) {
            o(i10);
        }
        Object[] objArr = this.f36397a;
        int i11 = this.f36399c;
        if (i4 != i11) {
            System.arraycopy(objArr, i4, objArr, i4 + 1, i11 - i4);
        }
        objArr[i4] = obj;
        this.f36399c++;
    }

    public final void b(Object obj) {
        int i4 = this.f36399c + 1;
        if (this.f36397a.length < i4) {
            o(i4);
        }
        Object[] objArr = this.f36397a;
        int i10 = this.f36399c;
        objArr[i10] = obj;
        this.f36399c = i10 + 1;
    }

    public final void c(int i4, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i10 = this.f36399c + size;
        if (this.f36397a.length < i10) {
            o(i10);
        }
        Object[] objArr = this.f36397a;
        int i11 = this.f36399c;
        if (i4 != i11) {
            System.arraycopy(objArr, i4, objArr, i4 + size, i11 - i4);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr[i4 + i12] = list.get(i12);
        }
        this.f36399c += size;
    }

    public final void d(int i4, e eVar) {
        int i10 = eVar.f36399c;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f36399c + i10;
        if (this.f36397a.length < i11) {
            o(i11);
        }
        Object[] objArr = this.f36397a;
        int i12 = this.f36399c;
        if (i4 != i12) {
            System.arraycopy(objArr, i4, objArr, i4 + i10, i12 - i4);
        }
        System.arraycopy(eVar.f36397a, 0, objArr, i4, i10);
        this.f36399c += i10;
    }

    public final boolean f(int i4, Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i11 = this.f36399c + size;
        if (this.f36397a.length < i11) {
            o(i11);
        }
        Object[] objArr = this.f36397a;
        int i12 = this.f36399c;
        if (i4 != i12) {
            System.arraycopy(objArr, i4, objArr, i4 + size, i12 - i4);
        }
        for (Object obj : collection) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                cm.g.N();
                throw null;
            }
            objArr[i10 + i4] = obj;
            i10 = i13;
        }
        this.f36399c += size;
        return true;
    }

    public final List g() {
        b bVar = this.f36398b;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f36398b = bVar2;
        return bVar2;
    }

    public final void h() {
        Object[] objArr = this.f36397a;
        int i4 = this.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            objArr[i10] = null;
        }
        this.f36399c = 0;
    }

    public final boolean i(Object obj) {
        int i4 = this.f36399c - 1;
        if (i4 >= 0) {
            for (int i10 = 0; !k.a(this.f36397a[i10], obj); i10++) {
                if (i10 != i4) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.f36397a;
        int i4 = this.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            if (k.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return false;
        }
        l(iJ);
        return true;
    }

    public final Object l(int i4) {
        Object[] objArr = this.f36397a;
        Object obj = objArr[i4];
        int i10 = this.f36399c;
        if (i4 != i10 - 1) {
            int i11 = i4 + 1;
            System.arraycopy(objArr, i11, objArr, i4, i10 - i11);
        }
        int i12 = this.f36399c - 1;
        this.f36399c = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void m(int i4, int i10) {
        if (i10 > i4) {
            int i11 = this.f36399c;
            if (i10 < i11) {
                Object[] objArr = this.f36397a;
                System.arraycopy(objArr, i10, objArr, i4, i11 - i10);
            }
            int i12 = this.f36399c;
            int i13 = i12 - (i10 - i4);
            int i14 = i12 - 1;
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    this.f36397a[i15] = null;
                    if (i15 == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f36399c = i13;
        }
    }

    public final void o(int i4) {
        Object[] objArr = this.f36397a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i4, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f36397a = objArr2;
    }
}
