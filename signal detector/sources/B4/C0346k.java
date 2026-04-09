package b4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: b4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346k implements InterfaceC0348m, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f5756a;

    public C0346k(IBinder iBinder) {
        this.f5756a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5756a;
    }

    @Override // b4.InterfaceC0348m
    public final void p3(String str, ArrayList arrayList, Bundle bundle, a4.j jVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        parcelObtain.writeString(str);
        parcelObtain.writeTypedList(arrayList);
        int i = AbstractC0357v.f5775a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(jVar);
        try {
            this.f5756a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
