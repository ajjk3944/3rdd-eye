package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.yz0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class wz1 implements yz0.b {
    public static final Parcelable.Creator<wz1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f35133b;

    public class a implements Parcelable.Creator<wz1> {
        @Override // android.os.Parcelable.Creator
        public final wz1 createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new wz1(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final wz1[] newArray(int i) {
            return new wz1[i];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f35134b;

        /* renamed from: c, reason: collision with root package name */
        public final long f35135c;

        /* renamed from: d, reason: collision with root package name */
        public final int f35136d;

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(int i, long j4, long j10) {
            zf.a(j4 < j10);
            this.f35134b = j4;
            this.f35135c = j10;
            this.f35136d = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f35134b == bVar.f35134b && this.f35135c == bVar.f35135c && this.f35136d == bVar.f35136d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f35134b), Long.valueOf(this.f35135c), Integer.valueOf(this.f35136d)});
        }

        public final String toString() {
            long j4 = this.f35134b;
            long j10 = this.f35135c;
            int i = this.f35136d;
            int i10 = s82.f32899a;
            Locale locale = Locale.US;
            StringBuilder sbJ = androidx.work.s.j("Segment: startTimeMs=", ", endTimeMs=", j4);
            sbJ.append(j10);
            sbJ.append(", speedDivisor=");
            sbJ.append(i);
            return sbJ.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f35134b);
            parcel.writeLong(this.f35135c);
            parcel.writeInt(this.f35136d);
        }
    }

    public wz1(ArrayList arrayList) {
        this.f35133b = arrayList;
        zf.a(!a(arrayList));
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ dc0 a() {
        return N4.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ byte[] b() {
        return N4.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wz1.class != obj.getClass()) {
            return false;
        }
        return this.f35133b.equals(((wz1) obj).f35133b);
    }

    public final int hashCode() {
        return this.f35133b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f35133b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f35133b);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ void a(aw0.a aVar) {
        N4.b(this, aVar);
    }

    private static boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j4 = ((b) arrayList.get(0)).f35135c;
        for (int i = 1; i < arrayList.size(); i++) {
            if (((b) arrayList.get(i)).f35134b < j4) {
                return true;
            }
            j4 = ((b) arrayList.get(i)).f35135c;
        }
        return false;
    }
}
