package p4;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: p4.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7226i extends AbstractC7220c {

    /* renamed from: a, reason: collision with root package name */
    private final int f57599a;

    /* renamed from: b, reason: collision with root package name */
    private final int f57600b;

    /* renamed from: c, reason: collision with root package name */
    private final int f57601c;

    /* renamed from: d, reason: collision with root package name */
    private final c f57602d;

    /* renamed from: p4.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f57603a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f57604b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f57605c;

        /* renamed from: d, reason: collision with root package name */
        private c f57606d;

        public C7226i a() throws GeneralSecurityException {
            Integer num = this.f57603a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f57604b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f57606d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f57605c != null) {
                return new C7226i(num.intValue(), this.f57604b.intValue(), this.f57605c.intValue(), this.f57606d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f57604b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f57603a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f57605c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f57606d = cVar;
            return this;
        }

        private b() {
            this.f57603a = null;
            this.f57604b = null;
            this.f57605c = null;
            this.f57606d = c.f57609d;
        }
    }

    /* renamed from: p4.i$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f57607b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f57608c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f57609d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f57610a;

        private c(String str) {
            this.f57610a = str;
        }

        public String toString() {
            return this.f57610a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f57600b;
    }

    public int c() {
        return this.f57599a;
    }

    public int d() {
        return this.f57601c;
    }

    public c e() {
        return this.f57602d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7226i)) {
            return false;
        }
        C7226i c7226i = (C7226i) obj;
        return c7226i.c() == c() && c7226i.b() == b() && c7226i.d() == d() && c7226i.e() == e();
    }

    public boolean f() {
        return this.f57602d != c.f57609d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f57599a), Integer.valueOf(this.f57600b), Integer.valueOf(this.f57601c), this.f57602d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f57602d + ", " + this.f57600b + "-byte IV, " + this.f57601c + "-byte tag, and " + this.f57599a + "-byte key)";
    }

    private C7226i(int i10, int i11, int i12, c cVar) {
        this.f57599a = i10;
        this.f57600b = i11;
        this.f57601c = i12;
        this.f57602d = cVar;
    }
}
