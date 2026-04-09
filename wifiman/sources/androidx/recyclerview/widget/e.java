package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    static final ThreadLocal f32206e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    static Comparator f32207f = new a();

    /* renamed from: b, reason: collision with root package name */
    long f32209b;

    /* renamed from: c, reason: collision with root package name */
    long f32210c;

    /* renamed from: a, reason: collision with root package name */
    ArrayList f32208a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f32211d = new ArrayList();

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f32219d;
            if ((recyclerView == null) != (cVar2.f32219d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f32216a;
            if (z10 != cVar2.f32216a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f32217b - cVar.f32217b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f32218c - cVar2.f32218c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.o.c {

        /* renamed from: a, reason: collision with root package name */
        int f32212a;

        /* renamed from: b, reason: collision with root package name */
        int f32213b;

        /* renamed from: c, reason: collision with root package name */
        int[] f32214c;

        /* renamed from: d, reason: collision with root package name */
        int f32215d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f32215d;
            int i13 = i12 * 2;
            int[] iArr = this.f32214c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f32214c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f32214c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f32214c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f32215d++;
        }

        void b() {
            int[] iArr = this.f32214c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f32215d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f32215d = 0;
            int[] iArr = this.f32214c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f31898m;
            if (recyclerView.f31896l == null || oVar == null || !oVar.y0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f31882d.p()) {
                    oVar.u(recyclerView.f31896l.c(), this);
                }
            } else if (!recyclerView.l0()) {
                oVar.t(this.f32212a, this.f32213b, recyclerView.f31921x1, this);
            }
            int i10 = this.f32215d;
            if (i10 > oVar.f31982m) {
                oVar.f31982m = i10;
                oVar.f31983n = z10;
                recyclerView.f31880b.K();
            }
        }

        boolean d(int i10) {
            if (this.f32214c != null) {
                int i11 = this.f32215d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f32214c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f32212a = i10;
            this.f32213b = i11;
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f32216a;

        /* renamed from: b, reason: collision with root package name */
        public int f32217b;

        /* renamed from: c, reason: collision with root package name */
        public int f32218c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f32219d;

        /* renamed from: e, reason: collision with root package name */
        public int f32220e;

        c() {
        }

        public void a() {
            this.f32216a = false;
            this.f32217b = 0;
            this.f32218c = 0;
            this.f32219d = null;
            this.f32220e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f32208a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f32208a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f31919w1.c(recyclerView, false);
                i10 += recyclerView.f31919w1.f32215d;
            }
        }
        this.f32211d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f32208a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f31919w1;
                int iAbs = Math.abs(bVar.f32212a) + Math.abs(bVar.f32213b);
                for (int i14 = 0; i14 < bVar.f32215d * 2; i14 += 2) {
                    if (i12 >= this.f32211d.size()) {
                        cVar = new c();
                        this.f32211d.add(cVar);
                    } else {
                        cVar = (c) this.f32211d.get(i12);
                    }
                    int[] iArr = bVar.f32214c;
                    int i15 = iArr[i14 + 1];
                    cVar.f32216a = i15 <= iAbs;
                    cVar.f32217b = iAbs;
                    cVar.f32218c = i15;
                    cVar.f32219d = recyclerView2;
                    cVar.f32220e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f32211d, f32207f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.C cI = i(cVar.f32219d, cVar.f32220e, cVar.f32216a ? Long.MAX_VALUE : j10);
        if (cI == null || cI.f31935b == null || !cI.s() || cI.t()) {
            return;
        }
        h((RecyclerView) cI.f31935b.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f32211d.size(); i10++) {
            c cVar = (c) this.f32211d.get(i10);
            if (cVar.f32219d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f31883e.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.C cF0 = RecyclerView.f0(recyclerView.f31883e.i(i11));
            if (cF0.f31936c == i10 && !cF0.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f31859C && recyclerView.f31883e.j() != 0) {
            recyclerView.T0();
        }
        b bVar = recyclerView.f31919w1;
        bVar.c(recyclerView, true);
        if (bVar.f32215d != 0) {
            try {
                A1.o.a("RV Nested Prefetch");
                recyclerView.f31921x1.f(recyclerView.f31896l);
                for (int i10 = 0; i10 < bVar.f32215d * 2; i10 += 2) {
                    i(recyclerView, bVar.f32214c[i10], j10);
                }
            } finally {
                A1.o.b();
            }
        }
    }

    private RecyclerView.C i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f31880b;
        try {
            recyclerView.F0();
            RecyclerView.C cI = uVar.I(i10, false, j10);
            if (cI != null) {
                if (!cI.s() || cI.t()) {
                    uVar.a(cI, false);
                } else {
                    uVar.B(cI.f31934a);
                }
            }
            recyclerView.H0(false);
            return cI;
        } catch (Throwable th2) {
            recyclerView.H0(false);
            throw th2;
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f32208a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f32209b == 0) {
            this.f32209b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f31919w1.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f32208a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            A1.o.a("RV Prefetch");
            if (!this.f32208a.isEmpty()) {
                int size = this.f32208a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f32208a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f32210c);
                    this.f32209b = 0L;
                    A1.o.b();
                }
            }
        } finally {
            this.f32209b = 0L;
            A1.o.b();
        }
    }
}
