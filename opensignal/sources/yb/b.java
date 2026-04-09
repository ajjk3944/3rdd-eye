package yb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.measurement.b4;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26212a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f26212a) {
            case 0:
                int iH0 = b4.h0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iH0) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        b4.e0(parcel, i10);
                    } else {
                        intent = (Intent) b4.s(parcel, i10, Intent.CREATOR);
                    }
                }
                b4.y(parcel, iH0);
                return new CloudMessage(intent);
            default:
                return new zzd(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f26212a) {
            case 0:
                return new CloudMessage[i10];
            default:
                return new zzd[i10];
        }
    }
}
