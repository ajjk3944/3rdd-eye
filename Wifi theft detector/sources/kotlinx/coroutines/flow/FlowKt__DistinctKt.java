package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class FlowKt__DistinctKt {

    /* renamed from: a, reason: collision with root package name */
    public static final l9.l f22368a = new l9.l() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1
        @Override // l9.l
        public final Object invoke(Object obj) {
            return obj;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final l9.p f22369b = new l9.p() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1
        @Override // l9.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(kotlin.jvm.internal.p.a(obj, obj2));
        }
    };

    public static final b a(b bVar) {
        return bVar instanceof d1 ? bVar : b(bVar, f22368a, f22369b);
    }

    public static final b b(b bVar, l9.l lVar, l9.p pVar) {
        if (bVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) bVar;
            if (distinctFlowImpl.f22362b == lVar && distinctFlowImpl.f22363c == pVar) {
                return bVar;
            }
        }
        return new DistinctFlowImpl(bVar, lVar, pVar);
    }
}
