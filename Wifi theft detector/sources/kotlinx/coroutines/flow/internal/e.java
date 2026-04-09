package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import y8.s;

/* loaded from: classes4.dex */
public final class e extends ChannelFlowOperator {
    public /* synthetic */ e(kotlinx.coroutines.flow.b bVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, kotlin.jvm.internal.i iVar) {
        this(bVar, (i11 & 2) != 0 ? EmptyCoroutineContext.f21979a : dVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? BufferOverflow.f22240a : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow f(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return new e(this.f22455d, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.flow.b i() {
        return this.f22455d;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object q(kotlinx.coroutines.flow.c cVar, c9.c cVar2) {
        Object objCollect = this.f22455d.collect(cVar, cVar2);
        return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
    }

    public e(kotlinx.coroutines.flow.b bVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        super(bVar, dVar, i10, bufferOverflow);
    }
}
