package p4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p4.v;

/* loaded from: classes3.dex */
public final class t extends AbstractC7219b {

    /* renamed from: a, reason: collision with root package name */
    private final v f57643a;

    /* renamed from: b, reason: collision with root package name */
    private final C4.b f57644b;

    /* renamed from: c, reason: collision with root package name */
    private final C4.a f57645c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f57646d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private v f57647a;

        /* renamed from: b, reason: collision with root package name */
        private C4.b f57648b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f57649c;

        private C4.a b() {
            if (this.f57647a.c() == v.c.f57657d) {
                return C4.a.a(new byte[0]);
            }
            if (this.f57647a.c() == v.c.f57656c) {
                return C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f57649c.intValue()).array());
            }
            if (this.f57647a.c() == v.c.f57655b) {
                return C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f57649c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f57647a.c());
        }

        public t a() throws GeneralSecurityException {
            v vVar = this.f57647a;
            if (vVar == null || this.f57648b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (vVar.b() != this.f57648b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f57647a.d() && this.f57649c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f57647a.d() && this.f57649c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t(this.f57647a, this.f57648b, b(), this.f57649c);
        }

        public b c(Integer num) {
            this.f57649c = num;
            return this;
        }

        public b d(C4.b bVar) {
            this.f57648b = bVar;
            return this;
        }

        public b e(v vVar) {
            this.f57647a = vVar;
            return this;
        }

        private b() {
            this.f57647a = null;
            this.f57648b = null;
            this.f57649c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private t(v vVar, C4.b bVar, C4.a aVar, Integer num) {
        this.f57643a = vVar;
        this.f57644b = bVar;
        this.f57645c = aVar;
        this.f57646d = num;
    }
}
