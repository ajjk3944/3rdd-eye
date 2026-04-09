package z8;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f26773a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.b f26774b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f26775c;

    /* renamed from: d, reason: collision with root package name */
    public final y8.a f26776d;

    /* renamed from: e, reason: collision with root package name */
    public final y8.a f26777e;

    /* renamed from: f, reason: collision with root package name */
    public final y8.b f26778f;

    /* renamed from: g, reason: collision with root package name */
    public final t f26779g;

    /* renamed from: h, reason: collision with root package name */
    public final u f26780h;

    /* renamed from: i, reason: collision with root package name */
    public final float f26781i;
    public final boolean j;

    public v(String str, y8.b bVar, ArrayList arrayList, y8.a aVar, y8.a aVar2, y8.b bVar2, t tVar, u uVar, float f10, boolean z10) {
        this.f26773a = str;
        this.f26774b = bVar;
        this.f26775c = arrayList;
        this.f26776d = aVar;
        this.f26777e = aVar2;
        this.f26778f = bVar2;
        this.f26779g = tVar;
        this.f26780h = uVar;
        this.f26781i = f10;
        this.j = z10;
    }

    @Override // z8.b
    public final t8.c a(r8.v vVar, r8.h hVar, a9.b bVar) {
        return new t8.u(vVar, bVar, this);
    }
}
