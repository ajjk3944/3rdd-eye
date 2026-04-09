package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j43 implements en1 {
    public final int a;

    public j43(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j43) && this.a == ((j43) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return ex0.j(new StringBuilder(String.valueOf(i).length() + 19), "Mp4AlternateGroup: ", i);
    }
}
