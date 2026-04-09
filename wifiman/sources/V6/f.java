package V6;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable f22990a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f22991b;

        public a(Drawable drawable, Throwable th2) {
            super(null);
            this.f22990a = drawable;
            this.f22991b = th2;
        }

        public final Throwable a() {
            return this.f22991b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f22990a, aVar.f22990a) && AbstractC6492s.d(this.f22991b, aVar.f22991b);
        }

        public int hashCode() {
            Drawable drawable = this.f22990a;
            int iHashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
            Throwable th2 = this.f22991b;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        public String toString() {
            return "Failure(errorDrawable=" + this.f22990a + ", reason=" + this.f22991b + ")";
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f22992a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1019591159;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f22993a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1512028789;
        }

        public String toString() {
            return "None";
        }
    }

    public static final class d extends f {

        /* renamed from: a, reason: collision with root package name */
        private final Object f22994a;

        /* renamed from: b, reason: collision with root package name */
        private final S6.a f22995b;

        /* renamed from: c, reason: collision with root package name */
        private final p f22996c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, S6.a dataSource, p glideRequestType) {
            super(null);
            AbstractC6492s.i(dataSource, "dataSource");
            AbstractC6492s.i(glideRequestType, "glideRequestType");
            this.f22994a = obj;
            this.f22995b = dataSource;
            this.f22996c = glideRequestType;
        }

        public final Object a() {
            return this.f22994a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f22994a, dVar.f22994a) && this.f22995b == dVar.f22995b && this.f22996c == dVar.f22996c;
        }

        public int hashCode() {
            Object obj = this.f22994a;
            return ((((obj == null ? 0 : obj.hashCode()) * 31) + this.f22995b.hashCode()) * 31) + this.f22996c.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f22994a + ", dataSource=" + this.f22995b + ", glideRequestType=" + this.f22996c + ")";
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private f() {
    }
}
