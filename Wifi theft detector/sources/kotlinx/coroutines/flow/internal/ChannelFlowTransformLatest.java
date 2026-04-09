package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.k0;
import l9.q;
import y8.s;

/* loaded from: classes4.dex */
public final class ChannelFlowTransformLatest extends ChannelFlowOperator {

    /* renamed from: e, reason: collision with root package name */
    public final q f22456e;

    public /* synthetic */ ChannelFlowTransformLatest(q qVar, kotlinx.coroutines.flow.b bVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, kotlin.jvm.internal.i iVar) {
        this(qVar, bVar, (i11 & 4) != 0 ? EmptyCoroutineContext.f21979a : dVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? BufferOverflow.f22240a : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow f(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f22456e, this.f22455d, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object q(kotlinx.coroutines.flow.c cVar, c9.c cVar2) {
        Object objE = k0.e(new ChannelFlowTransformLatest$flowCollect$3(this, cVar, null), cVar2);
        return objE == kotlin.coroutines.intrinsics.a.f() ? objE : s.f25199a;
    }

    public ChannelFlowTransformLatest(q qVar, kotlinx.coroutines.flow.b bVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        super(bVar, dVar, i10, bufferOverflow);
        this.f22456e = qVar;
    }
}
