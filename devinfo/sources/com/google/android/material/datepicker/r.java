package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import e4.i0;
import e4.v0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r extends x1 {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f20503c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialCalendarGridView f20504d;

    public r(LinearLayout linearLayout, boolean z3) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f20503c = textView;
        WeakHashMap weakHashMap = v0.f22405a;
        new i0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.f20504d = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z3) {
            return;
        }
        textView.setVisibility(8);
    }
}
