package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class a4 extends AbstractC2419e {

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC2404b f20998h;
    public final IntFunction i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20999j;

    /* renamed from: k, reason: collision with root package name */
    public long f21000k;

    /* renamed from: l, reason: collision with root package name */
    public long f21001l;

    @Override // j$.util.stream.AbstractC2419e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC2419e abstractC2419e = this.f21059d;
        if (abstractC2419e != null) {
            if (this.f20999j) {
                a4 a4Var = (a4) abstractC2419e;
                long j6 = a4Var.f21001l;
                this.f21001l = j6;
                if (j6 == a4Var.f21000k) {
                    this.f21001l = j6 + ((a4) this.f21060e).f21001l;
                }
            }
            a4 a4Var2 = (a4) abstractC2419e;
            long j7 = a4Var2.f21000k;
            a4 a4Var3 = (a4) this.f21060e;
            this.f21000k = j7 + a4Var3.f21000k;
            G0 g0C0 = a4Var2.f21000k == 0 ? (G0) a4Var3.f21061f : a4Var3.f21000k == 0 ? (G0) a4Var2.f21061f : AbstractC2510w1.c0(this.f20998h.D0(), (G0) ((a4) this.f21059d).f21061f, (G0) ((a4) this.f21060e).f21061f);
            if (b() && this.f20999j) {
                g0C0 = g0C0.j(this.f21001l, g0C0.count(), this.i);
            }
            this.f21061f = g0C0;
        }
        super.onCompletion(countedCompleter);
    }

    public a4(AbstractC2404b abstractC2404b, AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC2510w1, spliterator);
        this.f20998h = abstractC2404b;
        this.i = intFunction;
        this.f20999j = EnumC2413c3.ORDERED.d(((AbstractC2404b) abstractC2510w1).f21006m);
    }

    public a4(a4 a4Var, Spliterator spliterator) {
        super(a4Var, spliterator);
        this.f20998h = a4Var.f20998h;
        this.i = a4Var.i;
        this.f20999j = a4Var.f20999j;
    }

    @Override // j$.util.stream.AbstractC2419e
    public final AbstractC2419e c(Spliterator spliterator) {
        return new a4(this, spliterator);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // j$.util.stream.AbstractC2419e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            boolean r0 = r5.b()
            if (r0 != 0) goto L1c
            boolean r1 = r5.f20999j
            if (r1 == 0) goto L1c
            j$.util.stream.c3 r1 = j$.util.stream.EnumC2413c3.SIZED
            j$.util.stream.b r2 = r5.f20998h
            int r3 = r2.f21003j
            int r1 = r1.f21047e
            r3 = r3 & r1
            if (r3 != r1) goto L1c
            j$.util.Spliterator r1 = r5.f21057b
            long r1 = r2.i0(r1)
            goto L1e
        L1c:
            r1 = -1
        L1e:
            j$.util.stream.w1 r3 = r5.f21056a
            java.util.function.IntFunction r4 = r5.i
            j$.util.stream.y0 r1 = r3.t0(r1, r4)
            j$.util.stream.b r2 = r5.f20998h
            j$.util.stream.Y3 r2 = (j$.util.stream.Y3) r2
            boolean r3 = r5.f20999j
            if (r3 == 0) goto L32
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            j$.util.stream.Z3 r0 = r2.i(r1, r0)
            j$.util.stream.w1 r2 = r5.f21056a
            j$.util.Spliterator r3 = r5.f21057b
            r2.w0(r3, r0)
            j$.util.stream.G0 r1 = r1.build()
            long r2 = r1.count()
            r5.f21000k = r2
            long r2 = r0.h()
            r5.f21001l = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.a4.a():java.lang.Object");
    }
}
