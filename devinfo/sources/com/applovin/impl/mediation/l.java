package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.c3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.y2;
import com.google.android.material.button.MaterialButton;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.SystemInfoCard;
import sh.p0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f4814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4816f;
    public final /* synthetic */ Object g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4817h;

    public /* synthetic */ l(MediationServiceImpl mediationServiceImpl, c3 c3Var, h hVar, ViewGroup viewGroup, androidx.lifecycle.t tVar, Activity activity, a.InterfaceC0014a interfaceC0014a) {
        this.f4811a = 1;
        this.f4812b = mediationServiceImpl;
        this.f4816f = c3Var;
        this.f4813c = hVar;
        this.g = viewGroup;
        this.f4817h = tVar;
        this.f4814d = activity;
        this.f4815e = interfaceC0014a;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        int i4 = this.f4811a;
        Object obj = this.f4815e;
        KeyEvent.Callback callback = this.f4814d;
        Object obj2 = this.f4817h;
        Object obj3 = this.g;
        Object obj4 = this.f4816f;
        Object obj5 = this.f4813c;
        Object obj6 = this.f4812b;
        switch (i4) {
            case 0:
                ((MediationServiceImpl) obj6).a((h) obj5, (String) obj4, (MaxAdapterParametersImpl) obj3, (y2) obj2, (Activity) callback, (a.InterfaceC0014a) obj);
                break;
            case 1:
                ((MediationServiceImpl) obj6).a((c3) obj4, (h) obj5, (ViewGroup) obj3, (androidx.lifecycle.t) obj2, (Activity) callback, (a.InterfaceC0014a) obj);
                break;
            case 2:
                SystemInfoCard systemInfoCard = (SystemInfoCard) obj6;
                int i10 = SystemInfoCard.f21219b;
                ((TextView) obj5).setText(systemInfoCard.a((Boolean) obj4));
                ((TextView) obj3).setText(systemInfoCard.a((Boolean) obj2));
                ((TextView) callback).setText(systemInfoCard.a((Boolean) obj));
                break;
            default:
                p0 p0Var = (p0) obj6;
                View view = (View) obj5;
                View view2 = (View) callback;
                MaterialButton materialButton = (MaterialButton) obj;
                p0Var.f33750e0 = view;
                int dimensionPixelSize = p0Var.f33746a0.getResources().getDimensionPixelSize(R.dimen.content_padding);
                p0Var.f33746a0.removeAllViews();
                p0Var.f33746a0.addView(view, p0.i0(0));
                p0Var.f33753h0.run();
                p0Var.f33746a0.addView((ViewGroup) obj4, p0.i0(dimensionPixelSize));
                p0Var.f33746a0.addView((View) obj3, p0.i0(dimensionPixelSize));
                p0Var.f33746a0.addView((View) obj2, p0.i0(dimensionPixelSize));
                if (view2 != null) {
                    p0Var.f33746a0.addView(view2, p0.i0(dimensionPixelSize));
                }
                LinearLayout.LayoutParams layoutParamsI0 = p0.i0(dimensionPixelSize);
                layoutParamsI0.bottomMargin = layoutParamsI0.topMargin * 2;
                p0Var.f33746a0.addView(materialButton, layoutParamsI0);
                break;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, KeyEvent.Callback callback, Object obj6, int i4) {
        this.f4811a = i4;
        this.f4812b = obj;
        this.f4813c = obj2;
        this.f4816f = obj3;
        this.g = obj4;
        this.f4817h = obj5;
        this.f4814d = callback;
        this.f4815e = obj6;
    }
}
