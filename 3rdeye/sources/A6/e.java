package A6;

import A6.l;
import android.os.SystemClock;
import b9.C1992A;
import b9.C2001h;
import kotlin.jvm.internal.v;
import p9.InterfaceC5480a;

/* compiled from: Ticker.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f47a;

    /* renamed from: b, reason: collision with root package name */
    public final l.c f48b;

    /* renamed from: c, reason: collision with root package name */
    public final l.d f49c;

    /* renamed from: d, reason: collision with root package name */
    public final l.e f50d;

    /* renamed from: e, reason: collision with root package name */
    public final l.f f51e;

    /* renamed from: f, reason: collision with root package name */
    public final Q6.c f52f;

    /* renamed from: g, reason: collision with root package name */
    public Long f53g;

    /* renamed from: h, reason: collision with root package name */
    public Long f54h;
    public Long i;

    /* renamed from: j, reason: collision with root package name */
    public Long f55j;

    /* renamed from: l, reason: collision with root package name */
    public long f57l;

    /* renamed from: k, reason: collision with root package name */
    public a f56k = a.STOPPED;

    /* renamed from: m, reason: collision with root package name */
    public long f58m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f59n = -1;

    /* renamed from: o, reason: collision with root package name */
    public final Object f60o = C2001h.a(b9.i.NONE, k.f74g);

    /* compiled from: Ticker.kt */
    public enum a {
        STOPPED,
        WORKING,
        PAUSED
    }

    /* compiled from: Ticker.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.WORKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61a = iArr;
        }
    }

    public e(String str, l.c cVar, l.d dVar, l.e eVar, l.f fVar, Q6.c cVar2) {
        this.f47a = str;
        this.f48b = cVar;
        this.f49c = dVar;
        this.f50d = eVar;
        this.f51e = fVar;
        this.f52f = cVar2;
    }

    public final void a() {
        int i = b.f61a[this.f56k.ordinal()];
        if (i == 2 || i == 3) {
            this.f56k = a.STOPPED;
            b();
            this.f48b.invoke(Long.valueOf(d()));
            f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
    public final void b() {
        ((d) this.f60o.getValue()).f46a.removeCallbacksAndMessages(null);
    }

    public final void c() {
        Long l5 = this.f53g;
        l.f fVar = this.f51e;
        if (l5 == null) {
            fVar.invoke(Long.valueOf(d()));
            return;
        }
        long jD = d();
        long jLongValue = l5.longValue();
        if (jD > jLongValue) {
            jD = jLongValue;
        }
        fVar.invoke(Long.valueOf(jD));
    }

    public final long d() {
        return (this.f58m == -1 ? 0L : SystemClock.elapsedRealtime() - this.f58m) + this.f57l;
    }

    public final void e(String str) {
        Q6.c cVar = this.f52f;
        if (cVar != null) {
            cVar.a(new IllegalArgumentException(str));
        }
    }

    public final void f() {
        this.f58m = -1L;
        this.f59n = -1L;
        this.f57l = 0L;
    }

    public final void g() {
        Long l5 = this.f55j;
        Long l10 = this.i;
        if (l5 != null && this.f59n != -1 && SystemClock.elapsedRealtime() - this.f59n > l5.longValue()) {
            c();
        }
        if (l5 == null && l10 != null) {
            long jLongValue = l10.longValue();
            long jD = jLongValue - d();
            if (jD >= 0) {
                i(jD, jD, new f(this, jLongValue));
                return;
            } else {
                this.f50d.invoke(l10);
                f();
                return;
            }
        }
        if (l5 == null || l10 == null) {
            if (l5 == null || l10 != null) {
                return;
            }
            long jLongValue2 = l5.longValue();
            i(jLongValue2, jLongValue2 - (d() % jLongValue2), new g(this, 0));
            return;
        }
        long jLongValue3 = l10.longValue();
        long jLongValue4 = l5.longValue();
        long jD2 = jLongValue4 - (d() % jLongValue4);
        v vVar = new v();
        vVar.f43659b = (jLongValue3 / jLongValue4) - (d() / jLongValue4);
        i(jLongValue4, jD2, new i(jLongValue3, this, vVar, jLongValue4, new j(vVar, this, jLongValue3)));
    }

    public final void h() {
        if (this.f58m != -1) {
            this.f57l += SystemClock.elapsedRealtime() - this.f58m;
            this.f59n = SystemClock.elapsedRealtime();
            this.f58m = -1L;
        }
        b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b9.g, java.lang.Object] */
    public final void i(long j4, long j10, InterfaceC5480a<C1992A> interfaceC5480a) {
        this.f58m = SystemClock.elapsedRealtime();
        d dVar = (d) this.f60o.getValue();
        dVar.getClass();
        dVar.f46a.postDelayed(new c(dVar, j4, interfaceC5480a), j10);
    }

    public final void j() {
        int i = b.f61a[this.f56k.ordinal()];
        if (i == 1) {
            b();
            this.i = this.f53g;
            this.f55j = this.f54h;
            this.f56k = a.WORKING;
            this.f49c.invoke(Long.valueOf(d()));
            g();
            return;
        }
        String str = this.f47a;
        if (i == 2) {
            e("The timer '" + str + "' already working!");
            return;
        }
        if (i != 3) {
            return;
        }
        e("The timer '" + str + "' paused!");
    }
}
