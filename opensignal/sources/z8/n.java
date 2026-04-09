package z8;

/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26750a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26751b;

    /* renamed from: c, reason: collision with root package name */
    public final y8.b f26752c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26753d;

    /* renamed from: e, reason: collision with root package name */
    public final y8.e f26754e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f26755f;

    public n(String str, y8.b bVar, y8.b bVar2, y8.d dVar, boolean z10) {
        this.f26751b = str;
        this.f26752c = bVar;
        this.f26754e = bVar2;
        this.f26755f = dVar;
        this.f26753d = z10;
    }

    @Override // z8.b
    public final t8.c a(r8.v vVar, r8.h hVar, a9.b bVar) {
        switch (this.f26750a) {
            case 0:
                return new t8.q(vVar, bVar, this);
            case 1:
                return new t8.r(vVar, bVar, this);
            default:
                return new t8.v(bVar, this);
        }
    }

    public String toString() {
        switch (this.f26750a) {
            case 0:
                return "RectangleShape{position=" + this.f26754e + ", size=" + ((y8.e) this.f26755f) + '}';
            case 1:
            default:
                return super.toString();
            case 2:
                return "Trim Path: {start: " + this.f26752c + ", end: " + ((y8.b) this.f26754e) + ", offset: " + ((y8.b) this.f26755f) + "}";
        }
    }

    public n(String str, y8.e eVar, y8.a aVar, y8.b bVar, boolean z10) {
        this.f26751b = str;
        this.f26754e = eVar;
        this.f26755f = aVar;
        this.f26752c = bVar;
        this.f26753d = z10;
    }

    public n(String str, w wVar, y8.b bVar, y8.b bVar2, y8.b bVar3, boolean z10) {
        this.f26751b = wVar;
        this.f26752c = bVar;
        this.f26754e = bVar2;
        this.f26755f = bVar3;
        this.f26753d = z10;
    }
}
