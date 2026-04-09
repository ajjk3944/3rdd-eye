package h7;

import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.widget.MicroDotsProgressBar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10055d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10056e;

    public f(String str) {
        this.f10056e = str;
    }

    @Override // h7.q0
    public final int b() {
        switch (this.f10055d) {
            case 0:
                Iterator it = ((ArrayList) ((a8.f) this.f10056e).f199e).iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    i10 += ((g0) it.next()).f10073e;
                }
                return i10;
            case 1:
                return 1;
            default:
                return 1;
        }
    }

    @Override // h7.q0
    public long c(int i10) {
        switch (this.f10055d) {
            case 0:
                a8.f fVar = (a8.f) this.f10056e;
                g gVarP = fVar.p(i10);
                g0 g0Var = (g0) gVarP.f10068c;
                long jI = g0Var.f10070b.i(g0Var.f10071c.c(gVarP.f10066a));
                gVarP.f10067b = false;
                gVarP.f10068c = null;
                gVarP.f10066a = -1;
                fVar.f200f = gVarP;
                return jI;
            default:
                return super.c(i10);
        }
    }

    @Override // h7.q0
    public int d(int i10) {
        int iValueAt;
        switch (this.f10055d) {
            case 0:
                a8.f fVar = (a8.f) this.f10056e;
                g gVarP = fVar.p(i10);
                g0 g0Var = (g0) gVarP.f10068c;
                int i11 = gVarP.f10066a;
                kg.r rVar = g0Var.f10069a;
                int iD = g0Var.f10071c.d(i11);
                SparseIntArray sparseIntArray = (SparseIntArray) rVar.f14395a;
                int iIndexOfKey = sparseIntArray.indexOfKey(iD);
                if (iIndexOfKey > -1) {
                    iValueAt = sparseIntArray.valueAt(iIndexOfKey);
                } else {
                    ag.b bVar = (ag.b) rVar.f14398r;
                    g0 g0Var2 = (g0) rVar.f14397g;
                    int i12 = bVar.f345d;
                    bVar.f345d = i12 + 1;
                    ((SparseArray) bVar.f346g).put(i12, g0Var2);
                    sparseIntArray.put(iD, i12);
                    ((SparseIntArray) rVar.f14396d).put(i12, iD);
                    iValueAt = i12;
                }
                gVarP.f10067b = false;
                gVarP.f10068c = null;
                gVarP.f10066a = -1;
                fVar.f200f = gVarP;
                return iValueAt;
            default:
                return super.d(i10);
        }
    }

    @Override // h7.q0
    public void i(RecyclerView recyclerView) {
        switch (this.f10055d) {
            case 0:
                a8.f fVar = (a8.f) this.f10056e;
                ArrayList arrayList = (ArrayList) fVar.f197c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((WeakReference) it.next()).get() == recyclerView) {
                        break;
                    }
                }
                arrayList.add(new WeakReference(recyclerView));
                Iterator it2 = ((ArrayList) fVar.f199e).iterator();
                while (it2.hasNext()) {
                    ((g0) it2.next()).f10071c.i(recyclerView);
                }
                break;
        }
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) {
        switch (this.f10055d) {
            case 0:
                a8.f fVar = (a8.f) this.f10056e;
                g gVarP = fVar.p(i10);
                ((IdentityHashMap) fVar.f198d).put(n1Var, (g0) gVarP.f10068c);
                g0 g0Var = (g0) gVarP.f10068c;
                g0Var.f10071c.a(n1Var, gVarP.f10066a);
                gVarP.f10067b = false;
                gVarP.f10068c = null;
                gVarP.f10066a = -1;
                fVar.f200f = gVarP;
                break;
            case 1:
                MicroDotsProgressBar microDotsProgressBar = ((zp.b) n1Var).f27496u;
                microDotsProgressBar.f6550g = true;
                if (microDotsProgressBar.isAttachedToWindow()) {
                    Iterator it = microDotsProgressBar.f6549d.iterator();
                    while (it.hasNext()) {
                        ((ValueAnimator) it.next()).start();
                    }
                    break;
                }
                break;
            default:
                break;
        }
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        switch (this.f10055d) {
            case 0:
                g0 g0Var = (g0) ((SparseArray) ((ag.b) ((a8.f) this.f10056e).f196b).f346g).get(i10);
                if (g0Var == null) {
                    throw new IllegalArgumentException(h0.b.h(i10, "Cannot find the wrapper for global view type "));
                }
                kg.r rVar = g0Var.f10069a;
                SparseIntArray sparseIntArray = (SparseIntArray) rVar.f14396d;
                int iIndexOfKey = sparseIntArray.indexOfKey(i10);
                if (iIndexOfKey >= 0) {
                    return g0Var.f10071c.k(viewGroup, sparseIntArray.valueAt(iIndexOfKey));
                }
                StringBuilder sbU = h0.b.u("requested global type ", i10, " does not belong to the adapter:");
                sbU.append(((g0) rVar.f14397g).f10071c);
                throw new IllegalStateException(sbU.toString());
            case 1:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(on.t.item_micro_dots_progress_bar, viewGroup, false);
                br.l.b(viewInflate);
                return new zp.b(viewInflate, (MicroColorScheme) this.f10056e);
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(on.t.item_micro_notification, viewGroup, false);
                br.l.b(viewInflate2);
                String str = (String) this.f10056e;
                br.l.e(str, "notificationText");
                zp.c cVar = new zp.c(viewInflate2);
                View viewFindViewById = viewInflate2.findViewById(on.r.item_micro_notification_label);
                br.l.d(viewFindViewById, "findViewById(...)");
                ((TextView) viewFindViewById).setText(str);
                return cVar;
        }
    }

    @Override // h7.q0
    public void l(RecyclerView recyclerView) {
        switch (this.f10055d) {
            case 0:
                a8.f fVar = (a8.f) this.f10056e;
                ArrayList arrayList = (ArrayList) fVar.f197c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        WeakReference weakReference = (WeakReference) arrayList.get(size);
                        if (weakReference.get() == null) {
                            arrayList.remove(size);
                        } else if (weakReference.get() == recyclerView) {
                            arrayList.remove(size);
                        }
                        size--;
                    }
                }
                Iterator it = ((ArrayList) fVar.f199e).iterator();
                while (it.hasNext()) {
                    ((g0) it.next()).f10071c.l(recyclerView);
                }
                break;
        }
    }

    @Override // h7.q0
    public boolean m(n1 n1Var) {
        switch (this.f10055d) {
            case 0:
                a8.f fVar = (a8.f) this.f10056e;
                IdentityHashMap identityHashMap = (IdentityHashMap) fVar.f198d;
                g0 g0Var = (g0) identityHashMap.get(n1Var);
                if (g0Var != null) {
                    boolean zM = g0Var.f10071c.m(n1Var);
                    identityHashMap.remove(n1Var);
                    return zM;
                }
                throw new IllegalStateException("Cannot find wrapper for " + n1Var + ", seems like it is not bound by this adapter: " + fVar);
            default:
                return super.m(n1Var);
        }
    }

    @Override // h7.q0
    public void n(n1 n1Var) {
        switch (this.f10055d) {
            case 0:
                ((a8.f) this.f10056e).w(n1Var).f10071c.n(n1Var);
                break;
        }
    }

    @Override // h7.q0
    public void o(n1 n1Var) {
        switch (this.f10055d) {
            case 0:
                ((a8.f) this.f10056e).w(n1Var).f10071c.o(n1Var);
                break;
        }
    }

    @Override // h7.q0
    public void p(n1 n1Var) {
        switch (this.f10055d) {
            case 0:
                a8.f fVar = (a8.f) this.f10056e;
                IdentityHashMap identityHashMap = (IdentityHashMap) fVar.f198d;
                g0 g0Var = (g0) identityHashMap.get(n1Var);
                if (g0Var != null) {
                    g0Var.f10071c.p(n1Var);
                    identityHashMap.remove(n1Var);
                    return;
                } else {
                    throw new IllegalStateException("Cannot find wrapper for " + n1Var + ", seems like it is not bound by this adapter: " + fVar);
                }
            default:
                return;
        }
    }

    public void q(q0 q0Var) {
        a8.f fVar = (a8.f) this.f10056e;
        ArrayList arrayList = (ArrayList) fVar.f199e;
        int size = arrayList.size();
        if (size < 0 || size > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + size);
        }
        if (((d) fVar.f201g) != d.NO_STABLE_IDS) {
            se.b.k("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", q0Var.f10190b);
        } else if (q0Var.f10190b) {
            io.sentry.android.core.e0.p("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int iX = fVar.x(q0Var);
        if ((iX == -1 ? null : (g0) arrayList.get(iX)) != null) {
            return;
        }
        g0 g0Var = new g0(q0Var, fVar, (ag.b) fVar.f196b, ((t1) fVar.f202h).w());
        arrayList.add(size, g0Var);
        Iterator it = ((ArrayList) fVar.f197c).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                q0Var.i(recyclerView);
            }
        }
        if (g0Var.f10073e > 0) {
            ((f) fVar.f195a).g(fVar.k(g0Var), g0Var.f10073e);
        }
        fVar.e();
    }

    public List r() {
        List list;
        ArrayList arrayList = (ArrayList) ((a8.f) this.f10056e).f199e;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((g0) it.next()).f10071c);
            }
            list = arrayList2;
        }
        return Collections.unmodifiableList(list);
    }

    public void s(q0 q0Var) {
        a8.f fVar = (a8.f) this.f10056e;
        ArrayList arrayList = (ArrayList) fVar.f199e;
        int iX = fVar.x(q0Var);
        if (iX == -1) {
            return;
        }
        g0 g0Var = (g0) arrayList.get(iX);
        int iK = fVar.k(g0Var);
        arrayList.remove(iX);
        ((f) fVar.f195a).h(iK, g0Var.f10073e);
        Iterator it = ((ArrayList) fVar.f197c).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                q0Var.l(recyclerView);
            }
        }
        g0Var.f10071c.f10189a.unregisterObserver(g0Var.f10074f);
        kg.r rVar = g0Var.f10069a;
        ag.b bVar = (ag.b) rVar.f14398r;
        g0 g0Var2 = (g0) rVar.f14397g;
        SparseArray sparseArray = (SparseArray) bVar.f346g;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((g0) sparseArray.valueAt(size)) == g0Var2) {
                sparseArray.removeAt(size);
            }
        }
        fVar.e();
    }

    public f(MicroColorScheme microColorScheme) {
        br.l.e(microColorScheme, "colorScheme");
        this.f10056e = microColorScheme;
    }

    public f(q0[] q0VarArr) {
        e eVar = e.f10036b;
        List listAsList = Arrays.asList(q0VarArr);
        this.f10056e = new a8.f(this, eVar);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            q((q0) it.next());
        }
        boolean z10 = ((d) ((a8.f) this.f10056e).f201g) != d.NO_STABLE_IDS;
        if (!this.f10189a.a()) {
            this.f10190b = z10;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
}
