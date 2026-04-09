package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.wq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2089wq implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17498f;

    public /* synthetic */ C2089wq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f17493a = i;
        this.f17494b = obj;
        this.f17495c = obj2;
        this.f17496d = obj3;
        this.f17497e = obj4;
        this.f17498f = obj5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) {
        OC ocC;
        switch (this.f17493a) {
            case 0:
                C2143xq c2143xq = (C2143xq) this.f17494b;
                Uri uri = (Uri) this.f17495c;
                Xt xt = (Xt) this.f17496d;
                Qt qt = (Qt) this.f17497e;
                St st = (St) this.f17498f;
                try {
                    Intent intent = new C0855Zq().a().f23314a;
                    intent.setData(uri);
                    s2.e eVar = new s2.e(intent, null);
                    C0657Of c0657Of = new C0657Of();
                    C0893ai c0893ai = (C0893ai) c2143xq.f17632c;
                    C0846Zh c0846Zh = new C0846Zh(c0893ai.f13187b, c0893ai.f13188c, new C1338iu(xt, qt, (String) null), new C0697Ql(new C1338iu(c2143xq, c0657Of, qt, 22), 16, (Object) null));
                    c0657Of.b(new AdOverlayInfoParcel(eVar, null, (C0543Hk) c0846Zh.f12931V.c(), null, new C2951a(0, 0, false), null, null, st.f11269b));
                    ((Pt) c2143xq.f17634e).d(2, 3);
                    return AbstractC1984ut.e(c0846Zh.B());
                } catch (Throwable th) {
                    u2.k.f("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            default:
                C1677p8 c1677p8 = (C1677p8) this.f17494b;
                C0697Ql c0697Ql = (C0697Ql) this.f17495c;
                C1769qt c1769qt = (C1769qt) this.f17496d;
                At at = (At) this.f17497e;
                InterfaceC0848Zj interfaceC0848Zj = (InterfaceC0848Zj) this.f17498f;
                C1876st c1876st = (C1876st) obj;
                if (c1876st != null) {
                    C1769qt c1769qt2 = new C1769qt(c1769qt.f16414a, c1769qt.f16415b, c1769qt.f16416c, c1769qt.f16417d, c1769qt.f16418e, c1769qt.f16419f, c1876st.f16815a);
                    C1877su c1877su = c1876st.f16817c;
                    if (c1877su != null) {
                        c1677p8.f16141e = null;
                        ((C1184g) c1677p8.f16139c).a(c1769qt2);
                        return c1677p8.r(c1877su, c0697Ql);
                    }
                    C1184g c1184g = (C1184g) c1677p8.f16139c;
                    synchronized (c1184g) {
                        c1184g.f14179a = 2;
                        ocC = c1184g.i() ? null : ((C0907aw) c1184g.f14183e).c(c1769qt2);
                    }
                    if (ocC != null) {
                        c1677p8.f16141e = null;
                        return AbstractC1984ut.F(ocC, new C0738Tb(12, c1677p8), (Executor) c1677p8.f16142f);
                    }
                    c1184g.a(c1769qt2);
                    c0697Ql = new C0697Ql(c0697Ql.f10692c, (Object) c1876st.f16816b, 27, false);
                }
                InterfaceFutureC2326a interfaceFutureC2326aN = ((C0889ae) c1677p8.f16137a).n(c0697Ql, at, interfaceC0848Zj);
                c1677p8.f16141e = interfaceC0848Zj;
                return interfaceFutureC2326aN;
        }
    }
}
