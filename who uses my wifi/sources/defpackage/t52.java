package defpackage;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t52 implements y32 {
    public final /* synthetic */ int f = 0;
    public final Object g;
    public final Object h;
    public final Object i;

    public t52(mm2 mm2Var, q52 q52Var, f20 f20Var) {
        this.g = q52Var;
        this.h = f20Var;
        this.i = mm2Var;
    }

    @Override // defpackage.y32
    public final void c(Object obj, Map map) {
        switch (this.f) {
            case 0:
                gi2.G("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                mm2 mm2Var = (mm2) this.i;
                synchronized (mm2Var.b) {
                    try {
                        gi2.G("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        gi2.f0("JS Engine is requesting an update");
                        if (mm2Var.g == 0) {
                            gi2.f0("Starting reload.");
                            mm2Var.g = 2;
                            mm2Var.a();
                        }
                        ((q52) this.g).h("/requestReload", (t52) ((f20) this.h).g);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gi2.G("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((t22) this.g).Q0((p22) ((z94) this.i).d(), str);
                    return;
                } catch (RemoteException unused) {
                    new StringBuilder(String.valueOf(str).length() + 40);
                    gi2.q0(5);
                    return;
                }
        }
    }

    public t52(yr2 yr2Var, tr2 tr2Var, au2 au2Var, z94 z94Var) {
        this.g = (t22) yr2Var.g.get(tr2Var.g());
        this.h = au2Var;
        this.i = z94Var;
    }
}
