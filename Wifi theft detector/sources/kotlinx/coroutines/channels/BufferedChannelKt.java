package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.f0;

/* loaded from: classes4.dex */
public abstract class BufferedChannelKt {

    /* renamed from: a, reason: collision with root package name */
    public static final g f22264a = new g(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f22265b = f0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f22266c = f0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f22267d = new c0("BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f22268e = new c0("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f22269f = new c0("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f22270g = new c0("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f22271h = new c0("POISONED");

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f22272i = new c0("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    public static final c0 f22273j = new c0("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    public static final c0 f22274k = new c0("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    public static final c0 f22275l = new c0("CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    public static final c0 f22276m = new c0("SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    public static final c0 f22277n = new c0("SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    public static final c0 f22278o = new c0("FAILED");

    /* renamed from: p, reason: collision with root package name */
    public static final c0 f22279p = new c0("NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    public static final c0 f22280q = new c0("CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    public static final c0 f22281r = new c0("CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    public static final c0 f22282s = new c0("NO_CLOSE_CAUSE");

    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean B(kotlinx.coroutines.o oVar, Object obj, l9.l lVar) {
        Object objS = oVar.s(obj, null, lVar);
        if (objS == null) {
            return false;
        }
        oVar.C(objS);
        return true;
    }

    public static /* synthetic */ boolean C(kotlinx.coroutines.o oVar, Object obj, l9.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return B(oVar, obj, lVar);
    }

    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    public static final long w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    public static final g x(long j10, g gVar) {
        return new g(j10, gVar, gVar.x(), 0);
    }

    public static final r9.g y() {
        return BufferedChannelKt$createSegmentFunction$1.f22283a;
    }

    public static final c0 z() {
        return f22275l;
    }
}
