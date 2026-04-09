package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import tc.c;
import v7.b;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new c(15);

    /* renamed from: a, reason: collision with root package name */
    public final v7.c f2117a;

    public ParcelImpl(Parcel parcel) {
        this.f2117a = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new b(parcel).l(this.f2117a);
    }
}
