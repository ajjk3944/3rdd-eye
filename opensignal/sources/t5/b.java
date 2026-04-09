package t5;

import a5.d0;
import a5.v;
import androidx.media3.common.r;
import c5.g;
import d5.v0;
import d5.x;
import io.sentry.internal.debugmeta.c;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends d5.b {
    public final g I;
    public final v J;
    public long K;
    public a L;
    public long M;

    public b() {
        super(6);
        this.I = new g(1);
        this.J = new v();
    }

    @Override // d5.u0
    public final boolean b() {
        return true;
    }

    @Override // d5.b, d5.r0
    public final void e(int i10, Object obj) {
        if (i10 == 8) {
            this.L = (a) obj;
        }
    }

    @Override // d5.u0, d5.v0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // d5.u0
    public final void h(long j, long j7) {
        float[] fArr;
        while (!l() && this.M < 100000 + j) {
            g gVar = this.I;
            gVar.p();
            c cVar = this.f6926d;
            cVar.c();
            if (t(cVar, gVar, 0) != -4 || gVar.g(4)) {
                return;
            }
            this.M = gVar.f3308y;
            if (this.L != null && !gVar.g(Integer.MIN_VALUE)) {
                gVar.s();
                ByteBuffer byteBuffer = gVar.f3306r;
                int i10 = d0.f105a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    v vVar = this.J;
                    vVar.C(iLimit, bArrArray);
                    vVar.E(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(vVar.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    ((x) this.L).a(this.M - this.K, fArr);
                }
            }
        }
    }

    @Override // d5.v0
    public final int j(r rVar) {
        return "application/x-camera-motion".equals(rVar.H) ? v0.f(4, 0, 0) : v0.f(0, 0, 0);
    }

    @Override // d5.b
    public final void m() {
        a aVar = this.L;
        if (aVar != null) {
            ((x) aVar).d();
        }
    }

    @Override // d5.b
    public final void o(long j, boolean z10) {
        this.M = Long.MIN_VALUE;
        a aVar = this.L;
        if (aVar != null) {
            ((x) aVar).d();
        }
    }

    @Override // d5.b
    public final void s(r[] rVarArr, long j, long j7) {
        this.K = j7;
    }
}
