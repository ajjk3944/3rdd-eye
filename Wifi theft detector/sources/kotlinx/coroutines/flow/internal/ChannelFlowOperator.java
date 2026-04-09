package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.c;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import y8.s;

/* loaded from: classes4.dex */
public abstract class ChannelFlowOperator extends ChannelFlow {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.b f22455d;

    public ChannelFlowOperator(kotlinx.coroutines.flow.b bVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        super(dVar, i10, bufferOverflow);
        this.f22455d = bVar;
    }

    public static /* synthetic */ Object n(ChannelFlowOperator channelFlowOperator, kotlinx.coroutines.flow.c cVar, c9.c cVar2) {
        if (channelFlowOperator.f22453b == -3) {
            kotlin.coroutines.d context = cVar2.getContext();
            kotlin.coroutines.d dVarD = CoroutineContextKt.d(context, channelFlowOperator.f22452a);
            if (kotlin.jvm.internal.p.a(dVarD, context)) {
                Object objQ = channelFlowOperator.q(cVar, cVar2);
                return objQ == kotlin.coroutines.intrinsics.a.f() ? objQ : s.f25199a;
            }
            c.b bVar = kotlin.coroutines.c.F8;
            if (kotlin.jvm.internal.p.a(dVarD.get(bVar), context.get(bVar))) {
                Object objP = channelFlowOperator.p(cVar, dVarD, cVar2);
                return objP == kotlin.coroutines.intrinsics.a.f() ? objP : s.f25199a;
            }
        }
        Object objCollect = super.collect(cVar, cVar2);
        return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
    }

    public static /* synthetic */ Object o(ChannelFlowOperator channelFlowOperator, kotlinx.coroutines.channels.l lVar, c9.c cVar) {
        Object objQ = channelFlowOperator.q(new n(lVar), cVar);
        return objQ == kotlin.coroutines.intrinsics.a.f() ? objQ : s.f25199a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.b
    public Object collect(kotlinx.coroutines.flow.c cVar, c9.c cVar2) {
        return n(this, cVar, cVar2);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object e(kotlinx.coroutines.channels.l lVar, c9.c cVar) {
        return o(this, lVar, cVar);
    }

    public final Object p(kotlinx.coroutines.flow.c cVar, kotlin.coroutines.d dVar, c9.c cVar2) {
        return d.c(dVar, d.d(cVar, cVar2.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), cVar2, 4, null);
    }

    public abstract Object q(kotlinx.coroutines.flow.c cVar, c9.c cVar2);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.f22455d + " -> " + super.toString();
    }
}
