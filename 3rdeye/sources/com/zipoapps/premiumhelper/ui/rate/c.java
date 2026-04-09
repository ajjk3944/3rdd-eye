package com.zipoapps.premiumhelper.ui.rate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.ui.rate.RateBarDialog;
import kotlin.jvm.internal.l;
import z0.C5848a;

/* compiled from: RateBarDialog.kt */
/* loaded from: classes3.dex */
public final class c implements RateBarDialog.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RateBarDialog f37110a;

    public c(RateBarDialog rateBarDialog) {
        this.f37110a = rateBarDialog;
    }

    @Override // com.zipoapps.premiumhelper.ui.rate.RateBarDialog.a
    public final int a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? R.drawable.rate_smile_5 : R.drawable.rate_smile_4 : R.drawable.rate_smile_3 : R.drawable.rate_smile_2 : R.drawable.rate_smile_1;
    }

    @Override // com.zipoapps.premiumhelper.ui.rate.RateBarDialog.a
    public final Drawable b() {
        RateBarDialog rateBarDialog = this.f37110a;
        Context contextRequireContext = rateBarDialog.requireContext();
        l.e(contextRequireContext, "requireContext(...)");
        z8.e style = rateBarDialog.f37088f;
        if (style == null) {
            style = (z8.e) rateBarDialog.f37098q.getValue();
        }
        l.f(style, "style");
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        ShapeDrawable shapeDrawableA = z8.d.a();
        Integer num = style.f48489b;
        shapeDrawableA.getPaint().setColor(C5848a.getColor(contextRequireContext, num != null ? num.intValue() : R.color.rate_us_cta_btn_disabled));
        stateListDrawable.addState(iArr, shapeDrawableA);
        int[] iArr2 = {android.R.attr.state_selected};
        ShapeDrawable shapeDrawableA2 = z8.d.a();
        shapeDrawableA2.getPaint().setColor(C5848a.getColor(contextRequireContext, style.f48488a));
        stateListDrawable.addState(iArr2, shapeDrawableA2);
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, z8.d.a());
        return stateListDrawable;
    }
}
