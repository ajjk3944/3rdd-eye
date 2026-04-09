package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ii implements u70 {

    /* renamed from: c, reason: collision with root package name */
    private int f28682c;

    /* renamed from: e, reason: collision with root package name */
    private ji f28684e;

    /* renamed from: h, reason: collision with root package name */
    private long f28687h;
    private ho i;

    /* renamed from: m, reason: collision with root package name */
    private int f28691m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f28692n;

    /* renamed from: a, reason: collision with root package name */
    private final uf1 f28680a = new uf1(12);

    /* renamed from: b, reason: collision with root package name */
    private final b f28681b = new b(0);

    /* renamed from: d, reason: collision with root package name */
    private w70 f28683d = new l40();

    /* renamed from: g, reason: collision with root package name */
    private ho[] f28686g = new ho[0];

    /* renamed from: k, reason: collision with root package name */
    private long f28689k = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f28690l = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f28688j = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f28685f = -9223372036854775807L;

    public class a implements tw1 {

        /* renamed from: a, reason: collision with root package name */
        private final long f28693a;

        public a(long j4) {
            this.f28693a = j4;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final long c() {
            return this.f28693a;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final tw1.a b(long j4) {
            tw1.a aVarB = ii.this.f28686g[0].b(j4);
            int i = 1;
            while (true) {
                ho[] hoVarArr = ii.this.f28686g;
                if (i >= hoVarArr.length) {
                    return aVarB;
                }
                tw1.a aVarB2 = hoVarArr[i].b(j4);
                if (aVarB2.f33791a.f34728b < aVarB.f33791a.f34728b) {
                    aVarB = aVarB2;
                }
                i++;
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f28695a;

        /* renamed from: b, reason: collision with root package name */
        public int f28696b;

        /* renamed from: c, reason: collision with root package name */
        public int f28697c;

        public /* synthetic */ b(int i) {
            this();
        }

        private b() {
        }
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f28682c = 0;
        this.f28683d = w70Var;
        this.f28687h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x032d  */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.v70 r22, com.yandex.mobile.ads.impl.jj1 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ii.a(com.yandex.mobile.ads.impl.v70, com.yandex.mobile.ads.impl.jj1):int");
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        this.f28687h = -1L;
        this.i = null;
        for (ho hoVar : this.f28686g) {
            hoVar.c(j4);
        }
        if (j4 == 0) {
            if (this.f28686g.length == 0) {
                this.f28682c = 0;
                return;
            } else {
                this.f28682c = 3;
                return;
            }
        }
        this.f28682c = 6;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        ((rz) v70Var).b(this.f28680a.c(), 0, 12, false);
        this.f28680a.e(0);
        if (this.f28680a.k() != 1179011410) {
            return false;
        }
        this.f28680a.f(4);
        return this.f28680a.k() == 541677121;
    }
}
