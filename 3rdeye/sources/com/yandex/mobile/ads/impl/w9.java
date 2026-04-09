package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import b9.C1992A;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.dy;

/* loaded from: classes3.dex */
public final class w9 extends fy<dy.a> {

    /* renamed from: a, reason: collision with root package name */
    private final p9.l<String, C1992A> f34861a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f34862b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f34863c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f34864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(p9.l onAdUnitClick, View itemView) {
        super(itemView);
        kotlin.jvm.internal.l.f(itemView, "itemView");
        kotlin.jvm.internal.l.f(onAdUnitClick, "onAdUnitClick");
        this.f34861a = onAdUnitClick;
        View viewFindViewById = itemView.findViewById(R.id.item_name);
        kotlin.jvm.internal.l.e(viewFindViewById, "findViewById(...)");
        this.f34862b = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R.id.item_ad_unit_format);
        kotlin.jvm.internal.l.e(viewFindViewById2, "findViewById(...)");
        this.f34863c = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R.id.item_ad_unit_id);
        kotlin.jvm.internal.l.e(viewFindViewById3, "findViewById(...)");
        this.f34864d = (TextView) viewFindViewById3;
    }

    @Override // com.yandex.mobile.ads.impl.fy
    public final void a(final dy.a unit) {
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f34862b.setText(unit.c());
        this.f34863c.setText(unit.a());
        this.f34864d.setText(unit.b());
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.U3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w9.a(this.f24274b, unit, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(w9 this$0, dy.a unit, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(unit, "$unit");
        this$0.f34861a.invoke(unit.b());
    }
}
