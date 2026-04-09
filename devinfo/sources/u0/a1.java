package u0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a1 extends g1.y implements Parcelable, u0, n2, g1.n {
    public static final Parcelable.Creator<a1> CREATOR = new y0(1);

    /* renamed from: b, reason: collision with root package name */
    public g2 f34727b;

    public a1(int i4) {
        g1.g gVarJ = g1.m.j();
        g2 g2Var = new g2(i4, gVarJ.g());
        if (!(gVarJ instanceof g1.b)) {
            g2Var.f24300b = new g2(i4, 1);
        }
        this.f34727b = g2Var;
    }

    @Override // g1.x
    public final g1.z a() {
        return this.f34727b;
    }

    @Override // g1.n
    public final j2 b() {
        return e.g;
    }

    @Override // g1.y, g1.x
    public final g1.z c(g1.z zVar, g1.z zVar2, g1.z zVar3) {
        if (((g2) zVar2).f34820c == ((g2) zVar3).f34820c) {
            return zVar2;
        }
        return null;
    }

    @Override // g1.x
    public final void d(g1.z zVar) {
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f34727b = (g2) zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((g2) g1.m.u(this.f34727b, this)).f34820c;
    }

    @Override // u0.n2
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i4) {
        g1.g gVarJ;
        g2 g2Var = (g2) g1.m.h(this.f34727b);
        if (g2Var.f34820c != i4) {
            g2 g2Var2 = this.f34727b;
            synchronized (g1.m.f24260c) {
                gVarJ = g1.m.j();
                ((g2) g1.m.p(g2Var2, this, gVarJ, g2Var)).f34820c = i4;
            }
            g1.m.o(gVarJ, this);
        }
    }

    @Override // u0.u0
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((g2) g1.m.h(this.f34727b)).f34820c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(g());
    }
}
