package u0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z0 extends g1.y implements Parcelable, u0, n2, g1.n {
    public static final Parcelable.Creator<z0> CREATOR = new y0(0);

    /* renamed from: b, reason: collision with root package name */
    public f2 f35026b;

    public z0(float f10) {
        g1.g gVarJ = g1.m.j();
        f2 f2Var = new f2(gVarJ.g(), f10);
        if (!(gVarJ instanceof g1.b)) {
            f2Var.f24300b = new f2(1, f10);
        }
        this.f35026b = f2Var;
    }

    @Override // g1.x
    public final g1.z a() {
        return this.f35026b;
    }

    @Override // g1.n
    public final j2 b() {
        return e.g;
    }

    @Override // g1.y, g1.x
    public final g1.z c(g1.z zVar, g1.z zVar2, g1.z zVar3) {
        if (((f2) zVar2).f34811c == ((f2) zVar3).f34811c) {
            return zVar2;
        }
        return null;
    }

    @Override // g1.x
    public final void d(g1.z zVar) {
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f35026b = (f2) zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(float f10) {
        g1.g gVarJ;
        f2 f2Var = (f2) g1.m.h(this.f35026b);
        if (f2Var.f34811c == f10) {
            return;
        }
        f2 f2Var2 = this.f35026b;
        synchronized (g1.m.f24260c) {
            gVarJ = g1.m.j();
            ((f2) g1.m.p(f2Var2, this, gVarJ, f2Var)).f34811c = f10;
        }
        g1.m.o(gVarJ, this);
    }

    @Override // u0.n2
    public final Object getValue() {
        return Float.valueOf(((f2) g1.m.u(this.f35026b, this)).f34811c);
    }

    @Override // u0.u0
    public final void setValue(Object obj) {
        g(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((f2) g1.m.h(this.f35026b)).f34811c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(((f2) g1.m.u(this.f35026b, this)).f34811c);
    }
}
