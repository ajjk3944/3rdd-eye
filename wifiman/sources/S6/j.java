package S6;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class j {

    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private final Object f20330a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f20331b;

        public a(Object obj, Throwable th2) {
            super(null);
            this.f20330a = obj;
            this.f20331b = th2;
        }

        public final Object a() {
            return this.f20330a;
        }

        public final Throwable b() {
            return this.f20331b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f20330a, aVar.f20330a) && AbstractC6492s.d(this.f20331b, aVar.f20331b);
        }

        public int hashCode() {
            Object obj = this.f20330a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Throwable th2 = this.f20331b;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        public String toString() {
            return "Failure(data=" + this.f20330a + ", reason=" + this.f20331b + ')';
        }
    }

    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f20332a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1940380715;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final c f20333a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -393733313;
        }

        public String toString() {
            return "None";
        }
    }

    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name */
        private final Object f20334a;

        /* renamed from: b, reason: collision with root package name */
        private final S6.a f20335b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, S6.a dataSource) {
            super(null);
            AbstractC6492s.i(dataSource, "dataSource");
            this.f20334a = obj;
            this.f20335b = dataSource;
        }

        public final Object a() {
            return this.f20334a;
        }

        public final S6.a b() {
            return this.f20335b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f20334a, dVar.f20334a) && this.f20335b == dVar.f20335b;
        }

        public int hashCode() {
            Object obj = this.f20334a;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f20335b.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f20334a + ", dataSource=" + this.f20335b + ')';
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
