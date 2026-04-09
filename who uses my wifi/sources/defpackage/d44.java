package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d44 extends b44 {
    public final k44 f = new k44();

    public final b44 d(String str) {
        return (b44) this.f.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof d44) && ((d44) obj).f.equals(this.f);
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
