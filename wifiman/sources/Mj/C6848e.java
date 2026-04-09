package mj;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.util.Properties;
import javax.net.SocketFactory;
import kj.v;
import org.eclipse.paho.client.mqttv3.MqttException;

/* renamed from: mj.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6848e extends v {

    /* renamed from: p, reason: collision with root package name */
    private static final String f54058p = "mj.e";

    /* renamed from: h, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f54059h;

    /* renamed from: i, reason: collision with root package name */
    private String f54060i;

    /* renamed from: j, reason: collision with root package name */
    private String f54061j;

    /* renamed from: k, reason: collision with root package name */
    private int f54062k;

    /* renamed from: l, reason: collision with root package name */
    private Properties f54063l;

    /* renamed from: m, reason: collision with root package name */
    private PipedInputStream f54064m;

    /* renamed from: n, reason: collision with root package name */
    private RunnableC6850g f54065n;

    /* renamed from: o, reason: collision with root package name */
    private ByteArrayOutputStream f54066o;

    public C6848e(SocketFactory socketFactory, String str, String str2, int i10, String str3, Properties properties) {
        super(socketFactory, str2, i10, str3);
        this.f54059h = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f54058p);
        this.f54066o = new C6845b(this);
        this.f54060i = str;
        this.f54061j = str2;
        this.f54062k = i10;
        this.f54063l = properties;
        this.f54064m = new PipedInputStream();
        this.f54059h.setResourceName(str3);
    }

    @Override // kj.v, kj.p
    public OutputStream a() {
        return this.f54066o;
    }

    @Override // kj.v, kj.p
    public InputStream b() {
        return this.f54064m;
    }

    InputStream d() {
        return super.b();
    }

    OutputStream e() {
        return super.a();
    }

    @Override // kj.v, kj.p
    public String getServerURI() {
        return "ws://" + this.f54061j + ":" + this.f54062k;
    }

    @Override // kj.v, kj.p
    public void start() throws MqttException, IOException {
        super.start();
        new C6847d(d(), e(), this.f54060i, this.f54061j, this.f54062k, this.f54063l).a();
        RunnableC6850g runnableC6850g = new RunnableC6850g(d(), this.f54064m);
        this.f54065n = runnableC6850g;
        runnableC6850g.b("webSocketReceiver");
    }

    @Override // kj.v, kj.p
    public void stop() throws InterruptedException, IOException {
        e().write(new C6846c((byte) 8, true, "1000".getBytes()).d());
        e().flush();
        RunnableC6850g runnableC6850g = this.f54065n;
        if (runnableC6850g != null) {
            runnableC6850g.c();
        }
        super.stop();
    }
}
