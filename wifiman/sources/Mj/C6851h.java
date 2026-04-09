package mj;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.util.Properties;
import javax.net.ssl.SSLSocketFactory;
import kj.s;
import org.eclipse.paho.client.mqttv3.MqttException;

/* renamed from: mj.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6851h extends s {

    /* renamed from: x, reason: collision with root package name */
    private static final String f54076x = "mj.h";

    /* renamed from: p, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f54077p;

    /* renamed from: q, reason: collision with root package name */
    private PipedInputStream f54078q;

    /* renamed from: r, reason: collision with root package name */
    private RunnableC6850g f54079r;

    /* renamed from: s, reason: collision with root package name */
    private String f54080s;

    /* renamed from: t, reason: collision with root package name */
    private String f54081t;

    /* renamed from: u, reason: collision with root package name */
    private int f54082u;

    /* renamed from: v, reason: collision with root package name */
    private Properties f54083v;

    /* renamed from: w, reason: collision with root package name */
    private ByteArrayOutputStream f54084w;

    public C6851h(SSLSocketFactory sSLSocketFactory, String str, String str2, int i10, String str3, Properties properties) {
        super(sSLSocketFactory, str2, i10, str3);
        this.f54077p = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f54076x);
        this.f54084w = new C6845b(this);
        this.f54080s = str;
        this.f54081t = str2;
        this.f54082u = i10;
        this.f54083v = properties;
        this.f54078q = new PipedInputStream();
        this.f54077p.setResourceName(str3);
    }

    @Override // kj.v, kj.p
    public OutputStream a() {
        return this.f54084w;
    }

    @Override // kj.v, kj.p
    public InputStream b() {
        return this.f54078q;
    }

    @Override // kj.s, kj.v, kj.p
    public String getServerURI() {
        return "wss://" + this.f54081t + ":" + this.f54082u;
    }

    InputStream h() {
        return super.b();
    }

    OutputStream i() {
        return super.a();
    }

    @Override // kj.s, kj.v, kj.p
    public void start() throws MqttException, IOException {
        super.start();
        new C6847d(super.b(), super.a(), this.f54080s, this.f54081t, this.f54082u, this.f54083v).a();
        RunnableC6850g runnableC6850g = new RunnableC6850g(h(), this.f54078q);
        this.f54079r = runnableC6850g;
        runnableC6850g.b("WssSocketReceiver");
    }

    @Override // kj.v, kj.p
    public void stop() throws InterruptedException, IOException {
        i().write(new C6846c((byte) 8, true, "1000".getBytes()).d());
        i().flush();
        RunnableC6850g runnableC6850g = this.f54079r;
        if (runnableC6850g != null) {
            runnableC6850g.c();
        }
        super.stop();
    }
}
