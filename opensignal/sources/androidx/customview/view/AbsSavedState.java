package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import x0.o;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f1243a;

    /* renamed from: d, reason: collision with root package name */
    public static final AbsSavedState f1242d = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new o(1);

    /* renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState() {
        this.f1243a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f1243a, i10);
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1243a = parcelable == f1242d ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1243a = parcelable == null ? f1242d : parcelable;
    }
}
