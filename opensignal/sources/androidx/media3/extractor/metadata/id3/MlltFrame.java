package androidx.media3.extractor.metadata.id3;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a0(16);

    /* renamed from: d, reason: collision with root package name */
    public final int f1997d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1998g;

    /* renamed from: r, reason: collision with root package name */
    public final int f1999r;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2000x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2001y;

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f1997d = i10;
        this.f1998g = i11;
        this.f1999r = i12;
        this.f2000x = iArr;
        this.f2001y = iArr2;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MlltFrame.class == obj.getClass()) {
            MlltFrame mlltFrame = (MlltFrame) obj;
            if (this.f1997d == mlltFrame.f1997d && this.f1998g == mlltFrame.f1998g && this.f1999r == mlltFrame.f1999r && Arrays.equals(this.f2000x, mlltFrame.f2000x) && Arrays.equals(this.f2001y, mlltFrame.f2001y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2001y) + ((Arrays.hashCode(this.f2000x) + ((((((527 + this.f1997d) * 31) + this.f1998g) * 31) + this.f1999r) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1997d);
        parcel.writeInt(this.f1998g);
        parcel.writeInt(this.f1999r);
        parcel.writeIntArray(this.f2000x);
        parcel.writeIntArray(this.f2001y);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f1997d = parcel.readInt();
        this.f1998g = parcel.readInt();
        this.f1999r = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i10 = d0.f105a;
        this.f2000x = iArrCreateIntArray;
        this.f2001y = parcel.createIntArray();
    }
}
