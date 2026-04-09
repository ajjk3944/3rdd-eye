package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class js implements l20 {
    public final boolean f;

    public js(boolean z) {
        this.f = z;
    }

    @Override // defpackage.l20
    public final boolean a() {
        return this.f;
    }

    @Override // defpackage.l20
    public final oh0 e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
