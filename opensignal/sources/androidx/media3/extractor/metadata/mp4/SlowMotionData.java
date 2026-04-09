package androidx.media3.extractor.metadata.mp4;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import w.g;

/* loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2017a;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final long f2018a;

        /* renamed from: d, reason: collision with root package name */
        public final long f2019d;

        /* renamed from: g, reason: collision with root package name */
        public final int f2020g;

        public Segment(int i10, long j, long j7) {
            a5.a.e(j < j7);
            this.f2018a = j;
            this.f2019d = j7;
            this.f2020g = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Segment.class == obj.getClass()) {
                Segment segment = (Segment) obj;
                if (this.f2018a == segment.f2018a && this.f2019d == segment.f2019d && this.f2020g == segment.f2020g) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f2018a), Long.valueOf(this.f2019d), Integer.valueOf(this.f2020g)});
        }

        public final String toString() {
            int i10 = d0.f105a;
            Locale locale = Locale.US;
            StringBuilder sbK = g.k(this.f2018a, "Segment: startTimeMs=", ", endTimeMs=");
            sbK.append(this.f2019d);
            sbK.append(", speedDivisor=");
            sbK.append(this.f2020g);
            return sbK.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f2018a);
            parcel.writeLong(this.f2019d);
            parcel.writeInt(this.f2020g);
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f2017a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).f2019d;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((Segment) arrayList.get(i10)).f2018a < j) {
                    z10 = true;
                    break;
                } else {
                    j = ((Segment) arrayList.get(i10)).f2019d;
                    i10++;
                }
            }
        }
        a5.a.e(!z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f2017a.equals(((SlowMotionData) obj).f2017a);
    }

    public final int hashCode() {
        return this.f2017a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f2017a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f2017a);
    }
}
