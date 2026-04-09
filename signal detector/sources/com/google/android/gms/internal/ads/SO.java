package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class SO implements Comparator, Parcelable {
    public static final Parcelable.Creator<SO> CREATOR = new C1784r8(25);

    /* renamed from: a, reason: collision with root package name */
    public final FO[] f11179a;

    /* renamed from: b, reason: collision with root package name */
    public int f11180b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11181c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11182d;

    public SO(Parcel parcel) {
        this.f11181c = parcel.readString();
        FO[] foArr = (FO[]) parcel.createTypedArray(FO.CREATOR);
        String str = Vt.f12096a;
        this.f11179a = foArr;
        this.f11182d = foArr.length;
    }

    public final SO a(String str) {
        return Objects.equals(this.f11181c, str) ? this : new SO(str, false, this.f11179a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        FO fo = (FO) obj2;
        UUID uuid = Hx.f9023a;
        UUID uuid2 = ((FO) obj).f8113b;
        return uuid.equals(uuid2) ? !uuid.equals(fo.f8113b) ? 1 : 0 : uuid2.compareTo(fo.f8113b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SO.class == obj.getClass()) {
            SO so = (SO) obj;
            if (Objects.equals(this.f11181c, so.f11181c) && Arrays.equals(this.f11179a, so.f11179a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f11180b;
        if (i != 0) {
            return i;
        }
        String str = this.f11181c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f11179a);
        this.f11180b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11181c);
        parcel.writeTypedArray(this.f11179a, 0);
    }

    public SO(String str, boolean z6, FO... foArr) {
        this.f11181c = str;
        foArr = z6 ? (FO[]) foArr.clone() : foArr;
        this.f11179a = foArr;
        this.f11182d = foArr.length;
        Arrays.sort(foArr, this);
    }
}
