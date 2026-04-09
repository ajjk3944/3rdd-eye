package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.FlowCoroutineKt;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class FlowKt__DelayKt {
    public static final b a(b bVar, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? bVar : b(bVar, new l9.l() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // l9.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Long invoke(Object obj) {
                    return Long.valueOf(j10);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final b b(b bVar, l9.l lVar) {
        return FlowCoroutineKt.b(new FlowKt__DelayKt$debounceInternal$1(lVar, bVar, null));
    }
}
