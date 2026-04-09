package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import b9.C1992A;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.dy;

/* loaded from: classes3.dex */
public final class k32 extends fy<dy.h> {

    /* renamed from: a, reason: collision with root package name */
    private final p9.p<dy.h.a, Boolean, C1992A> f29488a;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"UseSwitchCompatOrMaterialCode"})
    private final Switch f29489b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k32(View itemView, p9.p<? super dy.h.a, ? super Boolean, C1992A> onCheckedChange) {
        super(itemView);
        kotlin.jvm.internal.l.f(itemView, "itemView");
        kotlin.jvm.internal.l.f(onCheckedChange, "onCheckedChange");
        this.f29488a = onCheckedChange;
        View viewFindViewById = itemView.findViewById(R.id.item_switch);
        kotlin.jvm.internal.l.e(viewFindViewById, "findViewById(...)");
        this.f29489b = (Switch) viewFindViewById;
    }

    @Override // com.yandex.mobile.ads.impl.fy
    public final void a(final dy.h unit) {
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f29489b.setOnCheckedChangeListener(null);
        this.f29489b.setText(unit.c());
        this.f29489b.setChecked(unit.a());
        this.f29489b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.mobile.ads.impl.D1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                k32.a(this.f24088b, unit, compoundButton, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(k32 this$0, dy.h unit, CompoundButton compoundButton, boolean z10) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(unit, "$unit");
        this$0.f29488a.invoke(unit.b(), Boolean.valueOf(z10));
    }
}
