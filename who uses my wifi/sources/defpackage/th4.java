package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class th4 implements jh4, ih4 {
    public final jh4[] f;
    public final boolean[] g;
    public final IdentityHashMap h;
    public final ArrayList i = new ArrayList();
    public final HashMap j = new HashMap();
    public ih4 k;
    public ri4 l;
    public jh4[] m;
    public zg4 n;

    public th4(long[] jArr, jh4... jh4VarArr) {
        this.f = jh4VarArr;
        vm3 vm3Var = xm3.g;
        sn3 sn3Var = sn3.j;
        this.n = new zg4(sn3Var, sn3Var);
        this.h = new IdentityHashMap();
        this.m = new jh4[0];
        this.g = new boolean[jh4VarArr.length];
        for (int i = 0; i < jh4VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.g[i] = true;
                this.f[i] = new qi4(jh4VarArr[i], j);
            }
        }
    }

    @Override // defpackage.jh4
    public final void a(ih4 ih4Var, long j) {
        this.k = ih4Var;
        ArrayList arrayList = this.i;
        jh4[] jh4VarArr = this.f;
        Collections.addAll(arrayList, jh4VarArr);
        for (jh4 jh4Var : jh4VarArr) {
            jh4Var.a(this, j);
        }
    }

    @Override // defpackage.mi4
    public final boolean b(nb4 nb4Var) {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return this.n.b(nb4Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((jh4) arrayList.get(i)).b(nb4Var);
        }
        return false;
    }

    @Override // defpackage.ih4
    public final /* bridge */ /* synthetic */ void c(mi4 mi4Var) {
        ih4 ih4Var = this.k;
        ih4Var.getClass();
        ih4Var.c(this);
    }

    @Override // defpackage.jh4
    public final long d(long j) {
        long jD = this.m[0].d(j);
        int i = 1;
        while (true) {
            jh4[] jh4VarArr = this.m;
            if (i >= jh4VarArr.length) {
                return jD;
            }
            if (jh4VarArr[i].d(jD) != jD) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.jh4
    public final void e(long j) {
        for (jh4 jh4Var : this.m) {
            jh4Var.e(j);
        }
    }

    @Override // defpackage.jh4
    public final long f() {
        long j = -9223372036854775807L;
        for (jh4 jh4Var : this.m) {
            long jF = jh4Var.f();
            if (jF == -9223372036854775807L) {
                if (j != -9223372036854775807L && jh4Var.d(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (jh4 jh4Var2 : this.m) {
                    if (jh4Var2 == jh4Var) {
                        break;
                    }
                    if (jh4Var2.d(jF) != jF) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jF;
            } else if (jF != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // defpackage.ih4
    public final void g(jh4 jh4Var) {
        jh4[] jh4VarArr;
        ArrayList arrayList = this.i;
        arrayList.remove(jh4Var);
        if (arrayList.isEmpty()) {
            int i = 0;
            int i2 = 0;
            while (true) {
                jh4VarArr = this.f;
                if (i >= jh4VarArr.length) {
                    break;
                }
                i2 += jh4VarArr[i].l().a;
                i++;
            }
            d02[] d02VarArr = new d02[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < jh4VarArr.length; i4++) {
                ri4 ri4VarL = jh4VarArr[i4].l();
                int i5 = ri4VarL.a;
                int i6 = 0;
                while (i6 < i5) {
                    d02 d02VarA = ri4VarL.a(i6);
                    int i7 = d02VarA.a;
                    ph4[] ph4VarArr = new ph4[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        ph4 ph4Var = d02VarA.d[i8];
                        ph4Var.getClass();
                        gg4 gg4Var = new gg4(ph4Var);
                        String str = ph4Var.a;
                        if (str == null) {
                            str = "";
                        }
                        jh4[] jh4VarArr2 = jh4VarArr;
                        StringBuilder sb = new StringBuilder(str.length() + ga1.f(i4, 1));
                        sb.append(i4);
                        sb.append(":");
                        sb.append(str);
                        gg4Var.a = sb.toString();
                        ph4VarArr[i8] = new ph4(gg4Var);
                        i8++;
                        jh4VarArr = jh4VarArr2;
                    }
                    jh4[] jh4VarArr3 = jh4VarArr;
                    String str2 = d02VarA.b;
                    StringBuilder sb2 = new StringBuilder(ga1.f(i4, 1) + String.valueOf(str2).length());
                    sb2.append(i4);
                    sb2.append(":");
                    sb2.append(str2);
                    d02 d02Var = new d02(sb2.toString(), ph4VarArr);
                    this.j.put(d02Var, d02VarA);
                    d02VarArr[i3] = d02Var;
                    i6++;
                    i3++;
                    jh4VarArr = jh4VarArr3;
                }
            }
            this.l = new ri4(d02VarArr);
            ih4 ih4Var = this.k;
            ih4Var.getClass();
            ih4Var.g(this);
        }
    }

    @Override // defpackage.jh4
    public final long h(long j, lc4 lc4Var) {
        jh4[] jh4VarArr = this.m;
        return (jh4VarArr.length > 0 ? jh4VarArr[0] : this.f[0]).h(j, lc4Var);
    }

    @Override // defpackage.mi4
    public final long i() {
        return this.n.i();
    }

    @Override // defpackage.mi4
    public final long j() {
        return this.n.j();
    }

    @Override // defpackage.mi4
    public final void k(long j) {
        this.n.k(j);
    }

    @Override // defpackage.jh4
    public final ri4 l() {
        ri4 ri4Var = this.l;
        ri4Var.getClass();
        return ri4Var;
    }

    @Override // defpackage.jh4
    public final long m(nj4[] nj4VarArr, boolean[] zArr, li4[] li4VarArr, boolean[] zArr2, long j) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = nj4VarArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = nj4VarArr.length;
            identityHashMap = this.h;
            if (i2 >= length) {
                break;
            }
            li4 li4Var = li4VarArr[i2];
            Integer num = li4Var == null ? null : (Integer) identityHashMap.get(li4Var);
            iArr3[i2] = num == null ? -1 : num.intValue();
            nj4 nj4Var = nj4VarArr[i2];
            if (nj4Var != null) {
                String str = nj4Var.a().b;
                iArr4[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        li4[] li4VarArr2 = new li4[length];
        li4[] li4VarArr3 = new li4[length];
        nj4[] nj4VarArr2 = new nj4[length];
        jh4[] jh4VarArr = this.f;
        ArrayList arrayList = new ArrayList(jh4VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < jh4VarArr.length) {
            int i4 = i;
            while (i4 < nj4VarArr.length) {
                li4VarArr3[i4] = iArr3[i4] == i3 ? li4VarArr[i4] : null;
                if (iArr4[i4] == i3) {
                    nj4 nj4Var2 = nj4VarArr[i4];
                    nj4Var2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    d02 d02Var = (d02) this.j.get(nj4Var2.a());
                    d02Var.getClass();
                    nj4VarArr2[i4] = new sh4(nj4Var2, d02Var);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    nj4VarArr2[i4] = null;
                }
                i4++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            jh4[] jh4VarArr2 = jh4VarArr;
            int i5 = i3;
            long jM = jh4VarArr[i3].m(nj4VarArr2, zArr, li4VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jM;
            } else if (jM != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < nj4VarArr.length; i6++) {
                if (iArr5[i6] == i5) {
                    li4 li4Var2 = li4VarArr3[i6];
                    li4Var2.getClass();
                    li4VarArr2[i6] = li4Var2;
                    identityHashMap.put(li4Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr6[i6] == i5) {
                    zt0.b0(li4VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(jh4VarArr2[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            jh4VarArr = jh4VarArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(li4VarArr2, i7, li4VarArr, i7, length);
        this.m = (jh4[]) arrayList3.toArray(new jh4[i7]);
        this.n = new zg4(arrayList3, gi2.O(arrayList3, dj3.h));
        return j2;
    }

    @Override // defpackage.mi4
    public final boolean o() {
        return this.n.o();
    }

    @Override // defpackage.jh4
    public final void r() {
        int i = 0;
        while (true) {
            jh4[] jh4VarArr = this.f;
            if (i >= jh4VarArr.length) {
                return;
            }
            jh4VarArr[i].r();
            i++;
        }
    }
}
