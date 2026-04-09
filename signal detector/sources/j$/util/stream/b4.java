package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class b4 extends AbstractC2409c {

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC2404b f21015j;

    /* renamed from: k, reason: collision with root package name */
    public final IntFunction f21016k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21017l;

    /* renamed from: m, reason: collision with root package name */
    public long f21018m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21019n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f21020o;

    @Override // j$.util.stream.AbstractC2409c
    public final void f() {
        this.i = true;
        if (this.f21017l && this.f21020o) {
            d(AbstractC2510w1.g0(this.f21015j.D0()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.AbstractC2419e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.e r0 = r8.f21059d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.b4 r0 = (j$.util.stream.b4) r0
            boolean r0 = r0.f21019n
            j$.util.stream.e r1 = r8.f21060e
            j$.util.stream.b4 r1 = (j$.util.stream.b4) r1
            boolean r1 = r1.f21019n
            r0 = r0 | r1
            r8.f21019n = r0
            boolean r0 = r8.f21017l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.i
            if (r0 == 0) goto L2a
            r8.f21018m = r1
            j$.util.stream.b r0 = r8.f21015j
            j$.util.stream.d3 r0 = r0.D0()
            j$.util.stream.Z0 r0 = j$.util.stream.AbstractC2510w1.g0(r0)
            goto L88
        L2a:
            boolean r0 = r8.f21017l
            if (r0 == 0) goto L41
            j$.util.stream.e r0 = r8.f21059d
            j$.util.stream.b4 r0 = (j$.util.stream.b4) r0
            boolean r3 = r0.f21019n
            if (r3 == 0) goto L41
            long r1 = r0.f21018m
            r8.f21018m = r1
            java.lang.Object r0 = r0.i()
            j$.util.stream.G0 r0 = (j$.util.stream.G0) r0
            goto L88
        L41:
            j$.util.stream.e r0 = r8.f21059d
            j$.util.stream.b4 r0 = (j$.util.stream.b4) r0
            long r3 = r0.f21018m
            j$.util.stream.e r5 = r8.f21060e
            j$.util.stream.b4 r5 = (j$.util.stream.b4) r5
            long r6 = r5.f21018m
            long r3 = r3 + r6
            r8.f21018m = r3
            long r3 = r0.f21018m
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L5d
            java.lang.Object r0 = r5.i()
            j$.util.stream.G0 r0 = (j$.util.stream.G0) r0
            goto L88
        L5d:
            long r3 = r5.f21018m
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L6a
            java.lang.Object r0 = r0.i()
            j$.util.stream.G0 r0 = (j$.util.stream.G0) r0
            goto L88
        L6a:
            j$.util.stream.b r0 = r8.f21015j
            j$.util.stream.d3 r0 = r0.D0()
            j$.util.stream.e r1 = r8.f21059d
            j$.util.stream.b4 r1 = (j$.util.stream.b4) r1
            java.lang.Object r1 = r1.i()
            j$.util.stream.G0 r1 = (j$.util.stream.G0) r1
            j$.util.stream.e r2 = r8.f21060e
            j$.util.stream.b4 r2 = (j$.util.stream.b4) r2
            java.lang.Object r2 = r2.i()
            j$.util.stream.G0 r2 = (j$.util.stream.G0) r2
            j$.util.stream.I0 r0 = j$.util.stream.AbstractC2510w1.c0(r0, r1, r2)
        L88:
            r8.d(r0)
        L8b:
            r0 = 1
            r8.f21020o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.b4.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public b4(AbstractC2404b abstractC2404b, AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC2510w1, spliterator);
        this.f21015j = abstractC2404b;
        this.f21016k = intFunction;
        this.f21017l = EnumC2413c3.ORDERED.d(((AbstractC2404b) abstractC2510w1).f21006m);
    }

    public b4(b4 b4Var, Spliterator spliterator) {
        super(b4Var, spliterator);
        this.f21015j = b4Var.f21015j;
        this.f21016k = b4Var.f21016k;
        this.f21017l = b4Var.f21017l;
    }

    @Override // j$.util.stream.AbstractC2419e
    public final AbstractC2419e c(Spliterator spliterator) {
        return new b4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2409c
    public final Object h() {
        return AbstractC2510w1.g0(this.f21015j.D0());
    }

    @Override // j$.util.stream.AbstractC2419e
    public final Object a() {
        InterfaceC2519y0 interfaceC2519y0T0 = this.f21056a.t0(-1L, this.f21016k);
        InterfaceC2472o2 interfaceC2472o2H0 = this.f21015j.H0(((AbstractC2404b) this.f21056a).f21006m, interfaceC2519y0T0);
        AbstractC2510w1 abstractC2510w1 = this.f21056a;
        boolean zE0 = abstractC2510w1.e0(this.f21057b, abstractC2510w1.x0(interfaceC2472o2H0));
        this.f21019n = zE0;
        if (zE0) {
            g();
        }
        G0 g0Build = interfaceC2519y0T0.build();
        this.f21018m = g0Build.count();
        return g0Build;
    }
}
