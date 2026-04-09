package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uc0 {
    public final MeasurementManager a;

    public uc0(Context context) {
        Object systemService = context.getSystemService((Class<Object>) tc0.m());
        i30.l(systemService, "context.getSystemService…:class.java\n            )");
        this.a = tc0.d(systemService);
    }

    public Object a(co coVar, oj ojVar) {
        new kd(1, uk2.r(ojVar)).u();
        tc0.o();
        throw null;
    }

    public Object b(oj ojVar) {
        kd kdVar = new kd(1, uk2.r(ojVar));
        kdVar.u();
        this.a.getMeasurementApiStatus(new i8(1), new sj(kdVar));
        return kdVar.t();
    }

    public Object c(Uri uri, InputEvent inputEvent, oj ojVar) throws Throwable {
        kd kdVar = new kd(1, uk2.r(ojVar));
        kdVar.u();
        this.a.registerSource(uri, inputEvent, new i8(1), new sj(kdVar));
        Object objT = kdVar.t();
        return objT == rk.f ? objT : z31.a;
    }

    public Object d(Uri uri, oj ojVar) throws Throwable {
        kd kdVar = new kd(1, uk2.r(ojVar));
        kdVar.u();
        this.a.registerTrigger(uri, new i8(1), new sj(kdVar));
        Object objT = kdVar.t();
        return objT == rk.f ? objT : z31.a;
    }

    public Object e(a81 a81Var, oj ojVar) {
        new kd(1, uk2.r(ojVar)).u();
        tc0.w();
        throw null;
    }

    public Object f(b81 b81Var, oj ojVar) {
        new kd(1, uk2.r(ojVar)).u();
        tc0.x();
        throw null;
    }
}
