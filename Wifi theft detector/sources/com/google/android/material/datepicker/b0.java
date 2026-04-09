package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public class b0 extends RecyclerView.Adapter {

    /* renamed from: i, reason: collision with root package name */
    public final MaterialCalendar f10439i;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10440a;

        public a(int i10) {
            this.f10440a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b0.this.f10439i.C(b0.this.f10439i.s().j(Month.g(this.f10440a, b0.this.f10439i.u().f10396b)));
            b0.this.f10439i.D(MaterialCalendar.CalendarSelector.DAY);
            b0.this.f10439i.B();
        }
    }

    public static class b extends RecyclerView.c0 {

        /* renamed from: c, reason: collision with root package name */
        public final TextView f10442c;

        public b(TextView textView) {
            super(textView);
            this.f10442c = textView;
        }
    }

    public b0(MaterialCalendar materialCalendar) {
        this.f10439i = materialCalendar;
    }

    public final View.OnClickListener b(int i10) {
        return new a(i10);
    }

    public int c(int i10) {
        return i10 - this.f10439i.s().v().f10397c;
    }

    public int d(int i10) {
        return this.f10439i.s().v().f10397c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        int iD = d(i10);
        bVar.f10442c.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iD)));
        TextView textView = bVar.f10442c;
        textView.setContentDescription(j.k(textView.getContext(), iD));
        com.google.android.material.datepicker.b bVarT = this.f10439i.t();
        Calendar calendarP = a0.p();
        com.google.android.material.datepicker.a aVar = calendarP.get(1) == iD ? bVarT.f10436f : bVarT.f10434d;
        Iterator it = this.f10439i.v().n().iterator();
        while (it.hasNext()) {
            calendarP.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarP.get(1) == iD) {
                aVar = bVarT.f10435e;
            }
        }
        aVar.d(bVar.f10442c);
        bVar.f10442c.setSelected(aVar == bVarT.f10435e);
        bVar.f10442c.setOnClickListener(b(iD));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(j4.h.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10439i.s().w();
    }
}
