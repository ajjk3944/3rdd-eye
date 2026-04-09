package zk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final p f38346a = new p(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f38347b = cl.b.l(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c, reason: collision with root package name */
    public static final int f38348c = cl.b.l(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d, reason: collision with root package name */
    public static final cl.u f38349d = new cl.u("BUFFERED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final cl.u f38350e = new cl.u("SHOULD_BUFFER", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final cl.u f38351f = new cl.u("S_RESUMING_BY_RCV", 0);
    public static final cl.u g = new cl.u("RESUMING_BY_EB", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final cl.u f38352h = new cl.u("POISONED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final cl.u f38353i = new cl.u("DONE_RCV", 0);
    public static final cl.u j = new cl.u("INTERRUPTED_SEND", 0);

    /* renamed from: k, reason: collision with root package name */
    public static final cl.u f38354k = new cl.u("INTERRUPTED_RCV", 0);

    /* renamed from: l, reason: collision with root package name */
    public static final cl.u f38355l = new cl.u("CHANNEL_CLOSED", 0);

    /* renamed from: m, reason: collision with root package name */
    public static final cl.u f38356m = new cl.u("SUSPEND", 0);

    /* renamed from: n, reason: collision with root package name */
    public static final cl.u f38357n = new cl.u("SUSPEND_NO_WAITER", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final cl.u f38358o = new cl.u("FAILED", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final cl.u f38359p = new cl.u("NO_RECEIVE_RESULT", 0);

    /* renamed from: q, reason: collision with root package name */
    public static final cl.u f38360q = new cl.u("CLOSE_HANDLER_CLOSED", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final cl.u f38361r = new cl.u("CLOSE_HANDLER_INVOKED", 0);

    /* renamed from: s, reason: collision with root package name */
    public static final cl.u f38362s = new cl.u("NO_CLOSE_CAUSE", 0);

    public static final boolean a(xk.g gVar, Object obj, mk.f fVar) {
        cl.u uVarJ = gVar.j(obj, fVar);
        if (uVarJ == null) {
            return false;
        }
        gVar.n(uVarJ);
        return true;
    }
}
