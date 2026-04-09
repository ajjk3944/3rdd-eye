package Ia;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class k {

    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        private final String f9027a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9028b;

        /* renamed from: c, reason: collision with root package name */
        private final String f9029c;

        /* renamed from: d, reason: collision with root package name */
        private final Double f9030d;

        /* renamed from: e, reason: collision with root package name */
        private final Double f9031e;

        /* renamed from: f, reason: collision with root package name */
        private final Long f9032f;

        /* renamed from: g, reason: collision with root package name */
        private final Long f9033g;

        /* renamed from: h, reason: collision with root package name */
        private final Long f9034h;

        public a(String str, String str2, String str3, Double d10, Double d11, Long l10, Long l11, Long l12) {
            super(null);
            this.f9027a = str;
            this.f9028b = str2;
            this.f9029c = str3;
            this.f9030d = d10;
            this.f9031e = d11;
            this.f9032f = l10;
            this.f9033g = l11;
            this.f9034h = l12;
        }

        @Override // Ia.k
        public Long a() {
            return this.f9033g;
        }

        @Override // Ia.k
        public Long b() {
            return this.f9032f;
        }

        @Override // Ia.k
        public Long c() {
            return this.f9034h;
        }

        public final String d() {
            return this.f9029c;
        }

        public final String e() {
            return this.f9027a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f9027a, aVar.f9027a) && AbstractC6492s.d(this.f9028b, aVar.f9028b) && AbstractC6492s.d(this.f9029c, aVar.f9029c) && AbstractC6492s.d(this.f9030d, aVar.f9030d) && AbstractC6492s.d(this.f9031e, aVar.f9031e) && AbstractC6492s.d(this.f9032f, aVar.f9032f) && AbstractC6492s.d(this.f9033g, aVar.f9033g) && AbstractC6492s.d(this.f9034h, aVar.f9034h);
        }

        public final Double f() {
            return this.f9030d;
        }

        public final Double g() {
            return this.f9031e;
        }

        public final String h() {
            return this.f9028b;
        }

        public int hashCode() {
            String str = this.f9027a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f9028b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f9029c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Double d10 = this.f9030d;
            int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this.f9031e;
            int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Long l10 = this.f9032f;
            int iHashCode6 = (iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.f9033g;
            int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.f9034h;
            return iHashCode7 + (l12 != null ? l12.hashCode() : 0);
        }

        public String toString() {
            return "App2App(fromModel=" + this.f9027a + ", toModel=" + this.f9028b + ", apModel=" + this.f9029c + ", latitude=" + this.f9030d + ", longitude=" + this.f9031e + ", latencyMs=" + this.f9032f + ", downloadBytesPerSecond=" + this.f9033g + ", uploadBytesPerSecond=" + this.f9034h + ")";
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Long a();

    public abstract Long b();

    public abstract Long c();

    private k() {
    }
}
