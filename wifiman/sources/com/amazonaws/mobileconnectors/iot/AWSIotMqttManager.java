package com.amazonaws.mobileconnectors.iot;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.amazonaws.AmazonClientException;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttClientStatusCallback;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttMessageDeliveryCallback;
import com.amazonaws.regions.Region;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.VersionInfoUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.SocketFactory;
import oj.C7142a;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes.dex */
public class AWSIotMqttManager {

    /* renamed from: L, reason: collision with root package name */
    private static final Integer f34072L = 16;

    /* renamed from: M, reason: collision with root package name */
    private static final Integer f34073M = 1000;

    /* renamed from: N, reason: collision with root package name */
    private static final Log f34074N = LogFactory.b(AWSIotMqttManager.class);

    /* renamed from: O, reason: collision with root package name */
    public static final Integer f34075O = 4;

    /* renamed from: P, reason: collision with root package name */
    public static final Integer f34076P = 64;

    /* renamed from: Q, reason: collision with root package name */
    public static final Boolean f34077Q;

    /* renamed from: R, reason: collision with root package name */
    public static final Integer f34078R;

    /* renamed from: S, reason: collision with root package name */
    public static final Integer f34079S;

    /* renamed from: T, reason: collision with root package name */
    public static final Boolean f34080T;

    /* renamed from: U, reason: collision with root package name */
    public static final Integer f34081U;

    /* renamed from: V, reason: collision with root package name */
    private static final Long f34082V;

    /* renamed from: W, reason: collision with root package name */
    private static final Integer f34083W;

    /* renamed from: B, reason: collision with root package name */
    private final String f34085B;

    /* renamed from: C, reason: collision with root package name */
    private Properties f34086C;

    /* renamed from: D, reason: collision with root package name */
    private String f34087D;

    /* renamed from: E, reason: collision with root package name */
    private String f34088E;

    /* renamed from: F, reason: collision with root package name */
    private SocketFactory f34089F;

    /* renamed from: G, reason: collision with root package name */
    private AWSCredentialsProvider f34090G;

    /* renamed from: H, reason: collision with root package name */
    private Integer f34091H;

    /* renamed from: I, reason: collision with root package name */
    private Long f34092I;

    /* renamed from: J, reason: collision with root package name */
    private MqttManagerConnectionState f34093J;

    /* renamed from: K, reason: collision with root package name */
    private Long f34094K;

    /* renamed from: a, reason: collision with root package name */
    private MqttAsyncClient f34095a;

    /* renamed from: b, reason: collision with root package name */
    private AWSIotWebSocketUrlSigner f34096b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34097c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34098d;

    /* renamed from: e, reason: collision with root package name */
    private final Region f34099e;

    /* renamed from: f, reason: collision with root package name */
    private AuthenticationMode f34100f;

    /* renamed from: g, reason: collision with root package name */
    private AWSIotMqttClientStatusCallback f34101g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f34102h;

    /* renamed from: i, reason: collision with root package name */
    private final ConcurrentLinkedQueue f34103i;

    /* renamed from: j, reason: collision with root package name */
    private int f34104j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f34105k;

    /* renamed from: l, reason: collision with root package name */
    private int f34106l;

    /* renamed from: m, reason: collision with root package name */
    private int f34107m;

    /* renamed from: n, reason: collision with root package name */
    private int f34108n;

    /* renamed from: o, reason: collision with root package name */
    private int f34109o;

    /* renamed from: p, reason: collision with root package name */
    private int f34110p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f34111q;

    /* renamed from: r, reason: collision with root package name */
    private Integer f34112r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f34113s;

    /* renamed from: t, reason: collision with root package name */
    private long f34114t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f34115u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f34116v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f34117w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f34118x = true;

    /* renamed from: y, reason: collision with root package name */
    private boolean f34119y = true;

    /* renamed from: z, reason: collision with root package name */
    String f34120z = "?SDK=Android&Version=" + VersionInfoUtils.a();

    /* renamed from: A, reason: collision with root package name */
    Map f34084A = new HashMap();

    /* renamed from: com.amazonaws.mobileconnectors.iot.AWSIotMqttManager$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34130a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f34131b;

        static {
            int[] iArr = new int[MqttManagerConnectionState.values().length];
            f34131b = iArr;
            try {
                iArr[MqttManagerConnectionState.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34131b[MqttManagerConnectionState.Connecting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34131b[MqttManagerConnectionState.Reconnecting.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34131b[MqttManagerConnectionState.Disconnected.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[AuthenticationMode.values().length];
            f34130a = iArr2;
            try {
                iArr2[AuthenticationMode.KEYSTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34130a[AuthenticationMode.IAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34130a[AuthenticationMode.CUSTOM_AUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34130a[AuthenticationMode.USERNAME_PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    enum AuthenticationMode {
        KEYSTORE,
        IAM,
        CUSTOM_AUTH,
        USERNAME_PASSWORD
    }

    static {
        Boolean bool = Boolean.TRUE;
        f34077Q = bool;
        f34078R = 10;
        f34079S = 300;
        f34080T = bool;
        f34081U = 100;
        f34082V = 250L;
        f34083W = 10;
    }

    public AWSIotMqttManager(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mqttClientId is null or empty");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("endpoint is null");
        }
        this.f34102h = new ConcurrentHashMap();
        this.f34103i = new ConcurrentLinkedQueue();
        this.f34098d = str;
        this.f34085B = str2;
        this.f34097c = null;
        this.f34099e = F(str2);
        I();
    }

    private String E() {
        String str = this.f34085B;
        if (str != null) {
            return String.format("%s:443", str);
        }
        String str2 = this.f34097c;
        if (str2 != null) {
            return String.format("%s.iot.%s.%s:443", str2, this.f34099e.d(), this.f34099e.a());
        }
        throw new IllegalStateException("No valid endpoint information is available. Please pass in a valid endpoint in AWSIotMqttManager.");
    }

    private static Region F(String str) {
        for (String str2 : str.toLowerCase().split("[\\.:]")) {
            Region regionE = Region.e(str2);
            if (regionE != null) {
                return regionE;
            }
        }
        throw new IllegalArgumentException("Cannot find AWS Region code within endpoint");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Long G() {
        Long l10 = this.f34094K;
        return l10 == null ? Long.valueOf(System.currentTimeMillis()) : l10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(Throwable th2) {
        if (W()) {
            this.f34093J = MqttManagerConnectionState.Reconnecting;
        } else {
            this.f34093J = MqttManagerConnectionState.Disconnected;
        }
        e0(th2);
    }

    private void I() {
        this.f34093J = MqttManagerConnectionState.Disconnected;
        this.f34105k = f34077Q.booleanValue();
        this.f34106l = f34075O.intValue();
        this.f34107m = f34076P.intValue();
        this.f34109o = f34078R.intValue();
        this.f34104j = f34079S.intValue();
        this.f34111q = f34080T.booleanValue();
        this.f34112r = f34081U;
        this.f34114t = f34082V.longValue();
        X();
        this.f34091H = f34083W;
        this.f34094K = null;
        this.f34116v = true;
        this.f34086C = new Properties();
    }

    static boolean K(String str, String str2) {
        String[] strArrSplit = str.split(MqttTopic.TOPIC_LEVEL_SEPARATOR);
        String[] strArrSplit2 = str2.split(MqttTopic.TOPIC_LEVEL_SEPARATOR);
        if (strArrSplit.length > strArrSplit2.length) {
            return false;
        }
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String str3 = strArrSplit[i10];
            String str4 = strArrSplit2[i10];
            if (MqttTopic.MULTI_LEVEL_WILDCARD.equals(str3)) {
                return true;
            }
            if (!MqttTopic.SINGLE_LEVEL_WILDCARD.equals(str3) && !str3.equals(str4)) {
                return false;
            }
        }
        return strArrSplit.length == strArrSplit2.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(MqttConnectOptions mqttConnectOptions) throws IllegalArgumentException {
        Log log = f34074N;
        log.a("ready to do mqtt connect");
        mqttConnectOptions.setCleanSession(this.f34118x);
        mqttConnectOptions.setKeepAliveInterval(this.f34104j);
        if (J() && !AuthenticationMode.USERNAME_PASSWORD.equals(this.f34100f)) {
            mqttConnectOptions.setUserName(this.f34120z);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("metrics collection is ");
        sb2.append(J() ? "enabled" : "disabled");
        sb2.append(", username: ");
        sb2.append(mqttConnectOptions.getUserName());
        log.b(sb2.toString());
        this.f34102h.clear();
        this.f34103i.clear();
        U();
        this.f34115u = false;
        a0();
        try {
            this.f34093J = MqttManagerConnectionState.Connecting;
            d0();
            this.f34095a.connect(mqttConnectOptions, null, new IMqttActionListener() { // from class: com.amazonaws.mobileconnectors.iot.AWSIotMqttManager.2
                @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
                public void onFailure(IMqttToken iMqttToken, Throwable th2) {
                    AWSIotMqttManager.f34074N.c("onFailure: connection failed.", th2);
                    if (AWSIotMqttManager.this.f34115u || !AWSIotMqttManager.this.f34105k) {
                        AWSIotMqttManager.this.f34093J = MqttManagerConnectionState.Disconnected;
                        AWSIotMqttManager.this.f34117w = iMqttToken.getSessionPresent();
                        AWSIotMqttManager.this.e0(th2);
                    } else {
                        AWSIotMqttManager.this.f34093J = MqttManagerConnectionState.Reconnecting;
                        AWSIotMqttManager.this.f34117w = iMqttToken.getSessionPresent();
                        AWSIotMqttManager.this.e0(th2);
                        AWSIotMqttManager.this.W();
                    }
                    AWSIotMqttManager.this.f34117w = iMqttToken.getSessionPresent();
                }

                @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
                public void onSuccess(IMqttToken iMqttToken) throws IllegalStateException {
                    AWSIotMqttManager.f34074N.b("onSuccess: mqtt connection is successful.");
                    AWSIotMqttManager.this.f34093J = MqttManagerConnectionState.Connected;
                    AWSIotMqttManager aWSIotMqttManager = AWSIotMqttManager.this;
                    aWSIotMqttManager.f34092I = aWSIotMqttManager.G();
                    AWSIotMqttManager.this.f34117w = iMqttToken.getSessionPresent();
                    if (AWSIotMqttManager.this.f34103i.size() > 0) {
                        AWSIotMqttManager.this.O();
                    }
                    AWSIotMqttManager.this.d0();
                }
            });
        } catch (MqttException e10) {
            int reasonCode = e10.getReasonCode();
            if (reasonCode == 32100) {
                this.f34093J = MqttManagerConnectionState.Connected;
                d0();
            } else if (reasonCode != 32110) {
                this.f34093J = MqttManagerConnectionState.Disconnected;
                e0(e10);
            } else {
                this.f34093J = MqttManagerConnectionState.Connecting;
                d0();
            }
        } catch (Exception e11) {
            this.f34093J = MqttManagerConnectionState.Disconnected;
            e0(e11);
        }
    }

    private void S(MqttConnectOptions mqttConnectOptions) throws UnsupportedEncodingException {
        this.f34096b = new AWSIotWebSocketUrlSigner("iotdata");
        try {
            String strC = this.f34096b.c(E(), this.f34090G.a(), System.currentTimeMillis(), this.f34099e);
            f34074N.a("Reconnect to mqtt broker: " + this.f34085B + " mqttWebSocketURL: " + strC);
            mqttConnectOptions.setServerURIs(new String[]{strC});
        } catch (AmazonClientException e10) {
            f34074N.d("Failed to get credentials. AmazonClientException: ", e10);
            H(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean W() {
        Log log = f34074N;
        log.b("schedule Reconnect attempt " + this.f34110p + " of " + this.f34109o + " in " + this.f34108n + " seconds.");
        int i10 = this.f34109o;
        if (i10 != -1 && this.f34110p >= i10) {
            log.e("schedule reconnect returns false");
            return false;
        }
        final HandlerThread handlerThread = new HandlerThread("Reconnect thread");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).postDelayed(new Runnable() { // from class: com.amazonaws.mobileconnectors.iot.AWSIotMqttManager.4
            @Override // java.lang.Runnable
            public void run() throws IllegalArgumentException, UnsupportedEncodingException {
                AWSIotMqttManager.f34074N.a("TID: " + handlerThread.getThreadId() + " trying to reconnect to session");
                if (AWSIotMqttManager.this.f34095a != null && !AWSIotMqttManager.this.f34095a.isConnected()) {
                    AWSIotMqttManager.this.R();
                }
                handlerThread.quit();
            }
        }, f34073M.intValue() * this.f34108n);
        this.f34108n = Math.min(this.f34108n * 2, this.f34107m);
        return true;
    }

    static /* synthetic */ AWSIotMqttLastWillAndTestament z(AWSIotMqttManager aWSIotMqttManager) {
        aWSIotMqttManager.getClass();
        return null;
    }

    public void C(AWSCredentialsProvider aWSCredentialsProvider, AWSIotMqttClientStatusCallback aWSIotMqttClientStatusCallback) {
        this.f34090G = aWSCredentialsProvider;
        if (aWSCredentialsProvider == null) {
            throw new IllegalArgumentException("credentials provider cannot be null");
        }
        this.f34101g = aWSIotMqttClientStatusCallback;
        if (MqttManagerConnectionState.Disconnected.equals(this.f34093J)) {
            new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.iot.AWSIotMqttManager.1
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    AWSIotMqttManager.this.f34096b = new AWSIotWebSocketUrlSigner("iotdata");
                    if (AWSIotMqttManager.this.f34085B != null) {
                        str = String.format("%s:443", AWSIotMqttManager.this.f34085B);
                    } else {
                        if (AWSIotMqttManager.this.f34097c == null) {
                            throw new IllegalStateException("No valid endpoint information is available. Please pass in a valid endpoint in AWSIotMqttManager.");
                        }
                        str = String.format("%s.iot.%s.%s:443", AWSIotMqttManager.this.f34097c, AWSIotMqttManager.this.f34099e.d(), AWSIotMqttManager.this.f34099e.a());
                    }
                    AWSIotMqttManager.this.f34100f = AuthenticationMode.IAM;
                    AWSIotMqttManager.f34074N.a("MQTT broker: " + str);
                    try {
                        String strC = AWSIotMqttManager.this.f34096b.c(str, AWSIotMqttManager.this.f34090G.a(), System.currentTimeMillis() - (SDKGlobalConfiguration.a() * AWSIotMqttManager.f34073M.intValue()), AWSIotMqttManager.this.f34099e);
                        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
                        mqttConnectOptions.setServerURIs(new String[]{strC});
                        AWSIotMqttManager.z(AWSIotMqttManager.this);
                        if (AWSIotMqttManager.this.f34095a == null) {
                            AWSIotMqttManager.this.f34095a = new MqttAsyncClient("wss://" + str, AWSIotMqttManager.this.f34098d, new C7142a());
                        }
                        AWSIotMqttManager.this.L(mqttConnectOptions);
                    } catch (MqttException e10) {
                        AWSIotMqttManager.this.f34093J = MqttManagerConnectionState.Disconnected;
                        AWSIotMqttManager.this.e0(new AmazonClientException("An error occurred in the MQTT client.", e10));
                    } catch (Exception e11) {
                        AWSIotMqttManager.this.f34093J = MqttManagerConnectionState.Disconnected;
                        AWSIotMqttManager.this.e0(e11);
                    }
                }
            }, "Mqtt Connect Thread").start();
        } else {
            d0();
        }
    }

    public boolean D() {
        this.f34115u = true;
        T();
        this.f34102h.clear();
        this.f34093J = MqttManagerConnectionState.Disconnected;
        d0();
        return true;
    }

    public boolean J() {
        return this.f34119y;
    }

    void M(AWSIotMqttMessageDeliveryCallback aWSIotMqttMessageDeliveryCallback, AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus messageDeliveryStatus, Object obj, RuntimeException runtimeException) {
        if (aWSIotMqttMessageDeliveryCallback != null) {
            aWSIotMqttMessageDeliveryCallback.a(messageDeliveryStatus, obj);
        } else if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public void N(byte[] bArr, String str, AWSIotMqttQos aWSIotMqttQos, AWSIotMqttMessageDeliveryCallback aWSIotMqttMessageDeliveryCallback, Object obj) throws IllegalStateException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("topic is null or empty");
        }
        if (bArr == null) {
            throw new IllegalArgumentException("data is null");
        }
        if (aWSIotMqttQos == null) {
            throw new IllegalArgumentException("QoS cannot be null");
        }
        PublishMessageUserData publishMessageUserData = new PublishMessageUserData(aWSIotMqttMessageDeliveryCallback, obj);
        MqttManagerConnectionState mqttManagerConnectionState = this.f34093J;
        if (mqttManagerConnectionState == MqttManagerConnectionState.Connected) {
            if (!this.f34103i.isEmpty()) {
                Q(bArr, str, aWSIotMqttQos, publishMessageUserData);
                return;
            }
            try {
                this.f34095a.publish(str, bArr, aWSIotMqttQos.asInt(), false, publishMessageUserData, null);
                return;
            } catch (MqttException e10) {
                M(aWSIotMqttMessageDeliveryCallback, AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail, obj, new AmazonClientException("Client error while publishing.", e10));
                return;
            }
        }
        if (mqttManagerConnectionState != MqttManagerConnectionState.Reconnecting) {
            M(aWSIotMqttMessageDeliveryCallback, AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail, obj, new AmazonClientException("Client is disconnected or not yet connected."));
        } else if (this.f34111q) {
            Q(bArr, str, aWSIotMqttQos, publishMessageUserData);
        } else {
            M(aWSIotMqttMessageDeliveryCallback, AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail, obj, new AmazonClientException("Client error while publishing : Offline publish queue is not enabled and client is not connected"));
        }
    }

    void O() throws IllegalStateException {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        if (this.f34093J != MqttManagerConnectionState.Connected || (concurrentLinkedQueue = this.f34103i) == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        AWSIotMqttQueueMessage aWSIotMqttQueueMessage = (AWSIotMqttQueueMessage) this.f34103i.poll();
        if (aWSIotMqttQueueMessage != null) {
            try {
                if (aWSIotMqttQueueMessage.d() == null || aWSIotMqttQueueMessage.d().a() == null) {
                    this.f34095a.publish(aWSIotMqttQueueMessage.c(), aWSIotMqttQueueMessage.a(), aWSIotMqttQueueMessage.b().asInt(), false);
                } else {
                    this.f34095a.publish(aWSIotMqttQueueMessage.c(), aWSIotMqttQueueMessage.a(), aWSIotMqttQueueMessage.b().asInt(), false, aWSIotMqttQueueMessage.d(), null);
                }
            } catch (MqttException e10) {
                M(aWSIotMqttQueueMessage.d().a(), AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail, aWSIotMqttQueueMessage.d().b(), new AmazonClientException("Client error while publishing.", e10));
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.amazonaws.mobileconnectors.iot.AWSIotMqttManager.6
            @Override // java.lang.Runnable
            public void run() throws IllegalStateException {
                if (AWSIotMqttManager.this.f34103i.isEmpty() || AWSIotMqttManager.this.f34093J != MqttManagerConnectionState.Connected) {
                    return;
                }
                AWSIotMqttManager.this.O();
            }
        }, this.f34114t);
    }

    public void P(String str, String str2, AWSIotMqttQos aWSIotMqttQos, AWSIotMqttMessageDeliveryCallback aWSIotMqttMessageDeliveryCallback, Object obj) throws IllegalStateException {
        if (str == null) {
            throw new IllegalArgumentException("publish string is null");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("topic is null or empty");
        }
        if (aWSIotMqttQos == null) {
            throw new IllegalArgumentException("QoS cannot be null");
        }
        N(str.getBytes(StringUtils.f34152a), str2, aWSIotMqttQos, aWSIotMqttMessageDeliveryCallback, obj);
    }

    void Q(byte[] bArr, String str, AWSIotMqttQos aWSIotMqttQos, PublishMessageUserData publishMessageUserData) {
        AWSIotMqttQueueMessage aWSIotMqttQueueMessage = new AWSIotMqttQueueMessage(str, bArr, aWSIotMqttQos, publishMessageUserData);
        if (this.f34103i.size() >= this.f34112r.intValue()) {
            if (this.f34113s) {
                M(publishMessageUserData.a(), AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail, publishMessageUserData.b(), new AmazonClientException("Failed to publish the message. Queue is full and set to hold onto the oldest messages."));
                return;
            }
            this.f34103i.remove(0);
        }
        this.f34103i.add(aWSIotMqttQueueMessage);
    }

    void R() throws IllegalArgumentException, UnsupportedEncodingException {
        if (this.f34095a == null || MqttManagerConnectionState.Disconnected.equals(this.f34093J)) {
            return;
        }
        Log log = f34074N;
        log.b("attempting to reconnect to mqtt broker");
        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
        mqttConnectOptions.setCleanSession(this.f34118x);
        mqttConnectOptions.setKeepAliveInterval(this.f34104j);
        int i10 = AnonymousClass8.f34130a[this.f34100f.ordinal()];
        if (i10 == 1) {
            mqttConnectOptions.setSocketFactory(this.f34089F);
        } else if (i10 == 2) {
            S(mqttConnectOptions);
        } else if (i10 != 3) {
            if (i10 == 4) {
                mqttConnectOptions.setUserName(this.f34087D);
                mqttConnectOptions.setPassword(this.f34088E.toCharArray());
                mqttConnectOptions.setCustomWebSocketHeaders(this.f34086C);
            }
            H(new IllegalStateException("Unexpected value: " + this.f34100f));
        } else {
            mqttConnectOptions.setCustomWebSocketHeaders(this.f34086C);
        }
        a0();
        try {
            this.f34110p++;
            log.a("mqtt reconnecting attempt " + this.f34110p);
            this.f34095a.connect(mqttConnectOptions, null, new IMqttActionListener() { // from class: com.amazonaws.mobileconnectors.iot.AWSIotMqttManager.3
                @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
                public void onFailure(IMqttToken iMqttToken, Throwable th2) {
                    AWSIotMqttManager.f34074N.c("Reconnect failed ", th2);
                    AWSIotMqttManager.this.f34117w = iMqttToken.getSessionPresent();
                    AWSIotMqttManager.this.H(th2);
                }

                @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
                public void onSuccess(IMqttToken iMqttToken) throws IllegalStateException {
                    AWSIotMqttManager.f34074N.b("Reconnect successful");
                    AWSIotMqttManager.this.f34093J = MqttManagerConnectionState.Connected;
                    AWSIotMqttManager.this.f34117w = iMqttToken.getSessionPresent();
                    AWSIotMqttManager aWSIotMqttManager = AWSIotMqttManager.this;
                    aWSIotMqttManager.f34092I = aWSIotMqttManager.G();
                    if (AWSIotMqttManager.this.f34116v) {
                        AWSIotMqttManager.this.V();
                    }
                    if (AWSIotMqttManager.this.f34103i.size() > 0) {
                        AWSIotMqttManager.this.O();
                    }
                    AWSIotMqttManager.this.d0();
                }
            });
        } catch (MqttException e10) {
            f34074N.d("Exception during reconnect, exception: ", e10);
            H(e10);
        }
    }

    void T() {
        MqttAsyncClient mqttAsyncClient = this.f34095a;
        if (mqttAsyncClient == null || !mqttAsyncClient.isConnected()) {
            return;
        }
        try {
            this.f34095a.disconnect(0L);
        } catch (MqttException e10) {
            throw new AmazonClientException("Client error when disconnecting.", e10);
        }
    }

    public void U() {
        f34074N.b("resetting reconnect attempt and retry time");
        this.f34110p = 0;
        this.f34108n = this.f34106l;
    }

    void V() {
        f34074N.b("Auto-resubscribe is enabled. Resubscribing to previous topics.");
        for (AWSIotMqttTopic aWSIotMqttTopic : this.f34102h.values()) {
            MqttAsyncClient mqttAsyncClient = this.f34095a;
            if (mqttAsyncClient != null) {
                try {
                    mqttAsyncClient.subscribe(aWSIotMqttTopic.c(), aWSIotMqttTopic.b().asInt());
                } catch (MqttException e10) {
                    f34074N.d("Error while resubscribing to previously subscribed toipcs.", e10);
                }
            }
        }
    }

    public void X() {
        this.f34113s = false;
    }

    public void Y(int i10) {
        if (i10 <= 0 && i10 != -1) {
            throw new IllegalArgumentException("Max reconnection attempts must be postive or -1");
        }
        this.f34109o = i10;
    }

    public void Z(int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Minimum reconnect time needs to be less than Maximum.");
        }
        this.f34106l = i10;
        this.f34107m = i11;
    }

    void a0() {
        f34074N.a("Setting up Callback for MqttClient");
        this.f34095a.setCallback(new MqttCallback() { // from class: com.amazonaws.mobileconnectors.iot.AWSIotMqttManager.7
            @Override // org.eclipse.paho.client.mqttv3.MqttCallback
            public void connectionLost(Throwable th2) {
                AWSIotMqttManager.f34074N.e("connection is Lost");
                if (AWSIotMqttManager.this.f34115u || !AWSIotMqttManager.this.f34105k) {
                    AWSIotMqttManager.this.f34093J = MqttManagerConnectionState.Disconnected;
                    AWSIotMqttManager.this.e0(th2);
                } else {
                    if (AWSIotMqttManager.this.f34092I.longValue() + (AWSIotMqttManager.this.f34091H.intValue() * AWSIotMqttManager.f34073M.intValue()) < AWSIotMqttManager.this.G().longValue()) {
                        AWSIotMqttManager.this.U();
                    }
                    AWSIotMqttManager.this.H(th2);
                }
            }

            @Override // org.eclipse.paho.client.mqttv3.MqttCallback
            public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
                AWSIotMqttManager.f34074N.b("delivery is complete");
                if (iMqttDeliveryToken != null) {
                    Object userContext = iMqttDeliveryToken.getUserContext();
                    if (userContext instanceof PublishMessageUserData) {
                        PublishMessageUserData publishMessageUserData = (PublishMessageUserData) userContext;
                        AWSIotMqttManager.this.M(publishMessageUserData.a(), AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Success, publishMessageUserData.b(), null);
                    }
                }
            }

            @Override // org.eclipse.paho.client.mqttv3.MqttCallback
            public void messageArrived(String str, MqttMessage mqttMessage) {
                AWSIotMqttTopic aWSIotMqttTopic;
                AWSIotMqttManager.f34074N.b("message arrived on topic: " + str);
                byte[] payload = mqttMessage.getPayload();
                for (String str2 : AWSIotMqttManager.this.f34102h.keySet()) {
                    if (AWSIotMqttManager.K(str2, str) && (aWSIotMqttTopic = (AWSIotMqttTopic) AWSIotMqttManager.this.f34102h.get(str2)) != null && aWSIotMqttTopic.a() != null) {
                        aWSIotMqttTopic.a().a(str, payload);
                    }
                }
            }
        });
    }

    public void b0(String str, AWSIotMqttQos aWSIotMqttQos, final AWSIotMqttSubscriptionStatusCallback aWSIotMqttSubscriptionStatusCallback, AWSIotMqttNewMessageCallback aWSIotMqttNewMessageCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("topic is null or empty");
        }
        if (aWSIotMqttQos == null) {
            throw new IllegalArgumentException("QoS cannot be null.");
        }
        MqttAsyncClient mqttAsyncClient = this.f34095a;
        if (mqttAsyncClient != null) {
            try {
                if (aWSIotMqttSubscriptionStatusCallback != null) {
                    mqttAsyncClient.subscribe(str, aWSIotMqttQos.asInt(), (Object) null, new IMqttActionListener() { // from class: com.amazonaws.mobileconnectors.iot.AWSIotMqttManager.5
                        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
                        public void onFailure(IMqttToken iMqttToken, Throwable th2) {
                            AWSIotMqttManager.this.f34117w = iMqttToken.getSessionPresent();
                            aWSIotMqttSubscriptionStatusCallback.a(th2);
                        }

                        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
                        public void onSuccess(IMqttToken iMqttToken) {
                            AWSIotMqttManager.this.f34117w = iMqttToken.getSessionPresent();
                            aWSIotMqttSubscriptionStatusCallback.b();
                        }
                    });
                } else {
                    mqttAsyncClient.subscribe(str, aWSIotMqttQos.asInt());
                }
            } catch (MqttException e10) {
                if (aWSIotMqttSubscriptionStatusCallback == null) {
                    throw new AmazonClientException("Client error when subscribing.", e10);
                }
                aWSIotMqttSubscriptionStatusCallback.a(e10);
            }
            this.f34102h.put(str, new AWSIotMqttTopic(str, aWSIotMqttQos, aWSIotMqttNewMessageCallback));
        }
    }

    public void c0(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("topic is null or empty");
        }
        MqttAsyncClient mqttAsyncClient = this.f34095a;
        if (mqttAsyncClient != null) {
            try {
                mqttAsyncClient.unsubscribe(str);
                this.f34102h.remove(str);
            } catch (MqttException e10) {
                throw new AmazonClientException("Client error while unsubscribing.", e10);
            }
        }
    }

    void d0() {
        e0(null);
    }

    void e0(Throwable th2) {
        if (this.f34101g != null) {
            int i10 = AnonymousClass8.f34131b[this.f34093J.ordinal()];
            if (i10 == 1) {
                this.f34101g.a(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, th2);
                return;
            }
            if (i10 == 2) {
                this.f34101g.a(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, th2);
            } else if (i10 == 3) {
                this.f34101g.a(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Reconnecting, th2);
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("Unknown connection state.");
                }
                this.f34101g.a(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.ConnectionLost, th2);
            }
        }
    }
}
