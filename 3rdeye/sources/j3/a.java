package J3;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import u3.BinderC5631b;
import u3.C5630a;
import u3.c;

/* compiled from: IGetInstallReferrerService.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IGetInstallReferrerService.java */
    /* renamed from: J3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0048a extends BinderC5631b implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f2751b = 0;

        /* compiled from: IGetInstallReferrerService.java */
        /* renamed from: J3.a$a$a, reason: collision with other inner class name */
        public static class C0049a extends C5630a implements a {
            @Override // J3.a
            public final Bundle g(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i = c.f46563a;
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
                parcelObtain = Parcel.obtain();
                try {
                    this.f46562b.transact(1, parcelObtain, parcelObtain, 0);
                    parcelObtain.readException();
                    parcelObtain.recycle();
                    return (Bundle) (parcelObtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain));
                } catch (RuntimeException e4) {
                    throw e4;
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    Bundle g(Bundle bundle) throws RemoteException;
}
