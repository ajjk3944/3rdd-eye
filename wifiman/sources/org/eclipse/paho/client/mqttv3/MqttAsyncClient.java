package org.eclipse.paho.client.mqttv3;

import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import kj.C6473a;
import kj.g;
import kj.h;
import kj.i;
import kj.k;
import kj.p;
import kj.q;
import kj.u;
import nj.C6999e;
import nj.o;
import nj.r;
import nj.t;
import oj.C7142a;
import oj.C7143b;
import org.eclipse.paho.client.mqttv3.logging.a;
import org.eclipse.paho.client.mqttv3.logging.b;
import qj.C7512a;

/* loaded from: classes3.dex */
public class MqttAsyncClient implements IMqttAsyncClient {
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.MqttAsyncClient";
    private static final String CLIENT_ID_PREFIX = "paho";
    private static final long DISCONNECT_TIMEOUT = 10000;
    private static final char MAX_HIGH_SURROGATE = 56319;
    private static final char MIN_HIGH_SURROGATE = 55296;
    private static final long QUIESCE_TIMEOUT = 30000;
    private static final Object clientLock = new Object();
    private static int reconnectDelay = 1000;
    private String clientId;
    protected C6473a comms;
    private MqttConnectOptions connOpts;
    private ScheduledExecutorService executorService;
    private a log;
    private MqttCallback mqttCallback;
    private MqttClientPersistence persistence;
    private Timer reconnectTimer;
    private boolean reconnecting;
    private String serverURI;
    private Hashtable topics;
    private Object userContext;

    class MqttReconnectActionListener implements IMqttActionListener {
        final String methodName;

        MqttReconnectActionListener(String str) {
            this.methodName = str;
        }

        private void rescheduleReconnectCycle(int i10) {
            MqttAsyncClient.this.log.fine(MqttAsyncClient.CLASS_NAME, String.valueOf(this.methodName) + ":rescheduleReconnectCycle", "505", new Object[]{MqttAsyncClient.this.clientId, String.valueOf(MqttAsyncClient.reconnectDelay)});
            synchronized (MqttAsyncClient.clientLock) {
                try {
                    if (MqttAsyncClient.this.connOpts.isAutomaticReconnect()) {
                        if (MqttAsyncClient.this.reconnectTimer != null) {
                            MqttAsyncClient.this.reconnectTimer.schedule(new ReconnectTask(MqttAsyncClient.this, null), i10);
                        } else {
                            MqttAsyncClient.reconnectDelay = i10;
                            MqttAsyncClient.this.startReconnectCycle();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th2) {
            MqttAsyncClient.this.log.fine(MqttAsyncClient.CLASS_NAME, this.methodName, "502", new Object[]{iMqttToken.getClient().getClientId()});
            if (MqttAsyncClient.reconnectDelay < MqttAsyncClient.this.connOpts.getMaxReconnectDelay()) {
                MqttAsyncClient.reconnectDelay *= 2;
            }
            rescheduleReconnectCycle(MqttAsyncClient.reconnectDelay);
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
            MqttAsyncClient.this.log.fine(MqttAsyncClient.CLASS_NAME, this.methodName, "501", new Object[]{iMqttToken.getClient().getClientId()});
            MqttAsyncClient.this.comms.a0(false);
            MqttAsyncClient.this.stopReconnectCycle();
        }
    }

    class MqttReconnectCallback implements MqttCallbackExtended {
        final boolean automaticReconnect;

        MqttReconnectCallback(boolean z10) {
            this.automaticReconnect = z10;
        }

        @Override // org.eclipse.paho.client.mqttv3.MqttCallbackExtended
        public void connectComplete(boolean z10, String str) {
        }

        @Override // org.eclipse.paho.client.mqttv3.MqttCallback
        public void connectionLost(Throwable th2) {
            if (this.automaticReconnect) {
                MqttAsyncClient.this.comms.a0(true);
                MqttAsyncClient.this.reconnecting = true;
                MqttAsyncClient.this.startReconnectCycle();
            }
        }

        @Override // org.eclipse.paho.client.mqttv3.MqttCallback
        public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        }

        @Override // org.eclipse.paho.client.mqttv3.MqttCallback
        public void messageArrived(String str, MqttMessage mqttMessage) throws Exception {
        }
    }

    private class ReconnectTask extends TimerTask {
        private static final String methodName = "ReconnectTask.run";

        private ReconnectTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() throws IllegalArgumentException {
            MqttAsyncClient.this.log.fine(MqttAsyncClient.CLASS_NAME, methodName, "506");
            MqttAsyncClient.this.attemptReconnect();
        }

        /* synthetic */ ReconnectTask(MqttAsyncClient mqttAsyncClient, ReconnectTask reconnectTask) {
            this();
        }
    }

    public MqttAsyncClient(String str, String str2) throws MqttException {
        this(str, str2, new C7143b());
    }

    protected static boolean Character_isHighSurrogate(char c10) {
        return c10 >= 55296 && c10 <= 56319;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void attemptReconnect() throws IllegalArgumentException {
        this.log.fine(CLASS_NAME, "attemptReconnect", "500", new Object[]{this.clientId});
        try {
            connect(this.connOpts, this.userContext, new MqttReconnectActionListener("attemptReconnect"));
        } catch (MqttSecurityException e10) {
            this.log.fine(CLASS_NAME, "attemptReconnect", "804", null, e10);
        } catch (MqttException e11) {
            this.log.fine(CLASS_NAME, "attemptReconnect", "804", null, e11);
        }
    }

    private p createNetworkModule(String str, MqttConnectOptions mqttConnectOptions) throws MqttException {
        this.log.fine(CLASS_NAME, "createNetworkModule", "115", new Object[]{str});
        return q.b(str, mqttConnectOptions, this.clientId);
    }

    public static String generateClientId() {
        return CLIENT_ID_PREFIX + System.nanoTime();
    }

    private String getHostName(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf(47);
        }
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startReconnectCycle() {
        this.log.fine(CLASS_NAME, "startReconnectCycle", "503", new Object[]{this.clientId, Long.valueOf(reconnectDelay)});
        Timer timer = new Timer("MQTT Reconnect: " + this.clientId);
        this.reconnectTimer = timer;
        timer.schedule(new ReconnectTask(this, null), (long) reconnectDelay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopReconnectCycle() {
        this.log.fine(CLASS_NAME, "stopReconnectCycle", "504", new Object[]{this.clientId});
        synchronized (clientLock) {
            try {
                if (this.connOpts.isAutomaticReconnect()) {
                    Timer timer = this.reconnectTimer;
                    if (timer != null) {
                        timer.cancel();
                        this.reconnectTimer = null;
                    }
                    reconnectDelay = 1000;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private IMqttToken subscribeBase(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
        if (this.log.isLoggable(5)) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append("topic=");
                stringBuffer.append(strArr[i10]);
                stringBuffer.append(" qos=");
                stringBuffer.append(iArr[i10]);
            }
            this.log.fine(CLASS_NAME, "subscribe", "106", new Object[]{stringBuffer.toString(), obj, iMqttActionListener});
        }
        MqttToken mqttToken = new MqttToken(getClientId());
        mqttToken.setActionCallback(iMqttActionListener);
        mqttToken.setUserContext(obj);
        mqttToken.internalTok.A(strArr);
        this.comms.S(new r(strArr, iArr), mqttToken);
        this.log.fine(CLASS_NAME, "subscribe", "109");
        return mqttToken;
    }

    public IMqttToken checkPing(Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
        a aVar = this.log;
        String str = CLASS_NAME;
        aVar.fine(str, "ping", "117");
        MqttToken mqttTokenO = this.comms.o(iMqttActionListener);
        this.log.fine(str, "ping", "118");
        return mqttTokenO;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient, java.lang.AutoCloseable
    public void close() throws MqttException {
        close(false);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect(Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
        return connect(new MqttConnectOptions(), obj, iMqttActionListener);
    }

    protected p[] createNetworkModules(String str, MqttConnectOptions mqttConnectOptions) throws MqttException {
        this.log.fine(CLASS_NAME, "createNetworkModules", "116", new Object[]{str});
        String[] serverURIs = mqttConnectOptions.getServerURIs();
        if (serverURIs == null || serverURIs.length == 0) {
            serverURIs = new String[]{str};
        }
        p[] pVarArr = new p[serverURIs.length];
        for (int i10 = 0; i10 < serverURIs.length; i10++) {
            pVarArr[i10] = createNetworkModule(serverURIs[i10], mqttConnectOptions);
        }
        this.log.fine(CLASS_NAME, "createNetworkModules", "108");
        return pVarArr;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void deleteBufferedMessage(int i10) {
        this.comms.s(i10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect(Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
        return disconnect(QUIESCE_TIMEOUT, obj, iMqttActionListener);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void disconnectForcibly() throws MqttException {
        disconnectForcibly(QUIESCE_TIMEOUT, 10000L);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public MqttMessage getBufferedMessage(int i10) {
        return this.comms.z(i10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public int getBufferedMessageCount() {
        return this.comms.A();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public String getClientId() {
        return this.clientId;
    }

    public String getCurrentServerURI() {
        return this.comms.E()[this.comms.D()].getServerURI();
    }

    public C7512a getDebug() {
        return new C7512a(this.clientId, this.comms);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public int getInFlightMessageCount() {
        return this.comms.y();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken[] getPendingDeliveryTokens() {
        return this.comms.F();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public String getServerURI() {
        return this.serverURI;
    }

    protected MqttTopic getTopic(String str) throws IllegalArgumentException {
        MqttTopic.validate(str, false);
        MqttTopic mqttTopic = (MqttTopic) this.topics.get(str);
        if (mqttTopic != null) {
            return mqttTopic;
        }
        MqttTopic mqttTopic2 = new MqttTopic(str, this.comms);
        this.topics.put(str, mqttTopic2);
        return mqttTopic2;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public boolean isConnected() {
        return this.comms.K();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void messageArrivedComplete(int i10, int i11) throws MqttException {
        this.comms.O(i10, i11);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, byte[] bArr, int i10, boolean z10, Object obj, IMqttActionListener iMqttActionListener) throws IllegalStateException, MqttException {
        MqttMessage mqttMessage = new MqttMessage(bArr);
        mqttMessage.setQos(i10);
        mqttMessage.setRetained(z10);
        return publish(str, mqttMessage, obj, iMqttActionListener);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void reconnect() throws MqttException, IllegalArgumentException {
        this.log.fine(CLASS_NAME, "reconnect", "500", new Object[]{this.clientId});
        if (this.comms.K()) {
            throw i.a(32100);
        }
        if (this.comms.L()) {
            throw new MqttException(32110);
        }
        if (this.comms.N()) {
            throw new MqttException(32102);
        }
        if (this.comms.J()) {
            throw new MqttException(32111);
        }
        stopReconnectCycle();
        attemptReconnect();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public boolean removeMessage(IMqttDeliveryToken iMqttDeliveryToken) throws MqttException {
        return this.comms.Q(iMqttDeliveryToken);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void setBufferOpts(DisconnectedBufferOptions disconnectedBufferOptions) {
        this.comms.U(new h(disconnectedBufferOptions));
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void setCallback(MqttCallback mqttCallback) {
        this.mqttCallback = mqttCallback;
        this.comms.T(mqttCallback);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void setManualAcks(boolean z10) {
        this.comms.V(z10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10, Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
        return subscribe(new String[]{str}, new int[]{i10}, obj, iMqttActionListener);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String str, Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
        return unsubscribe(new String[]{str}, obj, iMqttActionListener);
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence) throws MqttException {
        this(str, str2, mqttClientPersistence, new TimerPingSender());
    }

    public void close(boolean z10) throws MqttException {
        a aVar = this.log;
        String str = CLASS_NAME;
        aVar.fine(str, "close", "113");
        this.comms.p(z10);
        this.log.fine(str, "close", "114");
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect() throws MqttException {
        return connect(null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect() throws MqttException {
        return disconnect(null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void disconnectForcibly(long j10) throws MqttException {
        disconnectForcibly(QUIESCE_TIMEOUT, j10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10) throws MqttException {
        return subscribe(new String[]{str}, new int[]{i10}, (Object) null, (IMqttActionListener) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String str) throws MqttException {
        return unsubscribe(new String[]{str}, (Object) null, (IMqttActionListener) null);
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender) throws MqttException {
        this(str, str2, mqttClientPersistence, mqttPingSender, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect(MqttConnectOptions mqttConnectOptions) throws MqttException {
        return connect(mqttConnectOptions, null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect(long j10) throws MqttException {
        return disconnect(j10, null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void disconnectForcibly(long j10, long j11) throws MqttException {
        this.comms.w(j10, j11);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr) throws MqttException {
        return subscribe(strArr, iArr, (Object) null, (IMqttActionListener) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String[] strArr) throws MqttException {
        return unsubscribe(strArr, (Object) null, (IMqttActionListener) null);
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender, ScheduledExecutorService scheduledExecutorService) throws MqttException {
        this(str, str2, mqttClientPersistence, mqttPingSender, scheduledExecutorService, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect(MqttConnectOptions mqttConnectOptions, Object obj, IMqttActionListener iMqttActionListener) throws MqttException, IllegalArgumentException {
        if (!this.comms.K()) {
            if (!this.comms.L()) {
                if (!this.comms.N()) {
                    if (!this.comms.J()) {
                        MqttConnectOptions mqttConnectOptions2 = mqttConnectOptions == null ? new MqttConnectOptions() : mqttConnectOptions;
                        this.connOpts = mqttConnectOptions2;
                        this.userContext = obj;
                        boolean zIsAutomaticReconnect = mqttConnectOptions2.isAutomaticReconnect();
                        this.log.fine(CLASS_NAME, "connect", "103", new Object[]{Boolean.valueOf(mqttConnectOptions2.isCleanSession()), Integer.valueOf(mqttConnectOptions2.getConnectionTimeout()), Integer.valueOf(mqttConnectOptions2.getKeepAliveInterval()), mqttConnectOptions2.getUserName(), mqttConnectOptions2.getPassword() == null ? "[null]" : "[notnull]", mqttConnectOptions2.getWillMessage() == null ? "[null]" : "[notnull]", obj, iMqttActionListener});
                        this.comms.Y(createNetworkModules(this.serverURI, mqttConnectOptions2));
                        this.comms.Z(new MqttReconnectCallback(zIsAutomaticReconnect));
                        MqttToken mqttToken = new MqttToken(getClientId());
                        g gVar = new g(this, this.persistence, this.comms, mqttConnectOptions2, mqttToken, obj, iMqttActionListener, this.reconnecting);
                        mqttToken.setActionCallback(gVar);
                        mqttToken.setUserContext(this);
                        MqttCallback mqttCallback = this.mqttCallback;
                        if (mqttCallback instanceof MqttCallbackExtended) {
                            gVar.b((MqttCallbackExtended) mqttCallback);
                        }
                        this.comms.X(0);
                        gVar.a();
                        return mqttToken;
                    }
                    throw new MqttException(32111);
                }
                throw new MqttException(32102);
            }
            throw new MqttException(32110);
        }
        throw i.a(32100);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect(long j10, Object obj, IMqttActionListener iMqttActionListener) throws MqttException {
        a aVar = this.log;
        String str = CLASS_NAME;
        aVar.fine(str, "disconnect", "104", new Object[]{Long.valueOf(j10), obj, iMqttActionListener});
        MqttToken mqttToken = new MqttToken(getClientId());
        mqttToken.setActionCallback(iMqttActionListener);
        mqttToken.setUserContext(obj);
        try {
            this.comms.v(new C6999e(), j10, mqttToken);
            this.log.fine(str, "disconnect", "108");
            return mqttToken;
        } catch (MqttException e10) {
            this.log.fine(CLASS_NAME, "disconnect", "105", null, e10);
            throw e10;
        }
    }

    public void disconnectForcibly(long j10, long j11, boolean z10) throws MqttException {
        this.comms.x(j10, j11, z10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener) throws MqttException, IllegalArgumentException {
        if (strArr.length == iArr.length) {
            for (String str : strArr) {
                MqttTopic.validate(str, true);
                this.comms.R(str);
            }
            return subscribeBase(strArr, iArr, obj, iMqttActionListener);
        }
        throw new IllegalArgumentException();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String[] strArr, Object obj, IMqttActionListener iMqttActionListener) throws MqttException, IllegalArgumentException {
        if (this.log.isLoggable(5)) {
            String str = "";
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 > 0) {
                    str = String.valueOf(str) + ", ";
                }
                str = String.valueOf(str) + strArr[i10];
            }
            this.log.fine(CLASS_NAME, "unsubscribe", "107", new Object[]{str, obj, iMqttActionListener});
        }
        for (String str2 : strArr) {
            MqttTopic.validate(str2, true);
        }
        for (String str3 : strArr) {
            this.comms.R(str3);
        }
        MqttToken mqttToken = new MqttToken(getClientId());
        mqttToken.setActionCallback(iMqttActionListener);
        mqttToken.setUserContext(obj);
        mqttToken.internalTok.A(strArr);
        this.comms.S(new t(strArr), mqttToken);
        this.log.fine(CLASS_NAME, "unsubscribe", "110");
        return mqttToken;
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender, ScheduledExecutorService scheduledExecutorService, k kVar) throws MqttException {
        a aVarA = b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", CLASS_NAME);
        this.log = aVarA;
        int i10 = 0;
        this.reconnecting = false;
        aVarA.setResourceName(str2);
        if (str2 != null) {
            int i11 = 0;
            while (i10 < str2.length() - 1) {
                if (Character_isHighSurrogate(str2.charAt(i10))) {
                    i10++;
                }
                i11++;
                i10++;
            }
            if (i11 <= 65535) {
                q.d(str);
                this.serverURI = str;
                this.clientId = str2;
                this.persistence = mqttClientPersistence;
                if (mqttClientPersistence == null) {
                    this.persistence = new C7142a();
                }
                k uVar = kVar == null ? new u() : kVar;
                this.executorService = scheduledExecutorService;
                this.log.fine(CLASS_NAME, "MqttAsyncClient", "101", new Object[]{str2, str, mqttClientPersistence});
                this.persistence.open(str2, str);
                this.comms = new C6473a(this, this.persistence, mqttPingSender, this.executorService, uVar);
                this.persistence.close();
                this.topics = new Hashtable();
                return;
            }
            throw new IllegalArgumentException("ClientId longer than 65535 characters");
        }
        throw new IllegalArgumentException("Null clientId");
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, byte[] bArr, int i10, boolean z10) throws MqttException {
        return publish(str, bArr, i10, z10, null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, MqttMessage mqttMessage) throws MqttException {
        return publish(str, mqttMessage, (Object) null, (IMqttActionListener) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, MqttMessage mqttMessage, Object obj, IMqttActionListener iMqttActionListener) throws MqttException, IllegalArgumentException {
        a aVar = this.log;
        String str2 = CLASS_NAME;
        aVar.fine(str2, "publish", "111", new Object[]{str, obj, iMqttActionListener});
        MqttTopic.validate(str, false);
        MqttDeliveryToken mqttDeliveryToken = new MqttDeliveryToken(getClientId());
        mqttDeliveryToken.setActionCallback(iMqttActionListener);
        mqttDeliveryToken.setUserContext(obj);
        mqttDeliveryToken.setMessage(mqttMessage);
        mqttDeliveryToken.internalTok.A(new String[]{str});
        this.comms.S(new o(str, mqttMessage), mqttDeliveryToken);
        this.log.fine(str2, "publish", "112");
        return mqttDeliveryToken;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener iMqttMessageListener) throws MqttException {
        return subscribe(new String[]{str}, new int[]{i10}, obj, iMqttActionListener, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10, IMqttMessageListener iMqttMessageListener) throws MqttException {
        return subscribe(new String[]{str}, new int[]{i10}, (Object) null, (IMqttActionListener) null, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
        return subscribe(strArr, iArr, (Object) null, (IMqttActionListener) null, iMqttMessageListenerArr);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener[] iMqttMessageListenerArr) throws Exception {
        IMqttMessageListener iMqttMessageListener;
        if ((iMqttMessageListenerArr == null || iMqttMessageListenerArr.length == iArr.length) && iArr.length == strArr.length) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                MqttTopic.validate(strArr[i10], true);
                if (iMqttMessageListenerArr != null && (iMqttMessageListener = iMqttMessageListenerArr[i10]) != null) {
                    this.comms.W(strArr[i10], iMqttMessageListener);
                } else {
                    this.comms.R(strArr[i10]);
                }
            }
            try {
                return subscribeBase(strArr, iArr, obj, iMqttActionListener);
            } catch (Exception e10) {
                for (String str : strArr) {
                    this.comms.R(str);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException();
    }
}
