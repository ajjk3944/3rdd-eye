package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.i0;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new i0(24);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f23595a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f23596b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23597c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23598d;

    public i(IntentSender intentSender, Intent intent, int i4, int i10) {
        k.e(intentSender, "intentSender");
        this.f23595a = intentSender;
        this.f23596b = intent;
        this.f23597c = i4;
        this.f23598d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        k.e(parcel, "dest");
        parcel.writeParcelable(this.f23595a, i4);
        parcel.writeParcelable(this.f23596b, i4);
        parcel.writeInt(this.f23597c);
        parcel.writeInt(this.f23598d);
    }
}
