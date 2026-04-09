package K6;

import H6.C0672i;
import s6.i;

/* compiled from: DivSliderBinder.kt */
/* renamed from: K6.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727g1 implements i.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O6.y f3460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z0 f3461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0672i f3462d;

    public C0727g1(O6.y yVar, Z0 z02, C0672i c0672i) {
        this.f3460b = yVar;
        this.f3461c = z02;
        this.f3462d = c0672i;
    }

    @Override // s6.i.a
    public final void b(Object obj) {
        this.f3460b.w(((Long) obj) != null ? r4.longValue() : 0.0f, false, true);
    }

    @Override // s6.i.a
    public final void c(i.b bVar) {
        C0672i c0672i = this.f3462d;
        Z0 z02 = this.f3461c;
        O6.y yVar = this.f3460b;
        yVar.f47511c.b(new C0724f1(z02, c0672i, yVar, bVar));
    }
}
