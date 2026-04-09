package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public class k extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f10457d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f10458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10459b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10460c;

    static {
        f10457d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public k() {
        Calendar calendarR = a0.r();
        this.f10458a = calendarR;
        this.f10459b = calendarR.getMaximum(7);
        this.f10460c = calendarR.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f10459b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public final int b(int i10) {
        int i11 = i10 + this.f10460c;
        int i12 = this.f10459b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f10459b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(j4.h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f10458a.set(7, b(i10));
        textView.setText(this.f10458a.getDisplayName(7, f10457d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(j4.j.mtrl_picker_day_of_week_column_header), this.f10458a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public k(int i10) {
        Calendar calendarR = a0.r();
        this.f10458a = calendarR;
        this.f10459b = calendarR.getMaximum(7);
        this.f10460c = i10;
    }
}
