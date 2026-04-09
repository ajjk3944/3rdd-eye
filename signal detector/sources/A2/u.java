package A2;

import android.os.Binder;
import com.google.android.gms.internal.ads.AbstractC1911ta;
import com.google.android.gms.internal.ads.AbstractC1984ut;
import com.google.android.gms.internal.ads.AbstractC2221zD;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.C0900ap;
import com.google.android.gms.internal.ads.C1227gp;
import com.google.android.gms.internal.ads.C1726q3;
import com.google.android.gms.internal.ads.C1765qp;
import com.google.android.gms.internal.ads.C1807re;
import com.google.android.gms.internal.ads.CallableC1890t6;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.ID;
import com.google.android.gms.internal.ads.InterfaceC1736qD;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q2.C2841s;
import t2.C2911G;

/* loaded from: classes.dex */
public final class u implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f336a;

    /* renamed from: b, reason: collision with root package name */
    public final C1726q3 f337b;

    public u(C0623Mf c0623Mf, C1726q3 c1726q3) {
        this.f336a = c0623Mf;
        this.f337b = c1726q3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) {
        InterfaceFutureC2326a interfaceFutureC2326aB;
        C1807re c1807re = (C1807re) obj;
        String str = c1807re.f16579d;
        C2911G c2911g = p2.j.f22785C.f22790c;
        boolean zF = C2911G.f(str);
        C1726q3 c1726q3 = this.f337b;
        if (zF) {
            interfaceFutureC2326aB = AbstractC1984ut.w(new C1765qp(1));
        } else {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.m8)).booleanValue() || ((Boolean) AbstractC1911ta.f16932a.v()).booleanValue()) {
                interfaceFutureC2326aB = ((C0623Mf) ((ID) c1726q3.f16314d)).b(new CallableC1890t6(c1726q3, 6, c1807re));
            } else {
                interfaceFutureC2326aB = ((C1227gp) c1726q3.f16315e).d(c1807re);
            }
        }
        return AbstractC1984ut.F(AbstractC1984ut.D((AbstractC2221zD) AbstractC1984ut.E(AbstractC2221zD.r(interfaceFutureC2326aB), ((Integer) C2841s.f23267e.f23270c.a(H9.t6)).intValue(), TimeUnit.SECONDS, (ScheduledExecutorService) c1726q3.f16312b), Throwable.class, new C0900ap(c1726q3, c1807re, Binder.getCallingUid(), 1), (ID) c1726q3.f16313c), new C0120h(2, c1807re), this.f336a);
    }
}
