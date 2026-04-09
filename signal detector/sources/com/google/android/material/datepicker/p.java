package com.google.android.material.datepicker;

import R.A;
import R.O;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.g0;
import com.apm.insight.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f18333b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialCalendarGridView f18334c;

    public p(LinearLayout linearLayout, boolean z6) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f18333b = textView;
        WeakHashMap weakHashMap = O.f3270a;
        new A(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.f18334c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z6) {
            return;
        }
        textView.setVisibility(8);
    }
}
