package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new ac.l(7);

    /* renamed from: a, reason: collision with root package name */
    public final Entry[] f1549a;

    /* renamed from: d, reason: collision with root package name */
    public final long f1550d;

    public interface Entry extends Parcelable {
        default r a() {
            return null;
        }

        default byte[] b() {
            return null;
        }

        default void k(f0 f0Var) {
        }
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.f1549a, metadata.f1549a) && this.f1550d == metadata.f1550d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return se.b.F(this.f1550d) + (Arrays.hashCode(this.f1549a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f1549a));
        long j = this.f1550d;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Entry[] entryArr = this.f1549a;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f1550d);
    }

    public Metadata(long j, Entry... entryArr) {
        this.f1550d = j;
        this.f1549a = entryArr;
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.f1549a = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f1549a;
            if (i10 < entryArr.length) {
                entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i10++;
            } else {
                this.f1550d = parcel.readLong();
                return;
            }
        }
    }
}
