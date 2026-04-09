package Gb;

import Zg.AbstractC3689v;
import Zg.Q;
import aj.AbstractC3868b;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import kotlin.text.t;
import mh.InterfaceC6835l;
import org.json.JSONArray;
import org.json.JSONException;
import sh.AbstractC7978m;
import th.l;

/* loaded from: classes3.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    private final c f7277a;

    /* renamed from: b, reason: collision with root package name */
    private final e f7278b;

    /* renamed from: c, reason: collision with root package name */
    private final e f7279c;

    /* renamed from: d, reason: collision with root package name */
    private final e f7280d;

    /* renamed from: e, reason: collision with root package name */
    private final e f7281e;

    /* renamed from: f, reason: collision with root package name */
    private final e f7282f;

    /* renamed from: g, reason: collision with root package name */
    private final e f7283g;

    /* renamed from: h, reason: collision with root package name */
    private final e f7284h;

    /* renamed from: i, reason: collision with root package name */
    private final e f7285i;

    /* renamed from: j, reason: collision with root package name */
    private final e f7286j;

    /* renamed from: k, reason: collision with root package name */
    private final e f7287k;

    /* renamed from: l, reason: collision with root package name */
    private final Gb.c f7288l;

    /* renamed from: m, reason: collision with root package name */
    private final e f7289m;

    /* renamed from: n, reason: collision with root package name */
    private final e f7290n;

    /* renamed from: o, reason: collision with root package name */
    private final e f7291o;

    /* renamed from: p, reason: collision with root package name */
    private final Map f7292p;

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ l[] f7276r = {O.f(new z(i.class, "uiAuthToken", "getUiAuthToken()Ljava/lang/String;", 0)), O.f(new z(i.class, "sessionCookies", "getSessionCookies()Ljava/lang/String;", 0)), O.f(new z(i.class, "twoFaAuthCookie", "getTwoFaAuthCookie()Ljava/lang/String;", 0)), O.f(new z(i.class, "ssoId", "getSsoId()Ljava/lang/String;", 0)), O.f(new z(i.class, "ssoEmail", "getSsoEmail()Ljava/lang/String;", 0)), O.f(new z(i.class, "ssoUsername", "getSsoUsername()Ljava/lang/String;", 0)), O.f(new z(i.class, "ssoPassword", "getSsoPassword()Ljava/lang/String;", 0)), O.f(new z(i.class, "cloudToken", "getCloudToken()Ljava/lang/String;", 0)), O.f(new z(i.class, "cloudConfig", "getCloudConfig()Ljava/lang/String;", 0)), O.f(new z(i.class, "pkceCodeVerifier", "getPkceCodeVerifier()Ljava/lang/String;", 0)), O.f(new z(i.class, "localLoginToken", "getLocalLoginToken()Lcom/ui/unifi/core/storage/LocalLoginToken;", 0)), O.f(new z(i.class, "deviceId", "getDeviceId()Ljava/lang/String;", 0)), O.f(new z(i.class, "deviceName", "getDeviceName()Ljava/lang/String;", 0)), O.f(new z(i.class, "deviceModel", "getDeviceModel()Ljava/lang/String;", 0))};

    /* renamed from: q, reason: collision with root package name */
    public static final a f7275q = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final Map f7293a = new LinkedHashMap();

        @Override // Gb.d
        public void a(String key, String str) {
            AbstractC6492s.i(key, "key");
            this.f7293a.put(key, str);
        }

        @Override // Gb.d
        public String b(String key) {
            AbstractC6492s.i(key, "key");
            return (String) this.f7293a.get(key);
        }

        public final void c() {
            this.f7293a.clear();
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final d f7294a;

        /* renamed from: b, reason: collision with root package name */
        private final b f7295b;

        public c(d storage) {
            AbstractC6492s.i(storage, "storage");
            this.f7294a = storage;
            this.f7295b = new b();
        }

        @Override // Gb.d
        public void a(String key, String str) {
            AbstractC6492s.i(key, "key");
            this.f7295b.a(key, str);
            this.f7294a.a(key, str);
        }

        @Override // Gb.d
        public String b(String key) {
            AbstractC6492s.i(key, "key");
            String strB = this.f7295b.b(key);
            if (strB != null) {
                return strB;
            }
            String strB2 = this.f7294a.b(key);
            this.f7295b.a(key, strB2);
            return strB2;
        }

        public final void c() {
            this.f7295b.c();
        }
    }

    public i(d storage) {
        AbstractC6492s.i(storage, "storage");
        this.f7277a = new c(storage);
        this.f7278b = R("uiAuthToken");
        this.f7279c = R("sessionCookies");
        this.f7280d = R("twoFaAuthCookie");
        this.f7281e = R("ssoId");
        this.f7282f = R("ssoEmail");
        this.f7283g = R("ssoUsername");
        this.f7284h = R("ssoPassword");
        this.f7285i = R("cloudToken");
        this.f7286j = R("cloudConfig");
        this.f7287k = R("pkceCodeVerifier");
        this.f7288l = new Gb.c(storage, "localLoginToken", new InterfaceC6835l() { // from class: Gb.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.N((LocalLoginToken) obj);
            }
        }, new InterfaceC6835l() { // from class: Gb.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.O((String) obj);
            }
        });
        this.f7289m = R("deviceId");
        this.f7290n = R("deviceName");
        this.f7291o = R("deviceModel");
        this.f7292p = new LinkedHashMap();
    }

    private final Gb.a L(String str) {
        Gb.a aVar;
        synchronized (this.f7292p) {
            try {
                Map map = this.f7292p;
                Object aVar2 = map.get(str);
                if (aVar2 == null) {
                    aVar2 = new Gb.a(this.f7277a, str);
                    map.put(str, aVar2);
                }
                aVar = (Gb.a) aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    private final Set M(String str) throws JSONException {
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC6492s.h(upperCase, "toUpperCase(...)");
        String strD = L(upperCase).d();
        if (strD == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(strD);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = AbstractC7978m.s(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            String string = jSONArray.getString(((Q) it).d());
            AbstractC6492s.h(string, "getString(...)");
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String N(LocalLoginToken localLoginToken) {
        AbstractC3868b abstractC3868bB = Hb.b.f7819a.b();
        abstractC3868bB.a();
        return abstractC3868bB.c(Wi.a.u(LocalLoginToken.INSTANCE.serializer()), localLoginToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalLoginToken O(String it) {
        AbstractC6492s.i(it, "it");
        AbstractC3868b abstractC3868bB = Hb.b.f7819a.b();
        abstractC3868bB.a();
        return (LocalLoginToken) abstractC3868bB.b(Wi.a.u(LocalLoginToken.INSTANCE.serializer()), it);
    }

    private final Set P(Certificate[] certificateArr) {
        ArrayList arrayList = new ArrayList(certificateArr.length);
        for (Certificate certificate : certificateArr) {
            String strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(certificate.getEncoded()), 0);
            AbstractC6492s.h(strEncodeToString, "encodeToString(...)");
            arrayList.add(t.q1(strEncodeToString).toString());
        }
        return AbstractC3689v.n1(arrayList);
    }

    private final e R(String str) {
        return new e(this.f7277a, str);
    }

    @Override // Gb.f
    public String A() {
        return this.f7291o.a(this, f7276r[13]);
    }

    @Override // Gb.f
    public void B(String str) {
        this.f7287k.b(this, f7276r[9], str);
    }

    @Override // Gb.f
    public void C(String str) {
        this.f7280d.b(this, f7276r[2], str);
    }

    @Override // Gb.f
    public boolean D(String deviceId, Certificate[] certificates) throws JSONException {
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(certificates, "certificates");
        Set setM = M(deviceId);
        if (setM == null) {
            return false;
        }
        return AbstractC6492s.d(P(certificates), setM);
    }

    @Override // Gb.f
    public LocalLoginToken E() {
        return (LocalLoginToken) this.f7288l.a(this, f7276r[10]);
    }

    @Override // Gb.f
    public void F(String deviceId, String systemResponse) {
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(systemResponse, "systemResponse");
        L(deviceId).h(systemResponse);
    }

    @Override // Gb.f
    public String G() {
        return this.f7283g.a(this, f7276r[5]);
    }

    @Override // Gb.f
    public void H(String deviceId, long j10) {
        AbstractC6492s.i(deviceId, "deviceId");
        L(deviceId).g(String.valueOf(j10));
    }

    @Override // Gb.f
    public Long I(String deviceId) {
        AbstractC6492s.i(deviceId, "deviceId");
        String strC = L(deviceId).c();
        if (strC != null) {
            return t.s(strC);
        }
        return null;
    }

    @Override // Gb.f
    public void J(String str) {
        this.f7291o.b(this, f7276r[13], str);
    }

    public void K() {
        this.f7277a.c();
        k(null);
        q(null);
        y(null);
        n(null);
        m(null);
        o(null);
        Q(null);
        i(null);
        Iterator it = this.f7292p.entrySet().iterator();
        while (it.hasNext()) {
            ((Gb.a) ((Map.Entry) it.next()).getValue()).a();
        }
        B(null);
    }

    public void Q(String str) {
        this.f7285i.b(this, f7276r[7], str);
    }

    @Override // Gb.f
    public String a() {
        return this.f7290n.a(this, f7276r[12]);
    }

    @Override // Gb.f
    public void d(String str) {
        this.f7290n.b(this, f7276r[12], str);
    }

    @Override // Gb.f
    public String e() {
        return this.f7286j.a(this, f7276r[8]);
    }

    @Override // Gb.f
    public void f(String deviceId, String anonymousDeviceId) {
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(anonymousDeviceId, "anonymousDeviceId");
        L(deviceId).e(anonymousDeviceId);
    }

    @Override // Gb.f
    public void g(String deviceId, Certificate[] certificates) {
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(certificates, "certificates");
        JSONArray jSONArray = new JSONArray();
        Iterator it = P(certificates).iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        String upperCase = deviceId.toUpperCase(Locale.ROOT);
        AbstractC6492s.h(upperCase, "toUpperCase(...)");
        L(upperCase).i(jSONArray.toString());
    }

    @Override // Gb.f
    public String h() {
        return this.f7281e.a(this, f7276r[3]);
    }

    @Override // Gb.f
    public void i(LocalLoginToken localLoginToken) {
        this.f7288l.b(this, f7276r[10], localLoginToken);
    }

    @Override // Gb.f
    public String j() {
        return this.f7284h.a(this, f7276r[6]);
    }

    @Override // Gb.f
    public void k(String str) {
        this.f7281e.b(this, f7276r[3], str);
    }

    @Override // Gb.f
    public void l(String str) {
        this.f7289m.b(this, f7276r[11], str);
    }

    @Override // Gb.f
    public void m(String str) {
        this.f7278b.b(this, f7276r[0], str);
    }

    @Override // Gb.f
    public void n(String str) {
        this.f7284h.b(this, f7276r[6], str);
    }

    @Override // Gb.f
    public void o(String str) {
        this.f7279c.b(this, f7276r[1], str);
    }

    @Override // Gb.f
    public String p() {
        return this.f7289m.a(this, f7276r[11]);
    }

    @Override // Gb.f
    public void q(String str) {
        this.f7282f.b(this, f7276r[4], str);
    }

    @Override // Gb.f
    public String r() {
        return this.f7278b.a(this, f7276r[0]);
    }

    @Override // Gb.f
    public String s() {
        return this.f7279c.a(this, f7276r[1]);
    }

    @Override // Gb.f
    public void t(String str) {
        this.f7286j.b(this, f7276r[8], str);
    }

    @Override // Gb.f
    public void u() {
        K();
    }

    @Override // Gb.f
    public String v() {
        return this.f7282f.a(this, f7276r[4]);
    }

    @Override // Gb.f
    public String w(String deviceId) {
        AbstractC6492s.i(deviceId, "deviceId");
        return L(deviceId).b();
    }

    @Override // Gb.f
    public String x() {
        return this.f7287k.a(this, f7276r[9]);
    }

    @Override // Gb.f
    public void y(String str) {
        this.f7283g.b(this, f7276r[5], str);
    }

    @Override // Gb.f
    public String z() {
        return this.f7280d.a(this, f7276r[2]);
    }
}
