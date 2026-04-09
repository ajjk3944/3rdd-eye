package Ki;

import Ii.InterfaceC3069n;
import Ni.C;
import Ni.F;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final m f10849a = new m(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f10850b = F.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f10851c = F.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* renamed from: d, reason: collision with root package name */
    public static final C f10852d = new C("BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    private static final C f10853e = new C("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    private static final C f10854f = new C("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    private static final C f10855g = new C("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    private static final C f10856h = new C("POISONED");

    /* renamed from: i, reason: collision with root package name */
    private static final C f10857i = new C("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    private static final C f10858j = new C("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    private static final C f10859k = new C("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    private static final C f10860l = new C("CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    private static final C f10861m = new C("SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    private static final C f10862n = new C("SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    private static final C f10863o = new C("FAILED");

    /* renamed from: p, reason: collision with root package name */
    private static final C f10864p = new C("NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    private static final C f10865q = new C("CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    private static final C f10866r = new C("CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    private static final C f10867s = new C("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends C6490p implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10868a = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final m a(long j10, m mVar) {
            return f.x(j10, mVar);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (m) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC3069n interfaceC3069n, Object obj, mh.q qVar) {
        Object objP = interfaceC3069n.p(obj, null, qVar);
        if (objP == null) {
            return false;
        }
        interfaceC3069n.C0(objP);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC3069n interfaceC3069n, Object obj, mh.q qVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            qVar = null;
        }
        return B(interfaceC3069n, obj, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m x(long j10, m mVar) {
        return new m(j10, mVar, mVar.y(), 0);
    }

    public static final th.g y() {
        return a.f10868a;
    }

    public static final C z() {
        return f10860l;
    }
}
