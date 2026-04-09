package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import q2.C2841s;
import u.C2936e;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.ij, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328ij implements InterfaceC0441Bk, InterfaceC1921tk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14767a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0828Yg f14768b;

    /* renamed from: c, reason: collision with root package name */
    public final Qt f14769c;

    /* renamed from: d, reason: collision with root package name */
    public final C2951a f14770d;

    /* renamed from: e, reason: collision with root package name */
    public C0837Yp f14771e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14772f;

    /* renamed from: g, reason: collision with root package name */
    public final C0820Xp f14773g;

    public C1328ij(Context context, InterfaceC0828Yg interfaceC0828Yg, Qt qt, C2951a c2951a, C0820Xp c0820Xp) {
        this.f14767a = context;
        this.f14768b = interfaceC0828Yg;
        this.f14769c = qt;
        this.f14770d = c2951a;
        this.f14773g = c0820Xp;
    }

    public final synchronized void a() {
        InterfaceC0828Yg interfaceC0828Yg;
        int i;
        int i3;
        try {
            Qt qt = this.f14769c;
            if (qt.f10750T && (interfaceC0828Yg = this.f14768b) != null) {
                Context context = this.f14767a;
                p2.j jVar = p2.j.f22785C;
                jVar.f22810x.getClass();
                if (C1437kl.g(context)) {
                    C2951a c2951a = this.f14770d;
                    int i6 = c2951a.f23785b;
                    int i7 = c2951a.f23786c;
                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 1 + String.valueOf(i7).length());
                    sb.append(i6);
                    sb.append(".");
                    sb.append(i7);
                    String string = sb.toString();
                    C1014cu c1014cu = qt.f10752V;
                    String str = c1014cu.h() + (-1) != 1 ? "javascript" : null;
                    if (c1014cu.h() == 1) {
                        i = 2;
                        i3 = 3;
                    } else if (qt.f10764e == 1) {
                        i = 3;
                        i3 = 1;
                    } else {
                        i = 1;
                        i3 = 1;
                    }
                    String str2 = qt.f10778l0;
                    C1437kl c1437kl = jVar.f22810x;
                    WebView webViewT = interfaceC0828Yg.t();
                    c1437kl.getClass();
                    C0837Yp c0837YpI = C1437kl.i(i, i3, webViewT, string, str, str2);
                    this.f14771e = c0837YpI;
                    if (c0837YpI != null) {
                        Rv rv = c0837YpI.f12708a;
                        if (((Boolean) C2841s.f23267e.f23270c.a(H9.c6)).booleanValue()) {
                            C1437kl c1437kl2 = jVar.f22810x;
                            WebView webViewT2 = interfaceC0828Yg.t();
                            c1437kl2.getClass();
                            C1437kl.k(rv, webViewT2);
                            ArrayList arrayListC = interfaceC0828Yg.C();
                            int size = arrayListC.size();
                            int i8 = 0;
                            while (i8 < size) {
                                Object obj = arrayListC.get(i8);
                                i8++;
                                p2.j.f22785C.f22810x.getClass();
                                C1437kl.q(new RunnableC0769Up(rv, (View) obj, 0));
                            }
                        } else {
                            View viewB0 = interfaceC0828Yg.b0();
                            jVar.f22810x.getClass();
                            C1437kl.k(rv, viewB0);
                        }
                        interfaceC0828Yg.o0(this.f14771e);
                        p2.j.f22785C.f22810x.getClass();
                        C1437kl.j(rv);
                        this.f14772f = true;
                        interfaceC0828Yg.a("onSdkLoaded", new C2936e(0));
                    }
                }
            }
        } finally {
        }
    }

    public final boolean b() {
        Vv vv;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.d6)).booleanValue()) {
            return false;
        }
        C0820Xp c0820Xp = this.f14773g;
        synchronized (c0820Xp) {
            vv = c0820Xp.f12501f;
        }
        return vv != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final synchronized void e() {
        if (b()) {
            this.f14773g.b();
        } else {
            if (this.f14772f) {
                return;
            }
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final synchronized void z() {
        InterfaceC0828Yg interfaceC0828Yg;
        if (b()) {
            this.f14773g.c();
            return;
        }
        if (!this.f14772f) {
            a();
        }
        if (!this.f14769c.f10750T || this.f14771e == null || (interfaceC0828Yg = this.f14768b) == null) {
            return;
        }
        interfaceC0828Yg.a("onSdkImpression", new C2936e(0));
    }
}
