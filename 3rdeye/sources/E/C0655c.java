package E;

import E.q;

/* compiled from: AutoValue_Image2JpegBytes_In.java */
/* renamed from: E.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0655c extends q.a {

    /* renamed from: a, reason: collision with root package name */
    public final N.m<androidx.camera.core.c> f1305a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1306b;

    public C0655c(N.m<androidx.camera.core.c> mVar, int i) {
        if (mVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f1305a = mVar;
        this.f1306b = i;
    }

    @Override // E.q.a
    public final int a() {
        return this.f1306b;
    }

    @Override // E.q.a
    public final N.m<androidx.camera.core.c> b() {
        return this.f1305a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.a)) {
            return false;
        }
        q.a aVar = (q.a) obj;
        return this.f1305a.equals(aVar.b()) && this.f1306b == aVar.a();
    }

    public final int hashCode() {
        return ((this.f1305a.hashCode() ^ 1000003) * 1000003) ^ this.f1306b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.f1305a);
        sb.append(", jpegQuality=");
        return B4.i.j(sb, this.f1306b, "}");
    }
}
