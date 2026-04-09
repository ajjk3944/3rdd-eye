package d0;

/* compiled from: AutoValue_VideoEncoderDataSpace.java */
/* loaded from: classes.dex */
public final class e extends AbstractC4255B {

    /* renamed from: e, reason: collision with root package name */
    public final int f37226e;

    /* renamed from: f, reason: collision with root package name */
    public final int f37227f;

    /* renamed from: g, reason: collision with root package name */
    public final int f37228g;

    public e(int i, int i10, int i11) {
        this.f37226e = i;
        this.f37227f = i10;
        this.f37228g = i11;
    }

    @Override // d0.AbstractC4255B
    public final int a() {
        return this.f37228g;
    }

    @Override // d0.AbstractC4255B
    public final int b() {
        return this.f37226e;
    }

    @Override // d0.AbstractC4255B
    public final int c() {
        return this.f37227f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4255B)) {
            return false;
        }
        AbstractC4255B abstractC4255B = (AbstractC4255B) obj;
        return this.f37226e == abstractC4255B.b() && this.f37227f == abstractC4255B.c() && this.f37228g == abstractC4255B.a();
    }

    public final int hashCode() {
        return this.f37228g ^ ((((this.f37226e ^ 1000003) * 1000003) ^ this.f37227f) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.f37226e);
        sb.append(", transfer=");
        sb.append(this.f37227f);
        sb.append(", range=");
        return B4.i.j(sb, this.f37228g, "}");
    }
}
