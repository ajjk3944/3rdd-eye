package ka;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import io.sentry.t;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f14246p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: o, reason: collision with root package name */
    public boolean f14247o;

    @Override // ka.h
    public final long c(fb.f fVar) {
        int i10;
        byte[] bArr = fVar.f8800a;
        byte b2 = bArr[0];
        int i11 = b2 & 255;
        int i12 = b2 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = bArr[1] & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return (this.f14253f * (i10 * (i13 >= 16 ? 2500 << r0 : i13 >= 12 ? 10000 << (i13 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r0))) / 1000000;
    }

    @Override // ka.h
    public final boolean e(fb.f fVar, long j, t tVar) {
        if (this.f14247o) {
            ((Format) tVar.f12736a).getClass();
            boolean z10 = fVar.d() == 1332770163;
            fVar.y(0);
            return z10;
        }
        byte[] bArrCopyOf = Arrays.copyOf(fVar.f8800a, fVar.f8802c);
        int i10 = bArrCopyOf[9] & 255;
        ArrayList arrayListA = y9.a.a(bArrCopyOf);
        g0 g0Var = new g0();
        g0Var.k = "audio/opus";
        g0Var.f4163x = i10;
        g0Var.f4164y = 48000;
        g0Var.f4152m = arrayListA;
        tVar.f12736a = new Format(g0Var);
        this.f14247o = true;
        return true;
    }

    @Override // ka.h
    public final void f(boolean z10) {
        super.f(z10);
        if (z10) {
            this.f14247o = false;
        }
    }
}
