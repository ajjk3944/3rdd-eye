package N;

import N.j;
import o0.b;

/* compiled from: AutoValue_DefaultSurfaceProcessor_PendingSnapshot.java */
/* loaded from: classes.dex */
public final class a extends j.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4363a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4364b;

    /* renamed from: c, reason: collision with root package name */
    public final b.a<Void> f4365c;

    public a(int i, int i10, b.a<Void> aVar) {
        this.f4363a = i;
        this.f4364b = i10;
        this.f4365c = aVar;
    }

    @Override // N.j.a
    public final b.a<Void> a() {
        return this.f4365c;
    }

    @Override // N.j.a
    public final int b() {
        return this.f4363a;
    }

    @Override // N.j.a
    public final int c() {
        return this.f4364b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j.a)) {
            return false;
        }
        j.a aVar = (j.a) obj;
        return this.f4363a == aVar.b() && this.f4364b == aVar.c() && this.f4365c.equals(aVar.a());
    }

    public final int hashCode() {
        return ((((this.f4363a ^ 1000003) * 1000003) ^ this.f4364b) * 1000003) ^ this.f4365c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f4363a + ", rotationDegrees=" + this.f4364b + ", completer=" + this.f4365c + "}";
    }
}
