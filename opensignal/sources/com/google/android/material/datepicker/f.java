package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5595a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f5596d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f5597g;

    public /* synthetic */ f(m mVar, u uVar, int i10) {
        this.f5595a = i10;
        this.f5597g = mVar;
        this.f5596d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5595a) {
            case 0:
                m mVar = this.f5597g;
                int iO0 = ((LinearLayoutManager) mVar.D0.getLayoutManager()).O0() - 1;
                Calendar calendarA = y.a(this.f5596d.f5635d.f5572a.f5580a);
                calendarA.add(2, iO0);
                mVar.g0(new Month(calendarA));
                break;
            default:
                m mVar2 = this.f5597g;
                int iN0 = ((LinearLayoutManager) mVar2.D0.getLayoutManager()).N0() + 1;
                Calendar calendarA2 = y.a(this.f5596d.f5635d.f5572a.f5580a);
                calendarA2.add(2, iN0);
                mVar2.g0(new Month(calendarA2));
                break;
        }
    }
}
