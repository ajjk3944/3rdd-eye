package sb;

import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import qb.v;

/* loaded from: classes.dex */
public final class b extends com.google.android.exoplayer2.g {
    public final z9.d H;
    public final fb.f I;
    public long J;
    public a K;
    public long L;

    public b() {
        super(6);
        this.H = new z9.d(1);
        this.I = new fb.f();
    }

    @Override // com.google.android.exoplayer2.g, com.google.android.exoplayer2.i1
    public final void e(int i10, Object obj) {
        if (i10 == 7) {
            this.K = (a) obj;
        }
    }

    @Override // com.google.android.exoplayer2.l1
    public final int f(Format format) {
        return "application/x-camera-motion".equals(format.H) ? 4 : 0;
    }

    @Override // com.google.android.exoplayer2.g, com.google.android.exoplayer2.l1
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.g
    public final boolean i() {
        return h();
    }

    @Override // com.google.android.exoplayer2.g
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.exoplayer2.g
    public final void k() {
        a aVar = this.K;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.google.android.exoplayer2.g
    public final void m(long j, boolean z10) {
        this.L = Long.MIN_VALUE;
        a aVar = this.K;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.google.android.exoplayer2.g
    public final void q(Format[] formatArr, long j, long j7) {
        this.J = j7;
    }

    @Override // com.google.android.exoplayer2.g
    public final void s(long j, long j7) {
        float[] fArr;
        while (!h() && this.L < 100000 + j) {
            z9.d dVar = this.H;
            dVar.p();
            io.sentry.internal.debugmeta.c cVar = this.f4137d;
            cVar.c();
            if (r(cVar, dVar, 0) != -4 || dVar.g(4)) {
                return;
            }
            this.L = dVar.f26793y;
            if (this.K != null && !dVar.g(Integer.MIN_VALUE)) {
                dVar.s();
                ByteBuffer byteBuffer = dVar.f26791r;
                int i10 = v.f20828a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    fb.f fVar = this.I;
                    fVar.w(iLimit, bArrArray);
                    fVar.y(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(fVar.f());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.K.a(this.L - this.J, fArr);
                }
            }
        }
    }
}
