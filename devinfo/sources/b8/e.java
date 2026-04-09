package b8;

import a0.x0;
import android.content.Context;
import androidx.lifecycle.f1;
import d8.b0;
import d8.r;
import d8.v;
import d8.w;
import ea.j;
import ea.m;
import km.n;
import km.y;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements w, v2.c {

    /* renamed from: a, reason: collision with root package name */
    public Context f2078a;

    public /* synthetic */ e(Context context) {
        this.f2078a = context;
    }

    public j a() {
        Context context = this.f2078a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        j jVar = new j();
        jVar.f22497a = ga.a.a(m.f22505a);
        f4.e eVar = new f4.e(context);
        jVar.f22498b = eVar;
        jVar.f22499c = ga.a.a(new i(eVar, false, new jf.c(16, eVar), 17));
        f4.e eVar2 = jVar.f22498b;
        int i4 = 2;
        jVar.f22500d = new km.i(i4, eVar2);
        xj.a aVarA = ga.a.a(new n(2, jVar.f22500d, ga.a.a(new y(i4, eVar2))));
        jVar.f22501e = aVarA;
        ja.c cVar = new ja.c();
        f4.e eVar3 = jVar.f22498b;
        i0.f fVar = new i0.f(eVar3, aVarA, cVar, 6);
        xj.a aVar = jVar.f22497a;
        xj.a aVar2 = jVar.f22499c;
        jVar.f22502f = ga.a.a(new yb.e(new f1(aVar, aVar2, fVar, aVarA, aVarA, 13), new pe.c(eVar3, aVar2, aVarA, fVar, aVar, aVarA, aVarA, 2), new x0(aVar, aVarA, fVar, aVarA, 20), 14));
        return jVar;
    }

    @Override // d8.w
    public v i(b0 b0Var) {
        return new r(this.f2078a, 0);
    }
}
