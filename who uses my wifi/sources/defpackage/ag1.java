package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ag1 extends zu1 {
    public final /* synthetic */ OutOfContextTestingActivity b;
    public final /* synthetic */ s62 c;

    public ag1(bu1 bu1Var, OutOfContextTestingActivity outOfContextTestingActivity, s62 s62Var) {
        this.b = outOfContextTestingActivity;
        this.c = s62Var;
        Objects.requireNonNull(bu1Var);
    }

    @Override // defpackage.zu1
    public final /* bridge */ /* synthetic */ Object a() {
        bu1.F(this.b, "out_of_context_tester");
        return null;
    }

    @Override // defpackage.zu1
    public final Object b() throws ze4 {
        dw2 dw2Var;
        OutOfContextTestingActivity outOfContextTestingActivity = this.b;
        oi0 oi0Var = new oi0(outOfContextTestingActivity);
        mz1.a(outOfContextTestingActivity);
        if (((Boolean) tw1.e.c.a(mz1.ha)).booleanValue()) {
            try {
                try {
                    IBinder iBinderB = pu1.z(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (iBinderB == null) {
                        dw2Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        dw2Var = iInterfaceQueryLocalInterface instanceof dw2 ? (dw2) iInterfaceQueryLocalInterface : new dw2(iBinderB, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 2);
                    }
                    return dw2Var.l1(oi0Var, this.c);
                } catch (Exception e) {
                    throw new ze4(e);
                }
            } catch (RemoteException e2) {
                e = e2;
                r92.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                r92.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (ze4 e4) {
                e = e4;
                r92.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.b;
        oi0 oi0Var = new oi0(outOfContextTestingActivity);
        mz1.a(outOfContextTestingActivity);
        if (((Boolean) tw1.e.c.a(mz1.ha)).booleanValue()) {
            return ek2Var.Y0(oi0Var, this.c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
