package com.ui.wifiman.model.teleport.invitation;

import Wc.d;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.ubiquiti.console.e;
import gg.AbstractC5912b;
import gg.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface TeleportInvitationProcessor {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "NetworkUnreachableError", "TokenAlreadyAdded", "TokenProbablyUsed", "TunnelCreationFailed", "CloudError", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$CloudError;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$NetworkUnreachableError;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TokenAlreadyAdded;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TokenProbablyUsed;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TunnelCreationFailed;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements d {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$CloudError;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "cause", "<init>", "(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CloudError extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final TeleportCloud.Error cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CloudError(TeleportCloud.Error cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public TeleportCloud.Error getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$NetworkUnreachableError;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;", "", "siteName", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getSiteName", "()Ljava/lang/String;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NetworkUnreachableError extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String siteName;

            public NetworkUnreachableError(String str) {
                super(null);
                this.siteName = str;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TokenAlreadyAdded;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;", "tunnel", "<init>", "(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;", "getTunnel", "()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TokenAlreadyAdded extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final UnifiTeleportTunnel tunnel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenAlreadyAdded(UnifiTeleportTunnel tunnel) {
                super(null);
                AbstractC6492s.i(tunnel, "tunnel");
                this.tunnel = tunnel;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TokenProbablyUsed;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;", "<init>", "()V", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TokenProbablyUsed extends Error {
            public TokenProbablyUsed() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TunnelCreationFailed;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;", "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "cause", "<init>", "(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TunnelCreationFailed extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final TeleportConnection.Error cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TunnelCreationFailed(TeleportConnection.Error cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public TeleportConnection.Error getCause() {
                return this.cause;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static abstract class a {

        /* renamed from: com.ui.wifiman.model.teleport.invitation.TeleportInvitationProcessor$a$a, reason: collision with other inner class name */
        public static final class C1453a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Error f43329a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1453a(Error cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.f43329a = cause;
            }

            public final Error a() {
                return this.f43329a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1453a) && AbstractC6492s.d(this.f43329a, ((C1453a) obj).f43329a);
            }

            public int hashCode() {
                return this.f43329a.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.f43329a + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f43330a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1993173059;
            }

            public String toString() {
                return "InProgress";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final TeleportCloud.b f43331a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(TeleportCloud.b siteState) {
                super(null);
                AbstractC6492s.i(siteState, "siteState");
                this.f43331a = siteState;
            }

            public final TeleportCloud.b a() {
                return this.f43331a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC6492s.d(this.f43331a, ((c) obj).f43331a);
            }

            public int hashCode() {
                return this.f43331a.hashCode();
            }

            public String toString() {
                return "Success(siteState=" + this.f43331a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Error f43332a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Error cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.f43332a = cause;
            }

            public final Error a() {
                return this.f43332a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f43332a, ((a) obj).f43332a);
            }

            public int hashCode() {
                return this.f43332a.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.f43332a + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.teleport.invitation.TeleportInvitationProcessor$b$b, reason: collision with other inner class name */
        public static final class C1454b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1454b f43333a = new C1454b();

            private C1454b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1454b);
            }

            public int hashCode() {
                return 1537239214;
            }

            public String toString() {
                return "Idle";
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f43334a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -2127176756;
            }

            public String toString() {
                return "InProgress";
            }
        }

        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f43335a;

            public /* synthetic */ d(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && e.b.h(this.f43335a, ((d) obj).f43335a);
            }

            public int hashCode() {
                return e.b.j(this.f43335a);
            }

            public String toString() {
                return "Success(tunnelId=" + e.b.l(this.f43335a) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private d(String tunnelId) {
                super(null);
                AbstractC6492s.i(tunnelId, "tunnelId");
                this.f43335a = tunnelId;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    AbstractC5912b a();

    i b();

    i c();
}
