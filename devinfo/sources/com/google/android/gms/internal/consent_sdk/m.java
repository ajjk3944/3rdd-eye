package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import j$.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements ConsentForm {

    /* renamed from: a, reason: collision with root package name */
    public final Application f19421a;

    /* renamed from: b, reason: collision with root package name */
    public final v f19422b;

    /* renamed from: c, reason: collision with root package name */
    public final h f19423c;

    /* renamed from: d, reason: collision with root package name */
    public final r f19424d;

    /* renamed from: e, reason: collision with root package name */
    public final p f19425e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f19426f;
    public Dialog g;

    /* renamed from: h, reason: collision with root package name */
    public u f19427h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f19428i = new AtomicBoolean();
    public final AtomicReference j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f19429k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f19430l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public boolean f19431m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19432n = false;

    public m(Application application, v vVar, h hVar, r rVar, p pVar, e0 e0Var) {
        this.f19421a = application;
        this.f19422b = vVar;
        this.f19423c = hVar;
        this.f19424d = rVar;
        this.f19425e = pVar;
        this.f19426f = e0Var;
    }

    public final void a(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        this.f19427h = this.f19425e.a();
        boolean z3 = this.f19431m;
        e0 e0Var = this.f19426f;
        if (!z3) {
            ((Queue) e0Var.j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        u uVar = this.f19427h;
        uVar.setBackgroundColor(0);
        uVar.getSettings().setJavaScriptEnabled(true);
        uVar.getSettings().setAllowFileAccess(false);
        uVar.getSettings().setAllowContentAccess(false);
        uVar.setWebViewClient(new t(uVar));
        if (!this.f19431m) {
            e0Var.a((Queue) e0Var.j.get(), 3, 2, null);
        }
        this.j.set(new l(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener));
        u uVar2 = this.f19427h;
        r rVar = this.f19424d;
        uVar2.loadDataWithBaseURL(rVar.f19500a, rVar.f19501b, "text/html", "UTF-8", null);
        j0.f19383a.postDelayed(new j(0, this), 10000L);
    }

    public final void b(r1 r1Var) {
        l lVar = (l) this.j.getAndSet(null);
        if (lVar == null) {
            return;
        }
        if (!this.f19431m) {
            String message = r1Var.getMessage();
            boolean z3 = this.f19432n;
            e0 e0Var = this.f19426f;
            if (z3) {
                e0Var.a((Queue) e0Var.f19330i.get(), 10, 11, message);
            } else {
                e0Var.a((Queue) e0Var.g.get(), 4, 5, message);
            }
        }
        lVar.onConsentFormLoadFailure(r1Var.a());
    }

    public final void c(r1 r1Var) {
        if (this.f19431m) {
            return;
        }
        String message = r1Var == null ? null : r1Var.getMessage();
        boolean z3 = this.f19432n;
        e0 e0Var = this.f19426f;
        if (z3) {
            e0Var.a((Queue) e0Var.f19330i.get(), 10, 11, message);
        } else {
            e0Var.a((Queue) e0Var.f19329h.get(), 6, 7, message);
        }
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        j0.a();
        ((Queue) this.f19426f.f19329h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!this.f19428i.compareAndSet(false, true)) {
            r1 r1Var = new r1(3, true != this.f19431m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            c(r1Var);
            onConsentFormDismissedListener.onConsentFormDismissed(r1Var.a());
            return;
        }
        u uVar = this.f19427h;
        x xVar = uVar.f19528b;
        Objects.requireNonNull(xVar);
        uVar.f19527a.post(new s(xVar, 0));
        k kVar = new k(this, activity);
        this.f19421a.registerActivityLifecycleCallbacks(kVar);
        this.f19430l.set(kVar);
        this.f19422b.f19541a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f19427h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            r1 r1Var2 = new r1(3, "Activity with null windows is passed in.");
            c(r1Var2);
            onConsentFormDismissedListener.onConsentFormDismissed(r1Var2.a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        com.bumptech.glide.f.A(window, false);
        this.f19429k.set(onConsentFormDismissedListener);
        dialog.show();
        this.g = dialog;
        this.f19427h.a("UMP_messagePresented", "");
        c(null);
    }
}
