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
import com.applovin.impl.i1;
import com.applovin.impl.l4;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
class f extends Dialog implements i1 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f19046a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19047b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f19048c;

    /* renamed from: d, reason: collision with root package name */
    private final b f19049d;

    /* renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f19050e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f19051f;

    /* renamed from: g, reason: collision with root package name */
    private e f19052g;

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
        this.f19047b = kVar;
        this.f19048c = kVar.O();
        this.f19046a = activity;
        this.f19049d = bVar;
        this.f19050e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private void g() {
        this.f19046a.runOnUiThread(new x(this, 0));
    }

    @Override // com.applovin.impl.i1
    public void dismiss(String str) {
        this.f19046a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f19077b.e();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f19049d.a("javascript:al_onBackPressed();");
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
                window.setFlags(this.f19046a.getWindow().getAttributes().flags, this.f19046a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f19048c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f19048c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a() {
        this.f19049d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f19052g.isClickable()) {
            this.f19052g.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f19049d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f19046a);
        this.f19051f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f19051f.setBackgroundColor(-1157627904);
        this.f19051f.addView(this.f19049d);
        if (!this.f19050e.t1()) {
            a(this.f19050e.n1());
            g();
        }
        setContentView(this.f19051f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f19051f.removeView(this.f19049d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f19052g == null) {
                a();
            }
            this.f19052g.setVisibility(0);
            this.f19052g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f19052g.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f19048c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    public b c() {
        return this.f19049d;
    }

    private void a(e.a aVar) {
        if (this.f19052g != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f19048c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e eVarA = e.a(aVar, this.f19046a);
        this.f19052g = eVarA;
        eVarA.setVisibility(8);
        this.f19052g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19075b.a(view);
            }
        });
        this.f19052g.setClickable(false);
        int iA = a(((Integer) this.f19047b.a(l4.f20060x1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.k kVar = this.f19047b;
        l4 l4Var = l4.f19695A1;
        layoutParams.addRule(((Boolean) kVar.a(l4Var)).booleanValue() ? 9 : 11);
        this.f19052g.a(iA);
        int iA2 = a(((Integer) this.f19047b.a(l4.f20076z1)).intValue());
        int iA3 = a(((Integer) this.f19047b.a(l4.f20068y1)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f19051f.addView(this.f19052g, layoutParams);
        this.f19052g.bringToFront();
        int iA4 = a(((Integer) this.f19047b.a(l4.f19703B1)).intValue());
        View view = new View(this.f19046a);
        view.setBackgroundColor(0);
        int i = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f19047b.a(l4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f19076b.b(view2);
            }
        });
        this.f19051f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f19050e;
    }

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f19052g.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f19046a, i);
    }
}
