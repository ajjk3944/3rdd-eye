package com.zipoapps.premiumhelper.ui.preferences.common;

import B8.b;
import C.e0;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: RateUsPreference.kt */
/* loaded from: classes3.dex */
public final class RateUsPreference extends SafeClickPreference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RateUsPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        l.f(context, "context");
    }

    public /* synthetic */ RateUsPreference(Context context, AttributeSet attributeSet, int i, g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateUsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f16252f = new e0(20, this, new b(context, 18));
    }
}
