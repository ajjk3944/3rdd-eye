package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class n extends RecyclerView.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f22830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f22831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f22832c;

    public n(j jVar, y yVar, MaterialButton materialButton) {
        this.f22832c = jVar;
        this.f22830a = yVar;
        this.f22831b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f22831b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void b(RecyclerView recyclerView, int i, int i10) {
        j jVar = this.f22832c;
        int iI1 = i < 0 ? ((LinearLayoutManager) jVar.f22817k.getLayoutManager()).i1() : ((LinearLayoutManager) jVar.f22817k.getLayoutManager()).j1();
        C4009a c4009a = this.f22830a.f22891j;
        Calendar calendarC = E.c(c4009a.f22777b.f22875b);
        calendarC.add(2, iI1);
        jVar.f22814g = new v(calendarC);
        Calendar calendarC2 = E.c(c4009a.f22777b.f22875b);
        calendarC2.add(2, iI1);
        calendarC2.set(5, 1);
        Calendar calendarC3 = E.c(calendarC2);
        calendarC3.get(2);
        calendarC3.get(1);
        calendarC3.getMaximum(7);
        calendarC3.getActualMaximum(5);
        calendarC3.getTimeInMillis();
        long timeInMillis = calendarC3.getTimeInMillis();
        this.f22831b.setText(Build.VERSION.SDK_INT >= 24 ? E.b("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228));
    }
}
