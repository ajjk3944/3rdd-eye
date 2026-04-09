package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q70 extends r70 {
    public final im a;

    public q70(im imVar) {
        this.a = imVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q70.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((q70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (q70.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
