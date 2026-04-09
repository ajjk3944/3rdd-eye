package com.applovin.impl;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.Toast;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.splash.SplashActivity;
import com.liuzh.deviceinfo.view.StarAnimView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class j9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4345d;

    public /* synthetic */ j9(Object obj, boolean z3, Object obj2, int i4) {
        this.f4342a = i4;
        this.f4344c = obj;
        this.f4343b = z3;
        this.f4345d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f4342a;
        Object obj = this.f4345d;
        boolean z3 = this.f4343b;
        Object obj2 = this.f4344c;
        switch (i4) {
            case 0:
                ((g0) obj2).a(z3, (Runnable) obj);
                break;
            case 1:
                t2.a(z3, (MaxAdRequestListener) obj2, (String) obj);
                break;
            case 2:
                t2.a(z3, (MaxAdRevenueListener) obj2, (MaxAd) obj);
                break;
            case 3:
                i.g gVar = (i.g) obj2;
                rg.c cVar = (rg.c) obj;
                if (!com.liuzh.deviceinfo.utilities.d.l(gVar)) {
                    if (z3) {
                        Toast.makeText(gVar, R.string.export_successful, 0).show();
                    } else {
                        Toast.makeText(gVar, R.string.failed, 0).show();
                    }
                    try {
                        cVar.d0(false, false);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                SplashActivity splashActivity = (SplashActivity) ((od.b) obj2).f30526d;
                int i10 = 1;
                if (!z3) {
                    int i11 = SplashActivity.K;
                    je.u.k(splashActivity, new rh.e(splashActivity, System.currentTimeMillis(), i10), ag.a.b("ca-app-pub-3724073793374078/1625231375"));
                    z3 = true;
                }
                int i12 = 8;
                viewGroup.setVisibility(8);
                StarAnimView starAnimView = splashActivity.B;
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) ((starAnimView.getMeasuredHeight() * 6.0f) / 7.0f));
                starAnimView.f21364e = valueAnimatorOfInt;
                valueAnimatorOfInt.addUpdateListener(new eh.a(6, starAnimView));
                starAnimView.f21364e.addListener(new ad.g(7, starAnimView));
                starAnimView.f21364e.setDuration(1800L);
                starAnimView.f21364e.setInterpolator(new d5.a(1));
                starAnimView.f21364e.start();
                if (!z3) {
                    splashActivity.E(2600L, false);
                    break;
                } else if (!splashActivity.J) {
                    i0.f fVar = splashActivity.E;
                    if (fVar != null) {
                        if (!splashActivity.A) {
                            fVar.T(splashActivity, new nm.d0(i12, splashActivity));
                            splashActivity.E = null;
                            break;
                        } else {
                            splashActivity.E(0L, false);
                            break;
                        }
                    } else {
                        splashActivity.I = true;
                        splashActivity.E(22000L, false);
                        break;
                    }
                } else {
                    splashActivity.E(2600L, false);
                    break;
                }
        }
    }

    public /* synthetic */ j9(boolean z3, Object obj, Object obj2, int i4) {
        this.f4342a = i4;
        this.f4343b = z3;
        this.f4344c = obj;
        this.f4345d = obj2;
    }
}
