package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import h7.n1;
import h7.q0;
import h7.z0;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class u extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f5635d;

    /* renamed from: e, reason: collision with root package name */
    public final i f5636e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5637f;

    public u(ContextThemeWrapper contextThemeWrapper, CalendarConstraints calendarConstraints, i iVar) {
        Month month = calendarConstraints.f5572a;
        Month month2 = calendarConstraints.f5573d;
        Month month3 = calendarConstraints.f5575r;
        if (month.f5580a.compareTo(month3.f5580a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.f5580a.compareTo(month2.f5580a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f5637f = (contextThemeWrapper.getResources().getDimensionPixelSize(ed.d.mtrl_calendar_day_height) * r.f5626d) + (o.m0(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(ed.d.mtrl_calendar_day_height) : 0);
        this.f5635d = calendarConstraints;
        this.f5636e = iVar;
        if (this.f10189a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f10190b = true;
    }

    @Override // h7.q0
    public final int b() {
        return this.f5635d.B;
    }

    @Override // h7.q0
    public final long c(int i10) {
        Calendar calendarA = y.a(this.f5635d.f5572a.f5580a);
        calendarA.add(2, i10);
        return new Month(calendarA).f5580a.getTimeInMillis();
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) {
        t tVar = (t) n1Var;
        CalendarConstraints calendarConstraints = this.f5635d;
        Calendar calendarA = y.a(calendarConstraints.f5572a.f5580a);
        calendarA.add(2, i10);
        Month month = new Month(calendarA);
        tVar.f5633u.setText(month.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) tVar.f5634v.findViewById(ed.f.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().f5628a)) {
            new r(month, calendarConstraints);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ed.h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!o.m0(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new t(linearLayout, false);
        }
        linearLayout.setLayoutParams(new z0(-1, this.f5637f));
        return new t(linearLayout, true);
    }
}
