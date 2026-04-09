package com.google.android.gms.common.internal;

import D0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.DeviceProperties;
import g0.C4356c;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i, int i10, int i11, int i12) {
        if (i == 0) {
            return i10;
        }
        if (i == 1) {
            return i11;
        }
        if (i == 2) {
            return i12;
        }
        throw new IllegalStateException(C4356c.h(i, "Unknown color scheme: "));
    }

    public final void zaa(Resources resources, int i, int i10) throws Resources.NotFoundException {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i11 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i11);
        setMinWidth(i11);
        int i12 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i13 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int iZab = zab(i10, i12, i13, i13);
        int i14 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i15 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int iZab2 = zab(i10, i14, i15, i15);
        if (i == 0 || i == 1) {
            iZab = iZab2;
        } else if (i != 2) {
            throw new IllegalStateException(C4356c.h(i, "Unknown button size: "));
        }
        Drawable drawable = resources.getDrawable(iZab);
        a.C0009a.h(drawable, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        a.C0009a.i(drawable, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i16 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i17 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i10, i16, i17, i17))));
        if (i == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i != 2) {
                throw new IllegalStateException(C4356c.h(i, "Unknown button size: "));
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
