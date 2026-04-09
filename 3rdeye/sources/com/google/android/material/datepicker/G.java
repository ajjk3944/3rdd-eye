package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes2.dex */
public final class G extends RecyclerView.h<a> {

    /* renamed from: j, reason: collision with root package name */
    public final j<?> f22773j;

    /* compiled from: YearGridAdapter.java */
    public static class a extends RecyclerView.F {

        /* renamed from: l, reason: collision with root package name */
        public final TextView f22774l;

        public a(TextView textView) {
            super(textView);
            this.f22774l = textView;
        }
    }

    public G(j<?> jVar) {
        this.f22773j = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f22773j.f22812e.f22782g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        a aVar = (a) f10;
        j<?> jVar = this.f22773j;
        int i10 = jVar.f22812e.f22777b.f22877d + i;
        aVar.f22774l.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i10)));
        TextView textView = aVar.f22774l;
        Context context = textView.getContext();
        textView.setContentDescription(E.d().get(1) == i10 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10)));
        C4011c c4011c = jVar.i;
        Calendar calendarD = E.d();
        C4010b c4010b = calendarD.get(1) == i10 ? c4011c.f22798f : c4011c.f22796d;
        Iterator<Long> it = jVar.f22811d.q0().iterator();
        while (it.hasNext()) {
            calendarD.setTimeInMillis(it.next().longValue());
            if (calendarD.get(1) == i10) {
                c4010b = c4011c.f22797e;
            }
        }
        c4010b.b(textView);
        textView.setOnClickListener(new F(this, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
