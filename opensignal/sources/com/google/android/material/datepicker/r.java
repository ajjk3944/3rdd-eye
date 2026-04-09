package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class r extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5626d = y.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f5627e = (y.c(null).getMaximum(7) + y.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final Month f5628a;

    /* renamed from: b, reason: collision with root package name */
    public d f5629b;

    /* renamed from: c, reason: collision with root package name */
    public final CalendarConstraints f5630c;

    public r(Month month, CalendarConstraints calendarConstraints) {
        this.f5628a = month;
        this.f5630c = calendarConstraints;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.f5630c.f5576x;
        Month month = this.f5628a;
        Calendar calendar = month.f5580a;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        return i11 < 0 ? i11 + month.f5583r : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 < a() || i10 > c()) {
            return null;
        }
        int iA = (i10 - a()) + 1;
        Calendar calendarA = y.a(this.f5628a.f5580a);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f5628a.f5584x) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f5627e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f5628a.f5583r;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            com.google.android.material.datepicker.d r1 = r4.f5629b
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.d r1 = new com.google.android.material.datepicker.d
            r1.<init>(r0)
            r4.f5629b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L26
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r0 = ed.h.mtrl_calendar_day
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L26:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5c
            com.google.android.material.datepicker.Month r7 = r4.f5628a
            int r2 = r7.f5584x
            if (r6 < r2) goto L35
            goto L5c
        L35:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L64
        L5c:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L64:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6b
            goto L6d
        L6b:
            if (r0 != 0) goto L6e
        L6d:
            return r0
        L6e:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.y.b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.r.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
