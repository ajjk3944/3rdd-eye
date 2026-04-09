package androidx.media3.extractor.metadata.id3;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import cc.a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a0(10);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1975d;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f1975d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryFrame.class == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.f1993a.equals(binaryFrame.f1993a) && Arrays.equals(this.f1975d, binaryFrame.f1975d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1975d) + a.g(this.f1993a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1993a);
        parcel.writeByteArray(this.f1975d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryFrame(Parcel parcel) {
        String string = parcel.readString();
        int i10 = d0.f105a;
        super(string);
        this.f1975d = parcel.createByteArray();
    }
}
