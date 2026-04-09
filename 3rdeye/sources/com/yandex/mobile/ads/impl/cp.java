package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dw0;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class cp implements dw0, dw0.a {

    /* renamed from: b, reason: collision with root package name */
    public final dw0 f25736b;

    /* renamed from: c, reason: collision with root package name */
    private dw0.a f25737c;

    /* renamed from: d, reason: collision with root package name */
    private a[] f25738d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    private long f25739e;

    /* renamed from: f, reason: collision with root package name */
    long f25740f;

    /* renamed from: g, reason: collision with root package name */
    long f25741g;

    public final class a implements ft1 {

        /* renamed from: a, reason: collision with root package name */
        public final ft1 f25742a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f25743b;

        public a(ft1 ft1Var) {
            this.f25742a = ft1Var;
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final boolean d() {
            return cp.this.f25739e == -9223372036854775807L && this.f25742a.d();
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final void a() throws IOException {
            this.f25742a.a();
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final int a(ec0 ec0Var, my myVar, int i) {
            if (cp.this.f25739e != -9223372036854775807L) {
                return -3;
            }
            if (this.f25743b) {
                myVar.d(4);
                return -4;
            }
            int iA = this.f25742a.a(ec0Var, myVar, i);
            if (iA == -5) {
                dc0 dc0Var = ec0Var.f26789b;
                dc0Var.getClass();
                int i10 = dc0Var.f26068C;
                if (i10 != 0 || dc0Var.f26069D != 0) {
                    cp cpVar = cp.this;
                    if (cpVar.f25740f != 0) {
                        i10 = 0;
                    }
                    ec0Var.f26789b = dc0Var.a().d(i10).e(cpVar.f25741g == Long.MIN_VALUE ? dc0Var.f26069D : 0).a();
                }
                return -5;
            }
            cp cpVar2 = cp.this;
            long j4 = cpVar2.f25741g;
            if (j4 == Long.MIN_VALUE || ((iA != -4 || myVar.f30574f < j4) && !(iA == -3 && cpVar2.getBufferedPositionUs() == Long.MIN_VALUE && !myVar.f30573e))) {
                return iA;
            }
            myVar.b();
            myVar.d(4);
            this.f25743b = true;
            return -4;
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final int a(long j4) {
            if (cp.this.f25739e != -9223372036854775807L) {
                return -3;
            }
            return this.f25742a.a(j4);
        }
    }

    public cp(dw0 dw0Var, boolean z10, long j4, long j10) {
        this.f25736b = dw0Var;
        this.f25739e = z10 ? j4 : -9223372036854775807L;
        this.f25740f = j4;
        this.f25741g = j10;
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean continueLoading(long j4) {
        return this.f25736b.continueLoading(j4);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void discardBuffer(long j4, boolean z10) {
        this.f25736b.discardBuffer(j4, z10);
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f25736b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j4 = this.f25741g;
            if (j4 == Long.MIN_VALUE || bufferedPositionUs < j4) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f25736b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j4 = this.f25741g;
            if (j4 == Long.MIN_VALUE || nextLoadPositionUs < j4) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final m52 getTrackGroups() {
        return this.f25736b.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean isLoading() {
        return this.f25736b.isLoading();
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void maybeThrowPrepareError() throws IOException {
        this.f25736b.maybeThrowPrepareError();
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final long readDiscontinuity() {
        long j4 = this.f25739e;
        if (j4 != -9223372036854775807L) {
            this.f25739e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j4;
        }
        long discontinuity2 = this.f25736b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (discontinuity2 < this.f25740f) {
            throw new IllegalStateException();
        }
        long j10 = this.f25741g;
        if (j10 == Long.MIN_VALUE || discontinuity2 <= j10) {
            return discontinuity2;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final void reevaluateBuffer(long j4) {
        this.f25736b.reevaluateBuffer(j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0 > r5) goto L17;
     */
    @Override // com.yandex.mobile.ads.impl.dw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r5) {
        /*
            r4 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.f25739e = r0
            com.yandex.mobile.ads.impl.cp$a[] r0 = r4.f25738d
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L17
            r3 = r0[r2]
            if (r3 == 0) goto L14
            com.yandex.mobile.ads.impl.cp.a.a(r3)
        L14:
            int r2 = r2 + 1
            goto Lb
        L17:
            com.yandex.mobile.ads.impl.dw0 r0 = r4.f25736b
            long r0 = r0.seekToUs(r5)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 == 0) goto L3a
            long r5 = r4.f25740f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L34
            long r5 = r4.f25741g
            r2 = -9223372036854775808
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L3a
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L34
            goto L3a
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cp.seekToUs(long):long");
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final long a(long j4, uw1 uw1Var) {
        long j10 = this.f25740f;
        if (j4 == j10) {
            return j10;
        }
        int i = s82.f32899a;
        long jMax = Math.max(0L, Math.min(uw1Var.f34232a, j4 - j10));
        long j11 = uw1Var.f34233b;
        long j12 = this.f25741g;
        long jMax2 = Math.max(0L, Math.min(j11, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j4));
        if (jMax != uw1Var.f34232a || jMax2 != uw1Var.f34233b) {
            uw1Var = new uw1(jMax, jMax2);
        }
        return this.f25736b.a(j4, uw1Var);
    }

    @Override // com.yandex.mobile.ads.impl.bx1.a
    public final void a(bx1 bx1Var) {
        dw0.a aVar = this.f25737c;
        aVar.getClass();
        aVar.a((dw0.a) this);
    }

    @Override // com.yandex.mobile.ads.impl.dw0.a
    public final void a(dw0 dw0Var) {
        dw0.a aVar = this.f25737c;
        aVar.getClass();
        aVar.a((dw0) this);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(dw0.a aVar, long j4) {
        this.f25737c = aVar;
        this.f25736b.a(this, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r11 > r1) goto L32;
     */
    @Override // com.yandex.mobile.ads.impl.dw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.yandex.mobile.ads.impl.c70[] r18, boolean[] r19, com.yandex.mobile.ads.impl.ft1[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r0 = r17
            r8 = r20
            int r1 = r8.length
            com.yandex.mobile.ads.impl.cp$a[] r1 = new com.yandex.mobile.ads.impl.cp.a[r1]
            r0.f25738d = r1
            int r1 = r8.length
            com.yandex.mobile.ads.impl.ft1[] r4 = new com.yandex.mobile.ads.impl.ft1[r1]
            r9 = 0
            r1 = r9
        Le:
            int r2 = r8.length
            r10 = 0
            if (r1 >= r2) goto L23
            com.yandex.mobile.ads.impl.cp$a[] r2 = r0.f25738d
            r3 = r8[r1]
            com.yandex.mobile.ads.impl.cp$a r3 = (com.yandex.mobile.ads.impl.cp.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            com.yandex.mobile.ads.impl.ft1 r10 = r3.f25742a
        L1e:
            r4[r1] = r10
            int r1 = r1 + 1
            goto Le
        L23:
            com.yandex.mobile.ads.impl.dw0 r1 = r0.f25736b
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            long r11 = r1.a(r2, r3, r4, r5, r6)
            long r5 = r0.f25739e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L63
            long r5 = r0.f25740f
            int r1 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r1 != 0) goto L63
            r15 = 0
            int r1 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r1 == 0) goto L63
            int r1 = r2.length
            r3 = r9
        L4a:
            if (r3 >= r1) goto L63
            r5 = r2[r3]
            if (r5 == 0) goto L60
            com.yandex.mobile.ads.impl.dc0 r5 = r5.e()
            java.lang.String r6 = r5.f26083m
            java.lang.String r5 = r5.f26080j
            boolean r5 = com.yandex.mobile.ads.impl.k01.a(r6, r5)
            if (r5 != 0) goto L60
            r13 = r11
            goto L63
        L60:
            int r3 = r3 + 1
            goto L4a
        L63:
            r0.f25739e = r13
            int r1 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r1 == 0) goto L82
            long r1 = r0.f25740f
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 < 0) goto L7c
            long r1 = r0.f25741g
            r5 = -9223372036854775808
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L82
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 > 0) goto L7c
            goto L82
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L82:
            int r1 = r8.length
            if (r9 >= r1) goto La8
            r1 = r4[r9]
            if (r1 != 0) goto L8e
            com.yandex.mobile.ads.impl.cp$a[] r1 = r0.f25738d
            r1[r9] = r10
            goto L9f
        L8e:
            com.yandex.mobile.ads.impl.cp$a[] r2 = r0.f25738d
            r3 = r2[r9]
            if (r3 == 0) goto L98
            com.yandex.mobile.ads.impl.ft1 r3 = r3.f25742a
            if (r3 == r1) goto L9f
        L98:
            com.yandex.mobile.ads.impl.cp$a r3 = new com.yandex.mobile.ads.impl.cp$a
            r3.<init>(r1)
            r2[r9] = r3
        L9f:
            com.yandex.mobile.ads.impl.cp$a[] r1 = r0.f25738d
            r1 = r1[r9]
            r8[r9] = r1
            int r9 = r9 + 1
            goto L82
        La8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cp.a(com.yandex.mobile.ads.impl.c70[], boolean[], com.yandex.mobile.ads.impl.ft1[], boolean[], long):long");
    }

    public final void a(long j4) {
        this.f25740f = 0L;
        this.f25741g = j4;
    }
}
