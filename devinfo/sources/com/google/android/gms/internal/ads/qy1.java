package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qy1 implements iy1, hy1 {

    /* renamed from: a, reason: collision with root package name */
    public final iy1[] f15483a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f15484b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f15485c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15486d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f15487e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public hy1 f15488f;
    public oz1 g;

    /* renamed from: h, reason: collision with root package name */
    public iy1[] f15489h;

    /* renamed from: i, reason: collision with root package name */
    public yx1 f15490i;

    public qy1(long[] jArr, iy1... iy1VarArr) {
        this.f15483a = iy1VarArr;
        v41 v41Var = x41.f18307b;
        u51 u51Var = u51.f17096e;
        this.f15490i = new yx1(u51Var, u51Var);
        this.f15485c = new IdentityHashMap();
        this.f15489h = new iy1[0];
        this.f15484b = new boolean[iy1VarArr.length];
        for (int i4 = 0; i4 < iy1VarArr.length; i4++) {
            long j = jArr[i4];
            if (j != 0) {
                this.f15484b[i4] = true;
                this.f15483a[i4] = new nz1(iy1VarArr[i4], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long B1() {
        return this.f15490i.B1();
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long C1() {
        return this.f15490i.C1();
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean G1() {
        return this.f15490i.G1();
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void a(long j) {
        for (iy1 iy1Var : this.f15489h) {
            iy1Var.a(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long b(d[] dVarArr, boolean[] zArr, iz1[] iz1VarArr, boolean[] zArr2, long j) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = dVarArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i4 = 0;
        int i10 = 0;
        while (true) {
            length = dVarArr.length;
            identityHashMap = this.f15485c;
            if (i10 >= length) {
                break;
            }
            iz1 iz1Var = iz1VarArr[i10];
            Integer num = iz1Var == null ? null : (Integer) identityHashMap.get(iz1Var);
            iArr3[i10] = num == null ? -1 : num.intValue();
            d dVar = dVarArr[i10];
            if (dVar != null) {
                String str = dVar.b().f12338b;
                iArr4[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        iz1[] iz1VarArr2 = new iz1[length];
        iz1[] iz1VarArr3 = new iz1[length];
        d[] dVarArr2 = new d[length];
        iy1[] iy1VarArr = this.f15483a;
        ArrayList arrayList = new ArrayList(iy1VarArr.length);
        long j8 = j;
        int i11 = 0;
        while (i11 < iy1VarArr.length) {
            int i12 = i4;
            while (i12 < dVarArr.length) {
                iz1VarArr3[i12] = iArr3[i12] == i11 ? iz1VarArr[i12] : null;
                if (iArr4[i12] == i11) {
                    d dVar2 = dVarArr[i12];
                    dVar2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    ii iiVar = (ii) this.f15487e.get(dVar2.b());
                    iiVar.getClass();
                    dVarArr2[i12] = new py1(dVar2, iiVar);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    dVarArr2[i12] = null;
                }
                i12++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            iy1[] iy1VarArr2 = iy1VarArr;
            int i13 = i11;
            long jB = iy1VarArr[i11].b(dVarArr2, zArr, iz1VarArr3, zArr2, j8);
            if (i13 == 0) {
                j8 = jB;
            } else if (jB != j8) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z3 = false;
            for (int i14 = 0; i14 < dVarArr.length; i14++) {
                if (iArr5[i14] == i13) {
                    iz1 iz1Var2 = iz1VarArr3[i14];
                    iz1Var2.getClass();
                    iz1VarArr2[i14] = iz1Var2;
                    identityHashMap.put(iz1Var2, Integer.valueOf(i13));
                    z3 = true;
                } else if (iArr6[i14] == i13) {
                    mq0.c0(iz1VarArr3[i14] == null);
                }
            }
            if (z3) {
                arrayList2.add(iy1VarArr2[i13]);
            }
            i11 = i13 + 1;
            arrayList = arrayList2;
            iy1VarArr = iy1VarArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i4 = 0;
        }
        int i15 = i4;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(iz1VarArr2, i15, iz1VarArr, i15, length);
        this.f15489h = (iy1[]) arrayList3.toArray(new iy1[i15]);
        this.f15490i = new yx1(arrayList3, mq0.F(arrayList3, b11.f9548f));
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long c(long j, nu1 nu1Var) {
        iy1[] iy1VarArr = this.f15489h;
        return (iy1VarArr.length > 0 ? iy1VarArr[0] : this.f15483a[0]).c(j, nu1Var);
    }

    @Override // com.google.android.gms.internal.ads.hy1
    public final /* bridge */ /* synthetic */ void d(jz1 jz1Var) {
        hy1 hy1Var = this.f15488f;
        hy1Var.getClass();
        hy1Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.hy1
    public final void e(iy1 iy1Var) {
        iy1[] iy1VarArr;
        ArrayList arrayList = this.f15486d;
        arrayList.remove(iy1Var);
        if (arrayList.isEmpty()) {
            int i4 = 0;
            int i10 = 0;
            while (true) {
                iy1VarArr = this.f15483a;
                if (i4 >= iy1VarArr.length) {
                    break;
                }
                i10 += iy1VarArr[i4].f().f14820a;
                i4++;
            }
            ii[] iiVarArr = new ii[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < iy1VarArr.length; i12++) {
                oz1 oz1VarF = iy1VarArr[i12].f();
                int i13 = oz1VarF.f14820a;
                int i14 = 0;
                while (i14 < i13) {
                    ii iiVarA = oz1VarF.a(i14);
                    int i15 = iiVarA.f12337a;
                    mx1[] mx1VarArr = new mx1[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        mx1 mx1Var = iiVarA.f12340d[i16];
                        mx1Var.getClass();
                        lw1 lw1Var = new lw1(mx1Var);
                        String str = mx1Var.f14042a;
                        if (str == null) {
                            str = "";
                        }
                        iy1[] iy1VarArr2 = iy1VarArr;
                        StringBuilder sb2 = new StringBuilder(str.length() + r5.c.e(i12, 1));
                        sb2.append(i12);
                        sb2.append(":");
                        sb2.append(str);
                        lw1Var.f13652a = sb2.toString();
                        mx1VarArr[i16] = new mx1(lw1Var);
                        i16++;
                        iy1VarArr = iy1VarArr2;
                    }
                    iy1[] iy1VarArr3 = iy1VarArr;
                    String str2 = iiVarA.f12338b;
                    StringBuilder sb3 = new StringBuilder(r5.c.e(i12, 1) + String.valueOf(str2).length());
                    sb3.append(i12);
                    sb3.append(":");
                    sb3.append(str2);
                    ii iiVar = new ii(sb3.toString(), mx1VarArr);
                    this.f15487e.put(iiVar, iiVarA);
                    iiVarArr[i11] = iiVar;
                    i14++;
                    i11++;
                    iy1VarArr = iy1VarArr3;
                }
            }
            this.g = new oz1(iiVarArr);
            hy1 hy1Var = this.f15488f;
            hy1Var.getClass();
            hy1Var.e(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final oz1 f() {
        oz1 oz1Var = this.g;
        oz1Var.getClass();
        return oz1Var;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean g(rt1 rt1Var) {
        ArrayList arrayList = this.f15486d;
        if (arrayList.isEmpty()) {
            return this.f15490i.g(rt1Var);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((iy1) arrayList.get(i4)).g(rt1Var);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void h() {
        int i4 = 0;
        while (true) {
            iy1[] iy1VarArr = this.f15483a;
            if (i4 >= iy1VarArr.length) {
                return;
            }
            iy1VarArr[i4].h();
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long j(long j) {
        long j8 = this.f15489h[0].j(j);
        int i4 = 1;
        while (true) {
            iy1[] iy1VarArr = this.f15489h;
            if (i4 >= iy1VarArr.length) {
                return j8;
            }
            if (iy1VarArr[i4].j(j8) != j8) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void k(hy1 hy1Var, long j) {
        this.f15488f = hy1Var;
        ArrayList arrayList = this.f15486d;
        iy1[] iy1VarArr = this.f15483a;
        Collections.addAll(arrayList, iy1VarArr);
        for (iy1 iy1Var : iy1VarArr) {
            iy1Var.k(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final void l(long j) {
        this.f15490i.l(j);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long z1() {
        long j = -9223372036854775807L;
        for (iy1 iy1Var : this.f15489h) {
            long jZ1 = iy1Var.z1();
            if (jZ1 == -9223372036854775807L) {
                if (j != -9223372036854775807L && iy1Var.j(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (iy1 iy1Var2 : this.f15489h) {
                    if (iy1Var2 == iy1Var) {
                        break;
                    }
                    if (iy1Var2.j(jZ1) != jZ1) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZ1;
            } else if (jZ1 != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }
}
