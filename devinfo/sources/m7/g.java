package m7;

import f7.x;
import f7.y;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f28906a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28907b;

    public g(boolean z3, int i4, String str) {
        this.f28906a = i4;
        this.f28907b = z3;
    }

    @Override // m7.b
    public final h7.d a(x xVar, f7.j jVar, n7.a aVar) {
        if (((HashSet) xVar.f23810l.f30421b).contains(y.f23825a)) {
            return new h7.m(this);
        }
        r7.d.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MergePaths{mode=");
        int i4 = this.f28906a;
        sb2.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb2.append('}');
        return sb2.toString();
    }
}
