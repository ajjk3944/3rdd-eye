package Ff;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6525a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 2049528520;
        }

        public String toString() {
            return "MultiLine";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private final float f6526a;

        /* renamed from: b, reason: collision with root package name */
        private final float f6527b;

        public /* synthetic */ b(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11);
        }

        public final float a() {
            return this.f6526a;
        }

        public final float b() {
            return this.f6527b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Y0.h.n(this.f6526a, bVar.f6526a) && Y0.h.n(this.f6527b, bVar.f6527b);
        }

        public int hashCode() {
            return (Y0.h.p(this.f6526a) * 31) + Y0.h.p(this.f6527b);
        }

        public String toString() {
            return "SingleLine(rowChannel=" + Y0.h.r(this.f6526a) + ", rowSignal=" + Y0.h.r(this.f6527b) + ")";
        }

        private b(float f10, float f11) {
            super(null);
            this.f6526a = f10;
            this.f6527b = f11;
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
