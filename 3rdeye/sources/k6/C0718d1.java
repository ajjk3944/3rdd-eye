package K6;

import H6.C0672i;
import s6.i;

/* compiled from: DivSliderBinder.kt */
/* renamed from: K6.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718d1 implements i.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O6.y f3432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z0 f3433c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0672i f3434d;

    public C0718d1(O6.y yVar, Z0 z02, C0672i c0672i) {
        this.f3432b = yVar;
        this.f3433c = z02;
        this.f3434d = c0672i;
    }

    @Override // s6.i.a
    public final void b(Object obj) {
        this.f3432b.v(((Long) obj) != null ? Float.valueOf(r4.longValue()) : null, false, true);
    }

    @Override // s6.i.a
    public final void c(i.b bVar) {
        C0672i c0672i = this.f3434d;
        Z0 z02 = this.f3433c;
        O6.y yVar = this.f3432b;
        yVar.f47511c.b(new C0715c1(z02, c0672i, yVar, bVar));
    }
}
