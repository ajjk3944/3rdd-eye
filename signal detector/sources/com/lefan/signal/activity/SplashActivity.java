package com.lefan.signal.activity;

import F4.b;
import R.F;
import R.O;
import R2.a;
import Y2.C0200b;
import Y2.S;
import Y2.W;
import Z3.c;
import android.R;
import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b4.C0344i;
import c.AbstractC0391p;
import c5.C0409f;
import c5.C0412i;
import com.lefan.signal.MainActivity;
import com.lefan.signal.MyApplication;
import h.AbstractActivityC2349g;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p1.e;
import q4.C2857a;
import q5.i;
import u4.CountDownTimerC2958c;
import u4.RunnableC2956a;

@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes.dex */
public final class SplashActivity extends AbstractActivityC2349g {

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ int f18821W = 0;

    /* renamed from: P, reason: collision with root package name */
    public TextView f18823P;

    /* renamed from: Q, reason: collision with root package name */
    public c f18824Q;

    /* renamed from: R, reason: collision with root package name */
    public C2857a f18825R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f18826S;

    /* renamed from: U, reason: collision with root package name */
    public boolean f18828U;

    /* renamed from: V, reason: collision with root package name */
    public CountDownTimerC2958c f18829V;

    /* renamed from: O, reason: collision with root package name */
    public final Handler f18822O = new Handler(Looper.getMainLooper());

    /* renamed from: T, reason: collision with root package name */
    public final AtomicBoolean f18827T = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, RemoteException -> 0x006b, blocks: (B:27:0x004d, B:29:0x0054, B:34:0x006d, B:37:0x007d, B:39:0x008e, B:41:0x00a0, B:48:0x00e5, B:49:0x0100, B:42:0x00b1, B:44:0x00bf, B:46:0x00d1, B:47:0x00dd, B:36:0x0078), top: B:57:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, RemoteException -> 0x006b, blocks: (B:27:0x004d, B:29:0x0054, B:34:0x006d, B:37:0x007d, B:39:0x008e, B:41:0x00a0, B:48:0x00e5, B:49:0x0100, B:42:0x00b1, B:44:0x00bf, B:46:0x00d1, B:47:0x00dd, B:36:0x0078), top: B:57:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.activity.SplashActivity.C():void");
    }

    public final void D() {
        this.f18828U = true;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        CountDownTimerC2958c countDownTimerC2958c = this.f18829V;
        if (countDownTimerC2958c != null) {
            countDownTimerC2958c.cancel();
        }
        this.f18829V = null;
        c cVar = this.f18824Q;
        if (cVar == null || cVar.b(this)) {
            return;
        }
        E();
    }

    public final void E() {
        Object objD;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        if (!isFinishing()) {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.putExtra("isSplashAdShow", true);
            try {
                startActivity(intent, ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out).toBundle());
                objD = C0412i.f5929a;
            } catch (Throwable th) {
                objD = a.d(th);
            }
            if (C0409f.a(objD) != null) {
                startActivity(intent);
            }
        }
        finish();
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        if (!isTaskRoot()) {
            finish();
            return;
        }
        setContentView(com.apm.insight.R.layout.ad_activity_splash);
        View viewFindViewById = findViewById(com.apm.insight.R.id.root);
        i.d(viewFindViewById, "findViewById(...)");
        int i = 0;
        b bVar = new b(0);
        WeakHashMap weakHashMap = O.f3270a;
        F.k(viewFindViewById, bVar);
        TextView textView = (TextView) findViewById(com.apm.insight.R.id.splash_app_name);
        if (textView != null) {
            textView.setText(getApplicationInfo().labelRes);
        }
        ImageView imageView = (ImageView) findViewById(com.apm.insight.R.id.splash_logo);
        if (imageView != null) {
            imageView.setImageResource(getApplicationInfo().icon);
        }
        this.f18824Q = MyApplication.f18814f;
        MyApplication.f18813e = this;
        this.f18826S = false;
        e eVar = C2857a.f23278b;
        Context applicationContext = getApplicationContext();
        i.d(applicationContext, "getApplicationContext(...)");
        C2857a c2857aE = eVar.e(applicationContext);
        this.f18825R = c2857aE;
        F4.c cVar = new F4.c(27, this);
        S s5 = c2857aE.f23280a;
        C0344i c0344i = new C0344i(8);
        U4.a aVar = new U4.a(this, 2, cVar);
        F4.c cVar2 = new F4.c(23, cVar);
        synchronized (s5.f4282d) {
            try {
                s5.f4284f = true;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        s5.f4286h = c0344i;
        C0200b c0200b = s5.f4280b;
        c0200b.getClass();
        ((Executor) c0200b.f4305d).execute(new W(c0200b, this, c0344i, aVar, cVar2));
        C2857a c2857a = this.f18825R;
        if (c2857a == null) {
            i.g("googleMobileAdsConsentManager");
            throw null;
        }
        if (c2857a.f23280a.a()) {
            C();
        } else {
            this.f18822O.postDelayed(new RunnableC2956a(this, i), 3000L);
        }
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MyApplication.f18813e = null;
        CountDownTimerC2958c countDownTimerC2958c = this.f18829V;
        if (countDownTimerC2958c != null) {
            countDownTimerC2958c.cancel();
        }
        this.f18829V = null;
        this.f18822O.removeCallbacksAndMessages(null);
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        i.e(keyEvent, "event");
        if (i == 3 || i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
