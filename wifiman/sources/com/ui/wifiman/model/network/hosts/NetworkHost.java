package com.ui.wifiman.model.network.hosts;

import Wc.d;
import gg.AbstractC5912b;
import gg.i;
import inet.ipaddr.g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public abstract class NetworkHost {

    public interface Manager {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "HostAlreadyAdded", "HostNotFound", "Unknown", "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostAlreadyAdded;", "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostNotFound;", "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$Unknown;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Error extends RuntimeException implements d {

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostAlreadyAdded;", "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error;", "", "host", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", SnmpConfigurator.O_COMMUNITY, "getMessage", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class HostAlreadyAdded extends Error {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String host;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final Throwable cause;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public HostAlreadyAdded(String host, Throwable th2) {
                    super(null);
                    AbstractC6492s.i(host, "host");
                    this.host = host;
                    this.cause = th2;
                    this.message = "Network Host '" + host + "' already added";
                }

                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return this.cause;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$Unknown;", "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error;", "", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "cause", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Unknown extends Error {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final Throwable cause;

                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return this.cause;
                }
            }

            public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostNotFound;", "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error;", "", "host", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", SnmpConfigurator.O_COMMUNITY, "getMessage", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class HostNotFound extends Error {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String host;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final Throwable cause;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public HostNotFound(String host, Throwable th2) {
                    super(null);
                    AbstractC6492s.i(host, "host");
                    this.host = host;
                    this.cause = th2;
                    this.message = "Network Host '" + host + "' not found";
                }

                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return this.cause;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }

                public /* synthetic */ HostNotFound(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, (i10 & 2) != 0 ? null : th2);
                }
            }

            private Error() {
            }
        }

        AbstractC5912b a(String str);

        AbstractC5912b b(long j10, int i10);

        i c();

        AbstractC5912b d(long j10);
    }

    public static final class a extends NetworkHost {

        /* renamed from: a, reason: collision with root package name */
        private final long f42811a;

        /* renamed from: b, reason: collision with root package name */
        private final g f42812b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42813c;

        /* renamed from: d, reason: collision with root package name */
        private final int f42814d;

        /* renamed from: e, reason: collision with root package name */
        private final dd.i f42815e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, g gVar, String host, int i10, dd.i iVar) {
            super(null);
            AbstractC6492s.i(host, "host");
            this.f42811a = j10;
            this.f42812b = gVar;
            this.f42813c = host;
            this.f42814d = i10;
            this.f42815e = iVar;
        }

        public final String a() {
            return this.f42813c;
        }

        public long b() {
            return this.f42811a;
        }

        public dd.i c() {
            return this.f42815e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f42811a == aVar.f42811a && AbstractC6492s.d(this.f42812b, aVar.f42812b) && AbstractC6492s.d(this.f42813c, aVar.f42813c) && this.f42814d == aVar.f42814d && AbstractC6492s.d(this.f42815e, aVar.f42815e);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f42811a) * 31;
            g gVar = this.f42812b;
            int iHashCode2 = (((((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f42813c.hashCode()) * 31) + Integer.hashCode(this.f42814d)) * 31;
            dd.i iVar = this.f42815e;
            return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
        }

        public String toString() {
            return "Custom(id=" + this.f42811a + ", ip=" + this.f42812b + ", host=" + this.f42813c + ", position=" + this.f42814d + ", stats=" + this.f42815e + ")";
        }
    }

    public static final class b extends NetworkHost {

        /* renamed from: a, reason: collision with root package name */
        private final long f42816a;

        /* renamed from: b, reason: collision with root package name */
        private final g f42817b;

        /* renamed from: c, reason: collision with root package name */
        private final int f42818c;

        /* renamed from: d, reason: collision with root package name */
        private final dd.i f42819d;

        public b(long j10, g gVar, int i10, dd.i iVar) {
            super(null);
            this.f42816a = j10;
            this.f42817b = gVar;
            this.f42818c = i10;
            this.f42819d = iVar;
        }

        public long a() {
            return this.f42816a;
        }

        public dd.i b() {
            return this.f42819d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f42816a == bVar.f42816a && AbstractC6492s.d(this.f42817b, bVar.f42817b) && this.f42818c == bVar.f42818c && AbstractC6492s.d(this.f42819d, bVar.f42819d);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f42816a) * 31;
            g gVar = this.f42817b;
            int iHashCode2 = (((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + Integer.hashCode(this.f42818c)) * 31;
            dd.i iVar = this.f42819d;
            return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
        }

        public String toString() {
            return "Gateway(id=" + this.f42816a + ", ip=" + this.f42817b + ", position=" + this.f42818c + ", stats=" + this.f42819d + ")";
        }
    }

    public /* synthetic */ NetworkHost(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkHost() {
    }
}
