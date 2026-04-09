package va;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.an;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.en;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.vt;
import com.google.android.gms.internal.ads.yn;
import com.google.android.gms.internal.ads.zm;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb.e f36140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f36141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f36142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f36143e;

    public n(o oVar, eb.e eVar, FrameLayout frameLayout, Context context) {
        this.f36140b = eVar;
        this.f36141c = frameLayout;
        this.f36142d = context;
        Objects.requireNonNull(oVar);
        this.f36143e = oVar;
    }

    @Override // va.q
    public final Object a() {
        o.t(this.f36142d, "native_ad_view_delegate");
        return new q2();
    }

    @Override // va.q
    public final Object b() throws za.j {
        IInterface cnVar;
        Context context = this.f36142d;
        sk.a(context);
        boolean zBooleanValue = ((Boolean) s.f36163e.f36166c.a(sk.Vb)).booleanValue();
        o oVar = this.f36143e;
        FrameLayout frameLayout = this.f36141c;
        eb.e eVar = this.f36140b;
        if (!zBooleanValue) {
            yn ynVar = (yn) oVar.f36149e;
            try {
                vb.b bVar = new vb.b(context);
                vb.b bVar2 = new vb.b(eVar);
                vb.b bVar3 = new vb.b(frameLayout);
                cn cnVar2 = (cn) ((en) ynVar.k(context));
                Parcel parcelT = cnVar2.T();
                ng.e(parcelT, bVar);
                ng.e(parcelT, bVar2);
                ng.e(parcelT, bVar3);
                parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelR0 = cnVar2.r0(parcelT, 1);
                IBinder strongBinder = parcelR0.readStrongBinder();
                parcelR0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface instanceof bn ? (bn) iInterfaceQueryLocalInterface : new zm(strongBinder);
            } catch (RemoteException e2) {
                e = e2;
                za.i.i("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (vb.c e10) {
                e = e10;
                za.i.i("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            vb.b bVar4 = new vb.b(context);
            vb.b bVar5 = new vb.b(eVar);
            vb.b bVar6 = new vb.b(frameLayout);
            try {
                IBinder iBinderB = za.i.b(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i4 = dn.f10524a;
                if (iBinderB == null) {
                    cnVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    cnVar = iInterfaceQueryLocalInterface2 instanceof en ? (en) iInterfaceQueryLocalInterface2 : new cn(iBinderB);
                }
                cn cnVar3 = (cn) cnVar;
                Parcel parcelT2 = cnVar3.T();
                ng.e(parcelT2, bVar4);
                ng.e(parcelT2, bVar5);
                ng.e(parcelT2, bVar6);
                parcelT2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelR02 = cnVar3.r0(parcelT2, 1);
                IBinder strongBinder2 = parcelR02.readStrongBinder();
                parcelR02.recycle();
                int i10 = an.f9366a;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface3 instanceof bn ? (bn) iInterfaceQueryLocalInterface3 : new zm(strongBinder2);
            } catch (Exception e11) {
                throw new za.j(e11);
            }
        } catch (RemoteException | NullPointerException | za.j e12) {
            vt vtVarA = ut.a(context);
            oVar.getClass();
            vtVarA.d("ClientApiBroker.createNativeAdViewDelegate", e12);
            return null;
        }
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.s3(new vb.b(this.f36140b), new vb.b(this.f36141c));
    }
}
