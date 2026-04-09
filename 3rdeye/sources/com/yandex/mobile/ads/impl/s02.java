package com.yandex.mobile.ads.impl;

import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.List;

/* loaded from: classes3.dex */
public final class s02 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final l62 f32831a;

    /* renamed from: b, reason: collision with root package name */
    private final p41 f32832b;

    /* renamed from: c, reason: collision with root package name */
    private final List<n02> f32833c;

    /* renamed from: d, reason: collision with root package name */
    private final g51 f32834d;

    /* renamed from: e, reason: collision with root package name */
    private final h91 f32835e;

    public s02(l62 trackingUrlHandler, p41 clickReporterCreator, List<n02> items, g51 nativeAdEventController, h91 nativeOpenUrlHandlerCreator) {
        kotlin.jvm.internal.l.f(trackingUrlHandler, "trackingUrlHandler");
        kotlin.jvm.internal.l.f(clickReporterCreator, "clickReporterCreator");
        kotlin.jvm.internal.l.f(items, "items");
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        kotlin.jvm.internal.l.f(nativeOpenUrlHandlerCreator, "nativeOpenUrlHandlerCreator");
        this.f32831a = trackingUrlHandler;
        this.f32832b = clickReporterCreator;
        this.f32833c = items;
        this.f32834d = nativeAdEventController;
        this.f32835e = nativeOpenUrlHandlerCreator;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        kotlin.jvm.internal.l.f(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId >= this.f32833c.size()) {
            return true;
        }
        n02 n02Var = this.f32833c.get(itemId);
        ir0 ir0VarA = n02Var.a();
        g91 g91VarA = this.f32835e.a(this.f32832b.a(n02Var.b(), "social_action"));
        this.f32834d.a(ir0VarA);
        this.f32831a.a(ir0VarA.d());
        String strE = ir0VarA.e();
        if (strE == null || strE.length() == 0) {
            return true;
        }
        g91VarA.a(strE);
        return true;
    }
}
