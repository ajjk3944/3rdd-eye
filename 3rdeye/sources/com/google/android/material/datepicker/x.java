package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes2.dex */
public final class x implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f22889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f22890c;

    public x(y yVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f22890c = yVar;
        this.f22889b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j4) {
        MaterialCalendarGridView materialCalendarGridView = this.f22889b;
        w wVarA = materialCalendarGridView.a();
        if (i < wVarA.a() || i > wVarA.c()) {
            return;
        }
        y yVar = this.f22890c;
        long jLongValue = materialCalendarGridView.a().getItem(i).longValue();
        j jVar = j.this;
        if (jVar.f22812e.f22779d.d(jLongValue)) {
            jVar.f22811d.B();
            Iterator it = jVar.f22769b.iterator();
            while (it.hasNext()) {
                ((z) it.next()).a(jVar.f22811d.u0());
            }
            jVar.f22817k.getAdapter().notifyDataSetChanged();
            RecyclerView recyclerView = jVar.f22816j;
            if (recyclerView != null) {
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
