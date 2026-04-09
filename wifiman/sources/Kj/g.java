package kj;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.MqttToken;

/* loaded from: classes3.dex */
public class g implements IMqttActionListener {

    /* renamed from: a, reason: collision with root package name */
    private MqttClientPersistence f51609a;

    /* renamed from: b, reason: collision with root package name */
    private MqttAsyncClient f51610b;

    /* renamed from: c, reason: collision with root package name */
    private C6473a f51611c;

    /* renamed from: d, reason: collision with root package name */
    private MqttConnectOptions f51612d;

    /* renamed from: e, reason: collision with root package name */
    private MqttToken f51613e;

    /* renamed from: f, reason: collision with root package name */
    private Object f51614f;

    /* renamed from: g, reason: collision with root package name */
    private IMqttActionListener f51615g;

    /* renamed from: h, reason: collision with root package name */
    private int f51616h;

    /* renamed from: i, reason: collision with root package name */
    private MqttCallbackExtended f51617i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f51618j;

    public g(MqttAsyncClient mqttAsyncClient, MqttClientPersistence mqttClientPersistence, C6473a c6473a, MqttConnectOptions mqttConnectOptions, MqttToken mqttToken, Object obj, IMqttActionListener iMqttActionListener, boolean z10) {
        this.f51609a = mqttClientPersistence;
        this.f51610b = mqttAsyncClient;
        this.f51611c = c6473a;
        this.f51612d = mqttConnectOptions;
        this.f51613e = mqttToken;
        this.f51614f = obj;
        this.f51615g = iMqttActionListener;
        this.f51616h = mqttConnectOptions.getMqttVersion();
        this.f51618j = z10;
    }

    public void a() throws MqttPersistenceException, IllegalArgumentException {
        MqttToken mqttToken = new MqttToken(this.f51610b.getClientId());
        mqttToken.setActionCallback(this);
        mqttToken.setUserContext(this);
        this.f51609a.open(this.f51610b.getClientId(), this.f51610b.getServerURI());
        if (this.f51612d.isCleanSession()) {
            this.f51609a.clear();
        }
        if (this.f51612d.getMqttVersion() == 0) {
            this.f51612d.setMqttVersion(4);
        }
        try {
            this.f51611c.q(this.f51612d, mqttToken);
        } catch (MqttException e10) {
            onFailure(mqttToken, e10);
        }
    }

    public void b(MqttCallbackExtended mqttCallbackExtended) {
        this.f51617i = mqttCallbackExtended;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
    public void onFailure(IMqttToken iMqttToken, Throwable th2) throws IllegalArgumentException {
        int length = this.f51611c.E().length;
        int iD = this.f51611c.D() + 1;
        if (iD >= length && (this.f51616h != 0 || this.f51612d.getMqttVersion() != 4)) {
            if (this.f51616h == 0) {
                this.f51612d.setMqttVersion(0);
            }
            this.f51613e.internalTok.q(null, th2 instanceof MqttException ? (MqttException) th2 : new MqttException(th2));
            this.f51613e.internalTok.r();
            this.f51613e.internalTok.u(this.f51610b);
            if (this.f51615g != null) {
                this.f51613e.setUserContext(this.f51614f);
                this.f51615g.onFailure(this.f51613e, th2);
                return;
            }
            return;
        }
        if (this.f51616h != 0) {
            this.f51611c.X(iD);
        } else if (this.f51612d.getMqttVersion() == 4) {
            this.f51612d.setMqttVersion(3);
        } else {
            this.f51612d.setMqttVersion(4);
            this.f51611c.X(iD);
        }
        try {
            a();
        } catch (MqttPersistenceException e10) {
            onFailure(iMqttToken, e10);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
    public void onSuccess(IMqttToken iMqttToken) throws IllegalArgumentException {
        if (this.f51616h == 0) {
            this.f51612d.setMqttVersion(0);
        }
        this.f51613e.internalTok.q(iMqttToken.getResponse(), null);
        this.f51613e.internalTok.r();
        this.f51613e.internalTok.u(this.f51610b);
        this.f51611c.P();
        if (this.f51615g != null) {
            this.f51613e.setUserContext(this.f51614f);
            this.f51615g.onSuccess(this.f51613e);
        }
        if (this.f51617i != null) {
            this.f51617i.connectComplete(this.f51618j, this.f51611c.E()[this.f51611c.D()].getServerURI());
        }
    }
}
