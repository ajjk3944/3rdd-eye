package com.ui.wifiman.model.discovery.engine.snmp;

import gg.i;
import inet.ipaddr.g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface Snmp {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u0006B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "Internal", "Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error$Internal;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements Wc.d {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error$Internal;", "Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Internal extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Throwable cause;

            public /* synthetic */ Internal(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) other;
                return AbstractC6492s.d(this.message, internal.message) && AbstractC6492s.d(this.cause, internal.cause);
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
                String str = this.message;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.cause;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "Internal(message=" + this.message + ", cause=" + this.cause + ")";
            }

            public Internal(String str, Throwable th2) {
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
        private final g f42755a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42756b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42757c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42758d;

        /* renamed from: e, reason: collision with root package name */
        private final String f42759e;

        /* renamed from: f, reason: collision with root package name */
        private final String f42760f;

        /* renamed from: g, reason: collision with root package name */
        private final String f42761g;

        public a(g ip, String str, String str2, String str3, String str4, String str5, String str6) {
            AbstractC6492s.i(ip, "ip");
            this.f42755a = ip;
            this.f42756b = str;
            this.f42757c = str2;
            this.f42758d = str3;
            this.f42759e = str4;
            this.f42760f = str5;
            this.f42761g = str6;
        }

        public final String a() {
            return this.f42759e;
        }

        public final String b() {
            return this.f42757c;
        }

        public final g c() {
            return this.f42755a;
        }

        public final String d() {
            return this.f42760f;
        }

        public final String e() {
            return this.f42756b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f42755a, aVar.f42755a) && AbstractC6492s.d(this.f42756b, aVar.f42756b) && AbstractC6492s.d(this.f42757c, aVar.f42757c) && AbstractC6492s.d(this.f42758d, aVar.f42758d) && AbstractC6492s.d(this.f42759e, aVar.f42759e) && AbstractC6492s.d(this.f42760f, aVar.f42760f) && AbstractC6492s.d(this.f42761g, aVar.f42761g);
        }

        public final String f() {
            return this.f42761g;
        }

        public final String g() {
            return this.f42758d;
        }

        public int hashCode() {
            int iHashCode = this.f42755a.hashCode() * 31;
            String str = this.f42756b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f42757c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f42758d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f42759e;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f42760f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f42761g;
            return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Result(ip=" + this.f42755a + ", name=" + this.f42756b + ", description=" + this.f42757c + ", uptime=" + this.f42758d + ", contact=" + this.f42759e + ", location=" + this.f42760f + ", services=" + this.f42761g + ")";
        }
    }

    i a(g gVar, long j10);
}
