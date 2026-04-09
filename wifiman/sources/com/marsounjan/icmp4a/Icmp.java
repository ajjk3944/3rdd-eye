package com.marsounjan.icmp4a;

import Li.InterfaceC3220g;
import android.net.Network;
import java.net.InetAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public interface Icmp {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/marsounjan/icmp4a/Icmp$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "ProtocolException", "SocketException", "UnknownHost", "Lcom/marsounjan/icmp4a/Icmp$Error$ProtocolException;", "Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;", "Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;", "icmp4a_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error extends Exception {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/marsounjan/icmp4a/Icmp$Error$ProtocolException;", "Lcom/marsounjan/icmp4a/Icmp$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "icmp4a_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ProtocolException extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public /* synthetic */ ProtocolException(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProtocolException(String message, Throwable th2) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
                this.cause = th2;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;", "Lcom/marsounjan/icmp4a/Icmp$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "icmp4a_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SocketException extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public /* synthetic */ SocketException(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SocketException(String message, Throwable th2) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
                this.cause = th2;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;", "Lcom/marsounjan/icmp4a/Icmp$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "icmp4a_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UnknownHost extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnknownHost(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a {
        public static /* synthetic */ InterfaceC3220g a(Icmp icmp, String str, Integer num, long j10, int i10, long j11, Network network, int i11, Object obj) {
            if (obj == null) {
                return icmp.a(str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? 1000L : j10, (i11 & 8) != 0 ? 56 : i10, (i11 & 16) == 0 ? j11 : 1000L, (i11 & 32) == 0 ? network : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pingInterval");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f39152a;

        /* renamed from: b, reason: collision with root package name */
        private final long f39153b;

        /* renamed from: c, reason: collision with root package name */
        private final long f39154c;

        public b(long j10, long j11, long j12) {
            this.f39152a = j10;
            this.f39153b = j11;
            this.f39154c = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f39152a == bVar.f39152a && this.f39153b == bVar.f39153b && this.f39154c == bVar.f39154c;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f39152a) * 31) + Long.hashCode(this.f39153b)) * 31) + Long.hashCode(this.f39154c);
        }

        public String toString() {
            return "LatencyStats(minMs=" + this.f39152a + ", avgMs=" + this.f39153b + ", maxMs=" + this.f39154c + ')';
        }
    }

    public static abstract class c {

        public static abstract class a extends c {

            /* renamed from: com.marsounjan.icmp4a.Icmp$c$a$a, reason: collision with other inner class name */
            public static final class C1228a extends a {

                /* renamed from: a, reason: collision with root package name */
                private final String f39155a;

                /* renamed from: b, reason: collision with root package name */
                private final K5.a f39156b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1228a(String message, K5.a error) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    AbstractC6492s.i(error, "error");
                    this.f39155a = message;
                    this.f39156b = error;
                }

                public final K5.a a() {
                    return this.f39156b;
                }

                public String b() {
                    return this.f39155a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1228a)) {
                        return false;
                    }
                    C1228a c1228a = (C1228a) obj;
                    return AbstractC6492s.d(this.f39155a, c1228a.f39155a) && AbstractC6492s.d(this.f39156b, c1228a.f39156b);
                }

                public int hashCode() {
                    return (this.f39155a.hashCode() * 31) + this.f39156b.hashCode();
                }

                public String toString() {
                    return "Error(message=" + this.f39155a + ", error=" + this.f39156b + ')';
                }
            }

            public static final class b extends a {

                /* renamed from: a, reason: collision with root package name */
                private final String f39157a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.f39157a = message;
                }

                public String a() {
                    return this.f39157a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && AbstractC6492s.d(this.f39157a, ((b) obj).f39157a);
                }

                public int hashCode() {
                    return this.f39157a.hashCode();
                }

                public String toString() {
                    return "IO(message=" + this.f39157a + ')';
                }
            }

            /* renamed from: com.marsounjan.icmp4a.Icmp$c$a$c, reason: collision with other inner class name */
            public static final class C1229c extends a {

                /* renamed from: a, reason: collision with root package name */
                private final String f39158a;

                /* renamed from: b, reason: collision with root package name */
                private final long f39159b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1229c(String message, long j10) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.f39158a = message;
                    this.f39159b = j10;
                }

                public String a() {
                    return this.f39158a;
                }

                public final long b() {
                    return this.f39159b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1229c)) {
                        return false;
                    }
                    C1229c c1229c = (C1229c) obj;
                    return AbstractC6492s.d(this.f39158a, c1229c.f39158a) && this.f39159b == c1229c.f39159b;
                }

                public int hashCode() {
                    return (this.f39158a.hashCode() * 31) + Long.hashCode(this.f39159b);
                }

                public String toString() {
                    return "RequestTimeout(message=" + this.f39158a + ", millis=" + this.f39159b + ')';
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            private final int f39160a;

            /* renamed from: b, reason: collision with root package name */
            private final int f39161b;

            /* renamed from: c, reason: collision with root package name */
            private final long f39162c;

            public b(int i10, int i11, long j10) {
                super(null);
                this.f39160a = i10;
                this.f39161b = i11;
                this.f39162c = j10;
            }

            public final long a() {
                return this.f39162c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f39160a == bVar.f39160a && this.f39161b == bVar.f39161b && this.f39162c == bVar.f39162c;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.f39160a) * 31) + Integer.hashCode(this.f39161b)) * 31) + Long.hashCode(this.f39162c);
            }

            public String toString() {
                return "Success(sequenceNumber=" + this.f39160a + ", packetSize=" + this.f39161b + ", ms=" + this.f39162c + ')';
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final InetAddress f39163a;

        /* renamed from: b, reason: collision with root package name */
        private final int f39164b;

        /* renamed from: c, reason: collision with root package name */
        private final int f39165c;

        /* renamed from: d, reason: collision with root package name */
        private final float f39166d;

        /* renamed from: e, reason: collision with root package name */
        private final b f39167e;

        /* renamed from: f, reason: collision with root package name */
        private final c f39168f;

        public d(InetAddress ip, int i10, int i11, float f10, b bVar, c result) {
            AbstractC6492s.i(ip, "ip");
            AbstractC6492s.i(result, "result");
            this.f39163a = ip;
            this.f39164b = i10;
            this.f39165c = i11;
            this.f39166d = f10;
            this.f39167e = bVar;
            this.f39168f = result;
        }

        public final InetAddress a() {
            return this.f39163a;
        }

        public final c b() {
            return this.f39168f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f39163a, dVar.f39163a) && this.f39164b == dVar.f39164b && this.f39165c == dVar.f39165c && Float.compare(this.f39166d, dVar.f39166d) == 0 && AbstractC6492s.d(this.f39167e, dVar.f39167e) && AbstractC6492s.d(this.f39168f, dVar.f39168f);
        }

        public int hashCode() {
            int iHashCode = ((((((this.f39163a.hashCode() * 31) + Integer.hashCode(this.f39164b)) * 31) + Integer.hashCode(this.f39165c)) * 31) + Float.hashCode(this.f39166d)) * 31;
            b bVar = this.f39167e;
            return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f39168f.hashCode();
        }

        public String toString() {
            return "PingStatus(ip=" + this.f39163a + ", packetsTransmitted=" + this.f39164b + ", packetsReceived=" + this.f39165c + ", packetLoss=" + this.f39166d + ", stats=" + this.f39167e + ", result=" + this.f39168f + ')';
        }
    }

    InterfaceC3220g a(String str, Integer num, long j10, int i10, long j11, Network network);
}
