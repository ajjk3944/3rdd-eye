package pb;

import Sj.a;
import Zg.AbstractC3689v;
import aj.AbstractC3868b;
import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttClientStatusCallback;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttManager;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttMessageDeliveryCallback;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttNewMessageCallback;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttQos;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttSubscriptionStatusCallback;
import gg.s;
import gg.t;
import gg.u;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kg.InterfaceC6468e;
import kg.n;
import kg.p;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import lb.C6569c;
import lb.CloudCredentials;
import lb.TurnCredentials;
import lb.UnifiCloudAccess;
import mh.InterfaceC6824a;
import nb.C6919b;
import nb.C6921d;
import nb.C6923f;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.webrtc.IceCandidate;
import pb.m;
import ub.C8156c;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final CloudCredentials f57835a;

    /* renamed from: b, reason: collision with root package name */
    private final C6569c f57836b;

    /* renamed from: c, reason: collision with root package name */
    private final String f57837c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f57838d;

    /* renamed from: e, reason: collision with root package name */
    private AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus f57839e;

    /* renamed from: f, reason: collision with root package name */
    private final Yg.m f57840f;

    /* renamed from: g, reason: collision with root package name */
    private final s f57841g;

    /* renamed from: h, reason: collision with root package name */
    private final StaticCredentialsProvider f57842h;

    static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f57843a = new a();

        a() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus it) {
            AbstractC6492s.i(it, "it");
            return it == AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected;
        }
    }

    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l apply(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus it) {
            AbstractC6492s.i(it, "it");
            return l.this;
        }
    }

    public static final class c implements AWSIotMqttSubscriptionStatusCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f57845a;

        c(t tVar) {
            this.f57845a = tVar;
        }

        @Override // com.amazonaws.mobileconnectors.iot.AWSIotMqttSubscriptionStatusCallback
        public void a(Throwable exception) {
            AbstractC6492s.i(exception, "exception");
            Sj.a.f20830a.p(exception, "subscribeToTopic failed", new Object[0]);
            this.f57845a.c(exception);
        }

        @Override // com.amazonaws.mobileconnectors.iot.AWSIotMqttSubscriptionStatusCallback
        public void b() {
            Sj.a.f20830a.a("subscribeToTopic success", new Object[0]);
        }
    }

    public l(final UnifiCloudAccess cloudAccess, CloudCredentials cloudCredentials, C6569c meta) {
        AbstractC6492s.i(cloudAccess, "cloudAccess");
        AbstractC6492s.i(cloudCredentials, "cloudCredentials");
        AbstractC6492s.i(meta, "meta");
        this.f57835a = cloudCredentials;
        this.f57836b = meta;
        this.f57837c = "android-" + UUID.randomUUID();
        this.f57838d = new AtomicInteger(1);
        this.f57839e = AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting;
        this.f57840f = Yg.n.b(new InterfaceC6824a() { // from class: pb.a
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return l.u(this.f57818a, cloudAccess);
            }
        });
        s sVarO = s.o(new u() { // from class: pb.c
            @Override // gg.u
            public final void a(t tVar) {
                l.m(this.f57821a, tVar);
            }
        });
        AbstractC6492s.h(sVarO, "create(...)");
        this.f57841g = sVarO;
        this.f57842h = new StaticCredentialsProvider(new BasicSessionCredentials(cloudCredentials.getAccessKeyId(), cloudCredentials.getSecretKey(), cloudCredentials.getSessionToken()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(l lVar, String str, t tVar) {
        try {
            lVar.s().c0(str);
        } catch (Throwable th2) {
            tVar.c(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(t tVar, C6923f it) {
        AbstractC6492s.i(it, "it");
        tVar.h(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final l lVar, final t emitter) {
        AbstractC6492s.i(emitter, "emitter");
        lVar.s().C(lVar.f57842h, new AWSIotMqttClientStatusCallback() { // from class: pb.d
            @Override // com.amazonaws.mobileconnectors.iot.AWSIotMqttClientStatusCallback
            public final void a(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus aWSIotMqttClientStatus, Throwable th2) {
                l.n(this.f57822a, emitter, aWSIotMqttClientStatus, th2);
            }
        });
        emitter.d(new InterfaceC6468e() { // from class: pb.e
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                l.o(this.f57824a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(l lVar, t tVar, AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus aWSIotMqttClientStatus, Throwable th2) {
        a.b bVar = Sj.a.f20830a;
        bVar.b(th2, "onStatusChanged: " + aWSIotMqttClientStatus, new Object[0]);
        lVar.f57839e = aWSIotMqttClientStatus;
        if (tVar.isDisposed()) {
            bVar.a("MQTT disconnected, but nobody cares anymore!", new Object[0]);
        } else {
            tVar.h(aWSIotMqttClientStatus);
        }
        MqttException mqttException = th2 instanceof MqttException ? (MqttException) th2 : null;
        if (mqttException != null) {
            tVar.c(mqttException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(l lVar) {
        Sj.a.f20830a.o("Disconnecting MQTT", new Object[0]);
        lVar.q();
    }

    private final void q() {
        Gg.a.d().e(new Runnable() { // from class: pb.f
            @Override // java.lang.Runnable
            public final void run() {
                l.r(this.f57825a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(l lVar) {
        try {
            lVar.s().D();
        } catch (AmazonClientException e10) {
            Throwable cause = e10.getCause();
            MqttException mqttException = cause instanceof MqttException ? (MqttException) cause : null;
            if (mqttException != null) {
                int reasonCode = mqttException.getReasonCode();
                MqttException mqttException2 = (reasonCode == 32101 || reasonCode == 32102) ? mqttException : null;
                if (mqttException2 != null) {
                    Sj.a.f20830a.b(mqttException2, "Client already disconnecting!", new Object[0]);
                    return;
                }
            }
            throw e10;
        }
    }

    private final AWSIotMqttManager s() {
        return (AWSIotMqttManager) this.f57840f.getValue();
    }

    private final String t(String str) {
        return "client/" + this.f57835a.getIdentityId() + "/device/" + str + "/connect/" + this.f57837c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AWSIotMqttManager u(l lVar, UnifiCloudAccess unifiCloudAccess) {
        AWSIotMqttManager aWSIotMqttManager = new AWSIotMqttManager(lVar.f57837c, unifiCloudAccess.getIot().getHost());
        aWSIotMqttManager.Y(3);
        aWSIotMqttManager.Z(1, 5);
        return aWSIotMqttManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus messageDeliveryStatus, Object obj) {
        Sj.a.f20830a.a("mqtt delivery status: " + messageDeliveryStatus + ", userData: " + obj, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(final l lVar, String str, String str2, boolean z10, final t emitter) throws IllegalStateException {
        AbstractC6492s.i(emitter, "emitter");
        final String str3 = "client/" + lVar.f57835a.getIdentityId() + MqttTopic.TOPIC_LEVEL_SEPARATOR + str + "/connect/" + lVar.f57837c;
        emitter.d(new InterfaceC6468e() { // from class: pb.i
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                l.A(this.f57830a, str3, emitter);
            }
        });
        c cVar = new c(emitter);
        lVar.f57838d.set(1);
        final m mVar = new m(new m.a() { // from class: pb.j
            @Override // pb.m.a
            public final void a(C6923f c6923f) {
                l.B(emitter, c6923f);
            }
        });
        AWSIotMqttManager aWSIotMqttManagerS = lVar.s();
        AWSIotMqttQos aWSIotMqttQos = AWSIotMqttQos.QOS0;
        aWSIotMqttManagerS.b0(str3, aWSIotMqttQos, cVar, new AWSIotMqttNewMessageCallback() { // from class: pb.k
            @Override // com.amazonaws.mobileconnectors.iot.AWSIotMqttNewMessageCallback
            public final void a(String str4, byte[] bArr) {
                l.y(mVar, str4, bArr);
            }
        });
        AWSIotMqttMessageDeliveryCallback aWSIotMqttMessageDeliveryCallback = new AWSIotMqttMessageDeliveryCallback() { // from class: pb.b
            @Override // com.amazonaws.mobileconnectors.iot.AWSIotMqttMessageDeliveryCallback
            public final void a(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus messageDeliveryStatus, Object obj) {
                l.z(emitter, messageDeliveryStatus, obj);
            }
        };
        TurnCredentials turnCredentials = lVar.f57835a.getTurnCredentials();
        nb.h hVar = new nb.h(str2, AbstractC3689v.e(new C6921d(turnCredentials.getTurnUris(), turnCredentials.getUsername(), turnCredentials.getPassword())), "ucore-android", lVar.f57836b.b(), lVar.f57836b.c(), z10, (String) null, 64, (DefaultConstructorMarker) null);
        AWSIotMqttManager aWSIotMqttManagerS2 = lVar.s();
        AbstractC3868b abstractC3868bD = C8156c.f62925a.d();
        abstractC3868bD.a();
        aWSIotMqttManagerS2.P(abstractC3868bD.c(nb.h.INSTANCE.serializer(), hVar), lVar.t(str), aWSIotMqttQos, aWSIotMqttMessageDeliveryCallback, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(m mVar, String str, byte[] bArr) {
        a.b bVar = Sj.a.f20830a;
        AbstractC6492s.f(bArr);
        bVar.a("onMessageArrived topic: " + str + " data: " + new String(bArr, C6510d.f52215b), new Object[0]);
        AbstractC6492s.f(str);
        mVar.d(str, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(t tVar, AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus messageDeliveryStatus, Object obj) {
        Sj.a.f20830a.a("mqtt delivery status: " + messageDeliveryStatus + ", userData: " + obj, new Object[0]);
        if (messageDeliveryStatus == AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail) {
            tVar.c(new Exception("Could not send Mqtt request"));
        }
    }

    public final s C(final String deviceId, final String offer, final boolean z10) {
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(offer, "offer");
        if (this.f57839e == AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected) {
            s sVarO = s.o(new u() { // from class: pb.h
                @Override // gg.u
                public final void a(t tVar) throws IllegalStateException {
                    l.x(this.f57826a, deviceId, offer, z10, tVar);
                }
            });
            AbstractC6492s.f(sVarO);
            return sVarO;
        }
        s sVarL = s.L(new Exception("MQTT Not connected " + this.f57839e));
        AbstractC6492s.f(sVarL);
        return sVarL;
    }

    public final s l() {
        s sVarI0 = this.f57841g.N(a.f57843a).i0(new b());
        AbstractC6492s.h(sVarI0, "map(...)");
        return sVarI0;
    }

    public final void p() {
        q();
    }

    public final void w(String deviceId, IceCandidate candidate) {
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(candidate, "candidate");
        if (this.f57839e != AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected) {
            Sj.a.f20830a.a("MQTT disconnected!", new Object[0]);
            return;
        }
        AWSIotMqttMessageDeliveryCallback aWSIotMqttMessageDeliveryCallback = new AWSIotMqttMessageDeliveryCallback() { // from class: pb.g
            @Override // com.amazonaws.mobileconnectors.iot.AWSIotMqttMessageDeliveryCallback
            public final void a(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus messageDeliveryStatus, Object obj) {
                l.v(messageDeliveryStatus, obj);
            }
        };
        AWSIotMqttManager aWSIotMqttManagerS = s();
        C8156c c8156c = C8156c.f62925a;
        String sdp = candidate.sdp;
        AbstractC6492s.h(sdp, "sdp");
        C6919b c6919b = new C6919b(sdp, candidate.sdpMid, Integer.valueOf(candidate.sdpMLineIndex), "ucore-android", this.f57836b.b(), this.f57836b.c(), (String) null, 64, (DefaultConstructorMarker) null);
        AbstractC3868b abstractC3868bD = c8156c.d();
        abstractC3868bD.a();
        aWSIotMqttManagerS.P(abstractC3868bD.c(C6919b.INSTANCE.serializer(), c6919b), t(deviceId), AWSIotMqttQos.QOS0, aWSIotMqttMessageDeliveryCallback, null);
    }
}
