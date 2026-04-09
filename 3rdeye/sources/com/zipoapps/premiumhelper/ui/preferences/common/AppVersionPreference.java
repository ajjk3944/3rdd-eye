package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.util.AttributeSet;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.Arrays;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: AppVersionPreference.kt */
/* loaded from: classes3.dex */
public final class AppVersionPreference extends SafeClickPreference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppVersionPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        l.f(context, "context");
    }

    public /* synthetic */ AppVersionPreference(Context context, AttributeSet attributeSet, int i, g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppVersionPreference(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet);
        l.f(context, "context");
        w(context.getString(R.string.app_name));
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "-1";
        }
        v(String.format("%s %s", Arrays.copyOf(new Object[]{context.getString(R.string.ph_version), str}, 2)));
    }
}
