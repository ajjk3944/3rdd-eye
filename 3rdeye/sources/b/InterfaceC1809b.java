package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;
import s.BinderC5541e;

/* compiled from: ICustomTabsService.java */
/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1809b extends IInterface {

    /* renamed from: k8, reason: collision with root package name */
    public static final String f17051k8 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* compiled from: ICustomTabsService.java */
    /* renamed from: b.b$a */
    public static abstract class a extends Binder implements InterfaceC1809b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f17052b = 0;

        /* compiled from: ICustomTabsService.java */
        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        public static class C0274a implements InterfaceC1809b {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f17053b;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f17053b;
            }

            @Override // b.InterfaceC1809b
            public final boolean b(BinderC5541e binderC5541e, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1809b.f17051k8);
                    parcelObtain.writeStrongInterface(binderC5541e);
                    C0275b.a(parcelObtain, uri);
                    this.f17053b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC1809b
            public final int f(BinderC5541e binderC5541e, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1809b.f17051k8);
                    parcelObtain.writeStrongInterface(binderC5541e);
                    parcelObtain.writeString(str);
                    C0275b.a(parcelObtain, bundle);
                    this.f17053b.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC1809b
            public final boolean h(BinderC5541e binderC5541e, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1809b.f17051k8);
                    parcelObtain.writeStrongInterface(binderC5541e);
                    C0275b.a(parcelObtain, uri);
                    C0275b.a(parcelObtain, bundle);
                    this.f17053b.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC1809b
            public final boolean j(BinderC5541e binderC5541e) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1809b.f17051k8);
                    parcelObtain.writeStrongInterface(binderC5541e);
                    this.f17053b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC1809b
            public final boolean l(BinderC5541e binderC5541e, int i, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1809b.f17051k8);
                    parcelObtain.writeStrongInterface(binderC5541e);
                    parcelObtain.writeInt(i);
                    C0275b.a(parcelObtain, uri);
                    C0275b.a(parcelObtain, bundle);
                    this.f17053b.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC1809b
            public final boolean q(BinderC5541e binderC5541e, Uri uri, Bundle bundle, ArrayList arrayList) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1809b.f17051k8);
                    parcelObtain.writeStrongInterface(binderC5541e);
                    C0275b.a(parcelObtain, uri);
                    C0275b.a(parcelObtain, bundle);
                    int size = arrayList.size();
                    parcelObtain.writeInt(size);
                    for (int i = 0; i < size; i++) {
                        C0275b.a(parcelObtain, (Parcelable) arrayList.get(i));
                    }
                    this.f17053b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC1809b
            public final boolean r() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1809b.f17051k8);
                    parcelObtain.writeLong(0L);
                    this.f17053b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* compiled from: ICustomTabsService.java */
    /* renamed from: b.b$b, reason: collision with other inner class name */
    public static class C0275b {
        public static void a(Parcel parcel, Parcelable parcelable) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, 0);
            }
        }
    }

    boolean b(BinderC5541e binderC5541e, Uri uri) throws RemoteException;

    int f(BinderC5541e binderC5541e, String str, Bundle bundle) throws RemoteException;

    boolean h(BinderC5541e binderC5541e, Uri uri, Bundle bundle) throws RemoteException;

    boolean j(BinderC5541e binderC5541e) throws RemoteException;

    boolean l(BinderC5541e binderC5541e, int i, Uri uri, Bundle bundle) throws RemoteException;

    boolean q(BinderC5541e binderC5541e, Uri uri, Bundle bundle, ArrayList arrayList) throws RemoteException;

    boolean r() throws RemoteException;
}
