package w;

import Yg.J;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.List;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import y0.C8604y;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* loaded from: classes.dex */
public abstract class o {

    static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        int f63987b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f63988c;

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(interfaceC5380e);
            aVar.f63988c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f63987b;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC8581b interfaceC8581b = (InterfaceC8581b) this.f63988c;
                this.f63987b = 1;
                if (o.b(interfaceC8581b, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
            return ((a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63989a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f63990b;

        /* renamed from: c, reason: collision with root package name */
        int f63991c;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63990b = obj;
            this.f63991c |= PduHandle.NONE;
            return o.b(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        int f63992b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f63993c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5384i f63994d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f63995e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63994d = interfaceC5384i;
            this.f63995e = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = new c(this.f63994d, this.f63995e, interfaceC5380e);
            cVar.f63993c = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, y0.b] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, y0.b] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0070 -> B:12:0x0028). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r7.f63992b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r7.f63993c
                y0.b r1 = (y0.InterfaceC8581b) r1
                Yg.v.b(r8)
                goto L28
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f63993c
                y0.b r1 = (y0.InterfaceC8581b) r1
                Yg.v.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            L28:
                r8 = r1
                goto L3b
            L2a:
                r8 = move-exception
                goto L60
            L2c:
                java.lang.Object r1 = r7.f63993c
                y0.b r1 = (y0.InterfaceC8581b) r1
                Yg.v.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
                goto L51
            L34:
                Yg.v.b(r8)
                java.lang.Object r8 = r7.f63993c
                y0.b r8 = (y0.InterfaceC8581b) r8
            L3b:
                dh.i r1 = r7.f63994d
                boolean r1 = Ii.A0.p(r1)
                if (r1 == 0) goto L74
                mh.p r1 = r7.f63995e     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f63993c = r8     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f63992b = r4     // Catch: java.util.concurrent.CancellationException -> L5c
                java.lang.Object r1 = r1.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L5c
                if (r1 != r0) goto L50
                return r0
            L50:
                r1 = r8
            L51:
                r7.f63993c = r1     // Catch: java.util.concurrent.CancellationException -> L2a
                r7.f63992b = r3     // Catch: java.util.concurrent.CancellationException -> L2a
                java.lang.Object r8 = w.o.b(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L2a
                if (r8 != r0) goto L28
                return r0
            L5c:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L60:
                dh.i r5 = r7.f63994d
                boolean r5 = Ii.A0.p(r5)
                if (r5 == 0) goto L73
                r7.f63993c = r1
                r7.f63992b = r2
                java.lang.Object r8 = w.o.b(r1, r7)
                if (r8 != r0) goto L28
                return r0
            L73:
                throw r8
            L74:
                Yg.J r8 = Yg.J.f24997a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: w.o.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
            return ((c) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63996a;

        /* renamed from: b, reason: collision with root package name */
        Object f63997b;

        /* renamed from: c, reason: collision with root package name */
        Object f63998c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f63999d;

        /* renamed from: e, reason: collision with root package name */
        int f64000e;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63999d = obj;
            this.f64000e |= PduHandle.NONE;
            return o.e(null, null, this);
        }
    }

    public static final boolean a(InterfaceC8581b interfaceC8581b) {
        List listC = interfaceC8581b.Z().c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((C8604y) listC.get(i10)).i()) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (a(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(y0.InterfaceC8581b r6, dh.InterfaceC5380e r7) {
        /*
            boolean r0 = r7 instanceof w.o.b
            if (r0 == 0) goto L13
            r0 = r7
            w.o$b r0 = (w.o.b) r0
            int r1 = r0.f63991c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63991c = r1
            goto L18
        L13:
            w.o$b r0 = new w.o$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f63990b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f63991c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f63989a
            y0.b r6 = (y0.InterfaceC8581b) r6
            Yg.v.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            Yg.v.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L68
        L3e:
            y0.p r7 = y0.EnumC8595p.Final
            r0.f63989a = r6
            r0.f63991c = r3
            java.lang.Object r7 = r6.A1(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            y0.n r7 = (y0.C8593n) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            y0.y r5 = (y0.C8604y) r5
            boolean r5 = r5.i()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            Yg.J r6 = Yg.J.f24997a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w.o.b(y0.b, dh.e):java.lang.Object");
    }

    public static final Object c(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
        Object objP = interfaceC8567G.P(new a(null), interfaceC5380e);
        return objP == AbstractC5467b.g() ? objP : J.f24997a;
    }

    public static final Object d(InterfaceC8567G interfaceC8567G, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objP = interfaceC8567G.P(new c(interfaceC5380e.getContext(), interfaceC6839p, null), interfaceC5380e);
        return objP == AbstractC5467b.g() ? objP : J.f24997a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, y0.G] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, y0.G] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [y0.G] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dh.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:18:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ab -> B:18:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(y0.InterfaceC8567G r8, mh.InterfaceC6839p r9, dh.InterfaceC5380e r10) {
        /*
            boolean r0 = r10 instanceof w.o.d
            if (r0 == 0) goto L13
            r0 = r10
            w.o$d r0 = (w.o.d) r0
            int r1 = r0.f64000e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64000e = r1
            goto L18
        L13:
            w.o$d r0 = new w.o$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f63999d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f64000e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L67
            if (r2 == r5) goto L57
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.f63998c
            dh.i r8 = (dh.InterfaceC5384i) r8
            java.lang.Object r9 = r0.f63997b
            mh.p r9 = (mh.InterfaceC6839p) r9
            java.lang.Object r2 = r0.f63996a
            y0.G r2 = (y0.InterfaceC8567G) r2
            Yg.v.b(r10)
            goto L52
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            java.lang.Object r8 = r0.f63998c
            dh.i r8 = (dh.InterfaceC5384i) r8
            java.lang.Object r9 = r0.f63997b
            mh.p r9 = (mh.InterfaceC6839p) r9
            java.lang.Object r2 = r0.f63996a
            y0.G r2 = (y0.InterfaceC8567G) r2
            Yg.v.b(r10)     // Catch: java.util.concurrent.CancellationException -> L55
        L52:
            r10 = r8
            r8 = r2
            goto L6e
        L55:
            r10 = move-exception
            goto L99
        L57:
            java.lang.Object r8 = r0.f63998c
            dh.i r8 = (dh.InterfaceC5384i) r8
            java.lang.Object r9 = r0.f63997b
            mh.p r9 = (mh.InterfaceC6839p) r9
            java.lang.Object r2 = r0.f63996a
            y0.G r2 = (y0.InterfaceC8567G) r2
            Yg.v.b(r10)     // Catch: java.util.concurrent.CancellationException -> L55
            goto L85
        L67:
            Yg.v.b(r10)
            dh.i r10 = r0.getContext()
        L6e:
            boolean r2 = Ii.A0.p(r10)
            if (r2 == 0) goto Laf
            r0.f63996a = r8     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f63997b = r9     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f63998c = r10     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f64000e = r5     // Catch: java.util.concurrent.CancellationException -> L94
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L94
            if (r2 != r1) goto L83
            return r1
        L83:
            r2 = r8
            r8 = r10
        L85:
            r0.f63996a = r2     // Catch: java.util.concurrent.CancellationException -> L55
            r0.f63997b = r9     // Catch: java.util.concurrent.CancellationException -> L55
            r0.f63998c = r8     // Catch: java.util.concurrent.CancellationException -> L55
            r0.f64000e = r4     // Catch: java.util.concurrent.CancellationException -> L55
            java.lang.Object r10 = c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L55
            if (r10 != r1) goto L52
            return r1
        L94:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L99:
            boolean r6 = Ii.A0.p(r8)
            if (r6 == 0) goto Lae
            r0.f63996a = r2
            r0.f63997b = r9
            r0.f63998c = r8
            r0.f64000e = r3
            java.lang.Object r10 = c(r2, r0)
            if (r10 != r1) goto L52
            return r1
        Lae:
            throw r10
        Laf:
            Yg.J r8 = Yg.J.f24997a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w.o.e(y0.G, mh.p, dh.e):java.lang.Object");
    }
}
