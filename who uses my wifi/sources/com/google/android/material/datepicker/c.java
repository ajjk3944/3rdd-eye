package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.ao0;
import defpackage.g41;
import defpackage.io0;
import defpackage.jc0;
import defpackage.of3;
import defpackage.vc;
import defpackage.we0;
import defpackage.wo0;
import defpackage.xe0;
import java.util.Calendar;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c extends ao0 {
    public final vc i;
    public final of3 j;
    public final int k;

    public c(ContextThemeWrapper contextThemeWrapper, vc vcVar, of3 of3Var) {
        we0 we0Var = vcVar.f;
        we0 we0Var2 = vcVar.g;
        we0 we0Var3 = vcVar.i;
        if (we0Var.f.compareTo(we0Var3.f) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (we0Var3.f.compareTo(we0Var2.f) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.k = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * xe0.i) + (jc0.T(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.i = vcVar;
        this.j = of3Var;
        f(true);
    }

    @Override // defpackage.ao0
    public final int a() {
        return this.i.l;
    }

    @Override // defpackage.ao0
    public final long b(int i) {
        Calendar calendarA = g41.a(this.i.f.f);
        calendarA.add(2, i);
        calendarA.set(5, 1);
        Calendar calendarA2 = g41.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // defpackage.ao0
    public final void d(wo0 wo0Var, int i) {
        b bVar = (b) wo0Var;
        vc vcVar = this.i;
        Calendar calendarA = g41.a(vcVar.f.f);
        calendarA.add(2, i);
        we0 we0Var = new we0(calendarA);
        bVar.u.setText(we0Var.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !we0Var.equals(materialCalendarGridView.a().f)) {
            new xe0(we0Var, vcVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // defpackage.ao0
    public final wo0 e(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!jc0.T(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new io0(-1, this.k));
        return new b(linearLayout, true);
    }
}
