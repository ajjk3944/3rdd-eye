package defpackage;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xe0 extends BaseAdapter {
    public static final int i = g41.c(null).getMaximum(4);
    public static final int j = (g41.c(null).getMaximum(7) + g41.c(null).getMaximum(5)) - 1;
    public final we0 f;
    public vq2 g;
    public final vc h;

    public xe0(we0 we0Var, vc vcVar) {
        this.f = we0Var;
        this.h = vcVar;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.h.j;
        we0 we0Var = this.f;
        Calendar calendar = we0Var.f;
        int i2 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - firstDayOfWeek;
        return i3 < 0 ? i3 + we0Var.i : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i2) {
        if (i2 < a() || i2 > c()) {
            return null;
        }
        int iA = (i2 - a()) + 1;
        Calendar calendarA = g41.a(this.f.f);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f.j) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return j;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.f.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            vq2 r1 = r4.g
            if (r1 != 0) goto L10
            vq2 r1 = new vq2
            r2 = 4
            r1.<init>(r0, r2)
            r4.g = r1
        L10:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L28
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131492966(0x7f0c0066, float:1.8609399E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L28:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5e
            we0 r7 = r4.f
            int r2 = r7.j
            if (r6 < r2) goto L37
            goto L5e
        L37:
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
            goto L66
        L5e:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L66:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6d
            goto L6f
        L6d:
            if (r0 != 0) goto L70
        L6f:
            return r0
        L70:
            r0.getContext()
            java.util.Calendar r5 = defpackage.g41.b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
