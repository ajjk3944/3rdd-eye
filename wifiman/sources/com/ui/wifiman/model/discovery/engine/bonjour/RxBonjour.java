package com.ui.wifiman.model.discovery.engine.bonjour;

import gg.AbstractC5912b;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface RxBonjour {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "InternalError", "DiscoveryUnavailable", "Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$DiscoveryUnavailable;", "Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements Wc.d {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$DiscoveryUnavailable;", "Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class DiscoveryUnavailable extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DiscoveryUnavailable(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;", "Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InternalError extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InternalError(String message, Throwable th2) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
                this.cause = th2;
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

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f42585a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42586b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f42587c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f42588d;

        /* renamed from: e, reason: collision with root package name */
        private final Set f42589e;

        /* renamed from: f, reason: collision with root package name */
        private final int f42590f;

        /* renamed from: g, reason: collision with root package name */
        private final String f42591g;

        public a(String name, String type, Map txtRecords, Set ipV4, Set ipV6, int i10) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(type, "type");
            AbstractC6492s.i(txtRecords, "txtRecords");
            AbstractC6492s.i(ipV4, "ipV4");
            AbstractC6492s.i(ipV6, "ipV6");
            this.f42585a = name;
            this.f42586b = type;
            this.f42587c = txtRecords;
            this.f42588d = ipV4;
            this.f42589e = ipV6;
            this.f42590f = i10;
            this.f42591g = name + "." + type;
        }

        public final Set a() {
            return this.f42588d;
        }

        public final String b() {
            return this.f42585a;
        }

        public final int c() {
            return this.f42590f;
        }

        public final Map d() {
            return this.f42587c;
        }

        public final String e() {
            return this.f42586b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f42585a, aVar.f42585a) && AbstractC6492s.d(this.f42586b, aVar.f42586b) && AbstractC6492s.d(this.f42587c, aVar.f42587c) && AbstractC6492s.d(this.f42588d, aVar.f42588d) && AbstractC6492s.d(this.f42589e, aVar.f42589e) && this.f42590f == aVar.f42590f;
        }

        public int hashCode() {
            return (((((((((this.f42585a.hashCode() * 31) + this.f42586b.hashCode()) * 31) + this.f42587c.hashCode()) * 31) + this.f42588d.hashCode()) * 31) + this.f42589e.hashCode()) * 31) + Integer.hashCode(this.f42590f);
        }

        public String toString() {
            return "Service(name=" + this.f42585a + ", type=" + this.f42586b + ", txtRecords=" + this.f42587c + ", ipV4=" + this.f42588d + ", ipV6=" + this.f42589e + ", port=" + this.f42590f + ")";
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final a f42592a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a service) {
                super(null);
                AbstractC6492s.i(service, "service");
                this.f42592a = service;
            }

            @Override // com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour.b
            public a a() {
                return this.f42592a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f42592a, ((a) obj).f42592a);
            }

            public int hashCode() {
                return this.f42592a.hashCode();
            }

            public String toString() {
                return "Found(service=" + this.f42592a + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour$b$b, reason: collision with other inner class name */
        public static final class C1394b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final a f42593a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1394b(a service) {
                super(null);
                AbstractC6492s.i(service, "service");
                this.f42593a = service;
            }

            @Override // com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour.b
            public a a() {
                return this.f42593a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1394b) && AbstractC6492s.d(this.f42593a, ((C1394b) obj).f42593a);
            }

            public int hashCode() {
                return this.f42593a.hashCode();
            }

            public String toString() {
                return "Lost(service=" + this.f42593a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract a a();

        private b() {
        }
    }

    gg.i a();

    gg.i b(String str);

    AbstractC5912b c(a aVar);
}
