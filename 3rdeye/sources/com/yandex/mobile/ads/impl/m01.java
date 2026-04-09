package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m01 extends ei0 {
    public static final Parcelable.Creator<m01> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final int f30144c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30145d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30146e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f30147f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f30148g;

    public class a implements Parcelable.Creator<m01> {
        @Override // android.os.Parcelable.Creator
        public final m01 createFromParcel(Parcel parcel) {
            return new m01(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m01[] newArray(int i) {
            return new m01[i];
        }
    }

    public m01(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f30144c = i;
        this.f30145d = i10;
        this.f30146e = i11;
        this.f30147f = iArr;
        this.f30148g = iArr2;
    }

    @Override // com.yandex.mobile.ads.impl.ei0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m01.class == obj.getClass()) {
            m01 m01Var = (m01) obj;
            if (this.f30144c == m01Var.f30144c && this.f30145d == m01Var.f30145d && this.f30146e == m01Var.f30146e && Arrays.equals(this.f30147f, m01Var.f30147f) && Arrays.equals(this.f30148g, m01Var.f30148g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30148g) + ((Arrays.hashCode(this.f30147f) + ((((((this.f30144c + 527) * 31) + this.f30145d) * 31) + this.f30146e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30144c);
        parcel.writeInt(this.f30145d);
        parcel.writeInt(this.f30146e);
        parcel.writeIntArray(this.f30147f);
        parcel.writeIntArray(this.f30148g);
    }

    public m01(Parcel parcel) {
        super("MLLT");
        this.f30144c = parcel.readInt();
        this.f30145d = parcel.readInt();
        this.f30146e = parcel.readInt();
        this.f30147f = (int[]) s82.a(parcel.createIntArray());
        this.f30148g = (int[]) s82.a(parcel.createIntArray());
    }
}
