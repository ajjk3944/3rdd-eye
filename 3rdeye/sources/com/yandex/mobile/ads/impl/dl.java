package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class dl {

    /* renamed from: a, reason: collision with root package name */
    protected final a f26220a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f26221b;

    /* renamed from: c, reason: collision with root package name */
    protected c f26222c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26223d;

    public static class a implements tw1 {

        /* renamed from: a, reason: collision with root package name */
        private final d f26224a;

        /* renamed from: b, reason: collision with root package name */
        private final long f26225b;

        /* renamed from: c, reason: collision with root package name */
        private final long f26226c = 0;

        /* renamed from: d, reason: collision with root package name */
        private final long f26227d;

        /* renamed from: e, reason: collision with root package name */
        private final long f26228e;

        /* renamed from: f, reason: collision with root package name */
        private final long f26229f;

        /* renamed from: g, reason: collision with root package name */
        private final long f26230g;

        public a(d dVar, long j4, long j10, long j11, long j12, long j13) {
            this.f26224a = dVar;
            this.f26225b = j4;
            this.f26227d = j10;
            this.f26228e = j11;
            this.f26229f = j12;
            this.f26230g = j13;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final long c() {
            return this.f26225b;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final tw1.a b(long j4) {
            vw1 vw1Var = new vw1(j4, c.a(this.f26224a.a(j4), this.f26226c, this.f26227d, this.f26228e, this.f26229f, this.f26230g));
            return new tw1.a(vw1Var, vw1Var);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f26231a;

        /* renamed from: b, reason: collision with root package name */
        private final long f26232b;

        /* renamed from: c, reason: collision with root package name */
        private final long f26233c;

        /* renamed from: d, reason: collision with root package name */
        private long f26234d;

        /* renamed from: e, reason: collision with root package name */
        private long f26235e;

        /* renamed from: f, reason: collision with root package name */
        private long f26236f;

        /* renamed from: g, reason: collision with root package name */
        private long f26237g;

        /* renamed from: h, reason: collision with root package name */
        private long f26238h;

        public c(long j4, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f26231a = j4;
            this.f26232b = j10;
            this.f26234d = j11;
            this.f26235e = j12;
            this.f26236f = j13;
            this.f26237g = j14;
            this.f26233c = j15;
            this.f26238h = a(j10, j11, j12, j13, j14, j15);
        }

        public static long a(long j4, long j10, long j11, long j12, long j13, long j14) {
            if (j12 + 1 >= j13 || j10 + 1 >= j11) {
                return j12;
            }
            long j15 = (long) ((j4 - j10) * ((j13 - j12) / (j11 - j10)));
            long j16 = j15 / 20;
            int i = s82.f32899a;
            return Math.max(j12, Math.min(((j15 + j12) - j14) - j16, j13 - 1));
        }
    }

    public interface d {
        long a(long j4);
    }

    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f26239d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f26240a;

        /* renamed from: b, reason: collision with root package name */
        private final long f26241b;

        /* renamed from: c, reason: collision with root package name */
        private final long f26242c;

        private e(int i, long j4, long j10) {
            this.f26240a = i;
            this.f26241b = j4;
            this.f26242c = j10;
        }

        public static e a(long j4, long j10) {
            return new e(-1, j4, j10);
        }

        public static e b(long j4, long j10) {
            return new e(-2, j4, j10);
        }

        public static e a(long j4) {
            return new e(0, -9223372036854775807L, j4);
        }
    }

    public interface f {
        e a(rz rzVar, long j4) throws IOException;

        void a();
    }

    public dl(d dVar, f fVar, long j4, long j10, long j11, long j12, long j13, int i) {
        this.f26221b = fVar;
        this.f26223d = i;
        this.f26220a = new a(dVar, j4, j10, j11, j12, j13);
    }

    public final a a() {
        return this.f26220a;
    }

    public final boolean b() {
        return this.f26222c != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0102, code lost:
    
        if (r8 != r19.a()) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0104, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        r20.f29169a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.rz r19, com.yandex.mobile.ads.impl.jj1 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.dl.a(com.yandex.mobile.ads.impl.rz, com.yandex.mobile.ads.impl.jj1):int");
    }

    public static final class b implements d {
        @Override // com.yandex.mobile.ads.impl.dl.d
        public final long a(long j4) {
            return j4;
        }
    }

    public final void a(long j4) {
        c cVar = this.f26222c;
        if (cVar == null || cVar.f26231a != j4) {
            long jA = this.f26220a.f26224a.a(j4);
            a aVar = this.f26220a;
            this.f26222c = new c(j4, jA, aVar.f26226c, aVar.f26227d, aVar.f26228e, aVar.f26229f, aVar.f26230g);
        }
    }
}
