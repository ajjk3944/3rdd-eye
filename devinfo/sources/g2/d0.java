package g2;

import i2.y1;
import i2.z1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final x.v f24320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f24321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24322c;

    public d0(f0 f0Var, Object obj) {
        this.f24321b = f0Var;
        this.f24322c = obj;
        int[] iArr = x.l.f36913a;
        this.f24320a = new x.v();
    }

    @Override // g2.a1
    public final void a() {
        f0.c(this.f24321b, this.f24322c);
    }

    @Override // g2.a1
    public final int b() {
        i2.e0 e0Var = (i2.e0) this.f24321b.j.g(this.f24322c);
        if (e0Var != null) {
            return ((w0.b) e0Var.o()).f36391a.f36399c;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [b7.u] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // g2.a1
    public final void c(b7.u uVar) throws Exception {
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        i1.m mVar;
        y1 y1Var;
        i2.e0 e0Var = (i2.e0) this.f24321b.j.g(this.f24322c);
        if (e0Var == null || (a0Var = e0Var.G) == null || (mVar = (i1.m) a0Var.g) == null) {
            return;
        }
        if (!mVar.f25554a.f25565n) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        w0.e eVar = new w0.e(new i1.m[16]);
        i1.m mVar2 = mVar.f25554a;
        i1.m mVar3 = mVar2.f25559f;
        if (mVar3 == null) {
            i2.k.b(eVar, mVar2);
        } else {
            eVar.b(mVar3);
        }
        while (true) {
            int i4 = eVar.f36399c;
            if (i4 == 0) {
                return;
            }
            i1.m mVar4 = (i1.m) eVar.l(i4 - 1);
            if ((mVar4.f25557d & 262144) != 0) {
                for (i1.m mVar5 = mVar4; mVar5 != null && mVar5.f25565n; mVar5 = mVar5.f25559f) {
                    if ((mVar5.f25556c & 262144) != 0) {
                        i2.j jVarE = mVar5;
                        ?? eVar2 = 0;
                        while (jVarE != 0) {
                            if (jVarE instanceof z1) {
                                z1 z1Var = (z1) jVarE;
                                boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(z1Var.e());
                                y1 y1Var2 = y1.f25817b;
                                if (zEquals) {
                                    uVar.invoke(z1Var);
                                    y1Var = y1Var2;
                                } else {
                                    y1Var = y1.f25816a;
                                }
                                if (y1Var == y1.f25818c) {
                                    return;
                                }
                                if (y1Var == y1Var2) {
                                    break;
                                }
                            } else if ((jVarE.f25556c & 262144) != 0 && (jVarE instanceof i2.j)) {
                                i1.m mVar6 = jVarE.f25691p;
                                int i10 = 0;
                                jVarE = jVarE;
                                eVar2 = eVar2;
                                while (mVar6 != null) {
                                    if ((mVar6.f25556c & 262144) != 0) {
                                        i10++;
                                        eVar2 = eVar2;
                                        if (i10 == 1) {
                                            jVarE = mVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new w0.e(new i1.m[16]);
                                            }
                                            if (jVarE != 0) {
                                                eVar2.b(jVarE);
                                                jVarE = 0;
                                            }
                                            eVar2.b(mVar6);
                                        }
                                    }
                                    mVar6 = mVar6.f25559f;
                                    jVarE = jVarE;
                                    eVar2 = eVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            jVarE = i2.k.e(eVar2);
                        }
                    }
                }
            }
            i2.k.b(eVar, mVar4);
        }
    }

    @Override // g2.a1
    public final void d(int i4, long j) {
        f0 f0Var = this.f24321b;
        i2.e0 e0Var = (i2.e0) f0Var.j.g(this.f24322c);
        if (e0Var == null || !e0Var.H()) {
            return;
        }
        int i10 = ((w0.b) e0Var.o()).f36391a.f36399c;
        if (i4 < 0 || i4 >= i10) {
            f2.a.d("Index (" + i4 + ") is out of bound of [0, " + i10 + ')');
        }
        if (e0Var.I()) {
            f2.a.a("Pre-measure called on node that is not placed");
        }
        i2.e0 e0Var2 = f0Var.f24329a;
        e0Var2.f25642r = true;
        ((j2.r) i2.h0.a(e0Var)).x((i2.e0) ((w0.b) e0Var.o()).get(i4), j);
        e0Var2.f25642r = false;
        this.f24320a.a(i4);
    }
}
