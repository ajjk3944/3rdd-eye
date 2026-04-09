package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Pn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682Pn implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10504a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f10505b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f10506c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f10507d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f10508e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f10509f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2069wN f10510g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2069wN f10511h;

    public C0682Pn(C0540Hh c0540Hh, C0642Nh c0642Nh, C1799rN c1799rN, C1799rN c1799rN2, C0523Gh c0523Gh, C1799rN c1799rN3, C1799rN c1799rN4) {
        this.f10504a = 3;
        this.f10509f = c0540Hh;
        this.f10510g = c0642Nh;
        this.f10505b = c1799rN;
        this.f10506c = c1799rN2;
        this.f10511h = c0523Gh;
        this.f10507d = c1799rN3;
        this.f10508e = c1799rN4;
    }

    public C1873sq a() {
        return new C1873sq((C0795Wh) ((C1907tN) this.f10509f).f16902a, (Context) this.f10505b.c(), (Executor) this.f10506c.c(), (C0427An) this.f10507d.c(), ((C1113ek) this.f10510g).a(), (NA) this.f10508e.c(), (C0750Tn) this.f10511h.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f10504a) {
            case 0:
                return new C0665On(((C0540Hh) this.f10505b).a(), (C1286hu) this.f10506c.c(), (C0784Vn) this.f10507d.c(), ((C2190yj) this.f10509f).b(), ((C2190yj) this.f10510g).a(), (C0633Mp) this.f10508e.c(), (String) ((InterfaceC1853sN) this.f10511h).c());
            case 1:
                return a();
            case 2:
                C0693Qh c0693Qh = (C0693Qh) ((C1907tN) this.f10509f).f16902a;
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C0532Gq(c0693Qh, c0623Mf, ((C1271hf) this.f10510g).b(), (C1446ku) this.f10505b.c(), (C1709pn) this.f10506c.c(), (C0750Tn) this.f10507d.c(), ((C0642Nh) this.f10508e).a(), (Context) this.f10511h.c(), new W9(17));
            case 3:
                return new Nv(((C0540Hh) this.f10509f).a(), ((C0642Nh) this.f10510g).a(), (ScheduledExecutorService) this.f10505b.c(), (Hu) this.f10506c.c(), C1338iu.o(((C0523Gh) this.f10511h).f8418b.a()), (Q2.a) this.f10507d.c(), (Av) this.f10508e.c());
            case 4:
                return new Ux((C2205yy) this.f10505b.c(), (Qy) this.f10506c.c(), (C1355jA) this.f10507d.c(), (C1948uA) this.f10508e.c(), (InterfaceC1666oy) this.f10509f.c(), C1799rN.b(this.f10510g), (Xx) ((C1907tN) this.f10511h).f16902a);
            case 5:
                return new Sy((ExecutorService) this.f10505b.c(), C1799rN.b(this.f10506c), C1799rN.b(this.f10507d), (C1355jA) this.f10508e.c(), C1799rN.b(this.f10509f), (Yx) this.f10510g, (Xx) this.f10511h.c());
            default:
                return new C1667oz((S5) ((C1907tN) this.f10509f).f16902a, (C1291hz) this.f10505b.c(), (Map) ((C1907tN) this.f10510g).f16902a, (Context) this.f10506c.c(), (EnumC1450ky) ((C1907tN) this.f10511h).f16902a, (Xx) this.f10507d.c(), (C1948uA) this.f10508e.c());
        }
    }

    public C0682Pn(C0540Hh c0540Hh, C1799rN c1799rN, C1799rN c1799rN2, C2190yj c2190yj, C2190yj c2190yj2, C1799rN c1799rN3, InterfaceC1853sN interfaceC1853sN) {
        this.f10504a = 0;
        this.f10505b = c0540Hh;
        this.f10506c = c1799rN;
        this.f10507d = c1799rN2;
        this.f10509f = c2190yj;
        this.f10510g = c2190yj2;
        this.f10508e = c1799rN3;
        this.f10511h = interfaceC1853sN;
    }

    public C0682Pn(C1907tN c1907tN, C1271hf c1271hf, InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, InterfaceC2069wN interfaceC2069wN4, InterfaceC2069wN interfaceC2069wN5) {
        this.f10504a = 2;
        this.f10509f = c1907tN;
        this.f10510g = c1271hf;
        this.f10505b = interfaceC2069wN;
        this.f10506c = interfaceC2069wN2;
        this.f10507d = interfaceC2069wN3;
        this.f10508e = interfaceC2069wN4;
        this.f10511h = interfaceC2069wN5;
    }

    public C0682Pn(C1907tN c1907tN, C1799rN c1799rN, C1907tN c1907tN2, C1907tN c1907tN3, C1907tN c1907tN4, C1907tN c1907tN5, C1799rN c1799rN2) {
        this.f10504a = 6;
        this.f10509f = c1907tN;
        this.f10505b = c1799rN;
        this.f10510g = c1907tN2;
        this.f10506c = c1907tN3;
        this.f10511h = c1907tN4;
        this.f10507d = c1907tN5;
        this.f10508e = c1799rN2;
    }

    public C0682Pn(C1907tN c1907tN, InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, C1113ek c1113ek, InterfaceC2069wN interfaceC2069wN4, InterfaceC2069wN interfaceC2069wN5) {
        this.f10504a = 1;
        this.f10509f = c1907tN;
        this.f10505b = interfaceC2069wN;
        this.f10506c = interfaceC2069wN2;
        this.f10507d = interfaceC2069wN3;
        this.f10510g = c1113ek;
        this.f10508e = interfaceC2069wN4;
        this.f10511h = interfaceC2069wN5;
    }

    public /* synthetic */ C0682Pn(Object obj, C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, C1799rN c1799rN4, InterfaceC2069wN interfaceC2069wN, C1907tN c1907tN, int i) {
        this.f10504a = i;
        this.f10505b = (InterfaceC2069wN) obj;
        this.f10506c = c1799rN;
        this.f10507d = c1799rN2;
        this.f10508e = c1799rN3;
        this.f10509f = c1799rN4;
        this.f10510g = interfaceC2069wN;
        this.f10511h = c1907tN;
    }
}
