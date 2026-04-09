package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.r1;

/* loaded from: classes4.dex */
public final class v0 implements d1, b, kotlinx.coroutines.flow.internal.i {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f22489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f22490b;

    public v0(d1 d1Var, r1 r1Var) {
        this.f22489a = r1Var;
        this.f22490b = d1Var;
    }

    @Override // kotlinx.coroutines.flow.internal.i
    public b b(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return e1.d(this, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.x0, kotlinx.coroutines.flow.b
    public Object collect(c cVar, c9.c cVar2) {
        return this.f22490b.collect(cVar, cVar2);
    }

    @Override // kotlinx.coroutines.flow.d1
    public Object getValue() {
        return this.f22490b.getValue();
    }
}
