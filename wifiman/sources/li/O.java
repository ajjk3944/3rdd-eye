package Li;

import Mi.AbstractC3305a;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
final class O extends AbstractC3305a implements z, InterfaceC3220g, Mi.o {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f11880f = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    private int f11881e;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11882a;

        /* renamed from: b, reason: collision with root package name */
        Object f11883b;

        /* renamed from: c, reason: collision with root package name */
        Object f11884c;

        /* renamed from: d, reason: collision with root package name */
        Object f11885d;

        /* renamed from: e, reason: collision with root package name */
        Object f11886e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f11887f;

        /* renamed from: h, reason: collision with root package name */
        int f11889h;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11887f = obj;
            this.f11889h |= PduHandle.NONE;
            return O.this.b(null, this);
        }
    }

    public O(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean s(Object obj, Object obj2) {
        int i10;
        Mi.c[] cVarArrO;
        synchronized (this) {
            Object obj3 = f11880f.get(this);
            if (obj != null && !AbstractC6492s.d(obj3, obj)) {
                return false;
            }
            if (AbstractC6492s.d(obj3, obj2)) {
                return true;
            }
            f11880f.set(this, obj2);
            int i11 = this.f11881e;
            if ((i11 & 1) != 0) {
                this.f11881e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f11881e = i12;
            Mi.c[] cVarArrO2 = o();
            Yg.J j10 = Yg.J.f24997a;
            while (true) {
                Q[] qArr = (Q[]) cVarArrO2;
                if (qArr != null) {
                    for (Q q10 : qArr) {
                        if (q10 != null) {
                            q10.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f11881e;
                    if (i10 == i12) {
                        this.f11881e = i12 + 1;
                        return true;
                    }
                    cVarArrO = o();
                    Yg.J j11 = Yg.J.f24997a;
                }
                cVarArrO2 = cVarArrO;
                i12 = i10;
            }
        }
    }

    @Override // Li.y, Li.InterfaceC3221h
    public Object a(Object obj, InterfaceC5380e interfaceC5380e) {
        setValue(obj);
        return Yg.J.f24997a;
    }

    /* JADX WARN: Path cross not found for [B:33:0x009e, B:35:0x00a4], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a4, B:33:0x009e], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c3 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d5 -> B:29:0x008f). Please report as a decompilation issue!!! */
    @Override // Li.D, Li.InterfaceC3220g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(Li.InterfaceC3221h r11, dh.InterfaceC5380e r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.O.b(Li.h, dh.e):java.lang.Object");
    }

    @Override // Li.z
    public boolean c(Object obj, Object obj2) {
        if (obj == null) {
            obj = Mi.r.f13298a;
        }
        if (obj2 == null) {
            obj2 = Mi.r.f13298a;
        }
        return s(obj, obj2);
    }

    @Override // Mi.o
    public InterfaceC3220g d(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return P.d(this, interfaceC5384i, i10, aVar);
    }

    @Override // Li.z, Li.N
    public Object getValue() {
        Ni.C c10 = Mi.r.f13298a;
        Object obj = f11880f.get(this);
        if (obj == c10) {
            return null;
        }
        return obj;
    }

    @Override // Li.y
    public void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // Li.y
    public boolean j(Object obj) {
        setValue(obj);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mi.AbstractC3305a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Q i() {
        return new Q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mi.AbstractC3305a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Q[] k(int i10) {
        return new Q[i10];
    }

    @Override // Li.z
    public void setValue(Object obj) {
        if (obj == null) {
            obj = Mi.r.f13298a;
        }
        s(null, obj);
    }
}
