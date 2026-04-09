package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.gn1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class fn1<V extends View & gn1> extends ig2<V, String> {

    /* renamed from: c, reason: collision with root package name */
    private final mp1 f27405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn1(V ratingView, mp1 reporter) {
        super(ratingView);
        kotlin.jvm.internal.l.f(ratingView, "ratingView");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        this.f27405c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(V view) {
        kotlin.jvm.internal.l.f(view, "view");
        view.setRating(0.0f);
        super.a(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.ig2
    public final void b(View view, String str) throws NumberFormatException {
        String value = str;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(value, "value");
        try {
            float f10 = Float.parseFloat(value);
            gn1 gn1Var = (gn1) view;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            gn1Var.setRating(f10);
        } catch (NumberFormatException e4) {
            String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{value}, 1));
            int i = fp0.f27419b;
            this.f27405c.reportError("Could not parse rating value", e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, String str) {
        String value = str;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(value, "value");
        return true;
    }
}
