package com.zipoapps.premiumhelper.ui.preferences.common;

import C.e0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import i8.r;
import kotlin.jvm.internal.l;
import l8.d;

/* compiled from: OpenSettingsPreference.kt */
/* loaded from: classes3.dex */
public final class OpenSettingsPreference extends SafeClickPreference {

    /* renamed from: O, reason: collision with root package name */
    public final String f37076O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenSettingsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f38632b);
        if (typedArrayObtainStyledAttributes.getString(7) == null) {
            e.f37006D.getClass();
            e eVarA = e.a.a();
            d<String> PH_SUPPORT_EMAIL = i8.d.f38558f0;
            l.e(PH_SUPPORT_EMAIL, "PH_SUPPORT_EMAIL");
            Object objH = eVarA.f37020j.h(PH_SUPPORT_EMAIL);
            l.e(objH, "get(...)");
        }
        if (typedArrayObtainStyledAttributes.getString(9) == null) {
            e.f37006D.getClass();
            e eVarA2 = e.a.a();
            d<String> PH_SUPPORT_VIP_EMAIL = i8.d.f38560g0;
            l.e(PH_SUPPORT_VIP_EMAIL, "PH_SUPPORT_VIP_EMAIL");
            Object objH2 = eVarA2.f37020j.h(PH_SUPPORT_VIP_EMAIL);
            l.e(objH2, "get(...)");
        }
        this.f37076O = typedArrayObtainStyledAttributes.getString(0);
        typedArrayObtainStyledAttributes.recycle();
        this.f16252f = new e0(20, this, new e0(19, this, context));
        if (this.f16254h == null) {
            w(context.getString(R.string.ph_open_settings));
        }
        if (f() == null) {
            v(context.getString(R.string.ph_open_settings_summary));
        }
    }
}
