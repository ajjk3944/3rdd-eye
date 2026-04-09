package m7;

import f7.x;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f28933a;

    /* renamed from: b, reason: collision with root package name */
    public final List f28934b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28935c;

    public m(String str, List list, boolean z3) {
        this.f28933a = str;
        this.f28934b = list;
        this.f28935c = z3;
    }

    @Override // m7.b
    public final h7.d a(x xVar, f7.j jVar, n7.a aVar) {
        return new h7.e(xVar, aVar, this, jVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f28933a + "' Shapes: " + Arrays.toString(this.f28934b.toArray()) + '}';
    }
}
