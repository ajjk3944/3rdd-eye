package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.g1;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import java.util.Calendar;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s extends t0 {

    /* renamed from: i, reason: collision with root package name */
    public final b f20505i;
    public final p6.i j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20506k;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, p6.i iVar) {
        o oVar = bVar.f20439a;
        o oVar2 = bVar.f20440b;
        o oVar3 = bVar.f20442d;
        if (oVar.f20490a.compareTo(oVar3.f20490a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar3.f20490a.compareTo(oVar2.f20490a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f20506k = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.f20496d) + (m.l0(android.R.attr.windowFullscreen, contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f20505i = bVar;
        this.j = iVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemCount() {
        return this.f20505i.g;
    }

    @Override // androidx.recyclerview.widget.t0
    public final long getItemId(int i4) {
        Calendar calendarA = w.a(this.f20505i.f20439a.f20490a);
        calendarA.add(2, i4);
        calendarA.set(5, 1);
        Calendar calendarA2 = w.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4) {
        r rVar = (r) x1Var;
        b bVar = this.f20505i;
        Calendar calendarA = w.a(bVar.f20439a.f20490a);
        calendarA.add(2, i4);
        o oVar = new o(calendarA);
        rVar.f20503c.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f20504d.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f20498a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.t0
    public final x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.l0(android.R.attr.windowFullscreen, viewGroup.getContext())) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new g1(-1, this.f20506k));
        return new r(linearLayout, true);
    }
}
