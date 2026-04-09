package b5;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z0 implements Parcelable {
    public static final Parcelable.Creator<z0> CREATOR = new androidx.recyclerview.widget.i0(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f1953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1954b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1955c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1956d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1957e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1958f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1959h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1960i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1961k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1962l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1963m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1964n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1965o;

    public z0(z zVar) {
        this.f1953a = zVar.getClass().getName();
        this.f1954b = zVar.f1934f;
        this.f1955c = zVar.f1941o;
        this.f1956d = zVar.f1943q;
        this.f1957e = zVar.f1951y;
        this.f1958f = zVar.f1952z;
        this.g = zVar.A;
        this.f1959h = zVar.D;
        this.f1960i = zVar.f1939m;
        this.j = zVar.C;
        this.f1961k = zVar.B;
        this.f1962l = zVar.P.ordinal();
        this.f1963m = zVar.f1936i;
        this.f1964n = zVar.j;
        this.f1965o = zVar.J;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1953a);
        sb2.append(" (");
        sb2.append(this.f1954b);
        sb2.append(")}:");
        if (this.f1955c) {
            sb2.append(" fromLayout");
        }
        if (this.f1956d) {
            sb2.append(" dynamicContainer");
        }
        int i4 = this.f1958f;
        if (i4 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i4));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f1959h) {
            sb2.append(" retainInstance");
        }
        if (this.f1960i) {
            sb2.append(" removing");
        }
        if (this.j) {
            sb2.append(" detached");
        }
        if (this.f1961k) {
            sb2.append(" hidden");
        }
        String str2 = this.f1963m;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f1964n);
        }
        if (this.f1965o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1953a);
        parcel.writeString(this.f1954b);
        parcel.writeInt(this.f1955c ? 1 : 0);
        parcel.writeInt(this.f1956d ? 1 : 0);
        parcel.writeInt(this.f1957e);
        parcel.writeInt(this.f1958f);
        parcel.writeString(this.g);
        parcel.writeInt(this.f1959h ? 1 : 0);
        parcel.writeInt(this.f1960i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.f1961k ? 1 : 0);
        parcel.writeInt(this.f1962l);
        parcel.writeString(this.f1963m);
        parcel.writeInt(this.f1964n);
        parcel.writeInt(this.f1965o ? 1 : 0);
    }

    public z0(Parcel parcel) {
        this.f1953a = parcel.readString();
        this.f1954b = parcel.readString();
        this.f1955c = parcel.readInt() != 0;
        this.f1956d = parcel.readInt() != 0;
        this.f1957e = parcel.readInt();
        this.f1958f = parcel.readInt();
        this.g = parcel.readString();
        this.f1959h = parcel.readInt() != 0;
        this.f1960i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.f1961k = parcel.readInt() != 0;
        this.f1962l = parcel.readInt();
        this.f1963m = parcel.readString();
        this.f1964n = parcel.readInt();
        this.f1965o = parcel.readInt() != 0;
    }
}
