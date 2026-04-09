package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import ob.k;
import oe.f0;
import oe.h0;
import oe.u0;
import qb.v;

/* loaded from: classes.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;
    public final int B;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public final h0 H;
    public final h0 I;
    public final int J;
    public final int K;
    public final int L;
    public final h0 M;
    public final h0 N;
    public final int O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;

    /* renamed from: a, reason: collision with root package name */
    public final int f4563a;

    /* renamed from: d, reason: collision with root package name */
    public final int f4564d;

    /* renamed from: g, reason: collision with root package name */
    public final int f4565g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4566r;

    /* renamed from: x, reason: collision with root package name */
    public final int f4567x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4568y;

    static {
        f0 f0Var = h0.f19336d;
        u0 u0Var = u0.f19383x;
        CREATOR = new i6.a(9);
    }

    public TrackSelectionParameters(k kVar) {
        this.f4563a = kVar.f19250a;
        this.f4564d = kVar.f19251b;
        this.f4565g = kVar.f19252c;
        this.f4566r = kVar.f19253d;
        this.f4567x = kVar.f19254e;
        this.f4568y = kVar.f19255f;
        this.B = kVar.f19256g;
        this.D = kVar.f19257h;
        this.E = kVar.f19258i;
        this.F = kVar.j;
        this.G = kVar.k;
        this.H = kVar.f19259l;
        this.I = kVar.f19260m;
        this.J = kVar.f19261n;
        this.K = kVar.f19262o;
        this.L = kVar.f19263p;
        this.M = kVar.f19264q;
        this.N = kVar.f19265r;
        this.O = kVar.f19266s;
        this.P = kVar.f19267t;
        this.Q = kVar.f19268u;
        this.R = kVar.f19269v;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
            if (this.f4563a == trackSelectionParameters.f4563a && this.f4564d == trackSelectionParameters.f4564d && this.f4565g == trackSelectionParameters.f4565g && this.f4566r == trackSelectionParameters.f4566r && this.f4567x == trackSelectionParameters.f4567x && this.f4568y == trackSelectionParameters.f4568y && this.B == trackSelectionParameters.B && this.D == trackSelectionParameters.D && this.G == trackSelectionParameters.G && this.E == trackSelectionParameters.E && this.F == trackSelectionParameters.F && this.H.equals(trackSelectionParameters.H) && this.I.equals(trackSelectionParameters.I) && this.J == trackSelectionParameters.J && this.K == trackSelectionParameters.K && this.L == trackSelectionParameters.L && this.M.equals(trackSelectionParameters.M) && this.N.equals(trackSelectionParameters.N) && this.O == trackSelectionParameters.O && this.P == trackSelectionParameters.P && this.Q == trackSelectionParameters.Q && this.R == trackSelectionParameters.R) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.N.hashCode() + ((this.M.hashCode() + ((((((((this.I.hashCode() + ((this.H.hashCode() + ((((((((((((((((((((((this.f4563a + 31) * 31) + this.f4564d) * 31) + this.f4565g) * 31) + this.f4566r) * 31) + this.f4567x) * 31) + this.f4568y) * 31) + this.B) * 31) + this.D) * 31) + (this.G ? 1 : 0)) * 31) + this.E) * 31) + this.F) * 31)) * 31)) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31)) * 31)) * 31) + this.O) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.I);
        parcel.writeInt(this.J);
        parcel.writeList(this.N);
        parcel.writeInt(this.O);
        int i11 = v.f20828a;
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeInt(this.f4563a);
        parcel.writeInt(this.f4564d);
        parcel.writeInt(this.f4565g);
        parcel.writeInt(this.f4566r);
        parcel.writeInt(this.f4567x);
        parcel.writeInt(this.f4568y);
        parcel.writeInt(this.B);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeList(this.H);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeList(this.M);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeInt(this.R ? 1 : 0);
    }

    public TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.I = h0.l(arrayList);
        this.J = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.N = h0.l(arrayList2);
        this.O = parcel.readInt();
        int i10 = v.f20828a;
        this.P = parcel.readInt() != 0;
        this.f4563a = parcel.readInt();
        this.f4564d = parcel.readInt();
        this.f4565g = parcel.readInt();
        this.f4566r = parcel.readInt();
        this.f4567x = parcel.readInt();
        this.f4568y = parcel.readInt();
        this.B = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt() != 0;
        ArrayList arrayList3 = new ArrayList();
        parcel.readList(arrayList3, null);
        this.H = h0.l(arrayList3);
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        ArrayList arrayList4 = new ArrayList();
        parcel.readList(arrayList4, null);
        this.M = h0.l(arrayList4);
        this.Q = parcel.readInt() != 0;
        this.R = parcel.readInt() != 0;
    }
}
