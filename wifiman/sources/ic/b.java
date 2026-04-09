package Ic;

import Ic.a;
import Zc.e;
import Zc.f;
import Zg.AbstractC3689v;
import gg.i;
import inet.ipaddr.g;
import java.util.List;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class b implements Ic.a {

    /* renamed from: a, reason: collision with root package name */
    private final i f9042a;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9043a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(e networkConnection) {
            List listE;
            AbstractC6492s.i(networkConnection, "networkConnection");
            e.a aVarB = networkConnection.b();
            if (aVarB == null) {
                aVarB = networkConnection.c();
            }
            if (aVarB != null) {
                g gVarA = aVarB.a();
                if (gVarA != null) {
                    listE = AbstractC3689v.e(new a.C0369a(gVarA, System.currentTimeMillis(), Long.MAX_VALUE, Integer.valueOf(aVarB.c())));
                } else {
                    listE = null;
                }
                if (listE != null) {
                    return listE;
                }
            }
            return AbstractC3689v.l();
        }
    }

    public b(f networkConnectionManager) {
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        i iVarI2 = networkConnectionManager.getState().N0(a.f9043a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f9042a = iVarI2;
    }

    @Override // Ec.t
    public i b() {
        return this.f9042a;
    }
}
