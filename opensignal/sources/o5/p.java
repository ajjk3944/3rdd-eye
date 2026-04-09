package o5;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class p implements b5.h {

    /* renamed from: a, reason: collision with root package name */
    public final b5.h f19005a;

    /* renamed from: d, reason: collision with root package name */
    public final int f19006d;

    /* renamed from: g, reason: collision with root package name */
    public final m0 f19007g;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f19008r;

    /* renamed from: x, reason: collision with root package name */
    public int f19009x;

    public p(b5.h hVar, int i10, m0 m0Var) {
        a5.a.e(i10 > 0);
        this.f19005a = hVar;
        this.f19006d = i10;
        this.f19007g = m0Var;
        this.f19008r = new byte[1];
        this.f19009x = i10;
    }

    @Override // b5.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // b5.h
    public final Map k() {
        return this.f19005a.k();
    }

    @Override // b5.h
    public final Uri o() {
        return this.f19005a.o();
    }

    @Override // androidx.media3.common.l
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f19009x;
        b5.h hVar = this.f19005a;
        if (i12 == 0) {
            byte[] bArr2 = this.f19008r;
            int i13 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = hVar.read(bArr3, i13, i15);
                        if (i16 != -1) {
                            i13 += i16;
                            i15 -= i16;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        a5.v vVar = new a5.v(i14, bArr3);
                        m0 m0Var = this.f19007g;
                        long jMax = !m0Var.H ? m0Var.E : Math.max(m0Var.I.v(true), m0Var.E);
                        int iA = vVar.a();
                        w0 w0Var = m0Var.G;
                        w0Var.getClass();
                        w0Var.d(iA, vVar);
                        w0Var.a(jMax, 1, iA, 0, null);
                        m0Var.H = true;
                    }
                }
                this.f19009x = this.f19006d;
            }
            return -1;
        }
        int i17 = hVar.read(bArr, i10, Math.min(this.f19009x, i11));
        if (i17 != -1) {
            this.f19009x -= i17;
        }
        return i17;
    }

    @Override // b5.h
    public final long t(b5.k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // b5.h
    public final void w(b5.b0 b0Var) {
        b0Var.getClass();
        this.f19005a.w(b0Var);
    }
}
