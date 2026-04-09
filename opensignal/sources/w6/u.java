package w6;

import a5.b0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.k0;
import com.google.android.gms.internal.measurement.y3;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements u5.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f24363a;

    /* renamed from: b, reason: collision with root package name */
    public final List f24364b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.v f24365c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f24366d;

    /* renamed from: e, reason: collision with root package name */
    public final ma.f f24367e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f24368f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f24369g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f24370h;

    /* renamed from: i, reason: collision with root package name */
    public final n f24371i;
    public m j;
    public u5.m k;

    /* renamed from: l, reason: collision with root package name */
    public int f24372l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24373m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24374n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24375o;

    /* renamed from: p, reason: collision with root package name */
    public w f24376p;

    /* renamed from: q, reason: collision with root package name */
    public int f24377q;

    /* renamed from: r, reason: collision with root package name */
    public int f24378r;

    public u(int i10, b0 b0Var, ma.f fVar) {
        this.f24367e = fVar;
        this.f24363a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f24364b = Collections.singletonList(b0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f24364b = arrayList;
            arrayList.add(b0Var);
        }
        this.f24365c = new a5.v(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f24369g = sparseBooleanArray;
        this.f24370h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f24368f = sparseArray;
        this.f24366d = new SparseIntArray();
        this.f24371i = new n(1);
        this.k = u5.m.A;
        this.f24378r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (w) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new r(new om.f(this)));
        this.f24376p = null;
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        m mVar;
        long j10;
        SparseArray sparseArray = this.f24368f;
        List list = this.f24364b;
        a5.a.i(this.f24363a != 2);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = (b0) list.get(i10);
            synchronized (b0Var) {
                j10 = b0Var.f94b;
            }
            boolean z10 = j10 == -9223372036854775807L;
            if (!z10) {
                long jC = b0Var.c();
                z10 = (jC == -9223372036854775807L || jC == 0 || jC == j7) ? false : true;
            }
            if (z10) {
                b0Var.d(j7);
            }
        }
        if (j7 != 0 && (mVar = this.j) != null) {
            mVar.e(j7);
        }
        this.f24365c.B(0);
        this.f24366d.clear();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((w) sparseArray.valueAt(i11)).a();
        }
        this.f24377q = 0;
    }

    @Override // u5.k
    public final void f(u5.m mVar) {
        this.k = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // u5.k
    public final int g(u5.l lVar, ca.n nVar) throws k0, EOFException, InterruptedIOException {
        u5.l lVar2;
        int i10;
        int i11;
        ?? r32;
        int i12;
        boolean z10;
        long j;
        long j7 = ((u5.h) lVar).f23287g;
        boolean z11 = this.f24373m;
        int i13 = this.f24363a;
        if (z11) {
            long j10 = -9223372036854775807L;
            n nVar2 = this.f24371i;
            if (j7 != -1 && i13 != 2 && !nVar2.f24329d) {
                int i14 = this.f24378r;
                b0 b0Var = nVar2.f24327b;
                a5.v vVar = nVar2.f24328c;
                if (i14 <= 0) {
                    nVar2.a(lVar);
                    return 0;
                }
                if (!nVar2.f24331f) {
                    u5.h hVar = (u5.h) lVar;
                    long j11 = hVar.f23287g;
                    int iMin = (int) Math.min(112800, j11);
                    long j12 = j11 - iMin;
                    if (hVar.f23288r != j12) {
                        nVar.f3485a = j12;
                        return 1;
                    }
                    vVar.B(iMin);
                    hVar.f23290y = 0;
                    hVar.c(vVar.f165a, 0, iMin, false);
                    int i15 = vVar.f166b;
                    int i16 = vVar.f167c;
                    int i17 = i16 - 188;
                    while (true) {
                        if (i17 < i15) {
                            break;
                        }
                        byte[] bArr = vVar.f165a;
                        int i18 = -4;
                        int i19 = 0;
                        while (true) {
                            if (i18 > 4) {
                                break;
                            }
                            int i20 = (i18 * 188) + i17;
                            if (i20 < i15 || i20 >= i16 || bArr[i20] != 71) {
                                i19 = 0;
                            } else {
                                i19++;
                                if (i19 == 5) {
                                    long J = y3.J(vVar, i17, i14);
                                    if (J != -9223372036854775807L) {
                                        j10 = J;
                                        break;
                                    }
                                }
                            }
                            i18++;
                        }
                        i17--;
                    }
                    nVar2.f24333h = j10;
                    nVar2.f24331f = true;
                    return 0;
                }
                if (nVar2.f24333h == -9223372036854775807L) {
                    nVar2.a(lVar);
                    return 0;
                }
                if (nVar2.f24330e) {
                    long j13 = nVar2.f24332g;
                    if (j13 == -9223372036854775807L) {
                        nVar2.a(lVar);
                        return 0;
                    }
                    long jB = b0Var.b(nVar2.f24333h) - b0Var.b(j13);
                    nVar2.f24334i = jB;
                    if (jB < 0) {
                        a5.a.B("TsDurationReader", "Invalid duration: " + nVar2.f24334i + ". Using TIME_UNSET instead.");
                        nVar2.f24334i = -9223372036854775807L;
                    }
                    nVar2.a(lVar);
                    return 0;
                }
                u5.h hVar2 = (u5.h) lVar;
                int iMin2 = (int) Math.min(112800, hVar2.f23287g);
                long j14 = 0;
                if (hVar2.f23288r != j14) {
                    nVar.f3485a = j14;
                    return 1;
                }
                vVar.B(iMin2);
                hVar2.f23290y = 0;
                hVar2.c(vVar.f165a, 0, iMin2, false);
                int i21 = vVar.f166b;
                int i22 = vVar.f167c;
                while (true) {
                    if (i21 >= i22) {
                        break;
                    }
                    if (vVar.f165a[i21] == 71) {
                        long J2 = y3.J(vVar, i21, i14);
                        if (J2 != -9223372036854775807L) {
                            j10 = J2;
                            break;
                        }
                    }
                    i21++;
                }
                nVar2.f24332g = j10;
                nVar2.f24330e = true;
                return 0;
            }
            if (this.f24374n) {
                i10 = i13;
                z10 = false;
                j7 = j7;
                j = 0;
                i11 = 1;
            } else {
                this.f24374n = true;
                long j15 = nVar2.f24334i;
                if (j15 != -9223372036854775807L) {
                    j7 = j7;
                    j = 0;
                    i10 = i13;
                    i11 = 1;
                    z10 = false;
                    m mVar = new m(new ee.f(26), new t(this.f24378r, nVar2.f24327b), j15, 1 + j15, 0L, j7, 188L, 940);
                    this.j = mVar;
                    this.k.u((u5.c) mVar.f3466c);
                } else {
                    i10 = i13;
                    j7 = j7;
                    j = 0;
                    i11 = 1;
                    z10 = false;
                    this.k.u(new u5.n(j15));
                }
            }
            if (this.f24375o) {
                this.f24375o = z10;
                c(j, j);
                if (((u5.h) lVar).f23288r != j) {
                    nVar.f3485a = j;
                    return i11;
                }
            }
            m mVar2 = this.j;
            if (mVar2 != null && ((ca.b) mVar2.f3468e) != null) {
                return mVar2.b(lVar, nVar);
            }
            lVar2 = lVar;
            r32 = z10;
        } else {
            lVar2 = lVar;
            i10 = i13;
            i11 = 1;
            r32 = 0;
        }
        a5.v vVar2 = this.f24365c;
        byte[] bArr2 = vVar2.f165a;
        if (9400 - vVar2.f166b < 188) {
            int iA = vVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, vVar2.f166b, bArr2, r32, iA);
            }
            vVar2.C(iA, bArr2);
        }
        while (vVar2.a() < 188) {
            int i23 = vVar2.f167c;
            int i24 = ((u5.h) lVar2).read(bArr2, i23, 9400 - i23);
            if (i24 == -1) {
                return -1;
            }
            vVar2.D(i23 + i24);
        }
        int i25 = vVar2.f166b;
        int i26 = vVar2.f167c;
        byte[] bArr3 = vVar2.f165a;
        int i27 = i25;
        while (i27 < i26 && bArr3[i27] != 71) {
            i27++;
        }
        vVar2.E(i27);
        int i28 = i27 + 188;
        if (i28 > i26) {
            int i29 = (i27 - i25) + this.f24377q;
            this.f24377q = i29;
            i12 = i10;
            if (i12 == 2 && i29 > 376) {
                throw k0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i12 = i10;
            this.f24377q = r32;
        }
        int i30 = vVar2.f167c;
        if (i28 > i30) {
            return r32;
        }
        int iG = vVar2.g();
        if ((8388608 & iG) != 0) {
            vVar2.E(i28);
            return r32;
        }
        int i31 = (4194304 & iG) != 0 ? i11 : r32;
        int i32 = (2096896 & iG) >> 8;
        int i33 = (iG & 32) != 0 ? i11 : r32;
        w wVar = (iG & 16) != 0 ? (w) this.f24368f.get(i32) : null;
        if (wVar == null) {
            vVar2.E(i28);
            return r32;
        }
        if (i12 != 2) {
            int i34 = iG & 15;
            SparseIntArray sparseIntArray = this.f24366d;
            int i35 = sparseIntArray.get(i32, i34 - 1);
            sparseIntArray.put(i32, i34);
            if (i35 == i34) {
                vVar2.E(i28);
                return r32;
            }
            if (i34 != ((i35 + 1) & 15)) {
                wVar.a();
            }
        }
        if (i33 != 0) {
            int iT = vVar2.t();
            i31 |= (vVar2.t() & 64) != 0 ? 2 : r32;
            vVar2.F(iT - 1);
        }
        boolean z12 = this.f24373m;
        if (i12 == 2 || z12 || !this.f24370h.get(i32, r32)) {
            vVar2.D(i28);
            wVar.b(i31, vVar2);
            vVar2.D(i30);
        }
        if (i12 != 2 && !z12 && this.f24373m && j7 != -1) {
            this.f24375o = i11;
        }
        vVar2.E(i28);
        return r32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1 + 1;
     */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(u5.l r7) {
        /*
            r6 = this;
            a5.v r0 = r6.f24365c
            byte[] r0 = r0.f165a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.p(r0, r2, r1)
            r1 = r2
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = r2
        L10:
            r4 = 5
            if (r3 >= r4) goto L22
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L1f
            int r1 = r1 + 1
            goto Lb
        L1f:
            int r3 = r3 + 1
            goto L10
        L22:
            r7.m(r1)
            r7 = 1
            return r7
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.u.h(u5.l):boolean");
    }

    @Override // u5.k
    public final void release() {
    }
}
