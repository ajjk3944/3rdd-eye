package Te;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class I {

    public static final class a extends I {

        /* renamed from: a, reason: collision with root package name */
        private final float f21653a;

        /* renamed from: b, reason: collision with root package name */
        private final float f21654b;

        /* renamed from: c, reason: collision with root package name */
        private final s9.d f21655c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, float f11, s9.d text) {
            super(null);
            AbstractC6492s.i(text, "text");
            this.f21653a = f10;
            this.f21654b = f11;
            this.f21655c = text;
        }

        public s9.d a() {
            return this.f21655c;
        }

        public float b() {
            return this.f21653a;
        }

        public float c() {
            return this.f21654b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f21653a, aVar.f21653a) == 0 && Float.compare(this.f21654b, aVar.f21654b) == 0 && AbstractC6492s.d(this.f21655c, aVar.f21655c);
        }

        public int hashCode() {
            return (((Float.hashCode(this.f21653a) * 31) + Float.hashCode(this.f21654b)) * 31) + this.f21655c.hashCode();
        }

        public String toString() {
            return "Place(x=" + this.f21653a + ", y=" + this.f21654b + ", text=" + this.f21655c + ")";
        }
    }

    public static final class b extends I {

        /* renamed from: a, reason: collision with root package name */
        private final float f21656a;

        /* renamed from: b, reason: collision with root package name */
        private final float f21657b;

        /* renamed from: c, reason: collision with root package name */
        private final s9.d f21658c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11, s9.d text) {
            super(null);
            AbstractC6492s.i(text, "text");
            this.f21656a = f10;
            this.f21657b = f11;
            this.f21658c = text;
        }

        public s9.d a() {
            return this.f21658c;
        }

        public float b() {
            return this.f21656a;
        }

        public float c() {
            return this.f21657b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f21656a, bVar.f21656a) == 0 && Float.compare(this.f21657b, bVar.f21657b) == 0 && AbstractC6492s.d(this.f21658c, bVar.f21658c);
        }

        public int hashCode() {
            return (((Float.hashCode(this.f21656a) * 31) + Float.hashCode(this.f21657b)) * 31) + this.f21658c.hashCode();
        }

        public String toString() {
            return "Roaming(x=" + this.f21656a + ", y=" + this.f21657b + ", text=" + this.f21658c + ")";
        }
    }

    public /* synthetic */ I(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private I() {
    }
}
