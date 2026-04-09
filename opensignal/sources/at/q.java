package at;

import com.google.android.gms.internal.measurement.e5;

/* loaded from: classes.dex */
public final class q extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2305d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f2306g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(0);
        this.f2305d = i10;
        this.f2306g = rVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f2305d) {
            case 0:
                ft.i iVar = this.f2306g.f2308b;
                return e5.I(ts.o.i(iVar), ts.o.j(iVar));
            default:
                return e5.J(ts.o.h(this.f2306g.f2308b));
        }
    }
}
