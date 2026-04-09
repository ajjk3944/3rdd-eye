package com.yandex.mobile.ads.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.AdRequest;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.dh;
import g0.C4356c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class jc0 implements u70 {

    /* renamed from: F, reason: collision with root package name */
    private static final byte[] f29057F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G, reason: collision with root package name */
    private static final dc0 f29058G = new dc0.a().e("application/x-emsg").a();

    /* renamed from: A, reason: collision with root package name */
    private boolean f29059A;

    /* renamed from: B, reason: collision with root package name */
    private w70 f29060B;

    /* renamed from: C, reason: collision with root package name */
    private n52[] f29061C;

    /* renamed from: D, reason: collision with root package name */
    private n52[] f29062D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f29063E;

    /* renamed from: a, reason: collision with root package name */
    private final List<dc0> f29064a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<b> f29065b;

    /* renamed from: c, reason: collision with root package name */
    private final uf1 f29066c;

    /* renamed from: d, reason: collision with root package name */
    private final uf1 f29067d;

    /* renamed from: e, reason: collision with root package name */
    private final uf1 f29068e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f29069f;

    /* renamed from: g, reason: collision with root package name */
    private final uf1 f29070g;

    /* renamed from: h, reason: collision with root package name */
    private final v50 f29071h;
    private final uf1 i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<dh.a> f29072j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayDeque<a> f29073k;

    /* renamed from: l, reason: collision with root package name */
    private final n52 f29074l;

    /* renamed from: m, reason: collision with root package name */
    private int f29075m;

    /* renamed from: n, reason: collision with root package name */
    private int f29076n;

    /* renamed from: o, reason: collision with root package name */
    private long f29077o;

    /* renamed from: p, reason: collision with root package name */
    private int f29078p;

    /* renamed from: q, reason: collision with root package name */
    private uf1 f29079q;

    /* renamed from: r, reason: collision with root package name */
    private long f29080r;

    /* renamed from: s, reason: collision with root package name */
    private int f29081s;

    /* renamed from: t, reason: collision with root package name */
    private long f29082t;

    /* renamed from: u, reason: collision with root package name */
    private long f29083u;

    /* renamed from: v, reason: collision with root package name */
    private long f29084v;

    /* renamed from: w, reason: collision with root package name */
    private b f29085w;

    /* renamed from: x, reason: collision with root package name */
    private int f29086x;

    /* renamed from: y, reason: collision with root package name */
    private int f29087y;

    /* renamed from: z, reason: collision with root package name */
    private int f29088z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f29089a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f29090b;

        /* renamed from: c, reason: collision with root package name */
        public final int f29091c;

        public a(int i, long j4, boolean z10) {
            this.f29089a = j4;
            this.f29090b = z10;
            this.f29091c = i;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final n52 f29092a;

        /* renamed from: d, reason: collision with root package name */
        public o52 f29095d;

        /* renamed from: e, reason: collision with root package name */
        public i00 f29096e;

        /* renamed from: f, reason: collision with root package name */
        public int f29097f;

        /* renamed from: g, reason: collision with root package name */
        public int f29098g;

        /* renamed from: h, reason: collision with root package name */
        public int f29099h;
        public int i;

        /* renamed from: l, reason: collision with root package name */
        private boolean f29102l;

        /* renamed from: b, reason: collision with root package name */
        public final k52 f29093b = new k52();

        /* renamed from: c, reason: collision with root package name */
        public final uf1 f29094c = new uf1();

        /* renamed from: j, reason: collision with root package name */
        private final uf1 f29100j = new uf1(1);

        /* renamed from: k, reason: collision with root package name */
        private final uf1 f29101k = new uf1();

        public b(n52 n52Var, o52 o52Var, i00 i00Var) {
            this.f29092a = n52Var;
            this.f29095d = o52Var;
            this.f29096e = i00Var;
            a(o52Var, i00Var);
        }

        public final j52 a() {
            if (!this.f29102l) {
                return null;
            }
            k52 k52Var = this.f29093b;
            i00 i00Var = k52Var.f29502a;
            int i = s82.f32899a;
            int i10 = i00Var.f28427a;
            j52 j52VarA = k52Var.f29513m;
            if (j52VarA == null) {
                j52VarA = this.f29095d.f31196a.a(i10);
            }
            if (j52VarA == null || !j52VarA.f28975a) {
                return null;
            }
            return j52VarA;
        }

        public final void b() {
            k52 k52Var = this.f29093b;
            k52Var.f29505d = 0;
            k52Var.f29516p = 0L;
            k52Var.f29517q = false;
            k52Var.f29511k = false;
            k52Var.f29515o = false;
            k52Var.f29513m = null;
            this.f29097f = 0;
            this.f29099h = 0;
            this.f29098g = 0;
            this.i = 0;
            this.f29102l = false;
        }

        public final int a(int i, int i10) {
            uf1 uf1Var;
            j52 j52VarA = a();
            if (j52VarA == null) {
                return 0;
            }
            int length = j52VarA.f28978d;
            if (length != 0) {
                uf1Var = this.f29093b.f29514n;
            } else {
                byte[] bArr = j52VarA.f28979e;
                int i11 = s82.f32899a;
                this.f29101k.a(bArr.length, bArr);
                uf1 uf1Var2 = this.f29101k;
                length = bArr.length;
                uf1Var = uf1Var2;
            }
            k52 k52Var = this.f29093b;
            boolean z10 = k52Var.f29511k && k52Var.f29512l[this.f29097f];
            boolean z11 = z10 || i10 != 0;
            this.f29100j.c()[0] = (byte) ((z11 ? 128 : 0) | length);
            this.f29100j.e(0);
            this.f29092a.b(1, this.f29100j);
            this.f29092a.b(length, uf1Var);
            if (!z11) {
                return length + 1;
            }
            if (!z10) {
                this.f29094c.c(8);
                byte[] bArrC = this.f29094c.c();
                bArrC[0] = 0;
                bArrC[1] = 1;
                bArrC[2] = (byte) 0;
                bArrC[3] = (byte) (i10 & KotlinVersion.MAX_COMPONENT_VALUE);
                bArrC[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArrC[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArrC[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArrC[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f29092a.b(8, this.f29094c);
                return length + 9;
            }
            uf1 uf1Var3 = this.f29093b.f29514n;
            int iZ = uf1Var3.z();
            uf1Var3.f(-2);
            int i12 = (iZ * 6) + 2;
            if (i10 != 0) {
                this.f29094c.c(i12);
                byte[] bArrC2 = this.f29094c.c();
                uf1Var3.a(bArrC2, 0, i12);
                int i13 = (((bArrC2[2] & 255) << 8) | (bArrC2[3] & 255)) + i10;
                bArrC2[2] = (byte) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArrC2[3] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
                uf1Var3 = this.f29094c;
            }
            this.f29092a.b(i12, uf1Var3);
            return length + 1 + i12;
        }

        public final void a(o52 o52Var, i00 i00Var) {
            this.f29095d = o52Var;
            this.f29096e = i00Var;
            this.f29092a.a(o52Var.f31196a.f28502f);
            b();
        }
    }

    public jc0(int i) {
        this(Collections.EMPTY_LIST);
    }

    public final i52 a(i52 i52Var) {
        return i52Var;
    }

    public jc0(List list) {
        this(list, 0);
    }

    private static a40 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            dh.b bVar = (dh.b) arrayList.get(i);
            if (bVar.f26169a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArrC = bVar.f26173b.c();
                UUID uuidC = tm1.c(bArrC);
                if (uuidC == null) {
                    rs0.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new a40.b(uuidC, null, "video/mp4", bArrC));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new a40(arrayList2);
    }

    public jc0(List list, int i) {
        this.f29064a = Collections.unmodifiableList(list);
        this.f29074l = null;
        this.f29071h = new v50();
        this.i = new uf1(16);
        this.f29066c = new uf1(u31.f33899a);
        this.f29067d = new uf1(5);
        this.f29068e = new uf1();
        byte[] bArr = new byte[16];
        this.f29069f = bArr;
        this.f29070g = new uf1(bArr);
        this.f29072j = new ArrayDeque<>();
        this.f29073k = new ArrayDeque<>();
        this.f29065b = new SparseArray<>();
        this.f29083u = -9223372036854775807L;
        this.f29082t = -9223372036854775807L;
        this.f29084v = -9223372036854775807L;
        this.f29060B = w70.f34836a;
        this.f29061C = new n52[0];
        this.f29062D = new n52[0];
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        int i;
        this.f29060B = w70Var;
        int i10 = 0;
        this.f29075m = 0;
        this.f29078p = 0;
        n52[] n52VarArr = new n52[2];
        this.f29061C = n52VarArr;
        n52 n52Var = this.f29074l;
        if (n52Var != null) {
            n52VarArr[0] = n52Var;
            i = 1;
        } else {
            i = 0;
        }
        n52[] n52VarArr2 = (n52[]) s82.a(i, n52VarArr);
        this.f29061C = n52VarArr2;
        for (n52 n52Var2 : n52VarArr2) {
            n52Var2.a(f29058G);
        }
        this.f29062D = new n52[this.f29064a.size()];
        int i11 = 100;
        while (i10 < this.f29062D.length) {
            int i12 = i11 + 1;
            n52 n52VarA = this.f29060B.a(i11, 3);
            n52VarA.a(this.f29064a.get(i10));
            this.f29062D[i10] = n52VarA;
            i10++;
            i11 = i12;
        }
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    private void a(dh.a aVar) throws yf1 {
        i00 i00Var;
        i00 i00Var2;
        a40 a40VarA = a(aVar.f26171c);
        dh.a aVarB = aVar.b(1836475768);
        aVarB.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = aVarB.f26171c.size();
        long jV = -9223372036854775807L;
        for (int i = 0; i < size; i++) {
            dh.b bVar = (dh.b) aVarB.f26171c.get(i);
            int i10 = bVar.f26169a;
            if (i10 == 1953654136) {
                uf1 uf1Var = bVar.f26173b;
                uf1Var.e(12);
                Pair pairCreate = Pair.create(Integer.valueOf(uf1Var.h()), new i00(uf1Var.h() - 1, uf1Var.h(), uf1Var.h(), uf1Var.h()));
                sparseArray.put(((Integer) pairCreate.first).intValue(), (i00) pairCreate.second);
            } else if (i10 == 1835362404) {
                uf1 uf1Var2 = bVar.f26173b;
                uf1Var2.e(8);
                jV = ((uf1Var2.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0 ? uf1Var2.v() : uf1Var2.y();
            }
        }
        ArrayList arrayListA = eh.a(aVar, new ce0(), jV, a40VarA, false, false, new R1(this, 5));
        int size2 = arrayListA.size();
        if (this.f29065b.size() == 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                o52 o52Var = (o52) arrayListA.get(i11);
                i52 i52Var = o52Var.f31196a;
                n52 n52VarA = this.f29060B.a(i11, i52Var.f28498b);
                int i12 = i52Var.f28497a;
                if (sparseArray.size() == 1) {
                    i00Var2 = (i00) sparseArray.valueAt(0);
                } else {
                    i00Var2 = (i00) sparseArray.get(i12);
                    i00Var2.getClass();
                }
                this.f29065b.put(i52Var.f28497a, new b(n52VarA, o52Var, i00Var2));
                this.f29083u = Math.max(this.f29083u, i52Var.f28501e);
            }
            this.f29060B.a();
            return;
        }
        if (this.f29065b.size() != size2) {
            throw new IllegalStateException();
        }
        for (int i13 = 0; i13 < size2; i13++) {
            o52 o52Var2 = (o52) arrayListA.get(i13);
            i52 i52Var2 = o52Var2.f31196a;
            b bVar2 = this.f29065b.get(i52Var2.f28497a);
            int i14 = i52Var2.f28497a;
            if (sparseArray.size() == 1) {
                i00Var = (i00) sparseArray.valueAt(0);
            } else {
                i00Var = (i00) sparseArray.get(i14);
                i00Var.getClass();
            }
            bVar2.a(o52Var2, i00Var);
        }
    }

    private static void a(uf1 uf1Var, int i, k52 k52Var) throws yf1 {
        uf1Var.e(i + 8);
        int iH = uf1Var.h();
        if ((iH & 1) == 0) {
            boolean z10 = (iH & 2) != 0;
            int iX = uf1Var.x();
            if (iX == 0) {
                Arrays.fill(k52Var.f29512l, 0, k52Var.f29506e, false);
                return;
            }
            if (iX == k52Var.f29506e) {
                Arrays.fill(k52Var.f29512l, 0, iX, z10);
                k52Var.f29514n.c(uf1Var.a());
                k52Var.f29511k = true;
                k52Var.f29515o = true;
                uf1Var.a(k52Var.f29514n.c(), 0, k52Var.f29514n.e());
                k52Var.f29514n.e(0);
                k52Var.f29515o = false;
                return;
            }
            StringBuilder sbJ = C4356c.j(iX, "Senc sample count ", " is different from fragment sample count");
            sbJ.append(k52Var.f29506e);
            throw yf1.a(sbJ.toString(), (Exception) null);
        }
        throw yf1.a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v9 */
    private void a(long j4) throws yf1 {
        int i;
        boolean z10;
        int i10;
        SparseArray<b> sparseArray;
        int i11;
        int i12;
        int i13;
        int iH;
        int iH2;
        int i14;
        int iH3;
        int iH4;
        int i15;
        boolean z11;
        byte[] bArr;
        int i16;
        boolean z12;
        ArrayList arrayList;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iH5;
        long[] jArr;
        int iH6;
        int iH7;
        i00 i00Var;
        int iH8;
        int i22 = 8;
        boolean z13 = true;
        while (!this.f29072j.isEmpty() && this.f29072j.peek().f26170b == j4) {
            dh.a aVarPop = this.f29072j.pop();
            int i23 = aVarPop.f26169a;
            if (i23 == 1836019574) {
                a(aVarPop);
            } else {
                if (i23 == 1836019558) {
                    SparseArray<b> sparseArray2 = this.f29065b;
                    byte[] bArr2 = this.f29069f;
                    int size = aVarPop.f26172d.size();
                    int i24 = 0;
                    while (i24 < size) {
                        dh.a aVar = (dh.a) aVarPop.f26172d.get(i24);
                        if (aVar.f26169a == 1953653094) {
                            dh.b bVarC = aVar.c(1952868452);
                            bVarC.getClass();
                            uf1 uf1Var = bVarC.f26173b;
                            uf1Var.e(i22);
                            int iH9 = uf1Var.h();
                            b bVar = sparseArray2.get(uf1Var.h());
                            if (bVar == null) {
                                sparseArray = sparseArray2;
                                bVar = null;
                                i13 = 2;
                                i14 = 4;
                            } else {
                                sparseArray = sparseArray2;
                                if ((iH9 & 1) != 0) {
                                    long jY = uf1Var.y();
                                    i13 = 2;
                                    k52 k52Var = bVar.f29093b;
                                    k52Var.f29503b = jY;
                                    k52Var.f29504c = jY;
                                } else {
                                    i13 = 2;
                                }
                                i00 i00Var2 = bVar.f29096e;
                                if ((iH9 & 2) != 0) {
                                    iH = uf1Var.h() - (z13 ? 1 : 0);
                                } else {
                                    iH = i00Var2.f28427a;
                                }
                                if ((iH9 & 8) != 0) {
                                    iH2 = uf1Var.h();
                                } else {
                                    iH2 = i00Var2.f28428b;
                                }
                                if ((iH9 & 16) != 0) {
                                    iH3 = uf1Var.h();
                                    i14 = 4;
                                } else {
                                    i14 = 4;
                                    iH3 = i00Var2.f28429c;
                                }
                                if ((iH9 & 32) != 0) {
                                    iH4 = uf1Var.h();
                                } else {
                                    iH4 = i00Var2.f28430d;
                                }
                                bVar.f29093b.f29502a = new i00(iH, iH2, iH3, iH4);
                            }
                            if (bVar == null) {
                                i10 = i22;
                                boolean z14 = z13 ? 1 : 0;
                                i11 = size;
                                i12 = i24;
                            } else {
                                k52 k52Var2 = bVar.f29093b;
                                long j10 = k52Var2.f29516p;
                                boolean z15 = k52Var2.f29517q;
                                bVar.b();
                                bVar.f29102l = true;
                                dh.b bVarC2 = aVar.c(1952867444);
                                if (bVarC2 != null) {
                                    uf1 uf1Var2 = bVarC2.f26173b;
                                    uf1Var2.e(i22);
                                    k52Var2.f29516p = ((uf1Var2.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == z13 ? uf1Var2.y() : uf1Var2.v();
                                    k52Var2.f29517q = z13;
                                } else {
                                    k52Var2.f29516p = j10;
                                    k52Var2.f29517q = z15;
                                }
                                ArrayList arrayList2 = aVar.f26171c;
                                int size2 = arrayList2.size();
                                int i25 = 0;
                                int i26 = 0;
                                int i27 = 0;
                                while (true) {
                                    i15 = 1953658222;
                                    z11 = z13;
                                    if (i25 >= size2) {
                                        break;
                                    }
                                    dh.b bVar2 = (dh.b) arrayList2.get(i25);
                                    if (bVar2.f26169a == 1953658222) {
                                        uf1 uf1Var3 = bVar2.f26173b;
                                        uf1Var3.e(12);
                                        int iX = uf1Var3.x();
                                        if (iX > 0) {
                                            i26 += iX;
                                            i27++;
                                        }
                                    }
                                    i25++;
                                    z13 = z11;
                                }
                                bVar.f29099h = 0;
                                bVar.f29098g = 0;
                                bVar.f29097f = 0;
                                k52 k52Var3 = bVar.f29093b;
                                k52Var3.f29505d = i27;
                                k52Var3.f29506e = i26;
                                if (k52Var3.f29508g.length < i27) {
                                    k52Var3.f29507f = new long[i27];
                                    k52Var3.f29508g = new int[i27];
                                }
                                if (k52Var3.f29509h.length < i26) {
                                    int i28 = (i26 * 125) / 100;
                                    k52Var3.f29509h = new int[i28];
                                    k52Var3.i = new long[i28];
                                    k52Var3.f29510j = new boolean[i28];
                                    k52Var3.f29512l = new boolean[i28];
                                }
                                int i29 = 0;
                                int i30 = 0;
                                int i31 = 0;
                                int i32 = z11;
                                while (i29 < size2) {
                                    long j11 = 0;
                                    dh.b bVar3 = (dh.b) arrayList2.get(i29);
                                    if (bVar3.f26169a == i15) {
                                        int i33 = i30 + 1;
                                        uf1 uf1Var4 = bVar3.f26173b;
                                        uf1Var4.e(8);
                                        int iH10 = uf1Var4.h();
                                        arrayList = arrayList2;
                                        i52 i52Var = bVar.f29095d.f31196a;
                                        i17 = i29;
                                        k52 k52Var4 = bVar.f29093b;
                                        int i34 = i30;
                                        i00 i00Var3 = k52Var4.f29502a;
                                        int i35 = s82.f32899a;
                                        i18 = size2;
                                        k52Var4.f29508g[i34] = uf1Var4.x();
                                        long[] jArr2 = k52Var4.f29507f;
                                        int i36 = i31;
                                        long j12 = k52Var4.f29503b;
                                        jArr2[i34] = j12;
                                        if ((iH10 & 1) != 0) {
                                            jArr2[i34] = j12 + uf1Var4.h();
                                        }
                                        int i37 = (iH10 & 4) != 0 ? i32 : 0;
                                        int iH11 = i00Var3.f28430d;
                                        if (i37 != 0) {
                                            iH11 = uf1Var4.h();
                                        }
                                        int i38 = i37;
                                        int i39 = (iH10 & 256) != 0 ? i32 : 0;
                                        int i40 = (iH10 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? i32 : 0;
                                        int i41 = (iH10 & 1024) != 0 ? i32 : 0;
                                        int i42 = (iH10 & 2048) != 0 ? i32 : 0;
                                        int i43 = i41;
                                        long[] jArr3 = i52Var.f28504h;
                                        int i44 = iH11;
                                        if (jArr3 != null && jArr3.length == i32 && jArr3[0] == 0) {
                                            j11 = i52Var.i[0];
                                        }
                                        int[] iArr = k52Var4.f29509h;
                                        long[] jArr4 = k52Var4.i;
                                        boolean[] zArr = k52Var4.f29510j;
                                        int i45 = i36 + k52Var4.f29508g[i34];
                                        i19 = size;
                                        i20 = i24;
                                        long j13 = i52Var.f28499c;
                                        long j14 = k52Var4.f29516p;
                                        int i46 = i36;
                                        while (i46 < i45) {
                                            if (i39 != 0) {
                                                i21 = i46;
                                                iH5 = uf1Var4.h();
                                            } else {
                                                i21 = i46;
                                                iH5 = i00Var3.f28428b;
                                            }
                                            int i47 = i45;
                                            if (iH5 < 0) {
                                                throw yf1.a("Unexpected negative value: " + iH5, (Exception) null);
                                            }
                                            if (i40 != 0) {
                                                jArr = jArr4;
                                                iH6 = uf1Var4.h();
                                            } else {
                                                jArr = jArr4;
                                                iH6 = i00Var3.f28429c;
                                            }
                                            if (iH6 < 0) {
                                                throw yf1.a("Unexpected negative value: " + iH6, (Exception) null);
                                            }
                                            if (i43 != 0) {
                                                iH7 = uf1Var4.h();
                                            } else {
                                                iH7 = (i21 != 0 || i38 == 0) ? i00Var3.f28430d : i44;
                                            }
                                            if (i42 != 0) {
                                                i00Var = i00Var3;
                                                iH8 = uf1Var4.h();
                                            } else {
                                                i00Var = i00Var3;
                                                iH8 = 0;
                                            }
                                            uf1 uf1Var5 = uf1Var4;
                                            int i48 = i33;
                                            long jA = s82.a((iH8 + j14) - j11, 1000000L, j13);
                                            jArr[i21] = jA;
                                            if (!k52Var4.f29517q) {
                                                jArr[i21] = jA + bVar.f29095d.f31203h;
                                            }
                                            iArr[i21] = iH6;
                                            zArr[i21] = ((iH7 >> 16) & 1) == 0;
                                            j14 += iH5;
                                            i46 = i21 + 1;
                                            i45 = i47;
                                            jArr4 = jArr;
                                            i00Var3 = i00Var;
                                            i33 = i48;
                                            uf1Var4 = uf1Var5;
                                        }
                                        k52Var4.f29516p = j14;
                                        i31 = i45;
                                        i30 = i33;
                                    } else {
                                        arrayList = arrayList2;
                                        i17 = i29;
                                        i18 = size2;
                                        i19 = size;
                                        i20 = i24;
                                    }
                                    i29 = i17 + 1;
                                    arrayList2 = arrayList;
                                    size2 = i18;
                                    size = i19;
                                    i24 = i20;
                                    i15 = 1953658222;
                                    i32 = 1;
                                }
                                i11 = size;
                                i12 = i24;
                                i52 i52Var2 = bVar.f29095d.f31196a;
                                i00 i00Var4 = k52Var2.f29502a;
                                i00Var4.getClass();
                                j52 j52VarA = i52Var2.a(i00Var4.f28427a);
                                dh.b bVarC3 = aVar.c(1935763834);
                                if (bVarC3 != null) {
                                    j52VarA.getClass();
                                    uf1 uf1Var6 = bVarC3.f26173b;
                                    int i49 = j52VarA.f28978d;
                                    uf1Var6.e(8);
                                    if ((uf1Var6.h() & 1) == 1) {
                                        uf1Var6.f(8);
                                    }
                                    int iT = uf1Var6.t();
                                    int iX2 = uf1Var6.x();
                                    if (iX2 <= k52Var2.f29506e) {
                                        if (iT == 0) {
                                            boolean[] zArr2 = k52Var2.f29512l;
                                            i16 = 0;
                                            for (int i50 = 0; i50 < iX2; i50++) {
                                                int iT2 = uf1Var6.t();
                                                i16 += iT2;
                                                zArr2[i50] = iT2 > i49;
                                            }
                                            z12 = false;
                                        } else {
                                            boolean z16 = iT > i49;
                                            i16 = iT * iX2;
                                            z12 = false;
                                            Arrays.fill(k52Var2.f29512l, 0, iX2, z16);
                                        }
                                        Arrays.fill(k52Var2.f29512l, iX2, k52Var2.f29506e, z12);
                                        if (i16 > 0) {
                                            k52Var2.f29514n.c(i16);
                                            k52Var2.f29511k = true;
                                            k52Var2.f29515o = true;
                                        }
                                    } else {
                                        StringBuilder sbJ = C4356c.j(iX2, "Saiz sample count ", " is greater than fragment sample count");
                                        sbJ.append(k52Var2.f29506e);
                                        throw yf1.a(sbJ.toString(), (Exception) null);
                                    }
                                }
                                dh.b bVarC4 = aVar.c(1935763823);
                                if (bVarC4 != null) {
                                    uf1 uf1Var7 = bVarC4.f26173b;
                                    uf1Var7.e(8);
                                    int iH12 = uf1Var7.h();
                                    if ((iH12 & 1) == 1) {
                                        uf1Var7.f(8);
                                    }
                                    int iX3 = uf1Var7.x();
                                    if (iX3 != 1) {
                                        throw yf1.a("Unexpected saio entry count: " + iX3, (Exception) null);
                                    }
                                    k52Var2.f29504c += ((iH12 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0 ? uf1Var7.v() : uf1Var7.y();
                                }
                                dh.b bVarC5 = aVar.c(1936027235);
                                if (bVarC5 != null) {
                                    a(bVarC5.f26173b, 0, k52Var2);
                                }
                                String str = j52VarA != null ? j52VarA.f28976b : null;
                                uf1 uf1Var8 = null;
                                uf1 uf1Var9 = null;
                                for (int i51 = 0; i51 < aVar.f26171c.size(); i51++) {
                                    dh.b bVar4 = (dh.b) aVar.f26171c.get(i51);
                                    uf1 uf1Var10 = bVar4.f26173b;
                                    int i52 = bVar4.f26169a;
                                    if (i52 == 1935828848) {
                                        uf1Var10.e(12);
                                        if (uf1Var10.h() == 1936025959) {
                                            uf1Var8 = uf1Var10;
                                        }
                                    } else if (i52 == 1936158820) {
                                        uf1Var10.e(12);
                                        if (uf1Var10.h() == 1936025959) {
                                            uf1Var9 = uf1Var10;
                                        }
                                    }
                                }
                                if (uf1Var8 != null && uf1Var9 != null) {
                                    uf1Var8.e(8);
                                    int iH13 = (uf1Var8.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    int i53 = i14;
                                    uf1Var8.f(i53);
                                    if (iH13 == 1) {
                                        uf1Var8.f(i53);
                                    }
                                    if (uf1Var8.h() == 1) {
                                        uf1Var9.e(8);
                                        int iH14 = (uf1Var9.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                        uf1Var9.f(i53);
                                        if (iH14 == 1) {
                                            if (uf1Var9.v() == 0) {
                                                throw yf1.a("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iH14 >= i13) {
                                            uf1Var9.f(i53);
                                        }
                                        if (uf1Var9.v() == 1) {
                                            uf1Var9.f(1);
                                            int iT3 = uf1Var9.t();
                                            int i54 = (iT3 & 240) >> 4;
                                            int i55 = iT3 & 15;
                                            boolean z17 = uf1Var9.t() == 1;
                                            if (z17) {
                                                int iT4 = uf1Var9.t();
                                                byte[] bArr3 = new byte[16];
                                                uf1Var9.a(bArr3, 0, 16);
                                                if (iT4 == 0) {
                                                    int iT5 = uf1Var9.t();
                                                    byte[] bArr4 = new byte[iT5];
                                                    uf1Var9.a(bArr4, 0, iT5);
                                                    bArr = bArr4;
                                                } else {
                                                    bArr = null;
                                                }
                                                k52Var2.f29511k = true;
                                                k52Var2.f29513m = new j52(z17, str, iT4, bArr3, i54, i55, bArr);
                                            }
                                        } else {
                                            throw yf1.a("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw yf1.a("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size3 = aVar.f26171c.size();
                                for (int i56 = 0; i56 < size3; i56++) {
                                    dh.b bVar5 = (dh.b) aVar.f26171c.get(i56);
                                    if (bVar5.f26169a == 1970628964) {
                                        uf1 uf1Var11 = bVar5.f26173b;
                                        uf1Var11.e(8);
                                        uf1Var11.a(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, f29057F)) {
                                            a(uf1Var11, 16, k52Var2);
                                        }
                                    }
                                }
                                i10 = 8;
                            }
                        } else {
                            i10 = i22;
                            boolean z18 = z13 ? 1 : 0;
                            sparseArray = sparseArray2;
                            i11 = size;
                            i12 = i24;
                        }
                        i24 = i12 + 1;
                        i22 = i10;
                        sparseArray2 = sparseArray;
                        size = i11;
                        z13 = true;
                    }
                    i = i22;
                    a40 a40VarA = a(aVarPop.f26171c);
                    if (a40VarA != null) {
                        int size4 = this.f29065b.size();
                        for (int i57 = 0; i57 < size4; i57++) {
                            b bVarValueAt = this.f29065b.valueAt(i57);
                            i52 i52Var3 = bVarValueAt.f29095d.f31196a;
                            i00 i00Var5 = bVarValueAt.f29093b.f29502a;
                            int i58 = s82.f32899a;
                            j52 j52VarA2 = i52Var3.a(i00Var5.f28427a);
                            bVarValueAt.f29092a.a(bVarValueAt.f29095d.f31196a.f28502f.a().a(a40VarA.a(j52VarA2 != null ? j52VarA2.f28976b : null)).a());
                        }
                    }
                    if (this.f29082t != -9223372036854775807L) {
                        int size5 = this.f29065b.size();
                        for (int i59 = 0; i59 < size5; i59++) {
                            b bVarValueAt2 = this.f29065b.valueAt(i59);
                            long j15 = this.f29082t;
                            int i60 = bVarValueAt2.f29097f;
                            while (true) {
                                k52 k52Var5 = bVarValueAt2.f29093b;
                                if (i60 >= k52Var5.f29506e || k52Var5.i[i60] >= j15) {
                                    break;
                                }
                                if (k52Var5.f29510j[i60]) {
                                    bVarValueAt2.i = i60;
                                }
                                i60++;
                            }
                        }
                        z10 = true;
                        this.f29082t = -9223372036854775807L;
                    } else {
                        z10 = true;
                    }
                } else {
                    i = i22;
                    z10 = z13 ? 1 : 0;
                    if (!this.f29072j.isEmpty()) {
                        this.f29072j.peek().f26172d.add(aVarPop);
                    }
                }
                i22 = i;
                z13 = z10;
            }
        }
        this.f29075m = 0;
        this.f29078p = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0212, code lost:
    
        if ((r18 & 31) == r4) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0218, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021f, code lost:
    
        if (((r18 & 126) >> r8) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0221, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0223, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0224, code lost:
    
        r29.f29059A = r9;
        r29.f29087y += 5;
        r29.f29086x += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0231, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023a, code lost:
    
        throw com.yandex.mobile.ads.impl.yf1.a("Invalid NAL length", (java.lang.Exception) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x023d, code lost:
    
        if (r29.f29059A == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023f, code lost:
    
        r29.f29068e.c(r12);
        r26 = r8;
        ((com.yandex.mobile.ads.impl.rz) r30).a(r29.f29068e.c(), 0, r29.f29088z, false);
        r6.a(r29.f29088z, r29.f29068e);
        r4 = r29.f29088z;
        r8 = com.yandex.mobile.ads.impl.u31.a(r29.f29068e.e(), r29.f29068e.c());
        r29.f29068e.e("video/hevc".equals(r5.f28502f.f26083m) ? 1 : 0);
        r29.f29068e.d(r8);
        com.yandex.mobile.ads.impl.xn.a(r10, r29.f29068e, r29.f29062D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0288, code lost:
    
        r26 = r8;
        r4 = r6.b(r30, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x028f, code lost:
    
        r29.f29087y += r4;
        r29.f29088z -= r4;
        r8 = r26;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x029d, code lost:
    
        r26 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a0, code lost:
    
        r26 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a2, code lost:
    
        r3 = r29.f29087y;
        r4 = r29.f29086x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a6, code lost:
    
        if (r3 >= r4) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a8, code lost:
    
        r29.f29087y += r6.b(r30, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b8, code lost:
    
        if (r2.f29102l != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ba, code lost:
    
        r1 = r2.f29095d.f31202g[r2.f29097f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02cb, code lost:
    
        if (r2.f29093b.f29510j[r2.f29097f] == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02cd, code lost:
    
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02d0, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02d5, code lost:
    
        if (r2.a() == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02d7, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02da, code lost:
    
        r21 = r1;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02e0, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02e2, code lost:
    
        r24 = r1.f28977c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02e7, code lost:
    
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e9, code lost:
    
        r19 = r10;
        r6.a(r19, r21, r29.f29086x, 0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02fc, code lost:
    
        if (r29.f29073k.isEmpty() != false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02fe, code lost:
    
        r1 = r29.f29073k.removeFirst();
        r29.f29081s -= r1.f29091c;
        r3 = r1.f29089a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0311, code lost:
    
        if (r1.f29090b == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0313, code lost:
    
        r3 = r3 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0315, code lost:
    
        r9 = r3;
        r3 = r29.f29061C;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x031a, code lost:
    
        if (r5 >= r4) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x031c, code lost:
    
        r3[r5].a(r9, 1, r1.f29091c, r29.f29081s, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x032a, code lost:
    
        r2.f29097f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0334, code lost:
    
        if (r2.f29102l != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0336, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0338, code lost:
    
        r1 = r2.f29098g + 1;
        r2.f29098g = r1;
        r3 = r2.f29093b.f29508g;
        r4 = r2.f29099h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0346, code lost:
    
        if (r1 != r3[r4]) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0348, code lost:
    
        r2.f29099h = r4 + 1;
        r8 = 0;
        r2.f29098g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x034f, code lost:
    
        r29.f29085w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0353, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0355, code lost:
    
        r29.f29075m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0357, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r29.f29075m != 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
    
        if (r2.f29102l != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        r3 = r2.f29095d.f31199d[r2.f29097f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        r3 = r2.f29093b.f29509h[r2.f29097f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        r29.f29086x = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        if (r2.f29097f >= r2.i) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ee, code lost:
    
        ((com.yandex.mobile.ads.impl.rz) r30).a(r3);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f7, code lost:
    
        if (r1 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fa, code lost:
    
        r3 = r2.f29093b.f29514n;
        r1 = r1.f28978d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0100, code lost:
    
        if (r1 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        r3.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0105, code lost:
    
        r1 = r2.f29093b;
        r5 = r2.f29097f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010b, code lost:
    
        if (r1.f29511k == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0111, code lost:
    
        if (r1.f29512l[r5] == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0113, code lost:
    
        r3.f(r3.z() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011b, code lost:
    
        r2.f29097f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0124, code lost:
    
        if (r2.f29102l != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0127, code lost:
    
        r1 = r2.f29098g + 1;
        r2.f29098g = r1;
        r3 = r2.f29093b.f29508g;
        r4 = r2.f29099h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0134, code lost:
    
        if (r1 != r3[r4]) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        r2.f29099h = r4 + 1;
        r2.f29098g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013b, code lost:
    
        r29.f29085w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013d, code lost:
    
        r29.f29075m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0148, code lost:
    
        if (r2.f29095d.f31196a.f28503g != 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
    
        r29.f29086x = r3 - 8;
        ((com.yandex.mobile.ads.impl.rz) r30).a(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0164, code lost:
    
        if ("audio/ac4".equals(r2.f29095d.f31196a.f28502f.f26083m) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0166, code lost:
    
        r29.f29087y = r2.a(r29.f29086x, 7);
        com.yandex.mobile.ads.impl.C4193s.a(r29.f29086x, r29.f29070g);
        r2.f29092a.a(7, r29.f29070g);
        r29.f29087y += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
    
        r29.f29087y = r2.a(r29.f29086x, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018b, code lost:
    
        r29.f29086x += r29.f29087y;
        r29.f29075m = 4;
        r29.f29088z = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0197, code lost:
    
        r3 = r2.f29095d;
        r5 = r3.f31196a;
        r6 = r2.f29092a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a1, code lost:
    
        if (r2.f29102l != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a3, code lost:
    
        r10 = r3.f31201f[r2.f29097f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
    
        r10 = r2.f29093b.i[r2.f29097f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b4, code lost:
    
        if (r5.f28505j == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b6, code lost:
    
        r3 = r29.f29067d.c();
        r3[0] = 0;
        r3[1] = 0;
        r3[r31] = 0;
        r13 = r5.f28505j;
        r14 = r13 + 1;
        r13 = 4 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ce, code lost:
    
        if (r29.f29087y >= r29.f29086x) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
    
        r12 = r29.f29088z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d4, code lost:
    
        if (r12 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d6, code lost:
    
        ((com.yandex.mobile.ads.impl.rz) r30).a(r3, r13, r14, r9);
        r29.f29067d.e(r9);
        r12 = r29.f29067d.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e7, code lost:
    
        if (r12 < r8) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e9, code lost:
    
        r29.f29088z = r12 - 1;
        r29.f29066c.e(r9);
        r6.a(4, r29.f29066c);
        r6.a(r8, r29.f29067d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0200, code lost:
    
        if (r29.f29062D.length <= 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0202, code lost:
    
        r12 = r5.f28502f.f26083m;
        r18 = r3[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020e, code lost:
    
        if ("video/avc".equals(r12) == false) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.v70 r30, com.yandex.mobile.ads.impl.jj1 r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jc0.a(com.yandex.mobile.ads.impl.v70, com.yandex.mobile.ads.impl.jj1):int");
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        int size = this.f29065b.size();
        for (int i = 0; i < size; i++) {
            this.f29065b.valueAt(i).b();
        }
        this.f29073k.clear();
        this.f29081s = 0;
        this.f29082t = j10;
        this.f29072j.clear();
        this.f29075m = 0;
        this.f29078p = 0;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        return i02.a((rz) v70Var);
    }

    private static u70[] a() {
        return new u70[]{new jc0(0)};
    }
}
