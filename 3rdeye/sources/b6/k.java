package B6;

import H6.C0672i;
import H6.C0674k;
import H6.C0675l;
import H6.L;
import K6.C0713c;
import N7.Ab;
import N7.C1332r2;
import N7.C1439yb;
import N7.C9;
import N7.S2;
import N7.X9;
import N7.Z;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.work.s;
import b9.C1992A;
import c.C2002A;
import c.C2023u;
import c.C2028z;
import c.InterfaceC2025w;
import c9.C2089j;
import c9.C2092m;
import c9.C2099t;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import io.appmetrica.analytics.impl.Oo;
import j6.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k6.C5246y;
import z6.C5865d;

/* compiled from: DivTooltipController.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Oo f550a;

    /* renamed from: b, reason: collision with root package name */
    public final L f551b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.q f552c;

    /* renamed from: d, reason: collision with root package name */
    public final Q6.d f553d;

    /* renamed from: e, reason: collision with root package name */
    public final m f554e;

    /* renamed from: f, reason: collision with root package name */
    public final C6.a f555f;

    /* renamed from: g, reason: collision with root package name */
    public final f f556g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f557h;
    public final Handler i;

    public k(Oo tooltipRestrictor, L l5, j6.q qVar, m mVar, C6.a aVar, Q6.d dVar) {
        kotlin.jvm.internal.l.f(tooltipRestrictor, "tooltipRestrictor");
        f createPopup = f.f529g;
        kotlin.jvm.internal.l.f(createPopup, "createPopup");
        this.f550a = tooltipRestrictor;
        this.f551b = l5;
        this.f552c = qVar;
        this.f553d = dVar;
        this.f554e = mVar;
        this.f555f = aVar;
        this.f556g = createPopup;
        this.f557h = new LinkedHashMap();
        this.i = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [B6.e, j6.q$a] */
    public static final void a(final k kVar, final View view, final C1439yb c1439yb, final C0672i c0672i, boolean z10) {
        g gVar;
        C2023u onBackPressedDispatcher;
        kVar.getClass();
        final C0675l c0675l = c0672i.f2146a;
        kVar.f550a.getClass();
        Z z11 = c1439yb.f9979e;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Z z12 = c1439yb.f9979e;
        C9 width = z12.d().getWidth();
        kotlin.jvm.internal.l.e(displayMetrics, "displayMetrics");
        A7.d dVar = c0672i.f2147b;
        int iD0 = C0713c.d0(width, displayMetrics, dVar, null);
        int iD02 = C0713c.d0(z12.d().getHeight(), displayMetrics, dVar, null);
        m mVar = kVar.f554e;
        mVar.getClass();
        S2 s2D = z11.d();
        C0674k c0674k = mVar.f559a.get();
        ArrayList arrayListX = C2092m.X(String.valueOf(0L));
        if (z11 instanceof Z.m) {
            X9 x92 = ((Z.m) z11).f7825c;
            kotlin.jvm.internal.l.f(x92, "<this>");
            String str = x92.f7730l;
            if (str == null && (str = x92.f7735q) == null) {
                str = "";
            }
            arrayListX.add(str);
        }
        C5865d c5865d = new C5865d(0L, C2099t.f18581b, arrayListX);
        c0674k.getClass();
        View viewA = c0674k.a(c0672i, z11, c5865d);
        c0674k.f2155b.b(c0672i, viewA, z11, c5865d);
        DisplayMetrics displayMetrics2 = viewA.getContext().getResources().getDisplayMetrics();
        C9 width2 = s2D.getWidth();
        kotlin.jvm.internal.l.e(displayMetrics2, "displayMetrics");
        viewA.setLayoutParams(new RelativeLayout.LayoutParams(C0713c.d0(width2, displayMetrics2, dVar, null), C0713c.d0(s2D.getHeight(), displayMetrics2, dVar, null)));
        viewA.setFocusable(true);
        Context context = c0672i.f2146a.getContext();
        kotlin.jvm.internal.l.e(context, "context.divView.getContext()");
        final b bVar = new b(context);
        bVar.setClipChildren(false);
        bVar.setClipToPadding(false);
        bVar.addView(viewA);
        bVar.setLayoutParams(new ViewGroup.LayoutParams(iD0, iD02));
        View tooltipView = bVar.getTooltipView();
        if (tooltipView == null) {
            return;
        }
        final C6.k kVar2 = (C6.k) kVar.f556g.invoke(bVar, Integer.valueOf(iD0), Integer.valueOf(iD02));
        kVar2.setTouchable(true);
        A7.b<Boolean> bVar2 = c1439yb.f9978d;
        kVar2.setOutsideTouchable(bVar2.a(dVar).booleanValue());
        int i = Build.VERSION.SDK_INT;
        Ab ab = c1439yb.f9982h;
        if (i >= 29) {
            kVar2.setFocusable(true);
            kVar2.setTouchModal(ab instanceof Ab.a);
        } else {
            kVar2.setFocusable(ab instanceof Ab.a);
        }
        kVar2.setTouchInterceptor(new o(kVar2, tooltipView, ab instanceof Ab.a, bVar2.a(dVar).booleanValue()));
        A7.b<C1439yb.a> bVar3 = c1439yb.f9983j;
        C1332r2 c1332r2 = c1439yb.f9975a;
        kVar2.setEnterTransition(c1332r2 != null ? a.b(c1332r2, bVar3.a(dVar), true, dVar) : a.a(c1439yb, dVar));
        C1332r2 c1332r22 = c1439yb.f9976b;
        kVar2.setExitTransition(c1332r22 != null ? a.b(c1332r22, bVar3.a(dVar), false, dVar) : a.a(c1439yb, dVar));
        Context context2 = c0675l.getContext();
        kotlin.jvm.internal.l.e(context2, "divView.getContext()");
        if (kVar.f555f.a(context2)) {
            gVar = new g(kVar, c1439yb, c0675l);
            C2028z nextFunction = C2028z.f18331g;
            kotlin.jvm.internal.l.f(nextFunction, "nextFunction");
            InterfaceC2025w interfaceC2025w = (InterfaceC2025w) x9.l.G(x9.l.K(new x9.f(new C2089j(c0675l, 5), nextFunction), C2002A.f18263g));
            if (interfaceC2025w == null || (onBackPressedDispatcher = interfaceC2025w.getOnBackPressedDispatcher()) == null) {
                C5246y.d(c0675l, new AssertionError("Can't find onBackPressedDispatcher to set on back press listener on tooltip."));
                C1992A c1992a = C1992A.f18074a;
            } else {
                onBackPressedDispatcher.b(gVar);
            }
        } else {
            gVar = null;
        }
        String str2 = c1439yb.f9981g;
        final q qVar = new q(str2, c0672i, z11, kVar2, gVar);
        kVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: B6.d
            /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.k, p9.a] */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                k this$0 = this.f512b;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                C1439yb divTooltip = c1439yb;
                kotlin.jvm.internal.l.f(divTooltip, "$divTooltip");
                C0672i context3 = c0672i;
                kotlin.jvm.internal.l.f(context3, "$context");
                b bVar4 = bVar;
                C0675l div2View = c0675l;
                kotlin.jvm.internal.l.f(div2View, "$div2View");
                View anchor = view;
                kotlin.jvm.internal.l.f(anchor, "$anchor");
                C6.k kVar3 = kVar2;
                q qVar2 = qVar;
                this$0.f557h.remove(divTooltip.f9981g);
                Z z13 = divTooltip.f9979e;
                A7.d dVar2 = context3.f2147b;
                L l5 = this$0.f551b;
                L.j(l5, context3.f2146a, dVar2, null, z13);
                Z z14 = (Z) l5.b().get(bVar4);
                if (z14 != null) {
                    l5.f(context3, bVar4, z14);
                }
                this$0.f550a.getClass();
                C0713c.V(kVar3.getContentView(), this$0.f555f);
                g gVar2 = qVar2.f571f;
                if (gVar2 == null) {
                    return;
                }
                gVar2.f18304a = false;
                ?? r02 = gVar2.f18306c;
                if (r02 != 0) {
                    r02.invoke();
                }
            }
        });
        LinkedHashMap linkedHashMap = kVar.f557h;
        linkedHashMap.put(str2, qVar);
        ?? r02 = new q.a(view, kVar, c0675l, c1439yb, z10, bVar, kVar2, tooltipView, dVar, c0672i, z11) { // from class: B6.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f520c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k f521d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0675l f522e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ C1439yb f523f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ b f524g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ C6.k f525h;
            public final /* synthetic */ View i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ A7.d f526j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ C0672i f527k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Z f528l;

            {
                this.f524g = bVar;
                this.f525h = kVar2;
                this.i = tooltipView;
                this.f526j = dVar;
                this.f527k = c0672i;
                this.f528l = z11;
            }

            @Override // j6.q.a
            public final void b(boolean z13) {
                C0675l c0675l2;
                C0675l c0675l3;
                q qVar2 = this.f519b;
                View anchor = this.f520c;
                kotlin.jvm.internal.l.f(anchor, "$anchor");
                k this$0 = this.f521d;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                C0675l div2View = this.f522e;
                kotlin.jvm.internal.l.f(div2View, "$div2View");
                C1439yb divTooltip = this.f523f;
                kotlin.jvm.internal.l.f(divTooltip, "$divTooltip");
                b bVar4 = this.f524g;
                C6.k kVar3 = this.f525h;
                View view2 = this.i;
                A7.d resolver = this.f526j;
                kotlin.jvm.internal.l.f(resolver, "$resolver");
                C0672i context3 = this.f527k;
                kotlin.jvm.internal.l.f(context3, "$context");
                Z z14 = this.f528l;
                if (z13 || qVar2.f572g || !anchor.isAttachedToWindow()) {
                    return;
                }
                this$0.f550a.getClass();
                if (!C6.r.c(bVar4) || bVar4.isLayoutRequested()) {
                    c0675l2 = div2View;
                    bVar4.addOnLayoutChangeListener(new i(c0675l2, view2, anchor, divTooltip, resolver, this$0, kVar3, context3, z14, bVar4));
                } else {
                    Rect rect = new Rect();
                    div2View.getWindowVisibleDisplayFrame(rect);
                    Point pointA = l.a(view2, anchor, divTooltip, resolver);
                    int iMin = Math.min(view2.getWidth(), rect.width());
                    int iMin2 = Math.min(view2.getHeight(), rect.height());
                    int width3 = view2.getWidth();
                    Q6.d dVar2 = this$0.f553d;
                    if (iMin < width3) {
                        Q6.c cVarA = dVar2.a(div2View.getDivData(), div2View.getDataTag());
                        c0675l3 = div2View;
                        cVarA.f11320d.add(new Throwable("Tooltip width > screen size, width was changed"));
                        cVarA.b();
                    } else {
                        c0675l3 = div2View;
                    }
                    if (iMin2 < view2.getHeight()) {
                        Q6.c cVarA2 = dVar2.a(c0675l3.getDivData(), c0675l3.getDataTag());
                        cVarA2.f11320d.add(new Throwable("Tooltip height > screen size, height was changed"));
                        cVarA2.b();
                    }
                    kVar3.update(pointA.x, pointA.y, iMin, iMin2);
                    L l5 = this$0.f551b;
                    C0675l c0675l4 = context3.f2146a;
                    A7.d dVar3 = context3.f2147b;
                    L.j(l5, c0675l4, dVar3, null, z14);
                    L.j(l5, c0675l4, dVar3, bVar4, z14);
                    c0675l2 = c0675l3;
                }
                kVar3.showAtLocation(anchor, 0, 0, 0);
                C0713c.V(view2, this$0.f555f);
                A7.b<Long> bVar5 = divTooltip.f9980f;
                if (bVar5.a(resolver).longValue() != 0) {
                    this$0.i.postDelayed(new j(this$0, divTooltip, c0675l2), bVar5.a(resolver).longValue());
                }
            }
        };
        j6.q qVar2 = kVar.f552c;
        qVar2.getClass();
        q.b bVar4 = new q.b(r02);
        q.d dVar2 = new q.d(qVar2, bVar4, r02, dVar);
        dVar2.n(z11, dVar);
        bVar4.e();
        q qVar3 = (q) linkedHashMap.get(str2);
        if (qVar3 == null) {
            return;
        }
        qVar3.f570e = dVar2.f43057d;
    }

    public final void b(View view) {
        LinkedHashMap linkedHashMap;
        Object tag = view.getTag(R.id.div_tooltips_tag);
        List list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                linkedHashMap = this.f557h;
                if (!zHasNext) {
                    break;
                }
                q qVar = (q) linkedHashMap.get(((C1439yb) it.next()).f9981g);
                String strC = qVar == null ? null : c(qVar);
                if (strC != null) {
                    arrayList.add(strC);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashMap.remove((String) it2.next());
            }
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i10 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            b(childAt);
            i = i10;
        }
    }

    public final String c(q qVar) {
        qVar.f572g = true;
        q.e eVar = qVar.f570e;
        if (eVar != null) {
            Iterator it = eVar.f43059a.iterator();
            while (it.hasNext()) {
                ((q.c) it.next()).cancel();
            }
        }
        C6.k kVar = qVar.f569d;
        if (kVar.isShowing()) {
            kVar.setEnterTransition(null);
            kVar.setExitTransition(null);
            kVar.dismiss();
            return null;
        }
        Z z10 = qVar.f568c;
        C0672i c0672i = qVar.f567b;
        L.j(this.f551b, c0672i.f2146a, c0672i.f2147b, null, z10);
        return qVar.f566a;
    }

    public final void d(C0675l div2View, String id) {
        C6.k kVar;
        kotlin.jvm.internal.l.f(id, "id");
        kotlin.jvm.internal.l.f(div2View, "div2View");
        q qVar = (q) this.f557h.get(id);
        if (qVar == null || (kVar = qVar.f569d) == null) {
            return;
        }
        kVar.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(String tooltipId, C0672i context, boolean z10) {
        C1992A c1992a;
        kotlin.jvm.internal.l.f(tooltipId, "tooltipId");
        kotlin.jvm.internal.l.f(context, "context");
        C0675l c0675l = context.f2146a;
        b9.l lVarB = l.b(c0675l, tooltipId);
        if (lVarB != null) {
            C1439yb c1439yb = (C1439yb) lVarB.f18083b;
            View view = (View) lVarB.f18084c;
            if (!this.f557h.containsKey(c1439yb.f9981g)) {
                if (!C6.r.c(view) || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new h(this, view, c1439yb, context, z10));
                } else {
                    a(this, view, c1439yb, context, z10);
                }
                if (!C6.r.c(view) && !view.isLayoutRequested()) {
                    view.requestLayout();
                }
            }
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            C5246y.d(c0675l, new IllegalStateException(s.e("Unable to find view for tooltip '", tooltipId, '\'')));
        }
    }
}
