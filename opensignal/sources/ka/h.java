package ka;

import a5.v;
import h7.p;
import io.sentry.t;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14248a;

    /* renamed from: b, reason: collision with root package name */
    public long f14249b;

    /* renamed from: c, reason: collision with root package name */
    public long f14250c;

    /* renamed from: d, reason: collision with root package name */
    public long f14251d;

    /* renamed from: e, reason: collision with root package name */
    public int f14252e;

    /* renamed from: f, reason: collision with root package name */
    public int f14253f;

    /* renamed from: g, reason: collision with root package name */
    public long f14254g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14255h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14256i;
    public final Object j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f14257l;

    /* renamed from: m, reason: collision with root package name */
    public Object f14258m;

    /* renamed from: n, reason: collision with root package name */
    public Object f14259n;

    public h(int i10) {
        this.f14248a = i10;
        switch (i10) {
            case 1:
                this.j = new p(2);
                this.f14259n = new t();
                break;
            default:
                this.j = new p(1);
                this.f14259n = new t();
                break;
        }
    }

    public void a(long j) {
        switch (this.f14248a) {
            case 0:
                this.f14251d = j;
                break;
            default:
                this.f14251d = j;
                break;
        }
    }

    public abstract long b(v vVar);

    public abstract long c(fb.f fVar);

    public abstract boolean d(v vVar, long j, t tVar);

    public abstract boolean e(fb.f fVar, long j, t tVar);

    public void f(boolean z10) {
        switch (this.f14248a) {
            case 0:
                if (z10) {
                    this.f14259n = new t();
                    this.f14250c = 0L;
                    this.f14252e = 0;
                } else {
                    this.f14252e = 1;
                }
                this.f14249b = -1L;
                this.f14251d = 0L;
                break;
            default:
                if (z10) {
                    this.f14259n = new t();
                    this.f14250c = 0L;
                    this.f14252e = 0;
                } else {
                    this.f14252e = 1;
                }
                this.f14249b = -1L;
                this.f14251d = 0L;
                break;
        }
    }
}
