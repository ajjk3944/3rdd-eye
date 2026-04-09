package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wo1 extends bn1 {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f18067h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: c, reason: collision with root package name */
    public final int f18068c;

    /* renamed from: d, reason: collision with root package name */
    public final bn1 f18069d;

    /* renamed from: e, reason: collision with root package name */
    public final bn1 f18070e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18071f;
    public final int g;

    public wo1(bn1 bn1Var, bn1 bn1Var2) {
        this.f18069d = bn1Var;
        this.f18070e = bn1Var2;
        int i4 = bn1Var.i();
        this.f18071f = i4;
        this.f18068c = bn1Var2.i() + i4;
        this.g = Math.max(bn1Var.s(), bn1Var2.s()) + 1;
    }

    public static int z(int i4) {
        if (i4 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f18067h[i4];
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte f(int i4) {
        bn1.a(i4, this.f18068c);
        return g(i4);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte g(int i4) {
        int i10 = this.f18071f;
        return i4 < i10 ? this.f18069d.g(i4) : this.f18070e.g(i4 - i10);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int i() {
        return this.f18068c;
    }

    @Override // com.google.android.gms.internal.ads.bn1, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new uo1(this);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final bn1 j(int i4, int i10) {
        int i11 = this.f18068c;
        int iC = bn1.c(i4, i10, i11);
        if (iC == 0) {
            return bn1.f9729b;
        }
        if (iC == i11) {
            return this;
        }
        bn1 bn1Var = this.f18069d;
        int i12 = this.f18071f;
        if (i10 <= i12) {
            return bn1Var.j(i4, i10);
        }
        int i13 = i10 - i12;
        bn1 bn1Var2 = this.f18070e;
        return i4 >= i12 ? bn1Var2.j(i4 - i12, i13) : new wo1(bn1Var.j(i4, bn1Var.i()), bn1Var2.j(0, i13));
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void k(int i4, byte[] bArr, int i10, int i11) {
        int i12 = i4 + i11;
        bn1 bn1Var = this.f18069d;
        int i13 = this.f18071f;
        if (i12 <= i13) {
            bn1Var.k(i4, bArr, i10, i11);
            return;
        }
        bn1 bn1Var2 = this.f18070e;
        if (i4 >= i13) {
            bn1Var2.k(i4 - i13, bArr, i10, i11);
            return;
        }
        int i14 = i13 - i4;
        bn1Var.k(i4, bArr, i10, i14);
        bn1Var2.k(0, bArr, i10 + i14, i11 - i14);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void m(hn1 hn1Var) {
        this.f18069d.m(hn1Var);
        this.f18070e.m(hn1Var);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final boolean o(bn1 bn1Var) {
        vo1 vo1Var = new vo1(this);
        ym1 ym1VarA = vo1Var.next();
        vo1 vo1Var2 = new vo1(bn1Var);
        ym1 ym1VarA2 = vo1Var2.next();
        int i4 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = ym1VarA.i() - i4;
            int i13 = ym1VarA2.i() - i10;
            int iMin = Math.min(i12, i13);
            if (!(i4 == 0 ? ym1VarA.z(ym1VarA2, i10, iMin) : ym1VarA2.z(ym1VarA, i4, iMin))) {
                return false;
            }
            i11 += iMin;
            int i14 = this.f18068c;
            if (i11 >= i14) {
                if (i11 == i14) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == i12) {
                i4 = 0;
                ym1VarA = vo1Var.next();
            } else {
                i4 += iMin;
                ym1VarA = ym1VarA;
            }
            if (iMin == i13) {
                ym1VarA2 = vo1Var2.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int q(int i4, int i10, int i11) {
        int i12 = i10 + i11;
        bn1 bn1Var = this.f18069d;
        int i13 = this.f18071f;
        if (i12 <= i13) {
            return bn1Var.q(i4, i10, i11);
        }
        bn1 bn1Var2 = this.f18070e;
        if (i10 >= i13) {
            return bn1Var2.q(i4, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return bn1Var2.q(bn1Var.q(i4, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final en1 r() {
        ym1 ym1Var;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.g);
        arrayDeque.push(this);
        bn1 bn1Var = this.f18069d;
        while (bn1Var instanceof wo1) {
            wo1 wo1Var = (wo1) bn1Var;
            arrayDeque.push(wo1Var);
            bn1Var = wo1Var.f18069d;
        }
        ym1 ym1Var2 = (ym1) bn1Var;
        while (true) {
            if (!(ym1Var2 != null)) {
                bo1 bo1Var = new bo1();
                bo1Var.f9739a = arrayList.iterator();
                bo1Var.f9741c = 0;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    bo1Var.f9741c++;
                }
                bo1Var.f9742d = -1;
                if (!bo1Var.c()) {
                    bo1Var.f9740b = yn1.f18813c;
                    bo1Var.f9743e = 0;
                    bo1Var.f9746i = 0L;
                }
                return new dn1(bo1Var);
            }
            if (ym1Var2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    ym1Var = null;
                    break;
                }
                bn1 bn1Var2 = ((wo1) arrayDeque.pop()).f18070e;
                while (bn1Var2 instanceof wo1) {
                    wo1 wo1Var2 = (wo1) bn1Var2;
                    arrayDeque.push(wo1Var2);
                    bn1Var2 = wo1Var2.f18069d;
                }
                ym1Var = (ym1) bn1Var2;
                if (ym1Var.i() != 0) {
                    break;
                }
            }
            arrayList.add(ym1Var2.l());
            ym1Var2 = ym1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int s() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final boolean t() {
        return this.f18068c >= z(this.g);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    /* renamed from: u */
    public final h61 iterator() {
        return new uo1(this);
    }
}
