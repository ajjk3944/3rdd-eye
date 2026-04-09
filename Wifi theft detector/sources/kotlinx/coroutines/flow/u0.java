package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.r1;

/* loaded from: classes4.dex */
public final class u0 implements x0, b, kotlinx.coroutines.flow.internal.i {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f22487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f22488b;

    public u0(x0 x0Var, r1 r1Var) {
        this.f22487a = r1Var;
        this.f22488b = x0Var;
    }

    @Override // kotlinx.coroutines.flow.internal.i
    public b b(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return y0.e(this, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.x0, kotlinx.coroutines.flow.b
    public Object collect(c cVar, c9.c cVar2) {
        return this.f22488b.collect(cVar, cVar2);
    }
}
