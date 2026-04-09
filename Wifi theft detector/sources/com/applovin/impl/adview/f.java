package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.e;
import com.applovin.impl.n1;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
class f extends Dialog implements n1 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f5492a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5493b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f5494c;

    /* renamed from: d, reason: collision with root package name */
    private final b f5495d;

    /* renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f5496e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f5497f;

    /* renamed from: g, reason: collision with root package name */
    private e f5498g;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f5498g.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f5493b = kVar;
        this.f5494c = kVar.O();
        this.f5492a = activity;
        this.f5495d = bVar;
        this.f5496e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private void g() {
        this.f5492a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5511a.f();
            }
        });
    }

    @Override // com.applovin.impl.n1
    public void dismiss(String str) {
        this.f5492a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5506a.e();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f5495d.a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f5492a.getWindow().getAttributes().flags, this.f5492a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f5494c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5494c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a() {
        this.f5495d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f5498g.isClickable()) {
            this.f5498g.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f5495d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f5492a);
        this.f5497f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f5497f.setBackgroundColor(-1157627904);
        this.f5497f.addView(this.f5495d);
        if (!this.f5496e.l1()) {
            a(this.f5496e.f1());
            g();
        }
        setContentView(this.f5497f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f5497f.removeView(this.f5495d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f5498g == null) {
                a();
            }
            this.f5498g.setVisibility(0);
            this.f5498g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f5498g.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5494c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    public b c() {
        return this.f5495d;
    }

    private void a(e.a aVar) {
        if (this.f5498g != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5494c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e eVarA = e.a(aVar, this.f5492a);
        this.f5498g = eVarA;
        eVarA.setVisibility(8);
        this.f5498g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5502a.a(view);
            }
        });
        this.f5498g.setClickable(false);
        int iA = a(((Integer) this.f5493b.a(x4.f8628z1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.k kVar = this.f5493b;
        x4 x4Var = x4.C1;
        layoutParams.addRule(((Boolean) kVar.a(x4Var)).booleanValue() ? 9 : 11);
        this.f5498g.a(iA);
        int iA2 = a(((Integer) this.f5493b.a(x4.B1)).intValue());
        int iA3 = a(((Integer) this.f5493b.a(x4.A1)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f5497f.addView(this.f5498g, layoutParams);
        this.f5498g.bringToFront();
        int iA4 = a(((Integer) this.f5493b.a(x4.D1)).intValue());
        View view = new View(this.f5492a);
        view.setBackgroundColor(0);
        int i10 = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f5493b.a(x4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f5503a.b(view2);
            }
        });
        this.f5497f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f5496e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f5492a, i10);
    }
}
