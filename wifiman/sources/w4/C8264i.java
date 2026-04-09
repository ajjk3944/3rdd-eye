package w4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import w4.C8267l;

/* renamed from: w4.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8264i extends p {

    /* renamed from: a, reason: collision with root package name */
    private final C8267l f64395a;

    /* renamed from: b, reason: collision with root package name */
    private final C4.b f64396b;

    /* renamed from: c, reason: collision with root package name */
    private final C4.a f64397c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f64398d;

    /* renamed from: w4.i$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C8267l f64399a;

        /* renamed from: b, reason: collision with root package name */
        private C4.b f64400b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f64401c;

        private C4.a b() {
            if (this.f64399a.f() == C8267l.d.f64422e) {
                return C4.a.a(new byte[0]);
            }
            if (this.f64399a.f() == C8267l.d.f64421d || this.f64399a.f() == C8267l.d.f64420c) {
                return C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f64401c.intValue()).array());
            }
            if (this.f64399a.f() == C8267l.d.f64419b) {
                return C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f64401c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f64399a.f());
        }

        public C8264i a() throws GeneralSecurityException {
            C8267l c8267l = this.f64399a;
            if (c8267l == null || this.f64400b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c8267l.d() != this.f64400b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f64399a.g() && this.f64401c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f64399a.g() && this.f64401c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C8264i(this.f64399a, this.f64400b, b(), this.f64401c);
        }

        public b c(Integer num) {
            this.f64401c = num;
            return this;
        }

        public b d(C4.b bVar) {
            this.f64400b = bVar;
            return this;
        }

        public b e(C8267l c8267l) {
            this.f64399a = c8267l;
            return this;
        }

        private b() {
            this.f64399a = null;
            this.f64400b = null;
            this.f64401c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // w4.p
    public C4.a a() {
        return this.f64397c;
    }

    @Override // w4.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C8267l b() {
        return this.f64395a;
    }

    private C8264i(C8267l c8267l, C4.b bVar, C4.a aVar, Integer num) {
        this.f64395a = c8267l;
        this.f64396b = bVar;
        this.f64397c = aVar;
        this.f64398d = num;
    }
}
