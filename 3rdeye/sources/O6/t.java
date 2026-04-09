package O6;

import H6.C0672i;
import K6.C0713c;
import M6.x;
import M6.x.a;
import N7.B8;
import N7.X2;
import N7.Z;
import Q1.f;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b9.C2001h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DivPagerView.kt */
/* loaded from: classes.dex */
public final class t extends X6.q implements l<Z.i> {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f10453m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Z.i> f10454d;

    /* renamed from: e, reason: collision with root package name */
    public f.e f10455e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10456f;

    /* renamed from: g, reason: collision with root package name */
    public f.e f10457g;

    /* renamed from: h, reason: collision with root package name */
    public a f10458h;
    public M6.x i;

    /* renamed from: j, reason: collision with root package name */
    public b f10459j;

    /* renamed from: k, reason: collision with root package name */
    public r7.h f10460k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10461l;

    /* compiled from: DivPagerView.kt */
    public interface b {
    }

    public t(Context context) {
        super(context);
        this.f10454d = new m<>();
        this.f10456f = new ArrayList();
        this.f10461l = C2001h.a(b9.i.NONE, new F6.c(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
    private u getAccessibilityDelegate() {
        return (u) this.f10461l.getValue();
    }

    public final void a() {
        RecyclerView recyclerView;
        u accessibilityDelegate = getAccessibilityDelegate();
        if (accessibilityDelegate == null || (recyclerView = getRecyclerView()) == null) {
            return;
        }
        recyclerView.setAccessibilityDelegateCompat(accessibilityDelegate);
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.i> mVar = this.f10454d;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10454d.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10454d.d(bindingContext, x22, view);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        C1476b divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            divBorderDrawer.c(canvas);
            super.draw(canvas);
            divBorderDrawer.d(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            C0713c.E(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // r7.r
    public final void e(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10454d.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10454d.f10430c.g();
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10454d.f10432e;
    }

    public f.e getChangePageCallbackForLogger$div_release() {
        return this.f10457g;
    }

    public a getChangePageCallbackForOffScreenPages$div_release() {
        return this.f10458h;
    }

    public f.e getChangePageCallbackForState$div_release() {
        return this.f10455e;
    }

    public boolean getClipToPage$div_release() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getClipChildren();
        }
        return false;
    }

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    @Override // O6.l
    public Z.i getDiv() {
        return (Z.i) this.f10454d.f10431d;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10454d.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10454d.f10429b.f10420c;
    }

    public r7.h getOnInterceptTouchEventListener() {
        return this.f10460k;
    }

    public b getPagerOnItemsCountChange$div_release() {
        return this.f10459j;
    }

    public M6.x getPagerSelectedActionsDispatcher$div_release() {
        return this.i;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10454d.f10433f;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.i> mVar = this.f10454d;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10454d.j(view);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.l.f(event, "event");
        r7.h onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null) {
            onInterceptTouchEventListener.a(this, event);
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10454d.a();
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10454d.release();
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10454d.f10432e = c0672i;
    }

    public void setChangePageCallbackForLogger$div_release(f.e eVar) {
        f.e eVar2 = this.f10457g;
        if (eVar2 != null) {
            getViewPager().f(eVar2);
        }
        if (eVar != null) {
            getViewPager().a(eVar);
        }
        this.f10457g = eVar;
    }

    public void setChangePageCallbackForOffScreenPages$div_release(a aVar) {
        a aVar2 = this.f10458h;
        if (aVar2 != null) {
            getViewPager().f(aVar2);
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                recyclerView.removeOnLayoutChangeListener(aVar2);
            }
        }
        if (aVar != null) {
            getViewPager().a(aVar);
            RecyclerView recyclerView2 = getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.addOnLayoutChangeListener(aVar);
            }
        }
        this.f10458h = aVar;
    }

    public void setChangePageCallbackForState$div_release(f.e eVar) {
        f.e eVar2 = this.f10455e;
        if (eVar2 != null) {
            getViewPager().f(eVar2);
        }
        if (eVar != null) {
            getViewPager().a(eVar);
        }
        this.f10455e = eVar;
    }

    public void setClipToPage$div_release(boolean z10) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.setClipChildren(z10);
    }

    public void setCurrentItem$div_release(int i) {
        getViewPager().d(i, false);
    }

    @Override // O6.l
    public void setDiv(Z.i iVar) {
        this.f10454d.f10431d = iVar;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10454d.setNeedClipping(z10);
    }

    public void setOnInterceptTouchEventListener(r7.h hVar) {
        this.f10460k = hVar;
    }

    public void setPagerOnItemsCountChange$div_release(b bVar) {
        this.f10459j = bVar;
    }

    public void setPagerSelectedActionsDispatcher$div_release(M6.x xVar) {
        M6.x xVar2 = this.i;
        if (xVar2 != null) {
            Q1.f viewPager = getViewPager();
            kotlin.jvm.internal.l.f(viewPager, "viewPager");
            x.a aVar = xVar2.f4314d;
            if (aVar != null) {
                viewPager.f(aVar);
            }
            xVar2.f4314d = null;
        }
        if (xVar != null) {
            Q1.f viewPager2 = getViewPager();
            kotlin.jvm.internal.l.f(viewPager2, "viewPager");
            x.a aVar2 = xVar.new a();
            viewPager2.a(aVar2);
            xVar.f4314d = aVar2;
        }
        this.i = xVar;
    }

    /* compiled from: DivPagerView.kt */
    public static abstract class a extends f.e implements View.OnLayoutChangeListener {
        public void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        }
    }
}
