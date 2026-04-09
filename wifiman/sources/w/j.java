package w;

import Yg.J;
import androidx.compose.ui.platform.w1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.N;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import y0.AbstractC8572L;
import y0.C8593n;
import y0.C8603x;
import y0.C8604y;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final float f63930a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f63931b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f63932c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63933a;

        /* renamed from: b, reason: collision with root package name */
        Object f63934b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f63935c;

        /* renamed from: d, reason: collision with root package name */
        int f63936d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63935c = obj;
            this.f63936d |= PduHandle.NONE;
            return j.b(null, 0L, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63937a;

        /* renamed from: b, reason: collision with root package name */
        Object f63938b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f63939c;

        /* renamed from: d, reason: collision with root package name */
        int f63940d;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63939c = obj;
            this.f63940d |= PduHandle.NONE;
            return j.c(null, 0L, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        Object f63941b;

        /* renamed from: c, reason: collision with root package name */
        int f63942c;

        /* renamed from: d, reason: collision with root package name */
        int f63943d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f63944e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ N f63945f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ N f63946g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N n10, N n11, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63945f = n10;
            this.f63946g = n11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = new c(this.f63945f, this.f63946g, interfaceC5380e);
            cVar.f63944e = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00cd A[EDGE_INSN: B:65:0x00cd->B:41:0x00cd BREAK  A[LOOP:0: B:36:0x00ba->B:40:0x00ca], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x006f A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ac -> B:35:0x00af). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
            return ((c) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63947a;

        /* renamed from: b, reason: collision with root package name */
        Object f63948b;

        /* renamed from: c, reason: collision with root package name */
        Object f63949c;

        /* renamed from: d, reason: collision with root package name */
        Object f63950d;

        /* renamed from: e, reason: collision with root package name */
        Object f63951e;

        /* renamed from: f, reason: collision with root package name */
        float f63952f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f63953g;

        /* renamed from: h, reason: collision with root package name */
        int f63954h;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63953g = obj;
            this.f63954h |= PduHandle.NONE;
            return j.d(null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f63955a = new e();

        e() {
            super(1);
        }

        public final void a(long j10) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f63956a = new f();

        f() {
            super(0);
        }

        public final void a() {
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f63957a = new g();

        g() {
            super(0);
        }

        public final void a() {
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63958a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC6835l interfaceC6835l) {
            super(3);
            this.f63958a = interfaceC6835l;
        }

        public final void a(C8604y c8604y, C8604y c8604y2, long j10) {
            this.f63958a.invoke(C6531g.d(c8604y2.h()));
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((C8604y) obj, (C8604y) obj2, ((C6531g) obj3).v());
            return J.f24997a;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f63959a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC6824a interfaceC6824a) {
            super(1);
            this.f63959a = interfaceC6824a;
        }

        public final void a(C8604y c8604y) {
            this.f63959a.invoke();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C8604y) obj);
            return J.f24997a;
        }
    }

    /* renamed from: w.j$j, reason: collision with other inner class name */
    static final class C2276j extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final C2276j f63960a = new C2276j();

        C2276j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        Object f63961b;

        /* renamed from: c, reason: collision with root package name */
        Object f63962c;

        /* renamed from: d, reason: collision with root package name */
        Object f63963d;

        /* renamed from: e, reason: collision with root package name */
        Object f63964e;

        /* renamed from: f, reason: collision with root package name */
        Object f63965f;

        /* renamed from: g, reason: collision with root package name */
        Object f63966g;

        /* renamed from: h, reason: collision with root package name */
        boolean f63967h;

        /* renamed from: i, reason: collision with root package name */
        float f63968i;

        /* renamed from: j, reason: collision with root package name */
        int f63969j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f63970k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f63971l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ M f63972m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ q f63973n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ mh.q f63974o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f63975p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f63976q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63977r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC6824a interfaceC6824a, M m10, q qVar, mh.q qVar2, InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a2, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63971l = interfaceC6824a;
            this.f63972m = m10;
            this.f63973n = qVar;
            this.f63974o = qVar2;
            this.f63975p = interfaceC6839p;
            this.f63976q = interfaceC6824a2;
            this.f63977r = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            k kVar = new k(this.f63971l, this.f63972m, this.f63973n, this.f63974o, this.f63975p, this.f63976q, this.f63977r, interfaceC5380e);
            kVar.f63970k = obj;
            return kVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:0x02ff, code lost:
        
            if (((r2 != null ? r2 == w.q.Vertical ? l0.C6531g.n(r5) : l0.C6531g.m(r5) : l0.C6531g.k(r5)) == 0.0f) == false) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
        
            if (r17 == false) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0253, code lost:
        
            if (w.j.i(r2.Z(), r0) != false) goto L87;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:104:0x02b3, B:116:0x02df], limit reached: 144 */
        /* JADX WARN: Path cross not found for [B:45:0x0188, B:47:0x018d], limit reached: 144 */
        /* JADX WARN: Path cross not found for [B:50:0x0194, B:45:0x0188], limit reached: 144 */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02ab  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x02ad  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0326  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0345  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x02a6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x017e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0151 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x027c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x028a  */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, y0.p] */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r13v7 */
        /* JADX WARN: Type inference failed for: r18v0 */
        /* JADX WARN: Type inference failed for: r18v1 */
        /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0120 -> B:78:0x0213). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0208 -> B:75:0x020b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x027a -> B:92:0x027d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 841
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w.j.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
            return ((k) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63978a;

        /* renamed from: b, reason: collision with root package name */
        Object f63979b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f63980c;

        /* renamed from: d, reason: collision with root package name */
        int f63981d;

        l(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63980c = obj;
            this.f63981d |= PduHandle.NONE;
            return j.h(null, 0L, null, this);
        }
    }

    static {
        float fJ = Y0.h.j((float) 0.125d);
        f63930a = fJ;
        float fJ2 = Y0.h.j(18);
        f63931b = fJ2;
        f63932c = fJ / fJ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (y0.AbstractC8594o.k(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(y0.InterfaceC8581b r17, long r18, dh.InterfaceC5380e r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.j.b(y0.b, long, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(y0.InterfaceC8581b r9, long r10, dh.InterfaceC5380e r12) {
        /*
            boolean r0 = r12 instanceof w.j.b
            if (r0 == 0) goto L13
            r0 = r12
            w.j$b r0 = (w.j.b) r0
            int r1 = r0.f63940d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63940d = r1
            goto L18
        L13:
            w.j$b r0 = new w.j$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f63939c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f63940d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f63938b
            kotlin.jvm.internal.N r9 = (kotlin.jvm.internal.N) r9
            java.lang.Object r10 = r0.f63937a
            y0.y r10 = (y0.C8604y) r10
            Yg.v.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            goto La4
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            Yg.v.b(r12)
            y0.n r12 = r9.Z()
            boolean r12 = i(r12, r10)
            if (r12 == 0) goto L49
            return r4
        L49:
            y0.n r12 = r9.Z()
            java.util.List r12 = r12.c()
            int r2 = r12.size()
            r5 = 0
        L56:
            if (r5 >= r2) goto L6d
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            y0.y r7 = (y0.C8604y) r7
            long r7 = r7.f()
            boolean r7 = y0.C8603x.d(r7, r10)
            if (r7 == 0) goto L6a
            goto L6e
        L6a:
            int r5 = r5 + 1
            goto L56
        L6d:
            r6 = r4
        L6e:
            r10 = r6
            y0.y r10 = (y0.C8604y) r10
            if (r10 != 0) goto L74
            return r4
        L74:
            kotlin.jvm.internal.N r11 = new kotlin.jvm.internal.N
            r11.<init>()
            kotlin.jvm.internal.N r12 = new kotlin.jvm.internal.N
            r12.<init>()
            r12.f51689a = r10
            androidx.compose.ui.platform.w1 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            w.j$c r2 = new w.j$c     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r2.<init>(r12, r11, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.f63937a = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.f63938b = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.f63940d = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            java.lang.Object r9 = r9.O0(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            if (r9 != r1) goto La4
            return r1
        L9a:
            r9 = r11
        L9b:
            java.lang.Object r9 = r9.f51689a
            y0.y r9 = (y0.C8604y) r9
            if (r9 != 0) goto La3
            r4 = r10
            goto La4
        La3:
            r4 = r9
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w.j.c(y0.b, long, dh.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015c -> B:62:0x0162). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(y0.InterfaceC8581b r18, long r19, mh.InterfaceC6839p r21, dh.InterfaceC5380e r22) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.j.d(y0.b, long, mh.p, dh.e):java.lang.Object");
    }

    public static final Object e(InterfaceC8567G interfaceC8567G, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objF = f(interfaceC8567G, new h(interfaceC6835l), new i(interfaceC6824a), interfaceC6824a2, C2276j.f63960a, null, interfaceC6839p, interfaceC5380e);
        return objF == AbstractC5467b.g() ? objF : J.f24997a;
    }

    public static final Object f(InterfaceC8567G interfaceC8567G, mh.q qVar, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, q qVar2, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objD = o.d(interfaceC8567G, new k(interfaceC6824a2, new M(), qVar2, qVar, interfaceC6839p, interfaceC6824a, interfaceC6835l, null), interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : J.f24997a;
    }

    public static /* synthetic */ Object g(InterfaceC8567G interfaceC8567G, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6835l = e.f63955a;
        }
        InterfaceC6835l interfaceC6835l2 = interfaceC6835l;
        if ((i10 & 2) != 0) {
            interfaceC6824a = f.f63956a;
        }
        InterfaceC6824a interfaceC6824a3 = interfaceC6824a;
        if ((i10 & 4) != 0) {
            interfaceC6824a2 = g.f63957a;
        }
        return e(interfaceC8567G, interfaceC6835l2, interfaceC6824a3, interfaceC6824a2, interfaceC6839p, interfaceC5380e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(y0.InterfaceC8581b r4, long r5, mh.InterfaceC6835l r7, dh.InterfaceC5380e r8) {
        /*
            boolean r0 = r8 instanceof w.j.l
            if (r0 == 0) goto L13
            r0 = r8
            w.j$l r0 = (w.j.l) r0
            int r1 = r0.f63981d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63981d = r1
            goto L18
        L13:
            w.j$l r0 = new w.j$l
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f63980c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f63981d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f63979b
            mh.l r4 = (mh.InterfaceC6835l) r4
            java.lang.Object r5 = r0.f63978a
            y0.b r5 = (y0.InterfaceC8581b) r5
            Yg.v.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Yg.v.b(r8)
        L3e:
            r0.f63978a = r4
            r0.f63979b = r7
            r0.f63981d = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            y0.y r8 = (y0.C8604y) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r4
        L55:
            boolean r5 = y0.AbstractC8594o.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.f()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: w.j.h(y0.b, long, mh.l, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(C8593n c8593n, long j10) {
        Object obj;
        List listC = c8593n.c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i10);
            if (C8603x.d(((C8604y) obj).f(), j10)) {
                break;
            }
            i10++;
        }
        C8604y c8604y = (C8604y) obj;
        if (c8604y != null && c8604y.i()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float j(w1 w1Var, int i10) {
        return AbstractC8572L.g(i10, AbstractC8572L.f66233a.b()) ? w1Var.g() * f63932c : w1Var.g();
    }
}
