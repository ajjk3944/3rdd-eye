package z8;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f26709a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.e f26710b;

    /* renamed from: c, reason: collision with root package name */
    public final y8.a f26711c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26712d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26713e;

    public a(String str, y8.e eVar, y8.a aVar, boolean z10, boolean z11) {
        this.f26709a = str;
        this.f26710b = eVar;
        this.f26711c = aVar;
        this.f26712d = z10;
        this.f26713e = z11;
    }

    @Override // z8.b
    public final t8.c a(r8.v vVar, r8.h hVar, a9.b bVar) {
        return new t8.f(vVar, bVar, this);
    }
}
