package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import f.AbstractC5487d;

/* loaded from: classes3.dex */
public final class l<S> extends q {

    /* renamed from: u1, reason: collision with root package name */
    private int f37441u1;

    /* renamed from: v1, reason: collision with root package name */
    private com.google.android.material.datepicker.a f37442v1;

    class a extends p {
        a() {
        }
    }

    static l F1(d dVar, int i10, com.google.android.material.datepicker.a aVar) {
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        lVar.v1(bundle);
        return lVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void K0(Bundle bundle) {
        super.K0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f37441u1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f37442v1);
    }

    @Override // androidx.fragment.app.Fragment
    public void o0(Bundle bundle) {
        super.o0(bundle);
        if (bundle == null) {
            bundle = q();
        }
        this.f37441u1 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC5487d.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f37442v1 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(s(), this.f37441u1));
        new a();
        throw null;
    }
}
