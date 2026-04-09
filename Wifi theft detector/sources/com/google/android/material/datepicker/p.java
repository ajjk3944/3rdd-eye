package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class p extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f10468g = a0.r().getMaximum(4);

    /* renamed from: h, reason: collision with root package name */
    public static final int f10469h = (a0.r().getMaximum(5) + a0.r().getMaximum(7)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final Month f10470a;

    /* renamed from: b, reason: collision with root package name */
    public final DateSelector f10471b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f10472c;

    /* renamed from: d, reason: collision with root package name */
    public b f10473d;

    /* renamed from: e, reason: collision with root package name */
    public final CalendarConstraints f10474e;

    /* renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f10475f;

    public p(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f10470a = month;
        this.f10471b = dateSelector;
        this.f10474e = calendarConstraints;
        this.f10475f = dayViewDecorator;
        this.f10472c = dateSelector.n();
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.f10470a.j(this.f10474e.s());
    }

    public final String c(Context context, long j10) {
        return j.e(context, j10, l(j10), k(j10), g(j10));
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > m()) {
            return null;
        }
        return Long.valueOf(this.f10470a.q(n(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = j4.h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.f10470a
            int r2 = r8.f10399e
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.o(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.p.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void f(Context context) {
        if (this.f10473d == null) {
            this.f10473d = new b(context);
        }
    }

    public boolean g(long j10) {
        Iterator it = this.f10471b.k().iterator();
        while (it.hasNext()) {
            Object obj = ((r0.e) it.next()).f24135b;
            if (obj != null && ((Long) obj).longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f10469h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f10470a.f10398d;
    }

    public boolean h(int i10) {
        return i10 % this.f10470a.f10398d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(int i10) {
        return (i10 + 1) % this.f10470a.f10398d == 0;
    }

    public final boolean j(long j10) {
        Iterator it = this.f10471b.n().iterator();
        while (it.hasNext()) {
            if (a0.a(j10) == a0.a(((Long) it.next()).longValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean k(long j10) {
        Iterator it = this.f10471b.k().iterator();
        while (it.hasNext()) {
            Object obj = ((r0.e) it.next()).f24134a;
            if (obj != null && ((Long) obj).longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(long j10) {
        return a0.p().getTimeInMillis() == j10;
    }

    public int m() {
        return (b() + this.f10470a.f10399e) - 1;
    }

    public int n(int i10) {
        return (i10 - b()) + 1;
    }

    public final void o(TextView textView, long j10, int i10) {
        boolean zJ;
        a aVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j10);
        textView.setContentDescription(strC);
        boolean zF = this.f10474e.q().f(j10);
        if (zF) {
            textView.setEnabled(true);
            zJ = j(j10);
            textView.setSelected(zJ);
            aVar = zJ ? this.f10473d.f10432b : l(j10) ? this.f10473d.f10433c : this.f10473d.f10431a;
        } else {
            zJ = false;
            textView.setEnabled(false);
            aVar = this.f10473d.f10437g;
        }
        boolean z10 = zJ;
        DayViewDecorator dayViewDecorator = this.f10475f;
        if (dayViewDecorator == null || i10 == -1) {
            aVar.d(textView);
            return;
        }
        Month month = this.f10470a;
        int i11 = month.f10397c;
        int i12 = month.f10396b;
        aVar.e(textView, dayViewDecorator.c(context, i11, i12, i10, zF, z10), this.f10475f.q(context, i11, i12, i10, zF, z10));
        textView.setCompoundDrawables(this.f10475f.g(context, i11, i12, i10, zF, z10), this.f10475f.i(context, i11, i12, i10, zF, z10), this.f10475f.h(context, i11, i12, i10, zF, z10), this.f10475f.e(context, i11, i12, i10, zF, z10));
        textView.setContentDescription(this.f10475f.j(context, i11, i12, i10, zF, z10, strC));
    }

    public final void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.h(j10).equals(this.f10470a)) {
            int iR = this.f10470a.r(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iR) - materialCalendarGridView.getFirstVisiblePosition()), j10, iR);
        }
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f10472c.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, ((Long) it.next()).longValue());
        }
        DateSelector dateSelector = this.f10471b;
        if (dateSelector != null) {
            Iterator it2 = dateSelector.n().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, ((Long) it2.next()).longValue());
            }
            this.f10472c = this.f10471b.n();
        }
    }

    public boolean r(int i10) {
        return i10 >= b() && i10 <= m();
    }
}
