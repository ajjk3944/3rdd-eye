package com.google.android.material.datepicker;

import L0.H;
import L0.I;
import L0.S;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.datepicker.j;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes2.dex */
public final class y extends RecyclerView.h<a> {

    /* renamed from: j, reason: collision with root package name */
    public final C4009a f22891j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC4012d<?> f22892k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC4014f f22893l;

    /* renamed from: m, reason: collision with root package name */
    public final j.c f22894m;

    /* renamed from: n, reason: collision with root package name */
    public final int f22895n;

    /* compiled from: MonthsPagerAdapter.java */
    public static class a extends RecyclerView.F {

        /* renamed from: l, reason: collision with root package name */
        public final TextView f22896l;

        /* renamed from: m, reason: collision with root package name */
        public final MaterialCalendarGridView f22897m;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f22896l = textView;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            new H(R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(textView, Boolean.TRUE);
            this.f22897m = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public y(ContextThemeWrapper contextThemeWrapper, InterfaceC4012d interfaceC4012d, C4009a c4009a, AbstractC4014f abstractC4014f, j.c cVar) {
        v vVar = c4009a.f22777b;
        v vVar2 = c4009a.f22780e;
        if (vVar.f22875b.compareTo(vVar2.f22875b) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (vVar2.f22875b.compareTo(c4009a.f22778c.f22875b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f22895n = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * w.f22882h) + (r.e(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f22891j = c4009a;
        this.f22892k = interfaceC4012d;
        this.f22893l = abstractC4014f;
        this.f22894m = cVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f22891j.f22783h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        Calendar calendarC = E.c(this.f22891j.f22777b.f22875b);
        calendarC.add(2, i);
        calendarC.set(5, 1);
        Calendar calendarC2 = E.c(calendarC);
        calendarC2.get(2);
        calendarC2.get(1);
        calendarC2.getMaximum(7);
        calendarC2.getActualMaximum(5);
        calendarC2.getTimeInMillis();
        return calendarC2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        a aVar = (a) f10;
        C4009a c4009a = this.f22891j;
        Calendar calendarC = E.c(c4009a.f22777b.f22875b);
        calendarC.add(2, i);
        v vVar = new v(calendarC);
        aVar.f22896l.setText(vVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f22897m.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !vVar.equals(materialCalendarGridView.a().f22883b)) {
            w wVar = new w(vVar, this.f22892k, c4009a, this.f22893l);
            materialCalendarGridView.setNumColumns(vVar.f22878e);
            materialCalendarGridView.setAdapter((ListAdapter) wVar);
        } else {
            materialCalendarGridView.invalidate();
            w wVarA = materialCalendarGridView.a();
            Iterator<Long> it = wVarA.f22885d.iterator();
            while (it.hasNext()) {
                wVarA.e(materialCalendarGridView, it.next().longValue());
            }
            InterfaceC4012d<?> interfaceC4012d = wVarA.f22884c;
            if (interfaceC4012d != null) {
                Iterator<Long> it2 = interfaceC4012d.q0().iterator();
                while (it2.hasNext()) {
                    wVarA.e(materialCalendarGridView, it2.next().longValue());
                }
                wVarA.f22885d = interfaceC4012d.q0();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new x(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!r.e(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f22895n));
        return new a(linearLayout, true);
    }
}
