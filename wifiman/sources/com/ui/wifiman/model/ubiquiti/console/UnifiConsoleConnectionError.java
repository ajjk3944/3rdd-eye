package com.ui.wifiman.model.ubiquiti.console;

import Zg.AbstractC3682n;
import com.ui.unifi.core.base.net.client.MissingDataClientException;
import com.ui.unifi.core.base.net.client.UntrustedCertificateException;
import com.ui.unifi.core.base.net.client.http.InvalidNcaTokenException;
import com.ui.unifi.core.base.net.exceptions.ApiRequestException;
import com.ui.unifi.core.base.net.webrtc.WebRtcClientDisconnectedException;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import com.ui.unifi.core.sso.exceptions.TwoFaRequiredException;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;
import retrofit2.HttpException;
import zi.AbstractC8783m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00060\u0001j\u0002`\u0002:\u0005\u0006\u0007\b\t\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", SnmpConfigurator.O_AUTH_PROTOCOL, "IO", "RequestFailed", "Unauthorized", "UntrustedCertificate", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$Unauthorized;", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UnifiConsoleConnectionError extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IO extends UnifiConsoleConnectionError {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        public IO(Throwable th2) {
            super(null);
            this.cause = th2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IO) && AbstractC6492s.d(this.cause, ((IO) other).cause);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            Throwable th2 = this.cause;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IO(cause=" + this.cause + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequestFailed extends UnifiConsoleConnectionError {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        public /* synthetic */ RequestFailed(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : th2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestFailed)) {
                return false;
            }
            RequestFailed requestFailed = (RequestFailed) other;
            return AbstractC6492s.d(this.message, requestFailed.message) && AbstractC6492s.d(this.cause, requestFailed.cause);
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
            int iHashCode = this.message.hashCode() * 31;
            Throwable th2 = this.cause;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RequestFailed(message=" + this.message + ", cause=" + this.cause + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestFailed(String message, Throwable th2) {
            super(null);
            AbstractC6492s.i(message, "message");
            this.message = message;
            this.cause = th2;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$Unauthorized;", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unauthorized extends UnifiConsoleConnectionError {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unauthorized(String message, Throwable th2) {
            super(null);
            AbstractC6492s.i(message, "message");
            this.message = message;
            this.cause = th2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unauthorized)) {
                return false;
            }
            Unauthorized unauthorized = (Unauthorized) other;
            return AbstractC6492s.d(this.message, unauthorized.message) && AbstractC6492s.d(this.cause, unauthorized.cause);
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
            int iHashCode = this.message.hashCode() * 31;
            Throwable th2 = this.cause;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unauthorized(message=" + this.message + ", cause=" + this.cause + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;", "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;", "", "Ljava/security/cert/X509Certificate;", "certificates", "", "cause", "<init>", "(Ljava/util/Set;Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/util/Set;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Ljava/util/Set;", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UntrustedCertificate extends UnifiConsoleConnectionError {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set certificates;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UntrustedCertificate(Set certificates, Throwable th2) {
            super(null);
            AbstractC6492s.i(certificates, "certificates");
            this.certificates = certificates;
            this.cause = th2;
        }

        /* renamed from: a, reason: from getter */
        public final Set getCertificates() {
            return this.certificates;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UntrustedCertificate)) {
                return false;
            }
            UntrustedCertificate untrustedCertificate = (UntrustedCertificate) other;
            return AbstractC6492s.d(this.certificates, untrustedCertificate.certificates) && AbstractC6492s.d(this.cause, untrustedCertificate.cause);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            int iHashCode = this.certificates.hashCode() * 31;
            Throwable th2 = this.cause;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "UntrustedCertificate(certificates=" + this.certificates + ", cause=" + this.cause + ")";
        }
    }

    /* renamed from: com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final X509Certificate d(Certificate it) throws IO {
            AbstractC6492s.i(it, "it");
            try {
                return (X509Certificate) it;
            } catch (ClassCastException e10) {
                throw new IO(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final X509Certificate e(Certificate it) throws IO {
            AbstractC6492s.i(it, "it");
            try {
                return (X509Certificate) it;
            } catch (ClassCastException e10) {
                throw new IO(e10);
            }
        }

        public final UnifiConsoleConnectionError c(Throwable error) {
            Throwable cause;
            AbstractC6492s.i(error, "error");
            if (error instanceof UnifiConsoleConnectionError) {
                return (UnifiConsoleConnectionError) error;
            }
            RuntimeException runtimeException = error instanceof RuntimeException ? (RuntimeException) error : null;
            UnifiConsoleConnectionError unifiConsoleConnectionErrorC = (runtimeException == null || (cause = runtimeException.getCause()) == null) ? null : UnifiConsoleConnectionError.INSTANCE.c(cause);
            if (unifiConsoleConnectionErrorC != null) {
                return unifiConsoleConnectionErrorC;
            }
            if (error instanceof UntrustedCertificateException) {
                return new UntrustedCertificate(AbstractC8783m.b0(AbstractC8783m.N(AbstractC3682n.Q(((UntrustedCertificateException) error).getCertificates()), new InterfaceC6835l() { // from class: Qd.i
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return UnifiConsoleConnectionError.Companion.d((Certificate) obj);
                    }
                })), error);
            }
            if (error instanceof SSLException) {
                Throwable cause2 = error.getCause();
                if ((cause2 instanceof UntrustedCertificateException ? (UntrustedCertificateException) cause2 : null) != null) {
                    Throwable cause3 = error.getCause();
                    UntrustedCertificateException untrustedCertificateException = cause3 instanceof UntrustedCertificateException ? (UntrustedCertificateException) cause3 : null;
                    if (untrustedCertificateException != null) {
                        return new UntrustedCertificate(AbstractC8783m.b0(AbstractC8783m.N(AbstractC3682n.Q(untrustedCertificateException.getCertificates()), new InterfaceC6835l() { // from class: Qd.j
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return UnifiConsoleConnectionError.Companion.e((Certificate) obj);
                            }
                        })), untrustedCertificateException);
                    }
                    return null;
                }
                return new RequestFailed("Unknown SSL exception : " + error.getCause(), error);
            }
            if ((error instanceof InvalidNcaTokenException) || (error instanceof TwoFaRequiredException) || (error instanceof UnauthorisedException)) {
                String message = error.getMessage();
                if (message == null) {
                    message = "Unauthorized";
                }
                return new Unauthorized(message, error);
            }
            if ((error instanceof WebRtcClientDisconnectedException) || (error instanceof UnknownHostException) || (error instanceof ConnectException) || (error instanceof SocketTimeoutException) || (error instanceof HttpException)) {
                return new IO(error);
            }
            if ((error instanceof ApiRequestException) || (error instanceof MissingDataClientException) || (error instanceof TimeoutException)) {
                return new RequestFailed("Request timed out", error);
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UnifiConsoleConnectionError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UnifiConsoleConnectionError() {
    }
}
