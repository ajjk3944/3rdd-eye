package p2;

import N7.C1154e9;
import android.graphics.Path;
import i2.C4448h;
import i2.z;
import k2.InterfaceC5212c;
import o2.C5410a;
import o2.C5413d;

/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public final class o implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f45072a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f45073b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45074c;

    /* renamed from: d, reason: collision with root package name */
    public final C5410a f45075d;

    /* renamed from: e, reason: collision with root package name */
    public final C5413d f45076e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f45077f;

    public o(String str, boolean z10, Path.FillType fillType, C5410a c5410a, C5413d c5413d, boolean z11) {
        this.f45074c = str;
        this.f45072a = z10;
        this.f45073b = fillType;
        this.f45075d = c5410a;
        this.f45076e = c5413d;
        this.f45077f = z11;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new k2.g(zVar, bVar, this);
    }

    public final String toString() {
        return C1154e9.k(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f45072a, '}');
    }
}
