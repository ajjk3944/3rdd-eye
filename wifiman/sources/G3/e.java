package G3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Comparable, Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private final String f6860a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6861b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6862c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6863d;

    private e(String str, long j10, int i10, String str2) {
        this.f6860a = str;
        this.f6861b = j10;
        this.f6862c = i10;
        this.f6863d = "";
    }

    static e b(String str, long j10, int i10, String str2) {
        return new e(str, j10, i10, "");
    }

    final long a() {
        return this.f6861b;
    }

    public final String c() {
        return this.f6860a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f6860a.compareTo(((e) obj).f6860a);
    }

    public final String d() {
        return this.f6863d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f6860a.equals(((e) obj).f6860a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6860a.hashCode();
    }

    public final String toString() {
        return this.f6860a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6860a);
        parcel.writeLong(this.f6861b);
        parcel.writeInt(this.f6862c);
        parcel.writeString(this.f6863d);
    }

    final int zza() {
        return this.f6862c;
    }

    /* synthetic */ e(Parcel parcel, d dVar) {
        this.f6860a = parcel.readString();
        this.f6861b = parcel.readLong();
        this.f6862c = parcel.readInt();
        this.f6863d = parcel.readString();
    }
}
