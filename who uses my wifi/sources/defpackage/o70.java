package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o70 extends r70 {
    public final im a = im.c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o70.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((o70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (o70.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
