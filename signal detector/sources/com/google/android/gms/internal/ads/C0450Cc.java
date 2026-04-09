package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.InputEvent;
import android.view.View;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;
import p2.C2771a;
import q2.C2841s;
import t2.AbstractC2907C;
import w0.C2968d;

/* renamed from: com.google.android.gms.internal.ads.Cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450Cc implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7622a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7623b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7624c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7625d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7626e;

    public C0450Cc(C0895ak c0895ak, String str, InterfaceC2237zc interfaceC2237zc, InterfaceC2183yc interfaceC2183yc) {
        this.f7622a = 0;
        this.f7626e = c0895ak;
        this.f7623b = str;
        this.f7625d = interfaceC2237zc;
        this.f7624c = interfaceC2183yc;
    }

    public InterfaceFutureC2326a a(Object obj) {
        C0657Of c0657Of = new C0657Of();
        C1967uc c1967ucC = ((C0895ak) this.f7626e).c();
        AbstractC2907C.m("callJs > getEngine: Promise created");
        c1967ucC.A(new C1431kf(this, c1967ucC, obj, c0657Of, 7), new C0697Ql(this, c0657Of, c1967ucC, 7));
        return c0657Of;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) {
        InterfaceFutureC2326a interfaceFutureC2326aW;
        ED edE;
        switch (this.f7622a) {
            case 0:
                return a(obj);
            case 1:
                C2189yi c2189yi = (C2189yi) this.f7624c;
                Uri.Builder builder = (Uri.Builder) this.f7625d;
                String str = (String) this.f7623b;
                InputEvent inputEvent = (InputEvent) this.f7626e;
                if (((Integer) obj).intValue() != 1) {
                    builder.appendQueryParameter((String) C2841s.f23267e.f23270c.a(H9.vb), "10");
                    return AbstractC1984ut.e(builder.toString());
                }
                Uri.Builder builderBuildUpon = builder.build().buildUpon();
                E9 e9 = H9.wb;
                G9 g9 = C2841s.f23267e.f23270c;
                builderBuildUpon.appendQueryParameter((String) g9.a(e9), "1");
                builderBuildUpon.appendQueryParameter((String) g9.a(H9.vb), "12");
                if (str.contains((CharSequence) g9.a(H9.xb))) {
                    builderBuildUpon.authority((String) g9.a(H9.yb));
                }
                C0854Zp c0854Zp = c2189yi.f17743c;
                Uri uriBuild = builderBuildUpon.build();
                c0854Zp.getClass();
                try {
                    C2968d c2968d = c0854Zp.f12969a;
                    Objects.requireNonNull(c2968d);
                    interfaceFutureC2326aW = c2968d.d(uriBuild, inputEvent);
                } catch (Exception e6) {
                    interfaceFutureC2326aW = AbstractC1984ut.w(e6);
                }
                return AbstractC1984ut.F(AbstractC2221zD.r(interfaceFutureC2326aW), new C0738Tb(2, builder), c2189yi.f17746f);
            case 2:
                C0732Sm c0732Sm = (C0732Sm) this.f7624c;
                String str2 = (String) this.f7623b;
                InterfaceC1054df interfaceC1054df = (InterfaceC1054df) this.f7625d;
                C2771a c2771a = (C2771a) this.f7626e;
                c0732Sm.getClass();
                W9 w9 = p2.j.f22785C.f22791d;
                InterfaceC0828Yg interfaceC0828YgG = W9.g(c0732Sm.f11227a, new T2.d(0, 0, 0), "native-omid", false, false, c0732Sm.f11229c, null, c0732Sm.f11230d, null, c0732Sm.f11231e, c0732Sm.f11232f, null, null, c0732Sm.f11241p, c0732Sm.f11242q, c0732Sm.f11238m);
                C2000v8 c2000v8 = new C2000v8(interfaceC0828YgG);
                interfaceC0828YgG.l0().f16014g = new C1283hr(18, c2000v8);
                interfaceC0828YgG.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.Te)).booleanValue()) {
                    if (interfaceC1054df != null) {
                        interfaceC0828YgG.l0().M = interfaceC1054df;
                    }
                    interfaceC0828YgG.l0().f15997K = c2771a;
                }
                return c2000v8;
            case 3:
                C1338iu c1338iu = (C1338iu) this.f7624c;
                return AbstractC1984ut.F(((InterfaceC1872sp) this.f7625d).e((C1807re) this.f7626e), (InterfaceC1736qD) this.f7623b, (ID) c1338iu.f14822b);
            case 4:
                C0753Tq c0753Tq = (C0753Tq) this.f7624c;
                Qt qt = (Qt) this.f7625d;
                Xt xt = (Xt) this.f7626e;
                InterfaceC0956bq interfaceC0956bq = (InterfaceC0956bq) this.f7623b;
                Su suY = AbstractC1135f5.y(c0753Tq.f11483j, 12);
                suY.s0(qt.f10732E);
                suY.a();
                InterfaceFutureC2326a interfaceFutureC2326aE = AbstractC1984ut.E(interfaceC0956bq.b(xt, qt), qt.f10748R, TimeUnit.MILLISECONDS, c0753Tq.f11480f);
                c0753Tq.f11482h.d(xt, qt, interfaceFutureC2326aE, c0753Tq.f11477c);
                C1476lN.I(interfaceFutureC2326aE, c0753Tq.f11484k, suY, false);
                return interfaceFutureC2326aE;
            case 5:
                C0907aw c0907aw = (C0907aw) this.f7624c;
                L6 l6 = (L6) this.f7625d;
                C1338iu c1338iu2 = (C1338iu) this.f7626e;
                C1769qt c1769qt = (C1769qt) this.f7623b;
                C1877su c1877su = (C1877su) obj;
                synchronized (c0907aw) {
                    try {
                        c0907aw.f13265b = true;
                        c1877su.f16818a = (InterfaceC0848Zj) ((Rx) l6.f9620b).f11090b;
                        if (c0907aw.f13264a) {
                            edE = AbstractC1984ut.e(new C2201yu(c1877su, c1769qt));
                        } else {
                            c1338iu2.u(c1769qt.f16420g, c1877su);
                            edE = ED.f7928b;
                        }
                    } finally {
                    }
                }
                return edE;
            case 6:
                return ((My) ((Ux) this.f7624c).f11841b.f10818f.get()).b((Context) this.f7625d, (View) this.f7626e, (Activity) this.f7623b);
            default:
                Ux ux = (Ux) this.f7624c;
                return ((My) ux.f11841b.f10818f.get()).g((Context) this.f7625d, (View) this.f7626e, (String) this.f7623b);
        }
    }

    public /* synthetic */ C0450Cc(C0732Sm c0732Sm, String str, C0945bf c0945bf, C2771a c2771a) {
        this.f7622a = 2;
        this.f7624c = c0732Sm;
        this.f7623b = str;
        this.f7625d = c0945bf;
        this.f7626e = c2771a;
    }

    public /* synthetic */ C0450Cc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f7622a = i;
        this.f7624c = obj;
        this.f7625d = obj2;
        this.f7626e = obj3;
        this.f7623b = obj4;
    }

    public /* synthetic */ C0450Cc(Object obj, Object obj2, String str, Object obj3, int i) {
        this.f7622a = i;
        this.f7624c = obj;
        this.f7625d = obj2;
        this.f7623b = str;
        this.f7626e = obj3;
    }
}
