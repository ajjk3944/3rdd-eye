package b6;

import android.graphics.Canvas;
import android.graphics.RectF;
import b6.b;
import d6.InterfaceC5303a;
import e6.InterfaceC5422a;
import f.AbstractC5487d;
import g6.C5867c;
import g6.InterfaceC5866b;
import j6.InterfaceC6255b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k6.InterfaceC6394a;
import kotlin.jvm.internal.AbstractC6492s;
import u6.e;
import w6.InterfaceC8271a;
import y6.AbstractC8612a;
import y6.AbstractC8617f;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4072a implements b, InterfaceC8271a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f32948a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final C5867c f32949b = new C5867c(0.0f, 0.0f, 0.0f, 0.0f, 15, null);

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f32950c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f32951d;

    /* renamed from: e, reason: collision with root package name */
    private final Collection f32952e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC6394a f32953f;

    /* renamed from: g, reason: collision with root package name */
    private Float f32954g;

    /* renamed from: h, reason: collision with root package name */
    private Float f32955h;

    /* renamed from: i, reason: collision with root package name */
    private Float f32956i;

    /* renamed from: j, reason: collision with root package name */
    private Float f32957j;

    public AbstractC4072a() {
        HashMap map = new HashMap();
        this.f32950c = map;
        this.f32951d = new RectF();
        Collection collectionValues = map.values();
        AbstractC6492s.h(collectionValues, "persistentMarkers.values");
        this.f32952e = collectionValues;
    }

    public void A(Map markers) {
        AbstractC6492s.i(markers, "markers");
        AbstractC8612a.c(this.f32950c, markers);
    }

    @Override // g6.InterfaceC5865a
    public void g(e eVar, float f10, InterfaceC5866b interfaceC5866b) {
        b.a.a(this, eVar, f10, interfaceC5866b);
    }

    @Override // w6.InterfaceC8271a
    public RectF getBounds() {
        return this.f32951d;
    }

    @Override // g6.InterfaceC5865a
    public abstract void i(e eVar, C5867c c5867c, InterfaceC6255b interfaceC6255b);

    @Override // b6.b
    public Collection j() {
        return this.f32952e;
    }

    @Override // w6.InterfaceC8271a
    public void l(Number number, Number number2, Number number3, Number number4) {
        b.a.b(this, number, number2, number3, number4);
    }

    protected abstract void n(InterfaceC5422a interfaceC5422a, x6.b bVar);

    protected void o(InterfaceC5422a context, x6.b model) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(model, "model");
        Canvas canvasD = context.d();
        float fE = getBounds().left - this.f32949b.e(context.h());
        float fH = getBounds().top - this.f32949b.h();
        float f10 = getBounds().right + this.f32949b.f(context.h());
        float fC = getBounds().bottom + this.f32949b.c();
        int iSave = canvasD.save();
        canvasD.clipRect(fE, fH, f10, fC);
        q(context);
        if (!model.f().isEmpty()) {
            n(context, model);
        }
        canvasD.restoreToCount(iSave);
    }

    protected final void p(InterfaceC5422a context) {
        AbstractC6492s.i(context, "context");
        Iterator it = this.f32948a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5303a) it.next()).b(context, getBounds());
        }
    }

    protected final void q(InterfaceC5422a context) {
        AbstractC6492s.i(context, "context");
        Iterator it = this.f32948a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5303a) it.next()).a(context, getBounds());
        }
    }

    @Override // b6.b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void d(InterfaceC5422a context, x6.b model) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(model, "model");
        Canvas canvasD = context.d();
        float f10 = getBounds().left;
        float f11 = getBounds().right;
        float height = context.d().getHeight();
        int iSave = canvasD.save();
        canvasD.clipRect(f10, 0.0f, f11, height);
        p(context);
        canvasD.restoreToCount(iSave);
        for (Map.Entry entry : this.f32950c.entrySet()) {
            float fFloatValue = ((Number) entry.getKey()).floatValue();
            AbstractC5487d.a(entry.getValue());
            if (AbstractC8617f.a(m(), fFloatValue) != null) {
                getBounds();
                throw null;
            }
        }
    }

    @Override // b6.b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void a(InterfaceC5422a context, x6.b model) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(model, "model");
        this.f32949b.b();
        i(context, this.f32949b, context.i());
        o(context, model);
    }

    public InterfaceC6394a t() {
        return this.f32953f;
    }

    public Float u() {
        return this.f32957j;
    }

    public Float v() {
        return this.f32955h;
    }

    public Float w() {
        return this.f32956i;
    }

    public Float x() {
        return this.f32954g;
    }

    public void y(InterfaceC6394a interfaceC6394a) {
        this.f32953f = interfaceC6394a;
    }

    public void z(List decorations) {
        AbstractC6492s.i(decorations, "decorations");
        AbstractC8612a.b(this.f32948a, decorations);
    }
}
