package Z2;

import Ii.N;
import Li.F;
import Li.InterfaceC3221h;
import Li.y;
import T.InterfaceC3551q0;
import T.t1;
import Yg.J;
import Yg.v;
import android.webkit.WebView;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f.AbstractC5487d;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final N f25153a;

    /* renamed from: b, reason: collision with root package name */
    private final y f25154b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f25155c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f25156d;

    private interface a {
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25157a;

        /* renamed from: c, reason: collision with root package name */
        int f25159c;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25157a = obj;
            this.f25159c |= PduHandle.NONE;
            return g.this.c(null, this);
        }
    }

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f25160a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f25162c;

        static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebView f25163a;

            a(WebView webView) {
                this.f25163a = webView;
            }

            @Override // Li.InterfaceC3221h
            public /* bridge */ /* synthetic */ Object a(Object obj, InterfaceC5380e interfaceC5380e) {
                AbstractC5487d.a(obj);
                return b(null, interfaceC5380e);
            }

            public final Object b(a aVar, InterfaceC5380e interfaceC5380e) {
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(WebView webView, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f25162c = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return g.this.new c(this.f25162c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f25160a;
            if (i10 == 0) {
                v.b(obj);
                y yVar = g.this.f25154b;
                a aVar = new a(this.f25162c);
                this.f25160a = 1;
                if (yVar.b(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public g(N coroutineScope) {
        AbstractC6492s.i(coroutineScope, "coroutineScope");
        this.f25153a = coroutineScope;
        this.f25154b = F.b(1, 0, null, 6, null);
        Boolean bool = Boolean.FALSE;
        this.f25155c = t1.d(bool, null, 2, null);
        this.f25156d = t1.d(bool, null, 2, null);
    }

    public final boolean b() {
        return ((Boolean) this.f25155c.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.webkit.WebView r6, dh.InterfaceC5380e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Z2.g.b
            if (r0 == 0) goto L13
            r0 = r7
            Z2.g$b r0 = (Z2.g.b) r0
            int r1 = r0.f25159c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25159c = r1
            goto L18
        L13:
            Z2.g$b r0 = new Z2.g$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25157a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f25159c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            Yg.v.b(r7)
            goto L47
        L31:
            Yg.v.b(r7)
            Ii.H0 r7 = Ii.C3048c0.c()
            Z2.g$c r2 = new Z2.g$c
            r4 = 0
            r2.<init>(r6, r4)
            r0.f25159c = r3
            java.lang.Object r6 = Ii.AbstractC3059i.g(r7, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.g.c(android.webkit.WebView, dh.e):java.lang.Object");
    }

    public final void d(boolean z10) {
        this.f25155c.setValue(Boolean.valueOf(z10));
    }

    public final void e(boolean z10) {
        this.f25156d.setValue(Boolean.valueOf(z10));
    }
}
