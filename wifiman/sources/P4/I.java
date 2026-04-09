package p4;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class I extends AbstractC7220c {

    /* renamed from: a, reason: collision with root package name */
    private final a f57562a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f57563b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f57564c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f57565d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f57566a;

        private a(String str) {
            this.f57566a = str;
        }

        public String toString() {
            return this.f57566a;
        }
    }

    private I(a aVar) {
        this.f57562a = aVar;
    }

    public static I a(a aVar) {
        return new I(aVar);
    }

    public a b() {
        return this.f57562a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof I) && ((I) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f57562a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f57562a + ")";
    }
}
