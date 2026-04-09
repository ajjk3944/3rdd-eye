package androidx.compose.ui.platform;

import T.AbstractC3561w;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class N0 {

    /* renamed from: a, reason: collision with root package name */
    private static final T.H0 f29251a = AbstractC3561w.f(a.f29252a);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29252a = new a();

        a() {
            super(0);
        }

        public final AbstractC3914e0 a() {
            return null;
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return null;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f29253a;

        /* renamed from: b, reason: collision with root package name */
        int f29254b;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29253a = obj;
            this.f29254b |= PduHandle.NONE;
            return N0.b(null, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f29255a;

        /* renamed from: b, reason: collision with root package name */
        int f29256b;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29255a = obj;
            this.f29256b |= PduHandle.NONE;
            return N0.c(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.platform.M0 r4, mh.InterfaceC6839p r5, dh.InterfaceC5380e r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.N0.b
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.N0$b r0 = (androidx.compose.ui.platform.N0.b) r0
            int r1 = r0.f29254b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29254b = r1
            goto L18
        L13:
            androidx.compose.ui.platform.N0$b r0 = new androidx.compose.ui.platform.N0$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29253a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f29254b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            Yg.v.b(r6)
            goto L5d
        L31:
            Yg.v.b(r6)
            androidx.compose.ui.e$c r6 = r4.h1()
            boolean r6 = r6.k2()
            if (r6 == 0) goto L63
            E0.m0 r6 = E0.AbstractC2633k.n(r4)
            E0.G r4 = E0.AbstractC2633k.m(r4)
            T.x r4 = r4.J()
            T.H0 r2 = androidx.compose.ui.platform.N0.f29251a
            java.lang.Object r4 = r4.b(r2)
            f.AbstractC5487d.a(r4)
            r0.f29254b = r3
            r4 = 0
            java.lang.Object r4 = c(r6, r4, r5, r0)
            if (r4 != r1) goto L5d
            return r1
        L5d:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L63:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.N0.b(androidx.compose.ui.platform.M0, mh.p, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(E0.m0 r3, androidx.compose.ui.platform.AbstractC3914e0 r4, mh.InterfaceC6839p r5, dh.InterfaceC5380e r6) {
        /*
            boolean r4 = r6 instanceof androidx.compose.ui.platform.N0.c
            if (r4 == 0) goto L13
            r4 = r6
            androidx.compose.ui.platform.N0$c r4 = (androidx.compose.ui.platform.N0.c) r4
            int r0 = r4.f29256b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f29256b = r0
            goto L18
        L13:
            androidx.compose.ui.platform.N0$c r4 = new androidx.compose.ui.platform.N0$c
            r4.<init>(r6)
        L18:
            java.lang.Object r6 = r4.f29255a
            java.lang.Object r0 = eh.AbstractC5467b.g()
            int r1 = r4.f29256b
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L39
            r3 = 2
            if (r1 == r3) goto L30
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L30:
            Yg.v.b(r6)
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
        L39:
            Yg.v.b(r6)
            goto L49
        L3d:
            Yg.v.b(r6)
            r4.f29256b = r2
            java.lang.Object r3 = r3.w(r5, r4)
            if (r3 != r0) goto L49
            return r0
        L49:
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.N0.c(E0.m0, androidx.compose.ui.platform.e0, mh.p, dh.e):java.lang.Object");
    }
}
