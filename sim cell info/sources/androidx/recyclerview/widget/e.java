package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    static final ThreadLocal<e> f2181f = new ThreadLocal<>();

    /* renamed from: g, reason: collision with root package name */
    static Comparator<c> f2182g = new a();

    /* renamed from: c, reason: collision with root package name */
    long f2184c;

    /* renamed from: d, reason: collision with root package name */
    long f2185d;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<RecyclerView> f2183b = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<c> f2186e = new ArrayList<>();

    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f2194d;
            if ((recyclerView == null) != (cVar2.f2194d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z2 = cVar.f2191a;
            if (z2 != cVar2.f2191a) {
                return z2 ? -1 : 1;
            }
            int i2 = cVar2.f2192b - cVar.f2192b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f2193c - cVar2.f2193c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.o.c {

        /* renamed from: a, reason: collision with root package name */
        int f2187a;

        /* renamed from: b, reason: collision with root package name */
        int f2188b;

        /* renamed from: c, reason: collision with root package name */
        int[] f2189c;

        /* renamed from: d, reason: collision with root package name */
        int f2190d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i4 = this.f2190d * 2;
            int[] iArr = this.f2189c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2189c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i4 * 2];
                this.f2189c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2189c;
            iArr4[i4] = i2;
            iArr4[i4 + 1] = i3;
            this.f2190d++;
        }

        void b() {
            int[] iArr = this.f2189c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2190d = 0;
        }

        void c(RecyclerView recyclerView, boolean z2) {
            this.f2190d = 0;
            int[] iArr = this.f2189c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f1920n;
            if (recyclerView.f1918m == null || oVar == null || !oVar.s0()) {
                return;
            }
            if (z2) {
                if (!recyclerView.f1902e.p()) {
                    oVar.o(recyclerView.f1918m.c(), this);
                }
            } else if (!recyclerView.j0()) {
                oVar.n(this.f2187a, this.f2188b, recyclerView.f1911i0, this);
            }
            int i2 = this.f2190d;
            if (i2 > oVar.f2010m) {
                oVar.f2010m = i2;
                oVar.f2011n = z2;
                recyclerView.f1898c.K();
            }
        }

        boolean d(int i2) {
            if (this.f2189c != null) {
                int i3 = this.f2190d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f2189c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i2, int i3) {
            this.f2187a = i2;
            this.f2188b = i3;
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2191a;

        /* renamed from: b, reason: collision with root package name */
        public int f2192b;

        /* renamed from: c, reason: collision with root package name */
        public int f2193c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f2194d;

        /* renamed from: e, reason: collision with root package name */
        public int f2195e;

        c() {
        }

        public void a() {
            this.f2191a = false;
            this.f2192b = 0;
            this.f2193c = 0;
            this.f2194d = null;
            this.f2195e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f2183b.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = this.f2183b.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f1909h0.c(recyclerView, false);
                i2 += recyclerView.f1909h0.f2190d;
            }
        }
        this.f2186e.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = this.f2183b.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f1909h0;
                int iAbs = Math.abs(bVar.f2187a) + Math.abs(bVar.f2188b);
                for (int i6 = 0; i6 < bVar.f2190d * 2; i6 += 2) {
                    if (i4 >= this.f2186e.size()) {
                        cVar = new c();
                        this.f2186e.add(cVar);
                    } else {
                        cVar = this.f2186e.get(i4);
                    }
                    int[] iArr = bVar.f2189c;
                    int i7 = iArr[i6 + 1];
                    cVar.f2191a = i7 <= iAbs;
                    cVar.f2192b = iAbs;
                    cVar.f2193c = i7;
                    cVar.f2194d = recyclerView2;
                    cVar.f2195e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f2186e, f2182g);
    }

    private void c(c cVar, long j2) {
        RecyclerView.d0 d0VarI = i(cVar.f2194d, cVar.f2195e, cVar.f2191a ? Long.MAX_VALUE : j2);
        if (d0VarI == null || d0VarI.f1966b == null || !d0VarI.s() || d0VarI.t()) {
            return;
        }
        h(d0VarI.f1966b.get(), j2);
    }

    private void d(long j2) {
        for (int i2 = 0; i2 < this.f2186e.size(); i2++) {
            c cVar = this.f2186e.get(i2);
            if (cVar.f2194d == null) {
                return;
            }
            c(cVar, j2);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i2) {
        int iJ = recyclerView.f1904f.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            RecyclerView.d0 d0VarD0 = RecyclerView.d0(recyclerView.f1904f.i(i3));
            if (d0VarD0.f1967c == i2 && !d0VarD0.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j2) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.E && recyclerView.f1904f.j() != 0) {
            recyclerView.Q0();
        }
        b bVar = recyclerView.f1909h0;
        bVar.c(recyclerView, true);
        if (bVar.f2190d != 0) {
            try {
                w.a.a("RV Nested Prefetch");
                recyclerView.f1911i0.f(recyclerView.f1918m);
                for (int i2 = 0; i2 < bVar.f2190d * 2; i2 += 2) {
                    i(recyclerView, bVar.f2189c[i2], j2);
                }
            } finally {
                w.a.b();
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i2, long j2) {
        if (e(recyclerView, i2)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.f1898c;
        try {
            recyclerView.C0();
            RecyclerView.d0 d0VarI = vVar.I(i2, false, j2);
            if (d0VarI != null) {
                if (!d0VarI.s() || d0VarI.t()) {
                    vVar.a(d0VarI, false);
                } else {
                    vVar.B(d0VarI.f1965a);
                }
            }
            return d0VarI;
        } finally {
            recyclerView.E0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f2183b.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f2184c == 0) {
            this.f2184c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f1909h0.e(i2, i3);
    }

    void g(long j2) {
        b();
        d(j2);
    }

    public void j(RecyclerView recyclerView) {
        this.f2183b.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            w.a.a("RV Prefetch");
            if (!this.f2183b.isEmpty()) {
                int size = this.f2183b.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = this.f2183b.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2185d);
                }
            }
        } finally {
            this.f2184c = 0L;
            w.a.b();
        }
    }
}
