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
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
class f extends Dialog implements n1 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f3685a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f3686b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f3687c;

    /* renamed from: d, reason: collision with root package name */
    private final b f3688d;

    /* renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f3689e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f3690f;
    private e g;

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
        this.f3686b = kVar;
        this.f3687c = kVar.O();
        this.f3685a = activity;
        this.f3688d = bVar;
        this.f3689e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private void g() {
        this.f3685a.runOnUiThread(new t(this, 1));
    }

    @Override // com.applovin.impl.n1
    public void dismiss(String str) {
        this.f3685a.runOnUiThread(new t(this, 0));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f3688d.a("javascript:al_onBackPressed();");
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
                window.setFlags(this.f3685a.getWindow().getAttributes().flags, this.f3685a.getWindow().getAttributes().flags);
                window.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f3687c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f3687c.a("ExpandedAdDialog", "Setting window flags failed.", th2);
            }
        }
    }

    private void a() {
        this.f3688d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.g.isClickable()) {
            this.g.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f3688d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f3685a);
        this.f3690f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f3690f.setBackgroundColor(-1157627904);
        this.f3690f.addView(this.f3688d);
        if (!this.f3689e.l1()) {
            a(this.f3689e.f1());
            g();
        }
        setContentView(this.f3690f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f3690f.removeView(this.f3688d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.g == null) {
                a();
            }
            this.g.setVisibility(0);
            this.g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.g.startAnimation(alphaAnimation);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f3687c.a("ExpandedAdDialog", "Unable to fade in close button", th2);
            }
            a();
        }
    }

    public b c() {
        return this.f3688d;
    }

    private void a(e.a aVar) {
        if (this.g != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f3687c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e eVarA = e.a(aVar, this.f3685a);
        this.g = eVarA;
        eVarA.setVisibility(8);
        final int i4 = 0;
        this.g.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f3715b;

            {
                this.f3715b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.f3715b.a(view);
                        break;
                    default:
                        this.f3715b.b(view);
                        break;
                }
            }
        });
        this.g.setClickable(false);
        int iA = a(((Integer) this.f3686b.a(x4.f6187z1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.k kVar = this.f3686b;
        x4 x4Var = x4.C1;
        layoutParams.addRule(((Boolean) kVar.a(x4Var)).booleanValue() ? 9 : 11);
        this.g.a(iA);
        int iA2 = a(((Integer) this.f3686b.a(x4.B1)).intValue());
        int iA3 = a(((Integer) this.f3686b.a(x4.A1)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f3690f.addView(this.g, layoutParams);
        this.g.bringToFront();
        int iA4 = a(((Integer) this.f3686b.a(x4.D1)).intValue());
        View view = new View(this.f3685a);
        view.setBackgroundColor(0);
        int i10 = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f3686b.a(x4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        final int i11 = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f3715b;

            {
                this.f3715b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.f3715b.a(view2);
                        break;
                    default:
                        this.f3715b.b(view2);
                        break;
                }
            }
        });
        this.f3690f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f3689e;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.g.setClickable(true);
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

    private int a(int i4) {
        return AppLovinSdkUtils.dpToPx(this.f3685a, i4);
    }
}
