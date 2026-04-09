package p4;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class q extends AbstractC7220c {

    /* renamed from: a, reason: collision with root package name */
    private final int f57625a;

    /* renamed from: b, reason: collision with root package name */
    private final int f57626b;

    /* renamed from: c, reason: collision with root package name */
    private final int f57627c;

    /* renamed from: d, reason: collision with root package name */
    private final c f57628d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f57629a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f57630b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f57631c;

        /* renamed from: d, reason: collision with root package name */
        private c f57632d;

        public q a() throws GeneralSecurityException {
            Integer num = this.f57629a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f57632d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f57630b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f57631c != null) {
                return new q(num.intValue(), this.f57630b.intValue(), this.f57631c.intValue(), this.f57632d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.f57630b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f57629a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f57631c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f57632d = cVar;
            return this;
        }

        private b() {
            this.f57629a = null;
            this.f57630b = null;
            this.f57631c = null;
            this.f57632d = c.f57635d;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f57633b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f57634c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f57635d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f57636a;

        private c(String str) {
            this.f57636a = str;
        }

        public String toString() {
            return this.f57636a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f57626b;
    }

    public int c() {
        return this.f57625a;
    }

    public int d() {
        return this.f57627c;
    }

    public c e() {
        return this.f57628d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c() == c() && qVar.b() == b() && qVar.d() == d() && qVar.e() == e();
    }

    public boolean f() {
        return this.f57628d != c.f57635d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f57625a), Integer.valueOf(this.f57626b), Integer.valueOf(this.f57627c), this.f57628d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f57628d + ", " + this.f57626b + "-byte IV, " + this.f57627c + "-byte tag, and " + this.f57625a + "-byte key)";
    }

    private q(int i10, int i11, int i12, c cVar) {
        this.f57625a = i10;
        this.f57626b = i11;
        this.f57627c = i12;
        this.f57628d = cVar;
    }
}
