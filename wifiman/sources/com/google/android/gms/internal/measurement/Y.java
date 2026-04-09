package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class Y implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f35163a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35164b;

    protected Y(IBinder iBinder, String str) {
        this.f35163a = iBinder;
        this.f35164b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f35163a;
    }

    protected final Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f35164b);
        return parcelObtain;
    }

    protected final Parcel c(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f35163a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void f(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f35163a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void n0(int i10, Parcel parcel) {
        try {
            this.f35163a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
