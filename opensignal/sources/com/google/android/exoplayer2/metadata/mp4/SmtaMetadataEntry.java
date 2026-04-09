package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import tc.c;

/* loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new c(18);

    /* renamed from: a, reason: collision with root package name */
    public final float f4317a;

    /* renamed from: d, reason: collision with root package name */
    public final int f4318d;

    public SmtaMetadataEntry(int i10, float f10) {
        this.f4317a = f10;
        this.f4318d = i10;
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
            if (this.f4317a == smtaMetadataEntry.f4317a && this.f4318d == smtaMetadataEntry.f4318d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f4317a).hashCode() + 527) * 31) + this.f4318d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("smta: captureFrameRate=");
        sb2.append(this.f4317a);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(this.f4318d);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f4317a);
        parcel.writeInt(this.f4318d);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f4317a = parcel.readFloat();
        this.f4318d = parcel.readInt();
    }
}
