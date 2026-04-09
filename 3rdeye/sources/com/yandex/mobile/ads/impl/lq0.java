package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.dy;

/* loaded from: classes3.dex */
public final class lq0 extends fy<dy.f> {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f30073a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f30074b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f30075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(View itemView) {
        super(itemView);
        kotlin.jvm.internal.l.f(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R.id.item_title);
        kotlin.jvm.internal.l.e(viewFindViewById, "findViewById(...)");
        this.f30073a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R.id.item_subtitle);
        kotlin.jvm.internal.l.e(viewFindViewById2, "findViewById(...)");
        this.f30074b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R.id.item_text);
        kotlin.jvm.internal.l.e(viewFindViewById3, "findViewById(...)");
        this.f30075c = (TextView) viewFindViewById3;
    }

    @Override // com.yandex.mobile.ads.impl.fy
    public final void a(dy dyVar) {
        dy.f unit = (dy.f) dyVar;
        kotlin.jvm.internal.l.f(unit, "unit");
        String strA = unit.a();
        wx wxVarB = unit.b();
        uw uwVarC = unit.c();
        Context context = this.itemView.getContext();
        if (strA != null) {
            this.f30073a.setVisibility(0);
            this.f30073a.setText(strA);
        } else {
            this.f30073a.setVisibility(8);
        }
        if (wxVarB == null || y9.q.i0(wxVarB.d())) {
            this.f30074b.setVisibility(8);
        } else {
            this.f30074b.setVisibility(0);
            this.f30074b.setText(wxVarB.d());
            kotlin.jvm.internal.l.c(context);
            this.f30074b.setTextColor(hh.a(context, wxVarB.a()));
            Integer numB = wxVarB.b();
            this.f30074b.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, numB != null ? numB.intValue() : 0, 0);
        }
        if (uwVarC == null || y9.q.i0(uwVarC.c())) {
            this.f30075c.setVisibility(8);
            return;
        }
        this.f30075c.setVisibility(0);
        this.f30075c.setText(uwVarC.c());
        kotlin.jvm.internal.l.c(context);
        this.f30075c.setTextColor(hh.a(context, uwVarC.a()));
    }
}
