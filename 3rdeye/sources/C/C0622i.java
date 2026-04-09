package C;

import C.d0;

/* compiled from: AutoValue_SurfaceOutput_Event.java */
/* renamed from: C.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622i extends d0.b {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f716a;

    public C0622i(d0 d0Var) {
        if (d0Var == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f716a = d0Var;
    }

    @Override // C.d0.b
    public final int a() {
        return 0;
    }

    @Override // C.d0.b
    public final d0 b() {
        return this.f716a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.b)) {
            return false;
        }
        d0.b bVar = (d0.b) obj;
        return bVar.a() == 0 && this.f716a.equals(bVar.b());
    }

    public final int hashCode() {
        return this.f716a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f716a + "}";
    }
}
