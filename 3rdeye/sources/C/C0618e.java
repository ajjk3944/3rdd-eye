package C;

import C.AbstractC0633u;

/* compiled from: AutoValue_CameraState.java */
/* renamed from: C.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618e extends AbstractC0633u {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0633u.b f693a;

    /* renamed from: b, reason: collision with root package name */
    public final C0619f f694b;

    public C0618e(AbstractC0633u.b bVar, C0619f c0619f) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f693a = bVar;
        this.f694b = c0619f;
    }

    @Override // C.AbstractC0633u
    public final AbstractC0633u.a a() {
        return this.f694b;
    }

    @Override // C.AbstractC0633u
    public final AbstractC0633u.b b() {
        return this.f693a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0633u)) {
            return false;
        }
        AbstractC0633u abstractC0633u = (AbstractC0633u) obj;
        if (!this.f693a.equals(abstractC0633u.b())) {
            return false;
        }
        C0619f c0619f = this.f694b;
        return c0619f == null ? abstractC0633u.a() == null : c0619f.equals(abstractC0633u.a());
    }

    public final int hashCode() {
        int iHashCode = (this.f693a.hashCode() ^ 1000003) * 1000003;
        C0619f c0619f = this.f694b;
        return iHashCode ^ (c0619f == null ? 0 : c0619f.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + this.f693a + ", error=" + this.f694b + "}";
    }
}
