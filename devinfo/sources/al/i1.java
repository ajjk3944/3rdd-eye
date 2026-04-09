package al;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i1 extends bl.b implements u0, h, bl.s {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f535f = AtomicReferenceFieldUpdater.newUpdater(i1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public int f536e;

    public i1(Object obj) {
        this._state$volatile = obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:58:0x00f6, B:59:0x00f7], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    @Override // al.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(al.i r18, ck.c r19) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.i1.a(al.i, ck.c):java.lang.Object");
    }

    @Override // bl.s
    public final h b(ck.h hVar, int i4, zk.a aVar) {
        return ((((i4 < 0 || i4 >= 2) && i4 != -2) || aVar != zk.a.f38323b) && !((i4 == 0 || i4 == -3) && aVar == zk.a.f38322a)) ? new bl.g(this, hVar, i4, aVar) : this;
    }

    @Override // al.i
    public final Object c(Object obj, ck.c cVar) {
        if (obj == null) {
            obj = bl.c.f2285b;
        }
        j(null, obj);
        return yj.u.f37649a;
    }

    @Override // bl.b
    public final bl.d e() {
        return new j1();
    }

    @Override // bl.b
    public final bl.d[] f() {
        return new j1[2];
    }

    @Override // al.g1
    public final Object getValue() {
        cl.u uVar = bl.c.f2285b;
        Object obj = f535f.get(this);
        if (obj == uVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        cl.u uVar = bl.c.f2285b;
        if (obj == null) {
            obj = uVar;
        }
        if (obj2 == null) {
            obj2 = uVar;
        }
        return j(obj, obj2);
    }

    public final boolean j(Object obj, Object obj2) {
        int i4;
        bl.d[] dVarArr;
        cl.u uVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f535f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !nk.k.a(obj3, obj)) {
                return false;
            }
            if (nk.k.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f536e;
            if ((i10 & 1) != 0) {
                this.f536e = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f536e = i11;
            bl.d[] dVarArr2 = this.f2278a;
            while (true) {
                j1[] j1VarArr = (j1[]) dVarArr2;
                if (j1VarArr != null) {
                    for (j1 j1Var : j1VarArr) {
                        if (j1Var != null) {
                            AtomicReference atomicReference = j1Var.f546a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (uVar = z0.f663c)) {
                                    cl.u uVar2 = z0.f662b;
                                    if (obj4 != uVar2) {
                                        while (!atomicReference.compareAndSet(obj4, uVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((xk.h) obj4).resumeWith(yj.u.f37649a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, uVar)) {
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
                    i4 = this.f536e;
                    if (i4 == i11) {
                        this.f536e = i11 + 1;
                        return true;
                    }
                    dVarArr = this.f2278a;
                }
                dVarArr2 = dVarArr;
                i11 = i4;
            }
        }
    }
}
