package z7;

import gg.EnumC5911a;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketException;
import kg.InterfaceC6468e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import o7.AbstractC7095a;
import o7.InterfaceC7096b;
import x7.AbstractC8424a;
import z7.d;

/* loaded from: classes3.dex */
public final class d implements InterfaceC8714a {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7096b f67068b;

    /* renamed from: c, reason: collision with root package name */
    private final x f67069c;

    static final class a implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f67071b;

        /* renamed from: z7.d$a$a, reason: collision with other inner class name */
        static final class C2381a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2381a f67072a = new C2381a();

            C2381a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to bind socket to network";
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f67073a = new b();

            b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "failed to close socket";
            }
        }

        a(Integer num) {
            this.f67071b = num;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(d this$0, Integer num, AbstractC7095a network, gg.j emitter) throws IOException {
            AbstractC6492s.i(this$0, "this$0");
            AbstractC6492s.i(network, "$network");
            AbstractC6492s.i(emitter, "emitter");
            final DatagramSocket datagramSocketA = this$0.f67069c.a(num);
            if (network instanceof AbstractC7095a.C2004a) {
                try {
                    ((AbstractC7095a.C2004a) network).a(datagramSocketA);
                } catch (SocketException e10) {
                    AbstractC8424a.d(C2381a.f67072a, e10);
                }
            }
            emitter.d(new InterfaceC6468e() { // from class: z7.c
                @Override // kg.InterfaceC6468e
                public final void cancel() {
                    d.a.e(datagramSocketA);
                }
            });
            emitter.h(new z(datagramSocketA));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DatagramSocket socket) {
            AbstractC6492s.i(socket, "$socket");
            try {
                socket.close();
            } catch (IOException e10) {
                AbstractC8424a.d(b.f67073a, e10);
            }
        }

        @Override // kg.n
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(final AbstractC7095a network) {
            AbstractC6492s.i(network, "network");
            if (network instanceof AbstractC7095a.C2004a ? true : AbstractC6492s.d(network, AbstractC7095a.c.f55507a)) {
                final d dVar = d.this;
                final Integer num = this.f67071b;
                return gg.i.N(new gg.k() { // from class: z7.b
                    @Override // gg.k
                    public final void a(gg.j jVar) throws IOException {
                        d.a.d(dVar, num, network, jVar);
                    }
                }, EnumC5911a.ERROR);
            }
            if (AbstractC6492s.d(network, AbstractC7095a.b.f55506a)) {
                return gg.i.K0(new z(null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public d(InterfaceC7096b androidServices, x factory) {
        AbstractC6492s.i(androidServices, "androidServices");
        AbstractC6492s.i(factory, "factory");
        this.f67068b = androidServices;
        this.f67069c = factory;
    }

    @Override // z7.InterfaceC8714a
    public gg.i a(Integer num) {
        gg.i iVarI1 = this.f67068b.a().I1(new a(num));
        AbstractC6492s.h(iVarI1, "@SuppressLint(\"NewApi\")\n…    }\n            }\n    }");
        return iVarI1;
    }
}
