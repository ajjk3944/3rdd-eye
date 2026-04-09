package androidx.media3.extractor.metadata.id3;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a0(17);

    /* renamed from: d, reason: collision with root package name */
    public final String f2002d;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f2003g;

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f2002d = str;
        this.f2003g = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PrivFrame.class == obj.getClass()) {
            PrivFrame privFrame = (PrivFrame) obj;
            if (d0.a(this.f2002d, privFrame.f2002d) && Arrays.equals(this.f2003g, privFrame.f2003g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2002d;
        return Arrays.hashCode(this.f2003g) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1993a + ": owner=" + this.f2002d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2002d);
        parcel.writeByteArray(this.f2003g);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f2002d = string;
        this.f2003g = parcel.createByteArray();
    }
}
