package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.r1;

/* loaded from: classes4.dex */
public abstract class d {
    public static final b A(b bVar, l9.p pVar) {
        return FlowKt__TransformKt.b(bVar, pVar);
    }

    public static final b B(b bVar, l9.p pVar) {
        return FlowKt__EmittersKt.e(bVar, pVar);
    }

    public static final x0 C(x0 x0Var, l9.p pVar) {
        return FlowKt__ShareKt.e(x0Var, pVar);
    }

    public static final x0 D(b bVar, kotlinx.coroutines.j0 j0Var, b1 b1Var, int i10) {
        return FlowKt__ShareKt.f(bVar, j0Var, b1Var, i10);
    }

    public static final Object E(b bVar, c9.c cVar) {
        return FlowKt__ReduceKt.d(bVar, cVar);
    }

    public static final b F(b bVar, int i10) {
        return FlowKt__LimitKt.d(bVar, i10);
    }

    public static final b G(b bVar, l9.q qVar) {
        return FlowKt__MergeKt.b(bVar, qVar);
    }

    public static final b H(b bVar, l9.q qVar) {
        return FlowKt__LimitKt.e(bVar, qVar);
    }

    public static final x0 a(s0 s0Var) {
        return FlowKt__ShareKt.a(s0Var);
    }

    public static final d1 b(t0 t0Var) {
        return FlowKt__ShareKt.b(t0Var);
    }

    public static final b c(b bVar, int i10, BufferOverflow bufferOverflow) {
        return r.a(bVar, i10, bufferOverflow);
    }

    public static final b e(l9.p pVar) {
        return o.a(pVar);
    }

    public static final b f(b bVar, l9.q qVar) {
        return FlowKt__ErrorsKt.a(bVar, qVar);
    }

    public static final Object g(b bVar, c cVar, c9.c cVar2) {
        return FlowKt__ErrorsKt.b(bVar, cVar, cVar2);
    }

    public static final b h(l9.p pVar) {
        return o.b(pVar);
    }

    public static final Object i(b bVar, c9.c cVar) {
        return FlowKt__CollectKt.a(bVar, cVar);
    }

    public static final Object j(b bVar, l9.p pVar, c9.c cVar) {
        return FlowKt__CollectKt.b(bVar, pVar, cVar);
    }

    public static final b k(b bVar, long j10) {
        return FlowKt__DelayKt.a(bVar, j10);
    }

    public static final b l(b bVar) {
        return FlowKt__DistinctKt.a(bVar);
    }

    public static final b m(b bVar, l9.p pVar) {
        return FlowKt__LimitKt.b(bVar, pVar);
    }

    public static final Object n(c cVar, kotlinx.coroutines.channels.n nVar, c9.c cVar2) {
        return FlowKt__ChannelsKt.b(cVar, nVar, cVar2);
    }

    public static final Object o(c cVar, b bVar, c9.c cVar2) {
        return FlowKt__CollectKt.c(cVar, bVar, cVar2);
    }

    public static final void p(c cVar) {
        FlowKt__EmittersKt.b(cVar);
    }

    public static final b q(b bVar) {
        return FlowKt__TransformKt.a(bVar);
    }

    public static final Object r(b bVar, c9.c cVar) {
        return FlowKt__ReduceKt.a(bVar, cVar);
    }

    public static final Object s(b bVar, l9.p pVar, c9.c cVar) {
        return FlowKt__ReduceKt.b(bVar, pVar, cVar);
    }

    public static final Object t(b bVar, c9.c cVar) {
        return FlowKt__ReduceKt.c(bVar, cVar);
    }

    public static final b u(l9.p pVar) {
        return o.c(pVar);
    }

    public static final b v(b bVar, b bVar2, l9.q qVar) {
        return FlowKt__ZipKt.b(bVar, bVar2, qVar);
    }

    public static final b w(Object obj) {
        return o.d(obj);
    }

    public static final r1 x(b bVar, kotlinx.coroutines.j0 j0Var) {
        return FlowKt__CollectKt.d(bVar, j0Var);
    }

    public static final b y(b bVar, l9.p pVar) {
        return FlowKt__MergeKt.a(bVar, pVar);
    }

    public static final b z(b bVar, l9.q qVar) {
        return FlowKt__EmittersKt.d(bVar, qVar);
    }
}
