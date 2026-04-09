package kj;

import java.io.IOException;
import java.util.ArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.paho.client.mqttv3.MqttException;

/* loaded from: classes3.dex */
public class s extends v {

    /* renamed from: o, reason: collision with root package name */
    private static final String f51642o = "kj.s";

    /* renamed from: h, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f51643h;

    /* renamed from: i, reason: collision with root package name */
    private String[] f51644i;

    /* renamed from: j, reason: collision with root package name */
    private int f51645j;

    /* renamed from: k, reason: collision with root package name */
    private HostnameVerifier f51646k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f51647l;

    /* renamed from: m, reason: collision with root package name */
    private String f51648m;

    /* renamed from: n, reason: collision with root package name */
    private int f51649n;

    public s(SSLSocketFactory sSLSocketFactory, String str, int i10, String str2) {
        super(sSLSocketFactory, str, i10, str2);
        org.eclipse.paho.client.mqttv3.logging.a aVarA = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f51642o);
        this.f51643h = aVarA;
        this.f51647l = false;
        this.f51648m = str;
        this.f51649n = i10;
        aVarA.setResourceName(str2);
    }

    public void d(String[] strArr) {
        if (strArr != null) {
            this.f51644i = (String[]) strArr.clone();
        }
        if (this.f51652b == null || this.f51644i == null) {
            return;
        }
        if (this.f51643h.isLoggable(5)) {
            String str = "";
            for (int i10 = 0; i10 < this.f51644i.length; i10++) {
                if (i10 > 0) {
                    str = String.valueOf(str) + ",";
                }
                str = String.valueOf(str) + this.f51644i[i10];
            }
            this.f51643h.fine(f51642o, "setEnabledCiphers", "260", new Object[]{str});
        }
        ((SSLSocket) this.f51652b).setEnabledCipherSuites(this.f51644i);
    }

    public void e(boolean z10) {
        this.f51647l = z10;
    }

    public void f(HostnameVerifier hostnameVerifier) {
        this.f51646k = hostnameVerifier;
    }

    public void g(int i10) {
        super.c(i10);
        this.f51645j = i10;
    }

    @Override // kj.v, kj.p
    public String getServerURI() {
        return "ssl://" + this.f51648m + ":" + this.f51649n;
    }

    @Override // kj.v, kj.p
    public void start() throws MqttException, IOException {
        super.start();
        d(this.f51644i);
        int soTimeout = this.f51652b.getSoTimeout();
        this.f51652b.setSoTimeout(this.f51645j * 1000);
        try {
            SSLParameters sSLParameters = new SSLParameters();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new SNIHostName(this.f51648m));
            sSLParameters.setServerNames(arrayList);
            ((SSLSocket) this.f51652b).setSSLParameters(sSLParameters);
        } catch (NoClassDefFoundError unused) {
        }
        if (this.f51647l) {
            try {
                SSLParameters sSLParameters2 = new SSLParameters();
                sSLParameters2.setEndpointIdentificationAlgorithm("HTTPS");
                ((SSLSocket) this.f51652b).setSSLParameters(sSLParameters2);
            } catch (NoSuchMethodError unused2) {
            }
        }
        ((SSLSocket) this.f51652b).startHandshake();
        if (this.f51646k != null && !this.f51647l) {
            SSLSession session = ((SSLSocket) this.f51652b).getSession();
            if (!this.f51646k.verify(this.f51648m, session)) {
                session.invalidate();
                this.f51652b.close();
                throw new SSLPeerUnverifiedException("Host: " + this.f51648m + ", Peer Host: " + session.getPeerHost());
            }
        }
        this.f51652b.setSoTimeout(soTimeout);
    }
}
