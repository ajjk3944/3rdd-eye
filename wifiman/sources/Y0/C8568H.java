package y0;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6835l;

/* renamed from: y0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8568H implements InterfaceC8566F {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC6835l f66215a;

    /* renamed from: b, reason: collision with root package name */
    private C8575O f66216b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f66217c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC8565E f66218d = new b();

    /* renamed from: y0.H$a */
    private enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* renamed from: y0.H$b */
    public static final class b extends AbstractC8565E {

        /* renamed from: b, reason: collision with root package name */
        private a f66219b = a.Unknown;

        /* renamed from: y0.H$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8568H f66221a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C8568H c8568h) {
                super(1);
                this.f66221a = c8568h;
            }

            public final void a(MotionEvent motionEvent) {
                this.f66221a.c().invoke(motionEvent);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return Yg.J.f24997a;
            }
        }

        /* renamed from: y0.H$b$b, reason: collision with other inner class name */
        static final class C2351b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C8568H f66223b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2351b(C8568H c8568h) {
                super(1);
                this.f66223b = c8568h;
            }

            public final void a(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f66223b.c().invoke(motionEvent);
                } else {
                    b.this.f66219b = ((Boolean) this.f66223b.c().invoke(motionEvent)).booleanValue() ? a.Dispatching : a.NotDispatching;
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return Yg.J.f24997a;
            }
        }

        /* renamed from: y0.H$b$c */
        static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8568H f66224a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C8568H c8568h) {
                super(1);
                this.f66224a = c8568h;
            }

            public final void a(MotionEvent motionEvent) {
                this.f66224a.c().invoke(motionEvent);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return Yg.J.f24997a;
            }
        }

        b() {
        }

        private final void h(C8593n c8593n) {
            List listC = c8593n.c();
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((C8604y) listC.get(i10)).p()) {
                    if (this.f66219b == a.Dispatching) {
                        C0.r rVarB = b();
                        if (rVarB == null) {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                        AbstractC8570J.b(c8593n, rVarB.o0(C6531g.f52335b.c()), new a(C8568H.this));
                    }
                    this.f66219b = a.NotDispatching;
                    return;
                }
            }
            C0.r rVarB2 = b();
            if (rVarB2 == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            AbstractC8570J.c(c8593n, rVarB2.o0(C6531g.f52335b.c()), new C2351b(C8568H.this));
            if (this.f66219b == a.Dispatching) {
                int size2 = listC.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((C8604y) listC.get(i11)).a();
                }
                C8585f c8585fD = c8593n.d();
                if (c8585fD == null) {
                    return;
                }
                c8585fD.e(!C8568H.this.a());
            }
        }

        private final void i() {
            this.f66219b = a.Unknown;
            C8568H.this.d(false);
        }

        @Override // y0.AbstractC8565E
        public boolean c() {
            return true;
        }

        @Override // y0.AbstractC8565E
        public void d() {
            if (this.f66219b == a.Dispatching) {
                AbstractC8570J.a(SystemClock.uptimeMillis(), new c(C8568H.this));
                i();
            }
        }

        @Override // y0.AbstractC8565E
        public void e(C8593n c8593n, EnumC8595p enumC8595p, long j10) {
            boolean z10;
            List listC = c8593n.c();
            if (C8568H.this.a()) {
                z10 = true;
                break;
            }
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                C8604y c8604y = (C8604y) listC.get(i10);
                if (AbstractC8594o.b(c8604y) || AbstractC8594o.d(c8604y)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            if (this.f66219b != a.NotDispatching) {
                if (enumC8595p == EnumC8595p.Initial && z10) {
                    h(c8593n);
                }
                if (enumC8595p == EnumC8595p.Final && !z10) {
                    h(c8593n);
                }
            }
            if (enumC8595p == EnumC8595p.Final) {
                int size2 = listC.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (!AbstractC8594o.d((C8604y) listC.get(i11))) {
                        return;
                    }
                }
                i();
            }
        }
    }

    @Override // y0.InterfaceC8566F
    public AbstractC8565E L0() {
        return this.f66218d;
    }

    public final boolean a() {
        return this.f66217c;
    }

    public final InterfaceC6835l c() {
        InterfaceC6835l interfaceC6835l = this.f66215a;
        if (interfaceC6835l != null) {
            return interfaceC6835l;
        }
        AbstractC6492s.v("onTouchEvent");
        return null;
    }

    public final void d(boolean z10) {
        this.f66217c = z10;
    }

    public final void e(InterfaceC6835l interfaceC6835l) {
        this.f66215a = interfaceC6835l;
    }

    public final void f(C8575O c8575o) {
        C8575O c8575o2 = this.f66216b;
        if (c8575o2 != null) {
            c8575o2.b(null);
        }
        this.f66216b = c8575o;
        if (c8575o == null) {
            return;
        }
        c8575o.b(this);
    }
}
