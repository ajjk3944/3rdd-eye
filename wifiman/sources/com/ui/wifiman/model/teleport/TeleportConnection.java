package com.ui.wifiman.model.teleport;

import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import gg.AbstractC5912b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface TeleportConnection {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "CancelledByUser", "NoVpnProfile", "NoSSOAccount", "NoMainConsole", "Cloud", "Tunnel", "ConsoleConnection", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$CancelledByUser;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Cloud;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$ConsoleConnection;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoSSOAccount;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoVpnProfile;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$CancelledByUser;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "LWc/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CancelledByUser extends Error implements Wc.d {

            /* renamed from: a, reason: collision with root package name */
            public static final CancelledByUser f43195a = new CancelledByUser();

            private CancelledByUser() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CancelledByUser);
            }

            public int hashCode() {
                return 1439901936;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "CancelledByUser";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Cloud;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "LWc/d;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "cause", "<init>", "(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Cloud extends Error implements Wc.d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TeleportCloud.Error cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Cloud(TeleportCloud.Error cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public TeleportCloud.Error getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cloud) && AbstractC6492s.d(this.cause, ((Cloud) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "Cloud(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$ConsoleConnection;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "LWc/d;", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;", "cause", "<init>", "(Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;", "()Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ConsoleConnection extends Error implements Wc.d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UnifiConsoleConnectionError cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConsoleConnection(UnifiConsoleConnectionError cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public UnifiConsoleConnectionError getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConsoleConnection) && AbstractC6492s.d(this.cause, ((ConsoleConnection) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "ConsoleConnection(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "LWc/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoMainConsole extends Error implements Wc.d {

            /* renamed from: a, reason: collision with root package name */
            public static final NoMainConsole f43198a = new NoMainConsole();

            private NoMainConsole() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoMainConsole);
            }

            public int hashCode() {
                return 1817564058;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "NoMainConsole";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoSSOAccount;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "LWc/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoSSOAccount extends Error implements Wc.d {

            /* renamed from: a, reason: collision with root package name */
            public static final NoSSOAccount f43199a = new NoSSOAccount();

            private NoSSOAccount() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoSSOAccount);
            }

            public int hashCode() {
                return -447839390;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "NoSSOAccount";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoVpnProfile;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "LWc/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoVpnProfile extends Error implements Wc.d {

            /* renamed from: a, reason: collision with root package name */
            public static final NoVpnProfile f43200a = new NoVpnProfile();

            private NoVpnProfile() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoVpnProfile);
            }

            public int hashCode() {
                return 1441454169;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "NoVpnProfile";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "LWc/d;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "cause", "<init>", "(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Tunnel extends Error implements Wc.d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UnifiTeleportTunnel.Error cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Tunnel(UnifiTeleportTunnel.Error cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public UnifiTeleportTunnel.Error getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Tunnel) && AbstractC6492s.d(this.cause, ((Tunnel) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "Tunnel(cause=" + this.cause + ")";
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static abstract class a {

        /* renamed from: com.ui.wifiman.model.teleport.TeleportConnection$a$a, reason: collision with other inner class name */
        public static final class C1439a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Error f43202a;

            /* renamed from: b, reason: collision with root package name */
            private final float f43203b;

            public C1439a(Error error) {
                super(null);
                this.f43202a = error;
            }

            @Override // com.ui.wifiman.model.teleport.TeleportConnection.a
            public float a() {
                return this.f43203b;
            }

            public final Error b() {
                return this.f43202a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1439a) && AbstractC6492s.d(this.f43202a, ((C1439a) obj).f43202a);
            }

            public int hashCode() {
                Error error = this.f43202a;
                if (error == null) {
                    return 0;
                }
                return error.hashCode();
            }

            public String toString() {
                return "Off(error=" + this.f43202a + ")";
            }
        }

        public static abstract class b extends a {

            /* renamed from: com.ui.wifiman.model.teleport.TeleportConnection$a$b$a, reason: collision with other inner class name */
            public static final class C1440a extends b {

                /* renamed from: a, reason: collision with root package name */
                private final H7.b f43204a;

                /* renamed from: b, reason: collision with root package name */
                private final float f43205b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1440a(H7.b statistics) {
                    super(null);
                    AbstractC6492s.i(statistics, "statistics");
                    this.f43204a = statistics;
                    this.f43205b = 1.0f;
                }

                @Override // com.ui.wifiman.model.teleport.TeleportConnection.a
                public float a() {
                    return this.f43205b;
                }

                public final H7.b b() {
                    return this.f43204a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1440a) && AbstractC6492s.d(this.f43204a, ((C1440a) obj).f43204a);
                }

                public int hashCode() {
                    return this.f43204a.hashCode();
                }

                public String toString() {
                    return "Connected(statistics=" + this.f43204a + ")";
                }
            }

            /* renamed from: com.ui.wifiman.model.teleport.TeleportConnection$a$b$b, reason: collision with other inner class name */
            public static abstract class AbstractC1441b extends b {

                /* renamed from: com.ui.wifiman.model.teleport.TeleportConnection$a$b$b$a, reason: collision with other inner class name */
                public static final class C1442a extends AbstractC1441b {

                    /* renamed from: a, reason: collision with root package name */
                    private final float f43206a;

                    public C1442a(float f10) {
                        super(null);
                        this.f43206a = f10;
                    }

                    @Override // com.ui.wifiman.model.teleport.TeleportConnection.a
                    public float a() {
                        return this.f43206a;
                    }

                    public final C1442a b(float f10) {
                        return new C1442a(f10);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1442a) && Float.compare(this.f43206a, ((C1442a) obj).f43206a) == 0;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.f43206a);
                    }

                    public String toString() {
                        return "Initialization(progress=" + this.f43206a + ")";
                    }

                    public /* synthetic */ C1442a(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i10 & 1) != 0 ? 0.1f : f10);
                    }
                }

                /* renamed from: com.ui.wifiman.model.teleport.TeleportConnection$a$b$b$b, reason: collision with other inner class name */
                public static final class C1443b extends AbstractC1441b {

                    /* renamed from: a, reason: collision with root package name */
                    private final float f43207a;

                    public C1443b(float f10) {
                        super(null);
                        this.f43207a = f10;
                    }

                    @Override // com.ui.wifiman.model.teleport.TeleportConnection.a
                    public float a() {
                        return this.f43207a;
                    }

                    public final C1443b b(float f10) {
                        return new C1443b(f10);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1443b) && Float.compare(this.f43207a, ((C1443b) obj).f43207a) == 0;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.f43207a);
                    }

                    public String toString() {
                        return "KeyExchange(progress=" + this.f43207a + ")";
                    }

                    public /* synthetic */ C1443b(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i10 & 1) != 0 ? 0.6f : f10);
                    }
                }

                /* renamed from: com.ui.wifiman.model.teleport.TeleportConnection$a$b$b$c */
                public static final class c extends AbstractC1441b {

                    /* renamed from: a, reason: collision with root package name */
                    private final float f43208a;

                    public c(float f10) {
                        super(null);
                        this.f43208a = f10;
                    }

                    @Override // com.ui.wifiman.model.teleport.TeleportConnection.a
                    public float a() {
                        return this.f43208a;
                    }

                    public final c b(float f10) {
                        return new c(f10);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof c) && Float.compare(this.f43208a, ((c) obj).f43208a) == 0;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.f43208a);
                    }

                    public String toString() {
                        return "TokenFetch(progress=" + this.f43208a + ")";
                    }

                    public /* synthetic */ c(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i10 & 1) != 0 ? 0.05f : f10);
                    }
                }

                /* renamed from: com.ui.wifiman.model.teleport.TeleportConnection$a$b$b$d */
                public static final class d extends AbstractC1441b {

                    /* renamed from: a, reason: collision with root package name */
                    private final float f43209a;

                    public d(float f10) {
                        super(null);
                        this.f43209a = f10;
                    }

                    @Override // com.ui.wifiman.model.teleport.TeleportConnection.a
                    public float a() {
                        return this.f43209a;
                    }

                    public final d b(float f10) {
                        return new d(f10);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof d) && Float.compare(this.f43209a, ((d) obj).f43209a) == 0;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.f43209a);
                    }

                    public String toString() {
                        return "TunnelActivation(progress=" + this.f43209a + ")";
                    }

                    public /* synthetic */ d(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i10 & 1) != 0 ? 0.95f : f10);
                    }
                }

                /* renamed from: com.ui.wifiman.model.teleport.TeleportConnection$a$b$b$e */
                public static final class e extends AbstractC1441b {

                    /* renamed from: a, reason: collision with root package name */
                    private final float f43210a;

                    public e(float f10) {
                        super(null);
                        this.f43210a = f10;
                    }

                    @Override // com.ui.wifiman.model.teleport.TeleportConnection.a
                    public float a() {
                        return this.f43210a;
                    }

                    public final e b(float f10) {
                        return new e(f10);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof e) && Float.compare(this.f43210a, ((e) obj).f43210a) == 0;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.f43210a);
                    }

                    public String toString() {
                        return "TunnelCreation(progress=" + this.f43210a + ")";
                    }

                    public /* synthetic */ e(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i10 & 1) != 0 ? 0.7f : f10);
                    }
                }

                public /* synthetic */ AbstractC1441b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private AbstractC1441b() {
                    super(null);
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract float a();

        private a() {
        }
    }

    AbstractC5912b connect();

    AbstractC5912b disconnect();

    gg.i getState();
}
