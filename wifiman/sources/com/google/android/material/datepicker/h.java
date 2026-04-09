package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
class h extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    private static final int f37366d = 4;

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f37367a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37368b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37369c;

    public h() {
        Calendar calendarI = t.i();
        this.f37367a = calendarI;
        this.f37368b = calendarI.getMaximum(7);
        this.f37369c = calendarI.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f37369c;
        int i12 = this.f37368b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f37368b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f37368b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(O3.g.f17109l, viewGroup, false);
        }
        this.f37367a.set(7, b(i10));
        textView.setText(this.f37367a.getDisplayName(7, f37366d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(O3.h.f17127l), this.f37367a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i10) {
        Calendar calendarI = t.i();
        this.f37367a = calendarI;
        this.f37368b = calendarI.getMaximum(7);
        this.f37369c = i10;
    }
}
