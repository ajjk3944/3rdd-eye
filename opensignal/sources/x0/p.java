package x0;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f24727a = new Object();

    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    public static final boolean b(s sVar, int i10, r0.c cVar, boolean z10) {
        boolean z11;
        synchronized (f24727a) {
            try {
                int i11 = sVar.f24748d;
                if (i11 == i10) {
                    sVar.f24747c = cVar;
                    z11 = true;
                    if (z10) {
                        sVar.f24749e++;
                    }
                    sVar.f24748d = i11 + 1;
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static final int c(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j7 = jArr[i11];
            if (j > j7) {
                i10 = i11 + 1;
            } else {
                if (j >= j7) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final s e(SnapshotStateList snapshotStateList) {
        s sVar = snapshotStateList.f1119a;
        br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (s) l.t(sVar, snapshotStateList);
    }

    public static final int f(SnapshotStateList snapshotStateList) {
        s sVar = snapshotStateList.f1119a;
        br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((s) l.i(sVar)).f24749e;
    }

    public static final boolean g(SnapshotStateList snapshotStateList, ar.k kVar) {
        int i10;
        r0.c cVar;
        Object objA;
        f fVarK;
        boolean zB;
        do {
            synchronized (f24727a) {
                s sVar = snapshotStateList.f1119a;
                br.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) l.i(sVar);
                i10 = sVar2.f24748d;
                cVar = sVar2.f24747c;
            }
            br.l.b(cVar);
            r0.f fVarE = cVar.e();
            objA = kVar.a(fVarE);
            r0.c cVarC = fVarE.c();
            if (br.l.a(cVarC, cVar)) {
                break;
            }
            s sVar3 = snapshotStateList.f1119a;
            br.l.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f24717c) {
                fVarK = l.k();
                zB = b((s) l.w(sVar3, snapshotStateList, fVarK), i10, cVarC, true);
            }
            l.n(fVarK, snapshotStateList);
        } while (!zB);
        return ((Boolean) objA).booleanValue();
    }

    public static Object h(ar.a aVar, ar.k kVar) {
        f xVar;
        if (kVar == null) {
            return aVar.c();
        }
        f fVar = (f) l.f24716b.get();
        if (fVar instanceof x) {
            x xVar2 = (x) fVar;
            if (xVar2.f24762t == v0.i.b()) {
                ar.k kVar2 = xVar2.f24760r;
                ar.k kVar3 = xVar2.f24761s;
                try {
                    ((x) fVar).f24760r = l.l(kVar, kVar2, true);
                    ((x) fVar).f24761s = kVar3;
                    return aVar.c();
                } finally {
                    xVar2.f24760r = kVar2;
                    xVar2.f24761s = kVar3;
                }
            }
        }
        if (fVar == null || (fVar instanceof b)) {
            xVar = new x(fVar instanceof b ? (b) fVar : null, kVar, null, true, false);
        } else {
            if (kVar == null) {
                return aVar.c();
            }
            xVar = fVar.u(kVar);
        }
        try {
            f fVarJ = xVar.j();
            try {
                Object objC = aVar.c();
                f.q(fVarJ);
                xVar.c();
                return objC;
            } catch (Throwable th2) {
                f.q(fVarJ);
                throw th2;
            }
        } catch (Throwable th3) {
            xVar.c();
            throw th3;
        }
    }

    public static void i(f fVar, f fVar2, ar.k kVar) {
        if (fVar != fVar2) {
            fVar2.getClass();
            f.q(fVar);
            fVar2.c();
        } else if (fVar instanceof x) {
            ((x) fVar).f24760r = kVar;
        } else if (fVar instanceof y) {
            ((y) fVar).f24766h = kVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + fVar).toString());
        }
    }

    public static final void j() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}
