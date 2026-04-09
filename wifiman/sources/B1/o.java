package b1;

import T.S0;
import Yg.J;
import android.os.Handler;
import android.os.Looper;
import b1.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class o implements n, S0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4055l f32760a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f32761b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.compose.runtime.snapshots.l f32762c = new androidx.compose.runtime.snapshots.l(new b());

    /* renamed from: d, reason: collision with root package name */
    private boolean f32763d = true;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6835l f32764e = new c();

    /* renamed from: f, reason: collision with root package name */
    private final List f32765f = new ArrayList();

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f32766a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f32767b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4040B f32768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, o oVar, C4040B c4040b) {
            super(0);
            this.f32766a = list;
            this.f32767b = oVar;
            this.f32768c = c4040b;
        }

        public final void a() {
            List list = this.f32766a;
            o oVar = this.f32767b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objB = ((C0.B) list.get(i10)).b();
                C4054k c4054k = objB instanceof C4054k ? (C4054k) objB : null;
                if (c4054k != null) {
                    C4049f c4049fB = c4054k.b();
                    c4054k.a().invoke(new C4048e(c4049fB.a(), oVar.i().b(c4049fB)));
                }
                oVar.f32765f.add(c4054k);
            }
            this.f32767b.i().a(this.f32768c);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(InterfaceC6824a interfaceC6824a) {
            interfaceC6824a.invoke();
        }

        public final void c(final InterfaceC6824a interfaceC6824a) {
            if (AbstractC6492s.d(Looper.myLooper(), Looper.getMainLooper())) {
                interfaceC6824a.invoke();
                return;
            }
            Handler handler = o.this.f32761b;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                o.this.f32761b = handler;
            }
            handler.post(new Runnable() { // from class: b1.p
                @Override // java.lang.Runnable
                public final void run() {
                    o.b.h(interfaceC6824a);
                }
            });
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c((InterfaceC6824a) obj);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {
        c() {
            super(1);
        }

        public final void a(J j10) {
            o.this.j(true);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J) obj);
            return J.f24997a;
        }
    }

    public o(C4055l c4055l) {
        this.f32760a = c4055l;
    }

    @Override // b1.n
    public boolean a(List list) {
        if (this.f32763d || list.size() != this.f32765f.size()) {
            return true;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object objB = ((C0.B) list.get(i10)).b();
            if (!AbstractC6492s.d(objB instanceof C4054k ? (C4054k) objB : null, this.f32765f.get(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // T.S0
    public void b() {
    }

    @Override // T.S0
    public void c() {
        this.f32762c.t();
        this.f32762c.j();
    }

    @Override // T.S0
    public void d() {
        this.f32762c.s();
    }

    @Override // b1.n
    public void e(C4040B c4040b, List list) {
        this.f32765f.clear();
        this.f32762c.o(J.f24997a, this.f32764e, new a(list, this, c4040b));
        this.f32763d = false;
    }

    public final C4055l i() {
        return this.f32760a;
    }

    public final void j(boolean z10) {
        this.f32763d = z10;
    }
}
