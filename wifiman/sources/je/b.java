package Je;

import a8.C3772b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10007a = 0;

    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10008b = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -925458385;
        }

        public String toString() {
            return "Gateway";
        }
    }

    /* renamed from: Je.b$b, reason: collision with other inner class name */
    public static final class C0408b extends b {

        /* renamed from: b, reason: collision with root package name */
        private final C3772b f10009b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0408b(C3772b id2) {
            super(null);
            AbstractC6492s.i(id2, "id");
            this.f10009b = id2;
        }

        public final C3772b a() {
            return this.f10009b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0408b) && AbstractC6492s.d(this.f10009b, ((C0408b) obj).f10009b);
        }

        public int hashCode() {
            return this.f10009b.hashCode();
        }

        public String toString() {
            return "Id(id=" + this.f10009b + ")";
        }
    }

    public static final class c extends b {

        /* renamed from: b, reason: collision with root package name */
        private final inet.ipaddr.g f10010b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(inet.ipaddr.g ip) {
            super(null);
            AbstractC6492s.i(ip, "ip");
            this.f10010b = ip;
        }

        public final inet.ipaddr.g a() {
            return this.f10010b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC6492s.d(this.f10010b, ((c) obj).f10010b);
        }

        public int hashCode() {
            return this.f10010b.hashCode();
        }

        public String toString() {
            return "Ip(ip=" + this.f10010b + ")";
        }
    }

    public static final class d extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final d f10011b = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1775606867;
        }

        public String toString() {
            return "Myself";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
