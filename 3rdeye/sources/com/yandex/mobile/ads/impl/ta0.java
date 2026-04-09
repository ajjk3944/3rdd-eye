package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.ja0;
import java.util.List;

/* loaded from: classes3.dex */
public final class ta0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f33507a;

    /* renamed from: b, reason: collision with root package name */
    private final np1 f33508b;

    /* renamed from: c, reason: collision with root package name */
    private final x61 f33509c;

    /* renamed from: d, reason: collision with root package name */
    private final g51 f33510d;

    /* renamed from: e, reason: collision with root package name */
    private final sa0 f33511e;

    public ta0(C4072a3 adConfiguration, np1 reporter, x61 nativeAdViewAdapter, g51 nativeAdEventController, sa0 feedbackMenuCreator) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        kotlin.jvm.internal.l.f(feedbackMenuCreator, "feedbackMenuCreator");
        this.f33507a = adConfiguration;
        this.f33508b = reporter;
        this.f33509c = nativeAdViewAdapter;
        this.f33510d = nativeAdEventController;
        this.f33511e = feedbackMenuCreator;
    }

    public final void a(Context context, ja0 action) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(action, "action");
        View viewA = this.f33509c.g().a("feedback");
        ImageView imageView = viewA instanceof ImageView ? (ImageView) viewA : null;
        if (imageView == null) {
            return;
        }
        List<ja0.a> listC = action.c();
        if (listC.isEmpty()) {
            return;
        }
        try {
            h9 h9Var = new h9(context, this.f33507a);
            this.f33511e.getClass();
            PopupMenu popupMenuA = sa0.a(context, imageView, listC);
            popupMenuA.setOnMenuItemClickListener(new gj1(h9Var, listC, this.f33508b, this.f33510d));
            popupMenuA.show();
        } catch (Exception e4) {
            int i = fp0.f27419b;
            this.f33507a.q().c().reportError("Failed to render feedback", e4);
        }
    }
}
