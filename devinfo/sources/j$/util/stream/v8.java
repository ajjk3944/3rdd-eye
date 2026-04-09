package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class v8 extends d {

    /* renamed from: h, reason: collision with root package name */
    public final a f26792h;

    /* renamed from: i, reason: collision with root package name */
    public final IntFunction f26793i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f26794k;

    /* renamed from: l, reason: collision with root package name */
    public long f26795l;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.f26545d;
        if (dVar != null) {
            if (this.j) {
                v8 v8Var = (v8) dVar;
                long j = v8Var.f26795l;
                this.f26795l = j;
                if (j == v8Var.f26794k) {
                    this.f26795l = j + ((v8) this.f26546e).f26795l;
                }
            }
            v8 v8Var2 = (v8) dVar;
            long j8 = v8Var2.f26794k;
            v8 v8Var3 = (v8) this.f26546e;
            this.f26794k = j8 + v8Var3.f26794k;
            e2 e2VarC0 = v8Var2.f26794k == 0 ? (e2) v8Var3.f26547f : v8Var3.f26794k == 0 ? (e2) v8Var2.f26547f : v3.c0(this.f26792h.D0(), (e2) ((v8) this.f26545d).f26547f, (e2) ((v8) this.f26546e).f26547f);
            if (b() && this.j) {
                e2VarC0 = e2VarC0.j(this.f26795l, e2VarC0.count(), this.f26793i);
            }
            this.f26547f = e2VarC0;
        }
        super.onCompletion(countedCompleter);
    }

    public v8(a aVar, v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        super(v3Var, spliterator);
        this.f26792h = aVar;
        this.f26793i = intFunction;
        this.j = a7.ORDERED.l(((a) v3Var).f26462m);
    }

    public v8(v8 v8Var, Spliterator spliterator) {
        super(v8Var, spliterator);
        this.f26792h = v8Var.f26792h;
        this.f26793i = v8Var.f26793i;
        this.j = v8Var.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new v8(this, spliterator);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // j$.util.stream.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            boolean r0 = r5.b()
            if (r0 != 0) goto L1c
            boolean r1 = r5.j
            if (r1 == 0) goto L1c
            j$.util.stream.a7 r1 = j$.util.stream.a7.SIZED
            j$.util.stream.a r2 = r5.f26792h
            int r3 = r2.j
            int r1 = r1.f26499e
            r3 = r3 & r1
            if (r3 != r1) goto L1c
            j$.util.Spliterator r1 = r5.f26543b
            long r1 = r2.i0(r1)
            goto L1e
        L1c:
            r1 = -1
        L1e:
            j$.util.stream.v3 r3 = r5.f26542a
            java.util.function.IntFunction r4 = r5.f26793i
            j$.util.stream.w1 r1 = r3.t0(r1, r4)
            j$.util.stream.a r2 = r5.f26792h
            j$.util.stream.t8 r2 = (j$.util.stream.t8) r2
            boolean r3 = r5.j
            if (r3 == 0) goto L32
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            j$.util.stream.u8 r0 = r2.i(r1, r0)
            j$.util.stream.v3 r2 = r5.f26542a
            j$.util.Spliterator r3 = r5.f26543b
            r2.w0(r3, r0)
            j$.util.stream.e2 r1 = r1.build()
            long r2 = r1.count()
            r5.f26794k = r2
            long r2 = r0.h()
            r5.f26795l = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.v8.a():java.lang.Object");
    }
}
