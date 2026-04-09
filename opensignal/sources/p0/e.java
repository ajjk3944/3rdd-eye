package p0;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f20230a;

    /* renamed from: d, reason: collision with root package name */
    public b f20231d;

    /* renamed from: g, reason: collision with root package name */
    public int f20232g = 0;

    public e(Object[] objArr) {
        this.f20230a = objArr;
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f20232g + 1;
        if (this.f20230a.length < i11) {
            m(i11);
        }
        Object[] objArr = this.f20230a;
        int i12 = this.f20232g;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f20232g++;
    }

    public final void b(Object obj) {
        int i10 = this.f20232g + 1;
        if (this.f20230a.length < i10) {
            m(i10);
        }
        Object[] objArr = this.f20230a;
        int i11 = this.f20232g;
        objArr[i11] = obj;
        this.f20232g = i11 + 1;
    }

    public final void c(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i11 = this.f20232g + size;
        if (this.f20230a.length < i11) {
            m(i11);
        }
        Object[] objArr = this.f20230a;
        int i12 = this.f20232g;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f20232g += size;
    }

    public final void d(int i10, e eVar) {
        int i11 = eVar.f20232g;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f20232g + i11;
        if (this.f20230a.length < i12) {
            m(i12);
        }
        Object[] objArr = this.f20230a;
        int i13 = this.f20232g;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(eVar.f20230a, 0, objArr, i10, i11);
        this.f20232g += i11;
    }

    public final boolean e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f20232g + size;
        if (this.f20230a.length < i12) {
            m(i12);
        }
        Object[] objArr = this.f20230a;
        int i13 = this.f20232g;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                e5.Q();
                throw null;
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f20232g += size;
        return true;
    }

    public final List f() {
        b bVar = this.f20231d;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f20231d = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.f20230a;
        int i10 = this.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f20232g = 0;
    }

    public final boolean h(Object obj) {
        int i10 = this.f20232g - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !l.a(this.f20230a[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.f20230a;
        int i10 = this.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            if (l.a(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i10 = i(obj);
        if (i10 < 0) {
            return false;
        }
        k(i10);
        return true;
    }

    public final Object k(int i10) {
        Object[] objArr = this.f20230a;
        Object obj = objArr[i10];
        int i11 = this.f20232g;
        if (i10 != i11 - 1) {
            int i12 = i10 + 1;
            System.arraycopy(objArr, i12, objArr, i10, i11 - i12);
        }
        int i13 = this.f20232g - 1;
        this.f20232g = i13;
        objArr[i13] = null;
        return obj;
    }

    public final void l(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f20232g;
            if (i11 < i12) {
                Object[] objArr = this.f20230a;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f20232g;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f20230a[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f20232g = i14;
        }
    }

    public final void m(int i10) {
        Object[] objArr = this.f20230a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f20230a = objArr2;
    }
}
