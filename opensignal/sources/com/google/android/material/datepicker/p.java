package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p<S> extends v {

    /* renamed from: x0, reason: collision with root package name */
    public int f5623x0;

    /* renamed from: y0, reason: collision with root package name */
    public CalendarConstraints f5624y0;

    @Override // androidx.fragment.app.b
    public final void D(Bundle bundle) {
        super.D(bundle);
        if (bundle == null) {
            bundle = this.B;
        }
        this.f5623x0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5624y0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(n(), this.f5623x0));
        throw null;
    }

    @Override // androidx.fragment.app.b
    public final void P(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f5623x0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5624y0);
    }
}
