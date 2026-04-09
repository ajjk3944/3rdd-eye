package y7;

import H6.C0675l;
import H6.I;
import K6.C0713c;
import L0.S;
import N7.C1175g0;
import N7.Z;
import O6.C;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import h7.C4422c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import m0.C5308a;
import p7.InterfaceC5475g;
import t4.C5606d;
import y7.c.f.a;
import y7.x;
import z6.C5865d;

/* compiled from: BaseDivTabbedCardUi.java */
/* loaded from: classes.dex */
public abstract class c<TAB_DATA extends f.a<ACTION>, TAB_VIEW, ACTION> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5475g f48206a;

    /* renamed from: b, reason: collision with root package name */
    public final b<ACTION> f48207b;

    /* renamed from: c, reason: collision with root package name */
    public final n f48208c;

    /* renamed from: d, reason: collision with root package name */
    public final x f48209d;

    /* renamed from: e, reason: collision with root package name */
    public final x.a f48210e;

    /* renamed from: h, reason: collision with root package name */
    public final String f48213h;
    public final N6.o i;

    /* renamed from: f, reason: collision with root package name */
    public final C5308a f48211f = new C5308a();

    /* renamed from: g, reason: collision with root package name */
    public final C5308a f48212g = new C5308a();

    /* renamed from: j, reason: collision with root package name */
    public final a f48214j = new a();

    /* renamed from: k, reason: collision with root package name */
    public boolean f48215k = false;

    /* renamed from: l, reason: collision with root package name */
    public f<TAB_DATA> f48216l = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f48217m = false;

    /* compiled from: BaseDivTabbedCardUi.java */
    public class a extends androidx.viewpager.widget.a {

        /* renamed from: a, reason: collision with root package name */
        public SparseArray<Parcelable> f48218a;

        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager.widget.a
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            c cVar = c.this;
            if (C6.r.d(cVar.f48208c)) {
                i = (getCount() - i) - 1;
            }
            ViewGroup viewGroup2 = (ViewGroup) obj;
            d dVar = (d) cVar.f48211f.remove(viewGroup2);
            ViewGroup viewGroup3 = dVar.f48224d;
            if (viewGroup3 != null) {
                N6.c cVar2 = (N6.c) c.this;
                cVar2.getClass();
                cVar2.f4695w.remove(viewGroup3);
                C0675l divView = cVar2.f4688p.f2146a;
                kotlin.jvm.internal.l.f(divView, "divView");
                int i10 = 0;
                while (i10 < viewGroup3.getChildCount()) {
                    int i11 = i10 + 1;
                    View childAt = viewGroup3.getChildAt(i10);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    C5606d.I(divView.getReleaseViewVisitor$div_release(), childAt);
                    i10 = i11;
                }
                viewGroup3.removeAllViews();
                dVar.f48224d = null;
            }
            cVar.f48212g.remove(Integer.valueOf(i));
            int i12 = C4422c.f38270a;
            C7.a aVar = C7.a.ERROR;
            viewGroup.removeView(viewGroup2);
        }

        @Override // androidx.viewpager.widget.a
        public final int getCount() {
            f<TAB_DATA> fVar = c.this.f48216l;
            if (fVar == null) {
                return 0;
            }
            return fVar.a().size();
        }

        @Override // androidx.viewpager.widget.a
        public final int getItemPosition(Object obj) {
            return -2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager.widget.a
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2;
            c cVar = c.this;
            if (C6.r.d(cVar.f48208c)) {
                i = (getCount() - i) - 1;
            }
            int i10 = C4422c.f38270a;
            C7.a aVar = C7.a.ERROR;
            d dVar = (d) cVar.f48212g.get(Integer.valueOf(i));
            if (dVar != null) {
                viewGroup2 = dVar.f48221a;
                viewGroup2.getParent();
            } else {
                viewGroup2 = (ViewGroup) cVar.f48206a.d(cVar.f48213h);
                d dVar2 = new d(viewGroup2, (f.a) cVar.f48216l.a().get(i), i);
                cVar.f48212g.put(Integer.valueOf(i), dVar2);
                dVar = dVar2;
            }
            viewGroup.addView(viewGroup2);
            cVar.f48211f.put(viewGroup2, dVar);
            if (i == cVar.f48208c.getCurrentItem()) {
                dVar.a();
            }
            SparseArray<Parcelable> sparseArray = this.f48218a;
            if (sparseArray != null) {
                viewGroup2.restoreHierarchyState(sparseArray);
            }
            return viewGroup2;
        }

        @Override // androidx.viewpager.widget.a
        public final boolean isViewFromObject(View view, Object obj) {
            return obj == view;
        }

        @Override // androidx.viewpager.widget.a
        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            if (!(parcelable instanceof Bundle)) {
                this.f48218a = null;
                return;
            }
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(a.class.getClassLoader());
            this.f48218a = bundle.getSparseParcelableArray("div_tabs_child_states");
        }

        @Override // androidx.viewpager.widget.a
        public final Parcelable saveState() {
            c cVar = c.this;
            SparseArray<Parcelable> sparseArray = new SparseArray<>(cVar.f48211f.f44030d);
            Iterator it = ((C5308a.c) cVar.f48211f.keySet()).iterator();
            while (it.hasNext()) {
                ((ViewGroup) it.next()).saveHierarchyState(sparseArray);
            }
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("div_tabs_child_states", sparseArray);
            return bundle;
        }
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public interface b<ACTION> {

        /* compiled from: BaseDivTabbedCardUi.java */
        public interface a<ACTION> {
        }

        void a(InterfaceC5475g interfaceC5475g);

        void b(int i);

        void c(List<? extends f.a<ACTION>> list, int i, A7.d dVar, i7.k kVar);

        void d(int i);

        ViewPager.j getCustomPageChangeListener();

        void setHost(a<ACTION> aVar);

        void setTypefaceProvider(u6.a aVar);
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    /* renamed from: y7.c$c, reason: collision with other inner class name */
    public class C0559c implements b.a<ACTION> {
        public C0559c() {
        }
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f48221a;

        /* renamed from: b, reason: collision with root package name */
        public final TAB_DATA f48222b;

        /* renamed from: c, reason: collision with root package name */
        public final int f48223c;

        /* renamed from: d, reason: collision with root package name */
        public ViewGroup f48224d;

        public d() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(ViewGroup viewGroup, f.a aVar, int i) {
            this.f48221a = viewGroup;
            this.f48222b = aVar;
            this.f48223c = i;
        }

        public final void a() {
            if (this.f48224d != null) {
                return;
            }
            N6.c cVar = (N6.c) c.this;
            cVar.getClass();
            N6.a tab = (N6.a) this.f48222b;
            ViewGroup tabView = this.f48221a;
            kotlin.jvm.internal.l.f(tabView, "tabView");
            kotlin.jvm.internal.l.f(tab, "tab");
            C0675l divView = cVar.f4688p.f2146a;
            kotlin.jvm.internal.l.f(divView, "divView");
            int i = 0;
            while (i < tabView.getChildCount()) {
                int i10 = i + 1;
                View childAt = tabView.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                C5606d.I(divView.getReleaseViewVisitor$div_release(), childAt);
                i = i10;
            }
            tabView.removeAllViews();
            Z z10 = tab.f4677a.f4959a;
            View viewO = cVar.f4689q.o(z10, cVar.f4688p.f2147b);
            viewO.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            LinkedHashMap linkedHashMap = cVar.f4696x;
            int i11 = this.f48223c;
            Integer numValueOf = Integer.valueOf(i11);
            Object objU = linkedHashMap.get(numValueOf);
            if (objU == null) {
                objU = C0713c.U(z10.d(), i11, cVar.f4693u);
                linkedHashMap.put(numValueOf, objU);
            }
            cVar.f4690r.b(cVar.f4688p, viewO, z10, (C5865d) objU);
            cVar.f4695w.put(tabView, new N6.p(i11, z10, viewO));
            tabView.addView(viewO);
            this.f48224d = tabView;
        }
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public class e implements ViewPager.k {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager.widget.ViewPager.k
        public final void transformPage(View view, float f10) {
            d dVar;
            c cVar = c.this;
            if (!cVar.f48217m && f10 > -1.0f && f10 < 1.0f && (dVar = (d) cVar.f48211f.get(view)) != null) {
                dVar.a();
            }
        }
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public interface f<TAB extends a> {

        /* compiled from: BaseDivTabbedCardUi.java */
        public interface a<ACTION> {
            Integer a();

            Integer b();

            C1175g0 c();

            String getTitle();
        }

        List<? extends TAB> a();
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public class g implements ViewPager.j {

        /* renamed from: a, reason: collision with root package name */
        public int f48227a = 0;

        public g() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            x xVar;
            this.f48227a = i;
            if (i == 0) {
                c cVar = c.this;
                int currentItem = cVar.f48208c.getCurrentItem();
                x.a aVar = cVar.f48210e;
                if (aVar != null && (xVar = cVar.f48209d) != null) {
                    aVar.a(0.0f, currentItem);
                    xVar.requestLayout();
                }
                if (!cVar.f48215k) {
                    cVar.f48207b.b(currentItem);
                }
                cVar.f48215k = false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
        @Override // androidx.viewpager.widget.ViewPager.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onPageScrolled(int r4, float r5, int r6) {
            /*
                r3 = this;
                int r6 = r3.f48227a
                y7.c r0 = y7.c.this
                if (r6 == 0) goto L7c
                y7.x r6 = r0.f48209d
                if (r6 == 0) goto L7c
                y7.x$a r6 = r0.f48210e
                if (r6 != 0) goto L10
                goto L7c
            L10:
                r6.a(r5, r4)
                y7.x r6 = r0.f48209d
                boolean r1 = r6.f48354e
                if (r1 != 0) goto L1a
                goto L7c
            L1a:
                y7.x$a r1 = r6.f48351b
                if (r1 == 0) goto L7c
                boolean r4 = r1.c(r5, r4)
                if (r4 != 0) goto L25
                goto L7c
            L25:
                android.graphics.Rect r4 = r6.f48353d
                if (r4 != 0) goto L30
                android.graphics.Rect r4 = new android.graphics.Rect
                r4.<init>()
                r6.f48353d = r4
            L30:
                r6.getLocalVisibleRect(r4)
                int r5 = r4.height()
                int r2 = r6.getHeight()
                if (r5 != r2) goto L3e
                goto L68
            L3e:
                int r5 = r6.getWidth()
                r2 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
                java.lang.Integer r2 = r6.f48355f
                if (r2 == 0) goto L51
                int r2 = r2.intValue()
                goto L56
            L51:
                r2 = 0
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            L56:
                int r5 = r1.b(r5, r2)
                int r1 = r6.getHeight()
                if (r5 == r1) goto L7c
                int r1 = r4.top
                int r4 = r4.bottom
                if (r5 > r4) goto L7c
                if (r1 > r5) goto L7c
            L68:
                boolean r4 = r6.isInLayout()
                if (r4 == 0) goto L79
                com.vungle.ads.internal.util.a r4 = new com.vungle.ads.internal.util.a
                r5 = 13
                r4.<init>(r6, r5)
                r6.post(r4)
                goto L7c
            L79:
                r6.requestLayout()
            L7c:
                boolean r4 = r0.f48215k
                if (r4 == 0) goto L81
                return
            L81:
                y7.c$b<ACTION> r4 = r0.f48207b
                r4.getClass()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y7.c.g.onPageScrolled(int, float, int):void");
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            x xVar;
            c cVar = c.this;
            x.a aVar = cVar.f48210e;
            if (aVar == null) {
                cVar.f48208c.requestLayout();
            } else {
                if (this.f48227a != 0 || aVar == null || (xVar = cVar.f48209d) == null) {
                    return;
                }
                aVar.a(0.0f, i);
                xVar.requestLayout();
            }
        }
    }

    /* compiled from: BaseDivTabbedCardUi.java */
    public static class h {
    }

    public c(InterfaceC5475g interfaceC5475g, C c10, h hVar, k kVar, I i, N6.o oVar, N6.o oVar2, N6.b bVar) {
        int i10 = 25;
        this.f48206a = interfaceC5475g;
        this.i = oVar2;
        C0559c c0559c = new C0559c();
        this.f48213h = "DIV2.TAB_ITEM_VIEW";
        b<ACTION> bVar2 = (b) o7.e.a(c10, R.id.base_tabbed_title_container_scroller);
        this.f48207b = bVar2;
        bVar2.setHost(c0559c);
        bVar2.setTypefaceProvider((u6.a) i.f2053c);
        bVar2.a(interfaceC5475g);
        n nVar = (n) o7.e.a(c10, R.id.div_tabs_pager_container);
        this.f48208c = nVar;
        int layoutDirection = nVar.getResources().getConfiguration().getLayoutDirection();
        WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
        nVar.setLayoutDirection(layoutDirection);
        nVar.setAdapter(null);
        nVar.clearOnPageChangeListeners();
        nVar.addOnPageChangeListener(new g());
        ViewPager.j customPageChangeListener = bVar2.getCustomPageChangeListener();
        if (customPageChangeListener != null) {
            nVar.addOnPageChangeListener(customPageChangeListener);
        }
        nVar.addOnPageChangeListener(oVar);
        nVar.addOnPageChangeListener(bVar);
        nVar.setScrollEnabled(true);
        nVar.setEdgeScrollEnabled(false);
        nVar.setPageTransformer(false, new e());
        x xVar = (x) o7.e.a(c10, R.id.div_tabs_container_helper);
        this.f48209d = xVar;
        x.a aVarC = kVar.c((ViewGroup) interfaceC5475g.d("DIV2.TAB_ITEM_VIEW"), new B.f(this, i10), new B.f(this, i10));
        this.f48210e = aVarC;
        xVar.setHeightCalculator(aVarC);
    }

    public final void a(f<TAB_DATA> fVar, A7.d dVar, i7.k kVar) {
        n nVar = this.f48208c;
        int iMin = Math.min(nVar.getCurrentItem(), fVar.a().size() - 1);
        this.f48212g.clear();
        this.f48216l = fVar;
        androidx.viewpager.widget.a adapter = nVar.getAdapter();
        a aVar = this.f48214j;
        if (adapter != null) {
            this.f48217m = true;
            try {
                aVar.notifyDataSetChanged();
            } finally {
                this.f48217m = false;
            }
        }
        List<? extends f.a<ACTION>> listA = fVar.a();
        b<ACTION> bVar = this.f48207b;
        bVar.c(listA, iMin, dVar, kVar);
        if (nVar.getAdapter() == null) {
            nVar.setAdapter(aVar);
        } else if (!listA.isEmpty() && iMin != -1) {
            nVar.setCurrentItem(iMin);
            bVar.d(iMin);
        }
        int i = C4422c.f38270a;
        C7.a aVar2 = C7.a.ERROR;
        x.a aVar3 = this.f48210e;
        if (aVar3 != null) {
            aVar3.d();
        }
        x xVar = this.f48209d;
        if (xVar != null) {
            xVar.requestLayout();
        }
    }
}
