package ka;

import a5.v;
import androidx.media3.common.k0;
import ca.l;
import com.google.android.exoplayer2.y0;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f14239a;

    /* renamed from: b, reason: collision with root package name */
    public long f14240b;

    /* renamed from: c, reason: collision with root package name */
    public int f14241c;

    /* renamed from: d, reason: collision with root package name */
    public int f14242d;

    /* renamed from: e, reason: collision with root package name */
    public int f14243e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f14244f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14245g;

    public e(int i10) {
        switch (i10) {
            case 1:
                this.f14244f = new int[255];
                this.f14245g = new v(255);
                break;
            default:
                this.f14244f = new int[255];
                this.f14245g = new fb.f(255);
                break;
        }
    }

    public boolean a(l lVar, boolean z10) throws y0, EOFException {
        boolean zC;
        boolean zC2;
        this.f14239a = 0;
        this.f14240b = 0L;
        this.f14241c = 0;
        this.f14242d = 0;
        this.f14243e = 0;
        fb.f fVar = (fb.f) this.f14245g;
        fVar.v(27);
        try {
            zC = lVar.c(fVar.f8800a, 0, 27, z10);
        } catch (EOFException e4) {
            if (!z10) {
                throw e4;
            }
            zC = false;
        }
        if (zC && fVar.p() == 1332176723) {
            if (fVar.o() == 0) {
                this.f14239a = fVar.o();
                byte[] bArr = fVar.f8800a;
                int i10 = fVar.f8801b;
                fVar.f8801b = i10 + 1;
                fVar.f8801b = i10 + 2;
                fVar.f8801b = i10 + 3;
                long j = (bArr[i10] & 255) | ((bArr[r4] & 255) << 8) | ((bArr[r9] & 255) << 16);
                fVar.f8801b = i10 + 4;
                long j7 = j | ((bArr[r10] & 255) << 24);
                fVar.f8801b = i10 + 5;
                long j10 = j7 | ((bArr[r9] & 255) << 32);
                fVar.f8801b = i10 + 6;
                long j11 = j10 | ((bArr[r10] & 255) << 40);
                fVar.f8801b = i10 + 7;
                fVar.f8801b = i10 + 8;
                this.f14240b = ((bArr[r10] & 255) << 56) | j11 | ((bArr[r9] & 255) << 48);
                fVar.g();
                fVar.g();
                fVar.g();
                int iO = fVar.o();
                this.f14241c = iO;
                this.f14242d = iO + 27;
                fVar.v(iO);
                try {
                    zC2 = lVar.c(fVar.f8800a, 0, this.f14241c, z10);
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                    zC2 = false;
                }
                if (zC2) {
                    for (int i11 = 0; i11 < this.f14241c; i11++) {
                        int iO2 = fVar.o();
                        this.f14244f[i11] = iO2;
                        this.f14243e += iO2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw y0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public boolean b(u5.l lVar, boolean z10) throws k0, EOFException {
        boolean zC;
        boolean zC2;
        this.f14239a = 0;
        this.f14240b = 0L;
        this.f14241c = 0;
        this.f14242d = 0;
        this.f14243e = 0;
        v vVar = (v) this.f14245g;
        vVar.B(27);
        try {
            zC = lVar.c(vVar.f165a, 0, 27, z10);
        } catch (EOFException e4) {
            if (!z10) {
                throw e4;
            }
            zC = false;
        }
        if (zC && vVar.u() == 1332176723) {
            if (vVar.t() == 0) {
                this.f14239a = vVar.t();
                this.f14240b = vVar.j();
                vVar.k();
                vVar.k();
                vVar.k();
                int iT = vVar.t();
                this.f14241c = iT;
                this.f14242d = iT + 27;
                vVar.B(iT);
                try {
                    zC2 = lVar.c(vVar.f165a, 0, this.f14241c, z10);
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                    zC2 = false;
                }
                if (zC2) {
                    for (int i10 = 0; i10 < this.f14241c; i10++) {
                        int iT2 = vVar.t();
                        this.f14244f[i10] = iT2;
                        this.f14243e += iT2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw k0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r10.getPosition() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r10.x() == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(ca.l r10, long r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f14245g
            fb.f r0 = (fb.f) r0
            long r1 = r10.getPosition()
            long r3 = r10.d()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r2
        L15:
            qb.b.g(r1)
            r1 = 4
            r0.v(r1)
        L1c:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            long r5 = r10.getPosition()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L4d
        L2d:
            byte[] r5 = r0.f8800a
            boolean r5 = r10.c(r5, r2, r1, r3)     // Catch: java.io.EOFException -> L34
            goto L35
        L34:
            r5 = r2
        L35:
            if (r5 == 0) goto L4d
            r0.y(r2)
            long r4 = r0.p()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L49
            r10.l()
            return r3
        L49:
            r10.m(r3)
            goto L1c
        L4d:
            if (r4 == 0) goto L57
            long r0 = r10.getPosition()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5f
        L57:
            int r0 = r10.x()
            r1 = -1
            if (r0 == r1) goto L5f
            goto L4d
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.e.c(ca.l, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r10.getPosition() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r10.v(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(u5.l r10, long r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f14245g
            a5.v r0 = (a5.v) r0
            long r1 = r10.getPosition()
            long r3 = r10.d()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r2
        L15:
            a5.a.e(r1)
            r1 = 4
            r0.B(r1)
        L1c:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            long r5 = r10.getPosition()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L4d
        L2d:
            byte[] r5 = r0.f165a
            boolean r5 = r10.c(r5, r2, r1, r3)     // Catch: java.io.EOFException -> L34
            goto L35
        L34:
            r5 = r2
        L35:
            if (r5 == 0) goto L4d
            r0.E(r2)
            long r4 = r0.u()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L49
            r10.l()
            return r3
        L49:
            r10.m(r3)
            goto L1c
        L4d:
            if (r4 == 0) goto L57
            long r0 = r10.getPosition()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5f
        L57:
            int r0 = r10.v(r3)
            r1 = -1
            if (r0 == r1) goto L5f
            goto L4d
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.e.d(u5.l, long):boolean");
    }
}
