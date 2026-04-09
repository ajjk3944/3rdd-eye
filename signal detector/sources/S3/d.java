package S3;

import L2.t;
import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b3.C0335e;
import b4.AbstractC0357v;
import b4.C0339d;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
public abstract class d extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3484a;

    public /* synthetic */ d(int i) {
        this.f3484a = i;
    }

    public boolean I0(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f3484a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i3) {
        int i6 = 0;
        switch (this.f3484a) {
            case 0:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i3)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                R3.h hVar = (R3.h) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i7 = e.f3485a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(AbstractC1135f5.l(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    hVar.f2(bundle);
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i8 = e.f3485a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(AbstractC1135f5.l(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    hVar.D2(bundle2);
                }
                return true;
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i3)) {
                    return true;
                }
                return I0(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i3)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                W3.e eVar = (W3.e) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                int i9 = X3.a.f4170a;
                Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                int iDataAvail3 = parcel.dataAvail();
                if (iDataAvail3 > 0) {
                    throw new BadParcelableException(AbstractC1135f5.l(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                X3.h hVar2 = eVar.f4031d.f4033a;
                if (hVar2 != null) {
                    c3.f fVar = eVar.f4030c;
                    synchronized (hVar2.f4184f) {
                        hVar2.f4183e.remove(fVar);
                    }
                    synchronized (hVar2.f4184f) {
                        try {
                            if (hVar2.f4188k.get() <= 0 || hVar2.f4188k.decrementAndGet() <= 0) {
                                hVar2.a().post(new X3.g(i6, hVar2));
                            } else {
                                hVar2.f4180b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            }
                        } finally {
                        }
                    }
                }
                eVar.f4029b.c("onGetLaunchReviewFlowInfo", new Object[0]);
                eVar.f4030c.b(new W3.b((PendingIntent) bundle3.get("confirmation_intent"), bundle3.getBoolean("is_review_no_op")));
                return true;
            case 3:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i3)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                switch (i) {
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        C0335e c0335e = (C0335e) W2.b.a(parcel, C0335e.CREATOR);
                        t tVar = (t) this;
                        tVar.f2558c.post(new A1.d(tVar, 10, c0335e));
                        break;
                    case 9:
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i3)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                a4.j jVar = (a4.j) this;
                switch (i) {
                    case 2:
                        int i10 = parcel.readInt();
                        Parcelable.Creator creator4 = Bundle.CREATOR;
                        AbstractC0357v.b(parcel);
                        C0339d c0339d = jVar.f4704c.f4708b;
                        c3.f fVar2 = jVar.f4703b;
                        c0339d.c(fVar2);
                        a4.k.f4705c.c("onStartInstall(%d)", Integer.valueOf(i10));
                        fVar2.b(Integer.valueOf(i10));
                        break;
                    case 3:
                        int i11 = parcel.readInt();
                        Parcelable.Creator creator5 = Bundle.CREATOR;
                        AbstractC0357v.b(parcel);
                        jVar.f4704c.f4708b.c(jVar.f4703b);
                        a4.k.f4705c.c("onCompleteInstall(%d)", Integer.valueOf(i11));
                        break;
                    case 4:
                        int i12 = parcel.readInt();
                        Parcelable.Creator creator6 = Bundle.CREATOR;
                        AbstractC0357v.b(parcel);
                        jVar.f4704c.f4708b.c(jVar.f4703b);
                        a4.k.f4705c.c("onCancelInstall(%d)", Integer.valueOf(i12));
                        break;
                    case 5:
                        int i13 = parcel.readInt();
                        Parcelable.Creator creator7 = Bundle.CREATOR;
                        AbstractC0357v.b(parcel);
                        jVar.f4704c.f4708b.c(jVar.f4703b);
                        a4.k.f4705c.c("onGetSession(%d)", Integer.valueOf(i13));
                        break;
                    case 6:
                        Parcelable.Creator creator8 = Bundle.CREATOR;
                        Bundle bundle4 = (Bundle) AbstractC0357v.a(parcel);
                        AbstractC0357v.b(parcel);
                        C0339d c0339d2 = jVar.f4704c.f4708b;
                        c3.f fVar3 = jVar.f4703b;
                        c0339d2.c(fVar3);
                        int i14 = bundle4.getInt("error_code");
                        a4.k.f4705c.b("onError(%d)", Integer.valueOf(i14));
                        fVar3.a(new a4.a(i14));
                        break;
                    case 7:
                        parcel.createTypedArrayList(Bundle.CREATOR);
                        AbstractC0357v.b(parcel);
                        jVar.f4704c.f4708b.c(jVar.f4703b);
                        a4.k.f4705c.c("onGetSessionStates", new Object[0]);
                        break;
                    case 8:
                        Parcelable.Creator creator9 = Bundle.CREATOR;
                        AbstractC0357v.b(parcel);
                        jVar.f4704c.f4708b.c(jVar.f4703b);
                        a4.k.f4705c.c("onDeferredUninstall", new Object[0]);
                        break;
                    case 9:
                        Parcelable.Creator creator10 = Bundle.CREATOR;
                        AbstractC0357v.b(parcel);
                        jVar.f4704c.f4708b.c(jVar.f4703b);
                        a4.k.f4705c.c("onDeferredInstall", new Object[0]);
                        break;
                    case 10:
                        Parcelable.Creator creator11 = Bundle.CREATOR;
                        AbstractC0357v.b(parcel);
                        jVar.f4704c.f4708b.c(jVar.f4703b);
                        a4.k.f4705c.c("onGetSplitsForAppUpdate", new Object[0]);
                        break;
                    case 11:
                        Parcelable.Creator creator12 = Bundle.CREATOR;
                        AbstractC0357v.b(parcel);
                        jVar.f4704c.f4708b.c(jVar.f4703b);
                        a4.k.f4705c.c("onCompleteInstallForAppUpdate", new Object[0]);
                        break;
                    case 12:
                        Parcelable.Creator creator13 = Bundle.CREATOR;
                        AbstractC0357v.b(parcel);
                        jVar.f4704c.f4708b.c(jVar.f4703b);
                        a4.k.f4705c.c("onDeferredLanguageInstall", new Object[0]);
                        break;
                    case 13:
                        Parcelable.Creator creator14 = Bundle.CREATOR;
                        AbstractC0357v.b(parcel);
                        jVar.f4704c.f4708b.c(jVar.f4703b);
                        a4.k.f4705c.c("onDeferredLanguageUninstall", new Object[0]);
                        break;
                    default:
                        return false;
                }
                return true;
        }
    }

    public d(String str) {
        this.f3484a = 1;
        attachInterface(this, str);
    }
}
