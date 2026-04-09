package u0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b1 extends g1.y implements Parcelable, n2, u0, g1.n {
    public static final Parcelable.Creator<b1> CREATOR = new y0(2);

    /* renamed from: b, reason: collision with root package name */
    public h2 f34742b;

    public b1(long j) {
        g1.g gVarJ = g1.m.j();
        h2 h2Var = new h2(gVarJ.g(), j);
        if (!(gVarJ instanceof g1.b)) {
            h2Var.f24300b = new h2(1, j);
        }
        this.f34742b = h2Var;
    }

    @Override // g1.x
    public final g1.z a() {
        return this.f34742b;
    }

    @Override // g1.n
    public final j2 b() {
        return e.g;
    }

    @Override // g1.y, g1.x
    public final g1.z c(g1.z zVar, g1.z zVar2, g1.z zVar3) {
        if (((h2) zVar2).f34828c == ((h2) zVar3).f34828c) {
            return zVar2;
        }
        return null;
    }

    @Override // g1.x
    public final void d(g1.z zVar) {
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f34742b = (h2) zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long j) {
        g1.g gVarJ;
        h2 h2Var = (h2) g1.m.h(this.f34742b);
        if (h2Var.f34828c != j) {
            h2 h2Var2 = this.f34742b;
            synchronized (g1.m.f24260c) {
                gVarJ = g1.m.j();
                ((h2) g1.m.p(h2Var2, this, gVarJ, h2Var)).f34828c = j;
            }
            g1.m.o(gVarJ, this);
        }
    }

    @Override // u0.n2
    public final Object getValue() {
        return Long.valueOf(((h2) g1.m.u(this.f34742b, this)).f34828c);
    }

    @Override // u0.u0
    public final void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((h2) g1.m.h(this.f34742b)).f34828c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(((h2) g1.m.u(this.f34742b, this)).f34828c);
    }
}
