package z8;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f26766a;

    /* renamed from: b, reason: collision with root package name */
    public final List f26767b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26768c;

    public r(String str, List list, boolean z10) {
        this.f26766a = str;
        this.f26767b = list;
        this.f26768c = z10;
    }

    @Override // z8.b
    public final t8.c a(r8.v vVar, r8.h hVar, a9.b bVar) {
        return new t8.d(vVar, bVar, this, hVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f26766a + "' Shapes: " + Arrays.toString(this.f26767b.toArray()) + '}';
    }
}
