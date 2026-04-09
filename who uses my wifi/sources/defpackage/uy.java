package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uy implements Runnable {
    public static final ThreadLocal j = new ThreadLocal();
    public static final bk k = new bk(1);
    public ArrayList f;
    public long g;
    public long h;
    public ArrayList i;

    public static wo0 c(RecyclerView recyclerView, int i, long j2) {
        int iH = recyclerView.j.H();
        for (int i2 = 0; i2 < iH; i2++) {
            wo0 wo0VarI = RecyclerView.I(recyclerView.j.G(i2));
            if (wo0VarI.c == i && !wo0VarI.f()) {
                return null;
            }
        }
        no0 no0Var = recyclerView.g;
        try {
            recyclerView.P();
            wo0 wo0VarJ = no0Var.j(i, j2);
            if (wo0VarJ != null) {
                if (!wo0VarJ.e() || wo0VarJ.f()) {
                    no0Var.a(wo0VarJ, false);
                } else {
                    no0Var.g(wo0VarJ.a);
                }
            }
            recyclerView.Q(false);
            return wo0VarJ;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.w && this.g == 0) {
            this.g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        ef efVar = recyclerView.j0;
        efVar.a = i;
        efVar.b = i2;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f;
        try {
            int i = o21.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.h);
                }
            }
            this.g = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.g = 0L;
            int i3 = o21.a;
            Trace.endSection();
            throw th;
        }
    }
}
