package c5;

import java.io.IOException;

/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes2.dex */
public final class i implements Z4.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18504a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18505b = false;

    /* renamed from: c, reason: collision with root package name */
    public Z4.c f18506c;

    /* renamed from: d, reason: collision with root package name */
    public final f f18507d;

    public i(f fVar) {
        this.f18507d = fVar;
    }

    @Override // Z4.g
    public final Z4.g add(String str) throws IOException {
        if (this.f18504a) {
            throw new Z4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f18504a = true;
        this.f18507d.i(this.f18506c, str, this.f18505b);
        return this;
    }

    @Override // Z4.g
    public final Z4.g f(boolean z10) throws IOException {
        if (this.f18504a) {
            throw new Z4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f18504a = true;
        this.f18507d.g(this.f18506c, z10 ? 1 : 0, this.f18505b);
        return this;
    }
}
