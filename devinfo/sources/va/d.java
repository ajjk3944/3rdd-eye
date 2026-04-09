package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.yq;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f36051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yq f36052c;

    public d(o oVar, OutOfContextTestingActivity outOfContextTestingActivity, yq yqVar) {
        this.f36051b = outOfContextTestingActivity;
        this.f36052c = yqVar;
        Objects.requireNonNull(oVar);
    }

    @Override // va.q
    public final /* bridge */ /* synthetic */ Object a() {
        o.t(this.f36051b, "out_of_context_tester");
        return null;
    }

    @Override // va.q
    public final Object b() throws za.j {
        u1 u1Var;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f36051b;
        vb.b bVar = new vb.b(outOfContextTestingActivity);
        sk.a(outOfContextTestingActivity);
        if (((Boolean) s.f36163e.f36166c.a(sk.Ga)).booleanValue()) {
            try {
                try {
                    IBinder iBinderB = za.i.b(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (iBinderB == null) {
                        u1Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        u1Var = iInterfaceQueryLocalInterface instanceof u1 ? (u1) iInterfaceQueryLocalInterface : new u1(iBinderB, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 1);
                    }
                    return u1Var.k2(bVar, this.f36052c);
                } catch (Exception e2) {
                    throw new za.j(e2);
                }
            } catch (RemoteException e10) {
                e = e10;
                ut.a(outOfContextTestingActivity).d("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                ut.a(outOfContextTestingActivity).d("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (za.j e12) {
                e = e12;
                ut.a(outOfContextTestingActivity).d("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f36051b;
        vb.b bVar = new vb.b(outOfContextTestingActivity);
        sk.a(outOfContextTestingActivity);
        if (((Boolean) s.f36163e.f36166c.a(sk.Ga)).booleanValue()) {
            return x0Var.g0(bVar, this.f36052c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
