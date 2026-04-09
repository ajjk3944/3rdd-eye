package p4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p4.q;

/* loaded from: classes3.dex */
public final class o extends AbstractC7219b {

    /* renamed from: a, reason: collision with root package name */
    private final q f57617a;

    /* renamed from: b, reason: collision with root package name */
    private final C4.b f57618b;

    /* renamed from: c, reason: collision with root package name */
    private final C4.a f57619c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f57620d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private q f57621a;

        /* renamed from: b, reason: collision with root package name */
        private C4.b f57622b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f57623c;

        private C4.a b() {
            if (this.f57621a.e() == q.c.f57635d) {
                return C4.a.a(new byte[0]);
            }
            if (this.f57621a.e() == q.c.f57634c) {
                return C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f57623c.intValue()).array());
            }
            if (this.f57621a.e() == q.c.f57633b) {
                return C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f57623c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f57621a.e());
        }

        public o a() throws GeneralSecurityException {
            q qVar = this.f57621a;
            if (qVar == null || this.f57622b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (qVar.c() != this.f57622b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f57621a.f() && this.f57623c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f57621a.f() && this.f57623c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new o(this.f57621a, this.f57622b, b(), this.f57623c);
        }

        public b c(Integer num) {
            this.f57623c = num;
            return this;
        }

        public b d(C4.b bVar) {
            this.f57622b = bVar;
            return this;
        }

        public b e(q qVar) {
            this.f57621a = qVar;
            return this;
        }

        private b() {
            this.f57621a = null;
            this.f57622b = null;
            this.f57623c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private o(q qVar, C4.b bVar, C4.a aVar, Integer num) {
        this.f57617a = qVar;
        this.f57618b = bVar;
        this.f57619c = aVar;
        this.f57620d = num;
    }
}
