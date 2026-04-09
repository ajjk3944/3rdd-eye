package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import q2.C2841s;
import t2.AbstractC2907C;
import u2.C2951a;

/* loaded from: classes.dex */
public final class Yr implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12714a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12715b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12716c;

    public /* synthetic */ Yr(Object obj, int i, Object obj2) {
        this.f12714a = i;
        this.f12715b = obj;
        this.f12716c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        switch (this.f12714a) {
            case 0:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8561A3)).booleanValue()) {
                    return AbstractC1984ut.e(new Tr(1, null));
                }
                C0538Hf c0538Hf = (C0538Hf) this.f12716c;
                return AbstractC1984ut.G(c0538Hf.j(), C1563n2.f15719l, (Executor) this.f12715b);
            case 1:
                return ((C0623Mf) ((ID) this.f12715b)).b(new J6(12, this));
            case 2:
                return ((C0623Mf) ((ID) this.f12715b)).b(new J6(18, this));
            case 3:
                AbstractC2907C.m("HsdpMigrationSignal.produce");
                if (!((Boolean) C2841s.f23267e.f23270c.a(H9.ae)).booleanValue()) {
                    return AbstractC1984ut.e(new C1983us(null, 1));
                }
                boolean z6 = false;
                try {
                    if (((Intent) this.f12716c).resolveActivity(((Context) this.f12715b).getPackageManager()) != null) {
                        AbstractC2907C.m("HSDP intent is supported");
                        z6 = true;
                    }
                } catch (Exception e6) {
                    p2.j.f22785C.f22795h.f("HsdpMigrationSignal.isHsdpMigrationSupported", e6);
                }
                return AbstractC1984ut.e(new C1983us(Boolean.valueOf(z6), 1));
            case 4:
                return ((C0623Mf) ((ID) this.f12715b)).b(new J6(20, this));
            case 5:
                return ((C0623Mf) ((ID) this.f12715b)).b(new J6(22, this));
            case 6:
                ED edE = AbstractC1984ut.e((String) this.f12716c);
                C1563n2 c1563n2 = C1563n2.f15721n;
                Executor executor = (Executor) this.f12715b;
                return AbstractC1984ut.D(AbstractC1984ut.G(edE, c1563n2, executor), Throwable.class, new C0738Tb(11, this), executor);
            default:
                return ((C0623Mf) ((ID) this.f12715b)).b(new Zs(1, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        switch (this.f12714a) {
            case 0:
                return 10;
            case 1:
                return 54;
            case 2:
                return 21;
            case 3:
                return 60;
            case 4:
                return 23;
            case 5:
                return 62;
            case 6:
                return 41;
            default:
                return 48;
        }
    }

    public Yr(C2951a c2951a, ID id) {
        this.f12714a = 1;
        this.f12716c = c2951a;
        this.f12715b = id;
    }
}
