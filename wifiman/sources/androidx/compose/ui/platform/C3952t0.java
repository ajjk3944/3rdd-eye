package androidx.compose.ui.platform;

import Ii.AbstractC3063k;
import dh.InterfaceC5380e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: androidx.compose.ui.platform.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3952t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3952t0 f29588a = new C3952t0();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f29589b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f29590c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final int f29591d = 8;

    /* renamed from: androidx.compose.ui.platform.t0$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f29592a;

        /* renamed from: b, reason: collision with root package name */
        Object f29593b;

        /* renamed from: c, reason: collision with root package name */
        int f29594c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ki.g f29595d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ki.g gVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f29595d = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f29595d, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r5.f29594c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r5.f29593b
                Ki.i r1 = (Ki.i) r1
                java.lang.Object r3 = r5.f29592a
                Ki.v r3 = (Ki.v) r3
                Yg.v.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r6 = move-exception
                goto L5d
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                Yg.v.b(r6)
                Ki.g r3 = r5.f29595d
                Ki.i r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r6
            L2b:
                r5.f29592a = r3     // Catch: java.lang.Throwable -> L17
                r5.f29593b = r1     // Catch: java.lang.Throwable -> L17
                r5.f29594c = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L17
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r6 == 0) goto L54
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
                Yg.J r6 = (Yg.J) r6     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.C3952t0.a()     // Catch: java.lang.Throwable -> L17
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L17
                androidx.compose.runtime.snapshots.g$a r6 = androidx.compose.runtime.snapshots.g.f28632e     // Catch: java.lang.Throwable -> L17
                r6.n()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L54:
                Yg.J r6 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L17
                r6 = 0
                Ki.n.a(r3, r6)
                Yg.J r6 = Yg.J.f24997a
                return r6
            L5d:
                throw r6     // Catch: java.lang.Throwable -> L5e
            L5e:
                r0 = move-exception
                Ki.n.a(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C3952t0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: androidx.compose.ui.platform.t0$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ki.g f29596a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ki.g gVar) {
            super(1);
            this.f29596a = gVar;
        }

        public final void a(Object obj) {
            if (C3952t0.f29590c.compareAndSet(false, true)) {
                this.f29596a.k(Yg.J.f24997a);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return Yg.J.f24997a;
        }
    }

    private C3952t0() {
    }

    public final void b() {
        if (f29589b.compareAndSet(false, true)) {
            Ki.g gVarB = Ki.j.b(1, null, null, 6, null);
            AbstractC3063k.d(Ii.O.a(Q.f29278m.b()), null, null, new a(gVarB, null), 3, null);
            androidx.compose.runtime.snapshots.g.f28632e.k(new b(gVarB));
        }
    }
}
