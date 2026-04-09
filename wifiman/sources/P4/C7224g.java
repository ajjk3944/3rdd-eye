package p4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p4.C7226i;

/* renamed from: p4.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7224g extends AbstractC7219b {

    /* renamed from: a, reason: collision with root package name */
    private final C7226i f57591a;

    /* renamed from: b, reason: collision with root package name */
    private final C4.b f57592b;

    /* renamed from: c, reason: collision with root package name */
    private final C4.a f57593c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f57594d;

    /* renamed from: p4.g$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C7226i f57595a;

        /* renamed from: b, reason: collision with root package name */
        private C4.b f57596b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f57597c;

        private C4.a b() {
            if (this.f57595a.e() == C7226i.c.f57609d) {
                return C4.a.a(new byte[0]);
            }
            if (this.f57595a.e() == C7226i.c.f57608c) {
                return C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f57597c.intValue()).array());
            }
            if (this.f57595a.e() == C7226i.c.f57607b) {
                return C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f57597c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f57595a.e());
        }

        public C7224g a() throws GeneralSecurityException {
            C7226i c7226i = this.f57595a;
            if (c7226i == null || this.f57596b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c7226i.c() != this.f57596b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f57595a.f() && this.f57597c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f57595a.f() && this.f57597c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C7224g(this.f57595a, this.f57596b, b(), this.f57597c);
        }

        public b c(Integer num) {
            this.f57597c = num;
            return this;
        }

        public b d(C4.b bVar) {
            this.f57596b = bVar;
            return this;
        }

        public b e(C7226i c7226i) {
            this.f57595a = c7226i;
            return this;
        }

        private b() {
            this.f57595a = null;
            this.f57596b = null;
            this.f57597c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private C7224g(C7226i c7226i, C4.b bVar, C4.a aVar, Integer num) {
        this.f57591a = c7226i;
        this.f57592b = bVar;
        this.f57593c = aVar;
        this.f57594d = num;
    }
}
