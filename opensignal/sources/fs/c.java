package fs;

import br.n;
import ht.m0;
import rr.i;
import rr.r0;
import xr.q;

/* loaded from: classes.dex */
public final class c extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm.d f9057d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0 f9058g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f9059r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m0 f9060x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f9061y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bm.d dVar, r0 r0Var, a aVar, m0 m0Var, q qVar) {
        super(0);
        this.f9057d = dVar;
        this.f9058g = r0Var;
        this.f9059r = aVar;
        this.f9060x = m0Var;
        this.f9061y = qVar;
    }

    @Override // ar.a
    public final Object c() {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f9057d.f2828r;
        i iVarP = this.f9060x.p();
        return cVar.k(this.f9058g, a.a(a.a(this.f9059r, null, false, null, iVarP != null ? iVarP.q() : null, 31), null, this.f9061y.d(), null, null, 59));
    }
}
