package V0;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final f f3827a;

    public k(f fVar) {
        this.f3827a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return this.f3827a.equals(((k) obj).f3827a);
    }

    public final int hashCode() {
        return this.f3827a.hashCode() + (k.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f3827a + '}';
    }
}
