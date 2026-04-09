package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class sm1 implements u70 {

    /* renamed from: a, reason: collision with root package name */
    private final c52 f33123a;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33127e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33128f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33129g;

    /* renamed from: h, reason: collision with root package name */
    private long f33130h;
    private qm1 i;

    /* renamed from: j, reason: collision with root package name */
    private w70 f33131j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33132k;

    /* renamed from: c, reason: collision with root package name */
    private final uf1 f33125c = new uf1(4096);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f33124b = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    private final rm1 f33126d = new rm1();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final w40 f33133a;

        /* renamed from: b, reason: collision with root package name */
        private final c52 f33134b;

        /* renamed from: c, reason: collision with root package name */
        private final tf1 f33135c = new tf1(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        private boolean f33136d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f33137e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f33138f;

        /* renamed from: g, reason: collision with root package name */
        private long f33139g;

        public a(w40 w40Var, c52 c52Var) {
            this.f33133a = w40Var;
            this.f33134b = c52Var;
        }
    }

    public sm1(c52 c52Var) {
        this.f33123a = c52Var;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f33131j = w70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.v70 r18, com.yandex.mobile.ads.impl.jj1 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sm1.a(com.yandex.mobile.ads.impl.v70, com.yandex.mobile.ads.impl.jj1):int");
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r5, long r7) {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.c52 r5 = r4.f33123a
            long r5 = r5.c()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r6 = 0
            if (r5 != 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = r6
        L13:
            if (r5 != 0) goto L2a
            com.yandex.mobile.ads.impl.c52 r5 = r4.f33123a
            long r2 = r5.a()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L31
            goto L2c
        L2a:
            if (r5 == 0) goto L31
        L2c:
            com.yandex.mobile.ads.impl.c52 r5 = r4.f33123a
            r5.c(r7)
        L31:
            com.yandex.mobile.ads.impl.qm1 r5 = r4.i
            if (r5 == 0) goto L38
            r5.a(r7)
        L38:
            r5 = r6
        L39:
            android.util.SparseArray<com.yandex.mobile.ads.impl.sm1$a> r7 = r4.f33124b
            int r7 = r7.size()
            if (r5 >= r7) goto L56
            android.util.SparseArray<com.yandex.mobile.ads.impl.sm1$a> r7 = r4.f33124b
            java.lang.Object r7 = r7.valueAt(r5)
            com.yandex.mobile.ads.impl.sm1$a r7 = (com.yandex.mobile.ads.impl.sm1.a) r7
            com.yandex.mobile.ads.impl.sm1.a.j(r7, r6)
            com.yandex.mobile.ads.impl.w40 r7 = com.yandex.mobile.ads.impl.sm1.a.a(r7)
            r7.a()
            int r5 = r5 + 1
            goto L39
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sm1.a(long, long):void");
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        byte[] bArr = new byte[14];
        rz rzVar = (rz) v70Var;
        rzVar.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        rzVar.a(false, bArr[13] & 7);
        rzVar.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    private static u70[] a() {
        return new u70[]{new sm1(new c52(0L))};
    }
}
