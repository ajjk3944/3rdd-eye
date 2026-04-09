package x3;

/* loaded from: classes2.dex */
public final class r implements u3.e {

    /* renamed from: a, reason: collision with root package name */
    public final o f24955a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24956b;

    /* renamed from: c, reason: collision with root package name */
    public final u3.b f24957c;

    /* renamed from: d, reason: collision with root package name */
    public final u3.d f24958d;

    /* renamed from: e, reason: collision with root package name */
    public final s f24959e;

    public r(o oVar, String str, u3.b bVar, u3.d dVar, s sVar) {
        this.f24955a = oVar;
        this.f24956b = str;
        this.f24957c = bVar;
        this.f24958d = dVar;
        this.f24959e = sVar;
    }

    public static /* synthetic */ void b(Exception exc) {
    }

    @Override // u3.e
    public void a(u3.c cVar) {
        c(cVar, new u3.g() { // from class: x3.q
            @Override // u3.g
            public final void a(Exception exc) {
                r.b(exc);
            }
        });
    }

    public void c(u3.c cVar, u3.g gVar) {
        this.f24959e.a(n.a().e(this.f24955a).c(cVar).f(this.f24956b).d(this.f24958d).b(this.f24957c).a(), gVar);
    }
}
