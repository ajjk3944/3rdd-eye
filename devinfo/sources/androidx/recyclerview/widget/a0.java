package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f1293e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final m f1294f = new m(1);

    /* renamed from: b, reason: collision with root package name */
    public long f1296b;

    /* renamed from: c, reason: collision with root package name */
    public long f1297c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1295a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1298d = new ArrayList();

    public static x1 c(RecyclerView recyclerView, int i4, long j) {
        int iH = recyclerView.f1229f.h();
        for (int i10 = 0; i10 < iH; i10++) {
            x1 x1VarP = RecyclerView.P(recyclerView.f1229f.g(i10));
            if (x1VarP.mPosition == i4 && !x1VarP.isInvalid()) {
                return null;
            }
        }
        m1 m1Var = recyclerView.f1223c;
        if (j == Long.MAX_VALUE) {
            try {
                if (a4.m.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th2) {
                recyclerView.Y(false);
                Trace.endSection();
                throw th2;
            }
        }
        recyclerView.X();
        x1 x1VarL = m1Var.l(i4, j);
        if (x1VarL != null) {
            if (!x1VarL.isBound() || x1VarL.isInvalid()) {
                m1Var.a(x1VarL, false);
            } else {
                m1Var.i(x1VarL.itemView);
            }
        }
        recyclerView.Y(false);
        Trace.endSection();
        return x1VarL;
    }

    public final void a(RecyclerView recyclerView, int i4, int i10) {
        if (recyclerView.f1255t) {
            if (RecyclerView.C0 && !this.f1295a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f1296b == 0) {
                this.f1296b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        y yVar = recyclerView.f1231g0;
        yVar.f1552a = i4;
        yVar.f1553b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r18) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a0.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f1295a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f1297c);
                }
            }
        } finally {
            this.f1296b = 0L;
            Trace.endSection();
        }
    }
}
