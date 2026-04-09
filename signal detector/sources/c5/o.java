package C5;

import c5.C0412i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.C3030f;

/* loaded from: classes3.dex */
public final class o extends D5.b implements h, b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1196e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public int f1197d;

    public o(Object obj) {
        this._state$volatile = obj;
    }

    public final Object I() {
        B2.a aVar = D5.c.f1298b;
        Object obj = f1196e.get(this);
        if (obj == aVar) {
            return null;
        }
        return obj;
    }

    public final void J(Object obj) {
        int i;
        D5.d[] dVarArr;
        B2.a aVar;
        if (obj == null) {
            obj = D5.c.f1298b;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1196e;
            if (q5.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i3 = this.f1197d;
            if ((i3 & 1) != 0) {
                this.f1197d = i3 + 2;
                return;
            }
            int i6 = i3 + 1;
            this.f1197d = i6;
            D5.d[] dVarArr2 = (D5.d[]) this.f1296c;
            while (true) {
                p[] pVarArr = (p[]) dVarArr2;
                if (pVarArr != null) {
                    for (p pVar : pVarArr) {
                        if (pVar != null) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p.f1198a;
                            while (true) {
                                Object obj2 = atomicReferenceFieldUpdater2.get(pVar);
                                if (obj2 != null && obj2 != (aVar = l.f1186c)) {
                                    B2.a aVar2 = l.f1185b;
                                    if (obj2 != aVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(pVar, obj2, aVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(pVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C3030f) obj2).e(C0412i.f5929a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(pVar, obj2, aVar)) {
                                        if (atomicReferenceFieldUpdater2.get(pVar) != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f1197d;
                    if (i == i6) {
                        this.f1197d = i6 + 1;
                        return;
                    }
                    dVarArr = (D5.d[]) this.f1296c;
                }
                dVarArr2 = dVarArr;
                i6 = i;
            }
        }
    }

    @Override // C5.c
    public final Object a(Object obj, j5.b bVar) {
        J(obj);
        return C0412i.f5929a;
    }

    @Override // D5.b
    public final D5.d c() {
        return new p();
    }

    @Override // D5.b
    public final D5.d[] d() {
        return new p[2];
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:58:0x00fc, B:59:0x00fd], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:28:0x0080, B:30:0x0088, B:33:0x008f, B:34:0x0095, B:36:0x0098, B:46:0x00b9, B:49:0x00cc, B:50:0x00e6, B:56:0x00f6, B:53:0x00ed, B:55:0x00f3, B:38:0x009e, B:42:0x00a5, B:21:0x0055, B:24:0x005f, B:27:0x0070), top: B:63:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:28:0x0080, B:30:0x0088, B:33:0x008f, B:34:0x0095, B:36:0x0098, B:46:0x00b9, B:49:0x00cc, B:50:0x00e6, B:56:0x00f6, B:53:0x00ed, B:55:0x00f3, B:38:0x009e, B:42:0x00a5, B:21:0x0055, B:24:0x005f, B:27:0x0070), top: B:63:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:28:0x0080, B:30:0x0088, B:33:0x008f, B:34:0x0095, B:36:0x0098, B:46:0x00b9, B:49:0x00cc, B:50:0x00e6, B:56:0x00f6, B:53:0x00ed, B:55:0x00f3, B:38:0x009e, B:42:0x00a5, B:21:0x0055, B:24:0x005f, B:27:0x0070), top: B:63:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00cb -> B:28:0x0080). Please report as a decompilation issue!!! */
    @Override // C5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(C5.c r17, h5.InterfaceC2370d r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.o.k(C5.c, h5.d):java.lang.Object");
    }
}
