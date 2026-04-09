package com.ubnt.teleport.unifi.stun;

import Y6.r;
import Yg.J;
import Zg.AbstractC3689v;
import com.ubnt.teleport.unifi.stun.GoTeleportStun;
import com.ubnt.teleport.unifi.stun.TeleportStun;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 '2\u00020\u0001:\u0004()*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;", "Lcom/ubnt/teleport/unifi/stun/TeleportStun;", "<init>", "()V", "", "iceConfig", "sessionSecret", "interfaceAddressesJson", "Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;", "bridgeCreateLocalPeerDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;", "peerDescription", "Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;", "bridgeSetRemotePeerDesc", "(Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;", "Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;", "bridgeTryGetConnection", "()Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;", "LYg/J;", "bridgeActivateConnection", "bridgeClosePeer", "bridgeCloseConnection", "getInterfaceAddressesJson", "()Ljava/lang/String;", "Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;", "params", "Lgg/z;", "createLocalPeerDescription", "(Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;)Lgg/z;", "Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;", "setupPeerConnection", "(Ljava/lang/String;)Lgg/z;", "Lgg/b;", "activateConnection", "()Lgg/b;", "closePeer", "closeConnection", "loadNativeLibLazily", "Lgg/b;", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "CreateLocalPeerDescResult", "SetRemotePeerDescResult", "TryGetConnectionResult", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class GoTeleportStun implements TeleportStun {
    private static final long GET_CONNECTION_RETRY_INTERVAL_MILLIS = 100;
    private static final long GET_CONNECTION_TIMEOUT_MILLIS = 40000;
    private final AbstractC5912b loadNativeLibLazily;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;", "", "()V", "error", "", "getError", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "localPeerDesc", "getLocalPeerDesc", "setLocalPeerDesc", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CreateLocalPeerDescResult {
        private String error;
        private String localPeerDesc;

        public final String getError() {
            return this.error;
        }

        public final String getLocalPeerDesc() {
            return this.localPeerDesc;
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setLocalPeerDesc(String str) {
            this.localPeerDesc = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;", "", "()V", "error", "", "getError", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SetRemotePeerDescResult {
        private String error;

        public final String getError() {
            return this.error;
        }

        public final void setError(String str) {
            this.error = str;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017¨\u0006 "}, d2 = {"Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;", "", "()V", "errorMsg", "", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "inProgress", "", "getInProgress", "()Z", "isError", "isSuccess", "localIP", "getLocalIP", "setLocalIP", "localPort", "", "getLocalPort", "()Ljava/lang/Integer;", "setLocalPort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "remoteIP", "getRemoteIP", "setRemoteIP", "remotePort", "getRemotePort", "setRemotePort", "toString", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class TryGetConnectionResult {
        private String errorMsg;
        private String localIP;
        private Integer localPort;
        private String remoteIP;
        private Integer remotePort;

        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public final boolean getInProgress() {
            String str;
            String str2 = this.errorMsg;
            return (str2 == null || kotlin.text.t.m0(str2)) && ((str = this.localIP) == null || kotlin.text.t.m0(str));
        }

        public final String getLocalIP() {
            return this.localIP;
        }

        public final Integer getLocalPort() {
            return this.localPort;
        }

        public final String getRemoteIP() {
            return this.remoteIP;
        }

        public final Integer getRemotePort() {
            return this.remotePort;
        }

        public final boolean isError() {
            String str = this.errorMsg;
            return !(str == null || kotlin.text.t.m0(str));
        }

        public final boolean isSuccess() {
            String str;
            String str2 = this.errorMsg;
            return ((str2 != null && !kotlin.text.t.m0(str2)) || (str = this.localIP) == null || kotlin.text.t.m0(str)) ? false : true;
        }

        public final void setErrorMsg(String str) {
            this.errorMsg = str;
        }

        public final void setLocalIP(String str) {
            this.localIP = str;
        }

        public final void setLocalPort(Integer num) {
            this.localPort = num;
        }

        public final void setRemoteIP(String str) {
            this.remoteIP = str;
        }

        public final void setRemotePort(Integer num) {
            this.remotePort = num;
        }

        public String toString() {
            return "STUN_TryGetConnectionResult(local:" + this.localIP + ':' + this.localPort + ",remote:" + this.remoteIP + ':' + this.remotePort + ",errorMsg:" + this.errorMsg + ')';
        }
    }

    public static final class b implements InterfaceC5915e {
        public b() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                N7.a.b(d.f39601a);
                GoTeleportStun.this.bridgeActivateConnection();
                N7.a.b(e.f39602a);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f39600a = new c();

        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "STUN ACTIVATE CONNECTION : finished loading native lib";
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f39601a = new d();

        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "STUN - activateConnection";
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f39602a = new e();

        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "STUN - activateConnection SUCCESS";
        }
    }

    public static final class f implements InterfaceC5915e {
        public f() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                N7.a.b(g.f39604a);
                GoTeleportStun.this.bridgeCloseConnection();
                N7.a.b(h.f39605a);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f39604a = new g();

        g() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "STUN - closeConnection";
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f39605a = new h();

        h() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "STUN - closeConnection SUCCESS";
        }
    }

    public static final class i implements InterfaceC5915e {
        public i() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                N7.a.b(j.f39607a);
                GoTeleportStun.this.bridgeClosePeer();
                N7.a.b(k.f39608a);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f39607a = new j();

        j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "STUN - closePeer";
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f39608a = new k();

        k() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "STUN - closePeer SUCCESS";
        }
    }

    public static final class l implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TeleportStun.b f39610b;

        public l(TeleportStun.b bVar) {
            this.f39610b = bVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                String interfaceAddressesJson = GoTeleportStun.this.getInterfaceAddressesJson();
                N7.a.b(new m(this.f39610b, interfaceAddressesJson));
                CreateLocalPeerDescResult createLocalPeerDescResultBridgeCreateLocalPeerDesc = GoTeleportStun.this.bridgeCreateLocalPeerDesc(this.f39610b.a(), this.f39610b.b(), interfaceAddressesJson);
                String error = createLocalPeerDescResultBridgeCreateLocalPeerDesc.getError();
                if (error != null && !kotlin.text.t.m0(error)) {
                    String error2 = createLocalPeerDescResultBridgeCreateLocalPeerDesc.getError();
                    AbstractC6492s.f(error2);
                    throw new TeleportStun.Error.StunError(error2);
                }
                String localPeerDesc = createLocalPeerDescResultBridgeCreateLocalPeerDesc.getLocalPeerDesc();
                if (localPeerDesc == null || kotlin.text.t.m0(localPeerDesc)) {
                    throw new TeleportStun.Error.InvalidLibOutput("Local peer description");
                }
                String localPeerDesc2 = createLocalPeerDescResultBridgeCreateLocalPeerDesc.getLocalPeerDesc();
                AbstractC6492s.f(localPeerDesc2);
                interfaceC5910A.onSuccess(localPeerDesc2);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TeleportStun.b f39611a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39612b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(TeleportStun.b bVar, String str) {
            super(0);
            this.f39611a = bVar;
            this.f39612b = str;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "STUN - createLocalPeerDesc: " + this.f39611a + ", addresses: " + this.f39612b;
        }
    }

    static final class n extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final n f39613a = new n();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f39614a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f39614a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "STUN - createLocalPeerDesc SUCCESS: " + this.f39614a;
            }
        }

        n() {
            super(1);
        }

        public final void a(String str) {
            N7.a.b(new a(str));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return J.f24997a;
        }
    }

    static final class o extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final o f39615a = new o();

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f39616a = new a();

            a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(InetAddress inetAddress) {
                return inetAddress.getHostAddress();
            }
        }

        o() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8780j invoke(NetworkInterface networkInterface) {
            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
            AbstractC6492s.h(inetAddresses, "it.inetAddresses");
            return AbstractC8783m.N(AbstractC8783m.g(AbstractC3689v.z(inetAddresses)), a.f39616a);
        }
    }

    public static final class p implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39618b;

        public p(String str) {
            this.f39618b = str;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                N7.a.b(new r(this.f39618b));
                SetRemotePeerDescResult setRemotePeerDescResultBridgeSetRemotePeerDesc = GoTeleportStun.this.bridgeSetRemotePeerDesc(this.f39618b);
                String error = setRemotePeerDescResultBridgeSetRemotePeerDesc.getError();
                if (error != null && !kotlin.text.t.m0(error)) {
                    String error2 = setRemotePeerDescResultBridgeSetRemotePeerDesc.getError();
                    AbstractC6492s.f(error2);
                    throw new TeleportStun.Error.StunError(error2);
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class q implements C {
        public q() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                TryGetConnectionResult tryGetConnectionResultBridgeTryGetConnection = GoTeleportStun.this.bridgeTryGetConnection();
                String errorMsg = tryGetConnectionResultBridgeTryGetConnection.getErrorMsg();
                if (errorMsg != null && !kotlin.text.t.m0(errorMsg)) {
                    String errorMsg2 = tryGetConnectionResultBridgeTryGetConnection.getErrorMsg();
                    AbstractC6492s.f(errorMsg2);
                    throw new TeleportStun.Error.StunError(errorMsg2);
                }
                interfaceC5910A.onSuccess(tryGetConnectionResultBridgeTryGetConnection);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class r extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39620a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str) {
            super(0);
            this.f39620a = str;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "STUN - setRemotePeerDesc: " + this.f39620a;
        }
    }

    static final class s extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final s f39621a = new s();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TryGetConnectionResult f39622a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TryGetConnectionResult tryGetConnectionResult) {
                super(0);
                this.f39622a = tryGetConnectionResult;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "STUN - setRemotePeerDesc: connection info: " + this.f39622a;
            }
        }

        s() {
            super(1);
        }

        public final void a(TryGetConnectionResult tryGetConnectionResult) {
            N7.a.b(new a(tryGetConnectionResult));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TryGetConnectionResult) obj);
            return J.f24997a;
        }
    }

    static final class t extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final t f39623a = new t();

        t() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Dj.a h(Object obj) {
            return gg.i.e2(GoTeleportStun.GET_CONNECTION_RETRY_INTERVAL_MILLIS, TimeUnit.MILLISECONDS, Gg.a.d());
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Dj.a invoke(gg.i iVar) {
            return iVar.p0(new kg.n() { // from class: com.ubnt.teleport.unifi.stun.a
                @Override // kg.n
                public final Object apply(Object obj) {
                    return GoTeleportStun.t.h(obj);
                }
            });
        }
    }

    static final class u extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final u f39624a = new u();

        u() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(TryGetConnectionResult tryGetConnectionResult) {
            return Boolean.valueOf(tryGetConnectionResult.isSuccess());
        }
    }

    static final class v extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final v f39625a = new v();

        v() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportStun.a invoke(TryGetConnectionResult tryGetConnectionResult) throws TeleportStun.Error.InvalidLibOutput {
            String localIP = tryGetConnectionResult.getLocalIP();
            if (localIP == null) {
                throw new TeleportStun.Error.InvalidLibOutput("missing local ip in connection result");
            }
            Integer localPort = tryGetConnectionResult.getLocalPort();
            if (localPort == null) {
                throw new TeleportStun.Error.InvalidLibOutput("missing local port in connection result");
            }
            int iIntValue = localPort.intValue();
            String remoteIP = tryGetConnectionResult.getRemoteIP();
            if (remoteIP == null) {
                throw new TeleportStun.Error.InvalidLibOutput("missing remote ip in connection result");
            }
            Integer remotePort = tryGetConnectionResult.getRemotePort();
            if (remotePort != null) {
                return new TeleportStun.a(localIP, iIntValue, remoteIP, remotePort.intValue());
            }
            throw new TeleportStun.Error.InvalidLibOutput("missing remote port in connection result");
        }
    }

    static final class w extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final w f39626a = new w();

        w() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D invoke(Throwable th2) {
            return th2 instanceof TimeoutException ? z.p(new TeleportStun.Error.ResponseTimeout("Failed to setup connection in specified timeout 40000ms")) : z.p(th2);
        }
    }

    static final class x extends AbstractC6494u implements InterfaceC6835l {

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f39628a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "STUN - closed peer since it's no longer necessary";
            }
        }

        x() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h() {
            N7.a.b(a.f39628a);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final D invoke(TeleportStun.a aVar) {
            return GoTeleportStun.this.closePeer().x(new InterfaceC6464a() { // from class: com.ubnt.teleport.unifi.stun.b
                @Override // kg.InterfaceC6464a
                public final void run() {
                    GoTeleportStun.x.h();
                }
            }).k(z.z(aVar));
        }
    }

    static final class y extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final y f39629a = new y();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportStun.a f39630a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TeleportStun.a aVar) {
                super(0);
                this.f39630a = aVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "STUN - setRemotePeerDesc SUCCESS " + this.f39630a;
            }
        }

        y() {
            super(1);
        }

        public final void a(TeleportStun.a aVar) {
            N7.a.b(new a(aVar));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TeleportStun.a) obj);
            return J.f24997a;
        }
    }

    public GoTeleportStun() {
        AbstractC5912b abstractC5912bL = N7.b.f15414a.a().l();
        AbstractC6492s.h(abstractC5912bL, "NativeLibLoader.loadLazily\n            .cache()");
        this.loadNativeLibLazily = abstractC5912bL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activateConnection$lambda$14() {
        N7.a.b(c.f39600a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void bridgeActivateConnection();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void bridgeCloseConnection();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void bridgeClosePeer();

    /* JADX INFO: Access modifiers changed from: private */
    public final native CreateLocalPeerDescResult bridgeCreateLocalPeerDesc(String iceConfig, String sessionSecret, String interfaceAddressesJson);

    /* JADX INFO: Access modifiers changed from: private */
    public final native SetRemotePeerDescResult bridgeSetRemotePeerDesc(String peerDescription);

    /* JADX INFO: Access modifiers changed from: private */
    public final native TryGetConnectionResult bridgeTryGetConnection();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createLocalPeerDescription$lambda$2(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getInterfaceAddressesJson() throws SocketException {
        Y6.h hVarD = new r.a().c().d(Y6.v.j(List.class, String.class));
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        AbstractC6492s.h(networkInterfaces, "getNetworkInterfaces()");
        String strI = hVarD.i(AbstractC8783m.Z(AbstractC8783m.j(AbstractC8783m.N(AbstractC8783m.g(AbstractC3689v.z(networkInterfaces)), o.f39615a))));
        AbstractC6492s.h(strI, "jsonAdapter.toJson(interfaceAddresses)");
        return strI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeleportStun.a setupPeerConnection$lambda$10(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (TeleportStun.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D setupPeerConnection$lambda$11(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (D) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D setupPeerConnection$lambda$12(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (D) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupPeerConnection$lambda$13(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupPeerConnection$lambda$7(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dj.a setupPeerConnection$lambda$8(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (Dj.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupPeerConnection$lambda$9(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    @Override // com.ubnt.teleport.unifi.stun.TeleportStun
    public AbstractC5912b activateConnection() {
        AbstractC5912b abstractC5912bX = this.loadNativeLibLazily.x(new InterfaceC6464a() { // from class: L7.h
            @Override // kg.InterfaceC6464a
            public final void run() {
                GoTeleportStun.activateConnection$lambda$14();
            }
        });
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912bX.g(abstractC5912bR).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "loadNativeLibLazily\n    …scribeOn(Schedulers.io())");
        return abstractC5912bW;
    }

    @Override // com.ubnt.teleport.unifi.stun.TeleportStun
    public AbstractC5912b closeConnection() {
        AbstractC5912b abstractC5912b = this.loadNativeLibLazily;
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new f());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912b.g(abstractC5912bR).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "loadNativeLibLazily.andT…scribeOn(Schedulers.io())");
        return abstractC5912bW;
    }

    @Override // com.ubnt.teleport.unifi.stun.TeleportStun
    public AbstractC5912b closePeer() {
        AbstractC5912b abstractC5912b = this.loadNativeLibLazily;
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new i());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912b.g(abstractC5912bR).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "loadNativeLibLazily.andT…scribeOn(Schedulers.io())");
        return abstractC5912bW;
    }

    @Override // com.ubnt.teleport.unifi.stun.TeleportStun
    public z<String> createLocalPeerDescription(TeleportStun.b params) {
        AbstractC6492s.i(params, "params");
        AbstractC5912b abstractC5912b = this.loadNativeLibLazily;
        z zVarI = z.i(new l(params));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarK = abstractC5912b.k(zVarI);
        final n nVar = n.f39613a;
        z<String> zVarO = zVarK.o(new InterfaceC6469f() { // from class: L7.i
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                GoTeleportStun.createLocalPeerDescription$lambda$2(nVar, obj);
            }
        }).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "loadNativeLibLazily\n    …scribeOn(Schedulers.io())");
        return zVarO;
    }

    @Override // com.ubnt.teleport.unifi.stun.TeleportStun
    public z<TeleportStun.a> setupPeerConnection(String peerDescription) {
        AbstractC6492s.i(peerDescription, "peerDescription");
        AbstractC5912b abstractC5912b = this.loadNativeLibLazily;
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new p(peerDescription));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(abstractC5912b, abstractC5912bR);
        z zVarI = z.i(new q());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        final s sVar = s.f39621a;
        z zVarO = zVarI.o(new InterfaceC6469f() { // from class: L7.a
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                GoTeleportStun.setupPeerConnection$lambda$7(sVar, obj);
            }
        });
        final t tVar = t.f39623a;
        gg.i iVarK = zVarO.K(new kg.n() { // from class: L7.b
            @Override // kg.n
            public final Object apply(Object obj) {
                return GoTeleportStun.setupPeerConnection$lambda$8(tVar, obj);
            }
        });
        final u uVar = u.f39624a;
        z zVarQ = iVarK.m0(new kg.p() { // from class: L7.c
            @Override // kg.p
            public final boolean test(Object obj) {
                return GoTeleportStun.setupPeerConnection$lambda$9(uVar, obj);
            }
        }).o0().Q(GET_CONNECTION_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
        final v vVar = v.f39625a;
        z zVarA = zVarQ.A(new kg.n() { // from class: L7.d
            @Override // kg.n
            public final Object apply(Object obj) {
                return GoTeleportStun.setupPeerConnection$lambda$10(vVar, obj);
            }
        });
        final w wVar = w.f39626a;
        z zVarK = abstractC5912bP.k(zVarA.F(new kg.n() { // from class: L7.e
            @Override // kg.n
            public final Object apply(Object obj) {
                return GoTeleportStun.setupPeerConnection$lambda$11(wVar, obj);
            }
        }));
        final x xVar = new x();
        z zVarS = zVarK.s(new kg.n() { // from class: L7.f
            @Override // kg.n
            public final Object apply(Object obj) {
                return GoTeleportStun.setupPeerConnection$lambda$12(xVar, obj);
            }
        });
        final y yVar = y.f39629a;
        z<TeleportStun.a> zVarO2 = zVarS.o(new InterfaceC6469f() { // from class: L7.g
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                GoTeleportStun.setupPeerConnection$lambda$13(yVar, obj);
            }
        }).O(Gg.a.d());
        AbstractC6492s.h(zVarO2, "override fun setupPeerCo…scribeOn(Schedulers.io())");
        return zVarO2;
    }
}
