package com.zipoapps.premiumhelper.ui.preferences.common;

import C.e0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import com.zipoapps.premiumhelper.e;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import y8.C5818a;

/* compiled from: PersonalizedAdsPreference.kt */
/* loaded from: classes3.dex */
public final class PersonalizedAdsPreference extends SafeClickPreference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PersonalizedAdsPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        l.f(context, "context");
    }

    public /* synthetic */ PersonalizedAdsPreference(Context context, AttributeSet attributeSet, int i, g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizedAdsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        x(false);
        this.f16252f = new e0(20, this, new C5818a(context, 0));
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).getLifecycle().addObserver(new a());
        }
    }

    /* compiled from: PersonalizedAdsPreference.kt */
    public static final class a implements InterfaceC1771d {
        public a() {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onCreate(InterfaceC1790x interfaceC1790x) {
            e.f37006D.getClass();
            PersonalizedAdsPreference.this.x(e.a.a().g());
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onDestroy(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onPause(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onResume(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final /* synthetic */ void onStart(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onStop(InterfaceC1790x interfaceC1790x) {
        }
    }
}
