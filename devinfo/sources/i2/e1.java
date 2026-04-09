package i2;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.android.gms.internal.ads.xz;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x.z f25651a;

    static {
        x.z zVar = x.i0.f36903a;
        f25651a = new x.z();
    }

    public static final void a(i1.m mVar, int i4, int i10) {
        if (!(mVar instanceof j)) {
            b(mVar, i4 & mVar.f25556c, i10);
            return;
        }
        j jVar = (j) mVar;
        int i11 = jVar.f25690o;
        b(mVar, i11 & i4, i10);
        int i12 = (~i11) & i4;
        for (i1.m mVar2 = jVar.f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
            a(mVar2, i12, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(i1.m mVar, int i4, int i10) {
        if (i10 != 0 || mVar.c0()) {
            if ((i4 & 2) != 0 && (mVar instanceof u)) {
                k.k((u) mVar);
                if (i10 == 2) {
                    k.q(mVar, 2).L0();
                }
            }
            if ((i4 & 128) != 0 && i10 != 2) {
                k.s(mVar).E();
            }
            if ((4194304 & i4) != 0 && i10 != 2) {
                k.s(mVar).U(false);
            }
            if ((i4 & 256) != 0 && (mVar instanceof m)) {
                if (i10 == 1) {
                    e0 e0VarS = k.s(mVar);
                    e0VarS.a0(e0VarS.Q + 1);
                } else if (i10 == 2) {
                    k.s(mVar).a0(r0.Q - 1);
                }
                if (i10 != 2) {
                    e0 e0VarS2 = k.s(mVar);
                    if (e0VarS2.Q != 0 && !e0VarS2.q() && !e0VarS2.r() && !e0VarS2.P) {
                        j2.r rVar = (j2.r) h0.a(e0VarS2);
                        y4.a aVar = rVar.U.f25780e;
                        aVar.getClass();
                        if (e0VarS2.Q > 0) {
                            ((w0.e) aVar.f37323a).b(e0VarS2);
                            e0VarS2.P = true;
                        }
                        rVar.I(null);
                    }
                }
            }
            if ((i4 & 4) != 0 && (mVar instanceof l)) {
                k.j((l) mVar);
            }
            if ((i4 & 8) != 0 && (mVar instanceof u1)) {
                k.s(mVar).f25643s = true;
            }
            if ((i4 & 64) != 0 && (mVar instanceof p1)) {
                i0 i0Var = k.s((p1) mVar).H;
                i0Var.f25687p.f25795q = true;
                q0 q0Var = i0Var.f25688q;
                if (q0Var != null) {
                    q0Var.f25756w = true;
                }
            }
            if ((i4 & 2048) != 0 && (mVar instanceof n1.o)) {
                n1.o oVar = (n1.o) mVar;
                c.f25586b = null;
                oVar.m(c.f25585a);
                if (c.f25586b != null) {
                    i1.m mVar2 = (i1.m) oVar;
                    if (!mVar2.f25554a.f25565n) {
                        f2.a.b("visitChildren called on an unattached node");
                    }
                    w0.e eVar = new w0.e(new i1.m[16]);
                    i1.m mVar3 = mVar2.f25554a;
                    i1.m mVar4 = mVar3.f25559f;
                    if (mVar4 == null) {
                        k.b(eVar, mVar3);
                    } else {
                        eVar.b(mVar4);
                    }
                    while (true) {
                        int i11 = eVar.f36399c;
                        if (i11 == 0) {
                            break;
                        }
                        i1.m mVarE = (i1.m) eVar.l(i11 - 1);
                        if ((mVarE.f25557d & Segment.SHARE_MINIMUM) == 0) {
                            k.b(eVar, mVarE);
                        } else {
                            while (true) {
                                if (mVarE == null) {
                                    break;
                                }
                                if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                    w0.e eVar2 = null;
                                    while (mVarE != null) {
                                        if (mVarE instanceof n1.s) {
                                            n1.s sVar = (n1.s) mVarE;
                                            n1.e eVar3 = (n1.e) ((xz) ((j2.r) k.t(sVar)).getFocusOwner()).f18587d;
                                            if (eVar3.f29519c.a(sVar)) {
                                                eVar3.a();
                                            }
                                        } else if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof j)) {
                                            int i12 = 0;
                                            for (i1.m mVar5 = ((j) mVarE).f25691p; mVar5 != null; mVar5 = mVar5.f25559f) {
                                                if ((mVar5.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        mVarE = mVar5;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new w0.e(new i1.m[16]);
                                                        }
                                                        if (mVarE != null) {
                                                            eVar2.b(mVarE);
                                                            mVarE = null;
                                                        }
                                                        eVar2.b(mVar5);
                                                    }
                                                }
                                            }
                                            if (i12 == 1) {
                                            }
                                        }
                                        mVarE = k.e(eVar2);
                                    }
                                } else {
                                    mVarE = mVarE.f25559f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i4 & Buffer.SEGMENTING_THRESHOLD) == 0 || !(mVar instanceof b)) {
                return;
            }
            b bVar = (b) mVar;
            n1.e eVar4 = (n1.e) ((xz) ((j2.r) k.t(bVar)).getFocusOwner()).f18587d;
            if (eVar4.f29520d.a(bVar)) {
                eVar4.a();
            }
        }
    }

    public static final void c(i1.m mVar) {
        if (!mVar.f25565n) {
            f2.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(mVar, -1, 0);
    }

    public static final int d(i1.l lVar) {
        int i4 = lVar instanceof c0.r0 ? 5 : 1;
        if (lVar instanceof p2.b) {
            i4 |= 8;
        }
        if (lVar instanceof c2.y) {
            i4 |= 16;
        }
        return lVar instanceof m2.a ? 524288 | i4 : i4;
    }

    public static final int e(i1.m mVar) {
        int i4 = mVar.f25556c;
        if (i4 != 0) {
            return i4;
        }
        Class<?> cls = mVar.getClass();
        x.z zVar = f25651a;
        int iD = zVar.d(cls);
        if (iD >= 0) {
            return zVar.f36967c[iD];
        }
        int i10 = mVar instanceof u ? 3 : 1;
        if (mVar instanceof l) {
            i10 |= 4;
        }
        if (mVar instanceof u1) {
            i10 |= 8;
        }
        if (mVar instanceof r1) {
            i10 |= 16;
        }
        if (mVar instanceof h2.c) {
            i10 |= 32;
        }
        if (mVar instanceof p1) {
            i10 |= 64;
        }
        if (mVar instanceof t) {
            i10 |= 4194432;
        }
        if (mVar instanceof m) {
            i10 |= 256;
        }
        if (mVar instanceof n1.s) {
            i10 |= Segment.SHARE_MINIMUM;
        }
        if (mVar instanceof n1.o) {
            i10 |= 2048;
        }
        if (mVar instanceof b) {
            i10 |= Buffer.SEGMENTING_THRESHOLD;
        }
        if (mVar instanceof a2.b) {
            i10 |= Segment.SIZE;
        }
        if (mVar instanceof j2.j) {
            i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
        }
        if (mVar instanceof h) {
            i10 |= 32768;
        }
        if (mVar instanceof z1) {
            i10 |= 262144;
        }
        if (mVar instanceof m2.a) {
            i10 |= 524288;
        }
        if (mVar instanceof z1.c) {
            i10 |= 2097152;
        }
        if (mVar instanceof j0.p) {
            i10 |= 8388608;
        }
        zVar.g(i10, cls);
        return i10;
    }

    public static final int f(i1.m mVar) {
        if (!(mVar instanceof j)) {
            return e(mVar);
        }
        j jVar = (j) mVar;
        int iF = jVar.f25690o;
        for (i1.m mVar2 = jVar.f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
            iF |= f(mVar2);
        }
        return iF;
    }

    public static final boolean g(int i4) {
        return ((i4 & 128) != 0) | ((i4 & 4194304) != 0);
    }
}
