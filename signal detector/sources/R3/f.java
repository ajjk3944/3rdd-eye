package R3;

import A2.C0117e;
import h0.C2351a;

/* loaded from: classes.dex */
public final class f implements S3.c {

    /* renamed from: a, reason: collision with root package name */
    public final S3.c f3410a;

    public f(S3.c cVar) {
        this.f3410a = cVar;
    }

    @Override // S3.c, Y2.O
    public Object a() {
        d dVar = (d) this.f3410a.a();
        if (dVar != null) {
            return dVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ f(e eVar) {
        U0.j jVar = new U0.j(11, eVar);
        this.f3410a = S3.b.b(new f(S3.b.b(new V2.e(S3.b.b(new C2351a(jVar, 11, S3.b.b(new C0117e(13, jVar)))), S3.b.b(new U0.j(10, jVar)), jVar, 9))));
    }
}
