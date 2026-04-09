package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class l<S> extends r {

    /* renamed from: l0, reason: collision with root package name */
    public int f18317l0;

    /* renamed from: m0, reason: collision with root package name */
    public b f18318m0;

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        if (bundle == null) {
            bundle = this.f21712f;
        }
        this.f18317l0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f18318m0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m(), this.f18317l0));
        throw null;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void J(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f18317l0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f18318m0);
    }
}
