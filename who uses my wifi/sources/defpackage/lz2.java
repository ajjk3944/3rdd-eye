package defpackage;

import android.app.AlertDialog;
import android.webkit.WebView;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lz2 extends TimerTask {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Timer g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public lz2(pz2 pz2Var, AlertDialog alertDialog, Timer timer, jh1 jh1Var) {
        this.h = alertDialog;
        this.g = timer;
        this.i = jh1Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.f;
        Timer timer = this.g;
        Object obj = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                ((AlertDialog) obj).dismiss();
                timer.cancel();
                jh1 jh1Var = (jh1) obj2;
                if (jh1Var != null) {
                    jh1Var.y();
                    return;
                }
                return;
            default:
                WebView webView = ((cc3) obj2).b;
                int i2 = c81.a;
                if (!f81.c.b()) {
                    throw f81.a();
                }
                ((WebViewProviderBoundaryInterface) c81.a(webView).g).removeWebMessageListener("omidJsSessionService");
                og2 og2Var = ((jg2) ((f23) obj).g).f;
                i63 i63Var = lf4.l;
                Objects.requireNonNull(og2Var);
                i63Var.post(new ig2(og2Var, 0));
                timer.cancel();
                return;
        }
    }

    public lz2(cc3 cc3Var, f23 f23Var, Timer timer) {
        this.h = f23Var;
        this.g = timer;
        Objects.requireNonNull(cc3Var);
        this.i = cc3Var;
    }
}
