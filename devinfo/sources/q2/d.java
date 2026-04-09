package q2;

import com.google.android.gms.internal.consent_sdk.a0;
import i2.d1;
import i2.e0;
import i2.h0;
import i2.k;
import j2.r;
import x.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f32161a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.c f32162b;

    /* renamed from: c, reason: collision with root package name */
    public final b7.b f32163c;

    /* renamed from: d, reason: collision with root package name */
    public d f32164d;

    /* renamed from: e, reason: collision with root package name */
    public long f32165e;

    /* renamed from: f, reason: collision with root package name */
    public long f32166f;
    public long g = Long.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f32167h;

    public d(e eVar, int i4, j0.c cVar, b7.b bVar) {
        this.f32167h = eVar;
        this.f32161a = i4;
        this.f32162b = cVar;
        this.f32163c = bVar;
    }

    public final void a(long j, long j8, long j9, long j10, float[] fArr) throws Exception {
        c cVar;
        c cVar2;
        long j11 = this.f32167h.f32173f;
        j0.c cVar3 = this.f32162b;
        d1 d1VarQ = k.q(cVar3, 2);
        e0 e0VarS = k.s(cVar3);
        boolean zI = e0VarS.I();
        a0 a0Var = e0VarS.G;
        if (zI) {
            if (((d1) a0Var.f19258e) != d1VarQ) {
                long jFloatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j12 = d1VarQ.f24410c;
                d1 d1Var = (d1) a0Var.f19258e;
                d1Var.getClass();
                cVar = new c(ii.a.D(d1Var.f(d1VarQ, jFloatToRawIntBits)), (4294967295L & (((int) (r2 & 4294967295L)) + ((int) (j12 & 4294967295L)))) | ((((int) (r2 >> 32)) + ((int) (j12 >> 32))) << 32), j9, j10, j11, fArr, cVar3);
            } else {
                cVar = new c(j, j8, j9, j10, j11, fArr, cVar3);
            }
            cVar2 = cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return;
        }
        this.f32163c.invoke(cVar2);
    }

    public final void b() {
        e eVar = this.f32167h;
        u uVar = eVar.f32168a;
        int i4 = this.f32161a;
        d dVar = (d) uVar.g(i4);
        if (dVar != null) {
            if (dVar.equals(this)) {
                d dVar2 = this.f32164d;
                this.f32164d = null;
                if (dVar2 == null) {
                    e0 e0VarS = k.s(this.f32162b.f25554a);
                    if (e0VarS.f25633h) {
                        ((r) h0.a(e0VarS)).getRectManager().f32147a.n(e0VarS.f25628b, false);
                        return;
                    }
                    return;
                }
                int iD = uVar.d(i4);
                Object[] objArr = uVar.f36906c;
                Object obj = objArr[iD];
                uVar.f36905b[iD] = i4;
                objArr[iD] = dVar2;
                return;
            }
            int iD2 = uVar.d(i4);
            Object[] objArr2 = uVar.f36906c;
            Object obj2 = objArr2[iD2];
            uVar.f36905b[iD2] = i4;
            objArr2[iD2] = dVar;
            while (true) {
                d dVar3 = dVar.f32164d;
                if (dVar3 == null) {
                    break;
                }
                if (dVar3 == this) {
                    dVar.f32164d = this.f32164d;
                    this.f32164d = null;
                    return;
                }
                dVar = dVar3;
            }
        }
        d dVar4 = eVar.f32169b;
        if (dVar4 == this) {
            eVar.f32169b = dVar4.f32164d;
            this.f32164d = null;
            return;
        }
        d dVar5 = dVar4 != null ? dVar4.f32164d : null;
        while (true) {
            d dVar6 = dVar4;
            dVar4 = dVar5;
            if (dVar4 == null) {
                return;
            }
            if (dVar4 == this) {
                if (dVar6 != null) {
                    dVar6.f32164d = dVar4.f32164d;
                }
                this.f32164d = null;
                return;
            }
            dVar5 = dVar4.f32164d;
        }
    }
}
