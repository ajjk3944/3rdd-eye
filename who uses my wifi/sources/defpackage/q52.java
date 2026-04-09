package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q52 implements m52, c62 {
    public final ag2 f;

    public q52(Context context, e51 e51Var) throws hg2 {
        sd2 sd2Var = hg4.C.d;
        ag2 ag2VarB = sd2.b(context, new zq(0, 0, 0), "", false, false, null, null, e51Var, null, null, new cx1(), null, null, null, null, null);
        this.f = ag2VarB;
        ag2VarB.p0().setWillNotDraw(true);
    }

    public static final void e(Runnable runnable) {
        j63 j63Var = sv1.f.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gi2.G("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            gi2.G("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (lf4.l.post(runnable)) {
                return;
            }
            gi2.i0("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // defpackage.c62
    public final void h(String str, y32 y32Var) {
        this.f.E(str, new vg0(14, y32Var));
    }

    @Override // defpackage.m52, defpackage.r52
    public final void l(String str) {
        gi2.G("invokeJavascript on adWebView from js");
        e(new o52(this, str, 3));
    }

    @Override // defpackage.c62
    public final void p(String str, y32 y32Var) {
        this.f.v0(str, new n52(this, y32Var));
    }
}
