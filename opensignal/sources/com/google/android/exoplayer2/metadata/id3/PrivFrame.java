package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import java.util.Arrays;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new c(11);

    /* renamed from: d, reason: collision with root package name */
    public final String f4298d;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f4299g;

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f4298d = str;
        this.f4299g = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PrivFrame.class == obj.getClass()) {
            PrivFrame privFrame = (PrivFrame) obj;
            if (v.a(this.f4298d, privFrame.f4298d) && Arrays.equals(this.f4299g, privFrame.f4299g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4298d;
        return Arrays.hashCode(this.f4299g) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f4289a;
        int iD = a.d(8, str);
        String str2 = this.f4298d;
        return a.k(a.d(iD, str2), str, ": owner=", str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4298d);
        parcel.writeByteArray(this.f4299g);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4298d = string;
        this.f4299g = parcel.createByteArray();
    }
}
