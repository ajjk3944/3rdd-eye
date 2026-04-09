package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class d2 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10291a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10292b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10293c;

    public /* synthetic */ d2(Object obj, long j, int i4) {
        this.f10291a = i4;
        this.f10293c = obj;
        this.f10292b = j;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        switch (this.f10291a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        switch (this.f10291a) {
        }
        return this.f10292b;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        int i4 = this.f10291a;
        int i10 = 1;
        Object obj = this.f10293c;
        switch (i4) {
            case 0:
                e2 e2Var = (e2) obj;
                rt rtVar = e2Var.f10676k;
                rtVar.getClass();
                String str = bq0.f9768a;
                long jMax = Math.max(0L, Math.min((e2Var.f10672e * j) / 1000000, e2Var.j - 1));
                long[] jArr = (long[]) rtVar.f15753b;
                int iQ = bq0.q(jArr, jMax, false);
                long j8 = iQ == -1 ? 0L : jArr[iQ];
                long[] jArr2 = (long[]) rtVar.f15754c;
                long j9 = iQ != -1 ? jArr2[iQ] : 0L;
                int i11 = e2Var.f10672e;
                long j10 = (j8 * 1000000) / i11;
                long j11 = this.f10292b;
                n2 n2Var = new n2(j10, j9 + j11);
                if (j10 == j || iQ == jArr.length - 1) {
                    return new l2(n2Var, n2Var);
                }
                int i12 = iQ + 1;
                return new l2(n2Var, new n2((jArr[i12] * 1000000) / i11, j11 + jArr2[i12]));
            case 1:
                return (l2) obj;
            default:
                z2 z2Var = (z2) obj;
                l2 l2VarA = z2Var.f18970i[0].a(j);
                while (true) {
                    c3[] c3VarArr = z2Var.f18970i;
                    if (i10 >= c3VarArr.length) {
                        return l2VarA;
                    }
                    l2 l2VarA2 = c3VarArr[i10].a(j);
                    if (l2VarA2.f13331a.f14131b < l2VarA.f13331a.f14131b) {
                        l2VarA = l2VarA2;
                    }
                    i10++;
                }
        }
    }

    public d2(long j, long j8) {
        this.f10291a = 1;
        this.f10292b = j;
        n2 n2Var = j8 == 0 ? n2.f14129c : new n2(0L, j8);
        this.f10293c = new l2(n2Var, n2Var);
    }
}
