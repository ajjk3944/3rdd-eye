package va;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ow;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.yq;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yq f36069c;

    public e(o oVar, Context context, yq yqVar) {
        this.f36068b = context;
        this.f36069c = yqVar;
        Objects.requireNonNull(oVar);
    }

    @Override // va.q
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // va.q
    public final Object b() throws za.j {
        qw owVar;
        Context context = this.f36068b;
        vb.b bVar = new vb.b(context);
        try {
            try {
                IBinder iBinderB = za.i.b(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i4 = pw.f15125a;
                if (iBinderB == null) {
                    owVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    owVar = iInterfaceQueryLocalInterface instanceof qw ? (qw) iInterfaceQueryLocalInterface : new ow(iBinderB, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 1);
                }
                return ((ow) owVar).k2(bVar, this.f36069c);
            } catch (Exception e2) {
                throw new za.j(e2);
            }
        } catch (RemoteException | NullPointerException | za.j unused) {
            return null;
        }
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.N3(new vb.b(this.f36068b), this.f36069c, ModuleDescriptor.MODULE_VERSION);
    }
}
