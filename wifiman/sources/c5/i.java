package c5;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* loaded from: classes3.dex */
class i implements Z4.f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33883a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33884b = false;

    /* renamed from: c, reason: collision with root package name */
    private Z4.b f33885c;

    /* renamed from: d, reason: collision with root package name */
    private final f f33886d;

    i(f fVar) {
        this.f33886d = fVar;
    }

    private void b() {
        if (this.f33883a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f33883a = true;
    }

    @Override // Z4.f
    public Z4.f a(String str) throws IOException {
        b();
        this.f33886d.i(this.f33885c, str, this.f33884b);
        return this;
    }

    void c(Z4.b bVar, boolean z10) {
        this.f33883a = false;
        this.f33885c = bVar;
        this.f33884b = z10;
    }

    @Override // Z4.f
    public Z4.f g(boolean z10) {
        b();
        this.f33886d.o(this.f33885c, z10, this.f33884b);
        return this;
    }
}
