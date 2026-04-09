package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5591d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f5592a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5593b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5594c;

    static {
        f5591d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar calendarC = y.c(null);
        this.f5592a = calendarC;
        this.f5593b = calendarC.getMaximum(7);
        this.f5594c = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f5593b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f5593b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f5594c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ed.h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f5594c;
        int i12 = this.f5593b;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f5592a;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f5591d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(ed.j.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i10) {
        Calendar calendarC = y.c(null);
        this.f5592a = calendarC;
        this.f5593b = calendarC.getMaximum(7);
        this.f5594c = i10;
    }
}
