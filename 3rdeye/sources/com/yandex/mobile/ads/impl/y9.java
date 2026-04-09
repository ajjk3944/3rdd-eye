package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import b9.C1992A;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.dy;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class y9 extends fy<dy.b> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5480a<C1992A> f35662a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f35663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(View itemView, InterfaceC5480a<C1992A> onAdUnitsClick) {
        super(itemView);
        kotlin.jvm.internal.l.f(itemView, "itemView");
        kotlin.jvm.internal.l.f(onAdUnitsClick, "onAdUnitsClick");
        this.f35662a = onAdUnitsClick;
        View viewFindViewById = itemView.findViewById(R.id.item_text);
        kotlin.jvm.internal.l.e(viewFindViewById, "findViewById(...)");
        this.f35663b = (TextView) viewFindViewById;
    }

    @Override // com.yandex.mobile.ads.impl.fy
    public final void a(dy.b unit) {
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f35663b.setText(this.itemView.getContext().getString(R.string.ad_units));
        this.f35663b.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.K4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y9.a(this.f24170b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(y9 this$0, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.f35662a.invoke();
    }
}
