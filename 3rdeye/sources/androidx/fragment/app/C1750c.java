package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: BackStackState.java */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1750c implements Parcelable {
    public static final Parcelable.Creator<C1750c> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15865b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15866c;

    /* compiled from: BackStackState.java */
    /* renamed from: androidx.fragment.app.c$a */
    public class a implements Parcelable.Creator<C1750c> {
        @Override // android.os.Parcelable.Creator
        public final C1750c createFromParcel(Parcel parcel) {
            return new C1750c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C1750c[] newArray(int i) {
            return new C1750c[i];
        }
    }

    public C1750c(Parcel parcel) {
        this.f15865b = parcel.createStringArrayList();
        this.f15866c = parcel.createTypedArrayList(C1749b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f15865b);
        parcel.writeTypedList(this.f15866c);
    }
}
