package sg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import gg.s;
import gg.x;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kg.n;
import lg.EnumC6592b;
import r.Y;
import zg.C8750c;

/* renamed from: sg.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7964j extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final s f61594a;

    /* renamed from: b, reason: collision with root package name */
    final n f61595b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f61596c;

    /* renamed from: sg.j$a */
    static final class a implements x, InterfaceC6043c {

        /* renamed from: h, reason: collision with root package name */
        static final C2162a f61597h = new C2162a(null);

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f61598a;

        /* renamed from: b, reason: collision with root package name */
        final n f61599b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f61600c;

        /* renamed from: d, reason: collision with root package name */
        final C8750c f61601d = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference f61602e = new AtomicReference();

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f61603f;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC6043c f61604g;

        /* renamed from: sg.j$a$a, reason: collision with other inner class name */
        static final class C2162a extends AtomicReference implements InterfaceC5914d {

            /* renamed from: a, reason: collision with root package name */
            final a f61605a;

            C2162a(a aVar) {
                this.f61605a = aVar;
            }

            @Override // gg.InterfaceC5914d
            public void a() {
                this.f61605a.d(this);
            }

            @Override // gg.InterfaceC5914d
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            void d() {
                EnumC6592b.dispose(this);
            }

            @Override // gg.InterfaceC5914d
            public void onError(Throwable th2) {
                this.f61605a.e(this, th2);
            }
        }

        a(InterfaceC5914d interfaceC5914d, n nVar, boolean z10) {
            this.f61598a = interfaceC5914d;
            this.f61599b = nVar;
            this.f61600c = z10;
        }

        @Override // gg.x
        public void a() {
            this.f61603f = true;
            if (this.f61602e.get() == null) {
                this.f61601d.l(this.f61598a);
            }
        }

        void b() {
            AtomicReference atomicReference = this.f61602e;
            C2162a c2162a = f61597h;
            C2162a c2162a2 = (C2162a) atomicReference.getAndSet(c2162a);
            if (c2162a2 == null || c2162a2 == c2162a) {
                return;
            }
            c2162a2.d();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f61604g, interfaceC6043c)) {
                this.f61604g = interfaceC6043c;
                this.f61598a.c(this);
            }
        }

        void d(C2162a c2162a) {
            if (Y.a(this.f61602e, c2162a, null) && this.f61603f) {
                this.f61601d.l(this.f61598a);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f61604g.dispose();
            b();
            this.f61601d.h();
        }

        void e(C2162a c2162a, Throwable th2) {
            if (!Y.a(this.f61602e, c2162a, null)) {
                Eg.a.v(th2);
                return;
            }
            if (this.f61601d.g(th2)) {
                if (this.f61600c) {
                    if (this.f61603f) {
                        this.f61601d.l(this.f61598a);
                    }
                } else {
                    this.f61604g.dispose();
                    b();
                    this.f61601d.l(this.f61598a);
                }
            }
        }

        @Override // gg.x
        public void h(Object obj) {
            C2162a c2162a;
            try {
                Object objApply = this.f61599b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                gg.f fVar = (gg.f) objApply;
                C2162a c2162a2 = new C2162a(this);
                do {
                    c2162a = (C2162a) this.f61602e.get();
                    if (c2162a == f61597h) {
                        return;
                    }
                } while (!Y.a(this.f61602e, c2162a, c2162a2));
                if (c2162a != null) {
                    c2162a.d();
                }
                fVar.e(c2162a2);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f61604g.dispose();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f61602e.get() == f61597h;
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f61601d.g(th2)) {
                if (this.f61600c) {
                    a();
                } else {
                    b();
                    this.f61601d.l(this.f61598a);
                }
            }
        }
    }

    public C7964j(s sVar, n nVar, boolean z10) {
        this.f61594a = sVar;
        this.f61595b = nVar;
        this.f61596c = z10;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        if (AbstractC7965k.a(this.f61594a, this.f61595b, interfaceC5914d)) {
            return;
        }
        this.f61594a.d(new a(interfaceC5914d, this.f61595b, this.f61596c));
    }
}
