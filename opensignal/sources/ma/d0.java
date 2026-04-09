package ma;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.y0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 implements ca.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f16410a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16411b;

    /* renamed from: c, reason: collision with root package name */
    public final fb.f f16412c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f16413d;

    /* renamed from: e, reason: collision with root package name */
    public final f f16414e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f16415f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f16416g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f16417h;

    /* renamed from: i, reason: collision with root package name */
    public final x f16418i;
    public ea.b j;
    public ca.m k;

    /* renamed from: l, reason: collision with root package name */
    public int f16419l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16420m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16421n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16422o;

    /* renamed from: p, reason: collision with root package name */
    public h0 f16423p;

    /* renamed from: q, reason: collision with root package name */
    public int f16424q;

    /* renamed from: r, reason: collision with root package name */
    public int f16425r;

    public d0(int i10, qb.u uVar, f fVar) {
        this.f16414e = fVar;
        this.f16410a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f16411b = Collections.singletonList(uVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f16411b = arrayList;
            arrayList.add(uVar);
        }
        this.f16412c = new fb.f(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f16416g = sparseBooleanArray;
        this.f16417h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f16415f = sparseArray;
        this.f16413d = new SparseIntArray();
        this.f16418i = new x(1);
        this.f16425r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (h0) sparseArray2.valueAt(i11));
        }
        i4.b bVar = new i4.b();
        bVar.f11197d = this;
        bVar.f11196a = new a5.u(new byte[4], 4, 3, (byte) 0);
        sparseArray.put(0, new b0(bVar));
        this.f16423p = null;
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        ea.b bVar;
        long j10;
        SparseArray sparseArray = this.f16415f;
        List list = this.f16411b;
        qb.b.j(this.f16410a != 2);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            qb.u uVar = (qb.u) list.get(i10);
            synchronized (uVar) {
                j10 = uVar.f20825b;
            }
            boolean z10 = j10 == -9223372036854775807L;
            if (!z10) {
                long jC = uVar.c();
                z10 = (jC == -9223372036854775807L || jC == 0 || jC == j7) ? false : true;
            }
            if (z10) {
                uVar.d(j7);
            }
        }
        if (j7 != 0 && (bVar = this.j) != null) {
            bVar.e(j7);
        }
        this.f16412c.v(0);
        this.f16413d.clear();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((h0) sparseArray.valueAt(i11)).a();
        }
        this.f16424q = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // ca.k
    public final int f(ca.l lVar, ca.n nVar) throws y0, EOFException, InterruptedIOException {
        ca.l lVar2;
        int i10;
        int i11;
        ?? r32;
        int i12;
        boolean z10;
        long j;
        long j7 = ((ca.h) lVar).f3477g;
        boolean z11 = this.f16420m;
        int i13 = this.f16410a;
        if (z11) {
            long j10 = -9223372036854775807L;
            x xVar = this.f16418i;
            if (j7 != -1 && i13 != 2 && !xVar.f16640d) {
                int i14 = this.f16425r;
                qb.u uVar = xVar.f16638b;
                fb.f fVar = xVar.f16639c;
                if (i14 <= 0) {
                    xVar.a(lVar);
                    return 0;
                }
                if (!xVar.f16642f) {
                    ca.h hVar = (ca.h) lVar;
                    long j11 = hVar.f3477g;
                    int iMin = (int) Math.min(112800, j11);
                    long j12 = j11 - iMin;
                    if (hVar.f3478r != j12) {
                        nVar.f3485a = j12;
                        return 1;
                    }
                    fVar.v(iMin);
                    hVar.f3480y = 0;
                    hVar.c(fVar.f8800a, 0, iMin, false);
                    int i15 = fVar.f8801b;
                    int i16 = fVar.f8802c;
                    int i17 = i16 - 188;
                    while (true) {
                        if (i17 < i15) {
                            break;
                        }
                        byte[] bArr = fVar.f8800a;
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
                                    long jL = ba.m.L(fVar, i17, i14);
                                    if (jL != -9223372036854775807L) {
                                        j10 = jL;
                                        break;
                                    }
                                }
                            }
                            i18++;
                        }
                        i17--;
                    }
                    xVar.f16644h = j10;
                    xVar.f16642f = true;
                    return 0;
                }
                if (xVar.f16644h == -9223372036854775807L) {
                    xVar.a(lVar);
                    return 0;
                }
                if (xVar.f16641e) {
                    long j13 = xVar.f16643g;
                    if (j13 == -9223372036854775807L) {
                        xVar.a(lVar);
                        return 0;
                    }
                    long jB = uVar.b(xVar.f16644h) - uVar.b(j13);
                    xVar.f16645i = jB;
                    if (jB < 0) {
                        StringBuilder sb2 = new StringBuilder(65);
                        sb2.append("Invalid duration: ");
                        sb2.append(jB);
                        sb2.append(". Using TIME_UNSET instead.");
                        io.sentry.android.core.e0.p("TsDurationReader", sb2.toString());
                        xVar.f16645i = -9223372036854775807L;
                    }
                    xVar.a(lVar);
                    return 0;
                }
                ca.h hVar2 = (ca.h) lVar;
                int iMin2 = (int) Math.min(112800, hVar2.f3477g);
                long j14 = 0;
                if (hVar2.f3478r != j14) {
                    nVar.f3485a = j14;
                    return 1;
                }
                fVar.v(iMin2);
                hVar2.f3480y = 0;
                hVar2.c(fVar.f8800a, 0, iMin2, false);
                int i21 = fVar.f8801b;
                int i22 = fVar.f8802c;
                while (true) {
                    if (i21 >= i22) {
                        break;
                    }
                    if (fVar.f8800a[i21] == 71) {
                        long jL2 = ba.m.L(fVar, i21, i14);
                        if (jL2 != -9223372036854775807L) {
                            j10 = jL2;
                            break;
                        }
                    }
                    i21++;
                }
                xVar.f16643g = j10;
                xVar.f16641e = true;
                return 0;
            }
            if (this.f16421n) {
                i10 = i13;
                z10 = false;
                j7 = j7;
                j = 0;
                i11 = 1;
            } else {
                this.f16421n = true;
                long j15 = xVar.f16645i;
                if (j15 != -9223372036854775807L) {
                    j7 = j7;
                    j = 0;
                    i10 = i13;
                    i11 = 1;
                    z10 = false;
                    ea.b bVar = new ea.b(new et.d(), new bc.f0(this.f16425r, xVar.f16638b), j15, 1 + j15, 0L, j7, 188L, 940);
                    this.j = bVar;
                    this.k.r((ca.a) bVar.f3466c);
                } else {
                    i10 = i13;
                    j7 = j7;
                    j = 0;
                    i11 = 1;
                    z10 = false;
                    this.k.r(new ca.o(j15));
                }
            }
            if (this.f16422o) {
                this.f16422o = z10;
                c(j, j);
                if (((ca.h) lVar).f3478r != j) {
                    nVar.f3485a = j;
                    return i11;
                }
            }
            ea.b bVar2 = this.j;
            if (bVar2 != null && ((ca.b) bVar2.f3468e) != null) {
                return bVar2.a(lVar, nVar);
            }
            lVar2 = lVar;
            r32 = z10;
        } else {
            lVar2 = lVar;
            i10 = i13;
            i11 = 1;
            r32 = 0;
        }
        fb.f fVar2 = this.f16412c;
        byte[] bArr2 = fVar2.f8800a;
        if (9400 - fVar2.f8801b < 188) {
            int iA = fVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, fVar2.f8801b, bArr2, r32, iA);
            }
            fVar2.w(iA, bArr2);
        }
        while (fVar2.a() < 188) {
            int i23 = fVar2.f8802c;
            int i24 = ((ca.h) lVar2).read(bArr2, i23, 9400 - i23);
            if (i24 == -1) {
                return -1;
            }
            fVar2.x(i23 + i24);
        }
        int i25 = fVar2.f8801b;
        int i26 = fVar2.f8802c;
        byte[] bArr3 = fVar2.f8800a;
        int i27 = i25;
        while (i27 < i26 && bArr3[i27] != 71) {
            i27++;
        }
        fVar2.y(i27);
        int i28 = i27 + 188;
        if (i28 > i26) {
            int i29 = (i27 - i25) + this.f16424q;
            this.f16424q = i29;
            i12 = i10;
            if (i12 == 2 && i29 > 376) {
                throw y0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i12 = i10;
            this.f16424q = r32;
        }
        int i30 = fVar2.f8802c;
        if (i28 > i30) {
            return r32;
        }
        int iD = fVar2.d();
        if ((8388608 & iD) != 0) {
            fVar2.y(i28);
            return r32;
        }
        int i31 = (4194304 & iD) != 0 ? i11 : r32;
        int i32 = (2096896 & iD) >> 8;
        int i33 = (iD & 32) != 0 ? i11 : r32;
        h0 h0Var = (iD & 16) != 0 ? (h0) this.f16415f.get(i32) : null;
        if (h0Var == null) {
            fVar2.y(i28);
            return r32;
        }
        if (i12 != 2) {
            int i34 = iD & 15;
            SparseIntArray sparseIntArray = this.f16413d;
            int i35 = sparseIntArray.get(i32, i34 - 1);
            sparseIntArray.put(i32, i34);
            if (i35 == i34) {
                fVar2.y(i28);
                return r32;
            }
            if (i34 != ((i35 + 1) & 15)) {
                h0Var.a();
            }
        }
        if (i33 != 0) {
            int iO = fVar2.o();
            i31 |= (fVar2.o() & 64) != 0 ? 2 : r32;
            fVar2.z(iO - 1);
        }
        boolean z12 = this.f16420m;
        if (i12 == 2 || z12 || !this.f16417h.get(i32, r32)) {
            fVar2.x(i28);
            h0Var.b(i31, fVar2);
            fVar2.x(i30);
        }
        if (i12 != 2 && !z12 && this.f16420m && j7 != -1) {
            this.f16422o = i11;
        }
        fVar2.y(i28);
        return r32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1 + 1;
     */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(ca.l r7) {
        /*
            r6 = this;
            fb.f r0 = r6.f16412c
            byte[] r0 = r0.f8800a
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
        throw new UnsupportedOperationException("Method not decompiled: ma.d0.g(ca.l):boolean");
    }

    @Override // ca.k
    public final void h(ca.m mVar) {
        this.k = mVar;
    }

    @Override // ca.k
    public final void release() {
    }
}
