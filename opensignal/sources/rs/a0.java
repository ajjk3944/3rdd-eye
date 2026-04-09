package rs;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a0 extends e {
    public static final int[] D;
    public int B = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f21728d;

    /* renamed from: g, reason: collision with root package name */
    public final e f21729g;

    /* renamed from: r, reason: collision with root package name */
    public final e f21730r;

    /* renamed from: x, reason: collision with root package name */
    public final int f21731x;

    /* renamed from: y, reason: collision with root package name */
    public final int f21732y;

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        D = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = D;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    public a0(e eVar, e eVar2) {
        this.f21729g = eVar;
        this.f21730r = eVar2;
        int size = eVar.size();
        this.f21731x = size;
        this.f21728d = eVar2.size() + size;
        this.f21732y = Math.max(eVar.e(), eVar2.e()) + 1;
    }

    @Override // rs.e
    public final void d(int i10, int i11, int i12, byte[] bArr) {
        int i13 = i10 + i12;
        e eVar = this.f21729g;
        int i14 = this.f21731x;
        if (i13 <= i14) {
            eVar.d(i10, i11, i12, bArr);
            return;
        }
        e eVar2 = this.f21730r;
        if (i10 >= i14) {
            eVar2.d(i10 - i14, i11, i12, bArr);
            return;
        }
        int i15 = i14 - i10;
        eVar.d(i10, i11, i15, bArr);
        eVar2.d(0, i11 + i15, i12 - i15, bArr);
    }

    @Override // rs.e
    public final int e() {
        return this.f21732y;
    }

    public final boolean equals(Object obj) {
        int iN;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            int size = eVar.size();
            int i10 = this.f21728d;
            if (i10 == size) {
                if (i10 == 0) {
                    return true;
                }
                if (this.B == 0 || (iN = eVar.n()) == 0 || this.B == iN) {
                    io.sentry.cache.tape.d dVar = new io.sentry.cache.tape.d(this);
                    w wVarA = dVar.a();
                    io.sentry.cache.tape.d dVar2 = new io.sentry.cache.tape.d(eVar);
                    w wVarA2 = dVar2.a();
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        int length = wVarA.f21779d.length - i11;
                        int length2 = wVarA2.f21779d.length - i12;
                        int iMin = Math.min(length, length2);
                        if (!(i11 == 0 ? wVarA.s(wVarA2, i12, iMin) : wVarA2.s(wVarA, i11, iMin))) {
                            break;
                        }
                        i13 += iMin;
                        if (i13 >= i10) {
                            if (i13 == i10) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            wVarA = dVar.a();
                            i11 = 0;
                        } else {
                            i11 += iMin;
                        }
                        if (iMin == length2) {
                            wVarA2 = dVar2.a();
                            i12 = 0;
                        } else {
                            i12 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // rs.e
    public final boolean g() {
        return this.f21728d >= D[this.f21732y];
    }

    public final int hashCode() {
        int iL = this.B;
        if (iL == 0) {
            int i10 = this.f21728d;
            iL = l(i10, 0, i10);
            if (iL == 0) {
                iL = 1;
            }
            this.B = iL;
        }
        return iL;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new z(this);
    }

    @Override // rs.e
    public final boolean j() {
        int iM = this.f21729g.m(0, 0, this.f21731x);
        e eVar = this.f21730r;
        return eVar.m(iM, 0, eVar.size()) == 0;
    }

    @Override // rs.e
    public final int l(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        e eVar = this.f21729g;
        int i14 = this.f21731x;
        if (i13 <= i14) {
            return eVar.l(i10, i11, i12);
        }
        e eVar2 = this.f21730r;
        if (i11 >= i14) {
            return eVar2.l(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return eVar2.l(eVar.l(i10, i11, i15), 0, i12 - i15);
    }

    @Override // rs.e
    public final int m(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        e eVar = this.f21729g;
        int i14 = this.f21731x;
        if (i13 <= i14) {
            return eVar.m(i10, i11, i12);
        }
        e eVar2 = this.f21730r;
        if (i11 >= i14) {
            return eVar2.m(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return eVar2.m(eVar.m(i10, i11, i15), 0, i12 - i15);
    }

    @Override // rs.e
    public final int n() {
        return this.B;
    }

    @Override // rs.e
    public final String o() {
        byte[] bArr;
        int i10 = this.f21728d;
        if (i10 == 0) {
            bArr = s.f21775a;
        } else {
            byte[] bArr2 = new byte[i10];
            d(0, 0, i10, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // rs.e
    public final void r(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        e eVar = this.f21729g;
        int i13 = this.f21731x;
        if (i12 <= i13) {
            eVar.r(outputStream, i10, i11);
            return;
        }
        e eVar2 = this.f21730r;
        if (i10 >= i13) {
            eVar2.r(outputStream, i10 - i13, i11);
            return;
        }
        int i14 = i13 - i10;
        eVar.r(outputStream, i10, i14);
        eVar2.r(outputStream, 0, i11 - i14);
    }

    @Override // rs.e
    public final int size() {
        return this.f21728d;
    }
}
