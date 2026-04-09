package cj;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: d, reason: collision with root package name */
    public IBinder f3988d;

    @Override // cj.l
    public final void K(long j, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.opensignal.sdk.data.task.OnJobResultTestListener");
            parcelObtain.writeLong(j);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f3988d.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // cj.l
    public final void L(long j, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.opensignal.sdk.data.task.OnJobResultTestListener");
            parcelObtain.writeLong(j);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f3988d.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // cj.l
    public final void O(long j, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.opensignal.sdk.data.task.OnJobResultTestListener");
            parcelObtain.writeLong(j);
            parcelObtain.writeString(str);
            this.f3988d.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3988d;
    }

    @Override // cj.l
    public final void n(long j, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.opensignal.sdk.data.task.OnJobResultTestListener");
            parcelObtain.writeLong(j);
            parcelObtain.writeString(str);
            this.f3988d.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // cj.l
    public final void v(long j, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.opensignal.sdk.data.task.OnJobResultTestListener");
            parcelObtain.writeLong(j);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f3988d.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // cj.l
    public final void y(long j, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.opensignal.sdk.data.task.OnJobResultTestListener");
            parcelObtain.writeLong(j);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f3988d.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
