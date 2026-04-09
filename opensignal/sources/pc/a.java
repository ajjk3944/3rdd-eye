package pc;

import a5.t;
import android.os.Looper;
import bc.a0;
import bc.w;
import bc.x;
import cc.s;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
public final class a extends ac.f {
    public static final bm.e j = new bm.e("LocationServices.API", new ad.b(4), new ee.f(1));

    public dd.r d(ji.a aVar) {
        String simpleName = ji.a.class.getSimpleName();
        s.i(aVar, "Listener must not be null");
        s.f(simpleName, "Listener type must not be empty");
        return b(new bc.g(aVar, simpleName), 2418).e(dd.o.f7312d, df.c.f7340a);
    }

    public dd.r e(LocationRequest locationRequest, ji.a aVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            s.i(looper, "invalid null looper");
        }
        String simpleName = ji.a.class.getSimpleName();
        s.i(aVar, "Listener must not be null");
        zb.g gVar = new zb.g(looper, aVar, simpleName);
        h4 h4Var = new h4();
        h4Var.f5057g = this;
        h4Var.f5055a = true;
        h4Var.f5056d = gVar;
        om.f fVar = new om.f(h4Var, 3, locationRequest);
        t tVar = new t();
        tVar.f154b = fVar;
        tVar.f155c = h4Var;
        tVar.f156d = gVar;
        tVar.f153a = 2436;
        bc.g gVar2 = (bc.g) ((zb.g) tVar.f156d).f26826b;
        s.i(gVar2, "Key must not be null");
        zb.g gVar3 = (zb.g) tVar.f156d;
        int i10 = tVar.f153a;
        bc.j jVar = new bc.j(tVar, gVar3, i10);
        b9.e eVar = new b9.e(tVar, 5, gVar2);
        s.i((bc.g) gVar3.f26826b, "Listener has already been released.");
        bc.d dVar = this.f334i;
        dVar.getClass();
        dd.h hVar = new dd.h();
        dVar.b(hVar, i10, this);
        w wVar = new w(new a0(new x(jVar, eVar), hVar), dVar.E.get(), this);
        yh.a aVar2 = dVar.J;
        aVar2.sendMessage(aVar2.obtainMessage(8, wVar));
        return hVar.f7294a;
    }
}
