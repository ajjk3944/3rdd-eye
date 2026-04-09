package Nc;

import Nc.a;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import inet.ipaddr.g;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* loaded from: classes4.dex */
public final class e implements Nc.a {

    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f16385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f16386b;

        public a(g gVar, e eVar) {
            this.f16385a = gVar;
            this.f16386b = eVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                Sg.g gVarF = Sg.g.f(String.valueOf(this.f16385a));
                e eVar = this.f16386b;
                AbstractC6492s.f(gVarF);
                String strD = eVar.d(gVarF);
                if (strD == null) {
                    strD = "";
                }
                a.AbstractC0591a.b bVar = new a.AbstractC0591a.b(strD, gVarF.j());
                Z7.b.h("Found Netbios result for " + this.f16385a + " - " + bVar.a() + " on " + Thread.currentThread().getName(), null, 2, null);
                interfaceC5910A.onSuccess(bVar);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(Sg.g gVar) {
        String strE;
        try {
            String strE2 = gVar.e();
            if (strE2 != null && (strE = e(strE2)) != null) {
                return strE;
            }
            String strR = gVar.r();
            if (strR != null) {
                return e(strR);
            }
            return null;
        } catch (NullPointerException e10) {
            Z7.b.e("Netbios name resolution failed", e10, null, 4, null);
            return null;
        }
    }

    private final String e(String str) {
        if (t.m0(str) || t.P(str, "*SMBSERVER", false, 2, null)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a.AbstractC0591a f(Throwable error) {
        AbstractC6492s.i(error, "error");
        if (!(error instanceof UnknownHostException) && !(error instanceof TimeoutException)) {
            Z7.b.f(error, null, 2, null);
        }
        return new a.AbstractC0591a.C0592a(error);
    }

    @Override // Nc.a
    public z a(g ipAddress, long j10) {
        AbstractC6492s.i(ipAddress, "ipAddress");
        z zVarI = z.i(new a(ipAddress, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarG = zVarI.Q(j10, TimeUnit.MILLISECONDS).G(new n() { // from class: Nc.d
            @Override // kg.n
            public final Object apply(Object obj) {
                return e.f((Throwable) obj);
            }
        });
        AbstractC6492s.h(zVarG, "onErrorReturn(...)");
        return zVarG;
    }
}
