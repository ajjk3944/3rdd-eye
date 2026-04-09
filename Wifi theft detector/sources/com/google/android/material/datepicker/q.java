package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes2.dex */
public class q extends RecyclerView.Adapter {

    /* renamed from: i, reason: collision with root package name */
    public final CalendarConstraints f10476i;

    /* renamed from: j, reason: collision with root package name */
    public final DateSelector f10477j;

    /* renamed from: k, reason: collision with root package name */
    public final DayViewDecorator f10478k;

    /* renamed from: l, reason: collision with root package name */
    public final MaterialCalendar.l f10479l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10480m;

    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f10481a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f10481a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f10481a.getAdapter().r(i10)) {
                q.this.f10479l.a(this.f10481a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.c0 {

        /* renamed from: c, reason: collision with root package name */
        public final TextView f10483c;

        /* renamed from: d, reason: collision with root package name */
        public final MaterialCalendarGridView f10484d;

        public b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(j4.f.month_title);
            this.f10483c = textView;
            ViewCompat.k0(textView, true);
            this.f10484d = (MaterialCalendarGridView) linearLayout.findViewById(j4.f.month_grid);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public q(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.l lVar) {
        Month monthV = calendarConstraints.v();
        Month monthR = calendarConstraints.r();
        Month monthU = calendarConstraints.u();
        if (monthV.compareTo(monthU) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthU.compareTo(monthR) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f10480m = (p.f10468g * MaterialCalendar.w(context)) + (MaterialDatePicker.u(context) ? MaterialCalendar.w(context) : 0);
        this.f10476i = calendarConstraints;
        this.f10477j = dateSelector;
        this.f10478k = dayViewDecorator;
        this.f10479l = lVar;
        setHasStableIds(true);
    }

    public Month b(int i10) {
        return this.f10476i.v().u(i10);
    }

    public CharSequence c(int i10) {
        return b(i10).s();
    }

    public int d(Month month) {
        return this.f10476i.v().v(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        Month monthU = this.f10476i.v().u(i10);
        bVar.f10483c.setText(monthU.s());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f10484d.findViewById(j4.f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthU.equals(materialCalendarGridView.getAdapter().f10470a)) {
            p pVar = new p(monthU, this.f10477j, this.f10476i, this.f10478k);
            materialCalendarGridView.setNumColumns(monthU.f10398d);
            materialCalendarGridView.setAdapter((ListAdapter) pVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(j4.h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.u(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.o(-1, this.f10480m));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10476i.t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return this.f10476i.v().u(i10).t();
    }
}
