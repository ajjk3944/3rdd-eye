package Ie;

import Y5.c;
import Y5.d;
import Zg.AbstractC3682n;
import a6.b;
import android.graphics.RectF;
import e6.InterfaceC5422a;
import g6.C5867c;
import g6.InterfaceC5866b;
import j6.InterfaceC6255b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.C6396c;
import k6.C6397d;
import k6.InterfaceC6395b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o6.C7091b;
import t6.C8034b;
import t6.EnumC8035c;
import u6.e;
import y6.AbstractC8612a;
import y6.AbstractC8620i;

/* loaded from: classes4.dex */
public final class c implements Y5.d {

    /* renamed from: a, reason: collision with root package name */
    private final List f9103a;

    /* renamed from: b, reason: collision with root package name */
    private final z6.c f9104b;

    /* renamed from: c, reason: collision with root package name */
    private final C8034b f9105c;

    /* renamed from: d, reason: collision with root package name */
    private final C7091b f9106d;

    /* renamed from: e, reason: collision with root package name */
    private final C7091b f9107e;

    /* renamed from: f, reason: collision with root package name */
    private final c.a.C0937a f9108f;

    /* renamed from: g, reason: collision with root package name */
    private final b.a f9109g;

    /* renamed from: h, reason: collision with root package name */
    private final List f9110h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f9111i;

    public c(List labels, z6.c labelFormatter, C8034b c8034b, C7091b c7091b, C7091b c7091b2) {
        AbstractC6492s.i(labels, "labels");
        AbstractC6492s.i(labelFormatter, "labelFormatter");
        this.f9103a = labels;
        this.f9104b = labelFormatter;
        this.f9105c = c8034b;
        this.f9106d = c7091b;
        this.f9107e = c7091b2;
        this.f9108f = c.a.C0937a.f24603a;
        this.f9109g = new b.a(0, 0, 3, null);
        this.f9110h = new ArrayList();
        this.f9111i = new RectF();
    }

    private final float n(e eVar) {
        C7091b c7091b = this.f9107e;
        Float fValueOf = c7091b != null ? Float.valueOf(c7091b.n()) : null;
        return eVar.g(fValueOf != null ? fValueOf.floatValue() : 0.0f);
    }

    private final float o(InterfaceC5422a interfaceC5422a, float f10, InterfaceC6395b interfaceC6395b) {
        return AbstractC8620i.c(getBounds(), interfaceC5422a.h()) + ((AbstractC8620i.b(getBounds(), interfaceC5422a.h()) - AbstractC8620i.c(getBounds(), interfaceC5422a.h())) * ((f10 - interfaceC6395b.e()) / (interfaceC6395b.b() - interfaceC6395b.e())));
    }

    private final EnumC8035c q(c.a aVar) {
        return aVar.a() ? EnumC8035c.Bottom : EnumC8035c.Top;
    }

    @Override // Y5.d
    public void c(InterfaceC5422a context) {
        AbstractC6492s.i(context, "context");
        float f10 = p().a() ? getBounds().top : getBounds().bottom;
        float fN = p().a() ? n(context) + f10 : f10;
        C6397d c6397dB = C6396c.b(context.c(), null, 1, null);
        Iterator it = this.f9103a.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            float fO = o(context, fFloatValue, c6397dB);
            C7091b c7091b = this.f9106d;
            if (c7091b != null) {
                C7091b.l(c7091b, context, context.k().top, context.k().bottom, fO, 0.0f, 16, null);
            }
            C8034b c8034b = this.f9105c;
            if (c8034b != null) {
                C8034b.d(c8034b, context, this.f9104b.a(fFloatValue, c6397dB), fO, fN, null, q(p()), 0, 0, 0.0f, 208, null);
            }
        }
        C7091b c7091b2 = this.f9107e;
        if (c7091b2 != null) {
            C7091b.j(c7091b2, context, context.k().left, context.k().right, (n(context) / 2) + (p().a() ? getBounds().top : getBounds().bottom), 0.0f, 16, null);
        }
    }

    @Override // Y5.d
    public void e(RectF... bounds) {
        AbstractC6492s.i(bounds, "bounds");
        AbstractC8612a.b(this.f9110h, AbstractC3682n.X(bounds));
    }

    @Override // g6.InterfaceC5865a
    public void g(e eVar, float f10, InterfaceC5866b interfaceC5866b) {
        d.a.a(this, eVar, f10, interfaceC5866b);
    }

    @Override // w6.InterfaceC8271a
    public RectF getBounds() {
        return this.f9111i;
    }

    @Override // Y5.d
    public void h(InterfaceC5422a context) {
        AbstractC6492s.i(context, "context");
    }

    @Override // g6.InterfaceC5865a
    public void i(e context, C5867c outInsets, InterfaceC6255b segmentProperties) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(outInsets, "outInsets");
        AbstractC6492s.i(segmentProperties, "segmentProperties");
        C8034b c8034b = this.f9105c;
        Float fValueOf = c8034b != null ? Float.valueOf(C8034b.g(c8034b, context, null, 0, 0, 0.0f, 30, null)) : null;
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        outInsets.n(this.f9109g.a(1.0f));
        outInsets.o(p().e() ? fFloatValue : 0.0f);
        outInsets.m(p().a() ? fFloatValue : 0.0f);
    }

    @Override // w6.InterfaceC8271a
    public void l(Number number, Number number2, Number number3, Number number4) {
        d.a.b(this, number, number2, number3, number4);
    }

    public c.a.C0937a p() {
        return this.f9108f;
    }

    public /* synthetic */ c(List list, z6.c cVar, C8034b c8034b, C7091b c7091b, C7091b c7091b2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? new z6.b() : cVar, (i10 & 4) != 0 ? null : c8034b, (i10 & 8) != 0 ? null : c7091b, (i10 & 16) != 0 ? null : c7091b2);
    }
}
