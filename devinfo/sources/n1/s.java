package n1;

import android.os.Trace;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.consent_sdk.a0;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.play_billing.m1;
import g2.v;
import i2.e0;
import i2.h1;
import i2.w1;
import j2.a1;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends i1.m implements i2.h, i2.t, h1, h2.c, i2.i {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f29549o;

    /* renamed from: p, reason: collision with root package name */
    public final mk.e f29550p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29551q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f29552r;

    /* renamed from: s, reason: collision with root package name */
    public final int f29553s;

    public s(int i4, mk.e eVar, int i10) {
        i4 = (i10 & 1) != 0 ? 1 : i4;
        boolean z3 = (i10 & 2) == 0;
        eVar = (i10 & 4) != 0 ? null : eVar;
        this.f29549o = z3;
        this.f29550p = eVar;
        this.f29553s = i4;
    }

    @Override // h2.c
    public final /* synthetic */ h2.a E() {
        return h2.a.f24810a;
    }

    @Override // i2.h1
    public final void P() {
        v0();
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i1.m
    public final void h0() {
        int iOrdinal = u0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                h focusOwner = ((j2.r) i2.k.t(this)).getFocusOwner();
                s sVarE = z3.e(this);
                if (sVarE == null || !sVarE.f29549o) {
                    return;
                }
                xz xzVar = (xz) focusOwner;
                ((j2.r) xzVar.f18584a).H();
                ((e) xzVar.f18587d).a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new ac.m();
                }
                return;
            }
        }
        xz xzVar2 = (xz) ((j2.r) i2.k.t(this)).getFocusOwner();
        xzVar2.d(8, true, false);
        if (this.f29549o) {
            ((j2.r) xzVar2.f18584a).H();
        }
        ((e) xzVar2.f18587d).a();
    }

    @Override // i1.m
    public final void j0() {
        if (u0().a()) {
            ((xz) ((j2.r) i2.k.t(this)).getFocusOwner()).d(8, true, true);
        }
    }

    public final boolean p0(int i4) {
        int iOrdinal = com.bumptech.glide.f.u(this, i4).ordinal();
        if (iOrdinal == 0) {
            return com.bumptech.glide.f.v(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new ac.m();
    }

    public final void q0(q qVar, q qVar2) {
        a0 a0Var;
        mk.e eVar;
        xz xzVar = (xz) ((j2.r) i2.k.t(this)).getFocusOwner();
        s sVarH = xzVar.h();
        if (!qVar.equals(qVar2) && (eVar = this.f29550p) != null) {
            eVar.invoke(qVar, qVar2);
        }
        i1.m mVar = this.f25554a;
        if (!mVar.f25565n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        i1.m mVar2 = this.f25554a;
        e0 e0VarS = i2.k.s(this);
        while (e0VarS != null) {
            if ((((i1.m) e0VarS.G.g).f25557d & 5120) != 0) {
                while (mVar2 != null) {
                    int i4 = mVar2.f25556c;
                    if ((i4 & 5120) != 0) {
                        if (mVar2 != mVar && (i4 & Segment.SHARE_MINIMUM) != 0) {
                            return;
                        }
                        if ((i4 & Buffer.SEGMENTING_THRESHOLD) != 0) {
                            i1.m mVarE = mVar2;
                            w0.e eVar2 = null;
                            while (mVarE != null) {
                                if (mVarE instanceof i2.b) {
                                    i2.b bVar = (i2.b) mVarE;
                                    if (sVarH == xzVar.h()) {
                                        bVar.q0();
                                        throw null;
                                    }
                                } else if ((mVarE.f25556c & Buffer.SEGMENTING_THRESHOLD) != 0 && (mVarE instanceof i2.j)) {
                                    int i10 = 0;
                                    for (i1.m mVar3 = ((i2.j) mVarE).f25691p; mVar3 != null; mVar3 = mVar3.f25559f) {
                                        if ((mVar3.f25556c & Buffer.SEGMENTING_THRESHOLD) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                mVarE = mVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new w0.e(new i1.m[16]);
                                                }
                                                if (mVarE != null) {
                                                    eVar2.b(mVarE);
                                                    mVarE = null;
                                                }
                                                eVar2.b(mVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                mVarE = i2.k.e(eVar2);
                            }
                        } else {
                            continue;
                        }
                    }
                    mVar2 = mVar2.f25558e;
                }
            }
            e0VarS = e0VarS.v();
            mVar2 = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [w0.e] */
    public final n r0() {
        boolean z3;
        a0 a0Var;
        n nVar = new n();
        nVar.f29530a = true;
        p pVar = p.f29540b;
        nVar.f29531b = pVar;
        nVar.f29532c = pVar;
        nVar.f29533d = pVar;
        nVar.f29534e = pVar;
        nVar.f29535f = pVar;
        nVar.g = pVar;
        nVar.f29536h = pVar;
        nVar.f29537i = pVar;
        nVar.j = m.f29527b;
        nVar.f29538k = m.f29528c;
        nVar.f29539l = k.f29526a;
        int i4 = this.f29553s;
        if (i4 == 1) {
            z3 = true;
        } else if (i4 == 0) {
            z3 = !(((y1.a) ((y1.c) ((y1.b) i2.k.h(this, a1.f27078m))).f37314a.getValue()).f37313a == 1);
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z3 = false;
        }
        nVar.f29530a = z3;
        i1.m mVar = this.f25554a;
        if (!mVar.f25565n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        i1.m mVar2 = this.f25554a;
        e0 e0VarS = i2.k.s(this);
        loop0: while (e0VarS != null) {
            if ((((i1.m) e0VarS.G.g).f25557d & 3072) != 0) {
                while (mVar2 != null) {
                    int i10 = mVar2.f25556c;
                    if ((i10 & 3072) != 0) {
                        if (mVar2 != mVar && (i10 & Segment.SHARE_MINIMUM) != 0) {
                            break loop0;
                        }
                        if ((i10 & 2048) != 0) {
                            i2.j jVarE = mVar2;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof o) {
                                    ((o) jVarE).m(nVar);
                                } else if ((jVarE.f25556c & 2048) != 0 && (jVarE instanceof i2.j)) {
                                    i1.m mVar3 = jVarE.f25691p;
                                    int i11 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar3 != null) {
                                        if ((mVar3.f25556c & 2048) != 0) {
                                            i11++;
                                            eVar = eVar;
                                            if (i11 == 1) {
                                                jVarE = mVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new i1.m[16]);
                                                }
                                                if (jVarE != 0) {
                                                    eVar.b(jVarE);
                                                    jVarE = 0;
                                                }
                                                eVar.b(mVar3);
                                            }
                                        }
                                        mVar3 = mVar3.f25559f;
                                        jVarE = jVarE;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                jVarE = i2.k.e(eVar);
                            }
                        }
                    }
                    mVar2 = mVar2.f25558e;
                }
            }
            e0VarS = e0VarS.v();
            mVar2 = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
        }
        return nVar;
    }

    public final o1.c s0(v vVar) {
        o1.c cVar = r0().f29539l;
        return cVar != k.f29526a ? vVar == null ? cVar : cVar.f(vVar.f(i2.k.r(this), 0L)) : vVar != null ? vVar.r(i2.k.r(this), false) : com.bumptech.glide.e.i(0L, t1.F(i2.k.r(this).f24410c));
    }

    public final j0.p t0() {
        a0 a0Var;
        Object obj;
        if (!this.f25554a.f25565n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        i1.m mVar = this.f25554a.f25558e;
        e0 e0VarS = i2.k.s(this);
        while (true) {
            if (e0VarS == null) {
                break;
            }
            if ((((i1.m) e0VarS.G.g).f25557d & 8388640) != 0) {
                while (mVar != null) {
                    int i4 = mVar.f25556c;
                    if ((i4 & 8388640) != 0) {
                        if ((8388608 & i4) != 0) {
                            if (!(mVar instanceof j0.p)) {
                                if (mVar instanceof i2.j) {
                                    i1.m mVar2 = null;
                                    for (i1.m mVar3 = ((i2.j) mVar).f25691p; mVar3 != null; mVar3 = mVar3.f25559f) {
                                        if (mVar3 instanceof j0.p) {
                                            mVar2 = mVar3;
                                        }
                                    }
                                    mVar = mVar2;
                                } else {
                                    mVar = null;
                                }
                            }
                            j0.p pVar = (j0.p) mVar;
                            if (pVar != null) {
                                return pVar;
                            }
                        } else if ((i4 & 32) != 0) {
                            if (mVar instanceof h2.c) {
                                obj = mVar;
                            } else if (mVar instanceof i2.j) {
                                obj = null;
                                for (i1.m mVar4 = ((i2.j) mVar).f25691p; mVar4 != null; mVar4 = mVar4.f25559f) {
                                    if (mVar4 instanceof h2.c) {
                                        obj = mVar4;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            h2.c cVar = (h2.c) obj;
                            if (cVar != null) {
                                cVar.E().getClass();
                            }
                        }
                    }
                    mVar = mVar.f25558e;
                }
            }
            e0VarS = e0VarS.v();
            mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
        }
        return null;
    }

    public final q u0() {
        s sVarH;
        a0 a0Var;
        boolean z3 = this.f25565n;
        q qVar = q.f29546c;
        if (!z3 || (sVarH = ((xz) ((j2.r) i2.k.t(this)).getFocusOwner()).h()) == null) {
            return qVar;
        }
        if (this == sVarH) {
            return q.f29544a;
        }
        if (sVarH.f25565n) {
            if (!sVarH.f25554a.f25565n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            i1.m mVar = sVarH.f25554a.f25558e;
            e0 e0VarS = i2.k.s(sVarH);
            while (e0VarS != null) {
                if ((((i1.m) e0VarS.G.g).f25557d & Segment.SHARE_MINIMUM) != 0) {
                    while (mVar != null) {
                        if ((mVar.f25556c & Segment.SHARE_MINIMUM) != 0) {
                            i1.m mVarE = mVar;
                            w0.e eVar = null;
                            while (mVarE != null) {
                                if (mVarE instanceof s) {
                                    if (this == ((s) mVarE)) {
                                        return q.f29545b;
                                    }
                                } else if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof i2.j)) {
                                    int i4 = 0;
                                    for (i1.m mVar2 = ((i2.j) mVarE).f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
                                        if ((mVar2.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                mVarE = mVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new w0.e(new i1.m[16]);
                                                }
                                                if (mVarE != null) {
                                                    eVar.b(mVarE);
                                                    mVarE = null;
                                                }
                                                eVar.b(mVar2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                mVarE = i2.k.e(eVar);
                            }
                        }
                        mVar = mVar.f25558e;
                    }
                }
                e0VarS = e0VarS.v();
                mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
            }
        }
        return qVar;
    }

    public final void v0() {
        int iOrdinal = u0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new ac.m();
                }
                return;
            }
        }
        nk.u uVar = new nk.u();
        i2.k.p(this, new c2.c(13, uVar, this));
        Object obj = uVar.f29986a;
        if (obj == null) {
            nk.k.k("focusProperties");
            throw null;
        }
        if (((l) obj).a()) {
            return;
        }
        ((xz) ((j2.r) i2.k.t(this)).getFocusOwner()).d(8, true, true);
    }

    public final boolean w0(int i4) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zP0 = r0().f29530a ? p0(i4) : m1.l(this, i4, new j2.p(i4, 3));
            Trace.endSection();
            return zP0;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // i2.t
    public final /* synthetic */ void g(long j) {
    }

    @Override // i2.t
    public final void w(v vVar) {
    }
}
