package c0;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a extends nk.i implements mk.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2353i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i4, obj, cls, str, str2, i10, i11);
        this.f2353i = i12;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i4;
        switch (this.f2353i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                a0 a0Var = (a0) this.f29972b;
                x.x xVar = a0Var.f2363z;
                if (zBooleanValue) {
                    a0Var.x0();
                } else {
                    ck.c cVar = null;
                    if (a0Var.f2354q != null) {
                        Object[] objArr3 = xVar.f36956c;
                        long[] jArr = xVar.f36954a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j = jArr[i10];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8;
                                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                                    int i13 = 0;
                                    while (i13 < i12) {
                                        if ((255 & j) < 128) {
                                            i4 = i11;
                                            objArr2 = objArr3;
                                            xk.x.v(a0Var.b0(), null, null, new e(a0Var, (e0.k) objArr3[(i10 << 3) + i13], cVar, 0), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i4 = i11;
                                        }
                                        j >>= i4;
                                        i13++;
                                        i11 = i4;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i12 == i11) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i10 != length) {
                                    i10++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        e0.k kVar = a0Var.B;
                        if (kVar != null) {
                            xk.x.v(a0Var.b0(), null, null, new e(a0Var, kVar, cVar, 1), 3);
                        }
                    }
                    xVar.a();
                    a0Var.B = null;
                }
                return yj.u.f37649a;
            case 1:
                nk.k.e((Set) obj, "p0");
                t5.g gVar = (t5.g) this.f29972b;
                ReentrantLock reentrantLock = gVar.f34238d;
                reentrantLock.lock();
                try {
                    List listR0 = zj.n.r0(gVar.f34237c.values());
                    reentrantLock.unlock();
                    Iterator it = listR0.iterator();
                    if (!it.hasNext()) {
                        return yj.u.f37649a;
                    }
                    ((t5.l) it.next()).getClass();
                    throw null;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            case 2:
                ((xk.b1) this.f29972b).l((Throwable) obj);
                return yj.u.f37649a;
            case 3:
                return ((Cursor) this.f29972b).getString(((Number) obj).intValue());
            case 4:
                return ((Cursor) this.f29972b).getString(((Number) obj).intValue());
            case 5:
                return Long.valueOf(((Cursor) this.f29972b).getLong(((Number) obj).intValue()));
            case 6:
                return Long.valueOf(((Cursor) this.f29972b).getLong(((Number) obj).intValue()));
            case 7:
                return Long.valueOf(((Cursor) this.f29972b).getLong(((Number) obj).intValue()));
            default:
                return ((Cursor) this.f29972b).getString(((Number) obj).intValue());
        }
    }
}
