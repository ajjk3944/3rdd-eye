package g2;

import com.google.android.gms.internal.ads.be1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24344b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24345c;

    public /* synthetic */ g0(int i4, Object obj) {
        this.f24344b = i4;
        this.f24345c = obj;
    }

    @Override // d3.c
    public final float F() {
        switch (this.f24344b) {
            case 0:
                return ((i2.m0) this.f24345c).F();
            default:
                return ((j2.r) this.f24345c).getDensity().F();
        }
    }

    @Override // d3.c
    public final float a() {
        switch (this.f24344b) {
            case 0:
                return ((i2.m0) this.f24345c).a();
            default:
                return ((j2.r) this.f24345c).getDensity().a();
        }
    }

    @Override // g2.r0
    public float d(n nVar) {
        float fIntBitsToFloat;
        int iB0;
        switch (this.f24344b) {
            case 0:
                mk.e eVar = nVar.f24382a;
                if (eVar != null) {
                    return ((Number) eVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                i2.m0 m0Var = (i2.m0) this.f24345c;
                if (m0Var.f25712k) {
                    return Float.NaN;
                }
                i2.m0 m0Var2 = m0Var;
                while (true) {
                    be1 be1Var = m0Var2.f25714m;
                    if (!Float.isNaN((be1Var == null || (iB0 = zj.m.b0(nVar, (n[]) be1Var.f9658b)) < 0) ? Float.NaN : ((float[]) be1Var.f9659c)[iB0])) {
                        m0Var2.Y(m0Var.g0(), nVar);
                        v vVarE0 = m0Var2.e0();
                        v vVarE02 = m0Var.e0();
                        switch (nVar.f24383b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (vVarE02.p(vVarE0, (Float.floatToRawIntBits(r3) & 4294967295L) | (Float.floatToRawIntBits(((int) (vVarE0.m() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (vVarE02.p(vVarE0, (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(((int) (vVarE0.m() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    i2.m0 m0VarI0 = m0Var2.i0();
                    if (m0VarI0 == null) {
                        m0Var2.Y(m0Var.g0(), nVar);
                        return Float.NaN;
                    }
                    m0Var2 = m0VarI0;
                }
                break;
            default:
                return super.d(nVar);
        }
    }

    @Override // g2.r0
    public final d3.l e() {
        switch (this.f24344b) {
            case 0:
                return ((i2.m0) this.f24345c).getLayoutDirection();
            default:
                return ((j2.r) this.f24345c).getLayoutDirection();
        }
    }

    @Override // g2.r0
    public final int f() {
        switch (this.f24344b) {
            case 0:
                return ((i2.m0) this.f24345c).L();
            default:
                return ((j2.r) this.f24345c).getRoot().H.f25687p.f24408a;
        }
    }
}
