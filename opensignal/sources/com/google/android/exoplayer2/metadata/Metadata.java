package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.o0;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new pa.a();

    /* renamed from: a, reason: collision with root package name */
    public final Entry[] f4241a;

    public interface Entry extends Parcelable {
        default Format a() {
            return null;
        }

        default byte[] b() {
            return null;
        }

        default void c(o0 o0Var) {
        }
    }

    public Metadata(Entry... entryArr) {
        this.f4241a = entryArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4241a, ((Metadata) obj).f4241a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4241a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(Arrays.toString(this.f4241a));
        return strValueOf.length() != 0 ? "entries=".concat(strValueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Entry[] entryArr = this.f4241a;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(ArrayList arrayList) {
        this.f4241a = (Entry[]) arrayList.toArray(new Entry[0]);
    }

    public Metadata(Parcel parcel) {
        this.f4241a = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f4241a;
            if (i10 >= entryArr.length) {
                return;
            }
            entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i10++;
        }
    }
}
