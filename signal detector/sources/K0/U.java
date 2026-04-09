package k0;

import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import o4.AbstractC2763b;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f21577a;

    /* renamed from: b, reason: collision with root package name */
    public int f21578b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC2617v f21579c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f21580d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f21581e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21582f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21583g;

    /* renamed from: h, reason: collision with root package name */
    public final P f21584h;

    public U(int i, int i3, P p6, N.d dVar) {
        AbstractC2763b.g(i, "finalState");
        AbstractC2763b.g(i3, "lifecycleImpact");
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p6.f21558c;
        q5.i.d(abstractComponentCallbacksC2617v, "fragmentStateManager.fragment");
        AbstractC2763b.g(i, "finalState");
        AbstractC2763b.g(i3, "lifecycleImpact");
        q5.i.e(abstractComponentCallbacksC2617v, "fragment");
        this.f21577a = i;
        this.f21578b = i3;
        this.f21579c = abstractComponentCallbacksC2617v;
        this.f21580d = new ArrayList();
        this.f21581e = new LinkedHashSet();
        dVar.a(new F4.c(19, this));
        this.f21584h = p6;
    }

    public final void a() {
        if (this.f21582f) {
            return;
        }
        this.f21582f = true;
        if (this.f21581e.isEmpty()) {
            b();
            return;
        }
        LinkedHashSet linkedHashSet = this.f21581e;
        q5.i.e(linkedHashSet, "<this>");
        for (N.d dVar : new LinkedHashSet(linkedHashSet)) {
            synchronized (dVar) {
                try {
                    if (!dVar.f2960a) {
                        dVar.f2960a = true;
                        dVar.f2962c = true;
                        N.c cVar = dVar.f2961b;
                        if (cVar != null) {
                            try {
                                cVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (dVar) {
                                    dVar.f2962c = false;
                                    dVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (dVar) {
                            dVar.f2962c = false;
                            dVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f21583g) {
            if (K.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f21583g = true;
            ArrayList arrayList = this.f21580d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.f21584h.k();
    }

    public final void c(int i, int i3) {
        AbstractC2763b.g(i, "finalState");
        AbstractC2763b.g(i3, "lifecycleImpact");
        int iC = AbstractC2984e.c(i3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21579c;
        if (iC == 0) {
            if (this.f21577a != 1) {
                if (K.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2617v + " mFinalState = " + AbstractC1135f5.u(this.f21577a) + " -> " + AbstractC1135f5.u(i) + '.');
                }
                this.f21577a = i;
                return;
            }
            return;
        }
        if (iC == 1) {
            if (this.f21577a == 1) {
                if (K.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2617v + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC1135f5.t(this.f21578b) + " to ADDING.");
                }
                this.f21577a = 2;
                this.f21578b = 2;
                return;
            }
            return;
        }
        if (iC != 2) {
            return;
        }
        if (K.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2617v + " mFinalState = " + AbstractC1135f5.u(this.f21577a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC1135f5.t(this.f21578b) + " to REMOVING.");
        }
        this.f21577a = 1;
        this.f21578b = 3;
    }

    public final void d() {
        int i = this.f21578b;
        P p6 = this.f21584h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p6.f21558c;
                q5.i.d(abstractComponentCallbacksC2617v, "fragmentStateManager.fragment");
                View viewS = abstractComponentCallbacksC2617v.S();
                if (K.H(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewS.findFocus() + " on view " + viewS + " for Fragment " + abstractComponentCallbacksC2617v);
                }
                viewS.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = p6.f21558c;
        q5.i.d(abstractComponentCallbacksC2617v2, "fragmentStateManager.fragment");
        View viewFindFocus = abstractComponentCallbacksC2617v2.f21696T.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC2617v2.g().f21677k = viewFindFocus;
            if (K.H(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC2617v2);
            }
        }
        View viewS2 = this.f21579c.S();
        if (viewS2.getParent() == null) {
            p6.b();
            viewS2.setAlpha(0.0f);
        }
        if (viewS2.getAlpha() == 0.0f && viewS2.getVisibility() == 0) {
            viewS2.setVisibility(4);
        }
        C2614s c2614s = abstractComponentCallbacksC2617v2.f21699W;
        viewS2.setAlpha(c2614s == null ? 1.0f : c2614s.f21676j);
    }

    public final String toString() {
        StringBuilder sbQ = AbstractC1135f5.q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbQ.append(AbstractC1135f5.u(this.f21577a));
        sbQ.append(" lifecycleImpact = ");
        sbQ.append(AbstractC1135f5.t(this.f21578b));
        sbQ.append(" fragment = ");
        sbQ.append(this.f21579c);
        sbQ.append('}');
        return sbQ.toString();
    }
}
