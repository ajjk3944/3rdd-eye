package tb;

import Sj.a;
import Yg.u;
import android.content.Context;
import android.media.AudioAttributes;
import com.ui.unifi.core.base.net.webrtc.WebRtcClientDisconnectedException;
import eb.AbstractC5445i;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import hg.InterfaceC6043c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import lb.C6569c;
import mh.InterfaceC6835l;
import nb.C6918a;
import nb.C6920c;
import nb.C6923f;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.DataChannel;
import org.webrtc.DefaultVideoDecoderFactory;
import org.webrtc.EglBase;
import org.webrtc.IceCandidate;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpTransceiver;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import org.webrtc.audio.JavaAudioDeviceModule;
import tb.AbstractC8062h;
import tb.C8060f;
import tb.N;

/* loaded from: classes3.dex */
public final class N implements PeerConnection.Observer {

    /* renamed from: B, reason: collision with root package name */
    public static final b f61932B = new b(null);

    /* renamed from: C, reason: collision with root package name */
    private static final a f61933C;

    /* renamed from: D, reason: collision with root package name */
    private static final gg.y f61934D;

    /* renamed from: E, reason: collision with root package name */
    private static PeerConnectionFactory f61935E;

    /* renamed from: F, reason: collision with root package name */
    private static final MediaConstraints f61936F;

    /* renamed from: A, reason: collision with root package name */
    private InterfaceC6043c f61937A;

    /* renamed from: a, reason: collision with root package name */
    private final String f61938a;

    /* renamed from: b, reason: collision with root package name */
    private final pb.l f61939b;

    /* renamed from: c, reason: collision with root package name */
    private final C6569c f61940c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f61941d;

    /* renamed from: e, reason: collision with root package name */
    private PeerConnection f61942e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f61943f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f61944g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f61945h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f61946i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f61947j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC6043c f61948k;

    /* renamed from: l, reason: collision with root package name */
    private final List f61949l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f61950m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6043c f61951n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC6043c f61952o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC6835l f61953p;

    /* renamed from: q, reason: collision with root package name */
    private Map f61954q;

    /* renamed from: r, reason: collision with root package name */
    private final Fg.a f61955r;

    /* renamed from: s, reason: collision with root package name */
    private final Fg.c f61956s;

    /* renamed from: t, reason: collision with root package name */
    private c f61957t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.z f61958u;

    /* renamed from: v, reason: collision with root package name */
    private gg.t f61959v;

    /* renamed from: w, reason: collision with root package name */
    private final gg.s f61960w;

    /* renamed from: x, reason: collision with root package name */
    private final gg.s f61961x;

    /* renamed from: y, reason: collision with root package name */
    private final n f61962y;

    /* renamed from: z, reason: collision with root package name */
    private final p f61963z;

    public static final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f61964a;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            AbstractC6492s.i(runnable, "runnable");
            int i10 = this.f61964a;
            this.f61964a = i10 + 1;
            return new Thread(runnable, "CoreWebRtcThread-" + i10);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, EglBase eglBase) {
            AbstractC6492s.i(context, "context");
            PeerConnectionFactory.Options options = new PeerConnectionFactory.Options();
            options.networkIgnoreMask = 16;
            PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(context).setFieldTrials("WebRTC-H264HighProfile/Enabled/").createInitializationOptions());
            PeerConnectionFactory.Builder audioDeviceModule = PeerConnectionFactory.builder().setOptions(options).setAudioDeviceModule(JavaAudioDeviceModule.builder(context).setAudioAttributes(new AudioAttributes.Builder().setContentType(3).setUsage(1).build()).setInputSampleRate(22050).setUseLowLatency(true).createAudioDeviceModule());
            if (eglBase != null) {
                audioDeviceModule.setVideoDecoderFactory(new DefaultVideoDecoderFactory(eglBase.getEglBaseContext()));
            }
            N.f61935E = audioDeviceModule.createPeerConnectionFactory();
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c NONE = new c("NONE", 0);
        public static final c CREATE_OFFER = new c("CREATE_OFFER", 1);
        public static final c SET_LOCAL_SDP = new c("SET_LOCAL_SDP", 2);
        public static final c SET_LOCAL_SDP_SUCCESS = new c("SET_LOCAL_SDP_SUCCESS", 3);
        public static final c ICE_GATHERING_COMPLETE = new c("ICE_GATHERING_COMPLETE", 4);
        public static final c REQUESTING_SDP_ANSWER = new c("REQUESTING_SDP_ANSWER", 5);
        public static final c SET_REMOTE_SDP = new c("SET_REMOTE_SDP", 6);
        public static final c SET_REMOTE_SDP_SUCCESS = new c("SET_REMOTE_SDP_SUCCESS", 7);
        public static final c CONNECTED = new c("CONNECTED", 8);

        private static final /* synthetic */ c[] $values() {
            return new c[]{NONE, CREATE_OFFER, SET_LOCAL_SDP, SET_LOCAL_SDP_SUCCESS, ICE_GATHERING_COMPLETE, REQUESTING_SDP_ANSWER, SET_REMOTE_SDP, SET_REMOTE_SDP_SUCCESS, CONNECTED};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61965a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f61966b;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.CREATE_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.SET_LOCAL_SDP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.SET_LOCAL_SDP_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.ICE_GATHERING_COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.REQUESTING_SDP_ANSWER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.SET_REMOTE_SDP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.SET_REMOTE_SDP_SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c.CONNECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f61965a = iArr;
            int[] iArr2 = new int[PeerConnection.IceConnectionState.values().length];
            try {
                iArr2[PeerConnection.IceConnectionState.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PeerConnection.IceConnectionState.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f61966b = iArr2;
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final e f61967a = new e();

        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C8060f c8060f) {
            Sj.a.f20830a.a("Signalling data channel opened " + c8060f, new Object[0]);
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f61968a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Sj.a.f20830a.p(it, "Error while getting signaling channel", new Object[0]);
        }
    }

    static final class g implements InterfaceC6469f {
        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(c state) {
            AbstractC6492s.i(state, "state");
            if (state == c.CONNECTED) {
                N.this.W();
            }
        }
    }

    static final class h implements InterfaceC6469f {
        h() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6923f mqttResponse) {
            AbstractC6492s.i(mqttResponse, "mqttResponse");
            a.b bVar = Sj.a.f20830a;
            bVar.a("MqttResponse: " + mqttResponse.getClass().getCanonicalName() + ":" + mqttResponse.getSeq(), new Object[0]);
            if (mqttResponse instanceof C6920c) {
                N.this.c0((C6920c) mqttResponse);
                return;
            }
            if (mqttResponse instanceof C6918a) {
                N.this.C0(new SessionDescription(SessionDescription.Type.ANSWER, ((C6918a) mqttResponse).getAnswer()));
            } else if (mqttResponse instanceof nb.i) {
                bVar.a("Received sdp completed response! " + mqttResponse, new Object[0]);
            }
        }
    }

    static final class i implements InterfaceC6469f {
        i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Sj.a.f20830a.p(it, "sendWebRtcOffer failed", new Object[0]);
            gg.t tVar = N.this.f61959v;
            if (tVar == null) {
                AbstractC6492s.v("stateEmitter");
                tVar = null;
            }
            tVar.c(it);
        }
    }

    static final class j implements kg.n {
        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.v apply(C8060f c8060f) {
            return N.this.f61960w;
        }
    }

    public static final class k implements SdpObserver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8060f f61974b;

        k(C8060f c8060f) {
            this.f61974b = c8060f;
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String str) {
            Sj.a.f20830a.a("Signalling answer create failure " + str, new Object[0]);
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription localDescription) throws JSONException {
            AbstractC6492s.i(localDescription, "localDescription");
            Sj.a.f20830a.a("Signalling answer created", new Object[0]);
            N.this.y0(localDescription);
            N.this.v0(localDescription, this.f61974b);
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
        }
    }

    static final class l implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final l f61975a = new l();

        l() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Sj.a.f20830a.p(it, "Error creating signaling", new Object[0]);
        }
    }

    static final class m implements InterfaceC6469f {
        m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(N n10, DataChannel.State state) {
            AbstractC6492s.i(state, "state");
            if (state == DataChannel.State.OPEN) {
                n10.I(c.CONNECTED);
                n10.f61939b.p();
            }
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(C8060f c8060f) {
            final N n10 = N.this;
            c8060f.g(new C8060f.c() { // from class: tb.O
                @Override // tb.C8060f.c
                public final void a(DataChannel.State state) {
                    N.m.c(n10, state);
                }
            });
        }
    }

    public static final class n implements SdpObserver {
        n() {
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String error) {
            AbstractC6492s.i(error, "error");
            throw new Yg.r("An operation is not implemented: not implemented");
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription sdp) {
            AbstractC6492s.i(sdp, "sdp");
            N.this.A0(sdp);
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String error) {
            AbstractC6492s.i(error, "error");
            throw new Yg.r("An operation is not implemented: not implemented");
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
            N.this.I(c.SET_LOCAL_SDP_SUCCESS);
            N.this.f61944g = true;
            N.this.M();
        }
    }

    public static final class o implements SdpObserver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8060f f61979b;

        o(C8060f c8060f) {
            this.f61979b = c8060f;
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription p02) {
            AbstractC6492s.i(p02, "p0");
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String str) {
            Sj.a.f20830a.o("Remote onSetFailure " + str, new Object[0]);
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
            Sj.a.f20830a.a("Signalling remote description set successfully", new Object[0]);
            N.this.N(this.f61979b);
        }
    }

    public static final class p implements SdpObserver {
        p() {
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String error) {
            AbstractC6492s.i(error, "error");
            Sj.a.f20830a.a("SDP remote onCreateFailure %s", error);
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription sessionDescription) {
            AbstractC6492s.i(sessionDescription, "sessionDescription");
            Sj.a.f20830a.a("SDP remote onCreateSuccess", new Object[0]);
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String error) {
            AbstractC6492s.i(error, "error");
            Sj.a.f20830a.a("SDP remote onSetFailure %s", error);
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
            Sj.a.f20830a.a("SDP remote onSetSuccess", new Object[0]);
            N.this.m0();
        }
    }

    public static final class q implements SdpObserver {
        q() {
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription sessionDescription) {
        }

        @Override // org.webrtc.SdpObserver
        public void onSetFailure(String str) {
            Sj.a.f20830a.o("Signalling local description set failure " + str, new Object[0]);
        }

        @Override // org.webrtc.SdpObserver
        public void onSetSuccess() {
            Sj.a.f20830a.a("Signalling local description set", new Object[0]);
        }
    }

    static {
        a aVar = new a();
        f61933C = aVar;
        gg.y yVarB = Gg.a.b(Executors.newSingleThreadExecutor(aVar));
        AbstractC6492s.h(yVarB, "from(...)");
        f61934D = yVarB;
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "true"));
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "true"));
        f61936F = mediaConstraints;
    }

    public N(List iceServers, String deviceId, pb.l mqttClient, C6569c meta, boolean z10) {
        AbstractC6492s.i(iceServers, "iceServers");
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(mqttClient, "mqttClient");
        AbstractC6492s.i(meta, "meta");
        this.f61938a = deviceId;
        this.f61939b = mqttClient;
        this.f61940c = meta;
        this.f61941d = z10;
        this.f61943f = true;
        InterfaceC6043c interfaceC6043cN = InterfaceC6043c.n();
        AbstractC6492s.h(interfaceC6043cN, "disposed(...)");
        this.f61948k = interfaceC6043cN;
        this.f61949l = new ArrayList();
        this.f61950m = new LinkedHashMap();
        InterfaceC6043c interfaceC6043cN2 = InterfaceC6043c.n();
        AbstractC6492s.h(interfaceC6043cN2, "disposed(...)");
        this.f61951n = interfaceC6043cN2;
        InterfaceC6043c interfaceC6043cN3 = InterfaceC6043c.n();
        AbstractC6492s.h(interfaceC6043cN3, "disposed(...)");
        this.f61952o = interfaceC6043cN3;
        Map mapH = Zg.U.h();
        this.f61954q = mapH;
        Fg.a aVarK2 = Fg.a.k2(mapH);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f61955r = aVarK2;
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f61956s = cVarJ2;
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(iceServers);
        rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
        rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        PeerConnectionFactory peerConnectionFactory = f61935E;
        if (peerConnectionFactory == null) {
            AbstractC6492s.v("peerConnectionFactory");
            peerConnectionFactory = null;
        }
        this.f61942e = peerConnectionFactory.createPeerConnection(rTCConfiguration, this);
        this.f61957t = c.NONE;
        gg.z zVarO = gg.z.x(new Callable() { // from class: tb.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return N.d0(this.f62065a);
            }
        }).o(new m()).O(f61934D);
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        this.f61958u = zVarO;
        gg.s sVarO = gg.s.o(new gg.u() { // from class: tb.E
            @Override // gg.u
            public final void a(gg.t tVar) throws Exception {
                N.K(this.f61920a, tVar);
            }
        });
        AbstractC6492s.h(sVarO, "create(...)");
        this.f61960w = sVarO;
        gg.s sVarV = zVarO.v(new j());
        AbstractC6492s.h(sVarV, "flatMapObservable(...)");
        this.f61961x = sVarV;
        this.f61962y = new n();
        this.f61963z = new p();
        InterfaceC6043c interfaceC6043cN4 = InterfaceC6043c.n();
        AbstractC6492s.h(interfaceC6043cN4, "disposed(...)");
        this.f61937A = interfaceC6043cN4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(SessionDescription sessionDescription) {
        I(c.SET_LOCAL_SDP);
        PeerConnection peerConnection = this.f61942e;
        if (peerConnection != null) {
            peerConnection.setLocalDescription(this.f61962y, sessionDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(SessionDescription sessionDescription) {
        I(c.SET_REMOTE_SDP);
        PeerConnection peerConnection = this.f61942e;
        if (peerConnection != null) {
            peerConnection.setRemoteDescription(this.f61963z, sessionDescription);
        }
    }

    private final void D0(c cVar) {
        this.f61957t = cVar;
        Sj.a.f20830a.a("state: " + cVar, new Object[0]);
    }

    private final void H(IceCandidate iceCandidate) {
        if (!this.f61946i) {
            this.f61949l.add(iceCandidate);
            return;
        }
        PeerConnection peerConnection = this.f61942e;
        if (peerConnection != null) {
            peerConnection.addIceCandidate(iceCandidate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(c cVar) {
        D0(cVar);
        gg.t tVar = this.f61959v;
        if (tVar == null) {
            AbstractC6492s.v("stateEmitter");
            tVar = null;
        }
        tVar.h(cVar);
        switch (d.f61965a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return;
            case 9:
                if (this.f61941d) {
                    this.f61948k.dispose();
                    this.f61948k = R().M(e.f61967a, f.f61968a);
                    return;
                }
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(final N n10, gg.t emitter) throws Exception {
        AbstractC6492s.i(emitter, "emitter");
        n10.f61959v = emitter;
        if (n10.f61942e == null) {
            emitter.c(new Exception("Could not instantiate PeerConnection"));
        } else {
            emitter.d(new InterfaceC6468e() { // from class: tb.x
                @Override // kg.InterfaceC6468e
                public final void cancel() {
                    this.f62069a.Y();
                }
            });
            n10.Q();
        }
    }

    private final void L() {
        if (this.f61947j) {
            return;
        }
        String str = t0().getLocalDescription().description;
        this.f61947j = true;
        I(c.REQUESTING_SDP_ANSWER);
        pb.l lVar = this.f61939b;
        String str2 = this.f61938a;
        AbstractC6492s.f(str);
        this.f61951n = lVar.C(str2, str, this.f61943f).o0(Gg.a.d()).J0(new h(), new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        if (this.f61944g) {
            if (this.f61943f || this.f61945h) {
                L();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(C8060f c8060f) {
        PeerConnection peerConnection = this.f61942e;
        if (peerConnection != null) {
            peerConnection.createAnswer(new k(c8060f), f61936F);
        }
    }

    private final DataChannel O(String str) {
        return t0().createDataChannel(str, new DataChannel.Init());
    }

    private final void Q() throws Exception {
        PeerConnection peerConnectionT0 = t0();
        I(c.CREATE_OFFER);
        peerConnectionT0.createOffer(this.f61962y, P.f61982a);
    }

    private final gg.z R() {
        gg.z zVarM = gg.z.x(new Callable() { // from class: tb.L
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return N.S(this.f61929a);
            }
        }).O(f61934D).m(l.f61975a);
        AbstractC6492s.h(zVarM, "doOnError(...)");
        return zVarM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8060f S(final N n10) throws Exception {
        final C8060f c8060f = (C8060f) n10.f61950m.get("ws:/api/ws/webrtc/signaling");
        if (c8060f == null) {
            c8060f = new C8060f("ws:/api/ws/webrtc/signaling", f61934D);
            n10.f61950m.put("ws:/api/ws/webrtc/signaling", c8060f);
            c8060f.g(new C8060f.c() { // from class: tb.y
                @Override // tb.C8060f.c
                public final void a(DataChannel.State state) {
                    N.T(this.f62070a, state);
                }
            });
            final C8067m c8067m = new C8067m(new InterfaceC6835l() { // from class: tb.z
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return N.U(this.f62071a, c8060f, (String) obj);
                }
            });
            c8060f.B(new C8060f.b() { // from class: tb.A
                @Override // tb.C8060f.b
                public final void b(ByteBuffer byteBuffer) {
                    N.V(c8067m, byteBuffer);
                }
            });
            DataChannel dataChannelO = n10.O("ws:/api/ws/webrtc/signaling");
            if (dataChannelO == null) {
                throw new Exception("Could not create DataChannel with name 'ws:/api/ws/webrtc/signaling'");
            }
            c8060f.y(dataChannelO);
        }
        return c8060f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(N n10, DataChannel.State state) {
        AbstractC6492s.i(state, "state");
        if (state == DataChannel.State.CLOSED || state == DataChannel.State.CLOSING) {
            n10.f61950m.remove("ws:/api/ws/webrtc/signaling");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J U(N n10, C8060f c8060f, String offer) {
        AbstractC6492s.i(offer, "offer");
        n10.p0(offer, c8060f);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(C8067m c8067m, ByteBuffer buffer) {
        AbstractC6492s.i(buffer, "buffer");
        c8067m.a(buffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        PeerConnection peerConnection = this.f61942e;
        if (peerConnection != null) {
            peerConnection.getStats(new RTCStatsCollectorCallback() { // from class: tb.F
                @Override // org.webrtc.RTCStatsCollectorCallback
                public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                    N.X(this.f61921a, rTCStatsReport);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(N n10, RTCStatsReport rTCStatsReport) {
        AbstractC6492s.f(rTCStatsReport);
        Object obj = n10.f0(rTCStatsReport) ? AbstractC5445i.a.b.f46354a : AbstractC5445i.a.C1740a.f46353a;
        InterfaceC6835l interfaceC6835l = n10.f61953p;
        if (interfaceC6835l != null) {
            interfaceC6835l.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        this.f61948k.dispose();
        this.f61951n.dispose();
        final PeerConnection peerConnection = this.f61942e;
        if (peerConnection == null) {
            return;
        }
        this.f61942e = null;
        this.f61952o.dispose();
        this.f61950m.clear();
        f61934D.e(new Runnable() { // from class: tb.B
            @Override // java.lang.Runnable
            public final void run() {
                N.Z(peerConnection);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(PeerConnection peerConnection) {
        peerConnection.dispose();
    }

    private final String b0(RTCStats rTCStats, String str) {
        Object obj = rTCStats.getMembers().get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(C6920c c6920c) {
        String strD = c6920c.getMid();
        if (strD == null) {
            strD = "";
        }
        Integer numE = c6920c.getMlineIndex();
        H(new IceCandidate(strD, numE != null ? numE.intValue() : 0, P.f61983b.n(c6920c.getCandidate(), "")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8060f d0(N n10) {
        return n10.g0("api:0", true);
    }

    private final boolean f0(RTCStatsReport rTCStatsReport) {
        Object next;
        RTCStats rTCStats;
        String strB0;
        RTCStats rTCStats2;
        String strB02;
        RTCStats rTCStats3;
        String strB03;
        RTCStats rTCStats4;
        String strB04;
        String strB05;
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        if (statsMap == null) {
            return false;
        }
        Iterator<T> it = statsMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Object key = ((Map.Entry) next).getKey();
            AbstractC6492s.h(key, "<get-key>(...)");
            if (kotlin.text.t.P((String) key, "RTCTransport", false, 2, null)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (rTCStats = (RTCStats) entry.getValue()) == null || (strB0 = b0(rTCStats, "selectedCandidatePairId")) == null || (rTCStats2 = statsMap.get(strB0)) == null || (strB02 = b0(rTCStats2, "localCandidateId")) == null || (rTCStats3 = statsMap.get(strB02)) == null || (strB03 = b0(rTCStats2, "remoteCandidateId")) == null || (rTCStats4 = statsMap.get(strB03)) == null || (strB04 = b0(rTCStats3, "candidateType")) == null || (strB05 = b0(rTCStats4, "candidateType")) == null) {
            return false;
        }
        return kotlin.text.t.W(strB04, "relay", false, 2, null) || kotlin.text.t.W(strB05, "relay", false, 2, null);
    }

    private final C8060f g0(final String str, boolean z10) {
        gg.y yVar = f61934D;
        final C8060f c8060f = new C8060f(str, yVar);
        this.f61950m.put(str, c8060f);
        c8060f.g(new C8060f.c() { // from class: tb.M
            @Override // tb.C8060f.c
            public final void a(DataChannel.State state) {
                N.i0(this.f61930a, str, state);
            }
        });
        if (z10) {
            q0(c8060f, str);
        } else {
            yVar.e(new Runnable() { // from class: tb.w
                @Override // java.lang.Runnable
                public final void run() {
                    N.j0(this.f62066a, c8060f, str);
                }
            });
        }
        return c8060f;
    }

    static /* synthetic */ C8060f h0(N n10, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return n10.g0(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(N n10, String str, DataChannel.State state) {
        AbstractC6492s.i(state, "state");
        if (state == DataChannel.State.CLOSED || state == DataChannel.State.CLOSING) {
            n10.f61950m.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(N n10, C8060f c8060f, String str) {
        n10.q0(c8060f, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(N n10, MediaStream mediaStream) {
        Map mapX = Zg.U.x(n10.f61954q);
        mapX.put(mediaStream.getId(), mediaStream);
        n10.f61954q = mapX;
        n10.f61955r.h(mapX);
        Sj.a.f20830a.a("onAddStream " + n10.f61954q.size() + " " + mediaStream.getId(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(N n10) {
        n10.f61955r.h(n10.f61954q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        I(c.SET_REMOTE_SDP_SUCCESS);
        this.f61946i = true;
        for (IceCandidate iceCandidate : this.f61949l) {
            PeerConnection peerConnection = this.f61942e;
            if (peerConnection != null) {
                peerConnection.addIceCandidate(iceCandidate);
            }
        }
        this.f61949l.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(N n10, String str) {
        Map mapX = Zg.U.x(n10.f61954q);
        mapX.remove(str);
        n10.f61954q = mapX;
        n10.f61955r.h(mapX);
        Sj.a.f20830a.a("onRemoveStream " + n10.f61954q.size() + " " + str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(N n10) {
        n10.f61955r.h(n10.f61954q);
    }

    private final void p0(String str, C8060f c8060f) {
        Sj.a.f20830a.o("Setting new remote description", new Object[0]);
        SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.OFFER, str);
        PeerConnection peerConnection = this.f61942e;
        if (peerConnection != null) {
            peerConnection.setRemoteDescription(new o(c8060f), sessionDescription);
        }
    }

    private final void q0(C8060f c8060f, String str) {
        Object objC;
        DataChannel dataChannelO;
        try {
            u.a aVar = Yg.u.f25017b;
            dataChannelO = O(str);
        } catch (Throwable th2) {
            u.a aVar2 = Yg.u.f25017b;
            objC = Yg.u.c(Yg.v.a(th2));
        }
        if (dataChannelO == null) {
            throw new Exception("Could not create DataChannel with name '" + str + "'");
        }
        c8060f.y(dataChannelO);
        objC = Yg.u.c(Yg.J.f24997a);
        if (Yg.u.h(objC) != null) {
            C8060f c8060f2 = (C8060f) this.f61950m.remove(str);
            if (c8060f2 != null) {
                c8060f2.i();
            }
            c8060f.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(C8060f c8060f, N n10, String str) {
        c8060f.i();
        n10.f61950m.remove(str);
    }

    private final PeerConnection t0() throws Exception {
        PeerConnection peerConnection = this.f61942e;
        if (peerConnection != null) {
            return peerConnection;
        }
        throw new Exception("PeerConnection not initialized");
    }

    private final void u0(IceCandidate iceCandidate) throws JSONException {
        if (((C8060f) this.f61950m.get("ws:/api/ws/webrtc/signaling")) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "candidate");
            jSONObject.put("candidate", iceCandidate.sdp);
            jSONObject.put("sdpMid", iceCandidate.sdpMid);
            jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
            kb.c cVar = kb.c.f51354a;
            String string = jSONObject.toString();
            AbstractC6492s.h(string, "toString(...)");
            byte[] bytes = string.getBytes(C6510d.f52215b);
            AbstractC6492s.h(bytes, "getBytes(...)");
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
            AbstractC6492s.h(byteBufferWrap, "wrap(...)");
            ByteBuffer byteBufferB = cVar.b(byteBufferWrap);
            Sj.a.f20830a.a("Sending ice candidate to signalling! " + jSONObject, new Object[0]);
            w0(new DataChannel.Buffer(byteBufferB, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(SessionDescription sessionDescription, C8060f c8060f) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "answer");
        jSONObject.put("sdp", sessionDescription.description);
        kb.c cVar = kb.c.f51354a;
        String string = jSONObject.toString();
        AbstractC6492s.h(string, "toString(...)");
        byte[] bytes = string.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        AbstractC6492s.h(byteBufferWrap, "wrap(...)");
        c8060f.w(new DataChannel.Buffer(cVar.b(byteBufferWrap), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(N n10, DataChannel.Buffer buffer) {
        C8060f c8060f = (C8060f) n10.f61950m.get("ws:/api/ws/webrtc/signaling");
        if (c8060f == null) {
            Sj.a.f20830a.o("Signalling is null cant send command!", new Object[0]);
        } else {
            c8060f.w(buffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(SessionDescription sessionDescription) {
        PeerConnection peerConnection = this.f61942e;
        if (peerConnection != null) {
            peerConnection.setLocalDescription(new q(), sessionDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void z0() {
        if (this.f61945h) {
            return;
        }
        this.f61945h = true;
        I(c.ICE_GATHERING_COMPLETE);
        M();
    }

    public final void B0(InterfaceC6835l interfaceC6835l) {
        this.f61953p = interfaceC6835l;
    }

    public final gg.s J() {
        gg.s sVarF = this.f61961x.F(new g());
        AbstractC6492s.h(sVarF, "doOnNext(...)");
        return sVarF;
    }

    public final C8060f P(String label) {
        AbstractC6492s.i(label, "label");
        Sj.a.f20830a.a("createDataChannelObserverHub " + label + " " + Thread.currentThread().getName(), new Object[0]);
        C8060f c8060f = (C8060f) this.f61950m.get(label);
        return c8060f == null ? h0(this, label, false, 2, null) : c8060f;
    }

    public final C6569c a0() {
        return this.f61940c;
    }

    public final boolean e0() {
        return this.f61941d;
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(final MediaStream mediaStream) {
        AbstractC6492s.i(mediaStream, "mediaStream");
        Fg.c cVar = this.f61956s;
        String id2 = mediaStream.getId();
        AbstractC6492s.h(id2, "getId(...)");
        cVar.k2(new AbstractC8062h.a(id2));
        f61934D.e(new Runnable() { // from class: tb.J
            @Override // java.lang.Runnable
            public final void run() {
                N.k0(this.f61926a, mediaStream);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver receiver, MediaStream[] mediaStreams) {
        AbstractC6492s.i(receiver, "receiver");
        AbstractC6492s.i(mediaStreams, "mediaStreams");
        f61934D.e(new Runnable() { // from class: tb.K
            @Override // java.lang.Runnable
            public final void run() {
                N.l0(this.f61928a);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
        AbstractC6492s.i(dataChannel, "dataChannel");
        throw new Yg.r("An operation is not implemented: not implemented");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate candidate) throws JSONException {
        AbstractC6492s.i(candidate, "candidate");
        Sj.a.f20830a.a("onIceCandidate: " + candidate, new Object[0]);
        this.f61937A.dispose();
        if (this.f61943f) {
            this.f61939b.w(this.f61938a, candidate);
        }
        if (e0()) {
            u0(candidate);
        }
        this.f61937A = Gg.a.d().f(new Runnable() { // from class: tb.I
            @Override // java.lang.Runnable
            public final void run() {
                this.f61925a.z0();
            }
        }, 3L, TimeUnit.SECONDS);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] candidates) {
        AbstractC6492s.i(candidates, "candidates");
        Sj.a.f20830a.a("onIceCandidatesRemoved candidates: " + candidates, new Object[0]);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState newState) {
        AbstractC6492s.i(newState, "newState");
        int i10 = d.f61966b[newState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            I(c.NONE);
            gg.t tVar = this.f61959v;
            if (tVar == null) {
                AbstractC6492s.v("stateEmitter");
                tVar = null;
            }
            tVar.c(new WebRtcClientDisconnectedException());
        }
        Sj.a.f20830a.a("onIceConnectionChange newState: " + newState, new Object[0]);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean z10) {
        Sj.a.f20830a.a("onIceConnectionReceivingChange receiving: " + z10, new Object[0]);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState newState) {
        AbstractC6492s.i(newState, "newState");
        Sj.a.f20830a.a("onIceGatheringChange newState: " + newState, new Object[0]);
        if (newState == PeerConnection.IceGatheringState.COMPLETE) {
            z0();
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream mediaStream) {
        AbstractC6492s.i(mediaStream, "mediaStream");
        final String id2 = mediaStream.getId();
        Fg.c cVar = this.f61956s;
        AbstractC6492s.f(id2);
        cVar.k2(new AbstractC8062h.b(id2));
        f61934D.e(new Runnable() { // from class: tb.G
            @Override // java.lang.Runnable
            public final void run() {
                N.n0(this.f61922a, id2);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveTrack(RtpReceiver rtpReceiver) {
        f61934D.e(new Runnable() { // from class: tb.H
            @Override // java.lang.Runnable
            public final void run() {
                N.o0(this.f61924a);
            }
        });
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        Sj.a.f20830a.a("onRenegotiationNeeded", new Object[0]);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState newState) {
        AbstractC6492s.i(newState, "newState");
        Sj.a.f20830a.a("onSignalingChange newState: " + newState, new Object[0]);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onTrack(RtpTransceiver rtpTransceiver) {
        RtpReceiver receiver;
        super.onTrack(rtpTransceiver);
        Sj.a.f20830a.a("onTrack " + ((rtpTransceiver == null || (receiver = rtpTransceiver.getReceiver()) == null) ? null : receiver.id()), new Object[0]);
        if ((rtpTransceiver != null ? rtpTransceiver.getMediaType() : null) == MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO) {
            rtpTransceiver.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_RECV);
        }
    }

    public final void r0(final String label) {
        AbstractC6492s.i(label, "label");
        final C8060f c8060f = (C8060f) this.f61950m.get(label);
        if (c8060f != null) {
            f61934D.e(new Runnable() { // from class: tb.D
                @Override // java.lang.Runnable
                public final void run() {
                    N.s0(c8060f, this, label);
                }
            });
        }
    }

    public final void w0(final DataChannel.Buffer buffer) {
        AbstractC6492s.i(buffer, "buffer");
        f61934D.e(new Runnable() { // from class: tb.C
            @Override // java.lang.Runnable
            public final void run() {
                N.x0(this.f61915a, buffer);
            }
        });
    }
}
