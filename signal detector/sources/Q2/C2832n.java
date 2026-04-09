package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC0686Qa;
import com.google.android.gms.internal.ads.AbstractBinderC0737Ta;
import com.google.android.gms.internal.ads.C0669Pa;
import com.google.android.gms.internal.ads.C0720Sa;
import com.google.android.gms.internal.ads.C1053de;
import com.google.android.gms.internal.ads.C1643ob;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC0703Ra;
import com.google.android.gms.internal.ads.InterfaceC0754Ua;
import com.google.android.gms.internal.ads.InterfaceC1107ee;
import j$.util.Objects;

/* renamed from: q2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2832n extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdView f23247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f23248c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f23249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2834o f23250e;

    public C2832n(C2834o c2834o, NativeAdView nativeAdView, FrameLayout frameLayout, Context context) {
        this.f23247b = nativeAdView;
        this.f23248c = frameLayout;
        this.f23249d = context;
        Objects.requireNonNull(c2834o);
        this.f23250e = c2834o;
    }

    @Override // q2.AbstractC2838q
    public final Object a() {
        C2834o.h(this.f23249d, "native_ad_view_delegate");
        return new R0();
    }

    @Override // q2.AbstractC2838q
    public final Object b() throws u2.l {
        IInterface c0720Sa;
        Context context = this.f23249d;
        H9.a(context);
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.Tb)).booleanValue();
        C2834o c2834o = this.f23250e;
        FrameLayout frameLayout = this.f23248c;
        NativeAdView nativeAdView = this.f23247b;
        if (!zBooleanValue) {
            C1643ob c1643ob = (C1643ob) c2834o.f23255e;
            try {
                S2.b bVar = new S2.b(context);
                S2.b bVar2 = new S2.b(nativeAdView);
                S2.b bVar3 = new S2.b(frameLayout);
                C0720Sa c0720Sa2 = (C0720Sa) ((InterfaceC0754Ua) c1643ob.l(context));
                Parcel parcelH0 = c0720Sa2.h0();
                C7.e(parcelH0, bVar);
                C7.e(parcelH0, bVar2);
                C7.e(parcelH0, bVar3);
                parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelK0 = c0720Sa2.k0(parcelH0, 1);
                IBinder strongBinder = parcelK0.readStrongBinder();
                parcelK0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface instanceof InterfaceC0703Ra ? (InterfaceC0703Ra) iInterfaceQueryLocalInterface : new C0669Pa(strongBinder);
            } catch (S2.c e6) {
                e = e6;
                u2.k.i("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (RemoteException e7) {
                e = e7;
                u2.k.i("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            S2.b bVar4 = new S2.b(context);
            S2.b bVar5 = new S2.b(nativeAdView);
            S2.b bVar6 = new S2.b(frameLayout);
            try {
                IBinder iBinderB = u2.k.b(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i = AbstractBinderC0737Ta.f11412a;
                if (iBinderB == null) {
                    c0720Sa = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    c0720Sa = iInterfaceQueryLocalInterface2 instanceof InterfaceC0754Ua ? (InterfaceC0754Ua) iInterfaceQueryLocalInterface2 : new C0720Sa(iBinderB);
                }
                C0720Sa c0720Sa3 = (C0720Sa) c0720Sa;
                Parcel parcelH02 = c0720Sa3.h0();
                C7.e(parcelH02, bVar4);
                C7.e(parcelH02, bVar5);
                C7.e(parcelH02, bVar6);
                parcelH02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelK02 = c0720Sa3.k0(parcelH02, 1);
                IBinder strongBinder2 = parcelK02.readStrongBinder();
                parcelK02.recycle();
                int i3 = AbstractBinderC0686Qa.f10621a;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface3 instanceof InterfaceC0703Ra ? (InterfaceC0703Ra) iInterfaceQueryLocalInterface3 : new C0669Pa(strongBinder2);
            } catch (Exception e8) {
                throw new u2.l(e8);
            }
        } catch (RemoteException | NullPointerException | u2.l e9) {
            InterfaceC1107ee interfaceC1107eeA = C1053de.a(context);
            c2834o.getClass();
            interfaceC1107eeA.e("ClientApiBroker.createNativeAdViewDelegate", e9);
            return null;
        }
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.q1(new S2.b(this.f23247b), new S2.b(this.f23248c));
    }
}
