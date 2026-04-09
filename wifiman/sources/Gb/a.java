package Gb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import th.l;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final d f7257a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7258b;

    /* renamed from: c, reason: collision with root package name */
    private final e f7259c;

    /* renamed from: d, reason: collision with root package name */
    private final e f7260d;

    /* renamed from: e, reason: collision with root package name */
    private final e f7261e;

    /* renamed from: f, reason: collision with root package name */
    private final e f7262f;

    /* renamed from: g, reason: collision with root package name */
    private final e f7263g;

    /* renamed from: h, reason: collision with root package name */
    private final e f7264h;

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ l[] f7256j = {O.f(new z(a.class, "trustedCertificates", "getTrustedCertificates()Ljava/lang/String;", 0)), O.f(new z(a.class, "anonymousDeviceId", "getAnonymousDeviceId()Ljava/lang/String;", 0)), O.f(new z(a.class, "lastWebRtcLogSent", "getLastWebRtcLogSent()Ljava/lang/String;", 0)), O.f(new z(a.class, "supportPin", "getSupportPin()Ljava/lang/String;", 0)), O.f(new z(a.class, "systemResponse", "getSystemResponse()Ljava/lang/String;", 0)), O.f(new z(a.class, "deviceToken", "getDeviceToken()Ljava/lang/String;", 0))};

    /* renamed from: i, reason: collision with root package name */
    private static final C0293a f7255i = new C0293a(null);

    /* renamed from: Gb.a$a, reason: collision with other inner class name */
    private static final class C0293a {
        public /* synthetic */ C0293a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0293a() {
        }
    }

    public a(d storage, String deviceId) {
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(deviceId, "deviceId");
        this.f7257a = storage;
        this.f7258b = deviceId;
        this.f7259c = j("deviceCertificates");
        this.f7260d = j("anonymousDeviceId");
        this.f7261e = j("lastWebRtcLogSent");
        this.f7262f = j("supportPin");
        this.f7263g = j("systemResponse");
        this.f7264h = j("deviceToken");
    }

    private final e j(String str) {
        return new e(this.f7257a, str + "_" + this.f7258b);
    }

    public final void a() {
        f(null);
    }

    public final String b() {
        return this.f7260d.a(this, f7256j[1]);
    }

    public final String c() {
        return this.f7261e.a(this, f7256j[2]);
    }

    public final String d() {
        return this.f7259c.a(this, f7256j[0]);
    }

    public final void e(String str) {
        this.f7260d.b(this, f7256j[1], str);
    }

    public final void f(String str) {
        this.f7264h.b(this, f7256j[5], str);
    }

    public final void g(String str) {
        this.f7261e.b(this, f7256j[2], str);
    }

    public final void h(String str) {
        this.f7263g.b(this, f7256j[4], str);
    }

    public final void i(String str) {
        this.f7259c.b(this, f7256j[0], str);
    }
}
