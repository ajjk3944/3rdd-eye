package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f20453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20454c;

    public /* synthetic */ f(l lVar, s sVar, int i4) {
        this.f20452a = i4;
        this.f20454c = lVar;
        this.f20453b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20452a) {
            case 0:
                l lVar = this.f20454c;
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) lVar.f20470g0.getLayoutManager()).findLastVisibleItemPosition() - 1;
                Calendar calendarA = w.a(this.f20453b.f20505i.f20439a.f20490a);
                calendarA.add(2, iFindLastVisibleItemPosition);
                lVar.c0(new o(calendarA));
                break;
            default:
                l lVar2 = this.f20454c;
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) lVar2.f20470g0.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                Calendar calendarA2 = w.a(this.f20453b.f20505i.f20439a.f20490a);
                calendarA2.add(2, iFindFirstVisibleItemPosition);
                lVar2.c0(new o(calendarA2));
                break;
        }
    }
}
