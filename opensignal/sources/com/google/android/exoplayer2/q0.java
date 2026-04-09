package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4400a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4401b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4402c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4403d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4404e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4405f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f4406g;

    /* renamed from: h, reason: collision with root package name */
    public long f4407h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f4408i;
    public Object j;
    public final Object[] k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4409l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f4410m;

    /* renamed from: n, reason: collision with root package name */
    public Object f4411n;

    /* renamed from: o, reason: collision with root package name */
    public Object f4412o;

    /* renamed from: p, reason: collision with root package name */
    public Object f4413p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [ya.d] */
    public q0(l1[] l1VarArr, long j, ob.m mVar, pb.b bVar, x0 x0Var, r0 r0Var, ob.n nVar) {
        this.k = l1VarArr;
        this.f4407h = j;
        this.f4409l = mVar;
        this.f4410m = x0Var;
        ya.v vVar = r0Var.f4421a;
        this.f4402c = vVar.f26177a;
        this.j = r0Var;
        this.f4412o = TrackGroupArray.f4456r;
        this.f4413p = nVar;
        this.f4408i = new ya.s0[l1VarArr.length];
        this.f4406g = new boolean[l1VarArr.length];
        long j7 = r0Var.f4422b;
        long j10 = r0Var.f4424d;
        x0Var.getClass();
        Pair pair = (Pair) vVar.f26177a;
        Object obj = pair.first;
        ya.v vVarB = vVar.b(pair.second);
        w0 w0Var = (w0) ((HashMap) x0Var.f4780d).get(obj);
        w0Var.getClass();
        ((HashSet) x0Var.f4785i).add(w0Var);
        v0 v0Var = (v0) ((HashMap) x0Var.f4781e).get(w0Var);
        if (v0Var != null) {
            v0Var.f4735a.enable(v0Var.f4736b);
        }
        w0Var.f4771c.add(vVarB);
        ya.n nVarCreatePeriod = w0Var.f4769a.createPeriod(vVarB, bVar, j7);
        ((IdentityHashMap) x0Var.f4779c).put(nVarCreatePeriod, w0Var);
        x0Var.e();
        this.f4401b = j10 != -9223372036854775807L ? new ya.d(nVarCreatePeriod, j10) : nVarCreatePeriod;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o5.x] */
    public long a(androidx.media3.exoplayer.trackselection.c0 c0Var, long j, boolean z10, boolean[] zArr) {
        d5.v0[] v0VarArr = (d5.v0[]) this.k;
        o5.x0[] x0VarArr = (o5.x0[]) this.f4408i;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c0Var.f1877a) {
                break;
            }
            if (z10 || !c0Var.a((androidx.media3.exoplayer.trackselection.c0) this.f4413p, i10)) {
                z11 = false;
            }
            this.f4406g[i10] = z11;
            i10++;
        }
        for (int i11 = 0; i11 < v0VarArr.length; i11++) {
            if (((d5.b) v0VarArr[i11]).f6925a == -2) {
                x0VarArr[i11] = null;
            }
        }
        c();
        this.f4413p = c0Var;
        d();
        long jC = this.f4401b.C(c0Var.f1879c, this.f4406g, (o5.x0[]) this.f4408i, zArr, j);
        for (int i12 = 0; i12 < v0VarArr.length; i12++) {
            if (((d5.b) v0VarArr[i12]).f6925a == -2 && ((androidx.media3.exoplayer.trackselection.c0) this.f4413p).b(i12)) {
                x0VarArr[i12] = new o5.n();
            }
        }
        this.f4404e = false;
        for (int i13 = 0; i13 < x0VarArr.length; i13++) {
            if (x0VarArr[i13] != null) {
                a5.a.i(c0Var.b(i13));
                if (((d5.b) v0VarArr[i13]).f6925a != -2) {
                    this.f4404e = true;
                }
            } else {
                a5.a.i(c0Var.f1879c[i13] == null);
            }
        }
        return jC;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, ya.t] */
    public long b(ob.n nVar, long j, boolean z10, boolean[] zArr) {
        l1[] l1VarArr = (l1[]) this.k;
        ya.s0[] s0VarArr = (ya.s0[]) this.f4408i;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= nVar.f19270a) {
                break;
            }
            if (z10 || !nVar.a((ob.n) this.f4413p, i10)) {
                z11 = false;
            }
            this.f4406g[i10] = z11;
            i10++;
        }
        for (int i11 = 0; i11 < l1VarArr.length; i11++) {
            if (((g) l1VarArr[i11]).f4136a == 7) {
                s0VarArr[i11] = null;
            }
        }
        c();
        this.f4413p = nVar;
        d();
        long jS = this.f4401b.s(nVar.f19272c, this.f4406g, (ya.s0[]) this.f4408i, zArr, j);
        for (int i12 = 0; i12 < l1VarArr.length; i12++) {
            if (((g) l1VarArr[i12]).f4136a == 7 && ((ob.n) this.f4413p).b(i12)) {
                s0VarArr[i12] = new ya.j();
            }
        }
        this.f4404e = false;
        for (int i13 = 0; i13 < s0VarArr.length; i13++) {
            if (s0VarArr[i13] != null) {
                qb.b.j(nVar.b(i13));
                if (((g) l1VarArr[i13]).f4136a != 7) {
                    this.f4404e = true;
                }
            } else {
                qb.b.j(nVar.f19272c[i13] == null);
            }
        }
        return jS;
    }

    public final void c() {
        switch (this.f4400a) {
            case 0:
                if (((q0) this.f4411n) == null) {
                    int i10 = 0;
                    while (true) {
                        ob.n nVar = (ob.n) this.f4413p;
                        if (i10 >= nVar.f19270a) {
                            break;
                        } else {
                            boolean zB = nVar.b(i10);
                            ob.f fVar = ((ob.n) this.f4413p).f19272c[i10];
                            if (zB && fVar != null) {
                                fVar.d();
                            }
                            i10++;
                        }
                    }
                }
                break;
            default:
                if (((q0) this.f4411n) == null) {
                    int i11 = 0;
                    while (true) {
                        androidx.media3.exoplayer.trackselection.c0 c0Var = (androidx.media3.exoplayer.trackselection.c0) this.f4413p;
                        if (i11 >= c0Var.f1877a) {
                            break;
                        } else {
                            boolean zB2 = c0Var.b(i11);
                            androidx.media3.exoplayer.trackselection.v vVar = ((androidx.media3.exoplayer.trackselection.c0) this.f4413p).f1879c[i11];
                            if (zB2 && vVar != null) {
                                vVar.d();
                            }
                            i11++;
                        }
                    }
                }
                break;
        }
    }

    public final void d() {
        switch (this.f4400a) {
            case 0:
                if (((q0) this.f4411n) == null) {
                    int i10 = 0;
                    while (true) {
                        ob.n nVar = (ob.n) this.f4413p;
                        if (i10 >= nVar.f19270a) {
                            break;
                        } else {
                            boolean zB = nVar.b(i10);
                            ob.f fVar = ((ob.n) this.f4413p).f19272c[i10];
                            if (zB && fVar != null) {
                                fVar.b();
                            }
                            i10++;
                        }
                    }
                }
                break;
            default:
                if (((q0) this.f4411n) == null) {
                    int i11 = 0;
                    while (true) {
                        androidx.media3.exoplayer.trackselection.c0 c0Var = (androidx.media3.exoplayer.trackselection.c0) this.f4413p;
                        if (i11 >= c0Var.f1877a) {
                            break;
                        } else {
                            boolean zB2 = c0Var.b(i11);
                            androidx.media3.exoplayer.trackselection.v vVar = ((androidx.media3.exoplayer.trackselection.c0) this.f4413p).f1879c[i11];
                            if (zB2 && vVar != null) {
                                vVar.b();
                            }
                            i11++;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, o5.z0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, ya.u0] */
    public final long e() {
        switch (this.f4400a) {
            case 0:
                if (!this.f4403d) {
                    return ((r0) this.j).f4422b;
                }
                long jM = this.f4404e ? this.f4401b.m() : Long.MIN_VALUE;
                return jM == Long.MIN_VALUE ? ((r0) this.j).f4425e : jM;
            default:
                if (!this.f4403d) {
                    return ((d5.g0) this.j).f6989b;
                }
                long jM2 = this.f4404e ? this.f4401b.m() : Long.MIN_VALUE;
                return jM2 == Long.MIN_VALUE ? ((d5.g0) this.j).f6992e : jM2;
        }
    }

    public final long f() {
        long j;
        long j7;
        switch (this.f4400a) {
            case 0:
                j = ((r0) this.j).f4422b;
                j7 = this.f4407h;
                break;
            default:
                j = ((d5.g0) this.j).f6989b;
                j7 = this.f4407h;
                break;
        }
        return j + j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ya.t] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ya.t] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o5.x] */
    public final void g() {
        switch (this.f4400a) {
            case 0:
                c();
                x0 x0Var = (x0) this.f4410m;
                ?? r12 = this.f4401b;
                try {
                    if (r12 instanceof ya.d) {
                        x0Var.h(((ya.d) r12).f26042a);
                    } else {
                        x0Var.h(r12);
                    }
                    break;
                } catch (RuntimeException e4) {
                    qb.b.q("MediaPeriodHolder", "Period release failed.", e4);
                    return;
                }
            default:
                c();
                d5.o0 o0Var = (d5.o0) this.f4410m;
                ?? r13 = this.f4401b;
                try {
                    if (r13 instanceof o5.d) {
                        o0Var.h(((o5.d) r13).f18907a);
                    } else {
                        o0Var.h(r13);
                    }
                    break;
                } catch (RuntimeException e10) {
                    a5.a.n("MediaPeriodHolder", "Period release failed.", e10);
                    return;
                }
        }
    }

    public androidx.media3.exoplayer.trackselection.c0 h(float f10, androidx.media3.common.a1 a1Var) {
        androidx.media3.exoplayer.trackselection.c0 c0VarSelectTracks = ((androidx.media3.exoplayer.trackselection.b0) this.f4409l).selectTracks((d5.v0[]) this.k, (o5.h1) this.f4412o, ((d5.g0) this.j).f6988a, a1Var);
        for (androidx.media3.exoplayer.trackselection.v vVar : c0VarSelectTracks.f1879c) {
            if (vVar != null) {
                vVar.f(f10);
            }
        }
        return c0VarSelectTracks;
    }

    public ob.n i(float f10, w1 w1Var) {
        ob.n nVarSelectTracks = ((ob.m) this.f4409l).selectTracks((l1[]) this.k, (TrackGroupArray) this.f4412o, ((r0) this.j).f4421a, w1Var);
        for (ob.f fVar : nVarSelectTracks.f19272c) {
            if (fVar != null) {
                fVar.f(f10);
            }
        }
        return nVarSelectTracks;
    }

    public final void j() {
        switch (this.f4400a) {
            case 0:
                Object obj = this.f4401b;
                if (obj instanceof ya.d) {
                    long j = ((r0) this.j).f4424d;
                    if (j == -9223372036854775807L) {
                        j = Long.MIN_VALUE;
                    }
                    ((ya.d) obj).f26046x = j;
                    break;
                }
                break;
            default:
                Object obj2 = this.f4401b;
                if (obj2 instanceof o5.d) {
                    long j7 = ((d5.g0) this.j).f6991d;
                    if (j7 == -9223372036854775807L) {
                        j7 = Long.MIN_VALUE;
                    }
                    o5.d dVar = (o5.d) obj2;
                    dVar.f18911x = 0L;
                    dVar.f18912y = j7;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o5.d] */
    public q0(d5.v0[] v0VarArr, long j, androidx.media3.exoplayer.trackselection.b0 b0Var, r5.b bVar, d5.o0 o0Var, d5.g0 g0Var, androidx.media3.exoplayer.trackselection.c0 c0Var) {
        this.k = v0VarArr;
        this.f4407h = j;
        this.f4409l = b0Var;
        this.f4410m = o0Var;
        o5.z zVar = g0Var.f6988a;
        this.f4402c = zVar.f1689a;
        this.j = g0Var;
        this.f4412o = o5.h1.f18956r;
        this.f4413p = c0Var;
        this.f4408i = new o5.x0[v0VarArr.length];
        this.f4406g = new boolean[v0VarArr.length];
        long j7 = g0Var.f6989b;
        long j10 = g0Var.f6991d;
        o0Var.getClass();
        Object obj = zVar.f1689a;
        int i10 = d5.t0.G;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        o5.z zVarB = zVar.b(pair.second);
        d5.n0 n0Var = (d5.n0) ((HashMap) o0Var.f7048e).get(obj2);
        n0Var.getClass();
        ((HashSet) o0Var.f7051h).add(n0Var);
        d5.m0 m0Var = (d5.m0) ((HashMap) o0Var.f7049f).get(n0Var);
        if (m0Var != null) {
            m0Var.f7033a.enable(m0Var.f7034b);
        }
        n0Var.f7038c.add(zVarB);
        o5.r rVarCreatePeriod = n0Var.f7036a.createPeriod(zVarB, bVar, j7);
        ((IdentityHashMap) o0Var.f7047d).put(rVarCreatePeriod, n0Var);
        o0Var.d();
        this.f4401b = j10 != -9223372036854775807L ? new o5.d(rVarCreatePeriod, true, 0L, j10) : rVarCreatePeriod;
    }
}
