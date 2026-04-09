package com.yandex.mobile.ads.impl;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.ja0;
import java.util.List;

/* loaded from: classes3.dex */
public final class gj1 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final h9 f27774a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ja0.a> f27775b;

    /* renamed from: c, reason: collision with root package name */
    private final np1 f27776c;

    /* renamed from: d, reason: collision with root package name */
    private final g51 f27777d;

    public gj1(h9 adTracker, List<ja0.a> items, np1 reporter, g51 nativeAdEventController) {
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        kotlin.jvm.internal.l.f(items, "items");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        this.f27774a = adTracker;
        this.f27775b = items;
        this.f27776c = reporter;
        this.f27777d = nativeAdEventController;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        kotlin.jvm.internal.l.f(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId >= this.f27775b.size()) {
            return true;
        }
        this.f27774a.a(this.f27775b.get(itemId).b(), m62.f30282c);
        this.f27776c.a(ip1.b.f28779E);
        this.f27777d.a();
        return true;
    }
}
