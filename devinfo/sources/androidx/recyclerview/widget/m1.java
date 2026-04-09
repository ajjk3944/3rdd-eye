package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1455a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1456b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1457c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1458d;

    /* renamed from: e, reason: collision with root package name */
    public int f1459e;

    /* renamed from: f, reason: collision with root package name */
    public int f1460f;
    public l1 g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1461h;

    public m1(RecyclerView recyclerView) {
        this.f1461h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1455a = arrayList;
        this.f1456b = null;
        this.f1457c = new ArrayList();
        this.f1458d = DesugarCollections.unmodifiableList(arrayList);
        this.f1459e = 2;
        this.f1460f = 2;
    }

    public final void a(x1 x1Var, boolean z3) {
        RecyclerView.m(x1Var);
        View view = x1Var.itemView;
        RecyclerView recyclerView = this.f1461h;
        z1 z1Var = recyclerView.f1246o0;
        if (z1Var != null) {
            y1 y1Var = z1Var.f1566e;
            e4.v0.o(view, y1Var != null ? (e4.b) y1Var.f1557e.remove(view) : null);
        }
        if (z3) {
            n1 n1Var = recyclerView.f1245o;
            ArrayList arrayList = recyclerView.f1247p;
            if (n1Var != null) {
                n1Var.a(x1Var);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((n1) arrayList.get(i4)).a(x1Var);
            }
            t0 t0Var = recyclerView.f1241m;
            if (t0Var != null) {
                t0Var.onViewRecycled(x1Var);
            }
            if (recyclerView.f1233h0 != null) {
                recyclerView.g.x(x1Var);
            }
            if (RecyclerView.D0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + x1Var);
            }
        }
        x1Var.mBindingAdapter = null;
        x1Var.mOwnerRecyclerView = null;
        l1 l1VarC = c();
        l1VarC.getClass();
        int itemViewType = x1Var.getItemViewType();
        ArrayList arrayList2 = l1VarC.a(itemViewType).f1427a;
        if (((k1) l1VarC.f1447a.get(itemViewType)).f1428b <= arrayList2.size()) {
            pd.b.d(x1Var.itemView);
        } else {
            if (RecyclerView.C0 && arrayList2.contains(x1Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            x1Var.resetInternal();
            arrayList2.add(x1Var);
        }
    }

    public final int b(int i4) {
        RecyclerView recyclerView = this.f1461h;
        if (i4 >= 0 && i4 < recyclerView.f1233h0.b()) {
            return !recyclerView.f1233h0.g ? i4 : recyclerView.f1227e.t(i4, 0);
        }
        StringBuilder sbW = je.u.w(i4, "invalid position ", ". State item count is ");
        sbW.append(recyclerView.f1233h0.b());
        sbW.append(recyclerView.C());
        throw new IndexOutOfBoundsException(sbW.toString());
    }

    public final l1 c() {
        if (this.g == null) {
            l1 l1Var = new l1();
            l1Var.f1447a = new SparseArray();
            l1Var.f1448b = 0;
            l1Var.f1449c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = l1Var;
            e();
        }
        return this.g;
    }

    public final View d(int i4) {
        return l(i4, Long.MAX_VALUE).itemView;
    }

    public final void e() {
        RecyclerView recyclerView;
        t0 t0Var;
        l1 l1Var = this.g;
        if (l1Var == null || (t0Var = (recyclerView = this.f1461h).f1241m) == null || !recyclerView.f1255t) {
            return;
        }
        l1Var.f1449c.add(t0Var);
    }

    public final void f(t0 t0Var, boolean z3) {
        l1 l1Var = this.g;
        if (l1Var != null) {
            SparseArray sparseArray = l1Var.f1447a;
            Set set = l1Var.f1449c;
            set.remove(t0Var);
            if (set.size() != 0 || z3) {
                return;
            }
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                ArrayList arrayList = ((k1) sparseArray.get(sparseArray.keyAt(i4))).f1427a;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    pd.b.d(((x1) arrayList.get(i10)).itemView);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f1457c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.H0) {
            y yVar = this.f1461h.f1231g0;
            int[] iArr = yVar.f1554c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            yVar.f1555d = 0;
        }
    }

    public final void h(int i4) {
        if (RecyclerView.D0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i4);
        }
        ArrayList arrayList = this.f1457c;
        x1 x1Var = (x1) arrayList.get(i4);
        if (RecyclerView.D0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + x1Var);
        }
        a(x1Var, true);
        arrayList.remove(i4);
    }

    public final void i(View view) {
        x1 x1VarP = RecyclerView.P(view);
        boolean zIsTmpDetached = x1VarP.isTmpDetached();
        RecyclerView recyclerView = this.f1461h;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (x1VarP.isScrap()) {
            x1VarP.unScrap();
        } else if (x1VarP.wasReturnedFromScrap()) {
            x1VarP.clearReturnedFromScrapFlag();
        }
        j(x1VarP);
        if (recyclerView.M == null || x1VarP.isRecyclable()) {
            return;
        }
        recyclerView.M.d(x1VarP);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d2, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(androidx.recyclerview.widget.x1 r12) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m1.j(androidx.recyclerview.widget.x1):void");
    }

    public final void k(View view) {
        a1 a1Var;
        x1 x1VarP = RecyclerView.P(view);
        boolean zHasAnyOfTheFlags = x1VarP.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f1461h;
        if (!zHasAnyOfTheFlags && x1VarP.isUpdated() && (a1Var = recyclerView.M) != null) {
            l lVar = (l) a1Var;
            if (x1VarP.getUnmodifiedPayloads().isEmpty() && lVar.g && !x1VarP.isInvalid()) {
                if (this.f1456b == null) {
                    this.f1456b = new ArrayList();
                }
                x1VarP.setScrapContainer(this, true);
                this.f1456b.add(x1VarP);
                return;
            }
        }
        if (x1VarP.isInvalid() && !x1VarP.isRemoved() && !recyclerView.f1241m.hasStableIds()) {
            throw new IllegalArgumentException(a0.g.k(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        x1VarP.setScrapContainer(this, false);
        this.f1455a.add(x1VarP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0549 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.x1 l(int r29, long r30) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m1.l(int, long):androidx.recyclerview.widget.x1");
    }

    public final void m(x1 x1Var) {
        if (x1Var.mInChangeScrap) {
            this.f1456b.remove(x1Var);
        } else {
            this.f1455a.remove(x1Var);
        }
        x1Var.mScrapContainer = null;
        x1Var.mInChangeScrap = false;
        x1Var.clearReturnedFromScrapFlag();
    }

    public final void n() {
        f1 f1Var = this.f1461h.f1243n;
        this.f1460f = this.f1459e + (f1Var != null ? f1Var.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f1457c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1460f; size--) {
            h(size);
        }
    }
}
