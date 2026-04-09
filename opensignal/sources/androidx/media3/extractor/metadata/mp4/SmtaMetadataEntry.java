package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import cc.a0;

/* loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a0(22);

    /* renamed from: a, reason: collision with root package name */
    public final float f2021a;

    /* renamed from: d, reason: collision with root package name */
    public final int f2022d;

    public SmtaMetadataEntry(int i10, float f10) {
        this.f2021a = f10;
        this.f2022d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SmtaMetadataEntry.class == obj.getClass()) {
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (this.f2021a == smtaMetadataEntry.f2021a && this.f2022d == smtaMetadataEntry.f2022d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f2021a).hashCode() + 527) * 31) + this.f2022d;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f2021a + ", svcTemporalLayerCount=" + this.f2022d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f2021a);
        parcel.writeInt(this.f2022d);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f2021a = parcel.readFloat();
        this.f2022d = parcel.readInt();
    }
}
