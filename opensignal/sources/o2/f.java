package o2;

import n0.b2;
import n0.x0;

/* loaded from: classes.dex */
public final class f extends j4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f18751a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f18752d;

    public f(x0 x0Var, g gVar) {
        this.f18751a = x0Var;
        this.f18752d = gVar;
    }

    @Override // j4.f
    public final void a() {
        this.f18752d.f18754d = j.f18757a;
    }

    @Override // j4.f
    public final void b() {
        ((b2) this.f18751a).setValue(Boolean.TRUE);
        this.f18752d.f18754d = new a5.d(2, true);
    }
}
