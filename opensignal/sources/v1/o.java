package v1;

import androidx.compose.ui.platform.AndroidComposeView;
import x1.m0;

/* loaded from: classes.dex */
public final class o extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23802b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23803c;

    public /* synthetic */ o(int i10, Object obj) {
        this.f23802b = i10;
        this.f23803c = obj;
    }

    @Override // v1.u
    public float b(j jVar) {
        float fIntBitsToFloat;
        int iR0;
        switch (this.f23802b) {
            case 0:
                ar.n nVar = jVar.f23790a;
                if (nVar != null) {
                    return ((Number) nVar.w(this, Float.valueOf(Float.NaN))).floatValue();
                }
                m0 m0Var = (m0) this.f23803c;
                if (m0Var.k) {
                    return Float.NaN;
                }
                m0 m0Var2 = m0Var;
                while (true) {
                    h7.b bVar = m0Var2.f24887m;
                    if (!Float.isNaN((bVar == null || (iR0 = mq.l.r0(jVar, (j[]) bVar.f10000b)) < 0) ? Float.NaN : ((float[]) bVar.f10001c)[iR0])) {
                        m0Var2.R(m0Var.Z(), jVar);
                        m mVarX = m0Var2.X();
                        m mVarX2 = m0Var.X();
                        switch (jVar.f23791b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (mVarX2.b(mVarX, (Float.floatToRawIntBits(r3) & 4294967295L) | (Float.floatToRawIntBits(((int) (mVarX.h() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (mVarX2.b(mVarX, (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(((int) (mVarX.h() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    m0 m0VarB0 = m0Var2.b0();
                    if (m0VarB0 == null) {
                        m0Var2.R(m0Var.Z(), jVar);
                        return Float.NaN;
                    }
                    m0Var2 = m0VarB0;
                }
                break;
            default:
                return super.b(jVar);
        }
    }

    @Override // v1.u
    public final t2.i c() {
        switch (this.f23802b) {
            case 0:
                return ((m0) this.f23803c).getLayoutDirection();
            default:
                return ((AndroidComposeView) this.f23803c).getLayoutDirection();
        }
    }

    @Override // v1.u
    public final int d() {
        switch (this.f23802b) {
            case 0:
                return ((m0) this.f23803c).K();
            default:
                return ((AndroidComposeView) this.f23803c).getRoot().F();
        }
    }

    @Override // t2.c
    public final float getDensity() {
        switch (this.f23802b) {
            case 0:
                return ((m0) this.f23803c).getDensity();
            default:
                return ((AndroidComposeView) this.f23803c).getDensity().getDensity();
        }
    }

    @Override // t2.c
    public final float y() {
        switch (this.f23802b) {
            case 0:
                return ((m0) this.f23803c).y();
            default:
                return ((AndroidComposeView) this.f23803c).getDensity().y();
        }
    }
}
