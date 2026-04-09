package va;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.at;
import com.google.android.gms.internal.ads.bt;
import com.google.android.gms.internal.ads.ct;
import com.google.android.gms.internal.ads.yq;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yq f36091c;

    public f(o oVar, Context context, yq yqVar) {
        this.f36090b = context;
        this.f36091c = yqVar;
    }

    @Override // va.q
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // va.q
    public final Object b() throws za.j {
        IInterface atVar;
        Context context = this.f36090b;
        vb.b bVar = new vb.b(context);
        try {
            try {
                IBinder iBinderB = za.i.b(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i4 = bt.f9795a;
                if (iBinderB == null) {
                    atVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    atVar = iInterfaceQueryLocalInterface instanceof ct ? (ct) iInterfaceQueryLocalInterface : new at(iBinderB, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 1);
                }
                return ((at) atVar).k2(bVar, this.f36091c);
            } catch (Exception e2) {
                throw new za.j(e2);
            }
        } catch (RemoteException | NullPointerException | za.j unused) {
            return null;
        }
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.w3(new vb.b(this.f36090b), this.f36091c, ModuleDescriptor.MODULE_VERSION);
    }
}
