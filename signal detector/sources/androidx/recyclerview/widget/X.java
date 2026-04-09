package androidx.recyclerview.widget;

import R.C0175b;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5410a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f5411b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5412c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5413d;

    /* renamed from: e, reason: collision with root package name */
    public int f5414e;

    /* renamed from: f, reason: collision with root package name */
    public int f5415f;

    /* renamed from: g, reason: collision with root package name */
    public W f5416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5417h;

    public X(RecyclerView recyclerView) {
        this.f5417h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f5410a = arrayList;
        this.f5411b = null;
        this.f5412c = new ArrayList();
        this.f5413d = Collections.unmodifiableList(arrayList);
        this.f5414e = 2;
        this.f5415f = 2;
    }

    public final void a(g0 g0Var, boolean z6) {
        RecyclerView.j(g0Var);
        View view = g0Var.itemView;
        RecyclerView recyclerView = this.f5417h;
        i0 i0Var = recyclerView.f5308B0;
        if (i0Var != null) {
            h0 h0Var = i0Var.f5494e;
            R.O.m(view, h0Var != null ? (C0175b) ((WeakHashMap) h0Var.f5487f).remove(view) : null);
        }
        if (z6) {
            ArrayList arrayList = recyclerView.f5364n;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            G g2 = recyclerView.f5360l;
            if (g2 != null) {
                g2.onViewRecycled(g0Var);
            }
            if (recyclerView.f5372u0 != null) {
                recyclerView.f5349f.y(g0Var);
            }
        }
        g0Var.mBindingAdapter = null;
        g0Var.mOwnerRecyclerView = null;
        W wC = c();
        wC.getClass();
        int itemViewType = g0Var.getItemViewType();
        ArrayList arrayList2 = wC.a(itemViewType).f5404a;
        if (((V) wC.f5408a.get(itemViewType)).f5405b <= arrayList2.size()) {
            return;
        }
        g0Var.resetInternal();
        arrayList2.add(g0Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.f5417h;
        if (i >= 0 && i < recyclerView.f5372u0.b()) {
            return !recyclerView.f5372u0.f5448g ? i : recyclerView.f5345d.g(i, 0);
        }
        StringBuilder sbP = AbstractC1135f5.p(i, "invalid position ", ". State item count is ");
        sbP.append(recyclerView.f5372u0.b());
        sbP.append(recyclerView.z());
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public final W c() {
        if (this.f5416g == null) {
            W w6 = new W();
            w6.f5408a = new SparseArray();
            w6.f5409b = 0;
            this.f5416g = w6;
        }
        return this.f5416g;
    }

    public final View d(int i) {
        return j(i, Long.MAX_VALUE).itemView;
    }

    public final void e() {
        ArrayList arrayList = this.f5412c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f5304N0;
        C0318o c0318o = this.f5417h.f5371t0;
        int[] iArr2 = c0318o.f5560c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0318o.f5561d = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.f5412c;
        a((g0) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        g0 g0VarJ = RecyclerView.J(view);
        boolean zIsTmpDetached = g0VarJ.isTmpDetached();
        RecyclerView recyclerView = this.f5417h;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (g0VarJ.isScrap()) {
            g0VarJ.unScrap();
        } else if (g0VarJ.wasReturnedFromScrap()) {
            g0VarJ.clearReturnedFromScrapFlag();
        }
        h(g0VarJ);
        if (recyclerView.f5344c0 == null || g0VarJ.isRecyclable()) {
            return;
        }
        recyclerView.f5344c0.d(g0VarJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(androidx.recyclerview.widget.g0 r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.X.h(androidx.recyclerview.widget.g0):void");
    }

    public final void i(View view) {
        L l2;
        g0 g0VarJ = RecyclerView.J(view);
        boolean zHasAnyOfTheFlags = g0VarJ.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f5417h;
        if (!zHasAnyOfTheFlags && g0VarJ.isUpdated() && (l2 = recyclerView.f5344c0) != null) {
            C0313j c0313j = (C0313j) l2;
            if (g0VarJ.getUnmodifiedPayloads().isEmpty() && c0313j.f5496g && !g0VarJ.isInvalid()) {
                if (this.f5411b == null) {
                    this.f5411b = new ArrayList();
                }
                g0VarJ.setScrapContainer(this, true);
                this.f5411b.add(g0VarJ);
                return;
            }
        }
        if (g0VarJ.isInvalid() && !g0VarJ.isRemoved() && !recyclerView.f5360l.hasStableIds()) {
            throw new IllegalArgumentException(A.f.j(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        g0VarJ.setScrapContainer(this, false);
        this.f5410a.add(g0VarJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.g0 j(int r28, long r29) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.X.j(int, long):androidx.recyclerview.widget.g0");
    }

    public final void k(g0 g0Var) {
        if (g0Var.mInChangeScrap) {
            this.f5411b.remove(g0Var);
        } else {
            this.f5410a.remove(g0Var);
        }
        g0Var.mScrapContainer = null;
        g0Var.mInChangeScrap = false;
        g0Var.clearReturnedFromScrapFlag();
    }

    public final void l() {
        Q q3 = this.f5417h.f5362m;
        this.f5415f = this.f5414e + (q3 != null ? q3.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f5412c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f5415f; size--) {
            f(size);
        }
    }
}
