package w4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import w4.C8259d;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8256a extends p {

    /* renamed from: a, reason: collision with root package name */
    private final C8259d f64367a;

    /* renamed from: b, reason: collision with root package name */
    private final C4.b f64368b;

    /* renamed from: c, reason: collision with root package name */
    private final C4.a f64369c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f64370d;

    /* renamed from: w4.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C8259d f64371a;

        /* renamed from: b, reason: collision with root package name */
        private C4.b f64372b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f64373c;

        private C4.a b() {
            if (this.f64371a.e() == C8259d.c.f64385e) {
                return C4.a.a(new byte[0]);
            }
            if (this.f64371a.e() == C8259d.c.f64384d || this.f64371a.e() == C8259d.c.f64383c) {
                return C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f64373c.intValue()).array());
            }
            if (this.f64371a.e() == C8259d.c.f64382b) {
                return C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f64373c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f64371a.e());
        }

        public C8256a a() throws GeneralSecurityException {
            C8259d c8259d = this.f64371a;
            if (c8259d == null || this.f64372b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c8259d.c() != this.f64372b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f64371a.f() && this.f64373c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f64371a.f() && this.f64373c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C8256a(this.f64371a, this.f64372b, b(), this.f64373c);
        }

        public b c(C4.b bVar) {
            this.f64372b = bVar;
            return this;
        }

        public b d(Integer num) {
            this.f64373c = num;
            return this;
        }

        public b e(C8259d c8259d) {
            this.f64371a = c8259d;
            return this;
        }

        private b() {
            this.f64371a = null;
            this.f64372b = null;
            this.f64373c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // w4.p
    public C4.a a() {
        return this.f64369c;
    }

    @Override // w4.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C8259d b() {
        return this.f64367a;
    }

    private C8256a(C8259d c8259d, C4.b bVar, C4.a aVar, Integer num) {
        this.f64367a = c8259d;
        this.f64368b = bVar;
        this.f64369c = aVar;
        this.f64370d = num;
    }
}
