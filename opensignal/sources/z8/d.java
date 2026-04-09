package z8;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final f f26716a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f26717b;

    /* renamed from: c, reason: collision with root package name */
    public final y8.a f26718c;

    /* renamed from: d, reason: collision with root package name */
    public final y8.a f26719d;

    /* renamed from: e, reason: collision with root package name */
    public final y8.a f26720e;

    /* renamed from: f, reason: collision with root package name */
    public final y8.a f26721f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26722g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26723h;

    public d(String str, f fVar, Path.FillType fillType, y8.a aVar, y8.a aVar2, y8.a aVar3, y8.a aVar4, boolean z10) {
        this.f26716a = fVar;
        this.f26717b = fillType;
        this.f26718c = aVar;
        this.f26719d = aVar2;
        this.f26720e = aVar3;
        this.f26721f = aVar4;
        this.f26722g = str;
        this.f26723h = z10;
    }

    @Override // z8.b
    public final t8.c a(r8.v vVar, r8.h hVar, a9.b bVar) {
        return new t8.h(vVar, hVar, bVar, this);
    }
}
