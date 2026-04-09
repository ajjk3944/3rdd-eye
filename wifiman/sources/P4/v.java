package p4;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class v extends AbstractC7220c {

    /* renamed from: a, reason: collision with root package name */
    private final int f57651a;

    /* renamed from: b, reason: collision with root package name */
    private final c f57652b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f57653a;

        /* renamed from: b, reason: collision with root package name */
        private c f57654b;

        public v a() throws GeneralSecurityException {
            Integer num = this.f57653a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f57654b != null) {
                return new v(num.intValue(), this.f57654b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f57653a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f57654b = cVar;
            return this;
        }

        private b() {
            this.f57653a = null;
            this.f57654b = c.f57657d;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f57655b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f57656c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f57657d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f57658a;

        private c(String str) {
            this.f57658a = str;
        }

        public String toString() {
            return this.f57658a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f57651a;
    }

    public c c() {
        return this.f57652b;
    }

    public boolean d() {
        return this.f57652b != c.f57657d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == b() && vVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f57651a), this.f57652b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f57652b + ", " + this.f57651a + "-byte key)";
    }

    private v(int i10, c cVar) {
        this.f57651a = i10;
        this.f57652b = cVar;
    }
}
