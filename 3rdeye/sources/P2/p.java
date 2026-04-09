package p2;

import i2.C4448h;
import i2.z;
import java.util.Arrays;
import java.util.List;
import k2.C5213d;
import k2.InterfaceC5212c;

/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public final class p implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final String f45078a;

    /* renamed from: b, reason: collision with root package name */
    public final List<InterfaceC5442b> f45079b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f45080c;

    public p(String str, List<InterfaceC5442b> list, boolean z10) {
        this.f45078a = str;
        this.f45079b = list;
        this.f45080c = z10;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new C5213d(zVar, bVar, this, c4448h);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f45078a + "' Shapes: " + Arrays.toString(this.f45079b.toArray()) + '}';
    }
}
