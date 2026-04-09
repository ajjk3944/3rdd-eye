package ya;

import com.google.android.exoplayer2.n1;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import p.l2;

/* loaded from: classes.dex */
public final class f0 implements t, s {
    public t[] B;
    public l2 D;

    /* renamed from: a, reason: collision with root package name */
    public final t[] f26057a;

    /* renamed from: d, reason: collision with root package name */
    public final IdentityHashMap f26058d;

    /* renamed from: g, reason: collision with root package name */
    public final h f26059g;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f26060r = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public s f26061x;

    /* renamed from: y, reason: collision with root package name */
    public TrackGroupArray f26062y;

    public f0(sm.m mVar, long[] jArr, t... tVarArr) {
        this.f26059g = mVar;
        this.f26057a = tVarArr;
        mVar.getClass();
        this.D = new l2(27, new u0[0]);
        this.f26058d = new IdentityHashMap();
        this.B = new t[0];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            long j = jArr[i10];
            if (j != 0) {
                this.f26057a[i10] = new d0(tVarArr[i10], j);
            }
        }
    }

    @Override // ya.s
    public final void b(t tVar) {
        ArrayList arrayList = this.f26060r;
        arrayList.remove(tVar);
        if (arrayList.isEmpty()) {
            t[] tVarArr = this.f26057a;
            int i10 = 0;
            for (t tVar2 : tVarArr) {
                i10 += tVar2.l().f4457a;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i10];
            int i11 = 0;
            for (t tVar3 : tVarArr) {
                TrackGroupArray trackGroupArrayL = tVar3.l();
                int i12 = trackGroupArrayL.f4457a;
                int i13 = 0;
                while (i13 < i12) {
                    trackGroupArr[i11] = trackGroupArrayL.f4458d[i13];
                    i13++;
                    i11++;
                }
            }
            this.f26062y = new TrackGroupArray(trackGroupArr);
            s sVar = this.f26061x;
            sVar.getClass();
            sVar.b(this);
        }
    }

    @Override // ya.t0
    public final void c(u0 u0Var) {
        s sVar = this.f26061x;
        sVar.getClass();
        sVar.c(this);
    }

    @Override // ya.u0
    public final long d() {
        return this.D.d();
    }

    @Override // ya.t
    public final void e() {
        for (t tVar : this.f26057a) {
            tVar.e();
        }
    }

    @Override // ya.t
    public final long f(long j) {
        long jF = this.B[0].f(j);
        int i10 = 1;
        while (true) {
            t[] tVarArr = this.B;
            if (i10 >= tVarArr.length) {
                return jF;
            }
            if (tVarArr[i10].f(jF) != jF) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // ya.t
    public final void g(long j) {
        for (t tVar : this.B) {
            tVar.g(j);
        }
    }

    @Override // ya.u0
    public final boolean i(long j) {
        ArrayList arrayList = this.f26060r;
        if (arrayList.isEmpty()) {
            return this.D.i(j);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) arrayList.get(i10)).i(j);
        }
        return false;
    }

    @Override // ya.u0
    public final boolean isLoading() {
        return this.D.isLoading();
    }

    @Override // ya.t
    public final long k() {
        long j = -9223372036854775807L;
        for (t tVar : this.B) {
            long jK = tVar.k();
            if (jK == -9223372036854775807L) {
                if (j != -9223372036854775807L && tVar.f(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (t tVar2 : this.B) {
                    if (tVar2 == tVar) {
                        break;
                    }
                    if (tVar2.f(jK) != jK) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jK;
            } else if (jK != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // ya.t
    public final TrackGroupArray l() {
        TrackGroupArray trackGroupArray = this.f26062y;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    @Override // ya.u0
    public final long m() {
        return this.D.m();
    }

    @Override // ya.u0
    public final void o(long j) {
        this.D.o(j);
    }

    @Override // ya.t
    public final long p(long j, n1 n1Var) {
        t[] tVarArr = this.B;
        return (tVarArr.length > 0 ? tVarArr[0] : this.f26057a[0]).p(j, n1Var);
    }

    @Override // ya.t
    public final long s(ob.f[] fVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        t[] tVarArr;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        int i10 = 0;
        while (true) {
            int length = fVarArr.length;
            identityHashMap = this.f26058d;
            tVarArr = this.f26057a;
            if (i10 >= length) {
                break;
            }
            s0 s0Var = s0VarArr[i10];
            Integer num = s0Var == null ? null : (Integer) identityHashMap.get(s0Var);
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            ob.f fVar = fVarArr[i10];
            if (fVar != null) {
                TrackGroup trackGroup = ((ob.c) fVar).f19228a;
                int i11 = 0;
                while (true) {
                    if (i11 >= tVarArr.length) {
                        break;
                    }
                    if (tVarArr[i11].l().d(trackGroup) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = fVarArr.length;
        s0[] s0VarArr2 = new s0[length2];
        s0[] s0VarArr3 = new s0[fVarArr.length];
        ob.f[] fVarArr2 = new ob.f[fVarArr.length];
        ArrayList arrayList = new ArrayList(tVarArr.length);
        long j7 = j;
        int i12 = 0;
        while (i12 < tVarArr.length) {
            for (int i13 = 0; i13 < fVarArr.length; i13++) {
                s0VarArr3[i13] = iArr[i13] == i12 ? s0VarArr[i13] : null;
                fVarArr2[i13] = iArr2[i13] == i12 ? fVarArr[i13] : null;
            }
            int i14 = i12;
            long jS = tVarArr[i14].s(fVarArr2, zArr, s0VarArr3, zArr2, j7);
            if (i14 == 0) {
                j7 = jS;
            } else if (jS != j7) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < fVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    s0 s0Var2 = s0VarArr3[i15];
                    s0Var2.getClass();
                    s0VarArr2[i15] = s0VarArr3[i15];
                    identityHashMap.put(s0Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    qb.b.j(s0VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(tVarArr[i14]);
            }
            i12 = i14 + 1;
        }
        System.arraycopy(s0VarArr2, 0, s0VarArr, 0, length2);
        t[] tVarArr2 = (t[]) arrayList.toArray(new t[0]);
        this.B = tVarArr2;
        ((sm.m) this.f26059g).getClass();
        this.D = new l2(27, tVarArr2);
        return j7;
    }

    @Override // ya.t
    public final void u(s sVar, long j) {
        this.f26061x = sVar;
        ArrayList arrayList = this.f26060r;
        t[] tVarArr = this.f26057a;
        Collections.addAll(arrayList, tVarArr);
        for (t tVar : tVarArr) {
            tVar.u(this, j);
        }
    }
}
