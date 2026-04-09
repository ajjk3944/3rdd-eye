package z8;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26760a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f26761b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26762c;

    /* renamed from: d, reason: collision with root package name */
    public final y8.a f26763d;

    /* renamed from: e, reason: collision with root package name */
    public final y8.a f26764e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26765f;

    public q(String str, boolean z10, Path.FillType fillType, y8.a aVar, y8.a aVar2, boolean z11) {
        this.f26762c = str;
        this.f26760a = z10;
        this.f26761b = fillType;
        this.f26763d = aVar;
        this.f26764e = aVar2;
        this.f26765f = z11;
    }

    @Override // z8.b
    public final t8.c a(r8.v vVar, r8.h hVar, a9.b bVar) {
        return new t8.g(vVar, bVar, this);
    }

    public final String toString() {
        return c7.a.r(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f26760a, '}');
    }
}
