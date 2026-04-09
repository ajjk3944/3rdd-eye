package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import com.google.android.exoplayer2.o0;
import java.util.Arrays;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new c(3);

    /* renamed from: d, reason: collision with root package name */
    public final String f4267d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4268g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4269r;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f4270x;

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f4267d = str;
        this.f4268g = str2;
        this.f4269r = i10;
        this.f4270x = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void c(o0 o0Var) {
        o0Var.a(this.f4269r, this.f4270x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.f4269r == apicFrame.f4269r && v.a(this.f4267d, apicFrame.f4267d) && v.a(this.f4268g, apicFrame.f4268g) && Arrays.equals(this.f4270x, apicFrame.f4270x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f4269r) * 31;
        String str = this.f4267d;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4268g;
        return Arrays.hashCode(this.f4270x) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f4289a;
        int iD = a.d(25, str);
        String str2 = this.f4267d;
        int iD2 = a.d(iD, str2);
        String str3 = this.f4268g;
        StringBuilder sbS = a.s(a.d(iD2, str3), str, ": mimeType=", str2, ", description=");
        sbS.append(str3);
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4267d);
        parcel.writeString(this.f4268g);
        parcel.writeInt(this.f4269r);
        parcel.writeByteArray(this.f4270x);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4267d = string;
        this.f4268g = parcel.readString();
        this.f4269r = parcel.readInt();
        this.f4270x = parcel.createByteArray();
    }
}
