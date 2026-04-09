package t7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.play_billing.b3;
import com.google.android.gms.internal.play_billing.c3;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.r3;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.x2;
import com.google.android.gms.internal.play_billing.y2;
import ec.g1;
import java.util.concurrent.TimeUnit;
import me.t1;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final km.i f34468a;

    /* renamed from: b, reason: collision with root package name */
    public final pu1 f34469b;

    /* renamed from: c, reason: collision with root package name */
    public final pu1 f34470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f34471d;

    public l(a aVar, km.i iVar) {
        this.f34471d = aVar;
        t1 t1Var = aVar.B;
        this.f34469b = new pu1(t1Var);
        this.f34470c = new pu1(t1Var);
        this.f34468a = iVar;
    }

    public final Long a(boolean z3) {
        if (z3) {
            pu1 pu1Var = this.f34469b;
            if (!pu1Var.f15113b) {
                return null;
            }
            long jI = ((t1) pu1Var.f15116e).I();
            if (!pu1Var.f15113b) {
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            pu1Var.f15113b = false;
            long j = (jI - pu1Var.f15115d) + pu1Var.f15114c;
            pu1Var.f15114c = j;
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS));
        }
        pu1 pu1Var2 = this.f34470c;
        if (!pu1Var2.f15113b) {
            return null;
        }
        long jI2 = ((t1) pu1Var2.f15116e).I();
        if (!pu1Var2.f15113b) {
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        pu1Var2.f15113b = false;
        long j8 = (jI2 - pu1Var2.f15115d) + pu1Var2.f15114c;
        pu1Var2.f15114c = j8;
        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j8, TimeUnit.NANOSECONDS));
    }

    public final void b(c cVar, int i4, String str, boolean z3) {
        try {
            b3 b3VarS = c3.s();
            int i10 = cVar.f34435a;
            b3VarS.d();
            c3.r((c3) b3VarS.f20201b, i10);
            String str2 = cVar.f34437c;
            b3VarS.d();
            c3.o((c3) b3VarS.f20201b, str2);
            b3VarS.d();
            c3.q((c3) b3VarS.f20201b, i4);
            if (str != null) {
                b3VarS.d();
                c3.n((c3) b3VarS.f20201b, str);
            }
            Long lA = a(z3);
            a aVar = this.f34471d;
            if (!z3) {
                r3 r3VarP = s3.p();
                r3VarP.d();
                s3.n((s3) r3VarP.f20201b, (c3) b3VarS.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    r3VarP.d();
                    s3.o((s3) r3VarP.f20201b, jLongValue);
                }
                aVar.f34415h.H((s3) r3VarP.a());
                return;
            }
            u3 u3VarR = v3.r();
            u3VarR.e(false);
            u3VarR.f();
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                u3VarR.d();
                v3.p((v3) u3VarR.f20201b, jLongValue2);
            }
            x2 x2VarU = y2.u();
            x2VarU.e(b3VarS);
            x2VarU.d();
            y2.t((y2) x2VarU.f20201b, 6);
            x2VarU.f(u3VarR);
            aVar.k((y2) x2VarU.a());
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(c cVar) {
        a aVar = this.f34471d;
        synchronized (aVar.f34409a) {
            try {
                if (aVar.f34410b == 3) {
                    return;
                }
                try {
                    this.f34468a.t(cVar);
                } catch (Throwable th2) {
                    u.i("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        u.h("BillingClient", "Billing service died.");
        try {
            a aVar = this.f34471d;
            if (a.t(aVar)) {
                km.n nVar = aVar.f34415h;
                x2 x2VarU = y2.u();
                x2VarU.d();
                y2.t((y2) x2VarU.f20201b, 6);
                b3 b3VarS = c3.s();
                b3VarS.d();
                c3.q((c3) b3VarS.f20201b, 110);
                x2VarU.e(b3VarS);
                u3 u3VarR = v3.r();
                u3VarR.e(false);
                u3VarR.f();
                x2VarU.f(u3VarR);
                nVar.C((y2) x2VarU.a());
            } else {
                aVar.f34415h.G(d3.n());
            }
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
        a aVar2 = this.f34471d;
        synchronized (aVar2.f34409a) {
            if (aVar2.f34410b != 3 && aVar2.f34410b != 0) {
                aVar2.n(0);
                aVar2.p();
                try {
                    this.f34468a.r();
                } catch (Throwable th3) {
                    u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.c aVar;
        u.g("BillingClient", "Billing service connected.");
        a aVar2 = this.f34471d;
        synchronized (aVar2.f34409a) {
            try {
                if (aVar2.f34410b == 3) {
                    return;
                }
                int i4 = com.google.android.gms.internal.play_billing.b.f20084b;
                if (iBinder == null) {
                    aVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    aVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.c ? (com.google.android.gms.internal.play_billing.c) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.a(iBinder, "com.android.vending.billing.IInAppBillingService", 3);
                }
                aVar2.f34416i = aVar;
                if (a.h(new g1(3, this), 30000L, new o1(8, this), aVar2.u(), aVar2.g()) == null) {
                    c cVarX = aVar2.x();
                    aVar2.m(25, cVarX);
                    c(cVarX);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        u.h("BillingClient", "Billing service disconnected.");
        try {
            a aVar = this.f34471d;
            if (a.t(aVar)) {
                km.n nVar = aVar.f34415h;
                x2 x2VarU = y2.u();
                x2VarU.d();
                y2.t((y2) x2VarU.f20201b, 6);
                b3 b3VarS = c3.s();
                b3VarS.d();
                c3.q((c3) b3VarS.f20201b, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
                x2VarU.e(b3VarS);
                u3 u3VarR = v3.r();
                u3VarR.e(false);
                u3VarR.f();
                x2VarU.f(u3VarR);
                nVar.C((y2) x2VarU.a());
            } else {
                aVar.f34415h.I(t3.n());
            }
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
        pu1 pu1Var = this.f34470c;
        pu1Var.f15114c = 0L;
        pu1Var.f15113b = false;
        pu1Var.c();
        a aVar2 = this.f34471d;
        synchronized (aVar2.f34409a) {
            try {
                if (aVar2.f34410b == 3) {
                    return;
                }
                aVar2.n(0);
                try {
                    this.f34468a.r();
                } catch (Throwable th3) {
                    u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } finally {
            }
        }
    }
}
