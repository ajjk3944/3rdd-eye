package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2521y2 extends AbstractC2409c {

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC2404b f21202j;

    /* renamed from: k, reason: collision with root package name */
    public final IntFunction f21203k;

    /* renamed from: l, reason: collision with root package name */
    public final long f21204l;

    /* renamed from: m, reason: collision with root package name */
    public final long f21205m;

    /* renamed from: n, reason: collision with root package name */
    public long f21206n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f21207o;

    @Override // j$.util.stream.AbstractC2409c
    public final void f() {
        this.i = true;
        if (this.f21207o) {
            d(AbstractC2510w1.g0(this.f21202j.D0()));
        }
    }

    @Override // j$.util.stream.AbstractC2419e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C2521y2 c2521y2;
        G0 g02;
        AbstractC2419e abstractC2419e = this.f21059d;
        if (abstractC2419e != null) {
            this.f21206n = ((C2521y2) abstractC2419e).f21206n + ((C2521y2) this.f21060e).f21206n;
            if (this.i) {
                this.f21206n = 0L;
                g02 = AbstractC2510w1.g0(this.f21202j.D0());
            } else {
                g02 = this.f21206n == 0 ? AbstractC2510w1.g0(this.f21202j.D0()) : ((C2521y2) this.f21059d).f21206n == 0 ? (G0) ((C2521y2) this.f21060e).i() : AbstractC2510w1.c0(this.f21202j.D0(), (G0) ((C2521y2) this.f21059d).i(), (G0) ((C2521y2) this.f21060e).i());
            }
            G0 g0J = g02;
            if (b()) {
                g0J = g0J.j(this.f21204l, this.f21205m >= 0 ? Math.min(g0J.count(), this.f21204l + this.f21205m) : this.f21206n, this.f21203k);
            }
            d(g0J);
            this.f21207o = true;
        }
        if (this.f21205m >= 0 && !b()) {
            long j6 = this.f21204l + this.f21205m;
            long j7 = this.f21207o ? this.f21206n : j(j6);
            if (j7 >= j6) {
                g();
            } else {
                C2521y2 c2521y22 = (C2521y2) ((AbstractC2419e) getCompleter());
                C2521y2 c2521y23 = this;
                while (true) {
                    if (c2521y22 == null) {
                        if (j7 >= j6) {
                            break;
                        }
                    } else {
                        if (c2521y23 == c2521y22.f21060e && (c2521y2 = (C2521y2) c2521y22.f21059d) != null) {
                            long j8 = c2521y2.j(j6) + j7;
                            if (j8 >= j6) {
                                break;
                            } else {
                                j7 = j8;
                            }
                        }
                        c2521y23 = c2521y22;
                        c2521y22 = (C2521y2) ((AbstractC2419e) c2521y22.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C2521y2(AbstractC2404b abstractC2404b, AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction, long j6, long j7) {
        super(abstractC2510w1, spliterator);
        this.f21202j = abstractC2404b;
        this.f21203k = intFunction;
        this.f21204l = j6;
        this.f21205m = j7;
    }

    public C2521y2(C2521y2 c2521y2, Spliterator spliterator) {
        super(c2521y2, spliterator);
        this.f21202j = c2521y2.f21202j;
        this.f21203k = c2521y2.f21203k;
        this.f21204l = c2521y2.f21204l;
        this.f21205m = c2521y2.f21205m;
    }

    @Override // j$.util.stream.AbstractC2419e
    public final AbstractC2419e c(Spliterator spliterator) {
        return new C2521y2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2409c
    public final Object h() {
        return AbstractC2510w1.g0(this.f21202j.D0());
    }

    @Override // j$.util.stream.AbstractC2419e
    public final Object a() {
        if (b()) {
            EnumC2413c3 enumC2413c3 = EnumC2413c3.SIZED;
            AbstractC2404b abstractC2404b = this.f21202j;
            int i = abstractC2404b.f21003j;
            int i3 = enumC2413c3.f21047e;
            InterfaceC2519y0 interfaceC2519y0T0 = this.f21202j.t0((i & i3) == i3 ? abstractC2404b.i0(this.f21057b) : -1L, this.f21203k);
            InterfaceC2472o2 interfaceC2472o2H0 = this.f21202j.H0(((AbstractC2404b) this.f21056a).f21006m, interfaceC2519y0T0);
            AbstractC2510w1 abstractC2510w1 = this.f21056a;
            abstractC2510w1.e0(this.f21057b, abstractC2510w1.x0(interfaceC2472o2H0));
            return interfaceC2519y0T0.build();
        }
        InterfaceC2519y0 interfaceC2519y0T02 = this.f21202j.t0(-1L, this.f21203k);
        if (this.f21204l == 0) {
            InterfaceC2472o2 interfaceC2472o2H02 = this.f21202j.H0(((AbstractC2404b) this.f21056a).f21006m, interfaceC2519y0T02);
            AbstractC2510w1 abstractC2510w12 = this.f21056a;
            abstractC2510w12.e0(this.f21057b, abstractC2510w12.x0(interfaceC2472o2H02));
        } else {
            this.f21056a.w0(this.f21057b, interfaceC2519y0T02);
        }
        G0 g0Build = interfaceC2519y0T02.build();
        this.f21206n = g0Build.count();
        this.f21207o = true;
        this.f21057b = null;
        return g0Build;
    }

    public final long j(long j6) {
        if (this.f21207o) {
            return this.f21206n;
        }
        C2521y2 c2521y2 = (C2521y2) this.f21059d;
        C2521y2 c2521y22 = (C2521y2) this.f21060e;
        if (c2521y2 == null || c2521y22 == null) {
            return this.f21206n;
        }
        long j7 = c2521y2.j(j6);
        return j7 >= j6 ? j7 : c2521y22.j(j6) + j7;
    }
}
