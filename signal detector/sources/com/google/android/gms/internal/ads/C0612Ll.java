package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import q2.C2841s;
import u.C2936e;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612Ll implements InterfaceC0441Bk, s2.k, InterfaceC1921tk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9747a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0828Yg f9748b;

    /* renamed from: c, reason: collision with root package name */
    public final Qt f9749c;

    /* renamed from: d, reason: collision with root package name */
    public final C2951a f9750d;

    /* renamed from: e, reason: collision with root package name */
    public final C0820Xp f9751e;

    /* renamed from: f, reason: collision with root package name */
    public C0837Yp f9752f;

    public C0612Ll(Context context, InterfaceC0828Yg interfaceC0828Yg, Qt qt, C2951a c2951a, C0820Xp c0820Xp) {
        this.f9747a = context;
        this.f9748b = interfaceC0828Yg;
        this.f9749c = qt;
        this.f9750d = c2951a;
        this.f9751e = c0820Xp;
    }

    @Override // s2.k
    public final void I0() {
    }

    @Override // s2.k
    public final void K1() {
    }

    @Override // s2.k
    public final void N2() {
    }

    @Override // s2.k
    public final void R1() {
    }

    public final boolean a() {
        Vv vv;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.d6)).booleanValue()) {
            return false;
        }
        C0820Xp c0820Xp = this.f9751e;
        synchronized (c0820Xp) {
            vv = c0820Xp.f12501f;
        }
        return vv != null;
    }

    @Override // s2.k
    public final void d1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final void e() {
        InterfaceC0828Yg interfaceC0828Yg;
        Qt qt = this.f9749c;
        if (!qt.f10750T || (interfaceC0828Yg = this.f9748b) == null) {
            return;
        }
        p2.j jVar = p2.j.f22785C;
        C1437kl c1437kl = jVar.f22810x;
        C1437kl c1437kl2 = jVar.f22810x;
        c1437kl.getClass();
        if (C1437kl.g(this.f9747a)) {
            if (a()) {
                this.f9751e.b();
                return;
            }
            C2951a c2951a = this.f9750d;
            int i = c2951a.f23785b;
            int i3 = c2951a.f23786c;
            int i6 = 1;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i3).length());
            sb.append(i);
            sb.append(".");
            sb.append(i3);
            String string = sb.toString();
            C1014cu c1014cu = qt.f10752V;
            String str = c1014cu.h() + (-1) != 1 ? "javascript" : null;
            int i7 = 2;
            if (c1014cu.h() == 1) {
                i6 = 3;
            } else {
                i7 = qt.f10755Y == 2 ? 4 : 1;
            }
            int i8 = i7;
            int i9 = i6;
            String str2 = qt.f10778l0;
            WebView webViewT = interfaceC0828Yg.t();
            c1437kl2.getClass();
            C0837Yp c0837YpI = C1437kl.i(i8, i9, webViewT, string, str, str2);
            this.f9752f = c0837YpI;
            if (c0837YpI != null) {
                Rv rv = c0837YpI.f12708a;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.c6)).booleanValue()) {
                    WebView webViewT2 = interfaceC0828Yg.t();
                    c1437kl2.getClass();
                    C1437kl.k(rv, webViewT2);
                    ArrayList arrayListC = interfaceC0828Yg.C();
                    int size = arrayListC.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayListC.get(i10);
                        i10++;
                        p2.j.f22785C.f22810x.getClass();
                        C1437kl.q(new RunnableC0769Up(rv, (View) obj, 0));
                    }
                } else {
                    View viewB0 = interfaceC0828Yg.b0();
                    c1437kl2.getClass();
                    C1437kl.k(rv, viewB0);
                }
                interfaceC0828Yg.o0(this.f9752f);
                p2.j.f22785C.f22810x.getClass();
                C1437kl.j(rv);
                interfaceC0828Yg.a("onSdkLoaded", new C2936e(0));
            }
        }
    }

    @Override // s2.k
    public final void g() {
        InterfaceC0828Yg interfaceC0828Yg;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.g6)).booleanValue() || (interfaceC0828Yg = this.f9748b) == null) {
            return;
        }
        if (this.f9752f != null || a()) {
            if (this.f9752f != null) {
                interfaceC0828Yg.a("onSdkImpression", new C2936e(0));
            } else {
                this.f9751e.c();
            }
        }
    }

    @Override // s2.k
    public final void h0() {
    }

    @Override // s2.k
    public final void j2() {
    }

    @Override // s2.k
    public final void k0(int i) {
        this.f9752f = null;
    }

    @Override // s2.k
    public final void n1() {
    }

    @Override // s2.k
    public final void x1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final void z() {
        InterfaceC0828Yg interfaceC0828Yg;
        if (a()) {
            this.f9751e.c();
        } else {
            if (this.f9752f == null || (interfaceC0828Yg = this.f9748b) == null) {
                return;
            }
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.g6)).booleanValue()) {
                interfaceC0828Yg.a("onSdkImpression", new C2936e(0));
            }
        }
    }
}
