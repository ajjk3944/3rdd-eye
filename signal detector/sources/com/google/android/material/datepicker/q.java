package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.S;
import androidx.recyclerview.widget.g0;
import com.apm.insight.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class q extends G {

    /* renamed from: a, reason: collision with root package name */
    public final b f18335a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.e f18336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18337c;

    public q(ContextThemeWrapper contextThemeWrapper, b bVar, A0.e eVar) {
        m mVar = bVar.f18259a;
        m mVar2 = bVar.f18260b;
        m mVar3 = bVar.f18262d;
        if (mVar.f18319a.compareTo(mVar3.f18319a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (mVar3.f18319a.compareTo(mVar2.f18319a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f18337c = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * n.f18326d) + (k.i0(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f18335a = bVar;
        this.f18336b = eVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.G
    public final int getItemCount() {
        return this.f18335a.f18265g;
    }

    @Override // androidx.recyclerview.widget.G
    public final long getItemId(int i) {
        Calendar calendarA = u.a(this.f18335a.f18259a.f18319a);
        calendarA.add(2, i);
        calendarA.set(5, 1);
        Calendar calendarA2 = u.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.G
    public final void onBindViewHolder(g0 g0Var, int i) {
        p pVar = (p) g0Var;
        b bVar = this.f18335a;
        Calendar calendarA = u.a(bVar.f18259a.f18319a);
        calendarA.add(2, i);
        m mVar = new m(calendarA);
        pVar.f18333b.setText(mVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) pVar.f18334c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !mVar.equals(materialCalendarGridView.a().f18328a)) {
            new n(mVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.G
    public final g0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!k.i0(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new p(linearLayout, false);
        }
        linearLayout.setLayoutParams(new S(-1, this.f18337c));
        return new p(linearLayout, true);
    }
}
