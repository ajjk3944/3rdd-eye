package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2804C extends W2.a implements E {
    @Override // q2.E
    public final void a1(a1 a1Var, int i) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, a1Var);
        parcelH0.writeInt(5);
        I0(parcelH0, 5);
    }

    @Override // q2.E
    public final boolean e() {
        Parcel parcelK0 = k0(h0(), 3);
        ClassLoader classLoader = C7.f7544a;
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // q2.E
    public final void f0(a1 a1Var) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, a1Var);
        I0(parcelH0, 1);
    }
}
