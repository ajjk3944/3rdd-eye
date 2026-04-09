package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h93 implements f93 {
    public final String a;

    public h93(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h93) {
            return this.a.equals(((h93) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
