package defpackage;

import android.R;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bw1 {
    public final Application a;
    public final aa2 b;
    public final mo1 c;
    public final z52 d;
    public final vq2 e;
    public Dialog f;
    public u82 g;
    public final AtomicBoolean h = new AtomicBoolean();
    public final AtomicReference i = new AtomicReference();
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public boolean l = false;

    public bw1(Application application, aa2 aa2Var, mo1 mo1Var, z52 z52Var, vq2 vq2Var) {
        this.a = application;
        this.b = aa2Var;
        this.c = mo1Var;
        this.d = z52Var;
        this.e = vq2Var;
    }

    public final void a(i5 i5Var, lz lzVar) {
        ok2.a();
        if (!this.h.compareAndSet(false, true)) {
            lzVar.a(new ah3(true != this.l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.", 3).a());
            return;
        }
        u82 u82Var = this.g;
        gi1 gi1Var = u82Var.g;
        Objects.requireNonNull(gi1Var);
        u82Var.f.post(new g72(gi1Var, 0));
        au1 au1Var = new au1(this, i5Var);
        this.a.registerActivityLifecycleCallbacks(au1Var);
        this.k.set(au1Var);
        this.b.a = i5Var;
        Dialog dialog = new Dialog(i5Var, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.g);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            lzVar.a(new ah3("Activity with null windows is passed in.", 3).a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        pu1.n(window, false);
        this.j.set(lzVar);
        dialog.show();
        this.f = dialog;
        this.g.a("UMP_messagePresented", "");
    }

    public final void b(f41 f41Var, e41 e41Var) {
        vq2 vq2Var = this.e;
        aa2 aa2Var = (aa2) ((ls2) vq2Var.g).mo18a();
        Handler handler = ok2.a;
        pu1.s(handler);
        u82 u82Var = new u82(aa2Var, handler, ((bu1) vq2Var.h).p());
        this.g = u82Var;
        u82Var.setBackgroundColor(0);
        u82Var.getSettings().setJavaScriptEnabled(true);
        u82Var.getSettings().setAllowFileAccess(false);
        u82Var.getSettings().setAllowContentAccess(false);
        u82Var.setWebViewClient(new er0(1, u82Var));
        this.i.set(new yu1(f41Var, e41Var));
        u82 u82Var2 = this.g;
        z52 z52Var = this.d;
        u82Var2.loadDataWithBaseURL(z52Var.a, z52Var.b, "text/html", "UTF-8", null);
        handler.postDelayed(new a9(28, this), 10000L);
    }
}
