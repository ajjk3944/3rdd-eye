package d1;

import android.util.AndroidRuntimeException;
import d1.h;

/* loaded from: classes.dex */
public final class k extends h {
    public l B;
    public float C;
    public boolean D;

    public k(Object obj, i iVar) {
        super(obj, iVar);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
    }

    @Override // d1.h
    public void i() {
        o();
        this.B.i(e());
        super.i();
    }

    @Override // d1.h
    public boolean k(long j10) {
        if (this.D) {
            float f10 = this.C;
            if (f10 != Float.MAX_VALUE) {
                this.B.g(f10);
                this.C = Float.MAX_VALUE;
            }
            this.f20634b = this.B.b();
            this.f20633a = 0.0f;
            this.D = false;
            return true;
        }
        if (this.C != Float.MAX_VALUE) {
            long j11 = j10 / 2;
            h.o oVarJ = this.B.j(this.f20634b, this.f20633a, j11);
            this.B.g(this.C);
            this.C = Float.MAX_VALUE;
            h.o oVarJ2 = this.B.j(oVarJ.f20646a, oVarJ.f20647b, j11);
            this.f20634b = oVarJ2.f20646a;
            this.f20633a = oVarJ2.f20647b;
        } else {
            h.o oVarJ3 = this.B.j(this.f20634b, this.f20633a, j10);
            this.f20634b = oVarJ3.f20646a;
            this.f20633a = oVarJ3.f20647b;
        }
        float fMax = Math.max(this.f20634b, this.f20640h);
        this.f20634b = fMax;
        float fMin = Math.min(fMax, this.f20639g);
        this.f20634b = fMin;
        if (!n(fMin, this.f20633a)) {
            return false;
        }
        this.f20634b = this.B.b();
        this.f20633a = 0.0f;
        return true;
    }

    public void l(float f10) {
        if (f()) {
            this.C = f10;
            return;
        }
        if (this.B == null) {
            this.B = new l(f10);
        }
        this.B.g(f10);
        i();
    }

    public boolean m() {
        return this.B.f20650b > 0.0d;
    }

    public boolean n(float f10, float f11) {
        return this.B.e(f10, f11);
    }

    public final void o() {
        l lVar = this.B;
        if (lVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dB = lVar.b();
        if (dB > this.f20639g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dB < this.f20640h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public k p(l lVar) {
        this.B = lVar;
        return this;
    }

    public void q() {
        if (!m()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!c().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f20638f) {
            this.D = true;
        }
    }
}
