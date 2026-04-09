package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lh1 extends zu1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ s62 c;

    public lh1(bu1 bu1Var, Context context, s62 s62Var) {
        this.b = context;
        this.c = s62Var;
        Objects.requireNonNull(bu1Var);
    }

    @Override // defpackage.zu1
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.zu1
    public final Object b() throws ze4 {
        IInterface xc2Var;
        Context context = this.b;
        oi0 oi0Var = new oi0(context);
        try {
            try {
                IBinder iBinderB = pu1.z(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i = yc2.f;
                if (iBinderB == null) {
                    xc2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    xc2Var = iInterfaceQueryLocalInterface instanceof zc2 ? (zc2) iInterfaceQueryLocalInterface : new xc2(iBinderB, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 2);
                }
                return ((xc2) xc2Var).l1(oi0Var, this.c);
            } catch (Exception e) {
                throw new ze4(e);
            }
        } catch (RemoteException | NullPointerException | ze4 unused) {
            return null;
        }
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        return ek2Var.c2(new oi0(this.b), this.c, ModuleDescriptor.MODULE_VERSION);
    }
}
