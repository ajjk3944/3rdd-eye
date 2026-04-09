package j2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n1 extends androidx.lifecycle.e1 {

    /* renamed from: b, reason: collision with root package name */
    public final x.u f27239b;

    public n1() {
        x.u uVar = x.k.f36911a;
        this.f27239b = new x.u();
    }

    @Override // androidx.lifecycle.e1
    public final void d() {
        x.u uVar = this.f27239b;
        int[] iArr = uVar.f36905b;
        Object[] objArr = uVar.f36906c;
        long[] jArr = uVar.f36904a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i4 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j) < 128) {
                        int i13 = (i4 << 3) + i12;
                        int i14 = iArr[i13];
                        x.a0 a0Var = (x.a0) objArr[i13];
                        Object[] objArr2 = a0Var.f36846a;
                        int i15 = a0Var.f36847b;
                        int i16 = 0;
                        while (i16 < i15) {
                            m1 m1Var = (m1) objArr2[i16];
                            int i17 = i10;
                            u0.f fVar = m1Var.f27235d;
                            if (fVar != null) {
                                fVar.cancel();
                            }
                            m1Var.f27235d = null;
                            d1.c cVar = (d1.c) m1Var.f27232a.f30421b;
                            cVar.f21933b = true;
                            cVar.f21932a = false;
                            cVar.a();
                            i16++;
                            i10 = i17;
                        }
                    }
                    int i18 = i10;
                    j >>= i18;
                    i12++;
                    i10 = i18;
                }
                if (i11 != i10) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }
}
