package M3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class D extends W.b {
    public static final Parcelable.Creator<D> CREATOR = new A3.w(5);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2829c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2830d;

    public D(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2829c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2830d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2829c) + "}";
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f2829c, parcel, i);
        parcel.writeInt(this.f2830d ? 1 : 0);
    }
}
