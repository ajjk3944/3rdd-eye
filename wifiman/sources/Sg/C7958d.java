package sg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kg.n;
import lg.EnumC6592b;
import zg.C8750c;
import zg.EnumC8754g;

/* renamed from: sg.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7958d extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.i f61514a;

    /* renamed from: b, reason: collision with root package name */
    final n f61515b;

    /* renamed from: c, reason: collision with root package name */
    final EnumC8754g f61516c;

    /* renamed from: d, reason: collision with root package name */
    final int f61517d;

    /* renamed from: sg.d$a */
    static final class a extends AbstractC7957c implements InterfaceC6043c {

        /* renamed from: i, reason: collision with root package name */
        final InterfaceC5914d f61518i;

        /* renamed from: j, reason: collision with root package name */
        final n f61519j;

        /* renamed from: k, reason: collision with root package name */
        final C2156a f61520k;

        /* renamed from: l, reason: collision with root package name */
        volatile boolean f61521l;

        /* renamed from: m, reason: collision with root package name */
        int f61522m;

        /* renamed from: sg.d$a$a, reason: collision with other inner class name */
        static final class C2156a extends AtomicReference implements InterfaceC5914d {

            /* renamed from: a, reason: collision with root package name */
            final a f61523a;

            C2156a(a aVar) {
                this.f61523a = aVar;
            }

            @Override // gg.InterfaceC5914d
            public void a() {
                this.f61523a.t();
            }

            @Override // gg.InterfaceC5914d
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.replace(this, interfaceC6043c);
            }

            void d() {
                EnumC6592b.dispose(this);
            }

            @Override // gg.InterfaceC5914d
            public void onError(Throwable th2) {
                this.f61523a.v(th2);
            }
        }

        a(InterfaceC5914d interfaceC5914d, n nVar, EnumC8754g enumC8754g, int i10) {
            super(i10, enumC8754g);
            this.f61518i = interfaceC5914d;
            this.f61519j = nVar;
            this.f61520k = new C2156a(this);
        }

        @Override // sg.AbstractC7957c
        void d() {
            this.f61520k.d();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            s();
        }

        @Override // sg.AbstractC7957c
        void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            EnumC8754g enumC8754g = this.f61508c;
            Dg.g gVar = this.f61509d;
            C8750c c8750c = this.f61506a;
            boolean z10 = this.f61513h;
            while (!this.f61512g) {
                if (c8750c.get() != null && (enumC8754g == EnumC8754g.IMMEDIATE || (enumC8754g == EnumC8754g.BOUNDARY && !this.f61521l))) {
                    gVar.clear();
                    c8750c.l(this.f61518i);
                    return;
                }
                if (!this.f61521l) {
                    boolean z11 = this.f61511f;
                    try {
                        Object objPoll = gVar.poll();
                        boolean z12 = objPoll == null;
                        if (z11 && z12) {
                            c8750c.l(this.f61518i);
                            return;
                        }
                        if (!z12) {
                            int i10 = this.f61507b;
                            int i11 = i10 - (i10 >> 1);
                            if (!z10) {
                                int i12 = this.f61522m + 1;
                                if (i12 == i11) {
                                    this.f61522m = 0;
                                    this.f61510e.request(i11);
                                } else {
                                    this.f61522m = i12;
                                }
                            }
                            try {
                                Object objApply = this.f61519j.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                                gg.f fVar = (gg.f) objApply;
                                this.f61521l = true;
                                fVar.e(this.f61520k);
                            } catch (Throwable th2) {
                                AbstractC6152a.b(th2);
                                gVar.clear();
                                this.f61510e.cancel();
                                c8750c.g(th2);
                                c8750c.l(this.f61518i);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC6152a.b(th3);
                        this.f61510e.cancel();
                        c8750c.g(th3);
                        c8750c.l(this.f61518i);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            gVar.clear();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f61512g;
        }

        @Override // sg.AbstractC7957c
        void o() {
            this.f61518i.c(this);
        }

        void t() {
            this.f61521l = false;
            g();
        }

        void v(Throwable th2) {
            if (this.f61506a.g(th2)) {
                if (this.f61508c != EnumC8754g.IMMEDIATE) {
                    this.f61521l = false;
                    g();
                    return;
                }
                this.f61510e.cancel();
                this.f61506a.l(this.f61518i);
                if (getAndIncrement() == 0) {
                    this.f61509d.clear();
                }
            }
        }
    }

    public C7958d(gg.i iVar, n nVar, EnumC8754g enumC8754g, int i10) {
        this.f61514a = iVar;
        this.f61515b = nVar;
        this.f61516c = enumC8754g;
        this.f61517d = i10;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f61514a.D1(new a(interfaceC5914d, this.f61515b, this.f61516c, this.f61517d));
    }
}
