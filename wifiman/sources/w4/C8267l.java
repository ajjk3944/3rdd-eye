package w4;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: w4.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8267l extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f64405a;

    /* renamed from: b, reason: collision with root package name */
    private final int f64406b;

    /* renamed from: c, reason: collision with root package name */
    private final d f64407c;

    /* renamed from: d, reason: collision with root package name */
    private final c f64408d;

    /* renamed from: w4.l$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f64409a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f64410b;

        /* renamed from: c, reason: collision with root package name */
        private c f64411c;

        /* renamed from: d, reason: collision with root package name */
        private d f64412d;

        private static void f(int i10, c cVar) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.f64413b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f64414c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f64415d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f64416e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f64417f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public C8267l a() throws GeneralSecurityException {
            Integer num = this.f64409a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f64410b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f64411c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f64412d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f64409a));
            }
            f(this.f64410b.intValue(), this.f64411c);
            return new C8267l(this.f64409a.intValue(), this.f64410b.intValue(), this.f64412d, this.f64411c);
        }

        public b b(c cVar) {
            this.f64411c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f64409a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            this.f64410b = Integer.valueOf(i10);
            return this;
        }

        public b e(d dVar) {
            this.f64412d = dVar;
            return this;
        }

        private b() {
            this.f64409a = null;
            this.f64410b = null;
            this.f64411c = null;
            this.f64412d = d.f64422e;
        }
    }

    /* renamed from: w4.l$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f64413b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f64414c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f64415d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f64416e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f64417f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f64418a;

        private c(String str) {
            this.f64418a = str;
        }

        public String toString() {
            return this.f64418a;
        }
    }

    /* renamed from: w4.l$d */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f64419b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f64420c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f64421d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f64422e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f64423a;

        private d(String str) {
            this.f64423a = str;
        }

        public String toString() {
            return this.f64423a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f64406b;
    }

    public c c() {
        return this.f64408d;
    }

    public int d() {
        return this.f64405a;
    }

    public int e() {
        d dVar = this.f64407c;
        if (dVar == d.f64422e) {
            return b();
        }
        if (dVar != d.f64419b && dVar != d.f64420c && dVar != d.f64421d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iB = b();
        return iB + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8267l)) {
            return false;
        }
        C8267l c8267l = (C8267l) obj;
        return c8267l.d() == d() && c8267l.e() == e() && c8267l.f() == f() && c8267l.c() == c();
    }

    public d f() {
        return this.f64407c;
    }

    public boolean g() {
        return this.f64407c != d.f64422e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f64405a), Integer.valueOf(this.f64406b), this.f64407c, this.f64408d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f64407c + ", hashType: " + this.f64408d + ", " + this.f64406b + "-byte tags, and " + this.f64405a + "-byte key)";
    }

    private C8267l(int i10, int i11, d dVar, c cVar) {
        this.f64405a = i10;
        this.f64406b = i11;
        this.f64407c = dVar;
        this.f64408d = cVar;
    }
}
