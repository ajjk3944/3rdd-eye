package zt;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class o0 extends au.b implements m0, f, g, au.o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27579y = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: x, reason: collision with root package name */
    public int f27580x;

    public o0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // au.o
    public final f a(pq.h hVar, int i10, yt.a aVar) {
        return ((((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != yt.a.DROP_OLDEST) && !((i10 == 0 || i10 == -3) && aVar == yt.a.SUSPEND)) ? new au.h(this, hVar, i10, aVar) : this;
    }

    @Override // au.b
    public final au.d c() {
        return new p0();
    }

    @Override // au.b
    public final au.d[] d() {
        return new p0[2];
    }

    public final void g(Object obj) {
        if (obj == null) {
            obj = au.c.f2321b;
        }
        h(null, obj);
    }

    @Override // zt.m0
    public final Object getValue() {
        bu.t tVar = au.c.f2321b;
        Object obj = f27579y.get(this);
        if (obj == tVar) {
            return null;
        }
        return obj;
    }

    public final boolean h(Object obj, Object obj2) {
        int i10;
        au.d[] dVarArr;
        bu.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27579y;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !br.l.a(obj3, obj)) {
                return false;
            }
            if (br.l.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f27580x;
            if ((i11 & 1) != 0) {
                this.f27580x = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f27580x = i12;
            au.d[] dVarArr2 = this.f2316a;
            while (true) {
                p0[] p0VarArr = (p0[]) dVarArr2;
                if (p0VarArr != null) {
                    for (p0 p0Var : p0VarArr) {
                        if (p0Var != null) {
                            AtomicReference atomicReference = p0Var.f27584a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (tVar = f0.f27545c)) {
                                    bu.t tVar2 = f0.f27544b;
                                    if (obj4 != tVar2) {
                                        while (!atomicReference.compareAndSet(obj4, tVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((wt.g) obj4).g(lq.b0.f15562a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, tVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f27580x;
                    if (i10 == i12) {
                        this.f27580x = i12 + 1;
                        return true;
                    }
                    dVarArr = this.f2316a;
                }
                dVarArr2 = dVarArr;
                i12 = i10;
            }
        }
    }

    @Override // zt.g
    public final Object i(Object obj, pq.c cVar) {
        g(obj);
        return lq.b0.f15562a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:58:0x00f9, B:59:0x00fa], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0091, B:36:0x0094, B:46:0x00b5, B:49:0x00c5, B:50:0x00e1, B:56:0x00f1, B:53:0x00e8, B:55:0x00ee, B:38:0x009a, B:42:0x00a1, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0091, B:36:0x0094, B:46:0x00b5, B:49:0x00c5, B:50:0x00e1, B:56:0x00f1, B:53:0x00e8, B:55:0x00ee, B:38:0x009a, B:42:0x00a1, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0091, B:36:0x0094, B:46:0x00b5, B:49:0x00c5, B:50:0x00e1, B:56:0x00f1, B:53:0x00e8, B:55:0x00ee, B:38:0x009a, B:42:0x00a1, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c4 -> B:28:0x007e). Please report as a decompilation issue!!! */
    @Override // zt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(zt.g r18, pq.c r19) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.o0.l(zt.g, pq.c):java.lang.Object");
    }
}
