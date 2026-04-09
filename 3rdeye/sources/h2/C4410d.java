package h2;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelableForegroundRequestInfo.java */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: h2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4410d implements Parcelable {
    public static final Parcelable.Creator<C4410d> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f38162b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.h f38163c;

    /* compiled from: ParcelableForegroundRequestInfo.java */
    /* renamed from: h2.d$a */
    public class a implements Parcelable.Creator<C4410d> {
        @Override // android.os.Parcelable.Creator
        public final C4410d createFromParcel(Parcel parcel) {
            return new C4410d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C4410d[] newArray(int i) {
            return new C4410d[i];
        }
    }

    public C4410d(Parcel parcel) {
        this.f38162b = parcel.readString();
        this.f38163c = new androidx.work.h(parcel.readInt(), (Notification) parcel.readParcelable(C4410d.class.getClassLoader()), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38162b);
        androidx.work.h hVar = this.f38163c;
        parcel.writeInt(hVar.f16896a);
        parcel.writeInt(hVar.f16897b);
        parcel.writeParcelable(hVar.f16898c, i);
    }
}
