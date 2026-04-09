package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc0;
import g0.C4356c;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class yi2 implements u70 {

    /* renamed from: a, reason: collision with root package name */
    private w70 f35805a;

    /* renamed from: b, reason: collision with root package name */
    private n52 f35806b;

    /* renamed from: e, reason: collision with root package name */
    private b f35809e;

    /* renamed from: c, reason: collision with root package name */
    private int f35807c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f35808d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f35810f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f35811g = -1;

    public static final class a implements b {

        /* renamed from: m, reason: collision with root package name */
        private static final int[] f35812m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        private static final int[] f35813n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        private final w70 f35814a;

        /* renamed from: b, reason: collision with root package name */
        private final n52 f35815b;

        /* renamed from: c, reason: collision with root package name */
        private final zi2 f35816c;

        /* renamed from: d, reason: collision with root package name */
        private final int f35817d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f35818e;

        /* renamed from: f, reason: collision with root package name */
        private final uf1 f35819f;

        /* renamed from: g, reason: collision with root package name */
        private final int f35820g;

        /* renamed from: h, reason: collision with root package name */
        private final dc0 f35821h;
        private int i;

        /* renamed from: j, reason: collision with root package name */
        private long f35822j;

        /* renamed from: k, reason: collision with root package name */
        private int f35823k;

        /* renamed from: l, reason: collision with root package name */
        private long f35824l;

        public a(w70 w70Var, n52 n52Var, zi2 zi2Var) throws yf1 {
            this.f35814a = w70Var;
            this.f35815b = n52Var;
            this.f35816c = zi2Var;
            int iMax = Math.max(1, zi2Var.f36521c / 10);
            this.f35820g = iMax;
            uf1 uf1Var = new uf1(zi2Var.f36524f);
            uf1Var.o();
            int iO = uf1Var.o();
            this.f35817d = iO;
            int i = zi2Var.f36520b;
            int i10 = (((zi2Var.f36522d - (i * 4)) * 8) / (zi2Var.f36523e * i)) + 1;
            if (iO != i10) {
                throw yf1.a("Expected frames per block: " + i10 + "; got: " + iO, (Exception) null);
            }
            int iA = s82.a(iMax, iO);
            this.f35818e = new byte[zi2Var.f36522d * iA];
            this.f35819f = new uf1(iA * a(iO, i));
            int i11 = ((zi2Var.f36521c * zi2Var.f36522d) * 8) / iO;
            this.f35821h = new dc0.a().e("audio/raw").b(i11).j(i11).h(a(iMax, i)).c(zi2Var.f36520b).l(zi2Var.f36521c).i(2).a();
        }

        private static int a(int i, int i10) {
            return i * 2 * i10;
        }

        @Override // com.yandex.mobile.ads.impl.yi2.b
        public final void a(int i, long j4) {
            this.f35814a.a(new bj2(this.f35816c, this.f35817d, i, j4));
            this.f35815b.a(this.f35821h);
        }

        @Override // com.yandex.mobile.ads.impl.yi2.b
        public final void a(long j4) {
            this.i = 0;
            this.f35822j = j4;
            this.f35823k = 0;
            this.f35824l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:11:0x0040). Please report as a decompilation issue!!! */
        @Override // com.yandex.mobile.ads.impl.yi2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(com.yandex.mobile.ads.impl.rz r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 453
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yi2.a.a(com.yandex.mobile.ads.impl.rz, long):boolean");
        }
    }

    public interface b {
        void a(int i, long j4) throws yf1;

        void a(long j4);

        boolean a(rz rzVar, long j4) throws IOException;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f35805a = w70Var;
        this.f35806b = w70Var.a(0, 1);
        w70Var.a();
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final w70 f35825a;

        /* renamed from: b, reason: collision with root package name */
        private final n52 f35826b;

        /* renamed from: c, reason: collision with root package name */
        private final zi2 f35827c;

        /* renamed from: d, reason: collision with root package name */
        private final dc0 f35828d;

        /* renamed from: e, reason: collision with root package name */
        private final int f35829e;

        /* renamed from: f, reason: collision with root package name */
        private long f35830f;

        /* renamed from: g, reason: collision with root package name */
        private int f35831g;

        /* renamed from: h, reason: collision with root package name */
        private long f35832h;

        public c(w70 w70Var, n52 n52Var, zi2 zi2Var, String str, int i) throws yf1 {
            this.f35825a = w70Var;
            this.f35826b = n52Var;
            this.f35827c = zi2Var;
            int i10 = (zi2Var.f36520b * zi2Var.f36523e) / 8;
            if (zi2Var.f36522d != i10) {
                StringBuilder sbJ = C4356c.j(i10, "Expected block size: ", "; got: ");
                sbJ.append(zi2Var.f36522d);
                throw yf1.a(sbJ.toString(), (Exception) null);
            }
            int i11 = zi2Var.f36521c * i10;
            int i12 = i11 * 8;
            int iMax = Math.max(i10, i11 / 10);
            this.f35829e = iMax;
            this.f35828d = new dc0.a().e(str).b(i12).j(i12).h(iMax).c(zi2Var.f36520b).l(zi2Var.f36521c).i(i).a();
        }

        @Override // com.yandex.mobile.ads.impl.yi2.b
        public final void a(int i, long j4) {
            this.f35825a.a(new bj2(this.f35827c, 1, i, j4));
            this.f35826b.a(this.f35828d);
        }

        @Override // com.yandex.mobile.ads.impl.yi2.b
        public final void a(long j4) {
            this.f35830f = j4;
            this.f35831g = 0;
            this.f35832h = 0L;
        }

        @Override // com.yandex.mobile.ads.impl.yi2.b
        public final boolean a(rz rzVar, long j4) throws IOException {
            int i;
            int i10;
            long j10 = j4;
            while (j10 > 0 && (i = this.f35831g) < (i10 = this.f35829e)) {
                int iB = this.f35826b.b(rzVar, (int) Math.min(i10 - i, j10), true);
                if (iB == -1) {
                    j10 = 0;
                } else {
                    this.f35831g += iB;
                    j10 -= iB;
                }
            }
            int i11 = this.f35827c.f36522d;
            int i12 = this.f35831g / i11;
            if (i12 > 0) {
                long jA = this.f35830f + s82.a(this.f35832h, 1000000L, r1.f36521c);
                int i13 = i12 * i11;
                int i14 = this.f35831g - i13;
                this.f35826b.a(jA, 1, i13, i14, null);
                this.f35832h += i12;
                this.f35831g = i14;
            }
            return j10 <= 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
    
        if (r1 != 65534) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.v70 r17, com.yandex.mobile.ads.impl.jj1 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yi2.a(com.yandex.mobile.ads.impl.v70, com.yandex.mobile.ads.impl.jj1):int");
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        this.f35807c = j4 == 0 ? 0 : 4;
        b bVar = this.f35809e;
        if (bVar != null) {
            bVar.a(j10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        return aj2.a((rz) v70Var);
    }

    private static /* synthetic */ u70[] a() {
        return new u70[]{new yi2()};
    }
}
