package z7;

import gg.EnumC5911a;
import gg.y;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import p7.InterfaceC7237b;
import x7.AbstractC8424a;
import z7.u;

/* loaded from: classes3.dex */
public final class u implements q {

    /* renamed from: b, reason: collision with root package name */
    private final DatagramSocket f67135b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7237b f67136c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f67137d;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: z7.u$a$a, reason: collision with other inner class name */
        static final class C2385a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2385a f67139a = new C2385a();

            C2385a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "packet observer - subscribed";
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f67140a = new b();

            b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "packet observer - scheduling infinite loop";
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f67141a = new c();

            c() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "packet observer - infinite loop started";
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f67142a = new d();

            d() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "packet observer - stopped because of IOException";
            }
        }

        static final class e extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f67143a = new e();

            e() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "packet observer - infinite loop ended";
            }
        }

        static final class f implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final f f67144a = new f();

            /* renamed from: z7.u$a$f$a, reason: collision with other inner class name */
            static final class C2386a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final C2386a f67145a = new C2386a();

                C2386a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "packet observer - dropping packet";
                }
            }

            f() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(DatagramPacket it) {
                AbstractC6492s.i(it, "it");
                AbstractC8424a.c(C2386a.f67145a);
            }
        }

        a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(gg.y scheduler, final u this$0, final gg.j emitter) {
            AbstractC6492s.i(scheduler, "$scheduler");
            AbstractC6492s.i(this$0, "this$0");
            AbstractC6492s.i(emitter, "emitter");
            AbstractC8424a.c(C2385a.f67139a);
            final y.c cVarC = scheduler.c();
            AbstractC6492s.h(cVarC, "scheduler.createWorker()");
            emitter.d(new InterfaceC6468e() { // from class: z7.s
                @Override // kg.InterfaceC6468e
                public final void cancel() {
                    u.a.n(cVarC);
                }
            });
            AbstractC8424a.c(b.f67140a);
            cVarC.b(new Runnable() { // from class: z7.t
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    u.a.o(cVarC, this$0, emitter);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(y.c worker) {
            AbstractC6492s.i(worker, "$worker");
            worker.dispose();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(y.c worker, u this$0, gg.j emitter) throws IOException {
            AbstractC6492s.i(worker, "$worker");
            AbstractC6492s.i(this$0, "this$0");
            AbstractC6492s.i(emitter, "$emitter");
            AbstractC8424a.c(c.f67141a);
            while (!worker.isDisposed()) {
                try {
                    DatagramPacket datagramPacket = new DatagramPacket(new byte[2048], 2048);
                    this$0.f67135b.receive(datagramPacket);
                    emitter.h(datagramPacket);
                } catch (IOException unused) {
                    AbstractC8424a.e(d.f67142a, null, 2, null);
                    emitter.a();
                }
            }
            AbstractC8424a.c(e.f67143a);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final gg.i invoke() {
            final gg.y yVarA = u.this.f67136c.a();
            final u uVar = u.this;
            gg.i iVarD1 = gg.i.N(new gg.k() { // from class: z7.r
                @Override // gg.k
                public final void a(gg.j jVar) {
                    u.a.l(yVarA, uVar, jVar);
                }
            }, EnumC5911a.DROP).d1(f.f67144a);
            AbstractC6492s.h(iVarD1, "create<DatagramPacket>({…g packet\" }\n            }");
            return iVarD1;
        }
    }

    public u(DatagramSocket socket, InterfaceC7237b schedulerProvider) {
        AbstractC6492s.i(socket, "socket");
        AbstractC6492s.i(schedulerProvider, "schedulerProvider");
        this.f67135b = socket;
        this.f67136c = schedulerProvider;
        this.f67137d = Yg.n.b(new a());
    }

    @Override // z7.q
    public gg.i a() {
        return (gg.i) this.f67137d.getValue();
    }
}
