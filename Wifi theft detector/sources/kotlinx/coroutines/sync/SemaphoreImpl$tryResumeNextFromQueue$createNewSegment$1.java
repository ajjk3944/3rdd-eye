package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import l9.p;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 extends FunctionReferenceImpl implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 f22681a = new SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1();

    public SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    public final d b(long j10, d dVar) {
        return c.h(j10, dVar);
    }

    @Override // l9.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Number) obj).longValue(), (d) obj2);
    }
}
