package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p2.C2771a;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Zm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851Zm {

    /* renamed from: a, reason: collision with root package name */
    public final C0960bu f12949a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f12950b;

    /* renamed from: c, reason: collision with root package name */
    public final C0427An f12951c;

    /* renamed from: d, reason: collision with root package name */
    public final C1709pn f12952d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f12953e;

    /* renamed from: f, reason: collision with root package name */
    public final C0784Vn f12954f;

    /* renamed from: g, reason: collision with root package name */
    public final C2202yv f12955g;

    /* renamed from: h, reason: collision with root package name */
    public final C0633Mp f12956h;
    public final C0750Tn i;

    /* renamed from: j, reason: collision with root package name */
    public final C1280ho f12957j;

    public C0851Zm(C0960bu c0960bu, Executor executor, C0427An c0427An, Context context, C0784Vn c0784Vn, C2202yv c2202yv, C0633Mp c0633Mp, C1709pn c1709pn, C0750Tn c0750Tn, C1280ho c1280ho) {
        this.f12949a = c0960bu;
        this.f12950b = executor;
        this.f12951c = c0427An;
        this.f12953e = context;
        this.f12954f = c0784Vn;
        this.f12955g = c2202yv;
        this.f12956h = c0633Mp;
        this.f12952d = c1709pn;
        this.i = c0750Tn;
        this.f12957j = c1280ho;
    }

    public static final void b(InterfaceC0828Yg interfaceC0828Yg) {
        interfaceC0828Yg.g0("/videoClicked", AbstractC0449Cb.f7602d);
        C1649oh c1649ohL0 = interfaceC0828Yg.l0();
        synchronized (c1649ohL0.f16011d) {
            c1649ohL0.f15992F = true;
        }
        interfaceC0828Yg.g0("/getNativeAdViewSignals", AbstractC0449Cb.f7611n);
        interfaceC0828Yg.g0("/getNativeClickMeta", AbstractC0449Cb.f7612o);
    }

    public final void a(InterfaceC0828Yg interfaceC0828Yg, C2771a c2771a, InterfaceC1054df interfaceC1054df) {
        C1280ho c1280ho;
        b(interfaceC0828Yg);
        interfaceC0828Yg.g0("/video", AbstractC0449Cb.f7605g);
        interfaceC0828Yg.g0("/videoMeta", AbstractC0449Cb.f7606h);
        interfaceC0828Yg.g0("/precache", new C2128xb(26));
        interfaceC0828Yg.g0("/delayPageLoaded", AbstractC0449Cb.f7608k);
        interfaceC0828Yg.g0("/instrument", AbstractC0449Cb.i);
        interfaceC0828Yg.g0("/log", AbstractC0449Cb.f7601c);
        interfaceC0828Yg.g0("/click", new C0415Ab(null, 0, null));
        if (this.f12949a.f13480b != null) {
            C1649oh c1649ohL0 = interfaceC0828Yg.l0();
            synchronized (c1649ohL0.f16011d) {
                c1649ohL0.f15994H = true;
            }
            interfaceC0828Yg.g0("/open", new C0568Jb(true != ((Boolean) C2841s.f23267e.f23270c.a(H9.Te)).booleanValue() ? null : c2771a, null, null, null, null, null));
        } else {
            interfaceC0828Yg.l0().p(false);
        }
        if (p2.j.f22785C.f22811y.a(interfaceC0828Yg.getContext())) {
            HashMap map = new HashMap();
            if (interfaceC0828Yg.J() != null) {
                map = interfaceC0828Yg.J().f10799w0;
            }
            interfaceC0828Yg.g0("/logScionEvent", new C0415Ab(interfaceC0828Yg.getContext(), 1, map));
        }
        E9 e9 = H9.Te;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            interfaceC0828Yg.l0().f15997K = c2771a;
            interfaceC0828Yg.l0().M = interfaceC1054df;
        }
        if (!((Boolean) c2841s.f23270c.a(H9.G8)).booleanValue() || (c1280ho = this.f12957j) == null) {
            return;
        }
        interfaceC0828Yg.g0("/onDeviceStorageEvent", new C1858sb(3, c1280ho));
    }
}
