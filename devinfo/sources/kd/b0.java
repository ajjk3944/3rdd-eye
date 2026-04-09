package kd;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 extends m4.b {
    public static final Parcelable.Creator<b0> CREATOR = new g1.p(5);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f28145c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28146d;

    public b0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f28145c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f28146d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f28145c) + "}";
    }

    @Override // m4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        TextUtils.writeToParcel(this.f28145c, parcel, i4);
        parcel.writeInt(this.f28146d ? 1 : 0);
    }
}
