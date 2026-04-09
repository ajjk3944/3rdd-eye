package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class o<S> extends s {

    /* renamed from: b, reason: collision with root package name */
    public int f10464b;

    /* renamed from: c, reason: collision with root package name */
    public DateSelector f10465c;

    /* renamed from: d, reason: collision with root package name */
    public CalendarConstraints f10466d;

    public class a extends r {
        public a() {
        }

        @Override // com.google.android.material.datepicker.r
        public void a() {
            Iterator it = o.this.f10485a.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a();
            }
        }

        @Override // com.google.android.material.datepicker.r
        public void b(Object obj) {
            Iterator it = o.this.f10485a.iterator();
            while (it.hasNext()) {
                ((r) it.next()).b(obj);
            }
        }
    }

    public static o h(DateSelector dateSelector, int i10, CalendarConstraints calendarConstraints) {
        o oVar = new o();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        oVar.setArguments(bundle);
        return oVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f10464b = bundle.getInt("THEME_RES_ID_KEY");
        this.f10465c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10466d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f10465c.l(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f10464b)), viewGroup, bundle, this.f10466d, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f10464b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10465c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10466d);
    }
}
