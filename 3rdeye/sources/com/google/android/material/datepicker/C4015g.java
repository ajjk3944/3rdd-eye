package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* renamed from: com.google.android.material.datepicker.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4015g extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public static final int f22802e;

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f22803b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22804c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22805d;

    static {
        f22802e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C4015g() {
        Calendar calendarE = E.e(null);
        this.f22803b = calendarE;
        this.f22804c = calendarE.getMaximum(7);
        this.f22805d = calendarE.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f22804c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i10 = this.f22804c;
        if (i >= i10) {
            return null;
        }
        int i11 = i + this.f22805d;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i + this.f22805d;
        int i11 = this.f22804c;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f22803b;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, f22802e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C4015g(int i) {
        Calendar calendarE = E.e(null);
        this.f22803b = calendarE;
        this.f22804c = calendarE.getMaximum(7);
        this.f22805d = i;
    }
}
