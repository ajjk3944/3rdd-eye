package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;

/* loaded from: classes3.dex */
public final class i31 extends ig2<Q1.f, List<? extends jj0>> {

    /* renamed from: c, reason: collision with root package name */
    private final ej0 f28455c;

    /* renamed from: d, reason: collision with root package name */
    private final mp1 f28456d;

    /* renamed from: e, reason: collision with root package name */
    private final a8<?> f28457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i31(Q1.f viewPager, ej0 imageProvider, mp1 reporter, a8<?> adResponse) {
        super(viewPager);
        kotlin.jvm.internal.l.f(viewPager, "viewPager");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f28455c = imageProvider;
        this.f28456d = reporter;
        this.f28457e = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, List<? extends jj0> list) {
        Q1.f viewPager = (Q1.f) view;
        List<? extends jj0> imageValues = list;
        kotlin.jvm.internal.l.f(viewPager, "viewPager");
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        return viewPager.getAdapter() instanceof f31;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void b(View view, List<? extends jj0> list) {
        Q1.f viewPager = (Q1.f) view;
        List<? extends jj0> imageValues = list;
        kotlin.jvm.internal.l.f(viewPager, "viewPager");
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        try {
            viewPager.setAdapter(new f31(this.f28455c, imageValues, this.f28457e));
        } catch (IllegalArgumentException e4) {
            mp1 mp1Var = this.f28456d;
            String message = e4.getMessage();
            if (message == null) {
                message = "IllegalArgumentException: set adapter exception";
            }
            mp1Var.reportError(message, e4);
        }
    }
}
