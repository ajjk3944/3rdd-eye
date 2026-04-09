package androidx.recyclerview.widget;

import com.google.android.gms.internal.ads.i6;
import com.google.android.gms.internal.ads.sk0;
import java.io.EOFException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f1467a;

    /* renamed from: b, reason: collision with root package name */
    public int f1468b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1469c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1470d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1471e;

    public o() {
        this.f1470d = new i6();
        this.f1471e = new sk0(new byte[65025], 0);
        this.f1467a = -1;
    }

    public static p a(ArrayDeque arrayDeque, int i4, boolean z3) {
        p pVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                pVar = null;
                break;
            }
            pVar = (p) it.next();
            if (pVar.f1475a == i4 && pVar.f1477c == z3) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            p pVar2 = (p) it.next();
            if (z3) {
                pVar2.f1476b--;
            } else {
                pVar2.f1476b++;
            }
        }
        return pVar;
    }

    public boolean b(com.google.android.gms.internal.ads.y1 y1Var) {
        int i4;
        i6 i6Var = (i6) this.f1470d;
        sk0 sk0Var = (sk0) this.f1471e;
        if (this.f1469c) {
            this.f1469c = false;
            sk0Var.y(0);
        }
        while (true) {
            if (this.f1469c) {
                return true;
            }
            int i10 = this.f1467a;
            if (i10 < 0) {
                if (!i6Var.a(y1Var, -1L) || !i6Var.b(y1Var, true)) {
                    break;
                }
                int iC = i6Var.f12147d;
                if ((i6Var.f12144a & 1) == 1 && sk0Var.f16448c == 0) {
                    iC += c(0);
                    i4 = this.f1468b;
                } else {
                    i4 = 0;
                }
                try {
                    y1Var.K1(iC);
                    this.f1467a = i4;
                    i10 = i4;
                } catch (EOFException unused) {
                }
            }
            int iC2 = c(i10);
            int i11 = this.f1467a + this.f1468b;
            if (iC2 > 0) {
                sk0Var.A(sk0Var.f16448c + iC2);
                try {
                    y1Var.L1(sk0Var.f16448c, iC2, sk0Var.f16446a);
                    sk0Var.C(sk0Var.f16448c + iC2);
                    this.f1469c = i6Var.f12149f[i11 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i11 == i6Var.f12146c) {
                i11 = -1;
            }
            this.f1467a = i11;
        }
        return false;
    }

    public int c(int i4) {
        int i10;
        int i11 = 0;
        this.f1468b = 0;
        do {
            int i12 = this.f1468b;
            int i13 = i4 + i12;
            i6 i6Var = (i6) this.f1470d;
            if (i13 >= i6Var.f12146c) {
                break;
            }
            this.f1468b = i12 + 1;
            i10 = i6Var.f12149f[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public o(y4.a aVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i4;
        n nVar;
        int i10;
        this.f1470d = iArr2;
        int i11 = 0;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f1471e = aVar;
        ArrayList arrayList2 = (ArrayList) aVar.f37323a;
        int size = arrayList2.size();
        this.f1467a = size;
        ArrayList arrayList3 = (ArrayList) aVar.f37324b;
        int size2 = arrayList3.size();
        this.f1468b = size2;
        this.f1469c = true;
        n nVar2 = arrayList.isEmpty() ? null : (n) arrayList.get(0);
        if (nVar2 == null || nVar2.f1462a != 0 || nVar2.f1463b != 0) {
            arrayList.add(0, new n(0, 0, 0));
        }
        arrayList.add(new n(size, size2, 0));
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj = arrayList.get(i12);
            i12++;
            n nVar3 = (n) obj;
            int i13 = i11;
            while (i13 < nVar3.f1464c) {
                int i14 = nVar3.f1462a + i13;
                int i15 = nVar3.f1463b + i13;
                int i16 = ((vg.b) arrayList2.get(i14)).f36220b.equals(((vg.b) arrayList3.get(i15)).f36220b) ? 1 : 2;
                iArr[i14] = (i15 << 4) | i16;
                iArr2[i15] = i16 | (i14 << 4);
                i13++;
                i11 = 0;
            }
        }
        if (this.f1469c) {
            int size4 = arrayList.size();
            int i17 = 0;
            int i18 = 0;
            while (i18 < size4) {
                Object obj2 = arrayList.get(i18);
                i18++;
                n nVar4 = (n) obj2;
                while (true) {
                    i4 = nVar4.f1462a;
                    if (i17 < i4) {
                        if (iArr[i17] == 0) {
                            int size5 = arrayList.size();
                            int i19 = 0;
                            int i20 = 0;
                            while (true) {
                                if (i19 < size5) {
                                    nVar = (n) arrayList.get(i19);
                                    while (true) {
                                        i10 = nVar.f1463b;
                                        if (i20 < i10) {
                                            if (iArr2[i20] == 0 && aVar.d(i17, i20)) {
                                                int i21 = ((vg.b) arrayList2.get(i17)).f36220b.equals(((vg.b) arrayList3.get(i20)).f36220b) ? 8 : 4;
                                                iArr[i17] = (i20 << 4) | i21;
                                                iArr2[i20] = i21 | (i17 << 4);
                                            } else {
                                                i20++;
                                            }
                                        }
                                    }
                                }
                                i20 = nVar.f1464c + i10;
                                i19++;
                            }
                        }
                        i17++;
                    }
                }
                i17 = nVar4.f1464c + i4;
            }
        }
    }
}
