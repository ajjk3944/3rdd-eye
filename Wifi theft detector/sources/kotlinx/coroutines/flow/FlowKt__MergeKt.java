package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class FlowKt__MergeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22395a = kotlinx.coroutines.internal.d0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    public static final b a(b bVar, l9.p pVar) {
        return d.G(bVar, new FlowKt__MergeKt$mapLatest$1(pVar, null));
    }

    public static final b b(b bVar, l9.q qVar) {
        return new ChannelFlowTransformLatest(qVar, bVar, null, 0, null, 28, null);
    }
}
