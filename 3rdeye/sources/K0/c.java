package K0;

import java.util.Objects;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public final class c<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f2940a;

    /* renamed from: b, reason: collision with root package name */
    public final S f2941b;

    public c(F f10, S s10) {
        this.f2940a = f10;
        this.f2941b = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(cVar.f2940a, this.f2940a) && Objects.equals(cVar.f2941b, this.f2941b);
    }

    public final int hashCode() {
        F f10 = this.f2940a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f2941b;
        return (s10 != null ? s10.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f2940a + " " + this.f2941b + "}";
    }
}
