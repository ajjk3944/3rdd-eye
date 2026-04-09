package e;

import A3.q;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2284a implements Parcelable {
    public static final Parcelable.Creator<C2284a> CREATOR = new q(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f19838a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f19839b;

    public C2284a(Intent intent, int i) {
        this.f19838a = i;
        this.f19839b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f19838a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f19839b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q5.i.e(parcel, "dest");
        parcel.writeInt(this.f19838a);
        Intent intent = this.f19839b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
