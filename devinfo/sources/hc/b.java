package hc;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.i0;
import com.bumptech.glide.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends qb.a {
    public static final Parcelable.Creator<b> CREATOR = new i0(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f25043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25044b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f25045c;

    public b(int i4, int i10, Intent intent) {
        this.f25043a = i4;
        this.f25044b = i10;
        this.f25045c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = f.O(parcel, 20293);
        f.N(parcel, 1, 4);
        parcel.writeInt(this.f25043a);
        f.N(parcel, 2, 4);
        parcel.writeInt(this.f25044b);
        f.H(parcel, 3, this.f25045c, i4);
        f.P(parcel, iO);
    }
}
