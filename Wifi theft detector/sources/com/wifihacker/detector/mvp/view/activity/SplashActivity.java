package com.wifihacker.detector.mvp.view.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.detector.mvp.view.activity.scan.QuickScanAnimationActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import g8.k;
import g8.o;
import g8.p;
import g8.q;
import g8.s;
import h8.f;
import h8.g;
import l8.g0;

/* loaded from: classes3.dex */
public class SplashActivity extends BaseActivity<g0> {

    /* renamed from: j, reason: collision with root package name */
    public boolean f20401j = false;

    public class a implements Runnable {

        /* renamed from: com.wifihacker.detector.mvp.view.activity.SplashActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0374a implements Runnable {

            /* renamed from: com.wifihacker.detector.mvp.view.activity.SplashActivity$a$a$a, reason: collision with other inner class name */
            public class RunnableC0375a implements Runnable {

                /* renamed from: com.wifihacker.detector.mvp.view.activity.SplashActivity$a$a$a$a, reason: collision with other inner class name */
                public class RunnableC0376a implements Runnable {
                    public RunnableC0376a() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        SplashActivity.this.o0();
                    }
                }

                public RunnableC0375a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (s.p()) {
                        SplashActivity.this.o0();
                    } else {
                        new Handler().postDelayed(new RunnableC0376a(), 2800L);
                    }
                }
            }

            public RunnableC0374a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (s.p()) {
                    SplashActivity.this.o0();
                } else {
                    new Handler().postDelayed(new RunnableC0375a(), 2800L);
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SplashActivity.this.f20401j) {
                return;
            }
            if (s.p() || s.t()) {
                SplashActivity.this.o0();
            } else {
                new Handler().postDelayed(new RunnableC0374a(), 2800L);
            }
        }
    }

    public class b implements Runnable {

        public class a extends f {

            /* renamed from: com.wifihacker.detector.mvp.view.activity.SplashActivity$b$a$a, reason: collision with other inner class name */
            public class C0377a extends f {

                /* renamed from: com.wifihacker.detector.mvp.view.activity.SplashActivity$b$a$a$a, reason: collision with other inner class name */
                public class C0378a extends f {
                    public C0378a() {
                        super(SplashActivity.this, null);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ((g0) SplashActivity.this.f20418i).f23253z.setVisibility(0);
                    }
                }

                public C0377a() {
                    super(SplashActivity.this, null);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SplashActivity splashActivity = SplashActivity.this;
                    splashActivity.p0(((g0) splashActivity.f20418i).B, new C0378a());
                }
            }

            public a() {
                super(SplashActivity.this, null);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SplashActivity splashActivity = SplashActivity.this;
                splashActivity.p0(((g0) splashActivity.f20418i).A, new C0377a());
                try {
                    if (s.t()) {
                        return;
                    }
                    h8.b.c().f();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    h8.b.c().f();
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.p0(((g0) splashActivity.f20418i).f23250w, new a());
        }
    }

    public class c implements g.c {
        public c() {
        }

        @Override // h8.g.c
        public void a() {
        }

        @Override // h8.g.c
        public void b() {
        }

        @Override // h8.g.c
        public void c() {
            SplashActivity.this.l0();
        }

        @Override // h8.g.c
        public void onInterstitialDismissed() {
        }
    }

    public class d implements f.c {
        public d() {
        }

        @Override // h8.f.c
        public void a() {
        }

        @Override // h8.f.c
        public void b() {
        }

        @Override // h8.f.c
        public void c() {
        }

        @Override // h8.f.c
        public void onInterstitialDismissed() {
        }
    }

    public class e extends AsyncTask {
        public e() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            try {
                if (o.c().b(SplashActivity.this, "app_widget_is_shortcut_intalled", false)) {
                    return null;
                }
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.putExtra("back_main", true);
                intent.setClass(SplashActivity.this.getApplicationContext(), QuickScanAnimationActivity.class);
                p.a(SplashActivity.this.getApplicationContext(), q.b(R.string.shortcuts_name), R.drawable.widget_logo, intent);
                o.c().m(SplashActivity.this, "app_widget_is_shortcut_intalled", true);
                return null;
            } catch (Exception e10) {
                k.b(Log.getStackTraceString(e10));
                return null;
            }
        }
    }

    public abstract class f implements Animator.AnimatorListener {
        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public /* synthetic */ f(SplashActivity splashActivity, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        if (isFinishing() || this.f20401j) {
            return;
        }
        try {
            HackerApplication.l().t();
            ((g0) this.f20418i).f23253z.setVisibility(4);
            h.d(this);
        } catch (Exception e10) {
            e10.printStackTrace();
            h.d(this);
        }
        finish();
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return null;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return null;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_splash;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        try {
            if (getApplicationContext() instanceof HackerApplication) {
                HackerApplication.j((HackerApplication) getApplicationContext());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        h8.a.f().j(0);
        h8.a.f().i(0);
        k0();
        m0();
        j0();
        s.x(this);
        w7.a.b().e(getApplicationContext());
        n0();
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Y() {
        this.f20401j = true;
        super.Y();
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }

    public final void j0() {
        if (Build.VERSION.SDK_INT < 30) {
            new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void k0() {
        if (s.t()) {
            return;
        }
        g.d().g(new c());
    }

    public final void l0() {
        h8.f.d().g(new d());
    }

    public final void m0() {
        new Handler().postDelayed(new a(), 5800L);
    }

    public final void n0() {
        ((g0) this.f20418i).f23250w.postDelayed(new b(), 900L);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        p0.c.c(this);
        super.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f20401j = true;
        super.onDestroy();
    }

    public final void p0(View view, f fVar) {
        view.setVisibility(0);
        new ObjectAnimator();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 100.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        if (fVar != null) {
            animatorSet.addListener(fVar);
        }
        animatorSet.setDuration(1300L);
        animatorSet.start();
    }
}
