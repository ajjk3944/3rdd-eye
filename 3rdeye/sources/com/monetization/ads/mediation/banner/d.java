package com.monetization.ads.mediation.banner;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.ao1;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.bo1;
import com.yandex.mobile.ads.impl.fa;
import com.yandex.mobile.ads.impl.ng2;
import com.yandex.mobile.ads.impl.vy1;
import kotlin.jvm.internal.l;
import w9.i;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ i<Object>[] f23692d = {fa.a(d.class, "adView", "getAdView()Landroid/view/ViewGroup;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final vy1 f23693a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f23694b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final ao1 f23695c;

    public interface a {
        void a();
    }

    public d(ap0 ap0Var, vy1 vy1Var) {
        this.f23693a = vy1Var;
        this.f23695c = bo1.a(ap0Var);
    }

    public static final ViewGroup a(d dVar) {
        return (ViewGroup) dVar.f23695c.getValue(dVar, f23692d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d this$0, View contentView, a contentViewShowListener) {
        RelativeLayout.LayoutParams layoutParams;
        l.f(this$0, "this$0");
        l.f(contentView, "$contentView");
        l.f(contentViewShowListener, "$contentViewShowListener");
        ViewGroup viewGroup = (ViewGroup) this$0.f23695c.getValue(this$0, f23692d[0]);
        if (viewGroup != null && viewGroup.indexOfChild(contentView) == -1) {
            vy1 vy1Var = this$0.f23693a;
            if (vy1Var == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            } else {
                int height = vy1Var.getHeight();
                float f10 = Resources.getSystem().getDisplayMetrics().density;
                if (height >= 0) {
                    height = com.google.gson.internal.c.y(height * f10);
                }
                int width = this$0.f23693a.getWidth();
                float f11 = Resources.getSystem().getDisplayMetrics().density;
                if (width >= 0) {
                    width = com.google.gson.internal.c.y(width * f11);
                }
                contentView.measure(0, 0);
                int measuredHeight = contentView.getMeasuredHeight();
                layoutParams = new RelativeLayout.LayoutParams(Math.min(width, contentView.getMeasuredWidth()), Math.min(height, measuredHeight));
            }
            layoutParams.addRule(13);
            ng2.a(contentView);
            viewGroup.addView(contentView, layoutParams);
            viewGroup.setVisibility(0);
            contentView.setVisibility(0);
        }
        contentView.getViewTreeObserver().addOnPreDrawListener(new e(this$0, contentView, contentViewShowListener));
    }

    public final void a(View contentView, a contentViewShowListener) {
        l.f(contentView, "contentView");
        l.f(contentViewShowListener, "contentViewShowListener");
        this.f23694b.post(new N.d(this, contentView, contentViewShowListener, 7));
    }
}
