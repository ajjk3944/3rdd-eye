package o2;

import android.graphics.Typeface;
import ar.p;
import br.l;
import io.sentry.k;
import k2.c0;
import k2.d0;
import k2.n;
import k2.o;
import k2.r;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f18735a;

    public /* synthetic */ c(d dVar) {
        this.f18735a = dVar;
    }

    @Override // ar.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        d dVar = this.f18735a;
        d0 d0VarB = ((k2.i) dVar.f18740x).b((k2.h) obj, (r) obj2, ((n) obj3).f13996a, ((o) obj4).f13997a);
        if (d0VarB instanceof c0) {
            Object obj5 = ((c0) d0VarB).f13979a;
            l.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) obj5;
        }
        k kVar = new k(d0VarB, dVar.F);
        dVar.F = kVar;
        Object obj6 = kVar.f12399r;
        l.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj6;
    }
}
