package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import qb.v;
import w.g;

/* loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4313a;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final long f4314a;

        /* renamed from: d, reason: collision with root package name */
        public final long f4315d;

        /* renamed from: g, reason: collision with root package name */
        public final int f4316g;

        public Segment(int i10, long j, long j7) {
            qb.b.g(j < j7);
            this.f4314a = j;
            this.f4315d = j7;
            this.f4316g = i10;
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
                if (this.f4314a == segment.f4314a && this.f4315d == segment.f4315d && this.f4316g == segment.f4316g) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f4314a), Long.valueOf(this.f4315d), Integer.valueOf(this.f4316g)});
        }

        public final String toString() {
            int i10 = v.f20828a;
            Locale locale = Locale.US;
            StringBuilder sbK = g.k(this.f4314a, "Segment: startTimeMs=", ", endTimeMs=");
            sbK.append(this.f4315d);
            sbK.append(", speedDivisor=");
            sbK.append(this.f4316g);
            return sbK.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f4314a);
            parcel.writeLong(this.f4315d);
            parcel.writeInt(this.f4316g);
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f4313a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).f4315d;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((Segment) arrayList.get(i10)).f4314a < j) {
                    z10 = true;
                    break;
                } else {
                    j = ((Segment) arrayList.get(i10)).f4315d;
                    i10++;
                }
            }
        }
        qb.b.g(!z10);
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
        return this.f4313a.equals(((SlowMotionData) obj).f4313a);
    }

    public final int hashCode() {
        return this.f4313a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f4313a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21);
        sb2.append("SlowMotion: segments=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f4313a);
    }
}
