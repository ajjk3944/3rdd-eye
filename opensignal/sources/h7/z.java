package h7;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f10286x = new ThreadLocal();

    /* renamed from: y, reason: collision with root package name */
    public static final dv.h f10287y = new dv.h(3);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f10288a;

    /* renamed from: d, reason: collision with root package name */
    public long f10289d;

    /* renamed from: g, reason: collision with root package name */
    public long f10290g;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f10291r;

    public static n1 c(RecyclerView recyclerView, int i10, long j) {
        int iB = recyclerView.f2085y.B();
        for (int i11 = 0; i11 < iB; i11++) {
            n1 n1VarM = RecyclerView.M(recyclerView.f2085y.A(i11));
            if (n1VarM.f10157c == i10 && !n1VarM.f()) {
                return null;
            }
        }
        f1 f1Var = recyclerView.f2064g;
        try {
            recyclerView.V();
            n1 n1VarL = f1Var.l(i10, j);
            if (n1VarL != null) {
                if (!n1VarL.e() || n1VarL.f()) {
                    f1Var.a(n1VarL, false);
                } else {
                    f1Var.i(n1VarL.f10155a);
                }
            }
            recyclerView.W(false);
            return n1VarL;
        } catch (Throwable th2) {
            recyclerView.W(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.O) {
            if (RecyclerView.W0 && !this.f10288a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f10289d == 0) {
                this.f10289d = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        androidx.datastore.preferences.protobuf.l lVar = recyclerView.C0;
        lVar.f1311a = i10;
        lVar.f1312b = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.z.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f10288a;
        try {
            int i10 = p3.f.f20247a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f10290g);
                }
            }
            this.f10289d = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f10289d = 0L;
            int i12 = p3.f.f20247a;
            Trace.endSection();
            throw th2;
        }
    }
}
