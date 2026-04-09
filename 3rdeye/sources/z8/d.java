package z8;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import kotlin.jvm.internal.l;
import z0.C5848a;

/* compiled from: RateButtonStyleHelper.kt */
/* loaded from: classes3.dex */
public final class d {
    public static ShapeDrawable a() {
        OvalShape ovalShape = new OvalShape();
        ovalShape.resize(50.0f, 50.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        return shapeDrawable;
    }

    public static RippleDrawable b(Context context, e style, e defaultRateBarStyle) {
        int color;
        int iIntValue;
        l.f(style, "style");
        l.f(defaultRateBarStyle, "defaultRateBarStyle");
        int color2 = C5848a.getColor(context, defaultRateBarStyle.f48488a);
        Integer num = style.f48490c;
        if (num != null) {
            color = C5848a.getColor(context, num.intValue());
        } else {
            Integer num2 = defaultRateBarStyle.f48490c;
            l.c(num2);
            color = C5848a.getColor(context, num2.intValue());
        }
        Integer num3 = style.f48489b;
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            Integer num4 = defaultRateBarStyle.f48489b;
            l.c(num4);
            iIntValue = num4.intValue();
        }
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_enabled}, new int[0]}, new int[]{color, color2, C5848a.getColor(context, iIntValue)});
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((int) (8 * Resources.getSystem().getDisplayMetrics().density));
        gradientDrawable.setColor(C5848a.getColor(context, style.f48488a));
        return new RippleDrawable(colorStateList, gradientDrawable, null);
    }
}
