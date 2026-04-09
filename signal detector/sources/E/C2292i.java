package e;

import A3.q;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2292i implements Parcelable {
    public static final Parcelable.Creator<C2292i> CREATOR = new q(29);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f19853a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f19854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19855c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19856d;

    public C2292i(IntentSender intentSender, Intent intent, int i, int i3) {
        this.f19853a = intentSender;
        this.f19854b = intent;
        this.f19855c = i;
        this.f19856d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q5.i.e(parcel, "dest");
        parcel.writeParcelable(this.f19853a, i);
        parcel.writeParcelable(this.f19854b, i);
        parcel.writeInt(this.f19855c);
        parcel.writeInt(this.f19856d);
    }
}
