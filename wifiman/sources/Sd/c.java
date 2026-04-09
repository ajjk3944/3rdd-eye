package Sd;

import Zg.d0;
import com.ui.wifiman.model.ubiquiti.console.e;
import ee.C5458d;
import fe.u;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.i;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kg.InterfaceC6464a;
import kg.n;
import kh.C6470a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class c implements Sd.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20465c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Nb.a f20466a;

    /* renamed from: b, reason: collision with root package name */
    private final u f20467b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Nb.c cVar = (Nb.c) c6556a.a();
            if ((cVar != null ? cVar.a() : null) == null) {
                return d0.e();
            }
            c cVar2 = c.this;
            Set setB = d0.b();
            List listA = cVar.a();
            AbstractC6492s.f(listA);
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                X509Certificate x509CertificateE = cVar2.e((String) it.next());
                if (x509CertificateE != null) {
                    setB.add(x509CertificateE);
                }
            }
            return d0.a(setB);
        }
    }

    /* renamed from: Sd.c$c, reason: collision with other inner class name */
    public static final class C0738c implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20470b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f20471c;

        public C0738c(String str, Set set) {
            this.f20470b = str;
            this.f20471c = set;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Nb.a aVar = c.this.f20466a;
                String str = this.f20470b;
                Set set = this.f20471c;
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String strF = c.this.f((X509Certificate) it.next());
                    if (strF != null) {
                        arrayList.add(strF);
                    }
                }
                aVar.a(new Nb.c(str, true, arrayList));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public c(Nb.a dao, u schedulers) {
        AbstractC6492s.i(dao, "dao");
        AbstractC6492s.i(schedulers, "schedulers");
        this.f20466a = dao;
        this.f20467b = schedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str) {
        Z7.b.g("Trusted certs for " + e.b.l(str) + " set", "LocalConsoleCertMgr");
    }

    @Override // Sd.a
    public AbstractC5912b a(final String consoleId, Set certs) {
        AbstractC6492s.i(consoleId, "consoleId");
        AbstractC6492s.i(certs, "certs");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C0738c(consoleId, certs));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.x(new InterfaceC6464a() { // from class: Sd.b
            @Override // kg.InterfaceC6464a
            public final void run() {
                c.g(consoleId);
            }
        }).W(this.f20467b.b()).L(this.f20467b.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // Sd.a
    public i b(String consoleId) {
        AbstractC6492s.i(consoleId, "consoleId");
        i iVarW = this.f20466a.c(consoleId).F1(this.f20467b.b()).X0(this.f20467b.a()).N0(new b()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        return iVarW;
    }

    public final X509Certificate e(String certStr) {
        AbstractC6492s.i(certStr, "certStr");
        try {
            return C5458d.f46380a.a(C6470a.g(C6470a.f51470d, certStr, 0, 0, 6, null));
        } catch (IllegalArgumentException e10) {
            Z7.b.c("Failed to decode cert", e10, "LocalConsoleCertMgr");
            return null;
        } catch (IndexOutOfBoundsException e11) {
            Z7.b.c("Failed to decode cert", e11, "LocalConsoleCertMgr");
            return null;
        } catch (CertificateException e12) {
            Z7.b.c("Failed to decode cert", e12, "LocalConsoleCertMgr");
            return null;
        }
    }

    public final String f(X509Certificate cert) {
        AbstractC6492s.i(cert, "cert");
        try {
            return C6470a.l(C6470a.f51470d, C5458d.f46380a.b(cert), 0, 0, 6, null);
        } catch (IllegalArgumentException e10) {
            Z7.b.c("Failed to encode cert", e10, "LocalConsoleCertMgr");
            return null;
        } catch (IndexOutOfBoundsException e11) {
            Z7.b.c("Failed to encode cert", e11, "LocalConsoleCertMgr");
            return null;
        }
    }
}
