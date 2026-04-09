package com.zipoapps.premiumhelper.ui.preferences;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.CheckBoxPreference;
import com.zipoapps.premiumhelper.e;
import i8.C4461a;
import kotlin.jvm.internal.l;
import n1.h;
import x8.C5782b;

/* compiled from: PremiumCheckBoxPreference.kt */
/* loaded from: classes3.dex */
public final class PremiumCheckBoxPreference extends CheckBoxPreference {

    /* renamed from: T, reason: collision with root package name */
    public final C5782b f37067T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f37067T = new C5782b(context, attributeSet);
    }

    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public final void l(h holder) {
        l.f(holder, "holder");
        super.l(holder);
        this.f37067T.a(holder);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public final void m() {
        this.f37067T.getClass();
        if (C5782b.b()) {
            super.m();
            return;
        }
        if (this.f16248b instanceof Activity) {
            e.f37006D.getClass();
            e.k(e.a.a(), C4461a.EnumC0466a.PREFERENCE + "_" + this.f16257l);
        }
    }
}
