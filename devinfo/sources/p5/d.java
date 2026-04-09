package p5;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import com.applovin.impl.da;
import u6.t;
import xk.h;
import xk.x;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d extends t {
    public final MeasurementManager j;

    public d(MeasurementManager measurementManager) {
        this.j = measurementManager;
    }

    public static Object F(d dVar, a aVar, ck.c<? super u> cVar) {
        new h(1, a.a.r(cVar)).s();
        MeasurementManager measurementManager = dVar.j;
        throw null;
    }

    public static Object G(d dVar, ck.c<? super Integer> cVar) {
        h hVar = new h(1, a.a.r(cVar));
        hVar.s();
        dVar.j.getMeasurementApiStatus(new da(1), new a4.e(hVar));
        return hVar.r();
    }

    public static Object I(d dVar, Uri uri, InputEvent inputEvent, ck.c<? super u> cVar) {
        h hVar = new h(1, a.a.r(cVar));
        hVar.s();
        dVar.j.registerSource(uri, inputEvent, new da(1), new a4.e(hVar));
        Object objR = hVar.r();
        return objR == dk.a.f22275a ? objR : u.f37649a;
    }

    public static Object J(d dVar, e eVar, ck.c<? super u> cVar) {
        Object objH = x.h(new androidx.lifecycle.u(dVar, (ck.c) null, 8), cVar);
        return objH == dk.a.f22275a ? objH : u.f37649a;
    }

    public static Object K(d dVar, Uri uri, ck.c<? super u> cVar) {
        h hVar = new h(1, a.a.r(cVar));
        hVar.s();
        dVar.j.registerTrigger(uri, new da(1), new a4.e(hVar));
        Object objR = hVar.r();
        return objR == dk.a.f22275a ? objR : u.f37649a;
    }

    public static Object M(d dVar, f fVar, ck.c<? super u> cVar) {
        new h(1, a.a.r(cVar)).s();
        MeasurementManager measurementManager = dVar.j;
        throw null;
    }

    public static Object O(d dVar, g gVar, ck.c<? super u> cVar) {
        new h(1, a.a.r(cVar)).s();
        MeasurementManager measurementManager = dVar.j;
        throw null;
    }

    public Object E(a aVar, ck.c<? super u> cVar) {
        return F(this, aVar, cVar);
    }

    public Object H(e eVar, ck.c<? super u> cVar) {
        return J(this, eVar, cVar);
    }

    public Object L(f fVar, ck.c<? super u> cVar) {
        return M(this, fVar, cVar);
    }

    public Object N(g gVar, ck.c<? super u> cVar) {
        return O(this, gVar, cVar);
    }

    @Override // u6.t
    public Object l(ck.c<? super Integer> cVar) {
        return G(this, cVar);
    }

    @Override // u6.t
    public Object o(Uri uri, InputEvent inputEvent, ck.c<? super u> cVar) {
        return I(this, uri, inputEvent, cVar);
    }

    @Override // u6.t
    public Object p(Uri uri, ck.c<? super u> cVar) {
        return K(this, uri, cVar);
    }
}
