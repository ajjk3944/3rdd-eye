package m7;

import android.graphics.Path;
import f7.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28927a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f28928b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28929c;

    /* renamed from: d, reason: collision with root package name */
    public final l7.a f28930d;

    /* renamed from: e, reason: collision with root package name */
    public final l7.a f28931e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28932f;

    public l(String str, boolean z3, Path.FillType fillType, l7.a aVar, l7.a aVar2, boolean z10) {
        this.f28929c = str;
        this.f28927a = z3;
        this.f28928b = fillType;
        this.f28930d = aVar;
        this.f28931e = aVar2;
        this.f28932f = z10;
    }

    @Override // m7.b
    public final h7.d a(x xVar, f7.j jVar, n7.a aVar) {
        return new h7.h(xVar, aVar, this);
    }

    public final String toString() {
        return d.h.x(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f28927a, '}');
    }
}
