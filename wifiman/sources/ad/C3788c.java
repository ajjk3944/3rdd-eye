package ad;

import Yg.s;
import Yg.z;
import ad.InterfaceC3786a;
import android.net.Network;
import gg.C;
import gg.InterfaceC5910A;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ad.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3788c implements InterfaceC3786a {

    /* renamed from: ad.c$a */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Network f25947a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25948b;

        public a(Network network, String str) {
            this.f25947a = network;
            this.f25948b = str;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Network network = this.f25947a;
                interfaceC5910A.onSuccess(z.a(Integer.valueOf((int) (System.currentTimeMillis() - jCurrentTimeMillis)), network != null ? network.getByName(this.f25948b) : InetAddress.getByName(this.f25948b)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: ad.c$b */
    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25949a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3786a.AbstractC0997a apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            return new InterfaceC3786a.AbstractC0997a.b((InetAddress) sVar.c(), ((Number) sVar.a()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3786a.AbstractC0997a c(Throwable error) {
        AbstractC6492s.i(error, "error");
        if (error instanceof UnknownHostException) {
            return InterfaceC3786a.AbstractC0997a.AbstractC0998a.C0999a.f25943a;
        }
        if (error instanceof TimeoutException) {
            return InterfaceC3786a.AbstractC0997a.AbstractC0998a.b.f25944a;
        }
        throw new IllegalStateException("Unexpected error in dns resolver", error);
    }

    @Override // ad.InterfaceC3786a
    public gg.z a(String hostname, int i10, Network network) {
        AbstractC6492s.i(hostname, "hostname");
        gg.z zVarI = gg.z.i(new a(network, hostname));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.z zVarE = zVarI.A(b.f25949a).Q(i10, TimeUnit.MILLISECONDS).G(new n() { // from class: ad.b
            @Override // kg.n
            public final Object apply(Object obj) {
                return C3788c.c((Throwable) obj);
            }
        }).O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        return zVarE;
    }
}
