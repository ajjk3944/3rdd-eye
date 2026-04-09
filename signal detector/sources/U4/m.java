package U4;

import R.O;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0292n;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.lefan.signal.ui.phone.PhoneFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.AbstractComponentCallbacksC2617v;
import k0.B;
import k0.C2597a;
import k0.C2616u;
import k0.K;
import k0.P;
import u.C2932a;
import u.C2937f;
import u.C2938g;

/* loaded from: classes.dex */
public final class m extends G {

    /* renamed from: a, reason: collision with root package name */
    public final C0300w f3749a;

    /* renamed from: b, reason: collision with root package name */
    public final K f3750b;

    /* renamed from: c, reason: collision with root package name */
    public final C2938g f3751c;

    /* renamed from: d, reason: collision with root package name */
    public final C2938g f3752d;

    /* renamed from: e, reason: collision with root package name */
    public final C2938g f3753e;

    /* renamed from: f, reason: collision with root package name */
    public R0.d f3754f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3755g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3756h;
    public ArrayList i;

    public m(PhoneFragment phoneFragment) {
        K kL = phoneFragment.l();
        C0300w c0300w = phoneFragment.b0;
        this.f3751c = new C2938g();
        this.f3752d = new C2938g();
        this.f3753e = new C2938g();
        this.f3755g = false;
        this.f3756h = false;
        this.f3750b = kL;
        this.f3749a = c0300w;
        super.setHasStableIds(true);
        this.i = new ArrayList();
    }

    public static void a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final boolean b(long j6) {
        return j6 >= 0 && j6 < ((long) this.i.size());
    }

    public final void c() {
        C2938g c2938g;
        C2938g c2938g2;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v;
        View view;
        if (!this.f3756h || this.f3750b.M()) {
            return;
        }
        C2937f c2937f = new C2937f(0);
        int i = 0;
        while (true) {
            c2938g = this.f3751c;
            int iJ = c2938g.j();
            c2938g2 = this.f3753e;
            if (i >= iJ) {
                break;
            }
            long jG = c2938g.g(i);
            if (!b(jG)) {
                c2937f.add(Long.valueOf(jG));
                c2938g2.i(jG);
            }
            i++;
        }
        if (!this.f3755g) {
            this.f3756h = false;
            for (int i3 = 0; i3 < c2938g.j(); i3++) {
                long jG2 = c2938g.g(i3);
                if (c2938g2.f(jG2) < 0 && ((abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) c2938g.d(jG2)) == null || (view = abstractComponentCallbacksC2617v.f21696T) == null || view.getParent() == null)) {
                    c2937f.add(Long.valueOf(jG2));
                }
            }
        }
        C2932a c2932a = new C2932a(c2937f);
        while (c2932a.hasNext()) {
            f(((Long) c2932a.next()).longValue());
        }
    }

    public final Long d(int i) {
        Long lValueOf = null;
        int i3 = 0;
        while (true) {
            C2938g c2938g = this.f3753e;
            if (i3 >= c2938g.j()) {
                return lValueOf;
            }
            if (((Integer) c2938g.k(i3)).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(c2938g.g(i3));
            }
            i3++;
        }
    }

    public final void e(R0.e eVar) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) this.f3751c.d(eVar.getItemId());
        if (abstractComponentCallbacksC2617v == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) eVar.itemView;
        View view = abstractComponentCallbacksC2617v.f21696T;
        if (!abstractComponentCallbacksC2617v.v() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zV = abstractComponentCallbacksC2617v.v();
        K k6 = this.f3750b;
        if (zV && view == null) {
            ((CopyOnWriteArrayList) k6.f21514m.f20441b).add(new B(new V2.h(this, abstractComponentCallbacksC2617v, frameLayout)));
            return;
        }
        if (abstractComponentCallbacksC2617v.v() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                a(view, frameLayout);
                return;
            }
            return;
        }
        if (abstractComponentCallbacksC2617v.v()) {
            a(view, frameLayout);
            return;
        }
        if (k6.M()) {
            if (k6.f21497H) {
                return;
            }
            this.f3749a.a(new R0.b(this, eVar));
            return;
        }
        ((CopyOnWriteArrayList) k6.f21514m.f20441b).add(new B(new V2.h(this, abstractComponentCallbacksC2617v, frameLayout)));
        C2597a c2597a = new C2597a(k6);
        c2597a.f(0, abstractComponentCallbacksC2617v, "f" + eVar.getItemId(), 1);
        c2597a.i(abstractComponentCallbacksC2617v, EnumC0292n.f5246d);
        c2597a.e();
        this.f3754f.b(false);
    }

    public final void f(long j6) {
        ViewParent parent;
        C2938g c2938g = this.f3751c;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) c2938g.d(j6);
        if (abstractComponentCallbacksC2617v == null) {
            return;
        }
        View view = abstractComponentCallbacksC2617v.f21696T;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zB = b(j6);
        C2938g c2938g2 = this.f3752d;
        if (!zB) {
            c2938g2.i(j6);
        }
        if (!abstractComponentCallbacksC2617v.v()) {
            c2938g.i(j6);
            return;
        }
        K k6 = this.f3750b;
        if (k6.M()) {
            this.f3756h = true;
            return;
        }
        if (abstractComponentCallbacksC2617v.v() && b(j6)) {
            P p6 = (P) ((HashMap) k6.f21505c.f5897c).get(abstractComponentCallbacksC2617v.f21710e);
            if (p6 != null) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = p6.f21558c;
                if (abstractComponentCallbacksC2617v2.equals(abstractComponentCallbacksC2617v)) {
                    c2938g2.h(j6, abstractComponentCallbacksC2617v2.f21703a > -1 ? new C2616u(p6.o()) : null);
                }
            }
            k6.d0(new IllegalStateException(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " is not currently in the FragmentManager")));
            throw null;
        }
        C2597a c2597a = new C2597a(k6);
        c2597a.h(abstractComponentCallbacksC2617v);
        c2597a.e();
        c2938g.i(j6);
    }

    @Override // androidx.recyclerview.widget.G
    public final int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.G
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.G
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.f3754f != null) {
            throw new IllegalArgumentException();
        }
        R0.d dVar = new R0.d();
        dVar.f3384f = this;
        dVar.f3379a = -1L;
        this.f3754f = dVar;
        ViewPager2 viewPager2A = R0.d.a(recyclerView);
        dVar.f3383e = viewPager2A;
        R0.c cVar = new R0.c(dVar);
        dVar.f3380b = cVar;
        ((ArrayList) viewPager2A.f5647c.f3378b).add(cVar);
        int i = 1;
        L3.j jVar = new L3.j(i, dVar);
        dVar.f3381c = jVar;
        registerAdapterDataObserver(jVar);
        F0.b bVar = new F0.b(i, dVar);
        dVar.f3382d = bVar;
        this.f3749a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.G
    public final void onBindViewHolder(g0 g0Var, int i) {
        Bundle bundle;
        R0.e eVar = (R0.e) g0Var;
        long itemId = eVar.getItemId();
        int id = ((FrameLayout) eVar.itemView).getId();
        Long lD = d(id);
        C2938g c2938g = this.f3753e;
        if (lD != null && lD.longValue() != itemId) {
            f(lD.longValue());
            c2938g.i(lD.longValue());
        }
        c2938g.h(itemId, Integer.valueOf(id));
        long j6 = i;
        C2938g c2938g2 = this.f3751c;
        if (c2938g2.f(j6) < 0) {
            Object obj = this.i.get(i);
            q5.i.d(obj, "get(...)");
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) obj;
            C2616u c2616u = (C2616u) this.f3752d.d(j6);
            if (abstractComponentCallbacksC2617v.f21684G != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if (c2616u == null || (bundle = c2616u.f21678a) == null) {
                bundle = null;
            }
            abstractComponentCallbacksC2617v.f21705b = bundle;
            c2938g2.h(j6, abstractComponentCallbacksC2617v);
        }
        FrameLayout frameLayout = (FrameLayout) eVar.itemView;
        WeakHashMap weakHashMap = O.f3270a;
        if (frameLayout.isAttachedToWindow()) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new R0.a(this, frameLayout, eVar));
        }
        c();
    }

    @Override // androidx.recyclerview.widget.G
    public final g0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i3 = R0.e.f3385b;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = O.f3270a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new R0.e(frameLayout);
    }

    @Override // androidx.recyclerview.widget.G
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        R0.d dVar = this.f3754f;
        dVar.getClass();
        ViewPager2 viewPager2A = R0.d.a(recyclerView);
        ((ArrayList) viewPager2A.f5647c.f3378b).remove((R0.c) dVar.f3380b);
        m mVar = (m) dVar.f3384f;
        mVar.unregisterAdapterDataObserver((L3.j) dVar.f3381c);
        mVar.f3749a.f((F0.b) dVar.f3382d);
        dVar.f3383e = null;
        this.f3754f = null;
    }

    @Override // androidx.recyclerview.widget.G
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(g0 g0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.G
    public final void onViewAttachedToWindow(g0 g0Var) {
        e((R0.e) g0Var);
        c();
    }

    @Override // androidx.recyclerview.widget.G
    public final void onViewRecycled(g0 g0Var) {
        Long lD = d(((FrameLayout) ((R0.e) g0Var).itemView).getId());
        if (lD != null) {
            f(lD.longValue());
            this.f3753e.i(lD.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.G
    public final void setHasStableIds(boolean z6) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
