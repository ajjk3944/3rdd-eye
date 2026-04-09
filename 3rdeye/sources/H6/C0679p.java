package H6;

import N7.Tb;
import N7.Z;
import c9.C2087h;

/* compiled from: Div2View.kt */
/* renamed from: H6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679p extends kotlin.jvm.internal.m implements p9.l<Z, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2087h<Tb> f2217g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f2218h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0679p(C2087h<Tb> c2087h, A7.d dVar) {
        super(1);
        this.f2217g = c2087h;
        this.f2218h = dVar;
    }

    @Override // p9.l
    public final Boolean invoke(Z z10) {
        Z div = z10;
        kotlin.jvm.internal.l.f(div, "div");
        if (div instanceof Z.m) {
            this.f2217g.e(((Z.m) div).f7825c.f7707B.a(this.f2218h));
        }
        return Boolean.TRUE;
    }
}
