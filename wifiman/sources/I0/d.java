package I0;

import Ii.AbstractC3063k;
import Ii.J0;
import Ii.N;
import Ii.O;
import J0.q;
import Y0.p;
import Yg.J;
import Yg.v;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6531g;
import m0.b1;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class d implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    private final J0.n f8402a;

    /* renamed from: b, reason: collision with root package name */
    private final p f8403b;

    /* renamed from: c, reason: collision with root package name */
    private final a f8404c;

    /* renamed from: d, reason: collision with root package name */
    private final N f8405d;

    /* renamed from: e, reason: collision with root package name */
    private final h f8406e;

    /* renamed from: f, reason: collision with root package name */
    private int f8407f;

    public interface a {
        void a();

        void b();
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8408a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f8410c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f8410c = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new b(this.f8410c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8408a;
            if (i10 == 0) {
                v.b(obj);
                h hVar = d.this.f8406e;
                this.f8408a = 1;
                if (hVar.g(0.0f, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            d.this.f8404c.b();
            this.f8410c.run();
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8411a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f8413c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Rect f8414d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Consumer f8415e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f8413c = scrollCaptureSession;
            this.f8414d = rect;
            this.f8415e = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new c(this.f8413c, this.f8414d, this.f8415e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8411a;
            if (i10 == 0) {
                v.b(obj);
                d dVar = d.this;
                ScrollCaptureSession scrollCaptureSession = this.f8413c;
                p pVarD = b1.d(this.f8414d);
                this.f8411a = 1;
                obj = dVar.e(scrollCaptureSession, pVarD, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            this.f8415e.accept(b1.a((p) obj));
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: I0.d$d, reason: collision with other inner class name */
    static final class C0345d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f8416a;

        /* renamed from: b, reason: collision with root package name */
        Object f8417b;

        /* renamed from: c, reason: collision with root package name */
        Object f8418c;

        /* renamed from: d, reason: collision with root package name */
        int f8419d;

        /* renamed from: e, reason: collision with root package name */
        int f8420e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f8421f;

        /* renamed from: h, reason: collision with root package name */
        int f8423h;

        C0345d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8421f = obj;
            this.f8423h |= PduHandle.NONE;
            return d.this.e(null, null, this);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8424a = new e();

        e() {
            super(1);
        }

        public final void a(long j10) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return J.f24997a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        boolean f8425a;

        /* renamed from: b, reason: collision with root package name */
        int f8426b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ float f8427c;

        f(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            f fVar = d.this.new f(interfaceC5380e);
            fVar.f8427c = ((Number) obj).floatValue();
            return fVar;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Number) obj).floatValue(), (InterfaceC5380e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objG = AbstractC5467b.g();
            int i10 = this.f8426b;
            if (i10 == 0) {
                v.b(obj);
                float f10 = this.f8427c;
                InterfaceC6839p interfaceC6839pC = n.c(d.this.f8402a);
                if (interfaceC6839pC == null) {
                    B0.a.c("Required value was null.");
                    throw new KotlinNothingValueException();
                }
                boolean zB = ((J0.h) d.this.f8402a.w().j(q.f9676a.I())).b();
                if (zB) {
                    f10 = -f10;
                }
                C6531g c6531gD = C6531g.d(AbstractC6532h.a(0.0f, f10));
                this.f8425a = zB;
                this.f8426b = 1;
                obj = interfaceC6839pC.invoke(c6531gD, this);
                if (obj == objG) {
                    return objG;
                }
                z10 = zB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = this.f8425a;
                v.b(obj);
            }
            float fN = C6531g.n(((C6531g) obj).v());
            if (z10) {
                fN = -fN;
            }
            return kotlin.coroutines.jvm.internal.b.c(fN);
        }

        public final Object n(float f10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(Float.valueOf(f10), interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public d(J0.n nVar, p pVar, N n10, a aVar) {
        this.f8402a = nVar;
        this.f8403b = pVar;
        this.f8404c = aVar;
        this.f8405d = O.j(n10, g.f8431a);
        this.f8406e = new h(pVar.e(), new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.view.ScrollCaptureSession r9, Y0.p r10, dh.InterfaceC5380e r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.d.e(android.view.ScrollCaptureSession, Y0.p, dh.e):java.lang.Object");
    }

    public void onScrollCaptureEnd(Runnable runnable) {
        AbstractC3063k.d(this.f8405d, J0.f9271b, null, new b(runnable, null), 2, null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        I0.f.c(this.f8405d, cancellationSignal, new c(scrollCaptureSession, rect, consumer, null));
    }

    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(b1.a(this.f8403b));
    }

    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f8406e.d();
        this.f8407f = 0;
        this.f8404c.a();
        runnable.run();
    }
}
