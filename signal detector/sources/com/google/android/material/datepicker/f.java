package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f18274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f18275c;

    public /* synthetic */ f(j jVar, q qVar, int i) {
        this.f18273a = i;
        this.f18275c = jVar;
        this.f18274b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f18273a) {
            case 0:
                j jVar = this.f18275c;
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) jVar.f18287r0.getLayoutManager()).findLastVisibleItemPosition() - 1;
                Calendar calendarA = u.a(this.f18274b.f18335a.f18259a.f18319a);
                calendarA.add(2, iFindLastVisibleItemPosition);
                jVar.X(new m(calendarA));
                break;
            default:
                j jVar2 = this.f18275c;
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) jVar2.f18287r0.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                Calendar calendarA2 = u.a(this.f18274b.f18335a.f18259a.f18319a);
                calendarA2.add(2, iFindFirstVisibleItemPosition);
                jVar2.X(new m(calendarA2));
                break;
        }
    }
}
