package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.o0;
import h0.b;
import i6.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a(24);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4264a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4265d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4266g;

    public IcyInfo(String str, String str2, byte[] bArr) {
        this.f4264a = bArr;
        this.f4265d = str;
        this.f4266g = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void c(o0 o0Var) {
        String str = this.f4265d;
        if (str != null) {
            o0Var.f4343a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4264a, ((IcyInfo) obj).f4264a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4264a);
    }

    public final String toString() {
        int length = this.f4264a.length;
        StringBuilder sb2 = new StringBuilder("ICY: title=\"");
        sb2.append(this.f4265d);
        sb2.append("\", url=\"");
        sb2.append(this.f4266g);
        sb2.append("\", rawMetadata.length=\"");
        return b.i(length, "\"", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f4264a);
        parcel.writeString(this.f4265d);
        parcel.writeString(this.f4266g);
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f4264a = bArrCreateByteArray;
        this.f4265d = parcel.readString();
        this.f4266g = parcel.readString();
    }
}
