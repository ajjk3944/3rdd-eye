package d0;

import com.google.android.gms.internal.ads.xz;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f21808b;

    public /* synthetic */ o1(s1 s1Var, int i4) {
        this.f21807a = i4;
        this.f21808b = s1Var;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f21807a) {
            case 0:
                return Boolean.valueOf(this.f21808b.f25565n);
            default:
                n1.s sVar = this.f21808b.P;
                if (!sVar.f25554a.f25565n) {
                    return null;
                }
                n1.q qVarU0 = sVar.u0();
                int iOrdinal = qVarU0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    throw new ac.m();
                }
                if (qVarU0.a()) {
                    return sVar.s0(null);
                }
                n1.s sVarH = ((xz) ((j2.r) i2.k.t(sVar)).getFocusOwner()).h();
                if (sVarH != null) {
                    return sVarH.s0(i2.k.r(sVar));
                }
                return null;
        }
    }
}
