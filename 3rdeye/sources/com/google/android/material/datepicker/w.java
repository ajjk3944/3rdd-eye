package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: MonthAdapter.java */
/* loaded from: classes2.dex */
public final class w extends BaseAdapter {

    /* renamed from: h, reason: collision with root package name */
    public static final int f22882h = E.e(null).getMaximum(4);
    public static final int i = (E.e(null).getMaximum(7) + E.e(null).getMaximum(5)) - 1;

    /* renamed from: b, reason: collision with root package name */
    public final v f22883b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4012d<?> f22884c;

    /* renamed from: d, reason: collision with root package name */
    public Collection<Long> f22885d;

    /* renamed from: e, reason: collision with root package name */
    public C4011c f22886e;

    /* renamed from: f, reason: collision with root package name */
    public final C4009a f22887f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC4014f f22888g;

    public w(v vVar, InterfaceC4012d<?> interfaceC4012d, C4009a c4009a, AbstractC4014f abstractC4014f) {
        this.f22883b = vVar;
        this.f22884c = interfaceC4012d;
        this.f22887f = c4009a;
        this.f22888g = abstractC4014f;
        this.f22885d = interfaceC4012d.q0();
    }

    public final int a() {
        int firstDayOfWeek = this.f22887f.f22781f;
        v vVar = this.f22883b;
        Calendar calendar = vVar.f22875b;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        return i11 < 0 ? i11 + vVar.f22878e : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 < a() || i10 > c()) {
            return null;
        }
        int iA = (i10 - a()) + 1;
        Calendar calendarC = E.c(this.f22883b.f22875b);
        calendarC.set(5, iA);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f22883b.f22879f) - 1;
    }

    public final void d(TextView textView, long j4, int i10) {
        boolean z10;
        boolean z11;
        String str;
        C4010b c4010b;
        boolean z12 = false;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z13 = E.d().getTimeInMillis() == j4;
        InterfaceC4012d<?> interfaceC4012d = this.f22884c;
        Iterator<K0.c<Long, Long>> it = interfaceC4012d.F().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            Long l5 = it.next().f2940a;
            if (l5 != null && l5.longValue() == j4) {
                z10 = true;
                break;
            }
        }
        Iterator<K0.c<Long, Long>> it2 = interfaceC4012d.F().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z11 = false;
                break;
            }
            Long l10 = it2.next().f2941b;
            if (l10 != null && l10.longValue() == j4) {
                z11 = true;
                break;
            }
        }
        Calendar calendarD = E.d();
        Calendar calendarE = E.e(null);
        calendarE.setTimeInMillis(j4);
        if (calendarD.get(1) == calendarE.get(1)) {
            Locale locale = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                str = E.b("MMMMEEEEd", locale).format(new Date(j4));
            } else {
                DateFormat dateInstance = DateFormat.getDateInstance(0, locale);
                dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
                str = dateInstance.format(new Date(j4));
            }
        } else {
            Locale locale2 = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                str = E.b("yMMMMEEEEd", locale2).format(new Date(j4));
            } else {
                DateFormat dateInstance2 = DateFormat.getDateInstance(0, locale2);
                dateInstance2.setTimeZone(TimeZone.getTimeZone("UTC"));
                str = dateInstance2.format(new Date(j4));
            }
        }
        if (z13) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z10) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z11) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f22887f.f22779d.d(j4)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = interfaceC4012d.q0().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (E.a(j4) == E.a(it3.next().longValue())) {
                    z12 = true;
                    break;
                }
            }
            textView.setSelected(z12);
            c4010b = z12 ? this.f22886e.f22794b : E.d().getTimeInMillis() == j4 ? this.f22886e.f22795c : this.f22886e.f22793a;
        } else {
            textView.setEnabled(false);
            c4010b = this.f22886e.f22799g;
        }
        if (this.f22888g == null || i10 == -1) {
            c4010b.b(textView);
            return;
        }
        int i11 = this.f22883b.f22877d;
        c4010b.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j4) {
        v vVarB = v.b(j4);
        v vVar = this.f22883b;
        if (vVarB.equals(vVar)) {
            Calendar calendarC = E.c(vVar.f22875b);
            calendarC.setTimeInMillis(j4);
            int i10 = calendarC.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (i10 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j4, i10);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return i;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f22883b.f22878e;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            android.content.Context r2 = r8.getContext()
            com.google.android.material.datepicker.c r3 = r5.f22886e
            if (r3 != 0) goto L11
            com.google.android.material.datepicker.c r3 = new com.google.android.material.datepicker.c
            r3.<init>(r2)
            r5.f22886e = r3
        L11:
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r7 != 0) goto L28
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r2 = 2131558590(0x7f0d00be, float:1.87425E38)
            android.view.View r7 = r7.inflate(r2, r8, r1)
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
        L28:
            int r7 = r5.a()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            com.google.android.material.datepicker.v r8 = r5.f22883b
            int r3 = r8.f22879f
            if (r7 < r3) goto L37
            goto L5d
        L37:
            int r7 = r7 + r0
            r2.setTag(r8)
            android.content.res.Resources r8 = r2.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r2.setText(r8)
            r2.setVisibility(r1)
            r2.setEnabled(r0)
            goto L66
        L5d:
            r7 = 8
            r2.setVisibility(r7)
            r2.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6d
            return r2
        L6d:
            long r0 = r6.longValue()
            r5.d(r2, r0, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.w.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
