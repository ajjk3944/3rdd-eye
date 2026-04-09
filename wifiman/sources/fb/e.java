package fb;

import Zg.AbstractC3689v;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.logging.HttpLoggingInterceptor;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import ub.C8156c;
import wb.C8294d;
import wb.InterfaceC8291a;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f47234a;

    /* renamed from: b, reason: collision with root package name */
    private final String f47235b;

    /* renamed from: c, reason: collision with root package name */
    private final Gb.f f47236c;

    /* renamed from: d, reason: collision with root package name */
    private final u f47237d;

    /* renamed from: e, reason: collision with root package name */
    private final String f47238e;

    /* renamed from: f, reason: collision with root package name */
    private final v f47239f;

    /* renamed from: g, reason: collision with root package name */
    private final p f47240g;

    public e(String ip, String macAddress, Gb.f storage, s localLoginTokenStorage, InterfaceC8291a interfaceC8291a, HttpLoggingInterceptor.Level httpLogLevel, Cb.a trustedDeviceHelper) throws SecurityException {
        AbstractC6492s.i(ip, "ip");
        AbstractC6492s.i(macAddress, "macAddress");
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(localLoginTokenStorage, "localLoginTokenStorage");
        AbstractC6492s.i(httpLogLevel, "httpLogLevel");
        AbstractC6492s.i(trustedDeviceHelper, "trustedDeviceHelper");
        this.f47234a = ip;
        this.f47235b = macAddress;
        this.f47236c = storage;
        u uVar = new u(macAddress, storage);
        this.f47237d = uVar;
        String str = "https://" + ip + MqttTopic.TOPIC_LEVEL_SEPARATOR;
        this.f47238e = str;
        v vVar = new v();
        this.f47239f = vVar;
        Object objB = new C8294d(str, vVar, AbstractC3689v.o(new d(), new r(localLoginTokenStorage), new Db.a(null, storage, 1, null), new Db.b("/api/auth/login/poll"), new Db.d(trustedDeviceHelper)), d(uVar), uVar, C5803a.f47231a, C8156c.f62925a.d(), interfaceC8291a, httpLogLevel).d().b(p.class);
        AbstractC6492s.h(objB, "create(...)");
        this.f47240g = (p) objB;
    }

    public final v a() {
        return this.f47239f;
    }

    public final String b() {
        return this.f47234a;
    }

    public final p c() {
        return this.f47240g;
    }

    public final SSLSocketFactory d(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        AbstractC6492s.i(trustManager, "trustManager");
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, new X509TrustManager[]{trustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (Exception e10) {
            Sj.a.f20830a.p(e10, "error while creating ssl context", new Object[0]);
            return null;
        }
    }

    public final u e() {
        return this.f47237d;
    }

    public final String f() {
        return this.f47238e;
    }

    public final void g(Certificate[] certificates) {
        AbstractC6492s.i(certificates, "certificates");
        this.f47236c.g(this.f47235b, certificates);
    }
}
