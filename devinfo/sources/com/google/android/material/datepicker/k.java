package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j1;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f20462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20463b;

    public k(l lVar, s sVar) {
        this.f20463b = lVar;
        this.f20462a = sVar;
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onScrolled(RecyclerView recyclerView, int i4, int i10) {
        b bVar = this.f20462a.f20505i;
        l lVar = this.f20463b;
        int iFindFirstVisibleItemPosition = i4 < 0 ? ((LinearLayoutManager) lVar.f20470g0.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) lVar.f20470g0.getLayoutManager()).findLastVisibleItemPosition();
        Calendar calendarA = w.a(bVar.f20439a.f20490a);
        calendarA.add(2, iFindFirstVisibleItemPosition);
        o oVar = new o(calendarA);
        lVar.f20466c0 = oVar;
        MaterialButton materialButton = lVar.f20475l0;
        Calendar calendarA2 = w.a(bVar.f20439a.f20490a);
        calendarA2.add(2, iFindFirstVisibleItemPosition);
        calendarA2.set(5, 1);
        Calendar calendarA3 = w.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        materialButton.setText(j4.m(calendarA3.getTimeInMillis()));
        lVar.e0(bVar.f20439a.d(oVar));
    }
}
