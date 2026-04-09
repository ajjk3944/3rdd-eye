package b2;

import N7.B8;
import androidx.work.OverwritingInputMerger;
import androidx.work.t;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;

/* compiled from: WorkSpec.kt */
/* renamed from: b2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1842w {

    /* renamed from: x, reason: collision with root package name */
    public static final String f17136x;

    /* renamed from: y, reason: collision with root package name */
    public static final C1841v f17137y;

    /* renamed from: a, reason: collision with root package name */
    public final String f17138a;

    /* renamed from: b, reason: collision with root package name */
    public t.b f17139b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17140c;

    /* renamed from: d, reason: collision with root package name */
    public String f17141d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.e f17142e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.e f17143f;

    /* renamed from: g, reason: collision with root package name */
    public long f17144g;

    /* renamed from: h, reason: collision with root package name */
    public long f17145h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.work.d f17146j;

    /* renamed from: k, reason: collision with root package name */
    public int f17147k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.work.a f17148l;

    /* renamed from: m, reason: collision with root package name */
    public long f17149m;

    /* renamed from: n, reason: collision with root package name */
    public long f17150n;

    /* renamed from: o, reason: collision with root package name */
    public long f17151o;

    /* renamed from: p, reason: collision with root package name */
    public long f17152p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17153q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.work.r f17154r;

    /* renamed from: s, reason: collision with root package name */
    public final int f17155s;

    /* renamed from: t, reason: collision with root package name */
    public final int f17156t;

    /* renamed from: u, reason: collision with root package name */
    public long f17157u;

    /* renamed from: v, reason: collision with root package name */
    public int f17158v;

    /* renamed from: w, reason: collision with root package name */
    public final int f17159w;

    /* compiled from: WorkSpec.kt */
    /* renamed from: b2.w$a */
    public static final class a {
        public static long a(boolean z10, int i, androidx.work.a backoffPolicy, long j4, long j10, int i10, boolean z11, long j11, long j12, long j13, long j14) {
            kotlin.jvm.internal.l.f(backoffPolicy, "backoffPolicy");
            if (j14 != Long.MAX_VALUE && z11) {
                if (i10 != 0) {
                    long j15 = j10 + 900000;
                    if (j14 < j15) {
                        return j15;
                    }
                }
                return j14;
            }
            if (z10) {
                long jScalb = backoffPolicy == androidx.work.a.LINEAR ? j4 * i : (long) Math.scalb(j4, i - 1);
                if (jScalb > 18000000) {
                    jScalb = 18000000;
                }
                return j10 + jScalb;
            }
            if (z11) {
                long j16 = i10 == 0 ? j10 + j11 : j10 + j13;
                return (j12 == j13 || i10 != 0) ? j16 : (j13 - j12) + j16;
            }
            if (j10 == -1) {
                return Long.MAX_VALUE;
            }
            return j10 + j11;
        }
    }

    /* compiled from: WorkSpec.kt */
    /* renamed from: b2.w$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f17160a;

        /* renamed from: b, reason: collision with root package name */
        public t.b f17161b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.l.b(this.f17160a, bVar.f17160a) && this.f17161b == bVar.f17161b;
        }

        public final int hashCode() {
            return this.f17161b.hashCode() + (this.f17160a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.f17160a + ", state=" + this.f17161b + ')';
        }
    }

    /* compiled from: WorkSpec.kt */
    /* renamed from: b2.w$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f17162a;

        /* renamed from: b, reason: collision with root package name */
        public final t.b f17163b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.work.e f17164c;

        /* renamed from: d, reason: collision with root package name */
        public final long f17165d;

        /* renamed from: e, reason: collision with root package name */
        public final long f17166e;

        /* renamed from: f, reason: collision with root package name */
        public final long f17167f;

        /* renamed from: g, reason: collision with root package name */
        public final androidx.work.d f17168g;

        /* renamed from: h, reason: collision with root package name */
        public final int f17169h;
        public final androidx.work.a i;

        /* renamed from: j, reason: collision with root package name */
        public final long f17170j;

        /* renamed from: k, reason: collision with root package name */
        public final long f17171k;

        /* renamed from: l, reason: collision with root package name */
        public final int f17172l;

        /* renamed from: m, reason: collision with root package name */
        public final int f17173m;

        /* renamed from: n, reason: collision with root package name */
        public final long f17174n;

        /* renamed from: o, reason: collision with root package name */
        public final int f17175o;

        /* renamed from: p, reason: collision with root package name */
        public final ArrayList f17176p;

        /* renamed from: q, reason: collision with root package name */
        public final ArrayList f17177q;

        public c(String id, t.b state, androidx.work.e output, long j4, long j10, long j11, androidx.work.d dVar, int i, androidx.work.a backoffPolicy, long j12, long j13, int i10, int i11, long j14, int i12, ArrayList arrayList, ArrayList arrayList2) {
            kotlin.jvm.internal.l.f(id, "id");
            kotlin.jvm.internal.l.f(state, "state");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(backoffPolicy, "backoffPolicy");
            this.f17162a = id;
            this.f17163b = state;
            this.f17164c = output;
            this.f17165d = j4;
            this.f17166e = j10;
            this.f17167f = j11;
            this.f17168g = dVar;
            this.f17169h = i;
            this.i = backoffPolicy;
            this.f17170j = j12;
            this.f17171k = j13;
            this.f17172l = i10;
            this.f17173m = i11;
            this.f17174n = j14;
            this.f17175o = i12;
            this.f17176p = arrayList;
            this.f17177q = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.l.b(this.f17162a, cVar.f17162a) && this.f17163b == cVar.f17163b && kotlin.jvm.internal.l.b(this.f17164c, cVar.f17164c) && this.f17165d == cVar.f17165d && this.f17166e == cVar.f17166e && this.f17167f == cVar.f17167f && this.f17168g.equals(cVar.f17168g) && this.f17169h == cVar.f17169h && this.i == cVar.i && this.f17170j == cVar.f17170j && this.f17171k == cVar.f17171k && this.f17172l == cVar.f17172l && this.f17173m == cVar.f17173m && this.f17174n == cVar.f17174n && this.f17175o == cVar.f17175o && this.f17176p.equals(cVar.f17176p) && this.f17177q.equals(cVar.f17177q);
        }

        public final int hashCode() {
            int iHashCode = (this.f17164c.hashCode() + ((this.f17163b.hashCode() + (this.f17162a.hashCode() * 31)) * 31)) * 31;
            long j4 = this.f17165d;
            int i = (iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j10 = this.f17166e;
            int i10 = (i + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f17167f;
            int iHashCode2 = (this.i.hashCode() + ((((this.f17168g.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f17169h) * 31)) * 31;
            long j12 = this.f17170j;
            int i11 = (iHashCode2 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f17171k;
            int i12 = (((((i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f17172l) * 31) + this.f17173m) * 31;
            long j14 = this.f17174n;
            return this.f17177q.hashCode() + ((this.f17176p.hashCode() + ((((i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f17175o) * 31)) * 31);
        }

        public final String toString() {
            return "WorkInfoPojo(id=" + this.f17162a + ", state=" + this.f17163b + ", output=" + this.f17164c + ", initialDelay=" + this.f17165d + ", intervalDuration=" + this.f17166e + ", flexDuration=" + this.f17167f + ", constraints=" + this.f17168g + ", runAttemptCount=" + this.f17169h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.f17170j + ", lastEnqueueTime=" + this.f17171k + ", periodCount=" + this.f17172l + ", generation=" + this.f17173m + ", nextScheduleTimeOverride=" + this.f17174n + ", stopReason=" + this.f17175o + ", tags=" + this.f17176p + ", progress=" + this.f17177q + ')';
        }
    }

    static {
        String strG = androidx.work.m.g("WorkSpec");
        kotlin.jvm.internal.l.e(strG, "tagWithPrefix(\"WorkSpec\")");
        f17136x = strG;
        f17137y = new C1841v(0);
    }

    public C1842w(String id, t.b state, String workerClassName, String inputMergerClassName, androidx.work.e input, androidx.work.e output, long j4, long j10, long j11, androidx.work.d constraints, int i, androidx.work.a backoffPolicy, long j12, long j13, long j14, long j15, boolean z10, androidx.work.r outOfQuotaPolicy, int i10, int i11, long j16, int i12, int i13) {
        kotlin.jvm.internal.l.f(id, "id");
        kotlin.jvm.internal.l.f(state, "state");
        kotlin.jvm.internal.l.f(workerClassName, "workerClassName");
        kotlin.jvm.internal.l.f(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.l.f(input, "input");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(constraints, "constraints");
        kotlin.jvm.internal.l.f(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.l.f(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f17138a = id;
        this.f17139b = state;
        this.f17140c = workerClassName;
        this.f17141d = inputMergerClassName;
        this.f17142e = input;
        this.f17143f = output;
        this.f17144g = j4;
        this.f17145h = j10;
        this.i = j11;
        this.f17146j = constraints;
        this.f17147k = i;
        this.f17148l = backoffPolicy;
        this.f17149m = j12;
        this.f17150n = j13;
        this.f17151o = j14;
        this.f17152p = j15;
        this.f17153q = z10;
        this.f17154r = outOfQuotaPolicy;
        this.f17155s = i10;
        this.f17156t = i11;
        this.f17157u = j16;
        this.f17158v = i12;
        this.f17159w = i13;
    }

    public static C1842w b(C1842w c1842w, String str, t.b bVar, String str2, androidx.work.e eVar, int i, long j4, int i10, int i11, long j10, int i12, int i13) {
        String id = (i13 & 1) != 0 ? c1842w.f17138a : str;
        t.b state = (i13 & 2) != 0 ? c1842w.f17139b : bVar;
        String workerClassName = (i13 & 4) != 0 ? c1842w.f17140c : str2;
        String inputMergerClassName = c1842w.f17141d;
        androidx.work.e input = (i13 & 16) != 0 ? c1842w.f17142e : eVar;
        androidx.work.e output = c1842w.f17143f;
        long j11 = c1842w.f17144g;
        long j12 = c1842w.f17145h;
        long j13 = c1842w.i;
        androidx.work.d constraints = c1842w.f17146j;
        int i14 = (i13 & 1024) != 0 ? c1842w.f17147k : i;
        androidx.work.a backoffPolicy = c1842w.f17148l;
        long j14 = c1842w.f17149m;
        long j15 = (i13 & 8192) != 0 ? c1842w.f17150n : j4;
        long j16 = c1842w.f17151o;
        long j17 = c1842w.f17152p;
        boolean z10 = c1842w.f17153q;
        androidx.work.r outOfQuotaPolicy = c1842w.f17154r;
        int i15 = (i13 & 262144) != 0 ? c1842w.f17155s : i10;
        int i16 = (i13 & 524288) != 0 ? c1842w.f17156t : i11;
        long j18 = (i13 & 1048576) != 0 ? c1842w.f17157u : j10;
        int i17 = (i13 & 2097152) != 0 ? c1842w.f17158v : i12;
        int i18 = c1842w.f17159w;
        c1842w.getClass();
        kotlin.jvm.internal.l.f(id, "id");
        kotlin.jvm.internal.l.f(state, "state");
        kotlin.jvm.internal.l.f(workerClassName, "workerClassName");
        kotlin.jvm.internal.l.f(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.l.f(input, "input");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(constraints, "constraints");
        kotlin.jvm.internal.l.f(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.l.f(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new C1842w(id, state, workerClassName, inputMergerClassName, input, output, j11, j12, j13, constraints, i14, backoffPolicy, j14, j15, j16, j17, z10, outOfQuotaPolicy, i15, i16, j18, i17, i18);
    }

    public final long a() {
        return a.a(this.f17139b == t.b.ENQUEUED && this.f17147k > 0, this.f17147k, this.f17148l, this.f17149m, this.f17150n, this.f17155s, d(), this.f17144g, this.i, this.f17145h, this.f17157u);
    }

    public final boolean c() {
        return !kotlin.jvm.internal.l.b(androidx.work.d.i, this.f17146j);
    }

    public final boolean d() {
        return this.f17145h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1842w)) {
            return false;
        }
        C1842w c1842w = (C1842w) obj;
        return kotlin.jvm.internal.l.b(this.f17138a, c1842w.f17138a) && this.f17139b == c1842w.f17139b && kotlin.jvm.internal.l.b(this.f17140c, c1842w.f17140c) && kotlin.jvm.internal.l.b(this.f17141d, c1842w.f17141d) && kotlin.jvm.internal.l.b(this.f17142e, c1842w.f17142e) && kotlin.jvm.internal.l.b(this.f17143f, c1842w.f17143f) && this.f17144g == c1842w.f17144g && this.f17145h == c1842w.f17145h && this.i == c1842w.i && kotlin.jvm.internal.l.b(this.f17146j, c1842w.f17146j) && this.f17147k == c1842w.f17147k && this.f17148l == c1842w.f17148l && this.f17149m == c1842w.f17149m && this.f17150n == c1842w.f17150n && this.f17151o == c1842w.f17151o && this.f17152p == c1842w.f17152p && this.f17153q == c1842w.f17153q && this.f17154r == c1842w.f17154r && this.f17155s == c1842w.f17155s && this.f17156t == c1842w.f17156t && this.f17157u == c1842w.f17157u && this.f17158v == c1842w.f17158v && this.f17159w == c1842w.f17159w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f17143f.hashCode() + ((this.f17142e.hashCode() + B4.g.n(B4.g.n((this.f17139b.hashCode() + (this.f17138a.hashCode() * 31)) * 31, 31, this.f17140c), 31, this.f17141d)) * 31)) * 31;
        long j4 = this.f17144g;
        int i = (iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j10 = this.f17145h;
        int i10 = (i + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.i;
        int iHashCode2 = (this.f17148l.hashCode() + ((((this.f17146j.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f17147k) * 31)) * 31;
        long j12 = this.f17149m;
        int i11 = (iHashCode2 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f17150n;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f17151o;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f17152p;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        boolean z10 = this.f17153q;
        int i15 = z10;
        if (z10 != 0) {
            i15 = 1;
        }
        int iHashCode3 = (((((this.f17154r.hashCode() + ((i14 + i15) * 31)) * 31) + this.f17155s) * 31) + this.f17156t) * 31;
        long j16 = this.f17157u;
        return ((((iHashCode3 + ((int) ((j16 >>> 32) ^ j16))) * 31) + this.f17158v) * 31) + this.f17159w;
    }

    public final String toString() {
        return B8.j(new StringBuilder("{WorkSpec: "), this.f17138a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1842w(String str, t.b bVar, String str2, String str3, androidx.work.e eVar, androidx.work.e eVar2, long j4, long j10, long j11, androidx.work.d dVar, int i, androidx.work.a aVar, long j12, long j13, long j14, long j15, boolean z10, androidx.work.r rVar, int i10, long j16, int i11, int i12, int i13) {
        androidx.work.e eVar3;
        androidx.work.e eVar4;
        t.b bVar2 = (i13 & 2) != 0 ? t.b.ENQUEUED : bVar;
        String name = (i13 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3;
        if ((i13 & 16) != 0) {
            androidx.work.e EMPTY = androidx.work.e.f16893c;
            kotlin.jvm.internal.l.e(EMPTY, "EMPTY");
            eVar3 = EMPTY;
        } else {
            eVar3 = eVar;
        }
        if ((i13 & 32) != 0) {
            androidx.work.e EMPTY2 = androidx.work.e.f16893c;
            kotlin.jvm.internal.l.e(EMPTY2, "EMPTY");
            eVar4 = EMPTY2;
        } else {
            eVar4 = eVar2;
        }
        this(str, bVar2, str2, name, eVar3, eVar4, (i13 & 64) != 0 ? 0L : j4, (i13 & 128) != 0 ? 0L : j10, (i13 & 256) != 0 ? 0L : j11, (i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? androidx.work.d.i : dVar, (i13 & 1024) != 0 ? 0 : i, (i13 & 2048) != 0 ? androidx.work.a.EXPONENTIAL : aVar, (i13 & 4096) != 0 ? 30000L : j12, (i13 & 8192) != 0 ? -1L : j13, (i13 & 16384) == 0 ? j14 : 0L, (32768 & i13) != 0 ? -1L : j15, (65536 & i13) != 0 ? false : z10, (131072 & i13) != 0 ? androidx.work.r.RUN_AS_NON_EXPEDITED_WORK_REQUEST : rVar, (262144 & i13) != 0 ? 0 : i10, 0, (1048576 & i13) != 0 ? Long.MAX_VALUE : j16, (2097152 & i13) != 0 ? 0 : i11, (i13 & 4194304) != 0 ? -256 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1842w(String id, String workerClassName_) {
        this(id, (t.b) null, workerClassName_, (String) null, (androidx.work.e) null, (androidx.work.e) null, 0L, 0L, 0L, (androidx.work.d) null, 0, (androidx.work.a) null, 0L, 0L, 0L, 0L, false, (androidx.work.r) null, 0, 0L, 0, 0, 8388602);
        kotlin.jvm.internal.l.f(id, "id");
        kotlin.jvm.internal.l.f(workerClassName_, "workerClassName_");
    }
}
