package qd;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.a3;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.u;
import j$.util.Objects;
import t7.o;
import t7.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32255b;

    public /* synthetic */ m(int i4, Object obj) {
        this.f32254a = i4;
        this.f32255b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.g eVar;
        switch (this.f32254a) {
            case 0:
                n nVar = (n) this.f32255b;
                nVar.f32258b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                nVar.a().post(new l(this, iBinder));
                break;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                o oVar = (o) this.f32255b;
                int i4 = com.google.android.gms.internal.play_billing.f.f20116b;
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    eVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.g ? (com.google.android.gms.internal.play_billing.g) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
                }
                oVar.E = eVar;
                oVar.D = 2;
                int i10 = p.f34476a;
                a3 a3VarC = p.c(26, e3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(a3VarC, "ApiSuccess should not be null");
                km.n nVar2 = oVar.f34415h;
                nVar2.getClass();
                try {
                    nVar2.K(a3VarC, (h3) nVar2.f28442b);
                    break;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f32254a) {
            case 0:
                n nVar = (n) this.f32255b;
                nVar.f32258b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                nVar.a().post(new k(1, this));
                break;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                o oVar = (o) this.f32255b;
                oVar.E = null;
                oVar.D = 0;
                break;
        }
    }
}
