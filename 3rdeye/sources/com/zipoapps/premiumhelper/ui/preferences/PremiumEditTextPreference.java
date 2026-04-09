package com.zipoapps.premiumhelper.ui.preferences;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;
import com.zipoapps.premiumhelper.e;
import i8.C4461a;
import kotlin.jvm.internal.l;
import n1.h;
import x8.C5782b;

/* compiled from: PremiumEditTextPreference.kt */
/* loaded from: classes3.dex */
public final class PremiumEditTextPreference extends EditTextPreference {

    /* renamed from: U, reason: collision with root package name */
    public final C5782b f37068U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f37068U = new C5782b(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public final void l(h holder) {
        l.f(holder, "holder");
        super.l(holder);
        this.f37068U.a(holder);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void m() {
        this.f37068U.getClass();
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
