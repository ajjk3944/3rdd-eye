package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class IL extends QK {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f9087h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: c, reason: collision with root package name */
    public final int f9088c;

    /* renamed from: d, reason: collision with root package name */
    public final QK f9089d;

    /* renamed from: e, reason: collision with root package name */
    public final QK f9090e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9091f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9092g;

    public IL(QK qk, QK qk2) {
        this.f9089d = qk;
        this.f9090e = qk2;
        int iF = qk.f();
        this.f9091f = iF;
        this.f9088c = qk2.f() + iF;
        this.f9092g = Math.max(qk.o(), qk2.o()) + 1;
    }

    public static int v(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return f9087h[i];
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final byte d(int i) {
        QK.a(i, this.f9088c);
        return e(i);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final byte e(int i) {
        int i3 = this.f9091f;
        return i < i3 ? this.f9089d.e(i) : this.f9090e.e(i - i3);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final int f() {
        return this.f9088c;
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final QK g(int i, int i3) {
        int i6 = this.f9088c;
        int iB = QK.b(i, i3, i6);
        if (iB == 0) {
            return QK.f10609b;
        }
        if (iB == i6) {
            return this;
        }
        QK qk = this.f9089d;
        int i7 = this.f9091f;
        if (i3 <= i7) {
            return qk.g(i, i3);
        }
        int i8 = i3 - i7;
        QK qk2 = this.f9090e;
        return i >= i7 ? qk2.g(i - i7, i8) : new IL(qk.g(i, qk.f()), qk2.g(0, i8));
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final void h(int i, byte[] bArr, int i3, int i6) {
        int i7 = i + i6;
        QK qk = this.f9089d;
        int i8 = this.f9091f;
        if (i7 <= i8) {
            qk.h(i, bArr, i3, i6);
            return;
        }
        QK qk2 = this.f9090e;
        if (i >= i8) {
            qk2.h(i - i8, bArr, i3, i6);
            return;
        }
        int i9 = i8 - i;
        qk.h(i, bArr, i3, i9);
        qk2.h(0, bArr, i3 + i9, i6 - i9);
    }

    @Override // com.google.android.gms.internal.ads.QK, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new HL(this);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final void j(VK vk) {
        this.f9089d.j(vk);
        this.f9090e.j(vk);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final boolean k(QK qk) {
        C1201gG c1201gG = new C1201gG(this);
        NK nkA = c1201gG.a();
        C1201gG c1201gG2 = new C1201gG(qk);
        NK nkA2 = c1201gG2.a();
        int i = 0;
        int i3 = 0;
        int i6 = 0;
        while (true) {
            int iF = nkA.f() - i;
            int iF2 = nkA2.f() - i3;
            int iMin = Math.min(iF, iF2);
            if (!(i == 0 ? nkA.v(nkA2, i3, iMin) : nkA2.v(nkA, i, iMin))) {
                return false;
            }
            i6 += iMin;
            int i7 = this.f9088c;
            if (i6 >= i7) {
                if (i6 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iF) {
                i = 0;
                nkA = c1201gG.a();
            } else {
                i += iMin;
                nkA = nkA;
            }
            if (iMin == iF2) {
                nkA2 = c1201gG2.a();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final int m(int i, int i3, int i6) {
        int i7 = i3 + i6;
        QK qk = this.f9089d;
        int i8 = this.f9091f;
        if (i7 <= i8) {
            return qk.m(i, i3, i6);
        }
        QK qk2 = this.f9090e;
        if (i3 >= i8) {
            return qk2.m(i, i3 - i8, i6);
        }
        int i9 = i8 - i3;
        return qk2.m(qk.m(i, i3, i9), 0, i6 - i9);
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final D5.b n() {
        NK nk;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f9092g);
        arrayDeque.push(this);
        QK qk = this.f9089d;
        while (qk instanceof IL) {
            IL il = (IL) qk;
            arrayDeque.push(il);
            qk = il.f9089d;
        }
        NK nk2 = (NK) qk;
        while (true) {
            if (!(nk2 != null)) {
                C1690pL c1690pL = new C1690pL();
                c1690pL.f16161a = arrayList.iterator();
                c1690pL.f16163c = 0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    c1690pL.f16163c++;
                }
                c1690pL.f16164d = -1;
                if (!c1690pL.a()) {
                    c1690pL.f16162b = AbstractC1528mL.f15612c;
                    c1690pL.f16165e = 0;
                    c1690pL.i = 0L;
                }
                return new SK(c1690pL);
            }
            if (nk2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    nk = null;
                    break;
                }
                QK qk2 = ((IL) arrayDeque.pop()).f9090e;
                while (qk2 instanceof IL) {
                    IL il2 = (IL) qk2;
                    arrayDeque.push(il2);
                    qk2 = il2.f9089d;
                }
                nk = (NK) qk2;
                if (nk.f() != 0) {
                    break;
                }
            }
            arrayList.add(nk2.i());
            nk2 = nk;
        }
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final int o() {
        return this.f9092g;
    }

    @Override // com.google.android.gms.internal.ads.QK
    public final boolean p() {
        return this.f9088c >= v(this.f9092g);
    }

    @Override // com.google.android.gms.internal.ads.QK
    /* renamed from: q */
    public final AbstractC1896tC iterator() {
        return new HL(this);
    }
}
