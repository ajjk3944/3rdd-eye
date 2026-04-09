package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C4009a;
import java.util.Arrays;

/* compiled from: DateValidatorPointForward.java */
/* renamed from: com.google.android.material.datepicker.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4013e implements C4009a.c {
    public static final Parcelable.Creator<C4013e> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f22801b;

    /* compiled from: DateValidatorPointForward.java */
    /* renamed from: com.google.android.material.datepicker.e$a */
    public class a implements Parcelable.Creator<C4013e> {
        @Override // android.os.Parcelable.Creator
        public final C4013e createFromParcel(Parcel parcel) {
            return new C4013e(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final C4013e[] newArray(int i) {
            return new C4013e[i];
        }
    }

    public C4013e(long j4) {
        this.f22801b = j4;
    }

    @Override // com.google.android.material.datepicker.C4009a.c
    public final boolean d(long j4) {
        return j4 >= this.f22801b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4013e) && this.f22801b == ((C4013e) obj).f22801b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f22801b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f22801b);
    }
}
