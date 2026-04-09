package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20448d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f20449a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20450b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20451c;

    static {
        f20448d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar calendarC = w.c(null);
        this.f20449a = calendarC;
        this.f20450b = calendarC.getMaximum(7);
        this.f20451c = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f20450b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        int i10 = this.f20450b;
        if (i4 >= i10) {
            return null;
        }
        int i11 = i4 + this.f20451c;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i4 + this.f20451c;
        int i11 = this.f20450b;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f20449a;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, f20448d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i4) {
        Calendar calendarC = w.c(null);
        this.f20449a = calendarC;
        this.f20450b = calendarC.getMaximum(7);
        this.f20451c = i4;
    }
}
