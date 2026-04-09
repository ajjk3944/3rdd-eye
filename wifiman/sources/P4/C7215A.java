package p4;

import java.util.Objects;

/* renamed from: p4.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7215A extends AbstractC7220c {

    /* renamed from: a, reason: collision with root package name */
    private final a f57541a;

    /* renamed from: p4.A$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f57542b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f57543c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f57544d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f57545a;

        private a(String str) {
            this.f57545a = str;
        }

        public String toString() {
            return this.f57545a;
        }
    }

    private C7215A(a aVar) {
        this.f57541a = aVar;
    }

    public static C7215A a(a aVar) {
        return new C7215A(aVar);
    }

    public a b() {
        return this.f57541a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7215A) && ((C7215A) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f57541a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f57541a + ")";
    }
}
