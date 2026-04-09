package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class l extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f22825a = E.e(null);

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f22826b = E.e(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f22827c;

    public l(j jVar) {
        this.f22827c = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        Long l5;
        if ((recyclerView.getAdapter() instanceof G) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            G g10 = (G) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            j jVar = this.f22827c;
            for (K0.c<Long, Long> cVar : jVar.f22811d.F()) {
                Long l10 = cVar.f2940a;
                if (l10 != null && (l5 = cVar.f2941b) != null) {
                    long jLongValue = l10.longValue();
                    Calendar calendar = this.f22825a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = l5.longValue();
                    Calendar calendar2 = this.f22826b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - g10.f22773j.f22812e.f22777b.f22877d;
                    int i10 = calendar2.get(1) - g10.f22773j.f22812e.f22777b.f22877d;
                    View viewJ = gridLayoutManager.J(i);
                    View viewJ2 = gridLayoutManager.J(i10);
                    int i11 = gridLayoutManager.f16386F;
                    int i12 = i / i11;
                    int i13 = i10 / i11;
                    int i14 = i12;
                    while (i14 <= i13) {
                        if (gridLayoutManager.J(gridLayoutManager.f16386F * i14) != null) {
                            canvas.drawRect((i14 != i12 || viewJ == null) ? 0 : (viewJ.getWidth() / 2) + viewJ.getLeft(), r10.getTop() + jVar.i.f22796d.f22787a.top, (i14 != i13 || viewJ2 == null) ? recyclerView.getWidth() : (viewJ2.getWidth() / 2) + viewJ2.getLeft(), r10.getBottom() - jVar.i.f22796d.f22787a.bottom, jVar.i.f22800h);
                        }
                        i14++;
                    }
                }
            }
        }
    }
}
