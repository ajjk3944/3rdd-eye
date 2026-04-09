package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: SafeClickPreference.kt */
/* loaded from: classes3.dex */
public class SafeClickPreference extends Preference {

    /* renamed from: N, reason: collision with root package name */
    public long f37083N;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafeClickPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        l.f(context, "context");
    }

    public /* synthetic */ SafeClickPreference(Context context, AttributeSet attributeSet, int i, g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeClickPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
    }
}
