package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import b9.C1992A;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.dy;

/* renamed from: com.yandex.mobile.ads.impl.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4207u extends fy<dy.c> {

    /* renamed from: a, reason: collision with root package name */
    private final p9.l<dy.c.a, C1992A> f33834a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f33835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4207u(p9.l onButtonClick, View itemView) {
        super(itemView);
        kotlin.jvm.internal.l.f(itemView, "itemView");
        kotlin.jvm.internal.l.f(onButtonClick, "onButtonClick");
        this.f33834a = onButtonClick;
        View viewFindViewById = itemView.findViewById(R.id.item_button);
        kotlin.jvm.internal.l.e(viewFindViewById, "findViewById(...)");
        this.f33835b = (TextView) viewFindViewById;
    }

    @Override // com.yandex.mobile.ads.impl.fy
    public final void a(final dy.c unit) {
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f33835b.setText(unit.b());
        this.f33835b.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.S3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4207u.a(this.f24255b, unit, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4207u this$0, dy.c unit, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(unit, "$unit");
        this$0.f33834a.invoke(unit.a());
    }
}
