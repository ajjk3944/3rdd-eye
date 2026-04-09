package y7;

import N7.Ba;
import N7.C1362t4;
import N7.EnumC1195h5;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import p7.InterfaceC5474f;
import p7.InterfaceC5475g;
import y7.c;
import y7.e;
import y7.v;

/* compiled from: TabTitlesLayoutView.java */
/* loaded from: classes.dex */
public final class t<ACTION> extends e implements c.b<ACTION> {

    /* renamed from: J, reason: collision with root package name */
    public c.b.a<ACTION> f48326J;

    /* renamed from: K, reason: collision with root package name */
    public List<? extends c.f.a<ACTION>> f48327K;

    /* renamed from: L, reason: collision with root package name */
    public InterfaceC5475g f48328L;

    /* renamed from: M, reason: collision with root package name */
    public String f48329M;

    /* renamed from: N, reason: collision with root package name */
    public Ba.c f48330N;

    /* renamed from: O, reason: collision with root package name */
    public a f48331O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f48332P;

    /* compiled from: TabTitlesLayoutView.java */
    public interface a {
    }

    /* compiled from: TabTitlesLayoutView.java */
    public static class b implements InterfaceC5474f<v> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f48333a;

        public b(Context context) {
            this.f48333a = context;
        }

        @Override // p7.InterfaceC5474f
        public final View a() {
            return new v(this.f48333a);
        }
    }

    @Override // y7.c.b
    public final void a(InterfaceC5475g interfaceC5475g) {
        this.f48328L = interfaceC5475g;
        this.f48329M = "DIV2.TAB_HEADER_VIEW";
    }

    @Override // y7.c.b
    public final void b(int i) {
        e.f fVar;
        if (getSelectedTabPosition() == i || (fVar = this.f48239b.get(i)) == null) {
            return;
        }
        e eVar = fVar.f48288c;
        if (eVar == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        eVar.p(fVar, true);
    }

    @Override // y7.c.b
    public final void c(List<? extends c.f.a<ACTION>> list, int i, A7.d resolver, i7.k subscriber) {
        j6.d dVarD;
        this.f48327K = list;
        o();
        int size = list.size();
        if (i < 0 || i >= size) {
            i = 0;
        }
        int i10 = 0;
        while (i10 < size) {
            e.f fVarM = m();
            fVarM.f48286a = list.get(i10).getTitle();
            v vVar = fVarM.f48289d;
            if (vVar != null) {
                e.f fVar = vVar.f48342r;
                vVar.setText(fVar == null ? null : fVar.f48286a);
                v.b bVar = vVar.f48341q;
                if (bVar != null) {
                    ((e) ((D7.c) bVar).f1075c).getClass();
                }
            }
            v vVar2 = fVarM.f48289d;
            Ba.c cVar = this.f48330N;
            if (cVar != null) {
                kotlin.jvm.internal.l.f(vVar2, "<this>");
                kotlin.jvm.internal.l.f(resolver, "resolver");
                kotlin.jvm.internal.l.f(subscriber, "subscriber");
                N6.m mVar = new N6.m(cVar, resolver, vVar2);
                subscriber.b(cVar.f4986j.d(resolver, mVar));
                subscriber.b(cVar.f4987k.d(resolver, mVar));
                A7.b<Long> bVar2 = cVar.f4995s;
                if (bVar2 != null && (dVarD = bVar2.d(resolver, mVar)) != null) {
                    subscriber.b(dVarD);
                }
                mVar.invoke(null);
                DisplayMetrics displayMetrics = vVar2.getResources().getDisplayMetrics();
                C1362t4 c1362t4 = cVar.f4996t;
                N6.n nVar = new N6.n(c1362t4, vVar2, resolver, displayMetrics);
                subscriber.b(c1362t4.f9221f.d(resolver, nVar));
                subscriber.b(c1362t4.f9216a.d(resolver, nVar));
                A7.b<Long> bVar3 = c1362t4.f9217b;
                A7.b<Long> bVar4 = c1362t4.f9220e;
                if (bVar4 == null && bVar3 == null) {
                    subscriber.b(c1362t4.f9218c.d(resolver, nVar));
                    subscriber.b(c1362t4.f9219d.d(resolver, nVar));
                } else {
                    subscriber.b(bVar4 != null ? bVar4.d(resolver, nVar) : null);
                    subscriber.b(bVar3 != null ? bVar3.d(resolver, nVar) : null);
                }
                nVar.invoke(null);
                A7.b<EnumC1195h5> bVar5 = cVar.f4988l;
                A7.b<EnumC1195h5> bVar6 = cVar.f4991o;
                if (bVar6 == null) {
                    bVar6 = bVar5;
                }
                subscriber.b(bVar6.e(resolver, new N6.k(vVar2)));
                A7.b<EnumC1195h5> bVar7 = cVar.f4980c;
                if (bVar7 != null) {
                    bVar5 = bVar7;
                }
                subscriber.b(bVar5.e(resolver, new N6.l(vVar2)));
            }
            f(fVarM, i10 == i);
            i10++;
        }
    }

    @Override // y7.c.b
    public final void d(int i) {
        e.f fVar;
        if (getSelectedTabPosition() == i || (fVar = this.f48239b.get(i)) == null) {
            return;
        }
        e eVar = fVar.f48288c;
        if (eVar == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        eVar.p(fVar, true);
    }

    @Override // y7.e, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f48332P = true;
        }
        return zDispatchTouchEvent;
    }

    @Override // y7.c.b
    public ViewPager.j getCustomPageChangeListener() {
        e.g pageChangeListener = getPageChangeListener();
        pageChangeListener.f48292c = 0;
        pageChangeListener.f48291b = 0;
        return pageChangeListener;
    }

    @Override // y7.e
    public final v l(Context context) {
        return (v) this.f48328L.d(this.f48329M);
    }

    @Override // y7.e, android.view.View
    public final void onScrollChanged(int i, int i10, int i11, int i12) {
        super.onScrollChanged(i, i10, i11, i12);
        a aVar = this.f48331O;
        if (aVar == null || !this.f48332P) {
            return;
        }
        N6.d this$0 = (N6.d) ((B.d) aVar).f312c;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.i.getClass();
        this.f48332P = false;
    }

    @Override // y7.c.b
    public void setHost(c.b.a<ACTION> aVar) {
        this.f48326J = aVar;
    }

    public void setOnScrollChangedListener(a aVar) {
        this.f48331O = aVar;
    }

    public void setTabTitleStyle(Ba.c cVar) {
        this.f48330N = cVar;
    }

    @Override // y7.c.b
    public void setTypefaceProvider(u6.a aVar) {
        this.f48247k = aVar;
    }
}
