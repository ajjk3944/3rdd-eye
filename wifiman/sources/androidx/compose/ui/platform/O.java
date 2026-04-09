package androidx.compose.ui.platform;

import Ii.C3073p;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class O implements P0, Ii.N {

    /* renamed from: a, reason: collision with root package name */
    private final View f29257a;

    /* renamed from: b, reason: collision with root package name */
    private final R0.T f29258b;

    /* renamed from: c, reason: collision with root package name */
    private final Ii.N f29259c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f29260d = f0.k.a();

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f29261a;

        /* renamed from: c, reason: collision with root package name */
        int f29263c;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29261a = obj;
            this.f29263c |= PduHandle.NONE;
            return O.this.b(null, this);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L0 f29264a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f29265b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f29266a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O o10) {
                super(0);
                this.f29266a = o10;
            }

            public final void a() {
                Ii.O.f(this.f29266a.f29259c, null, 1, null);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(L0 l02, O o10) {
            super(1);
            this.f29264a = l02;
            this.f29265b = o10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3960x0 invoke(Ii.N n10) {
            return new C3960x0(this.f29264a, new a(this.f29265b));
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f29267a;

        /* renamed from: b, reason: collision with root package name */
        int f29268b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29269c;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3960x0 f29271a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O f29272b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3960x0 c3960x0, O o10) {
                super(1);
                this.f29271a = c3960x0;
                this.f29272b = o10;
            }

            public final void a(Throwable th2) {
                this.f29271a.d();
                this.f29272b.f29258b.f();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Yg.J.f24997a;
            }
        }

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = O.this.new c(interfaceC5380e);
            cVar.f29269c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f29268b;
            if (i10 == 0) {
                Yg.v.b(obj);
                C3960x0 c3960x0 = (C3960x0) this.f29269c;
                O o10 = O.this;
                this.f29269c = c3960x0;
                this.f29267a = o10;
                this.f29268b = 1;
                C3073p c3073p = new C3073p(AbstractC5467b.d(this), 1);
                c3073p.A();
                o10.f29258b.e();
                c3073p.B(new a(c3960x0, o10));
                Object objU = c3073p.u();
                if (objU == AbstractC5467b.g()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objU == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3960x0 c3960x0, InterfaceC5380e interfaceC5380e) {
            return ((c) create(c3960x0, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public O(View view, R0.T t10, Ii.N n10) {
        this.f29257a = view;
        this.f29258b = t10;
        this.f29259c = n10;
    }

    @Override // androidx.compose.ui.platform.O0
    public View a() {
        return this.f29257a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(androidx.compose.ui.platform.L0 r6, dh.InterfaceC5380e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.O.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.O$a r0 = (androidx.compose.ui.platform.O.a) r0
            int r1 = r0.f29263c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29263c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.O$a r0 = new androidx.compose.ui.platform.O$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29261a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f29263c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            Yg.v.b(r7)
            goto L4a
        L31:
            Yg.v.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f29260d
            androidx.compose.ui.platform.O$b r2 = new androidx.compose.ui.platform.O$b
            r2.<init>(r6, r5)
            androidx.compose.ui.platform.O$c r6 = new androidx.compose.ui.platform.O$c
            r4 = 0
            r6.<init>(r4)
            r0.f29263c = r3
            java.lang.Object r6 = f0.k.d(r7, r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.O.b(androidx.compose.ui.platform.L0, dh.e):java.lang.Object");
    }

    public final InputConnection e(EditorInfo editorInfo) {
        C3960x0 c3960x0 = (C3960x0) f0.k.c(this.f29260d);
        if (c3960x0 != null) {
            return c3960x0.c(editorInfo);
        }
        return null;
    }

    public final boolean f() {
        C3960x0 c3960x0 = (C3960x0) f0.k.c(this.f29260d);
        return c3960x0 != null && c3960x0.e();
    }

    @Override // Ii.N
    public InterfaceC5384i getCoroutineContext() {
        return this.f29259c.getCoroutineContext();
    }
}
