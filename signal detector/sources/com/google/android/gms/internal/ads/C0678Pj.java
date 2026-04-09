package com.google.android.gms.internal.ads;

import android.content.Context;
import t2.C2925i;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0678Pj implements NA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10485d;

    public /* synthetic */ C0678Pj(Object obj, Object obj2, Object obj3, int i) {
        this.f10482a = i;
        this.f10483b = obj;
        this.f10484c = obj2;
        this.f10485d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.NA
    public final Object apply(Object obj) {
        switch (this.f10482a) {
            case 0:
                Qt qt = (Qt) obj;
                C2925i c2925i = new C2925i((Context) this.f10483b);
                c2925i.f23616c = qt.f10726B;
                c2925i.f23619f = qt.f10728C.toString();
                c2925i.f23618e = ((C2951a) this.f10484c).f23784a;
                c2925i.f23617d = ((C0960bu) this.f10485d).f13485g;
                return c2925i;
            case 1:
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f10483b;
                if (((Qt) this.f10484c).M) {
                    interfaceC0828Yg.A0();
                }
                C0727Sh c0727Sh = (C0727Sh) this.f10485d;
                interfaceC0828Yg.e1();
                interfaceC0828Yg.onPause();
                return c0727Sh.B();
            case 2:
                InterfaceC0828Yg interfaceC0828Yg2 = (InterfaceC0828Yg) this.f10483b;
                if (((Qt) this.f10484c).M) {
                    interfaceC0828Yg2.A0();
                }
                C0846Zh c0846Zh = (C0846Zh) this.f10485d;
                interfaceC0828Yg2.e1();
                interfaceC0828Yg2.onPause();
                return c0846Zh.B();
            default:
                InterfaceC0828Yg interfaceC0828Yg3 = (InterfaceC0828Yg) this.f10483b;
                if (((Qt) this.f10484c).M) {
                    interfaceC0828Yg3.A0();
                }
                C0948bi c0948bi = (C0948bi) this.f10485d;
                interfaceC0828Yg3.e1();
                interfaceC0828Yg3.onPause();
                return c0948bi.B();
        }
    }
}
