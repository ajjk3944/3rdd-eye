package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import java.util.Arrays;
import qb.v;
import tc.c;

/* loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new c(4);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4271d;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f4271d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryFrame.class == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.f4289a.equals(binaryFrame.f4289a) && Arrays.equals(this.f4271d, binaryFrame.f4271d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4271d) + a.g(this.f4289a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4289a);
        parcel.writeByteArray(this.f4271d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryFrame(Parcel parcel) {
        String string = parcel.readString();
        int i10 = v.f20828a;
        super(string);
        this.f4271d = parcel.createByteArray();
    }
}
