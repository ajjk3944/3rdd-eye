package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0320q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f5583e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final E.h f5584f = new E.h(13);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f5585a;

    /* renamed from: b, reason: collision with root package name */
    public long f5586b;

    /* renamed from: c, reason: collision with root package name */
    public long f5587c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f5588d;

    public static g0 c(RecyclerView recyclerView, int i, long j6) {
        int iH = recyclerView.f5347e.h();
        for (int i3 = 0; i3 < iH; i3++) {
            g0 g0VarJ = RecyclerView.J(recyclerView.f5347e.g(i3));
            if (g0VarJ.mPosition == i && !g0VarJ.isInvalid()) {
                return null;
            }
        }
        X x6 = recyclerView.f5342b;
        try {
            recyclerView.R();
            g0 g0VarJ2 = x6.j(i, j6);
            if (g0VarJ2 != null) {
                if (!g0VarJ2.isBound() || g0VarJ2.isInvalid()) {
                    x6.a(g0VarJ2, false);
                } else {
                    x6.g(g0VarJ2.itemView);
                }
            }
            recyclerView.S(false);
            return g0VarJ2;
        } catch (Throwable th) {
            recyclerView.S(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i3) {
        if (recyclerView.f5315F && this.f5586b == 0) {
            this.f5586b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0318o c0318o = recyclerView.f5371t0;
        c0318o.f5558a = i;
        c0318o.f5559b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RunnableC0320q.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f5585a;
        try {
            int i = N.l.f2971a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5587c);
                }
            }
            this.f5586b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f5586b = 0L;
            int i6 = N.l.f2971a;
            Trace.endSection();
            throw th;
        }
    }
}
