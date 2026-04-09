package kj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import org.eclipse.paho.client.mqttv3.MqttException;

/* loaded from: classes3.dex */
public class v implements p {

    /* renamed from: g, reason: collision with root package name */
    private static final String f51650g = "kj.v";

    /* renamed from: a, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f51651a;

    /* renamed from: b, reason: collision with root package name */
    protected Socket f51652b;

    /* renamed from: c, reason: collision with root package name */
    private SocketFactory f51653c;

    /* renamed from: d, reason: collision with root package name */
    private String f51654d;

    /* renamed from: e, reason: collision with root package name */
    private int f51655e;

    /* renamed from: f, reason: collision with root package name */
    private int f51656f;

    public v(SocketFactory socketFactory, String str, int i10, String str2) {
        org.eclipse.paho.client.mqttv3.logging.a aVarA = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f51650g);
        this.f51651a = aVarA;
        aVarA.setResourceName(str2);
        this.f51653c = socketFactory;
        this.f51654d = str;
        this.f51655e = i10;
    }

    @Override // kj.p
    public OutputStream a() {
        return this.f51652b.getOutputStream();
    }

    @Override // kj.p
    public InputStream b() {
        return this.f51652b.getInputStream();
    }

    public void c(int i10) {
        this.f51656f = i10;
    }

    @Override // kj.p
    public String getServerURI() {
        return "tcp://" + this.f51654d + ":" + this.f51655e;
    }

    @Override // kj.p
    public void start() throws MqttException, IOException {
        try {
            this.f51651a.fine(f51650g, "start", "252", new Object[]{this.f51654d, Integer.valueOf(this.f51655e), Long.valueOf(this.f51656f * 1000)});
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f51654d, this.f51655e);
            Socket socketCreateSocket = this.f51653c.createSocket();
            this.f51652b = socketCreateSocket;
            socketCreateSocket.connect(inetSocketAddress, this.f51656f * 1000);
            this.f51652b.setSoTimeout(1000);
        } catch (ConnectException e10) {
            this.f51651a.fine(f51650g, "start", "250", null, e10);
            throw new MqttException(32103, e10);
        }
    }

    @Override // kj.p
    public void stop() throws IOException {
        Socket socket = this.f51652b;
        if (socket != null) {
            socket.close();
        }
    }
}
