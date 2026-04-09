package w4;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: w4.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8259d extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f64376a;

    /* renamed from: b, reason: collision with root package name */
    private final int f64377b;

    /* renamed from: c, reason: collision with root package name */
    private final c f64378c;

    /* renamed from: w4.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f64379a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f64380b;

        /* renamed from: c, reason: collision with root package name */
        private c f64381c;

        public C8259d a() throws GeneralSecurityException {
            Integer num = this.f64379a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f64380b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f64381c != null) {
                return new C8259d(num.intValue(), this.f64380b.intValue(), this.f64381c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f64379a = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            if (i10 >= 10 && 16 >= i10) {
                this.f64380b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        public b d(c cVar) {
            this.f64381c = cVar;
            return this;
        }

        private b() {
            this.f64379a = null;
            this.f64380b = null;
            this.f64381c = c.f64385e;
        }
    }

    /* renamed from: w4.d$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f64382b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f64383c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f64384d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f64385e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f64386a;

        private c(String str) {
            this.f64386a = str;
        }

        public String toString() {
            return this.f64386a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f64377b;
    }

    public int c() {
        return this.f64376a;
    }

    public int d() {
        c cVar = this.f64378c;
        if (cVar == c.f64385e) {
            return b();
        }
        if (cVar != c.f64382b && cVar != c.f64383c && cVar != c.f64384d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iB = b();
        return iB + 5;
    }

    public c e() {
        return this.f64378c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8259d)) {
            return false;
        }
        C8259d c8259d = (C8259d) obj;
        return c8259d.c() == c() && c8259d.d() == d() && c8259d.e() == e();
    }

    public boolean f() {
        return this.f64378c != c.f64385e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f64376a), Integer.valueOf(this.f64377b), this.f64378c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f64378c + ", " + this.f64377b + "-byte tags, and " + this.f64376a + "-byte key)";
    }

    private C8259d(int i10, int i11, c cVar) {
        this.f64376a = i10;
        this.f64377b = i11;
        this.f64378c = cVar;
    }
}
