package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.f0;
import cc.a0;
import h0.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a0(6);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1968a;

    /* renamed from: d, reason: collision with root package name */
    public final String f1969d;

    /* renamed from: g, reason: collision with root package name */
    public final String f1970g;

    public IcyInfo(String str, String str2, byte[] bArr) {
        this.f1968a = bArr;
        this.f1969d = str;
        this.f1970g = str2;
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
        return Arrays.equals(this.f1968a, ((IcyInfo) obj).f1968a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1968a);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void k(f0 f0Var) {
        String str = this.f1969d;
        if (str != null) {
            f0Var.f1625a = str;
        }
    }

    public final String toString() {
        int length = this.f1968a.length;
        StringBuilder sb2 = new StringBuilder("ICY: title=\"");
        sb2.append(this.f1969d);
        sb2.append("\", url=\"");
        sb2.append(this.f1970g);
        sb2.append("\", rawMetadata.length=\"");
        return b.i(length, "\"", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f1968a);
        parcel.writeString(this.f1969d);
        parcel.writeString(this.f1970g);
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f1968a = bArrCreateByteArray;
        this.f1969d = parcel.readString();
        this.f1970g = parcel.readString();
    }
}
