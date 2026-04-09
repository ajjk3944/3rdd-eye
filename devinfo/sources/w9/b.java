package w9;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final f f36539d;

    /* renamed from: b, reason: collision with root package name */
    public float f36540b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f36541c = 0.0f;

    static {
        f fVarA = f.a(256, new b());
        f36539d = fVarA;
        fVarA.f36554f = 0.5f;
    }

    @Override // w9.e
    public final e a() {
        return new b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f36540b == bVar.f36540b && this.f36541c == bVar.f36541c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36540b) ^ Float.floatToIntBits(this.f36541c);
    }

    public final String toString() {
        return this.f36540b + "x" + this.f36541c;
    }
}
