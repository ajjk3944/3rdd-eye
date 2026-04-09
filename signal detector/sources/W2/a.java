package W2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4015a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f4016b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4017c;

    public /* synthetic */ a(IBinder iBinder, String str, int i) {
        this.f4015a = i;
        this.f4016b = iBinder;
        this.f4017c = str;
    }

    public void I0(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f4016b.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f4015a) {
        }
        return this.f4016b;
    }

    public void d1(Parcel parcel, int i) {
        try {
            this.f4016b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel g0(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f4016b.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel h0() {
        switch (this.f4015a) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f4017c);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f4017c);
                return parcelObtain2;
        }
    }

    public Parcel k0(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f4016b.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }
}
