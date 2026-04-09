package androidx.media3.extractor.metadata.dvbsi;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import w.g;

/* loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new l(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f1946a;

    /* renamed from: d, reason: collision with root package name */
    public final String f1947d;

    public AppInfoTable(int i10, String str) {
        this.f1946a = i10;
        this.f1947d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f1946a);
        sb2.append(",url=");
        return g.j(sb2, this.f1947d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1947d);
        parcel.writeInt(this.f1946a);
    }
}
