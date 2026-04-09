package Y5;

import android.graphics.RectF;
import e6.InterfaceC5422a;
import g6.C5867c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import l6.AbstractC6545a;
import th.l;
import u6.e;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f24598a = new ArrayList(4);

    /* renamed from: b, reason: collision with root package name */
    private final ph.d f24599b = AbstractC6545a.a();

    /* renamed from: c, reason: collision with root package name */
    private final ph.d f24600c = AbstractC6545a.a();

    /* renamed from: d, reason: collision with root package name */
    private final ph.d f24601d = AbstractC6545a.a();

    /* renamed from: e, reason: collision with root package name */
    private final ph.d f24602e = AbstractC6545a.a();

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ l[] f24597g = {O.f(new z(b.class, "startAxis", "getStartAxis()Lcom/patrykandpatrick/vico/core/axis/AxisRenderer;", 0)), O.f(new z(b.class, "topAxis", "getTopAxis()Lcom/patrykandpatrick/vico/core/axis/AxisRenderer;", 0)), O.f(new z(b.class, "endAxis", "getEndAxis()Lcom/patrykandpatrick/vico/core/axis/AxisRenderer;", 0)), O.f(new z(b.class, "bottomAxis", "getBottomAxis()Lcom/patrykandpatrick/vico/core/axis/AxisRenderer;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public static final a f24596f = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void l(d dVar, e eVar, RectF rectF, RectF rectF2, C5867c c5867c) {
        dVar.l(Float.valueOf(rectF.left + (eVar.h() ? c5867c.g() : c5867c.d())), Float.valueOf(rectF2.bottom), Float.valueOf(rectF.right - (eVar.h() ? c5867c.d() : c5867c.g())), Float.valueOf(rectF2.bottom + c5867c.c()));
    }

    private final void n(d dVar, e eVar, RectF rectF, RectF rectF2, C5867c c5867c) {
        dVar.l(Float.valueOf(eVar.h() ? rectF.right - c5867c.d() : rectF.left), Float.valueOf(rectF2.top), Float.valueOf(eVar.h() ? rectF.right : rectF.left + c5867c.d()), Float.valueOf(rectF2.bottom));
    }

    private final void o() {
        d dVarG = g();
        if (dVarG != null) {
            d dVarH = h();
            RectF bounds = dVarH != null ? dVarH.getBounds() : null;
            d dVarF = f();
            RectF bounds2 = dVarF != null ? dVarF.getBounds() : null;
            d dVarE = e();
            dVarG.e(bounds, bounds2, dVarE != null ? dVarE.getBounds() : null);
        }
        d dVarH2 = h();
        if (dVarH2 != null) {
            d dVarG2 = g();
            RectF bounds3 = dVarG2 != null ? dVarG2.getBounds() : null;
            d dVarF2 = f();
            RectF bounds4 = dVarF2 != null ? dVarF2.getBounds() : null;
            d dVarE2 = e();
            dVarH2.e(bounds3, bounds4, dVarE2 != null ? dVarE2.getBounds() : null);
        }
        d dVarF3 = f();
        if (dVarF3 != null) {
            d dVarH3 = h();
            RectF bounds5 = dVarH3 != null ? dVarH3.getBounds() : null;
            d dVarG3 = g();
            RectF bounds6 = dVarG3 != null ? dVarG3.getBounds() : null;
            d dVarE3 = e();
            dVarF3.e(bounds5, bounds6, dVarE3 != null ? dVarE3.getBounds() : null);
        }
        d dVarE4 = e();
        if (dVarE4 != null) {
            d dVarH4 = h();
            RectF bounds7 = dVarH4 != null ? dVarH4.getBounds() : null;
            d dVarF4 = f();
            RectF bounds8 = dVarF4 != null ? dVarF4.getBounds() : null;
            d dVarG4 = g();
            dVarE4.e(bounds7, bounds8, dVarG4 != null ? dVarG4.getBounds() : null);
        }
    }

    private final void q(d dVar, e eVar, RectF rectF, RectF rectF2, C5867c c5867c) {
        dVar.l(Float.valueOf(eVar.h() ? rectF.left : rectF.right - c5867c.g()), Float.valueOf(rectF2.top), Float.valueOf(eVar.h() ? rectF.left + c5867c.g() : rectF.right), Float.valueOf(rectF2.bottom));
    }

    private final void s(d dVar, e eVar, RectF rectF, C5867c c5867c) {
        dVar.l(Float.valueOf(rectF.left + (eVar.h() ? c5867c.g() : c5867c.d())), Float.valueOf(rectF.top), Float.valueOf(rectF.right - (eVar.h() ? c5867c.d() : c5867c.g())), Float.valueOf(rectF.top + c5867c.h()));
    }

    public final void a(List destination) {
        AbstractC6492s.i(destination, "destination");
        d dVarG = g();
        if (dVarG != null) {
            destination.add(dVarG);
        }
        d dVarH = h();
        if (dVarH != null) {
            destination.add(dVarH);
        }
        d dVarF = f();
        if (dVarF != null) {
            destination.add(dVarF);
        }
        d dVarE = e();
        if (dVarE != null) {
            destination.add(dVarE);
        }
    }

    public final void b(InterfaceC5422a context) {
        AbstractC6492s.i(context, "context");
        Iterator it = this.f24598a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).h(context);
        }
    }

    public final void c(InterfaceC5422a context) {
        AbstractC6492s.i(context, "context");
        Iterator it = this.f24598a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).c(context);
        }
    }

    public final ArrayList d() {
        return this.f24598a;
    }

    public final d e() {
        return (d) this.f24602e.a(this, f24597g[3]);
    }

    public final d f() {
        return (d) this.f24601d.a(this, f24597g[2]);
    }

    public final d g() {
        return (d) this.f24599b.a(this, f24597g[0]);
    }

    public final d h() {
        return (d) this.f24600c.a(this, f24597g[1]);
    }

    public final void i(d dVar, d dVar2, d dVar3, d dVar4) {
        p(dVar);
        r(dVar2);
        m(dVar3);
        k(dVar4);
    }

    public final void j(e measureContext, RectF contentBounds, RectF chartBounds, C5867c insets) {
        AbstractC6492s.i(measureContext, "measureContext");
        AbstractC6492s.i(contentBounds, "contentBounds");
        AbstractC6492s.i(chartBounds, "chartBounds");
        AbstractC6492s.i(insets, "insets");
        d dVarG = g();
        if (dVarG != null) {
            q(dVarG, measureContext, contentBounds, chartBounds, insets);
        }
        d dVarH = h();
        if (dVarH != null) {
            s(dVarH, measureContext, contentBounds, insets);
        }
        d dVarF = f();
        if (dVarF != null) {
            n(dVarF, measureContext, contentBounds, chartBounds, insets);
        }
        d dVarE = e();
        if (dVarE != null) {
            l(dVarE, measureContext, contentBounds, chartBounds, insets);
        }
        o();
    }

    public final void k(d dVar) {
        this.f24602e.b(this, f24597g[3], dVar);
    }

    public final void m(d dVar) {
        this.f24601d.b(this, f24597g[2], dVar);
    }

    public final void p(d dVar) {
        this.f24599b.b(this, f24597g[0], dVar);
    }

    public final void r(d dVar) {
        this.f24600c.b(this, f24597g[1], dVar);
    }
}
