package Ii;

/* loaded from: classes4.dex */
public abstract class E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ni.C f9259a = new Ni.C("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final Ni.C f9260b = new Ni.C("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final Ni.C f9261c = new Ni.C("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final Ni.C f9262d = new Ni.C("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final Ni.C f9263e = new Ni.C("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final C3058h0 f9264f = new C3058h0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final C3058h0 f9265g = new C3058h0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC3083u0 ? new C3085v0((InterfaceC3083u0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC3083u0 interfaceC3083u0;
        C3085v0 c3085v0 = obj instanceof C3085v0 ? (C3085v0) obj : null;
        return (c3085v0 == null || (interfaceC3083u0 = c3085v0.f9359a) == null) ? obj : interfaceC3083u0;
    }
}
