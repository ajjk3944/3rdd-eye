package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import n0.r;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f3967e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static Comparator f3968f = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f3970b;

    /* renamed from: c, reason: collision with root package name */
    public long f3971c;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3969a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3972d = new ArrayList();

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f3980d;
            if ((recyclerView == null) != (cVar2.f3980d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f3977a;
            if (z10 != cVar2.f3977a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f3978b - cVar.f3978b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f3979c - cVar2.f3979c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    public static class b implements RecyclerView.n.c {

        /* renamed from: a, reason: collision with root package name */
        public int f3973a;

        /* renamed from: b, reason: collision with root package name */
        public int f3974b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f3975c;

        /* renamed from: d, reason: collision with root package name */
        public int f3976d;

        @Override // androidx.recyclerview.widget.RecyclerView.n.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f3976d;
            int i13 = i12 * 2;
            int[] iArr = this.f3975c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3975c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f3975c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3975c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f3976d++;
        }

        public void b() {
            int[] iArr = this.f3975c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3976d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z10) {
            this.f3976d = 0;
            int[] iArr = this.f3975c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.n nVar = recyclerView.f3697n;
            if (recyclerView.f3695m == null || nVar == null || !nVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f3679e.p()) {
                    nVar.collectInitialPrefetchPositions(recyclerView.f3695m.getItemCount(), this);
                }
            } else if (!recyclerView.w0()) {
                nVar.collectAdjacentPrefetchPositions(this.f3973a, this.f3974b, recyclerView.f3688i0, this);
            }
            int i10 = this.f3976d;
            if (i10 > nVar.mPrefetchMaxCountObserved) {
                nVar.mPrefetchMaxCountObserved = i10;
                nVar.mPrefetchMaxObservedInInitialPrefetch = z10;
                recyclerView.f3675c.P();
            }
        }

        public boolean d(int i10) {
            if (this.f3975c != null) {
                int i11 = this.f3976d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3975c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i10, int i11) {
            this.f3973a = i10;
            this.f3974b = i11;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3977a;

        /* renamed from: b, reason: collision with root package name */
        public int f3978b;

        /* renamed from: c, reason: collision with root package name */
        public int f3979c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f3980d;

        /* renamed from: e, reason: collision with root package name */
        public int f3981e;

        public void a() {
            this.f3977a = false;
            this.f3978b = 0;
            this.f3979c = 0;
            this.f3980d = null;
            this.f3981e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f3681f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.c0 c0VarP0 = RecyclerView.p0(recyclerView.f3681f.i(i11));
            if (c0VarP0.mPosition == i10 && !c0VarP0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.E0 && this.f3969a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f3969a.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f3969a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f3969a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3686h0.c(recyclerView, false);
                i10 += recyclerView.f3686h0.f3976d;
            }
        }
        this.f3972d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f3969a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f3686h0;
                int iAbs = Math.abs(bVar.f3973a) + Math.abs(bVar.f3974b);
                for (int i14 = 0; i14 < bVar.f3976d * 2; i14 += 2) {
                    if (i12 >= this.f3972d.size()) {
                        cVar = new c();
                        this.f3972d.add(cVar);
                    } else {
                        cVar = (c) this.f3972d.get(i12);
                    }
                    int[] iArr = bVar.f3975c;
                    int i15 = iArr[i14 + 1];
                    cVar.f3977a = i15 <= iAbs;
                    cVar.f3978b = iAbs;
                    cVar.f3979c = i15;
                    cVar.f3980d = recyclerView2;
                    cVar.f3981e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3972d, f3968f);
    }

    public final void c(c cVar, long j10) {
        RecyclerView.c0 c0VarI = i(cVar.f3980d, cVar.f3981e, cVar.f3977a ? Long.MAX_VALUE : j10);
        if (c0VarI == null || c0VarI.mNestedRecyclerView == null || !c0VarI.isBound() || c0VarI.isInvalid()) {
            return;
        }
        h(c0VarI.mNestedRecyclerView.get(), j10);
    }

    public final void d(long j10) {
        for (int i10 = 0; i10 < this.f3972d.size(); i10++) {
            c cVar = (c) this.f3972d.get(i10);
            if (cVar.f3980d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.E0 && !this.f3969a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f3970b == 0) {
                this.f3970b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f3686h0.e(i10, i11);
    }

    public void g(long j10) {
        b();
        d(j10);
    }

    public final void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.E && recyclerView.f3681f.j() != 0) {
            recyclerView.i1();
        }
        b bVar = recyclerView.f3686h0;
        bVar.c(recyclerView, true);
        if (bVar.f3976d != 0) {
            try {
                Trace.beginSection(j10 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.f3688i0.f(recyclerView.f3695m);
                for (int i10 = 0; i10 < bVar.f3976d * 2; i10 += 2) {
                    i(recyclerView, bVar.f3975c[i10], j10);
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final RecyclerView.c0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f3675c;
        if (j10 == Long.MAX_VALUE) {
            try {
                if (r.c()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.U0(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.S0();
        RecyclerView.c0 c0VarN = uVar.N(i10, false, j10);
        if (c0VarN != null) {
            if (!c0VarN.isBound() || c0VarN.isInvalid()) {
                uVar.a(c0VarN, false);
            } else {
                uVar.G(c0VarN.itemView);
            }
        }
        recyclerView.U0(false);
        Trace.endSection();
        return c0VarN;
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f3969a.remove(recyclerView);
        if (RecyclerView.E0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f3969a.isEmpty()) {
                int size = this.f3969a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3969a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3971c);
                }
            }
        } finally {
            this.f3970b = 0L;
            Trace.endSection();
        }
    }
}
