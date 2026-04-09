package Pi;

import Ii.N;
import Ii.O;
import Ki.g;
import Ki.t;
import Li.AbstractC3222i;
import Li.InterfaceC3221h;
import Mi.x;
import Yg.J;
import Yg.v;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5381f;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
final class d extends Mi.d {

    /* renamed from: d, reason: collision with root package name */
    private final Dj.a f18689d;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f18690a;

        /* renamed from: b, reason: collision with root package name */
        Object f18691b;

        /* renamed from: c, reason: collision with root package name */
        Object f18692c;

        /* renamed from: d, reason: collision with root package name */
        long f18693d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f18694e;

        /* renamed from: g, reason: collision with root package name */
        int f18696g;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18694e = obj;
            this.f18696g |= PduHandle.NONE;
            return d.this.q(null, null, this);
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f18697a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f18698b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221h f18699c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f18700d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3221h interfaceC3221h, d dVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f18699c = interfaceC3221h;
            this.f18700d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f18699c, this.f18700d, interfaceC5380e);
            bVar.f18698b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f18697a;
            if (i10 == 0) {
                v.b(obj);
                N n10 = (N) this.f18698b;
                InterfaceC3221h interfaceC3221h = this.f18699c;
                d dVar = this.f18700d;
                Ki.v vVarO = dVar.o(O.j(n10, dVar.f13236a));
                this.f18697a = 1;
                if (AbstractC3222i.s(interfaceC3221h, vVarO, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public /* synthetic */ d(Dj.a aVar, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i11 & 2) != 0 ? C5385j.f46088a : interfaceC5384i, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Ki.a.SUSPEND : aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x003c, B:33:0x00b5, B:35:0x00c1, B:23:0x007f, B:30:0x009d, B:20:0x005b), top: B:40:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x003c, B:33:0x00b5, B:35:0x00c1, B:23:0x007f, B:30:0x009d, B:20:0x005b), top: B:40:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v8, types: [Pi.f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b2 -> B:14:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(dh.InterfaceC5384i r18, Li.InterfaceC3221h r19, dh.InterfaceC5380e r20) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Pi.d.q(dh.i, Li.h, dh.e):java.lang.Object");
    }

    private final Object r(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new b(interfaceC3221h, this, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    private final long s() {
        if (this.f13238c != Ki.a.SUSPEND) {
            return Long.MAX_VALUE;
        }
        int i10 = this.f13237b;
        if (i10 == -2) {
            return g.f10869P.a();
        }
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j10 = i10;
        if (j10 >= 1) {
            return j10;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // Mi.d, Li.InterfaceC3220g
    public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        InterfaceC5384i context = interfaceC5380e.getContext();
        InterfaceC5384i interfaceC5384i = this.f13236a;
        InterfaceC5381f.b bVar = InterfaceC5381f.f46086m0;
        InterfaceC5381f interfaceC5381f = (InterfaceC5381f) interfaceC5384i.get(bVar);
        if (interfaceC5381f == null || AbstractC6492s.d(interfaceC5381f, context.get(bVar))) {
            Object objQ = q(context.plus(this.f13236a), interfaceC3221h, interfaceC5380e);
            return objQ == AbstractC5467b.g() ? objQ : J.f24997a;
        }
        Object objR = r(interfaceC3221h, interfaceC5380e);
        return objR == AbstractC5467b.g() ? objR : J.f24997a;
    }

    @Override // Mi.d
    protected Object g(t tVar, InterfaceC5380e interfaceC5380e) {
        Object objQ = q(tVar.getCoroutineContext(), new x(tVar.g()), interfaceC5380e);
        return objQ == AbstractC5467b.g() ? objQ : J.f24997a;
    }

    @Override // Mi.d
    protected Mi.d i(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return new d(this.f18689d, interfaceC5384i, i10, aVar);
    }

    public d(Dj.a aVar, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar2) {
        super(interfaceC5384i, i10, aVar2);
        this.f18689d = aVar;
    }
}
