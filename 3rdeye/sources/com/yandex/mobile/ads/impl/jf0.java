package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.dy;

/* loaded from: classes3.dex */
public final class jf0 extends fy<dy.e> {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f29125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(View itemView) {
        super(itemView);
        kotlin.jvm.internal.l.f(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R.id.item_text);
        kotlin.jvm.internal.l.e(viewFindViewById, "findViewById(...)");
        this.f29125a = (TextView) viewFindViewById;
    }

    @Override // com.yandex.mobile.ads.impl.fy
    public final void a(dy dyVar) {
        dy.e unit = (dy.e) dyVar;
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f29125a.setText(unit.a());
    }
}
