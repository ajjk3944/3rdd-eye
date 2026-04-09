package I6;

import H6.C0675l;
import android.view.View;
import android.view.ViewGroup;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DivTransitionHandler.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final C0675l f2525a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2526b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2527c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2528d;

    /* compiled from: DivTransitionHandler.kt */
    public static abstract class a {

        /* compiled from: DivTransitionHandler.kt */
        /* renamed from: I6.f$a$a, reason: collision with other inner class name */
        public static final class C0044a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f2529a;

            public C0044a(int i) {
                this.f2529a = i;
            }
        }
    }

    /* compiled from: DivTransitionHandler.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final K1.i f2530a;

        /* renamed from: b, reason: collision with root package name */
        public final View f2531b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f2532c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f2533d;

        public b(K1.i iVar, View target, ArrayList arrayList, ArrayList arrayList2) {
            kotlin.jvm.internal.l.f(target, "target");
            this.f2530a = iVar;
            this.f2531b = target;
            this.f2532c = arrayList;
            this.f2533d = arrayList2;
        }
    }

    /* compiled from: Transitions.kt */
    public static final class c extends K1.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ K1.n f2534a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f2535b;

        public c(K1.n nVar, f fVar) {
            this.f2534a = nVar;
            this.f2535b = fVar;
        }

        @Override // K1.i.d
        public final void a(K1.i iVar) {
            this.f2535b.f2527c.clear();
            this.f2534a.z(this);
        }
    }

    public f(C0675l divView) {
        kotlin.jvm.internal.l.f(divView, "divView");
        this.f2525a = divView;
        this.f2526b = new ArrayList();
        this.f2527c = new ArrayList();
    }

    public static ArrayList b(View view, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            a.C0044a c0044a = kotlin.jvm.internal.l.b(bVar.f2531b, view) ? (a.C0044a) C2097r.w0(bVar.f2533d) : null;
            if (c0044a != null) {
                arrayList2.add(c0044a);
            }
        }
        return arrayList2;
    }

    public final void a(ViewGroup viewGroup, boolean z10) {
        if (z10) {
            K1.m.b(viewGroup);
        }
        K1.n nVar = new K1.n();
        ArrayList arrayList = this.f2526b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nVar.M(((b) it.next()).f2530a);
        }
        nVar.a(new c(nVar, this));
        K1.m.a(viewGroup, nVar);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            for (a.C0044a c0044a : bVar.f2532c) {
                c0044a.getClass();
                View view = bVar.f2531b;
                kotlin.jvm.internal.l.f(view, "view");
                view.setVisibility(c0044a.f2529a);
                bVar.f2533d.add(c0044a);
            }
        }
        ArrayList arrayList2 = this.f2527c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList.clear();
    }
}
