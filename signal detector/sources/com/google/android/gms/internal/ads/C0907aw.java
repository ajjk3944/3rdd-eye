package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.aw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907aw implements InterfaceC1070dw {

    /* renamed from: e, reason: collision with root package name */
    public static final C0907aw f13263e = new C0907aw(new C1125ew());

    /* renamed from: a, reason: collision with root package name */
    public boolean f13264a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13265b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13266c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13267d;

    public C0907aw(C1125ew c1125ew) {
        this.f13267d = c1125ew;
    }

    public synchronized void a(C0889ae c0889ae) {
        C1769qt c1769qt = (C1769qt) this.f13266c;
        C1306iD c1306iDF = AbstractC1984ut.F((OC) this.f13267d, C1704pi.f16211m, c1769qt.f16418e);
        c1306iDF.a(new CD(c1306iDF, 0, c0889ae), c1769qt.f16418e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1070dw
    public void b(boolean z6) {
        if (!this.f13265b && z6) {
            Date date = new Date();
            Date date2 = (Date) this.f13266c;
            if (date2 == null || date.after(date2)) {
                this.f13266c = date;
                if (this.f13264a) {
                    Iterator it = Collections.unmodifiableCollection(C1016cw.f13696c.f13698b).iterator();
                    while (it.hasNext()) {
                        AbstractC1502lw abstractC1502lw = ((Rv) it.next()).f11081d;
                        Date date3 = (Date) this.f13266c;
                        abstractC1502lw.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f13265b = z6;
    }

    public synchronized OC c(C1769qt c1769qt) {
        InterfaceC1931tu interfaceC1931tu;
        InterfaceC1931tu interfaceC1931tu2;
        if (!this.f13265b && !this.f13264a && (interfaceC1931tu = ((C1769qt) this.f13266c).f16420g) != null && (interfaceC1931tu2 = c1769qt.f16420g) != null && interfaceC1931tu.equals(interfaceC1931tu2)) {
            this.f13264a = true;
            return (OC) this.f13267d;
        }
        return null;
    }

    public C0907aw(C1338iu c1338iu, L6 l6, C1769qt c1769qt) {
        this.f13264a = false;
        this.f13265b = false;
        this.f13266c = c1769qt;
        InterfaceFutureC2326a interfaceFutureC2326aQ = ((Rx) l6.f9620b).q(c1769qt.f16415b, c1769qt.f16414a, null);
        C0450Cc c0450Cc = new C0450Cc(this, l6, c1338iu, c1769qt, 5);
        Executor executor = c1769qt.f16418e;
        this.f13267d = AbstractC1984ut.D(AbstractC1984ut.F(interfaceFutureC2326aQ, c0450Cc, executor), Exception.class, new C0738Tb(this, l6), executor);
    }
}
