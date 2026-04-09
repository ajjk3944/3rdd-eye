package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.apm.insight.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f18269d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f18270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18271b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18272c;

    static {
        f18269d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar calendarC = u.c(null);
        this.f18270a = calendarC;
        this.f18271b = calendarC.getMaximum(7);
        this.f18272c = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f18271b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i3 = this.f18271b;
        if (i >= i3) {
            return null;
        }
        int i6 = i + this.f18272c;
        if (i6 > i3) {
            i6 -= i3;
        }
        return Integer.valueOf(i6);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i3 = i + this.f18272c;
        int i6 = this.f18271b;
        if (i3 > i6) {
            i3 -= i6;
        }
        Calendar calendar = this.f18270a;
        calendar.set(7, i3);
        textView.setText(calendar.getDisplayName(7, f18269d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i) {
        Calendar calendarC = u.c(null);
        this.f18270a = calendarC;
        this.f18271b = calendarC.getMaximum(7);
        this.f18272c = i;
    }
}
