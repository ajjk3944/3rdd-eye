package x1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 implements t2.c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f24864b;

    /* renamed from: c, reason: collision with root package name */
    public long f24865c = 9223372034707292159L;

    /* renamed from: d, reason: collision with root package name */
    public long f24866d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f24867e;

    public j0(m0 m0Var) {
        this.f24867e = m0Var;
    }

    public final void a(v1.j jVar, float f10) {
        m0 m0Var = this.f24867e;
        h7.b bVar = m0Var.f24887m;
        if (bVar == null) {
            bVar = new h7.b();
            m0Var.f24887m = bVar;
        }
        int iR0 = mq.l.r0(jVar, (v1.j[]) bVar.f10000b);
        if (iR0 >= 0) {
            float[] fArr = (float[]) bVar.f10001c;
            if (fArr[iR0] != f10) {
                fArr[iR0] = f10;
                ((byte[]) bVar.f10002d)[iR0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) bVar.f10002d;
                if (bArr[iR0] == 2) {
                    bArr[iR0] = 0;
                    return;
                }
                return;
            }
        }
        int i10 = bVar.f9999a;
        v1.j[] jVarArr = (v1.j[]) bVar.f10000b;
        if (i10 == jVarArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(jVarArr, i11);
            br.l.d(objArrCopyOf, "copyOf(...)");
            bVar.f10000b = (v1.j[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) bVar.f10001c, i11);
            br.l.d(fArrCopyOf, "copyOf(...)");
            bVar.f10001c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) bVar.f10002d, i11);
            br.l.d(bArrCopyOf, "copyOf(...)");
            bVar.f10002d = bArrCopyOf;
        }
        ((v1.j[]) bVar.f10000b)[i10] = jVar;
        ((byte[]) bVar.f10002d)[i10] = 3;
        ((float[]) bVar.f10001c)[i10] = f10;
        bVar.f9999a++;
    }

    @Override // t2.c
    public final float getDensity() {
        return this.f24867e.getDensity();
    }

    @Override // t2.c
    public final float y() {
        return this.f24867e.y();
    }
}
