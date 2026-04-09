package jj;

import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.N;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import y0.C8593n;
import y0.C8603x;
import y0.C8604y;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* renamed from: jj.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6351c {

    /* renamed from: a, reason: collision with root package name */
    private static final float f50888a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f50889b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f50890c;

    /* renamed from: jj.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f50891a;

        /* renamed from: b, reason: collision with root package name */
        Object f50892b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f50893c;

        /* renamed from: d, reason: collision with root package name */
        int f50894d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50893c = obj;
            this.f50894d |= PduHandle.NONE;
            return AbstractC6351c.b(null, null, this);
        }
    }

    /* renamed from: jj.c$b */
    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f50895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8567G f50896b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f50897c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f50898d;

        /* renamed from: jj.c$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

            /* renamed from: b, reason: collision with root package name */
            Object f50899b;

            /* renamed from: c, reason: collision with root package name */
            int f50900c;

            /* renamed from: d, reason: collision with root package name */
            int f50901d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f50902e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ N f50903f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ N f50904g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N n10, N n11, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f50903f = n10;
                this.f50904g = n11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f50903f, this.f50904g, interfaceC5380e);
                aVar.f50902e = obj;
                return aVar;
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
            /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00cd A[EDGE_INSN: B:66:0x00cd->B:41:0x00cd BREAK  A[LOOP:0: B:36:0x00ba->B:40:0x00ca], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x006f A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ac -> B:35:0x00af). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 326
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: jj.AbstractC6351c.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC8567G interfaceC8567G, N n10, N n11, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f50896b = interfaceC8567G;
            this.f50897c = n10;
            this.f50898d = n11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f50896b, this.f50897c, this.f50898d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f50895a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8567G interfaceC8567G = this.f50896b;
                a aVar = new a(this.f50897c, this.f50898d, null);
                this.f50895a = 1;
                if (interfaceC8567G.P(aVar, this) == objG) {
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
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static {
        float fJ = Y0.h.j((float) 0.125d);
        f50888a = fJ;
        float fJ2 = Y0.h.j(18);
        f50889b = fJ2;
        f50890c = fJ / fJ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(y0.InterfaceC8567G r8, y0.C8604y r9, dh.InterfaceC5380e r10) {
        /*
            boolean r0 = r10 instanceof jj.AbstractC6351c.a
            if (r0 == 0) goto L13
            r0 = r10
            jj.c$a r0 = (jj.AbstractC6351c.a) r0
            int r1 = r0.f50894d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50894d = r1
            goto L18
        L13:
            jj.c$a r0 = new jj.c$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50893c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f50894d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r8 = r0.f50892b
            kotlin.jvm.internal.N r8 = (kotlin.jvm.internal.N) r8
            java.lang.Object r9 = r0.f50891a
            y0.y r9 = (y0.C8604y) r9
            Yg.v.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            goto L6d
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            Yg.v.b(r10)
            kotlin.jvm.internal.N r10 = new kotlin.jvm.internal.N
            r10.<init>()
            kotlin.jvm.internal.N r2 = new kotlin.jvm.internal.N
            r2.<init>()
            r2.f51689a = r9
            androidx.compose.ui.platform.w1 r5 = r8.getViewConfiguration()
            long r5 = r5.c()
            jj.c$b r7 = new jj.c$b     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r7.<init>(r8, r2, r10, r3)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r0.f50891a = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r0.f50892b = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r0.f50894d = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            java.lang.Object r8 = Ii.W0.c(r5, r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            if (r8 != r1) goto L6d
            return r1
        L63:
            r8 = r10
        L64:
            java.lang.Object r8 = r8.f51689a
            y0.y r8 = (y0.C8604y) r8
            if (r8 != 0) goto L6c
            r3 = r9
            goto L6d
        L6c:
            r3 = r8
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.AbstractC6351c.b(y0.G, y0.y, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(C8593n c8593n, long j10) {
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
}
