package u0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d1 extends g1.y implements Parcelable, g1.n {
    public static final Parcelable.Creator<d1> CREATOR = new c1();

    /* renamed from: b, reason: collision with root package name */
    public final j2 f34765b;

    /* renamed from: c, reason: collision with root package name */
    public i2 f34766c;

    public d1(Object obj, j2 j2Var) {
        this.f34765b = j2Var;
        g1.g gVarJ = g1.m.j();
        i2 i2Var = new i2(obj, gVarJ.g());
        if (!(gVarJ instanceof g1.b)) {
            i2Var.f24300b = new i2(obj, 1);
        }
        this.f34766c = i2Var;
    }

    @Override // g1.x
    public final g1.z a() {
        return this.f34766c;
    }

    @Override // g1.n
    public final j2 b() {
        return this.f34765b;
    }

    @Override // g1.y, g1.x
    public final g1.z c(g1.z zVar, g1.z zVar2, g1.z zVar3) {
        if (this.f34765b.a(((i2) zVar2).f34835c, ((i2) zVar3).f34835c)) {
            return zVar2;
        }
        return null;
    }

    @Override // g1.x
    public final void d(g1.z zVar) {
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f34766c = (i2) zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // u0.n2
    public final Object getValue() {
        return ((i2) g1.m.u(this.f34766c, this)).f34835c;
    }

    @Override // u0.u0
    public final void setValue(Object obj) {
        g1.g gVarJ;
        i2 i2Var = (i2) g1.m.h(this.f34766c);
        if (this.f34765b.a(i2Var.f34835c, obj)) {
            return;
        }
        i2 i2Var2 = this.f34766c;
        synchronized (g1.m.f24260c) {
            gVarJ = g1.m.j();
            ((i2) g1.m.p(i2Var2, this, gVarJ, i2Var)).f34835c = obj;
        }
        g1.m.o(gVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((i2) g1.m.h(this.f34766c)).f34835c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int i10;
        parcel.writeValue(getValue());
        e eVar = e.f34769d;
        j2 j2Var = this.f34765b;
        if (nk.k.a(j2Var, eVar)) {
            i10 = 0;
        } else if (nk.k.a(j2Var, e.g)) {
            i10 = 1;
        } else {
            if (!nk.k.a(j2Var, e.f34770e)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i10 = 2;
        }
        parcel.writeInt(i10);
    }
}
