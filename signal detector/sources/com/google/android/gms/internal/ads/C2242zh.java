package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p2.C2771a;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.zh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2242zh implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17894a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f17895b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f17896c;

    public /* synthetic */ C2242zh(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, int i) {
        this.f17894a = i;
        this.f17895b = interfaceC2069wN;
        this.f17896c = interfaceC2069wN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        C0623Mf c0623Mf;
        switch (this.f17894a) {
            case 0:
                return new C2188yh((C1972uh) this.f17895b.c(), (C0784Vn) this.f17896c.c());
            case 1:
                return new C0421Ah((ScheduledExecutorService) this.f17896c.c());
            case 2:
                return ((Boolean) C2841s.f23267e.f23270c.a(H9.f8839u3)).booleanValue() ? new H6((F6) this.f17896c.c()) : new H6((F6) this.f17895b.c());
            case 3:
                return new C0592Ki(((C0540Hh) this.f17895b).a(), (K7) this.f17896c.c());
            case 4:
                K7 k7 = (K7) this.f17895b.c();
                C0501Fc c0501Fc = (C0501Fc) this.f17896c.c();
                E9 e9 = H9.A6;
                C2841s c2841s = C2841s.f23267e;
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    c0623Mf = AbstractC0640Nf.f10007c;
                } else {
                    c0623Mf = ((Boolean) c2841s.f23270c.a(H9.z6)).booleanValue() ? AbstractC0640Nf.f10005a : AbstractC0640Nf.f10010f;
                }
                Cr.v(c0623Mf);
                return new C0575Ji(k7.f9454c, c0501Fc, c0623Mf);
            case 5:
                C0643Ni c0643Ni = (C0643Ni) this.f17895b.c();
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                Set setSingleton = ((JSONObject) this.f17896c.c()) == null ? Collections.EMPTY_SET : Collections.singleton(new C1922tl(c0643Ni, c0623Mf2));
                Cr.v(setSingleton);
                return setSingleton;
            case 6:
                C0643Ni c0643Ni2 = (C0643Ni) this.f17895b.c();
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                Set setSingleton2 = ((JSONObject) this.f17896c.c()) == null ? Collections.EMPTY_SET : Collections.singleton(new C1922tl(c0643Ni2, c0623Mf3));
                Cr.v(setSingleton2);
                return setSingleton2;
            case 7:
                C0643Ni c0643Ni3 = (C0643Ni) this.f17895b.c();
                C0623Mf c0623Mf4 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf4);
                Set setSingleton3 = ((JSONObject) this.f17896c.c()) == null ? Collections.EMPTY_SET : Collections.singleton(new C1922tl(c0643Ni3, c0623Mf4));
                Cr.v(setSingleton3);
                return setSingleton3;
            case 8:
                C0643Ni c0643Ni4 = (C0643Ni) this.f17895b.c();
                C0623Mf c0623Mf5 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf5);
                Set setSingleton4 = ((JSONObject) this.f17896c.c()) == null ? Collections.EMPTY_SET : Collections.singleton(new C1922tl(c0643Ni4, c0623Mf5));
                Cr.v(setSingleton4);
                return setSingleton4;
            case 9:
                return new C1485lf(((C0540Hh) this.f17895b).a(), ((C1113ek) this.f17896c).a().f13485g);
            case 10:
                return new C0508Fj((Q2.a) this.f17895b.c(), (C0470Df) this.f17896c.c());
            case 11:
                return new C0525Gj((C0576Jj) this.f17895b.c(), ((C1113ek) this.f17896c).a());
            case 12:
                return new C2771a((Context) this.f17895b.c(), (InterfaceC1054df) this.f17896c.c());
            case 13:
                return new C1922tl((C0764Uk) this.f17895b.c(), (Executor) this.f17896c.c());
            case 14:
                return new C1922tl((C0764Uk) this.f17895b.c(), (Executor) this.f17896c.c());
            case 15:
                return new C1922tl((C0764Uk) this.f17895b.c(), (Executor) this.f17896c.c());
            case 16:
                return new C1922tl((C0764Uk) this.f17895b.c(), (Executor) this.f17896c.c());
            case 17:
                return new C1922tl((C0764Uk) this.f17895b.c(), (Executor) this.f17896c.c());
            case 18:
                return new C1922tl((C0764Uk) this.f17895b.c(), (Executor) this.f17896c.c());
            case 19:
                return new C1922tl((C0764Uk) this.f17895b.c(), (Executor) this.f17896c.c());
            case 20:
                return new C1922tl((C0764Uk) this.f17895b.c(), (Executor) this.f17896c.c());
            case 21:
                return new C1485lf(((C0540Hh) this.f17895b).a(), ((C1113ek) this.f17896c).a().f13485g);
            case 22:
                return new C0561Il((C0543Hk) this.f17895b.c(), (C1761ql) this.f17896c.c());
            case 23:
                t2.u uVar = (t2.u) this.f17895b.c();
                Q2.a aVar = (Q2.a) this.f17896c.c();
                C0623Mf c0623Mf6 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf6);
                return new C0613Lm(uVar, aVar, c0623Mf6);
            case 24:
                return new C0954bo((C0852Zn) this.f17896c.c(), (String) this.f17895b.c());
            case 25:
                return new C1117eo((C1008co) this.f17895b.c(), (C0710Rh) this.f17896c.c());
            case 26:
                return new C0513Fo((C2087wo) this.f17895b.c(), (C0546Hn) this.f17896c.c());
            case 27:
                return new C0853Zo(((C0540Hh) this.f17895b).a(), (C0784Vn) this.f17896c.c());
            case 28:
                Mu mu = (Mu) this.f17895b.c();
                p2.j.f22785C.f22793f.getClass();
                CookieManager cookieManagerG = p1.e.g();
                Objects.requireNonNull(mu);
                J6 j6 = new J6(4, cookieManagerG);
                ID id = mu.f9923a;
                ED ed = Mu.f9922d;
                List list = Collections.EMPTY_LIST;
                InterfaceFutureC2326a interfaceFutureC2326aB = ((C0623Mf) id).b(j6);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                C1677p8 c1677p8 = new C1677p8(mu, Ku.WEBVIEW_COOKIE, null, ed, list, AbstractC1984ut.E(interfaceFutureC2326aB, 1L, TimeUnit.SECONDS, mu.f9924b));
                C1704pi c1704pi = new C1704pi(14);
                Mu mu2 = (Mu) c1677p8.f16142f;
                return new C1677p8(mu2, c1677p8.f16139c, (String) c1677p8.f16137a, (InterfaceFutureC2326a) c1677p8.f16138b, (List) c1677p8.f16140d, AbstractC1984ut.D((InterfaceFutureC2326a) c1677p8.f16141e, Exception.class, c1704pi, mu2.f9923a)).u();
            default:
                return new C1603np(((C0540Hh) this.f17895b).a(), (C1593nf) this.f17896c.c());
        }
    }
}
