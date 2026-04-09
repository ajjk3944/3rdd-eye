package C9;

import A9.InterfaceC0581i;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final l<Object> f982a = new l<>(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f983b = E.u.P(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c, reason: collision with root package name */
    public static final int f984c = E.u.P(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d, reason: collision with root package name */
    public static final F9.y f985d = new F9.y("BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    public static final F9.y f986e = new F9.y("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    public static final F9.y f987f = new F9.y("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    public static final F9.y f988g = new F9.y("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    public static final F9.y f989h = new F9.y("POISONED");
    public static final F9.y i = new F9.y("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    public static final F9.y f990j = new F9.y("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    public static final F9.y f991k = new F9.y("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    public static final F9.y f992l = new F9.y("CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    public static final F9.y f993m = new F9.y("SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    public static final F9.y f994n = new F9.y("SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    public static final F9.y f995o = new F9.y("FAILED");

    /* renamed from: p, reason: collision with root package name */
    public static final F9.y f996p = new F9.y("NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    public static final F9.y f997q = new F9.y("CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    public static final F9.y f998r = new F9.y("CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    public static final F9.y f999s = new F9.y("NO_CLOSE_CAUSE");

    public static final boolean a(InterfaceC0581i interfaceC0581i, Object obj, F9.r rVar) {
        F9.y yVarJ = interfaceC0581i.j(obj, rVar);
        if (yVarJ == null) {
            return false;
        }
        interfaceC0581i.p(yVarJ);
        return true;
    }
}
