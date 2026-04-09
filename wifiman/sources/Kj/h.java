package kj;

import java.util.ArrayList;
import org.eclipse.paho.client.mqttv3.BufferedMessage;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttToken;

/* loaded from: classes3.dex */
public class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final String f51619a;

    /* renamed from: b, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f51620b;

    /* renamed from: c, reason: collision with root package name */
    private DisconnectedBufferOptions f51621c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f51622d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f51623e;

    /* renamed from: f, reason: collision with root package name */
    private m f51624f;

    /* renamed from: g, reason: collision with root package name */
    private l f51625g;

    /* renamed from: h, reason: collision with root package name */
    private int f51626h;

    public h(DisconnectedBufferOptions disconnectedBufferOptions) {
        String name = h.class.getName();
        this.f51619a = name;
        this.f51620b = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", name);
        this.f51623e = new Object();
        this.f51626h = 0;
        this.f51621c = disconnectedBufferOptions;
        this.f51622d = new ArrayList();
    }

    public void a(int i10) {
        synchronized (this.f51623e) {
            this.f51622d.remove(i10);
        }
    }

    public BufferedMessage b(int i10) {
        BufferedMessage bufferedMessage;
        synchronized (this.f51623e) {
            bufferedMessage = (BufferedMessage) this.f51622d.get(i10);
        }
        return bufferedMessage;
    }

    public int c() {
        int size;
        synchronized (this.f51623e) {
            size = this.f51622d.size();
        }
        return size;
    }

    public boolean d() {
        return this.f51621c.isPersistBuffer();
    }

    public void e(nj.u uVar, MqttToken mqttToken) {
        if (mqttToken != null) {
            uVar.t(mqttToken);
            mqttToken.internalTok.y(uVar.j());
        }
        BufferedMessage bufferedMessage = new BufferedMessage(uVar, mqttToken);
        synchronized (this.f51623e) {
            try {
                if (this.f51622d.size() < this.f51621c.getBufferSize()) {
                    this.f51622d.add(bufferedMessage);
                } else {
                    if (!this.f51621c.isDeleteOldestMessages()) {
                        throw new MqttException(32203);
                    }
                    if (this.f51625g != null) {
                        this.f51625g.a(((BufferedMessage) this.f51622d.get(0)).getMessage());
                    }
                    this.f51622d.remove(0);
                    this.f51622d.add(bufferedMessage);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(l lVar) {
        this.f51625g = lVar;
    }

    public void g(m mVar) {
        this.f51624f = mVar;
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        this.f51620b.fine(this.f51619a, "run", "516");
        while (c() > 0) {
            try {
                this.f51624f.a(b(0));
                a(0);
            } catch (MqttException e10) {
                if (e10.getReasonCode() != 32202) {
                    this.f51620b.severe(this.f51619a, "run", "519", new Object[]{Integer.valueOf(e10.getReasonCode()), e10.getMessage()});
                    return;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
        }
    }
}
