package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import h7.c1;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class l extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f5602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f5603b;

    public l(m mVar, u uVar) {
        this.f5603b = mVar;
        this.f5602a = uVar;
    }

    @Override // h7.c1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        CalendarConstraints calendarConstraints = this.f5602a.f5635d;
        m mVar = this.f5603b;
        int iN0 = i10 < 0 ? ((LinearLayoutManager) mVar.D0.getLayoutManager()).N0() : ((LinearLayoutManager) mVar.D0.getLayoutManager()).O0();
        Calendar calendarA = y.a(calendarConstraints.f5572a.f5580a);
        calendarA.add(2, iN0);
        Month month = new Month(calendarA);
        mVar.f5606z0 = month;
        MaterialButton materialButton = mVar.I0;
        Calendar calendarA2 = y.a(calendarConstraints.f5572a.f5580a);
        calendarA2.add(2, iN0);
        materialButton.setText(new Month(calendarA2).f());
        mVar.i0(calendarConstraints.f5572a.g(month));
    }
}
