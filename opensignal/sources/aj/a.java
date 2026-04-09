package aj;

import a8.f;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import cj.l;
import fm.d;
import fm.e;
import fm.g;
import g4.j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class a extends Binder implements l {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f397d;

    public a(c cVar) {
        attachInterface(this, "com.opensignal.sdk.data.task.OnJobResultTestListener");
        this.f397d = new WeakReference(cVar);
    }

    @Override // cj.l
    public final void K(long j, String str, String str2) {
        kj.a aVar;
        b9.c cVar;
        br.l.e(str, "jobId");
        br.l.e(str2, "result");
        c cVar2 = (c) this.f397d.get();
        if (cVar2 == null || (aVar = (kj.a) cVar2.f401c) == null || (cVar = aVar.f14445b) == null) {
            return;
        }
        f.A(new e(str2, (f) cVar.f2478d, str, cVar, j, null));
    }

    @Override // cj.l
    public final void L(long j, String str, String str2) {
        kj.a aVar;
        b9.c cVar;
        br.l.e(str, "jobId");
        br.l.e(str2, "error");
        c cVar2 = (c) this.f397d.get();
        if (cVar2 == null || (aVar = (kj.a) cVar2.f401c) == null || (cVar = aVar.f14445b) == null) {
            return;
        }
        f.A(new fm.c(str, cVar, j, null));
    }

    @Override // cj.l
    public final void O(long j, String str) {
        kj.a aVar;
        b9.c cVar;
        br.l.e(str, "taskName");
        c cVar2 = (c) this.f397d.get();
        if (cVar2 == null || (aVar = (kj.a) cVar2.f401c) == null || (cVar = aVar.f14445b) == null) {
            return;
        }
        f.A(new g((f) cVar.f2478d, j, null, 1));
    }

    @Override // cj.l
    public final void n(long j, String str) {
        kj.a aVar;
        b9.c cVar;
        br.l.e(str, "taskName");
        c cVar2 = (c) this.f397d.get();
        if (cVar2 == null || (aVar = (kj.a) cVar2.f401c) == null || (cVar = aVar.f14445b) == null) {
            return;
        }
        f.A(new g((f) cVar.f2478d, j, null, 0));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("com.opensignal.sdk.data.task.OnJobResultTestListener");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("com.opensignal.sdk.data.task.OnJobResultTestListener");
            return true;
        }
        switch (i10) {
            case 1:
                n(parcel.readLong(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 2:
                O(parcel.readLong(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                K(parcel.readLong(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                v(parcel.readLong(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case j.STRING_FIELD_NUMBER /* 5 */:
                y(parcel.readLong(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                L(parcel.readLong(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // cj.l
    public final void v(long j, String str, String str2) {
        kj.a aVar;
        b9.c cVar;
        br.l.e(str, "jobId");
        br.l.e(str2, "result");
        c cVar2 = (c) this.f397d.get();
        if (cVar2 == null || (aVar = (kj.a) cVar2.f401c) == null || (cVar = aVar.f14445b) == null) {
            return;
        }
        f.A(new d(str, str2, (f) cVar.f2478d, j, null));
    }

    @Override // cj.l
    public final void y(long j, String str, String str2) {
        br.l.e(str, "jobId");
        br.l.e(str2, "result");
        c cVar = (c) this.f397d.get();
        if (cVar != null) {
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
