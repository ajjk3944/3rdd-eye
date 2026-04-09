package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements l9.p {

    /* renamed from: a, reason: collision with root package name */
    public static final BufferedChannelKt$createSegmentFunction$1 f22283a = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    public final g b(long j10, g gVar) {
        return BufferedChannelKt.x(j10, gVar);
    }

    @Override // l9.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Number) obj).longValue(), (g) obj2);
    }
}
