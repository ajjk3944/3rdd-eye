package dt;

import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f7489c = i3.g.H(qs.b.j(or.n.f19690c.g()));

    /* renamed from: a, reason: collision with root package name */
    public final k f7490a;

    /* renamed from: b, reason: collision with root package name */
    public final gt.j f7491b;

    public i(k kVar) {
        this.f7490a = kVar;
        this.f7491b = kVar.f7493a.c(new as.d(11, this));
    }

    public final rr.f a(qs.b bVar, f fVar) {
        br.l.e(bVar, "classId");
        return (rr.f) this.f7491b.a(new h(bVar, fVar));
    }
}
