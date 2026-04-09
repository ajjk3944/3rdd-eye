package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import cc.a0;

/* loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a0(21);

    /* renamed from: a, reason: collision with root package name */
    public final long f2012a;

    /* renamed from: d, reason: collision with root package name */
    public final long f2013d;

    /* renamed from: g, reason: collision with root package name */
    public final long f2014g;

    /* renamed from: r, reason: collision with root package name */
    public final long f2015r;

    /* renamed from: x, reason: collision with root package name */
    public final long f2016x;

    public MotionPhotoMetadata(long j, long j7, long j10, long j11, long j12) {
        this.f2012a = j;
        this.f2013d = j7;
        this.f2014g = j10;
        this.f2015r = j11;
        this.f2016x = j12;
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
            if (this.f2012a == motionPhotoMetadata.f2012a && this.f2013d == motionPhotoMetadata.f2013d && this.f2014g == motionPhotoMetadata.f2014g && this.f2015r == motionPhotoMetadata.f2015r && this.f2016x == motionPhotoMetadata.f2016x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return se.b.F(this.f2016x) + ((se.b.F(this.f2015r) + ((se.b.F(this.f2014g) + ((se.b.F(this.f2013d) + ((se.b.F(this.f2012a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f2012a + ", photoSize=" + this.f2013d + ", photoPresentationTimestampUs=" + this.f2014g + ", videoStartPosition=" + this.f2015r + ", videoSize=" + this.f2016x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f2012a);
        parcel.writeLong(this.f2013d);
        parcel.writeLong(this.f2014g);
        parcel.writeLong(this.f2015r);
        parcel.writeLong(this.f2016x);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f2012a = parcel.readLong();
        this.f2013d = parcel.readLong();
        this.f2014g = parcel.readLong();
        this.f2015r = parcel.readLong();
        this.f2016x = parcel.readLong();
    }
}
