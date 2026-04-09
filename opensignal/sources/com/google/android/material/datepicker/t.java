package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import h7.n1;
import java.util.WeakHashMap;
import u3.i0;

/* loaded from: classes.dex */
public final class t extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5633u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f5634v;

    public t(LinearLayout linearLayout, boolean z10) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(ed.f.month_title);
        this.f5633u = textView;
        WeakHashMap weakHashMap = i0.f23177a;
        new u3.v(f3.c.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.f5634v = (MaterialCalendarGridView) linearLayout.findViewById(ed.f.month_grid);
        if (z10) {
            return;
        }
        textView.setVisibility(8);
    }
}
