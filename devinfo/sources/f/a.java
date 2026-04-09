package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.i0;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new i0(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f23581a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f23582b;

    public a(Intent intent, int i4) {
        this.f23581a = i4;
        this.f23582b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i4 = this.f23581a;
        sb2.append(i4 != -1 ? i4 != 0 ? String.valueOf(i4) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.f23582b);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        k.e(parcel, "dest");
        parcel.writeInt(this.f23581a);
        Intent intent = this.f23582b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }
}
