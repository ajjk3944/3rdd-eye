package ac;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f303b;

    /* renamed from: c, reason: collision with root package name */
    public final String f304c;

    public /* synthetic */ a(IBinder iBinder, String str, int i4) {
        this.f302a = i4;
        this.f303b = iBinder;
        this.f304c = str;
    }

    public Parcel O(Parcel parcel, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f303b.transact(i4, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel S(Parcel parcel, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f303b.transact(i4, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel T() {
        switch (this.f302a) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f304c);
                return parcelObtain;
            case 1:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f304c);
                return parcelObtain2;
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(this.f304c);
                return parcelObtain3;
        }
    }

    public void U0(Parcel parcel) {
        try {
            this.f303b.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel a2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f304c);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f302a) {
        }
        return this.f303b;
    }

    public void e0(Parcel parcel, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f303b.transact(i4, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel f2(Parcel parcel, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f303b.transact(i4, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void g1(Parcel parcel, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f303b.transact(i4, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel r0(Parcel parcel, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f303b.transact(i4, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void u1(Parcel parcel, int i4) {
        try {
            this.f303b.transact(i4, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
