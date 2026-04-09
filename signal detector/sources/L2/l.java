package L2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final a f2534a;

    /* renamed from: b, reason: collision with root package name */
    public final J2.d f2535b;

    public /* synthetic */ l(a aVar, J2.d dVar) {
        this.f2534a = aVar;
        this.f2535b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            if (M2.u.g(this.f2534a, lVar.f2534a) && M2.u.g(this.f2535b, lVar.f2535b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2534a, this.f2535b});
    }

    public final String toString() {
        V2.h hVar = new V2.h(this);
        hVar.g(this.f2534a, "key");
        hVar.g(this.f2535b, "feature");
        return hVar.toString();
    }
}
