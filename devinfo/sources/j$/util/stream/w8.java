package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class w8 extends b {
    public final a j;

    /* renamed from: k, reason: collision with root package name */
    public final IntFunction f26807k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26808l;

    /* renamed from: m, reason: collision with root package name */
    public long f26809m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26810n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f26811o;

    @Override // j$.util.stream.b
    public final void f() {
        this.f26503i = true;
        if (this.f26808l && this.f26811o) {
            d(v3.g0(this.j.D0()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.d r0 = r8.f26545d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.w8 r0 = (j$.util.stream.w8) r0
            boolean r0 = r0.f26810n
            j$.util.stream.d r1 = r8.f26546e
            j$.util.stream.w8 r1 = (j$.util.stream.w8) r1
            boolean r1 = r1.f26810n
            r0 = r0 | r1
            r8.f26810n = r0
            boolean r0 = r8.f26808l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.f26503i
            if (r0 == 0) goto L2a
            r8.f26809m = r1
            j$.util.stream.a r0 = r8.j
            j$.util.stream.b7 r0 = r0.D0()
            j$.util.stream.y2 r0 = j$.util.stream.v3.g0(r0)
            goto L88
        L2a:
            boolean r0 = r8.f26808l
            if (r0 == 0) goto L41
            j$.util.stream.d r0 = r8.f26545d
            j$.util.stream.w8 r0 = (j$.util.stream.w8) r0
            boolean r3 = r0.f26810n
            if (r3 == 0) goto L41
            long r1 = r0.f26809m
            r8.f26809m = r1
            java.lang.Object r0 = r0.i()
            j$.util.stream.e2 r0 = (j$.util.stream.e2) r0
            goto L88
        L41:
            j$.util.stream.d r0 = r8.f26545d
            j$.util.stream.w8 r0 = (j$.util.stream.w8) r0
            long r3 = r0.f26809m
            j$.util.stream.d r5 = r8.f26546e
            j$.util.stream.w8 r5 = (j$.util.stream.w8) r5
            long r6 = r5.f26809m
            long r3 = r3 + r6
            r8.f26809m = r3
            long r3 = r0.f26809m
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L5d
            java.lang.Object r0 = r5.i()
            j$.util.stream.e2 r0 = (j$.util.stream.e2) r0
            goto L88
        L5d:
            long r3 = r5.f26809m
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L6a
            java.lang.Object r0 = r0.i()
            j$.util.stream.e2 r0 = (j$.util.stream.e2) r0
            goto L88
        L6a:
            j$.util.stream.a r0 = r8.j
            j$.util.stream.b7 r0 = r0.D0()
            j$.util.stream.d r1 = r8.f26545d
            j$.util.stream.w8 r1 = (j$.util.stream.w8) r1
            java.lang.Object r1 = r1.i()
            j$.util.stream.e2 r1 = (j$.util.stream.e2) r1
            j$.util.stream.d r2 = r8.f26546e
            j$.util.stream.w8 r2 = (j$.util.stream.w8) r2
            java.lang.Object r2 = r2.i()
            j$.util.stream.e2 r2 = (j$.util.stream.e2) r2
            j$.util.stream.h2 r0 = j$.util.stream.v3.c0(r0, r1, r2)
        L88:
            r8.d(r0)
        L8b:
            r0 = 1
            r8.f26811o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.w8.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public w8(a aVar, v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        super(v3Var, spliterator);
        this.j = aVar;
        this.f26807k = intFunction;
        this.f26808l = a7.ORDERED.l(((a) v3Var).f26462m);
    }

    public w8(w8 w8Var, Spliterator spliterator) {
        super(w8Var, spliterator);
        this.j = w8Var.j;
        this.f26807k = w8Var.f26807k;
        this.f26808l = w8Var.f26808l;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new w8(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return v3.g0(this.j.D0());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        w1 w1VarT0 = this.f26542a.t0(-1L, this.f26807k);
        m5 m5VarH0 = this.j.H0(((a) this.f26542a).f26462m, w1VarT0);
        v3 v3Var = this.f26542a;
        boolean zE0 = v3Var.e0(this.f26543b, v3Var.x0(m5VarH0));
        this.f26810n = zE0;
        if (zE0) {
            g();
        }
        e2 e2VarBuild = w1VarT0.build();
        this.f26809m = e2VarBuild.count();
        return e2VarBuild;
    }
}
