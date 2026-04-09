package com.ubnt.teleport.unifi.cloud;

import gg.z;
import java.io.IOException;
import java.net.InetAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public interface TeleportCloud {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "Ljava/io/IOException;", "()V", "ApiError", "CloudError", "CommunicationError", "InvalidResponse", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Error extends IOException {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "", "httpCode", "", "message", "<init>", "(ILjava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "I", "()I", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class ApiError extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int httpCode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public /* synthetic */ ApiError(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, (i11 & 2) != 0 ? null : str);
            }

            /* renamed from: a, reason: from getter */
            public final int getHttpCode() {
                return this.httpCode;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public ApiError(int i10, String str) {
                super(null);
                this.httpCode = i10;
                if (str == null) {
                    str = "API response " + i10 + " with no message";
                }
                this.message = str;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "()V", "ClientInvalid", "SiteGatewayNotFound", "TeleportDisabled", "Unauthenticated", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$ClientInvalid;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$TeleportDisabled;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static abstract class CloudError extends Error {

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$ClientInvalid;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;", "<init>", "()V", "", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class ClientInvalid extends CloudError {

                /* renamed from: a, reason: collision with root package name */
                public static final ClientInvalid f39450a = new ClientInvalid();

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private static final String message = "Teleport client was not registered on server";

                private ClientInvalid() {
                    super(null);
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return message;
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;", "<init>", "()V", "", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class SiteGatewayNotFound extends CloudError {

                /* renamed from: a, reason: collision with root package name */
                public static final SiteGatewayNotFound f39452a = new SiteGatewayNotFound();

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private static final String message = "Cloud has not connection to site gateway";

                private SiteGatewayNotFound() {
                    super(null);
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return message;
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$TeleportDisabled;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;", "<init>", "()V", "", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class TeleportDisabled extends CloudError {

                /* renamed from: a, reason: collision with root package name */
                public static final TeleportDisabled f39454a = new TeleportDisabled();

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private static final String message = "Teleport is disabled on remote site";

                private TeleportDisabled() {
                    super(null);
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return message;
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;", "<init>", "()V", "", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class Unauthenticated extends CloudError {

                /* renamed from: a, reason: collision with root package name */
                public static final Unauthenticated f39456a = new Unauthenticated();

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private static final String message = "Invalid Teleport token";

                private Unauthenticated() {
                    super(null);
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return message;
                }
            }

            public /* synthetic */ CloudError(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private CloudError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0019\b\u0004\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Ljava/lang/Exception;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "", "getMessage", "()Ljava/lang/String;", "message", "NetworkError", "ResponseTimeout", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$NetworkError;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static abstract class CommunicationError extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Exception cause;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$NetworkError;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;", "Ljava/io/IOException;", "cause", "<init>", "(Ljava/io/IOException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/io/IOException;", SnmpConfigurator.O_COMMUNITY, "()Ljava/io/IOException;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class NetworkError extends CommunicationError {

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final IOException cause;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NetworkError(IOException cause) {
                    super(cause, null);
                    AbstractC6492s.i(cause, "cause");
                    this.cause = cause;
                }

                @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud.Error.CommunicationError, java.lang.Throwable
                /* renamed from: c, reason: from getter */
                public IOException getCause() {
                    return this.cause;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof NetworkError) && AbstractC6492s.d(getCause(), ((NetworkError) other).getCause());
                }

                public int hashCode() {
                    return getCause().hashCode();
                }

                @Override // java.lang.Throwable
                public String toString() {
                    return "NetworkError(cause=" + getCause() + ')';
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class ResponseTimeout extends CommunicationError {

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final String message;

                public ResponseTimeout(String str) {
                    super(null, 0 == true ? 1 : 0);
                    this.message = str;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ResponseTimeout) && AbstractC6492s.d(getMessage(), ((ResponseTimeout) other).getMessage());
                }

                @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud.Error.CommunicationError, java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }

                public int hashCode() {
                    if (getMessage() == null) {
                        return 0;
                    }
                    return getMessage().hashCode();
                }

                @Override // java.lang.Throwable
                public String toString() {
                    return "ResponseTimeout(message=" + getMessage() + ')';
                }
            }

            public /* synthetic */ CommunicationError(Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
                this(exc);
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public Exception getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                String message;
                Exception cause = getCause();
                return (cause == null || (message = cause.getMessage()) == null) ? super.getMessage() : message;
            }

            private CommunicationError(Exception exc) {
                super(null);
                this.cause = exc;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class InvalidResponse extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public /* synthetic */ InvalidResponse(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidResponse)) {
                    return false;
                }
                InvalidResponse invalidResponse = (InvalidResponse) other;
                return AbstractC6492s.d(getMessage(), invalidResponse.getMessage()) && AbstractC6492s.d(getCause(), invalidResponse.getCause());
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return ((getMessage() == null ? 0 : getMessage().hashCode()) * 31) + (getCause() != null ? getCause().hashCode() : 0);
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "InvalidResponse(message=" + getMessage() + ", cause=" + getCause() + ')';
            }

            public InvalidResponse(String str, Throwable th2) {
                super(null);
                this.message = str;
                this.cause = th2;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InetAddress f39463a;

        /* renamed from: b, reason: collision with root package name */
        private final List f39464b;

        /* renamed from: c, reason: collision with root package name */
        private final d f39465c;

        /* renamed from: d, reason: collision with root package name */
        private final InetAddress f39466d;

        /* renamed from: e, reason: collision with root package name */
        private final int f39467e;

        /* renamed from: f, reason: collision with root package name */
        private final InetAddress f39468f;

        /* renamed from: g, reason: collision with root package name */
        private final int f39469g;

        public a(InetAddress remotePeerIp, List dnsServers, d remotePeer, InetAddress udpEchoAddress, int i10, InetAddress remoteUdpEchoAddress, int i11) {
            AbstractC6492s.i(remotePeerIp, "remotePeerIp");
            AbstractC6492s.i(dnsServers, "dnsServers");
            AbstractC6492s.i(remotePeer, "remotePeer");
            AbstractC6492s.i(udpEchoAddress, "udpEchoAddress");
            AbstractC6492s.i(remoteUdpEchoAddress, "remoteUdpEchoAddress");
            this.f39463a = remotePeerIp;
            this.f39464b = dnsServers;
            this.f39465c = remotePeer;
            this.f39466d = udpEchoAddress;
            this.f39467e = i10;
            this.f39468f = remoteUdpEchoAddress;
            this.f39469g = i11;
        }

        public final List a() {
            return this.f39464b;
        }

        public final d b() {
            return this.f39465c;
        }

        public final InetAddress c() {
            return this.f39463a;
        }

        public final InetAddress d() {
            return this.f39468f;
        }

        public final int e() {
            return this.f39469g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f39463a, aVar.f39463a) && AbstractC6492s.d(this.f39464b, aVar.f39464b) && AbstractC6492s.d(this.f39465c, aVar.f39465c) && AbstractC6492s.d(this.f39466d, aVar.f39466d) && this.f39467e == aVar.f39467e && AbstractC6492s.d(this.f39468f, aVar.f39468f) && this.f39469g == aVar.f39469g;
        }

        public final InetAddress f() {
            return this.f39466d;
        }

        public final int g() {
            return this.f39467e;
        }

        public int hashCode() {
            return (((((((((((this.f39463a.hashCode() * 31) + this.f39464b.hashCode()) * 31) + this.f39465c.hashCode()) * 31) + this.f39466d.hashCode()) * 31) + Integer.hashCode(this.f39467e)) * 31) + this.f39468f.hashCode()) * 31) + Integer.hashCode(this.f39469g);
        }

        public String toString() {
            return "ConnectionInfo(remotePeerIp=" + this.f39463a + ", dnsServers=" + this.f39464b + ", remotePeer=" + this.f39465c + ", udpEchoAddress=" + this.f39466d + ", udpEchoPort=" + this.f39467e + ", remoteUdpEchoAddress=" + this.f39468f + ", remoteUdpEchoMask=" + this.f39469g + ')';
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f39470a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39471b;

        /* renamed from: c, reason: collision with root package name */
        private final String f39472c;

        /* renamed from: d, reason: collision with root package name */
        private final String f39473d;

        /* renamed from: e, reason: collision with root package name */
        private final String f39474e;

        /* renamed from: f, reason: collision with root package name */
        private final Integer f39475f;

        /* renamed from: g, reason: collision with root package name */
        private final String f39476g;

        /* renamed from: h, reason: collision with root package name */
        private final EnumC1254b f39477h;

        /* renamed from: i, reason: collision with root package name */
        private final a f39478i;

        /* renamed from: j, reason: collision with root package name */
        private final String f39479j;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final double f39480a;

            /* renamed from: b, reason: collision with root package name */
            private final double f39481b;

            public a(double d10, double d11) {
                this.f39480a = d10;
                this.f39481b = d11;
            }

            public final double a() {
                return this.f39480a;
            }

            public final double b() {
                return this.f39481b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Double.compare(this.f39480a, aVar.f39480a) == 0 && Double.compare(this.f39481b, aVar.f39481b) == 0;
            }

            public int hashCode() {
                return (Double.hashCode(this.f39480a) * 31) + Double.hashCode(this.f39481b);
            }

            public String toString() {
                return "Location(latitude=" + this.f39480a + ", longitude=" + this.f39481b + ')';
            }
        }

        /* renamed from: com.ubnt.teleport.unifi.cloud.TeleportCloud$b$b, reason: collision with other inner class name */
        public enum EnumC1254b {
            CONNECTED,
            UNSTABLE,
            DISCONNECTED
        }

        public b(String str, String str2, String str3, String str4, String str5, Integer num, String str6, EnumC1254b enumC1254b, a aVar, String str7) {
            this.f39470a = str;
            this.f39471b = str2;
            this.f39472c = str3;
            this.f39473d = str4;
            this.f39474e = str5;
            this.f39475f = num;
            this.f39476g = str6;
            this.f39477h = enumC1254b;
            this.f39478i = aVar;
            this.f39479j = str7;
        }

        public final String a() {
            return this.f39470a;
        }

        public final String b() {
            return this.f39476g;
        }

        public final Integer c() {
            return this.f39475f;
        }

        public final String d() {
            return this.f39474e;
        }

        public final EnumC1254b e() {
            return this.f39477h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f39470a, bVar.f39470a) && AbstractC6492s.d(this.f39471b, bVar.f39471b) && AbstractC6492s.d(this.f39472c, bVar.f39472c) && AbstractC6492s.d(this.f39473d, bVar.f39473d) && AbstractC6492s.d(this.f39474e, bVar.f39474e) && AbstractC6492s.d(this.f39475f, bVar.f39475f) && AbstractC6492s.d(this.f39476g, bVar.f39476g) && this.f39477h == bVar.f39477h && AbstractC6492s.d(this.f39478i, bVar.f39478i) && AbstractC6492s.d(this.f39479j, bVar.f39479j);
        }

        public final a f() {
            return this.f39478i;
        }

        public final String g() {
            return this.f39479j;
        }

        public final String h() {
            return this.f39471b;
        }

        public int hashCode() {
            String str = this.f39470a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f39471b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f39472c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f39473d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f39474e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.f39475f;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            String str6 = this.f39476g;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            EnumC1254b enumC1254b = this.f39477h;
            int iHashCode8 = (iHashCode7 + (enumC1254b == null ? 0 : enumC1254b.hashCode())) * 31;
            a aVar = this.f39478i;
            int iHashCode9 = (iHashCode8 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str7 = this.f39479j;
            return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String i() {
            return this.f39472c;
        }

        public final String j() {
            return this.f39473d;
        }

        public String toString() {
            return "EndpointState(deviceId=" + this.f39470a + ", siteName=" + this.f39471b + ", siteNetworkName=" + this.f39472c + ", siteWanIp=" + this.f39473d + ", imageResourceId=" + this.f39474e + ", imageResourceEngineId=" + this.f39475f + ", gatewayProductSku=" + this.f39476g + ", siteConnection=" + this.f39477h + ", siteLocation=" + this.f39478i + ", siteLocationText=" + this.f39479j + ')';
        }
    }

    public interface c {
        z a();

        z b(e eVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f39482a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39483b;

        /* renamed from: c, reason: collision with root package name */
        private final String f39484c;

        public d(String encryptionPublicKey, String peerDescription, String str) {
            AbstractC6492s.i(encryptionPublicKey, "encryptionPublicKey");
            AbstractC6492s.i(peerDescription, "peerDescription");
            this.f39482a = encryptionPublicKey;
            this.f39483b = peerDescription;
            this.f39484c = str;
        }

        public final String a() {
            return this.f39482a;
        }

        public final String b() {
            return this.f39483b;
        }

        public final String c() {
            return this.f39484c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f39482a, dVar.f39482a) && AbstractC6492s.d(this.f39483b, dVar.f39483b) && AbstractC6492s.d(this.f39484c, dVar.f39484c);
        }

        public int hashCode() {
            int iHashCode = ((this.f39482a.hashCode() * 31) + this.f39483b.hashCode()) * 31;
            String str = this.f39484c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PeerInfo(encryptionPublicKey=" + this.f39482a + ", peerDescription=" + this.f39483b + ", stunSessionSecret=" + this.f39484c + ')';
        }
    }

    public static abstract class e {

        public static final class a extends e {

            /* renamed from: a, reason: collision with root package name */
            private final String f39485a;

            /* renamed from: b, reason: collision with root package name */
            private final String f39486b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String secret, String token) {
                super(null);
                AbstractC6492s.i(secret, "secret");
                AbstractC6492s.i(token, "token");
                this.f39485a = secret;
                this.f39486b = token;
            }

            @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud.e
            public String a() {
                return this.f39485a;
            }

            public final String b() {
                return this.f39486b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC6492s.d(a(), aVar.a()) && AbstractC6492s.d(this.f39486b, aVar.f39486b);
            }

            public int hashCode() {
                return (a().hashCode() * 31) + this.f39486b.hashCode();
            }

            public String toString() {
                return "LongTerm(secret=" + a() + ", token=" + this.f39486b + ')';
            }
        }

        public static final class b extends e {

            /* renamed from: a, reason: collision with root package name */
            private final String f39487a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String secret) {
                super(null);
                AbstractC6492s.i(secret, "secret");
                this.f39487a = secret;
            }

            @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud.e
            public String a() {
                return this.f39487a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(a(), ((b) obj).a());
            }

            public int hashCode() {
                return a().hashCode();
            }

            public String toString() {
                return "PublicSecret(secret=" + a() + ')';
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String a();

        private e() {
        }
    }

    public interface f {
        z a(d dVar);

        z c();

        z d();

        e.a f();
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final String f39488a;

        public g(String config) {
            AbstractC6492s.i(config, "config");
            this.f39488a = config;
        }

        public final String a() {
            return this.f39488a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && AbstractC6492s.d(this.f39488a, ((g) obj).f39488a);
        }

        public int hashCode() {
            return this.f39488a.hashCode();
        }

        public String toString() {
            return "WebRTCIceConfig(config=" + this.f39488a + ')';
        }
    }

    z b(e eVar);

    z e(e.b bVar, String str, String str2);
}
