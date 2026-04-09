package Y2;

import android.R;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import h.AbstractActivityC2349g;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p4.C2781h;
import q2.C2834o;

/* renamed from: Y2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207i {

    /* renamed from: a, reason: collision with root package name */
    public final Application f4329a;

    /* renamed from: b, reason: collision with root package name */
    public final C0214p f4330b;

    /* renamed from: c, reason: collision with root package name */
    public final C0204f f4331c;

    /* renamed from: d, reason: collision with root package name */
    public final C0210l f4332d;

    /* renamed from: e, reason: collision with root package name */
    public final V2.h f4333e;

    /* renamed from: f, reason: collision with root package name */
    public Dialog f4334f;

    /* renamed from: g, reason: collision with root package name */
    public C0213o f4335g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f4336h = new AtomicBoolean();
    public final AtomicReference i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f4337j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f4338k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public boolean f4339l = false;

    public C0207i(Application application, C0214p c0214p, C0204f c0204f, C0210l c0210l, V2.h hVar) {
        this.f4329a = application;
        this.f4330b = c0214p;
        this.f4331c = c0204f;
        this.f4332d = c0210l;
        this.f4333e = hVar;
    }

    public final void a(AbstractActivityC2349g abstractActivityC2349g, C2781h c2781h) {
        z.a();
        if (!this.f4336h.compareAndSet(false, true)) {
            c2781h.a(new Q(3, true != this.f4339l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").a());
            return;
        }
        C0213o c0213o = this.f4335g;
        C0200b c0200b = c0213o.f4354b;
        Objects.requireNonNull(c0200b);
        c0213o.f4353a.post(new RunnableC0211m(c0200b, 0));
        C0205g c0205g = new C0205g(this, abstractActivityC2349g);
        this.f4329a.registerActivityLifecycleCallbacks(c0205g);
        this.f4338k.set(c0205g);
        this.f4330b.f4356a = abstractActivityC2349g;
        Dialog dialog = new Dialog(abstractActivityC2349g, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f4335g);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            c2781h.a(new Q(3, "Activity with null windows is passed in.").a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        com.bumptech.glide.e.x(window, false);
        this.f4337j.set(c2781h);
        dialog.show();
        this.f4334f = dialog;
        this.f4335g.a("UMP_messagePresented", "");
    }

    public final void b(e4.d dVar, e4.c cVar) {
        V2.h hVar = this.f4333e;
        C0214p c0214p = (C0214p) ((O) hVar.f3875b).a();
        Handler handler = z.f4385a;
        A.c(handler);
        C0213o c0213o = new C0213o(c0214p, handler, ((C2834o) hVar.f3876c).g());
        this.f4335g = c0213o;
        c0213o.setBackgroundColor(0);
        c0213o.getSettings().setJavaScriptEnabled(true);
        c0213o.getSettings().setAllowFileAccess(false);
        c0213o.getSettings().setAllowContentAccess(false);
        c0213o.setWebViewClient(new C0212n(0, c0213o));
        this.i.set(new C0206h(dVar, cVar));
        C0213o c0213o2 = this.f4335g;
        C0210l c0210l = this.f4332d;
        c0213o2.loadDataWithBaseURL(c0210l.f4346a, c0210l.f4347b, "text/html", "UTF-8", null);
        handler.postDelayed(new C0.k(13, this), 10000L);
    }
}
