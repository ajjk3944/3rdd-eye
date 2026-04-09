package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class p implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f22834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f22835c;

    public p(j jVar, y yVar) {
        this.f22835c = jVar;
        this.f22834b = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.f22835c;
        int iI1 = ((LinearLayoutManager) jVar.f22817k.getLayoutManager()).i1() + 1;
        if (iI1 < jVar.f22817k.getAdapter().getItemCount()) {
            Calendar calendarC = E.c(this.f22834b.f22891j.f22777b.f22875b);
            calendarC.add(2, iI1);
            jVar.d(new v(calendarC));
        }
    }
}
