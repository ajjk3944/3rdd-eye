package Ie;

import Y5.a;
import Y5.c;
import Y5.d;
import Zg.AbstractC3682n;
import android.graphics.RectF;
import e6.InterfaceC5422a;
import g6.C5867c;
import g6.InterfaceC5866b;
import j6.InterfaceC6255b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k6.C6396c;
import k6.C6397d;
import k6.InterfaceC6395b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o6.C7091b;
import org.snmp4j.mp.MPv3;
import t6.C8034b;
import t6.EnumC8033a;
import t6.EnumC8035c;
import u6.e;
import y6.AbstractC8612a;

/* loaded from: classes4.dex */
public final class d implements Y5.d {

    /* renamed from: a, reason: collision with root package name */
    private final c.b f9112a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9113b;

    /* renamed from: c, reason: collision with root package name */
    private final z6.c f9114c;

    /* renamed from: d, reason: collision with root package name */
    private final C8034b f9115d;

    /* renamed from: e, reason: collision with root package name */
    private final C7091b f9116e;

    /* renamed from: f, reason: collision with root package name */
    private final C7091b f9117f;

    /* renamed from: g, reason: collision with root package name */
    private final a.C0936a f9118g;

    /* renamed from: h, reason: collision with root package name */
    private final List f9119h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f9120i;

    public d(c.b position, List labels, z6.c labelFormatter, C8034b c8034b, C7091b c7091b, C7091b c7091b2, a.C0936a widthConstraint) {
        AbstractC6492s.i(position, "position");
        AbstractC6492s.i(labels, "labels");
        AbstractC6492s.i(labelFormatter, "labelFormatter");
        AbstractC6492s.i(widthConstraint, "widthConstraint");
        this.f9112a = position;
        this.f9113b = labels;
        this.f9114c = labelFormatter;
        this.f9115d = c8034b;
        this.f9116e = c7091b;
        this.f9117f = c7091b2;
        this.f9118g = widthConstraint;
        this.f9119h = new ArrayList();
        this.f9120i = new RectF();
    }

    private final void n(InterfaceC5422a interfaceC5422a, C8034b c8034b, CharSequence charSequence, float f10, float f11) {
        C8034b.d(c8034b, interfaceC5422a, charSequence, f10, f11, EnumC8033a.Start, EnumC8035c.Center, MPv3.MAX_MESSAGE_ID, 0, 0.0f, 128, null);
    }

    private final float o(e eVar) {
        C8034b c8034b = this.f9115d;
        Float fValueOf = c8034b != null ? Float.valueOf(C8034b.t(c8034b, eVar, this.f9118g.a(), 0, 0, 0.0f, 12, null)) : null;
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.0f;
    }

    private final float p(e eVar) {
        C7091b c7091b = this.f9117f;
        Float fValueOf = c7091b != null ? Float.valueOf(c7091b.n()) : null;
        return eVar.g(fValueOf != null ? fValueOf.floatValue() : 0.0f);
    }

    private final float q(e eVar) {
        C7091b c7091b = this.f9116e;
        Float fValueOf = c7091b != null ? Float.valueOf(c7091b.n()) : null;
        return eVar.g(fValueOf != null ? fValueOf.floatValue() : 0.0f);
    }

    private final float r(e eVar) {
        boolean zC = t().c(eVar.h());
        return t() instanceof c.b.C0938b ? zC ? getBounds().right : getBounds().left : zC ? getBounds().left : getBounds().right;
    }

    private final float s(float f10, InterfaceC6395b interfaceC6395b) {
        return getBounds().bottom - (getBounds().height() * ((f10 - interfaceC6395b.c()) / (interfaceC6395b.a() - interfaceC6395b.c())));
    }

    private final boolean u(float f10, float f11, float f12, float f13) {
        List<RectF> list = this.f9119h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (RectF rectF : list) {
            if (rectF.contains(f10, f11, f12, f13) || rectF.intersects(f10, f11, f12, f13)) {
                return false;
            }
        }
        return true;
    }

    @Override // Y5.d
    public void c(InterfaceC5422a context) {
        AbstractC6492s.i(context, "context");
        C6397d c6397dB = C6396c.b(context.c(), null, 1, null);
        Iterator it = this.f9113b.iterator();
        while (it.hasNext()) {
            float fS = s(((Number) it.next()).floatValue(), c6397dB);
            C7091b c7091b = this.f9116e;
            if (c7091b != null) {
                float f10 = 2;
                if (!u(context.k().left, fS - (q(context) / f10), context.k().right, fS - (q(context) / f10))) {
                    c7091b = null;
                }
                if (c7091b != null) {
                    C7091b.j(c7091b, context, context.k().left, context.k().right, fS, 0.0f, 16, null);
                }
            }
        }
        C7091b c7091b2 = this.f9117f;
        if (c7091b2 != null) {
            C7091b.l(c7091b2, context, getBounds().top, getBounds().bottom + p(context), t().c(context.h()) ? getBounds().right : getBounds().left, 0.0f, 16, null);
        }
    }

    @Override // Y5.d
    public void e(RectF... bounds) {
        AbstractC6492s.i(bounds, "bounds");
        AbstractC8612a.b(this.f9119h, AbstractC3682n.X(bounds));
    }

    @Override // g6.InterfaceC5865a
    public void g(e context, float f10, InterfaceC5866b outInsets) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(outInsets, "outInsets");
        float fO = o(context);
        float f11 = t().d() ? fO : 0.0f;
        if (!t().b()) {
            fO = 0.0f;
        }
        outInsets.a(f11, fO);
    }

    @Override // w6.InterfaceC8271a
    public RectF getBounds() {
        return this.f9120i;
    }

    @Override // Y5.d
    public void h(InterfaceC5422a context) {
        AbstractC6492s.i(context, "context");
        if (this.f9115d != null) {
            float fR = r(context);
            C6397d c6397dB = C6396c.b(context.c(), null, 1, null);
            Iterator it = this.f9113b.iterator();
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue();
                n(context, this.f9115d, this.f9114c.a(fFloatValue, c6397dB), fR, s(fFloatValue, c6397dB));
            }
        }
    }

    @Override // g6.InterfaceC5865a
    public void i(e context, C5867c outInsets, InterfaceC6255b segmentProperties) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(outInsets, "outInsets");
        AbstractC6492s.i(segmentProperties, "segmentProperties");
        C8034b c8034b = this.f9115d;
        Float fValueOf = c8034b != null ? Float.valueOf(C8034b.g(c8034b, context, null, 0, 0, 0.0f, 30, null)) : null;
        float fFloatValue = (fValueOf != null ? fValueOf.floatValue() : 0.0f) / 2;
        C5867c.l(outInsets, 0.0f, fFloatValue, 0.0f, fFloatValue, 5, null);
    }

    @Override // w6.InterfaceC8271a
    public void l(Number number, Number number2, Number number3, Number number4) {
        d.a.b(this, number, number2, number3, number4);
    }

    public c.b t() {
        return this.f9112a;
    }

    public /* synthetic */ d(c.b bVar, List list, z6.c cVar, C8034b c8034b, C7091b c7091b, C7091b c7091b2, a.C0936a c0936a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, list, (i10 & 4) != 0 ? new z6.b() : cVar, (i10 & 8) != 0 ? null : c8034b, (i10 & 16) != 0 ? null : c7091b, (i10 & 32) != 0 ? null : c7091b2, (i10 & 64) != 0 ? new a.C0936a("-00") : c0936a);
    }
}
