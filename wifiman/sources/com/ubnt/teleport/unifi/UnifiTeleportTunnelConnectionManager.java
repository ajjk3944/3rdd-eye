package com.ubnt.teleport.unifi;

import I7.Q;
import Y6.r;
import Yg.J;
import Zg.AbstractC3689v;
import android.util.Base64;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.UnifiTeleportTunnelConnectionManager;
import gg.AbstractC5912b;
import gg.C;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.s;
import gg.t;
import gg.u;
import gg.v;
import gg.z;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import kotlin.text.C6510d;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class UnifiTeleportTunnelConnectionManager {

    /* renamed from: p, reason: collision with root package name */
    public static final a f39335p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f39336a;

    /* renamed from: b, reason: collision with root package name */
    private long f39337b;

    /* renamed from: c, reason: collision with root package name */
    private Q f39338c;

    /* renamed from: d, reason: collision with root package name */
    private Long f39339d;

    /* renamed from: e, reason: collision with root package name */
    private long f39340e;

    /* renamed from: f, reason: collision with root package name */
    private long f39341f;

    /* renamed from: g, reason: collision with root package name */
    private long f39342g;

    /* renamed from: h, reason: collision with root package name */
    private long f39343h;

    /* renamed from: i, reason: collision with root package name */
    private final b f39344i;

    /* renamed from: j, reason: collision with root package name */
    private final b f39345j;

    /* renamed from: k, reason: collision with root package name */
    private final Fg.a f39346k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f39347l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f39348m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f39349n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f39350o;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoRequest;", "LK7/b;", "", "sessionSecretHash", "requestId", "", "timeout", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "d", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "I", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Y6.i(generateAdapter = true)
    public static final /* data */ class EchoRequest extends K7.b {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionSecretHash;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int timeout;

        public EchoRequest(@Y6.g(name = "session_secret_hash") String sessionSecretHash, @Y6.g(name = "req_id") String requestId, @Y6.g(name = "timeout") int i10) {
            AbstractC6492s.i(sessionSecretHash, "sessionSecretHash");
            AbstractC6492s.i(requestId, "requestId");
            this.sessionSecretHash = sessionSecretHash;
            this.requestId = requestId;
            this.timeout = i10;
        }

        /* renamed from: b, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* renamed from: c, reason: from getter */
        public final String getSessionSecretHash() {
            return this.sessionSecretHash;
        }

        public final EchoRequest copy(@Y6.g(name = "session_secret_hash") String sessionSecretHash, @Y6.g(name = "req_id") String requestId, @Y6.g(name = "timeout") int timeout) {
            AbstractC6492s.i(sessionSecretHash, "sessionSecretHash");
            AbstractC6492s.i(requestId, "requestId");
            return new EchoRequest(sessionSecretHash, requestId, timeout);
        }

        /* renamed from: d, reason: from getter */
        public final int getTimeout() {
            return this.timeout;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EchoRequest)) {
                return false;
            }
            EchoRequest echoRequest = (EchoRequest) other;
            return AbstractC6492s.d(this.sessionSecretHash, echoRequest.sessionSecretHash) && AbstractC6492s.d(this.requestId, echoRequest.requestId) && this.timeout == echoRequest.timeout;
        }

        public int hashCode() {
            return (((this.sessionSecretHash.hashCode() * 31) + this.requestId.hashCode()) * 31) + Integer.hashCode(this.timeout);
        }

        public String toString() {
            return "EchoRequest(sessionSecretHash=" + this.sessionSecretHash + ", requestId=" + this.requestId + ", timeout=" + this.timeout + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoResponse;", "LK7/b;", "", "requestId", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Y6.i(generateAdapter = true)
    public static final /* data */ class EchoResponse extends K7.b {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestId;

        public EchoResponse(@Y6.g(name = "req_id") String str) {
            this.requestId = str;
        }

        /* renamed from: b, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        public final EchoResponse copy(@Y6.g(name = "req_id") String requestId) {
            return new EchoResponse(requestId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EchoResponse) && AbstractC6492s.d(this.requestId, ((EchoResponse) other).requestId);
        }

        public int hashCode() {
            String str = this.requestId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EchoResponse(requestId=" + this.requestId + ')';
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f39360a;

        /* renamed from: b, reason: collision with root package name */
        private final InetAddress f39361b;

        /* renamed from: c, reason: collision with root package name */
        private final int f39362c;

        /* renamed from: d, reason: collision with root package name */
        private final long f39363d;

        /* renamed from: e, reason: collision with root package name */
        private final long f39364e;

        /* renamed from: f, reason: collision with root package name */
        private final long f39365f;

        /* renamed from: g, reason: collision with root package name */
        private final long f39366g;

        public c(String sessionSecret, InetAddress udpEchoAddr, int i10, long j10, long j11, long j12, long j13) {
            AbstractC6492s.i(sessionSecret, "sessionSecret");
            AbstractC6492s.i(udpEchoAddr, "udpEchoAddr");
            this.f39360a = sessionSecret;
            this.f39361b = udpEchoAddr;
            this.f39362c = i10;
            this.f39363d = j10;
            this.f39364e = j11;
            this.f39365f = j12;
            this.f39366g = j13;
        }

        public final long a() {
            return this.f39363d;
        }

        public final long b() {
            return this.f39365f;
        }

        public final long c() {
            return this.f39364e;
        }

        public final long d() {
            return this.f39366g;
        }

        public final String e() {
            return this.f39360a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f39360a, cVar.f39360a) && AbstractC6492s.d(this.f39361b, cVar.f39361b) && this.f39362c == cVar.f39362c && this.f39363d == cVar.f39363d && this.f39364e == cVar.f39364e && this.f39365f == cVar.f39365f && this.f39366g == cVar.f39366g;
        }

        public final InetAddress f() {
            return this.f39361b;
        }

        public final int g() {
            return this.f39362c;
        }

        public int hashCode() {
            return (((((((((((this.f39360a.hashCode() * 31) + this.f39361b.hashCode()) * 31) + Integer.hashCode(this.f39362c)) * 31) + Long.hashCode(this.f39363d)) * 31) + Long.hashCode(this.f39364e)) * 31) + Long.hashCode(this.f39365f)) * 31) + Long.hashCode(this.f39366g);
        }

        public String toString() {
            return "UdpEchoConfig(sessionSecret=" + this.f39360a + ", udpEchoAddr=" + this.f39361b + ", udpEchoPort=" + this.f39362c + ", packetIntervalMillis=" + this.f39363d + ", packetLostTimeoutMillis=" + this.f39364e + ", packetLoosingTimeoutMillis=" + this.f39365f + ", packetReceiveTimeoutMillis=" + this.f39366g + ')';
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39367a;

        static {
            int[] iArr = new int[Q.values().length];
            try {
                iArr[Q.LOOSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q.LOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39367a = iArr;
        }
    }

    public static final class e implements InterfaceC5915e {
        public e() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                UnifiTeleportTunnelConnectionManager.this.f39336a = System.currentTimeMillis();
                UnifiTeleportTunnelConnectionManager unifiTeleportTunnelConnectionManager = UnifiTeleportTunnelConnectionManager.this;
                unifiTeleportTunnelConnectionManager.f39337b = unifiTeleportTunnelConnectionManager.f39336a;
                UnifiTeleportTunnelConnectionManager.this.P(Q.CONNECTED);
                UnifiTeleportTunnelConnectionManager.this.f39344i.a();
                UnifiTeleportTunnelConnectionManager.this.f39345j.a();
                UnifiTeleportTunnelConnectionManager.this.f39340e = 0L;
                UnifiTeleportTunnelConnectionManager.this.f39341f = 0L;
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f39369a = new f();

        f() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UDP Echo socket closed";
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f39370a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(N n10) {
            super(0);
            this.f39370a = n10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received invalid UDP Echo message: " + ((String) this.f39370a.f51689a);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f39371a = new h();

        h() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Y6.r invoke() {
            return new r.a().c();
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {
        i() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Y6.h invoke() {
            return UnifiTeleportTunnelConnectionManager.this.z().c(EchoRequest.class);
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {
        j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Y6.h invoke() {
            return UnifiTeleportTunnelConnectionManager.this.z().c(EchoResponse.class);
        }
    }

    public static final class k implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                try {
                    interfaceC5910A.onSuccess(new DatagramSocket());
                } catch (SocketException e10) {
                    throw new UnifiTeleportTunnel.Error.Wireguard.Connection(e10, "Teleport echo socket creation failed");
                }
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f39375b;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f39376a;

            /* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnelConnectionManager$l$a$a, reason: collision with other inner class name */
            static final class C1249a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f39377a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1249a(c cVar) {
                    super(0);
                    this.f39377a = cVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Timeout for receiving udp packets initiated : " + this.f39377a.d();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(1);
                this.f39376a = cVar;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v invoke(Throwable th2) {
                if (!(th2 instanceof TimeoutException)) {
                    return s.L(th2);
                }
                N7.a.b(new C1249a(this.f39376a));
                return s.h0(0);
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            public static final b f39378a = new b();

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Integer f39379a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Integer f39380b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Integer num, Integer num2) {
                    super(0);
                    this.f39379a = num;
                    this.f39380b = num2;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Comparing socket request indexes, current vs previous : " + this.f39379a + " - " + this.f39380b + ' ';
                }
            }

            b() {
                super(2);
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(Integer previous, Integer current) {
                N7.a.b(new a(current, previous));
                AbstractC6492s.h(current, "current");
                int iIntValue = current.intValue();
                AbstractC6492s.h(previous, "previous");
                return iIntValue > previous.intValue() ? current : previous;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f39381a;

            static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final a f39382a = new a();

                a() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Q invoke(Long l10) {
                    return Q.LOOSING;
                }
            }

            static final class b extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final b f39383a = new b();

                b() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Q invoke(Long l10) {
                    return Q.LOST;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(c cVar) {
                super(1);
                this.f39381a = cVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Q j(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                return (Q) tmp0.invoke(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Q l(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                return (Q) tmp0.invoke(obj);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final v invoke(Integer num) {
                s sVarH0 = s.h0(Q.CONNECTED);
                long jB = this.f39381a.b();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                s sVarB1 = s.b1(jB, timeUnit);
                final a aVar = a.f39382a;
                s sVarI0 = sVarB1.i0(new kg.n() { // from class: com.ubnt.teleport.unifi.e
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return UnifiTeleportTunnelConnectionManager.l.c.j(aVar, obj);
                    }
                });
                s sVarB12 = s.b1(this.f39381a.c(), timeUnit);
                final b bVar = b.f39383a;
                return s.k0(sVarH0, sVarI0, sVarB12.i0(new kg.n() { // from class: com.ubnt.teleport.unifi.f
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return UnifiTeleportTunnelConnectionManager.l.c.l(bVar, obj);
                    }
                }));
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f39384a = new d();

            d() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Closing Teleport socket";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(1);
            this.f39375b = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v n(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (v) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Integer o(InterfaceC6839p tmp0, Integer num, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (Integer) tmp0.invoke(num, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v p(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (v) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(DatagramSocket datagramSocket) {
            N7.a.b(d.f39384a);
            datagramSocket.close();
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final Dj.a invoke(final DatagramSocket socket) {
            UnifiTeleportTunnelConnectionManager unifiTeleportTunnelConnectionManager = UnifiTeleportTunnelConnectionManager.this;
            AbstractC6492s.h(socket, "socket");
            s sVarW0 = unifiTeleportTunnelConnectionManager.E(socket).l0(UnifiTeleportTunnelConnectionManager.this.I(socket, this.f39375b)).W0(this.f39375b.d(), TimeUnit.MILLISECONDS);
            final a aVar = new a(this.f39375b);
            s sVarQ0 = sVarW0.q0(new kg.n() { // from class: com.ubnt.teleport.unifi.a
                @Override // kg.n
                public final Object apply(Object obj) {
                    return UnifiTeleportTunnelConnectionManager.l.n(aVar, obj);
                }
            });
            final b bVar = b.f39378a;
            s sVarV = sVarQ0.B0(-1, new InterfaceC6465b() { // from class: com.ubnt.teleport.unifi.b
                @Override // kg.InterfaceC6465b
                public final Object apply(Object obj, Object obj2) {
                    return UnifiTeleportTunnelConnectionManager.l.o(bVar, (Integer) obj, obj2);
                }
            }).G0(1L).v();
            final c cVar = new c(this.f39375b);
            return sVarV.O0(new kg.n() { // from class: com.ubnt.teleport.unifi.c
                @Override // kg.n
                public final Object apply(Object obj) {
                    return UnifiTeleportTunnelConnectionManager.l.p(cVar, obj);
                }
            }).v().o0(Gg.a.d()).d1(EnumC5911a.LATEST).Z(new InterfaceC6464a() { // from class: com.ubnt.teleport.unifi.d
                @Override // kg.InterfaceC6464a
                public final void run() {
                    UnifiTeleportTunnelConnectionManager.l.r(socket);
                }
            });
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f39386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DatagramSocket f39387c;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f39388a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(1);
                this.f39388a = cVar;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DatagramPacket invoke(String payloadString) {
                AbstractC6492s.h(payloadString, "payloadString");
                byte[] bytes = payloadString.getBytes(C6510d.f52215b);
                AbstractC6492s.h(bytes, "this as java.lang.String).getBytes(charset)");
                return new DatagramPacket(bytes, bytes.length, this.f39388a.f(), this.f39388a.g());
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f39389a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DatagramSocket f39390b;

            static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DatagramSocket f39391a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ DatagramPacket f39392b;

                /* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnelConnectionManager$m$b$a$a, reason: collision with other inner class name */
                static final class C1250a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Throwable f39393a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1250a(Throwable th2) {
                        super(0);
                        this.f39393a = th2;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Could not send first UDP packet due to : " + this.f39393a;
                    }
                }

                /* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnelConnectionManager$m$b$a$b, reason: collision with other inner class name */
                public static final class C1251b implements InterfaceC5915e {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ DatagramSocket f39394a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ DatagramPacket f39395b;

                    public C1251b(DatagramSocket datagramSocket, DatagramPacket datagramPacket) {
                        this.f39394a = datagramSocket;
                        this.f39395b = datagramPacket;
                    }

                    @Override // gg.InterfaceC5915e
                    public final void a(InterfaceC5913c interfaceC5913c) {
                        try {
                            this.f39394a.send(this.f39395b);
                            interfaceC5913c.a();
                        } catch (Throwable th2) {
                            interfaceC5913c.onError(th2);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(DatagramSocket datagramSocket, DatagramPacket datagramPacket) {
                    super(1);
                    this.f39391a = datagramSocket;
                    this.f39392b = datagramPacket;
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final gg.f invoke(Throwable th2) {
                    N7.a.b(new C1250a(th2));
                    AbstractC5912b abstractC5912bT = AbstractC5912b.m().t(10000L, TimeUnit.MILLISECONDS);
                    AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1251b(this.f39391a, this.f39392b));
                    AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                    return abstractC5912bT.g(abstractC5912bR);
                }
            }

            /* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnelConnectionManager$m$b$b, reason: collision with other inner class name */
            static final class C1252b extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DatagramSocket f39396a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ DatagramPacket f39397b;

                /* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnelConnectionManager$m$b$b$a */
                static final class a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Throwable f39398a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(Throwable th2) {
                        super(0);
                        this.f39398a = th2;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Could not send second UDP packet due to : " + this.f39398a;
                    }
                }

                /* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnelConnectionManager$m$b$b$b, reason: collision with other inner class name */
                public static final class C1253b implements InterfaceC5915e {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ DatagramSocket f39399a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ DatagramPacket f39400b;

                    public C1253b(DatagramSocket datagramSocket, DatagramPacket datagramPacket) {
                        this.f39399a = datagramSocket;
                        this.f39400b = datagramPacket;
                    }

                    @Override // gg.InterfaceC5915e
                    public final void a(InterfaceC5913c interfaceC5913c) {
                        try {
                            this.f39399a.send(this.f39400b);
                            interfaceC5913c.a();
                        } catch (Throwable th2) {
                            interfaceC5913c.onError(th2);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1252b(DatagramSocket datagramSocket, DatagramPacket datagramPacket) {
                    super(1);
                    this.f39396a = datagramSocket;
                    this.f39397b = datagramPacket;
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final gg.f invoke(Throwable th2) {
                    N7.a.b(new a(th2));
                    AbstractC5912b abstractC5912bT = AbstractC5912b.m().t(10000L, TimeUnit.MILLISECONDS);
                    AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1253b(this.f39396a, this.f39397b));
                    AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                    return abstractC5912bT.g(abstractC5912bR);
                }
            }

            static final class c extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final c f39401a = new c();

                static final class a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Throwable f39402a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(Throwable th2) {
                        super(0);
                        this.f39402a = th2;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Could not send ping at all due to : " + this.f39402a;
                    }
                }

                c() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final gg.f invoke(Throwable th2) {
                    N7.a.b(new a(th2));
                    return AbstractC5912b.m();
                }
            }

            public static final class d implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DatagramSocket f39403a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ DatagramPacket f39404b;

                public d(DatagramSocket datagramSocket, DatagramPacket datagramPacket) {
                    this.f39403a = datagramSocket;
                    this.f39404b = datagramPacket;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        this.f39403a.send(this.f39404b);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, DatagramSocket datagramSocket) {
                super(1);
                this.f39389a = cVar;
                this.f39390b = datagramSocket;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final gg.f l(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                return (gg.f) tmp0.invoke(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final gg.f n(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                return (gg.f) tmp0.invoke(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final gg.f o(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                return (gg.f) tmp0.invoke(obj);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public final gg.f invoke(DatagramPacket datagramPacket) {
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new d(this.f39390b, datagramPacket));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                final a aVar = new a(this.f39390b, datagramPacket);
                AbstractC5912b abstractC5912bO = abstractC5912bR.O(new kg.n() { // from class: com.ubnt.teleport.unifi.i
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return UnifiTeleportTunnelConnectionManager.m.b.l(aVar, obj);
                    }
                });
                final C1252b c1252b = new C1252b(this.f39390b, datagramPacket);
                AbstractC5912b abstractC5912bO2 = abstractC5912bO.O(new kg.n() { // from class: com.ubnt.teleport.unifi.j
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return UnifiTeleportTunnelConnectionManager.m.b.n(c1252b, obj);
                    }
                });
                final c cVar = c.f39401a;
                return abstractC5912bO2.O(new kg.n() { // from class: com.ubnt.teleport.unifi.k
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return UnifiTeleportTunnelConnectionManager.m.b.o(cVar, obj);
                    }
                }).u(this.f39389a.a(), TimeUnit.MILLISECONDS, Gg.a.d());
            }
        }

        public static final class c implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnelConnectionManager f39405a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f39406b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Integer f39407c;

            public c(UnifiTeleportTunnelConnectionManager unifiTeleportTunnelConnectionManager, c cVar, Integer num) {
                this.f39405a = unifiTeleportTunnelConnectionManager;
                this.f39406b = cVar;
                this.f39407c = num;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(this.f39405a.A().i(new EchoRequest(this.f39405a.C(this.f39406b.e()), String.valueOf(this.f39407c), (int) this.f39406b.c())));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(c cVar, DatagramSocket datagramSocket) {
            super(1);
            this.f39386b = cVar;
            this.f39387c = datagramSocket;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DatagramPacket j(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (DatagramPacket) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.f l(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (gg.f) tmp0.invoke(obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(Integer num) {
            z zVarI = z.i(new c(UnifiTeleportTunnelConnectionManager.this, this.f39386b, num));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            final a aVar = new a(this.f39386b);
            z zVarA = zVarI.A(new kg.n() { // from class: com.ubnt.teleport.unifi.g
                @Override // kg.n
                public final Object apply(Object obj) {
                    return UnifiTeleportTunnelConnectionManager.m.j(aVar, obj);
                }
            });
            final b bVar = new b(this.f39386b, this.f39387c);
            return zVarA.t(new kg.n() { // from class: com.ubnt.teleport.unifi.h
                @Override // kg.n
                public final Object apply(Object obj) {
                    return UnifiTeleportTunnelConnectionManager.m.l(bVar, obj);
                }
            });
        }
    }

    public static final class n implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f39409b;

        public n(c cVar) {
            this.f39409b = cVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                UnifiTeleportTunnelConnectionManager.this.f39346k.h(this.f39409b);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class o extends AbstractC6494u implements InterfaceC6835l {
        o() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a invoke(c config) {
            UnifiTeleportTunnelConnectionManager unifiTeleportTunnelConnectionManager = UnifiTeleportTunnelConnectionManager.this;
            AbstractC6492s.h(config, "config");
            return unifiTeleportTunnelConnectionManager.G(config);
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6835l {
        p() {
            super(1);
        }

        public final void a(Dj.c cVar) {
            UnifiTeleportTunnelConnectionManager.this.P(Q.CONNECTED);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Dj.c) obj);
            return J.f24997a;
        }
    }

    static final class q extends AbstractC6494u implements InterfaceC6835l {
        q() {
            super(1);
        }

        public final void a(Q it) {
            UnifiTeleportTunnelConnectionManager unifiTeleportTunnelConnectionManager = UnifiTeleportTunnelConnectionManager.this;
            AbstractC6492s.h(it, "it");
            unifiTeleportTunnelConnectionManager.P(it);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Q) obj);
            return J.f24997a;
        }
    }

    static final class r extends AbstractC6494u implements InterfaceC6824a {
        r() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Tunnel connection state internal updated to " + UnifiTeleportTunnelConnectionManager.this.f39338c;
        }
    }

    public UnifiTeleportTunnelConnectionManager() {
        long j10 = 0;
        int i10 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f39344i = new b(j10, i10, defaultConstructorMarker);
        this.f39345j = new b(j10, i10, defaultConstructorMarker);
        Fg.a aVarJ2 = Fg.a.j2();
        this.f39346k = aVarJ2;
        this.f39347l = Yg.n.b(h.f39371a);
        this.f39348m = Yg.n.b(new i());
        this.f39349n = Yg.n.b(new j());
        gg.i iVarX0 = aVarJ2.X0(Gg.a.a());
        final o oVar = new o();
        gg.i iVarW = iVarX0.I1(new kg.n() { // from class: I7.l
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelConnectionManager.M(oVar, obj);
            }
        }).W();
        final p pVar = new p();
        gg.i iVarG0 = iVarW.g0(new InterfaceC6469f() { // from class: I7.m
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                UnifiTeleportTunnelConnectionManager.N(pVar, obj);
            }
        });
        final q qVar = new q();
        gg.i iVarI2 = iVarG0.f0(new InterfaceC6469f() { // from class: I7.n
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                UnifiTeleportTunnelConnectionManager.O(qVar, obj);
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI2, "udpEchoConfigProcessor\n …)\n            .refCount()");
        this.f39350o = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y6.h A() {
        Object value = this.f39348m.getValue();
        AbstractC6492s.h(value, "<get-moshiEchoRequestAdapter>(...)");
        return (Y6.h) value;
    }

    private final Y6.h B() {
        Object value = this.f39349n.getValue();
        AbstractC6492s.h(value, "<get-moshiEchoResponseAdapter>(...)");
        return (Y6.h) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String C(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(bytes), 2);
        AbstractC6492s.h(strEncodeToString, "encodeToString(hash, Base64.NO_WRAP)");
        return strEncodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s E(final DatagramSocket datagramSocket) {
        s sVarM0 = s.o(new u() { // from class: I7.i
            @Override // gg.u
            public final void a(gg.t tVar) throws IOException {
                UnifiTeleportTunnelConnectionManager.F(datagramSocket, this, tVar);
            }
        }).o0(Gg.a.d()).M0(Gg.a.d());
        AbstractC6492s.h(sVarM0, "create { emitter ->\n    …scribeOn(Schedulers.io())");
        return sVarM0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(DatagramSocket this_listenEchoConfirmations, UnifiTeleportTunnelConnectionManager this$0, t tVar) throws IOException {
        J j10;
        String requestId;
        Integer numQ;
        AbstractC6492s.i(this_listenEchoConfirmations, "$this_listenEchoConfirmations");
        AbstractC6492s.i(this$0, "this$0");
        DatagramPacket datagramPacket = new DatagramPacket(new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES], PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        N n10 = new N();
        while (true) {
            try {
                this_listenEchoConfirmations.receive(datagramPacket);
                byte[] data = datagramPacket.getData();
                AbstractC6492s.h(data, "packet.data");
                n10.f51689a = new String(data, 0, datagramPacket.getLength(), C6510d.f52215b);
                EchoResponse echoResponse = (EchoResponse) this$0.B().c((String) n10.f51689a);
                if (echoResponse == null || (requestId = echoResponse.getRequestId()) == null || (numQ = kotlin.text.t.q(requestId)) == null) {
                    j10 = null;
                } else {
                    tVar.h(Integer.valueOf(numQ.intValue()));
                    j10 = J.f24997a;
                }
                if (j10 == null) {
                    N7.a.c(new g(n10), null);
                }
            } catch (SocketException unused) {
                N7.a.b(f.f39369a);
                tVar.a();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i G(c cVar) {
        z zVarI = z.i(new k());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        final l lVar = new l(cVar);
        gg.i iVarW = zVarI.w(new kg.n() { // from class: I7.h
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelConnectionManager.H(lVar, obj);
            }
        });
        AbstractC6492s.h(iVarW, "private fun newUdpEchoSt…   }\n            }\n\n    }");
        return iVarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dj.a H(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (Dj.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b I(DatagramSocket datagramSocket, c cVar) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        gg.i iVarC0 = gg.i.C0(new InterfaceC6469f() { // from class: I7.j
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                UnifiTeleportTunnelConnectionManager.J(atomicInteger, (gg.h) obj);
            }
        });
        final m mVar = new m(cVar, datagramSocket);
        AbstractC5912b abstractC5912bW = iVarC0.D(new kg.n() { // from class: I7.k
            @Override // kg.n
            public final Object apply(Object obj) {
                return UnifiTeleportTunnelConnectionManager.K(mVar, obj);
            }
        }).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "private fun DatagramSock…On(Schedulers.io())\n    }");
        return abstractC5912bW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(AtomicInteger indexField, gg.h hVar) {
        AbstractC6492s.i(indexField, "$indexField");
        hVar.h(Integer.valueOf(indexField.getAndIncrement()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f K(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dj.a M(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (Dj.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Q q10) {
        if (this.f39338c != q10) {
            this.f39338c = q10;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f39339d = Long.valueOf(jCurrentTimeMillis);
            if (this.f39338c == Q.CONNECTED) {
                this.f39337b = jCurrentTimeMillis;
            }
            N7.a.b(new r());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y6.r z() {
        Object value = this.f39347l.getValue();
        AbstractC6492s.h(value, "<get-moshi>(...)");
        return (Y6.r) value;
    }

    public gg.i D() {
        return this.f39350o;
    }

    public final AbstractC5912b L(c config) {
        AbstractC6492s.i(config, "config");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new n(config));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    public UnifiTeleportTunnel.e Q(com.wireguard.android.backend.b wgStats) {
        AbstractC6492s.i(wgStats, "wgStats");
        this.f39342g = wgStats.b();
        this.f39343h = wgStats.c();
        this.f39344i.c(this.f39342g);
        this.f39345j.c(this.f39343h);
        return y();
    }

    public AbstractC5912b x() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new e());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    public UnifiTeleportTunnel.e y() {
        long jLongValue;
        long jLongValue2;
        long j10 = this.f39336a;
        long j11 = this.f39337b;
        Q q10 = this.f39338c;
        int i10 = q10 == null ? -1 : d.f39367a[q10.ordinal()];
        if (i10 == -1) {
            jLongValue = this.f39340e;
        } else if (i10 == 1 || i10 == 2) {
            long j12 = this.f39340e;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l10 = this.f39339d;
            if (l10 == null) {
                throw new IllegalStateException("state is not null so update timestamp shouldn't be either");
            }
            jLongValue = j12 + (jCurrentTimeMillis - l10.longValue());
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            jLongValue = this.f39340e;
        }
        long j13 = jLongValue;
        Q q11 = this.f39338c;
        int i11 = q11 == null ? -1 : d.f39367a[q11.ordinal()];
        if (i11 == -1 || i11 == 1 || i11 == 2) {
            jLongValue2 = this.f39341f;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            long j14 = this.f39341f;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Long l11 = this.f39339d;
            if (l11 == null) {
                throw new IllegalStateException("state is not null so update timestamp shouldn't be either");
            }
            jLongValue2 = j14 + (jCurrentTimeMillis2 - l11.longValue());
        }
        return new UnifiTeleportTunnel.e(j10, j11, j13, jLongValue2, this.f39342g, this.f39343h, this.f39344i.b(), this.f39345j.b());
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f39355a;

        /* renamed from: b, reason: collision with root package name */
        private a f39356b;

        /* renamed from: c, reason: collision with root package name */
        private final LinkedBlockingQueue f39357c;

        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final long f39358a;

            /* renamed from: b, reason: collision with root package name */
            private final long f39359b;

            public a(long j10, long j11) {
                this.f39358a = j10;
                this.f39359b = j11;
            }

            public final long a() {
                return this.f39358a;
            }

            public final long b() {
                return this.f39359b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f39358a == aVar.f39358a && this.f39359b == aVar.f39359b;
            }

            public int hashCode() {
                return (Long.hashCode(this.f39358a) * 31) + Long.hashCode(this.f39359b);
            }

            public String toString() {
                return "TimedTotal(timestamp=" + this.f39358a + ", value=" + this.f39359b + ')';
            }
        }

        public b(long j10) {
            this.f39355a = j10;
            this.f39357c = new LinkedBlockingQueue();
        }

        public final void a() {
            this.f39357c.clear();
            this.f39356b = null;
        }

        public final long b() {
            a aVar = this.f39356b;
            a aVar2 = (a) AbstractC3689v.C0(this.f39357c);
            if (aVar == null || aVar2 == null) {
                return 0L;
            }
            return (long) (((aVar2.b() - aVar.b()) / (aVar2.a() - aVar.a())) * 1000.0d);
        }

        public final void c(long j10) {
            if (this.f39356b == null) {
                this.f39356b = new a(System.currentTimeMillis(), 0L);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = jCurrentTimeMillis - this.f39355a;
            Iterator it = this.f39357c.iterator();
            AbstractC6492s.h(it, "accumulator.iterator()");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC6492s.h(next, "iterator.next()");
                a aVar = (a) next;
                if (aVar.a() >= j11) {
                    break;
                }
                this.f39356b = aVar;
                it.remove();
            }
            this.f39357c.add(new a(jCurrentTimeMillis, j10));
        }

        public /* synthetic */ b(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 3000L : j10);
        }
    }
}
