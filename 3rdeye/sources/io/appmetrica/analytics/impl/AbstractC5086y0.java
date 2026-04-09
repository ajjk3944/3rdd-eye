package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5086y0 {
    public static T6 a(Handler handler, C5061x0 c5061x0) {
        return new T6(handler, c5061x0);
    }

    public static Nf a(Context context, T6 t62) {
        return new Nf(context, t62);
    }

    public static Gi a(Nf nf, Context context, ICommonExecutor iCommonExecutor) {
        C4780m0 c4780m0 = new C4780m0(context, iCommonExecutor, C5065x4.l().e());
        return new Gi(c4780m0, new Mn(new Eb()), new C4475a5(nf), new C4619fk(context, c4780m0));
    }

    public static Ll a(Context context, Gi gi, C4666hf c4666hf, Handler handler) {
        return new Ll(gi, new Tl(context, c4666hf), handler);
    }

    public static C5002ug a(Gi gi, C4666hf c4666hf, Handler handler) {
        return new C5002ug(gi, c4666hf, handler, c4666hf.s());
    }

    public static C5004ui a(Context context, Nf nf, Gi gi, Handler handler, Ll ll) {
        return new C5004ui(context, nf, gi, handler, ll);
    }
}
