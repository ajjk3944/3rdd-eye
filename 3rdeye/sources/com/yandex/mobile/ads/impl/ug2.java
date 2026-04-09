package com.yandex.mobile.ads.impl;

import android.view.View;
import b9.C1992A;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class ug2 {

    /* renamed from: a, reason: collision with root package name */
    private final p9.l<xx, C1992A> f34060a;

    /* renamed from: b, reason: collision with root package name */
    private final gx f34061b;

    /* JADX WARN: Multi-variable type inference failed */
    public ug2(p9.l<? super xx, C1992A> onAction, gx imageLoader) {
        kotlin.jvm.internal.l.f(onAction, "onAction");
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        this.f34060a = onAction;
        this.f34061b = imageLoader;
    }

    public final fy a(View itemView, int i) {
        kotlin.jvm.internal.l.f(itemView, "itemView");
        return i == R.layout.debug_panel_item_action_button ? new C4207u(og2.f31363b, itemView) : i == R.layout.debug_panel_item_switch ? new k32(itemView, new pg2(this)) : i == R.layout.deubg_panel_item_header ? new jf0(itemView) : i == R.layout.deubg_panel_item_key_value ? new lq0(itemView) : i == R.layout.debug_panel_item_mediation_adapter ? new mz0(itemView, this.f34061b, new qg2(this), new rg2(this)) : i == R.layout.debug_panel_item_ad_units ? new y9(itemView, new sg2(this)) : i == R.layout.debug_panel_item_ad_unit ? new w9(new tg2(this), itemView) : new j30(itemView);
    }
}
