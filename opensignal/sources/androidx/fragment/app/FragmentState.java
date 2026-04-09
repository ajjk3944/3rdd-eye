package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a(4);
    public final String B;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final String I;
    public final int J;
    public final boolean K;

    /* renamed from: a, reason: collision with root package name */
    public final String f1399a;

    /* renamed from: d, reason: collision with root package name */
    public final String f1400d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1401g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1402r;

    /* renamed from: x, reason: collision with root package name */
    public final int f1403x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1404y;

    public FragmentState(b bVar) {
        this.f1399a = bVar.getClass().getName();
        this.f1400d = bVar.f1433y;
        this.f1401g = bVar.K;
        this.f1402r = bVar.M;
        this.f1403x = bVar.U;
        this.f1404y = bVar.V;
        this.B = bVar.W;
        this.D = bVar.Z;
        this.E = bVar.I;
        this.F = bVar.Y;
        this.G = bVar.X;
        this.H = bVar.f1422m0.ordinal();
        this.I = bVar.E;
        this.J = bVar.F;
        this.K = bVar.f1416g0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1399a);
        sb2.append(" (");
        sb2.append(this.f1400d);
        sb2.append(")}:");
        if (this.f1401g) {
            sb2.append(" fromLayout");
        }
        if (this.f1402r) {
            sb2.append(" dynamicContainer");
        }
        int i10 = this.f1404y;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.B;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.D) {
            sb2.append(" retainInstance");
        }
        if (this.E) {
            sb2.append(" removing");
        }
        if (this.F) {
            sb2.append(" detached");
        }
        if (this.G) {
            sb2.append(" hidden");
        }
        String str2 = this.I;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.J);
        }
        if (this.K) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1399a);
        parcel.writeString(this.f1400d);
        parcel.writeInt(this.f1401g ? 1 : 0);
        parcel.writeInt(this.f1402r ? 1 : 0);
        parcel.writeInt(this.f1403x);
        parcel.writeInt(this.f1404y);
        parcel.writeString(this.B);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H);
        parcel.writeString(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f1399a = parcel.readString();
        this.f1400d = parcel.readString();
        this.f1401g = parcel.readInt() != 0;
        this.f1402r = parcel.readInt() != 0;
        this.f1403x = parcel.readInt();
        this.f1404y = parcel.readInt();
        this.B = parcel.readString();
        this.D = parcel.readInt() != 0;
        this.E = parcel.readInt() != 0;
        this.F = parcel.readInt() != 0;
        this.G = parcel.readInt() != 0;
        this.H = parcel.readInt();
        this.I = parcel.readString();
        this.J = parcel.readInt();
        this.K = parcel.readInt() != 0;
    }
}
