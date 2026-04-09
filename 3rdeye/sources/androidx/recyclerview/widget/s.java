package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<s> f16746f = new ThreadLocal<>();

    /* renamed from: g, reason: collision with root package name */
    public static final a f16747g = new a();

    /* renamed from: c, reason: collision with root package name */
    public long f16749c;

    /* renamed from: d, reason: collision with root package name */
    public long f16750d;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<RecyclerView> f16748b = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<c> f16751e = new ArrayList<>();

    /* compiled from: GapWorker.java */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.f16759d;
            if ((recyclerView == null) == (cVar4.f16759d == null)) {
                boolean z10 = cVar3.f16756a;
                if (z10 == cVar4.f16756a) {
                    int i = cVar4.f16757b - cVar3.f16757b;
                    if (i != 0) {
                        return i;
                    }
                    int i10 = cVar3.f16758c - cVar4.f16758c;
                    if (i10 != 0) {
                        return i10;
                    }
                    return 0;
                }
                if (z10) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16752a;

        /* renamed from: b, reason: collision with root package name */
        public int f16753b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f16754c;

        /* renamed from: d, reason: collision with root package name */
        public int f16755d;

        public final void a(int i, int i10) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i11 = this.f16755d;
            int i12 = i11 * 2;
            int[] iArr = this.f16754c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f16754c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i11 * 4];
                this.f16754c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f16754c;
            iArr4[i12] = i;
            iArr4[i12 + 1] = i10;
            this.f16755d++;
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            this.f16755d = 0;
            int[] iArr = this.f16754c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || pVar == null || !pVar.i) {
                return;
            }
            if (z10) {
                if (!recyclerView.mAdapterHelper.g()) {
                    pVar.A(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                pVar.z(this.f16752a, this.f16753b, recyclerView.mState, this);
            }
            int i = this.f16755d;
            if (i > pVar.f16506j) {
                pVar.f16506j = i;
                pVar.f16507k = z10;
                recyclerView.mRecycler.n();
            }
        }
    }

    /* compiled from: GapWorker.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16756a;

        /* renamed from: b, reason: collision with root package name */
        public int f16757b;

        /* renamed from: c, reason: collision with root package name */
        public int f16758c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f16759d;

        /* renamed from: e, reason: collision with root package name */
        public int f16760e;
    }

    public static RecyclerView.F c(RecyclerView recyclerView, int i, long j4) {
        int iH = recyclerView.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            RecyclerView.F childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i10));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.F fL = wVar.l(i, j4);
            if (fL != null) {
                if (!fL.isBound() || fL.isInvalid()) {
                    wVar.a(fL, false);
                } else {
                    wVar.i(fL.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return fL;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i10) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f16748b.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f16749c == 0) {
                this.f16749c = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.f16752a = i;
        bVar.f16753b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.s.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G0.s.f1858a;
            Trace.beginSection("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f16748b;
            if (arrayList.isEmpty()) {
                this.f16749c = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView recyclerView = arrayList.get(i10);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f16749c = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f16750d);
                this.f16749c = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f16749c = 0L;
            int i11 = G0.s.f1858a;
            Trace.endSection();
            throw th;
        }
    }
}
