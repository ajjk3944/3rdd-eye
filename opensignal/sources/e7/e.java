package e7;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.lifecycle.p;
import br.l;
import lq.b0;
import wt.w;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f7964a;

    public e(MeasurementManager measurementManager) {
        l.e(measurementManager, "mMeasurementManager");
        this.f7964a = measurementManager;
    }

    public static Object b(e eVar, a aVar, pq.c cVar) {
        new wt.g(1, xu.l.D(cVar)).v();
        MeasurementManager measurementManager = eVar.f7964a;
        throw null;
    }

    public static Object d(e eVar, pq.c cVar) {
        wt.g gVar = new wt.g(1, xu.l.D(cVar));
        gVar.v();
        eVar.f7964a.getMeasurementApiStatus(new d(0), new p3.b(gVar));
        Object objU = gVar.u();
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        return objU;
    }

    public static Object g(e eVar, Uri uri, InputEvent inputEvent, pq.c cVar) {
        wt.g gVar = new wt.g(1, xu.l.D(cVar));
        gVar.v();
        eVar.f7964a.registerSource(uri, inputEvent, new d(0), new p3.b(gVar));
        Object objU = gVar.u();
        return objU == qq.a.COROUTINE_SUSPENDED ? objU : b0.f15562a;
    }

    public static Object h(e eVar, f fVar, pq.c cVar) {
        Object objG = w.g(new p(eVar, (pq.c) null, 2), cVar);
        return objG == qq.a.COROUTINE_SUSPENDED ? objG : b0.f15562a;
    }

    public static Object j(e eVar, Uri uri, pq.c cVar) {
        wt.g gVar = new wt.g(1, xu.l.D(cVar));
        gVar.v();
        eVar.f7964a.registerTrigger(uri, new d(0), new p3.b(gVar));
        Object objU = gVar.u();
        return objU == qq.a.COROUTINE_SUSPENDED ? objU : b0.f15562a;
    }

    public static Object l(e eVar, g gVar, pq.c cVar) {
        new wt.g(1, xu.l.D(cVar)).v();
        MeasurementManager measurementManager = eVar.f7964a;
        throw null;
    }

    public static Object n(e eVar, h hVar, pq.c cVar) {
        new wt.g(1, xu.l.D(cVar)).v();
        MeasurementManager measurementManager = eVar.f7964a;
        throw null;
    }

    public Object a(a aVar, pq.c cVar) {
        return b(this, aVar, cVar);
    }

    public Object c(pq.c cVar) {
        return d(this, cVar);
    }

    public Object e(Uri uri, InputEvent inputEvent, pq.c cVar) {
        return g(this, uri, inputEvent, cVar);
    }

    public Object f(f fVar, pq.c cVar) {
        return h(this, fVar, cVar);
    }

    public Object i(Uri uri, pq.c cVar) {
        return j(this, uri, cVar);
    }

    public Object k(g gVar, pq.c cVar) {
        return l(this, gVar, cVar);
    }

    public Object m(h hVar, pq.c cVar) {
        return n(this, hVar, cVar);
    }
}
