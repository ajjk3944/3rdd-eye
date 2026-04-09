package com.ubnt.teleport.unifi;

import I7.C2997g;
import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import gg.AbstractC5912b;
import java.net.InetAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public interface UnifiTeleportTunnel extends TeleportTunnel, com.wireguard.android.backend.c {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "Lcom/ubnt/teleport/TeleportTunnel$Error;", "()V", "Cloud", "InterruptedByUser", "ReconnectionFailed", "Stun", "Wireguard", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Cloud;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$InterruptedByUser;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$ReconnectionFailed;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Stun;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Error extends TeleportTunnel.Error {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Cloud;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class Cloud extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Exception cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Cloud(Exception cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public Exception getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cloud) && AbstractC6492s.d(getCause(), ((Cloud) other).getCause());
            }

            public int hashCode() {
                return getCause().hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "Cloud(cause=" + getCause() + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$InterruptedByUser;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class InterruptedByUser extends Error {

            /* renamed from: a, reason: collision with root package name */
            public static final InterruptedByUser f39294a = new InterruptedByUser();

            private InterruptedByUser() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$ReconnectionFailed;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "cause", "<init>", "(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class ReconnectionFailed extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Error cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReconnectionFailed(Error cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public Error getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReconnectionFailed) && AbstractC6492s.d(getCause(), ((ReconnectionFailed) other).getCause());
            }

            public int hashCode() {
                return getCause().hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "ReconnectionFailed(cause=" + getCause() + ')';
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Stun;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class Stun extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Exception cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Stun(Exception cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public Exception getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Stun) && AbstractC6492s.d(getCause(), ((Stun) other).getCause());
            }

            public int hashCode() {
                return getCause().hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "Stun(cause=" + getCause() + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "()V", "Config", "Connection", "VPNUnauthorized", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Connection;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static abstract class Wireguard extends Error {

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "message", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Exception;", "()Ljava/lang/Exception;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class Config extends Wireguard {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final Exception cause;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final String message;

                public Config() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @Override // java.lang.Throwable
                /* renamed from: a, reason: from getter */
                public Exception getCause() {
                    return this.cause;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Config)) {
                        return false;
                    }
                    Config config = (Config) other;
                    return AbstractC6492s.d(getCause(), config.getCause()) && AbstractC6492s.d(getMessage(), config.getMessage());
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }

                public int hashCode() {
                    return ((getCause() == null ? 0 : getCause().hashCode()) * 31) + (getMessage() != null ? getMessage().hashCode() : 0);
                }

                @Override // java.lang.Throwable
                public String toString() {
                    return "Config(cause=" + getCause() + ", message=" + getMessage() + ')';
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public /* synthetic */ Config(Exception exc, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    exc = (i10 & 1) != 0 ? null : exc;
                    this(exc, (i10 & 2) != 0 ? exc != null ? exc.getMessage() : null : str);
                }

                public Config(Exception exc, String str) {
                    super(null);
                    this.cause = exc;
                    this.message = str;
                }
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Connection;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "message", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Exception;", "()Ljava/lang/Exception;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class Connection extends Wireguard {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final Exception cause;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Connection(Exception cause, String str) {
                    super(null);
                    AbstractC6492s.i(cause, "cause");
                    this.cause = cause;
                    this.message = str;
                }

                @Override // java.lang.Throwable
                /* renamed from: a, reason: from getter */
                public Exception getCause() {
                    return this.cause;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Connection)) {
                        return false;
                    }
                    Connection connection = (Connection) other;
                    return AbstractC6492s.d(getCause(), connection.getCause()) && AbstractC6492s.d(getMessage(), connection.getMessage());
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }

                public int hashCode() {
                    return (getCause().hashCode() * 31) + (getMessage() == null ? 0 : getMessage().hashCode());
                }

                @Override // java.lang.Throwable
                public String toString() {
                    return "Connection(cause=" + getCause() + ", message=" + getMessage() + ')';
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class VPNUnauthorized extends Wireguard {

                /* renamed from: a, reason: collision with root package name */
                public static final VPNUnauthorized f39301a = new VPNUnauthorized();

                private VPNUnauthorized() {
                    super(null);
                }
            }

            public /* synthetic */ Wireguard(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Wireguard() {
                super(null);
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a implements TeleportTunnel.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f39302a;

        /* renamed from: b, reason: collision with root package name */
        private final TeleportCloud.e.a f39303b;

        public /* synthetic */ a(String str, TeleportCloud.e.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, aVar);
        }

        public final TeleportCloud.e.a a() {
            return this.f39303b;
        }

        public String b() {
            return this.f39302a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!AbstractC6492s.d(a.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ubnt.teleport.unifi.UnifiTeleportTunnel.Configuration");
            a aVar = (a) obj;
            return TeleportTunnel.d.d(b(), aVar.b()) && AbstractC6492s.d(this.f39303b, aVar.f39303b);
        }

        public int hashCode() {
            return TeleportTunnel.d.e(b());
        }

        public String toString() {
            return "TeleportTunnel[" + ((Object) TeleportTunnel.d.f(b())) + ']';
        }

        private a(String str, TeleportCloud.e.a aVar) {
            this.f39302a = str;
            this.f39303b = aVar;
        }
    }

    public static final class b implements TeleportTunnel.b {

        /* renamed from: a, reason: collision with root package name */
        private final a f39304a;

        /* renamed from: b, reason: collision with root package name */
        private final int f39305b;

        public static abstract class a {

            /* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnel$b$a$a, reason: collision with other inner class name */
            public static final class C1245a extends a {

                /* renamed from: a, reason: collision with root package name */
                private final int f39306a;

                /* renamed from: b, reason: collision with root package name */
                private final long f39307b;

                public C1245a(int i10, long j10) {
                    super(null);
                    this.f39306a = i10;
                    this.f39307b = j10;
                }

                public final long a() {
                    return this.f39307b;
                }

                public final int b() {
                    return this.f39306a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1245a)) {
                        return false;
                    }
                    C1245a c1245a = (C1245a) obj;
                    return this.f39306a == c1245a.f39306a && this.f39307b == c1245a.f39307b;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.f39306a) * 31) + Long.hashCode(this.f39307b);
                }

                public String toString() {
                    return "Enabled(tryCount=" + this.f39306a + ", retryDelayMillis=" + this.f39307b + ')';
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(a reconnect, int i10) {
            AbstractC6492s.i(reconnect, "reconnect");
            this.f39304a = reconnect;
            this.f39305b = i10;
        }

        public int a() {
            return this.f39305b;
        }

        public final a b() {
            return this.f39304a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f39304a, bVar.f39304a) && a() == bVar.a();
        }

        public int hashCode() {
            return (this.f39304a.hashCode() * 31) + Integer.hashCode(a());
        }

        public String toString() {
            return "ConnectionParams(reconnect=" + this.f39304a + ", mtu=" + a() + ')';
        }
    }

    public static final class c {
        public static AbstractC5912b a(UnifiTeleportTunnel unifiTeleportTunnel, int i10, b.a reconnect) {
            AbstractC6492s.i(reconnect, "reconnect");
            return unifiTeleportTunnel.b(new b(reconnect, i10));
        }

        public static /* synthetic */ AbstractC5912b b(UnifiTeleportTunnel unifiTeleportTunnel, int i10, b.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: open");
            }
            if ((i11 & 1) != 0) {
                i10 = C2997g.f8908a.c().a();
            }
            if ((i11 & 2) != 0) {
                aVar = C2997g.f8908a.c().b();
            }
            return unifiTeleportTunnel.a(i10, aVar);
        }
    }

    public static abstract class d {

        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            private final f f39308a;

            /* renamed from: b, reason: collision with root package name */
            private final e f39309b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f tunnelConfiguration, e statistics) {
                super(null);
                AbstractC6492s.i(tunnelConfiguration, "tunnelConfiguration");
                AbstractC6492s.i(statistics, "statistics");
                this.f39308a = tunnelConfiguration;
                this.f39309b = statistics;
            }

            public e a() {
                return this.f39309b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC6492s.d(this.f39308a, aVar.f39308a) && AbstractC6492s.d(a(), aVar.a());
            }

            public int hashCode() {
                return (this.f39308a.hashCode() * 31) + a().hashCode();
            }

            @Override // com.ubnt.teleport.unifi.UnifiTeleportTunnel.d
            public String toString() {
                return super.toString();
            }
        }

        public static abstract class b extends d {

            public static final class a extends b {

                /* renamed from: a, reason: collision with root package name */
                private final f f39310a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(f tunnelConfig) {
                    super(null);
                    AbstractC6492s.i(tunnelConfig, "tunnelConfig");
                    this.f39310a = tunnelConfig;
                }

                public f a() {
                    return this.f39310a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && AbstractC6492s.d(a(), ((a) obj).a());
                }

                public int hashCode() {
                    return a().hashCode();
                }

                @Override // com.ubnt.teleport.unifi.UnifiTeleportTunnel.d
                public String toString() {
                    return "ActiveConnection(tunnelConfig=" + a() + ')';
                }
            }

            /* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnel$d$b$b, reason: collision with other inner class name */
            public static final class C1246b extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final C1246b f39311a = new C1246b();

                private C1246b() {
                    super(null);
                }
            }

            public static final class c extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final c f39312a = new c();

                private c() {
                    super(null);
                }
            }

            /* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnel$d$b$d, reason: collision with other inner class name */
            public static final class C1247d extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final C1247d f39313a = new C1247d();

                private C1247d() {
                    super(null);
                }
            }

            public static final class e extends b {

                /* renamed from: a, reason: collision with root package name */
                private final f f39314a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(f tunnelConfig) {
                    super(null);
                    AbstractC6492s.i(tunnelConfig, "tunnelConfig");
                    this.f39314a = tunnelConfig;
                }

                public f a() {
                    return this.f39314a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && AbstractC6492s.d(a(), ((e) obj).a());
                }

                public int hashCode() {
                    return a().hashCode();
                }

                @Override // com.ubnt.teleport.unifi.UnifiTeleportTunnel.d
                public String toString() {
                    return "TunnelCreation(tunnelConfig=" + a() + ')';
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super(null);
            }
        }

        public static abstract class c extends d {

            public static final class a extends c {

                /* renamed from: a, reason: collision with root package name */
                private final Error f39315a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Error error) {
                    super(null);
                    AbstractC6492s.i(error, "error");
                    this.f39315a = error;
                }

                public final Error a() {
                    return this.f39315a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && AbstractC6492s.d(this.f39315a, ((a) obj).f39315a);
                }

                public int hashCode() {
                    return this.f39315a.hashCode();
                }

                @Override // com.ubnt.teleport.unifi.UnifiTeleportTunnel.d
                public String toString() {
                    return "Error(error=" + this.f39315a + ')';
                }
            }

            public static final class b extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final b f39316a = new b();

                private b() {
                    super(null);
                }
            }

            /* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnel$d$c$c, reason: collision with other inner class name */
            public static final class C1248c extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final C1248c f39317a = new C1248c();

                private C1248c() {
                    super(null);
                }
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private c() {
                super(null);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public String toString() {
            if (this instanceof c.b) {
                return "DISCONNECTED";
            }
            if (this instanceof c.C1248c) {
                return "DISCONNECTED (reconnecting)";
            }
            if (this instanceof c.a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DISCONNECTED (error: ");
                Throwable cause = ((c.a) this).a().getCause();
                sb2.append(cause != null ? cause.getMessage() : null);
                sb2.append(')');
                return sb2.toString();
            }
            if (this instanceof b.c) {
                return "CONNECTING (initialization)";
            }
            if (this instanceof b.C1247d) {
                return "CONNECTING (peer description)";
            }
            if (this instanceof b.C1246b) {
                return "CONNECTING (handshake)";
            }
            if (this instanceof b.e) {
                return "CONNECTING (tunnel creation)";
            }
            if (this instanceof b.a) {
                return "CONNECTING (connection activation)";
            }
            if (!(this instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("CONNECTED since ");
            a aVar = (a) this;
            sb3.append(aVar.a().d());
            sb3.append(" RX:");
            sb3.append(aVar.a().g());
            sb3.append(" TX:");
            sb3.append(aVar.a().h());
            return sb3.toString();
        }

        private d() {
        }
    }

    public static final class e implements H7.b {

        /* renamed from: a, reason: collision with root package name */
        private final long f39318a;

        /* renamed from: b, reason: collision with root package name */
        private final long f39319b;

        /* renamed from: c, reason: collision with root package name */
        private final long f39320c;

        /* renamed from: d, reason: collision with root package name */
        private final long f39321d;

        /* renamed from: e, reason: collision with root package name */
        private final long f39322e;

        /* renamed from: f, reason: collision with root package name */
        private final long f39323f;

        /* renamed from: g, reason: collision with root package name */
        private final long f39324g;

        /* renamed from: h, reason: collision with root package name */
        private final long f39325h;

        public e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
            this.f39318a = j10;
            this.f39319b = j11;
            this.f39320c = j12;
            this.f39321d = j13;
            this.f39322e = j14;
            this.f39323f = j15;
            this.f39324g = j16;
            this.f39325h = j17;
        }

        @Override // H7.b
        public long a() {
            return this.f39325h;
        }

        @Override // H7.b
        public long b() {
            return this.f39319b;
        }

        @Override // H7.b
        public long c() {
            return this.f39324g;
        }

        public long d() {
            return this.f39318a;
        }

        public long e() {
            return this.f39320c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return d() == eVar.d() && b() == eVar.b() && e() == eVar.e() && f() == eVar.f() && g() == eVar.g() && h() == eVar.h() && c() == eVar.c() && a() == eVar.a();
        }

        public long f() {
            return this.f39321d;
        }

        public long g() {
            return this.f39322e;
        }

        public long h() {
            return this.f39323f;
        }

        public int hashCode() {
            return (((((((((((((Long.hashCode(d()) * 31) + Long.hashCode(b())) * 31) + Long.hashCode(e())) * 31) + Long.hashCode(f())) * 31) + Long.hashCode(g())) * 31) + Long.hashCode(h())) * 31) + Long.hashCode(c())) * 31) + Long.hashCode(a());
        }

        public String toString() {
            return "Statistics(activatedAt=" + d() + ", connectedAt=" + b() + ", connectionDurationTotal=" + e() + ", disconnectionDurationTotal=" + f() + ", rxBytes=" + g() + ", txBytes=" + h() + ", rxThroughput=" + c() + ", txThroughput=" + a() + ')';
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f39326a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39327b;

        /* renamed from: c, reason: collision with root package name */
        private final int f39328c;

        /* renamed from: d, reason: collision with root package name */
        private final String f39329d;

        /* renamed from: e, reason: collision with root package name */
        private final int f39330e;

        /* renamed from: f, reason: collision with root package name */
        private final InetAddress f39331f;

        /* renamed from: g, reason: collision with root package name */
        private final InetAddress f39332g;

        /* renamed from: h, reason: collision with root package name */
        private final int f39333h;

        /* renamed from: i, reason: collision with root package name */
        private final List f39334i;

        public f(int i10, String listenIP, int i11, String peerIP, int i12, InetAddress remoteIP, InetAddress udpEchoIP, int i13, List dns) {
            AbstractC6492s.i(listenIP, "listenIP");
            AbstractC6492s.i(peerIP, "peerIP");
            AbstractC6492s.i(remoteIP, "remoteIP");
            AbstractC6492s.i(udpEchoIP, "udpEchoIP");
            AbstractC6492s.i(dns, "dns");
            this.f39326a = i10;
            this.f39327b = listenIP;
            this.f39328c = i11;
            this.f39329d = peerIP;
            this.f39330e = i12;
            this.f39331f = remoteIP;
            this.f39332g = udpEchoIP;
            this.f39333h = i13;
            this.f39334i = dns;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f39326a == fVar.f39326a && AbstractC6492s.d(this.f39327b, fVar.f39327b) && this.f39328c == fVar.f39328c && AbstractC6492s.d(this.f39329d, fVar.f39329d) && this.f39330e == fVar.f39330e && AbstractC6492s.d(this.f39331f, fVar.f39331f) && AbstractC6492s.d(this.f39332g, fVar.f39332g) && this.f39333h == fVar.f39333h && AbstractC6492s.d(this.f39334i, fVar.f39334i);
        }

        public int hashCode() {
            return (((((((((((((((Integer.hashCode(this.f39326a) * 31) + this.f39327b.hashCode()) * 31) + Integer.hashCode(this.f39328c)) * 31) + this.f39329d.hashCode()) * 31) + Integer.hashCode(this.f39330e)) * 31) + this.f39331f.hashCode()) * 31) + this.f39332g.hashCode()) * 31) + Integer.hashCode(this.f39333h)) * 31) + this.f39334i.hashCode();
        }

        public String toString() {
            return "TunnelConfiguration(mtu=" + this.f39326a + ", listenIP=" + this.f39327b + ", listenPort=" + this.f39328c + ", peerIP=" + this.f39329d + ", peerPort=" + this.f39330e + ", remoteIP=" + this.f39331f + ", udpEchoIP=" + this.f39332g + ", udpEchoNetmask=" + this.f39333h + ", dns=" + this.f39334i + ')';
        }
    }

    AbstractC5912b a(int i10, b.a aVar);

    a getConfig();
}
