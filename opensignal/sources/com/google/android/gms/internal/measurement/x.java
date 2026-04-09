package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class x implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5250d;

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f5251e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5252f;

    public /* synthetic */ x(IBinder iBinder, String str, int i10) {
        this.f5250d = i10;
        this.f5251e = iBinder;
        this.f5252f = str;
    }

    public Parcel R() {
        switch (this.f5250d) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f5252f);
                return parcelObtain;
            case 1:
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f5252f);
                return parcelObtain2;
            case 2:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(this.f5252f);
                return parcelObtain3;
            case 3:
                Parcel parcelObtain4 = Parcel.obtain();
                parcelObtain4.writeInterfaceToken(this.f5252f);
                return parcelObtain4;
        }
    }

    public void S(Parcel parcel, int i10) {
        Parcel parcelObtain;
        switch (this.f5250d) {
            case 0:
                parcelObtain = Parcel.obtain();
                try {
                    this.f5251e.transact(i10, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            case 3:
                parcelObtain = Parcel.obtain();
                try {
                    this.f5251e.transact(i10, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            default:
                parcelObtain = Parcel.obtain();
                try {
                    this.f5251e.transact(i10, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void T(Parcel parcel) {
        try {
            this.f5251e.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f5250d) {
        }
        return this.f5251e;
    }

    public Parcel d(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f5251e.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e4) {
                parcelObtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel e(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f5251e.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e4) {
                parcelObtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel f(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f5251e.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e4) {
                parcelObtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }
}
