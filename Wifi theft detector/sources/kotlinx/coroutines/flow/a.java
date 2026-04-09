package kotlinx.coroutines.flow;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* loaded from: classes4.dex */
public class a extends ChannelFlow {

    /* renamed from: d, reason: collision with root package name */
    public final l9.p f22438d;

    public /* synthetic */ a(l9.p pVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, kotlin.jvm.internal.i iVar) {
        this(pVar, (i11 & 2) != 0 ? EmptyCoroutineContext.f21979a : dVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.f22240a : bufferOverflow);
    }

    public static /* synthetic */ Object n(a aVar, kotlinx.coroutines.channels.l lVar, c9.c cVar) {
        Object objInvoke = aVar.f22438d.invoke(lVar, cVar);
        return objInvoke == kotlin.coroutines.intrinsics.a.f() ? objInvoke : y8.s.f25199a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object e(kotlinx.coroutines.channels.l lVar, c9.c cVar) {
        return n(this, lVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow f(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return new a(this.f22438d, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.f22438d + "] -> " + super.toString();
    }

    public a(l9.p pVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        super(dVar, i10, bufferOverflow);
        this.f22438d = pVar;
    }
}
