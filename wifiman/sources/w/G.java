package w;

import Yg.J;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6486l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import oh.AbstractC7137b;
import org.snmp4j.mp.PduHandle;
import r.C7538m;
import r.InterfaceC7533i;
import r.u0;
import r.v0;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: f, reason: collision with root package name */
    private static final a f63827f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f63828g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final C7538m f63829h = new C7538m(0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final v0 f63830a;

    /* renamed from: b, reason: collision with root package name */
    private long f63831b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private C7538m f63832c = f63829h;

    /* renamed from: d, reason: collision with root package name */
    private boolean f63833d;

    /* renamed from: e, reason: collision with root package name */
    private float f63834e;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7538m a() {
            return G.f63829h;
        }

        public final boolean b(float f10) {
            return Math.abs(f10) < 0.01f;
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63835a;

        /* renamed from: b, reason: collision with root package name */
        Object f63836b;

        /* renamed from: c, reason: collision with root package name */
        Object f63837c;

        /* renamed from: d, reason: collision with root package name */
        float f63838d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f63839e;

        /* renamed from: g, reason: collision with root package name */
        int f63841g;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63839e = obj;
            this.f63841g |= PduHandle.NONE;
            return G.this.h(null, null, this);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f63843b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63844c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f63843b = f10;
            this.f63844c = interfaceC6835l;
        }

        public final void a(long j10) {
            if (G.this.f63831b == Long.MIN_VALUE) {
                G.this.f63831b = j10;
            }
            C7538m c7538m = new C7538m(G.this.i());
            long jB = this.f63843b == 0.0f ? G.this.f63830a.b(new C7538m(G.this.i()), G.f63827f.a(), G.this.f63832c) : AbstractC7137b.g((j10 - G.this.f63831b) / this.f63843b);
            float f10 = ((C7538m) G.this.f63830a.c(jB, c7538m, G.f63827f.a(), G.this.f63832c)).f();
            G g10 = G.this;
            g10.f63832c = (C7538m) g10.f63830a.f(jB, c7538m, G.f63827f.a(), G.this.f63832c);
            G.this.f63831b = j10;
            float fI = G.this.i() - f10;
            G.this.j(f10);
            this.f63844c.invoke(Float.valueOf(fI));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f63846b = interfaceC6835l;
        }

        public final void a(long j10) {
            float fI = G.this.i();
            G.this.j(0.0f);
            this.f63846b.invoke(Float.valueOf(fI));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return J.f24997a;
        }
    }

    public G(InterfaceC7533i interfaceC7533i) {
        this.f63830a = interfaceC7533i.a(u0.f(C6486l.f51726a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[Catch: all -> 0x00ae, PHI: r0 r2 r13 r14 r15
  0x0082: PHI (r0v9 mh.a) = (r0v3 mh.a), (r0v10 mh.a) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r2v4 w.G$b) = (r2v2 w.G$b), (r2v5 w.G$b) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r13v6 float) = (r13v4 float), (r13v7 float) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r14v7 mh.l) = (r14v4 mh.l), (r14v8 mh.l) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r15v15 w.G) = (r15v9 w.G), (r15v16 w.G) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:48:0x00d1, B:42:0x00b1, B:45:0x00bc), top: B:55:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009f -> B:59:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(mh.InterfaceC6835l r13, mh.InterfaceC6824a r14, dh.InterfaceC5380e r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.G.h(mh.l, mh.a, dh.e):java.lang.Object");
    }

    public final float i() {
        return this.f63834e;
    }

    public final void j(float f10) {
        this.f63834e = f10;
    }
}
