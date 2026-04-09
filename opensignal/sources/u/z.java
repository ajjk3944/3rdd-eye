package u;

import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f23134a;

    /* renamed from: b, reason: collision with root package name */
    public int f23135b;

    public z(int i10) {
        this.f23134a = i10 == 0 ? f0.f23067a : new Object[i10];
    }

    public final void a(Object obj) {
        int i10 = this.f23135b + 1;
        Object[] objArr = this.f23134a;
        if (objArr.length < i10) {
            l(i10, objArr);
        }
        Object[] objArr2 = this.f23134a;
        int i11 = this.f23135b;
        objArr2[i11] = obj;
        this.f23135b = i11 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = this.f23135b;
        int size = list.size() + i10;
        Object[] objArr = this.f23134a;
        if (objArr.length < size) {
            l(size, objArr);
        }
        Object[] objArr2 = this.f23134a;
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = list.get(i11);
        }
        this.f23135b = list.size() + this.f23135b;
    }

    public final void c() {
        mq.l.i0(this.f23134a, 0, this.f23135b);
        this.f23135b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.f23134a[0];
        }
        v.a.e("ObjectList is empty.");
        throw null;
    }

    public final Object e(int i10) {
        if (i10 >= 0 && i10 < this.f23135b) {
            return this.f23134a[i10];
        }
        m(i10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            int i10 = zVar.f23135b;
            int i11 = this.f23135b;
            if (i10 == i11) {
                Object[] objArr = this.f23134a;
                Object[] objArr2 = zVar.f23134a;
                hr.d dVarT = vc.e.T(0, i11);
                int i12 = dVarT.f10863a;
                int i13 = dVarT.f10864d;
                if (i12 > i13) {
                    return true;
                }
                while (br.l.a(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f23134a;
            int i11 = this.f23135b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f23134a;
        int i12 = this.f23135b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean g() {
        return this.f23135b == 0;
    }

    public final boolean h() {
        return this.f23135b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f23134a;
        int i10 = this.f23135b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        j(iF);
        return true;
    }

    public final Object j(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f23135b)) {
            m(i10);
            throw null;
        }
        Object[] objArr = this.f23134a;
        Object obj = objArr[i10];
        if (i10 != i11 - 1) {
            mq.l.c0(i10, i10 + 1, i11, objArr, objArr);
        }
        int i12 = this.f23135b - 1;
        this.f23135b = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void k(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f23135b) || i11 < 0 || i11 > i12) {
            v.a.d("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f23135b);
            throw null;
        }
        if (i11 < i10) {
            v.a.c("Start (" + i10 + ") is more than end (" + i11 + ')');
            throw null;
        }
        if (i11 != i10) {
            if (i11 < i12) {
                Object[] objArr = this.f23134a;
                mq.l.c0(i10, i11, i12, objArr, objArr);
            }
            int i13 = this.f23135b;
            int i14 = i13 - (i11 - i10);
            mq.l.i0(this.f23134a, i14, i13);
            this.f23135b = i14;
        }
    }

    public final void l(int i10, Object[] objArr) {
        br.l.e(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, (length * 3) / 2)];
        mq.l.c0(0, 0, length, objArr, objArr2);
        this.f23134a = objArr2;
    }

    public final void m(int i10) {
        StringBuilder sbU = h0.b.u("Index ", i10, " must be in 0..");
        sbU.append(this.f23135b - 1);
        v.a.d(sbU.toString());
        throw null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f23134a;
        int i10 = this.f23135b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i11++;
        }
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ z() {
        this(16);
    }
}
