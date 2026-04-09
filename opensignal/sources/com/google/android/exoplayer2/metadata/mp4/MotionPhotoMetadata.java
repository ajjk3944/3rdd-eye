package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import tc.c;

/* loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new c(17);

    /* renamed from: a, reason: collision with root package name */
    public final long f4308a;

    /* renamed from: d, reason: collision with root package name */
    public final long f4309d;

    /* renamed from: g, reason: collision with root package name */
    public final long f4310g;

    /* renamed from: r, reason: collision with root package name */
    public final long f4311r;

    /* renamed from: x, reason: collision with root package name */
    public final long f4312x;

    public MotionPhotoMetadata(long j, long j7, long j10, long j11, long j12) {
        this.f4308a = j;
        this.f4309d = j7;
        this.f4310g = j10;
        this.f4311r = j11;
        this.f4312x = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.f4308a == motionPhotoMetadata.f4308a && this.f4309d == motionPhotoMetadata.f4309d && this.f4310g == motionPhotoMetadata.f4310g && this.f4311r == motionPhotoMetadata.f4311r && this.f4312x == motionPhotoMetadata.f4312x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return se.b.F(this.f4312x) + ((se.b.F(this.f4311r) + ((se.b.F(this.f4310g) + ((se.b.F(this.f4309d) + ((se.b.F(this.f4308a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(218);
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(this.f4308a);
        sb2.append(", photoSize=");
        sb2.append(this.f4309d);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(this.f4310g);
        sb2.append(", videoStartPosition=");
        sb2.append(this.f4311r);
        sb2.append(", videoSize=");
        sb2.append(this.f4312x);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f4308a);
        parcel.writeLong(this.f4309d);
        parcel.writeLong(this.f4310g);
        parcel.writeLong(this.f4311r);
        parcel.writeLong(this.f4312x);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f4308a = parcel.readLong();
        this.f4309d = parcel.readLong();
        this.f4310g = parcel.readLong();
        this.f4311r = parcel.readLong();
        this.f4312x = parcel.readLong();
    }
}
