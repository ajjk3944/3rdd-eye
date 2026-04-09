package com.ubnt.teleport.unifi.stun;

import gg.AbstractC5912b;
import gg.z;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public interface TeleportStun {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "InvalidLibOutput", "ResponseTimeout", "StunError", "Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;", "Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$ResponseTimeout;", "Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$StunError;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Error extends Exception {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;", "Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class InvalidLibOutput extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidLibOutput(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvalidLibOutput) && AbstractC6492s.d(getMessage(), ((InvalidLibOutput) other).getMessage());
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return getMessage().hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "InvalidLibOutput(message=" + getMessage() + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$ResponseTimeout;", "Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class ResponseTimeout extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResponseTimeout(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResponseTimeout) && AbstractC6492s.d(getMessage(), ((ResponseTimeout) other).getMessage());
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return getMessage().hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "ResponseTimeout(message=" + getMessage() + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$StunError;", "Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class StunError extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StunError(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StunError) && AbstractC6492s.d(getMessage(), ((StunError) other).getMessage());
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return getMessage().hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "StunError(message=" + getMessage() + ')';
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
        private final String f39634a;

        /* renamed from: b, reason: collision with root package name */
        private final int f39635b;

        /* renamed from: c, reason: collision with root package name */
        private final String f39636c;

        /* renamed from: d, reason: collision with root package name */
        private final int f39637d;

        public a(String localIP, int i10, String remoteIP, int i11) {
            AbstractC6492s.i(localIP, "localIP");
            AbstractC6492s.i(remoteIP, "remoteIP");
            this.f39634a = localIP;
            this.f39635b = i10;
            this.f39636c = remoteIP;
            this.f39637d = i11;
        }

        public final String a() {
            return this.f39634a;
        }

        public final int b() {
            return this.f39635b;
        }

        public final String c() {
            return this.f39636c;
        }

        public final int d() {
            return this.f39637d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f39634a, aVar.f39634a) && this.f39635b == aVar.f39635b && AbstractC6492s.d(this.f39636c, aVar.f39636c) && this.f39637d == aVar.f39637d;
        }

        public int hashCode() {
            return (((((this.f39634a.hashCode() * 31) + Integer.hashCode(this.f39635b)) * 31) + this.f39636c.hashCode()) * 31) + Integer.hashCode(this.f39637d);
        }

        public String toString() {
            return "ConnectionParams(localIP=" + this.f39634a + ", localPort=" + this.f39635b + ", remoteIP=" + this.f39636c + ", remotePort=" + this.f39637d + ')';
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f39638a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39639b;

        public b(String iceConfig, String sessionSecret) {
            AbstractC6492s.i(iceConfig, "iceConfig");
            AbstractC6492s.i(sessionSecret, "sessionSecret");
            this.f39638a = iceConfig;
            this.f39639b = sessionSecret;
        }

        public final String a() {
            return this.f39638a;
        }

        public final String b() {
            return this.f39639b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f39638a, bVar.f39638a) && AbstractC6492s.d(this.f39639b, bVar.f39639b);
        }

        public int hashCode() {
            return (this.f39638a.hashCode() * 31) + this.f39639b.hashCode();
        }

        public String toString() {
            return "LocalPeerDescriptionParams(iceConfig=" + this.f39638a + ", sessionSecret=" + this.f39639b + ')';
        }
    }

    AbstractC5912b activateConnection();

    AbstractC5912b closeConnection();

    AbstractC5912b closePeer();

    z createLocalPeerDescription(b bVar);

    z setupPeerConnection(String str);
}
