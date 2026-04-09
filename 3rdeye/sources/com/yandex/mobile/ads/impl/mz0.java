package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b9.C1992A;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.dy;

/* loaded from: classes3.dex */
public final class mz0 extends fy<dy.g> {

    /* renamed from: a, reason: collision with root package name */
    private final gx f30616a;

    /* renamed from: b, reason: collision with root package name */
    private final p9.l<dy.g, C1992A> f30617b;

    /* renamed from: c, reason: collision with root package name */
    private final p9.l<String, C1992A> f30618c;

    /* renamed from: d, reason: collision with root package name */
    private w6.e f30619d;

    /* renamed from: e, reason: collision with root package name */
    private final LinearLayout f30620e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f30621f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f30622g;

    /* renamed from: h, reason: collision with root package name */
    private final ImageView f30623h;
    private final TextView i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f30624j;

    /* renamed from: k, reason: collision with root package name */
    private final ImageView f30625k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mz0(View itemView, gx imageLoader, p9.l<? super dy.g, C1992A> onNetworkClick, p9.l<? super String, C1992A> onWaringButtonClick) {
        super(itemView);
        kotlin.jvm.internal.l.f(itemView, "itemView");
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        kotlin.jvm.internal.l.f(onNetworkClick, "onNetworkClick");
        kotlin.jvm.internal.l.f(onWaringButtonClick, "onWaringButtonClick");
        this.f30616a = imageLoader;
        this.f30617b = onNetworkClick;
        this.f30618c = onWaringButtonClick;
        View viewFindViewById = itemView.findViewById(R.id.item_mediation_adapter);
        kotlin.jvm.internal.l.e(viewFindViewById, "findViewById(...)");
        this.f30620e = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R.id.item_logo);
        kotlin.jvm.internal.l.e(viewFindViewById2, "findViewById(...)");
        this.f30621f = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R.id.item_name);
        kotlin.jvm.internal.l.e(viewFindViewById3, "findViewById(...)");
        this.f30622g = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R.id.navigation_icon);
        kotlin.jvm.internal.l.e(viewFindViewById4, "findViewById(...)");
        this.f30623h = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R.id.item_info_first);
        kotlin.jvm.internal.l.e(viewFindViewById5, "findViewById(...)");
        this.i = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R.id.item_info_second);
        kotlin.jvm.internal.l.e(viewFindViewById6, "findViewById(...)");
        this.f30624j = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R.id.item_warning_button);
        kotlin.jvm.internal.l.e(viewFindViewById7, "findViewById(...)");
        this.f30625k = (ImageView) viewFindViewById7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(mz0 this$0, dy.g unit, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(unit, "$unit");
        this$0.f30617b.invoke(unit);
    }

    @Override // com.yandex.mobile.ads.impl.fy
    public final void a(final dy.g unit) {
        kotlin.jvm.internal.l.f(unit, "unit");
        Context context = this.itemView.getContext();
        this.f30622g.setText(unit.f());
        wx wxVarC = unit.c();
        if (wxVarC != null) {
            this.i.setVisibility(0);
            this.i.setText(wxVarC.d());
            this.i.setTextAppearance(context, wxVarC.c());
            TextView textView = this.i;
            Context context2 = this.itemView.getContext();
            kotlin.jvm.internal.l.e(context2, "getContext(...)");
            textView.setTextColor(hh.a(context2, wxVarC.a()));
            TextView textView2 = this.i;
            Integer numB = wxVarC.b();
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, numB != null ? numB.intValue() : 0, 0);
        } else {
            this.i.setVisibility(8);
        }
        uw uwVarD = unit.d();
        this.f30624j.setText(uwVarD.c());
        this.f30624j.setTextAppearance(context, uwVarD.b());
        TextView textView3 = this.f30624j;
        Context context3 = this.itemView.getContext();
        kotlin.jvm.internal.l.e(context3, "getContext(...)");
        textView3.setTextColor(hh.a(context3, uwVarD.a()));
        LinearLayout linearLayout = this.f30620e;
        String strJ = unit.j();
        linearLayout.setClickable(((strJ == null || y9.q.i0(strJ)) && unit.g() == null) ? false : true);
        String strJ2 = unit.j();
        if (strJ2 == null || y9.q.i0(strJ2)) {
            this.f30625k.setVisibility(8);
        } else {
            this.f30625k.setVisibility(0);
            this.f30620e.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.M2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mz0.a(this.f24193b, unit, view);
                }
            });
        }
        this.f30621f.setImageResource(0);
        w6.e eVar = this.f30619d;
        if (eVar != null) {
            eVar.cancel();
        }
        gx gxVar = this.f30616a;
        String strE = unit.e();
        if (strE == null) {
            strE = "";
        }
        this.f30619d = gxVar.a(strE, this.f30621f);
        if (unit.g() == null) {
            this.f30623h.setVisibility(8);
        } else {
            this.f30623h.setVisibility(0);
            this.f30620e.setOnClickListener(new N2(0, this, unit));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(mz0 this$0, dy.g unit, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(unit, "$unit");
        this$0.f30618c.invoke(unit.j());
    }
}
