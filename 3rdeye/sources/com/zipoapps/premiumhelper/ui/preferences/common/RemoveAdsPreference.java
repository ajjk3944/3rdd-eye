package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import com.zipoapps.premiumhelper.ui.preferences.PremiumPreference;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: RemoveAdsPreference.kt */
/* loaded from: classes3.dex */
public final class RemoveAdsPreference extends PremiumPreference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemoveAdsPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        l.f(context, "context");
    }

    public /* synthetic */ RemoveAdsPreference(Context context, AttributeSet attributeSet, int i, g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoveAdsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f37071P.f47814g = false;
        if (context instanceof InterfaceC1790x) {
            ((InterfaceC1790x) context).getLifecycle().addObserver(new a());
        }
    }

    /* compiled from: RemoveAdsPreference.kt */
    public static final class a implements InterfaceC1771d {
        public a() {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onCreate(InterfaceC1790x interfaceC1790x) {
            RemoveAdsPreference removeAdsPreference = RemoveAdsPreference.this;
            removeAdsPreference.x(removeAdsPreference.A());
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onResume(InterfaceC1790x interfaceC1790x) {
            RemoveAdsPreference removeAdsPreference = RemoveAdsPreference.this;
            removeAdsPreference.x(removeAdsPreference.A());
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onDestroy(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onPause(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final /* synthetic */ void onStart(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onStop(InterfaceC1790x interfaceC1790x) {
        }
    }
}
