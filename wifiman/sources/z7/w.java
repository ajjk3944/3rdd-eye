package z7;

import Zg.AbstractC3689v;
import gg.y;
import hg.InterfaceC6043c;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import x7.AbstractC8424a;

/* loaded from: classes3.dex */
public final class w implements InterfaceC6043c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f67148e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final gg.y f67149a;

    /* renamed from: b, reason: collision with root package name */
    private y.c f67150b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f67151c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f67152d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f67153a;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ DatagramPacket f67154a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(DatagramPacket datagramPacket) {
                super(0);
                this.f67154a = datagramPacket;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String string;
                SocketAddress socketAddress = this.f67154a.getSocketAddress();
                int port = this.f67154a.getPort();
                byte[] data = this.f67154a.getData();
                if (data != null) {
                    string = Arrays.toString(data);
                    AbstractC6492s.h(string, "toString(this)");
                } else {
                    string = null;
                }
                return "Prepared packet [target = " + socketAddress + ", port = " + port + ", data = " + string + "]";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(0);
            this.f67153a = list;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<j> list = this.f67153a;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (j jVar : list) {
                DatagramPacket datagramPacket = new DatagramPacket(jVar.b(), jVar.b().length, new InetSocketAddress(InetAddress.getByAddress(jVar.a()), jVar.c()));
                AbstractC8424a.c(new a(datagramPacket));
                arrayList.add(datagramPacket);
            }
            return arrayList;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f67155a = new c();

        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "packet sender - dispose";
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f67156a = new d();

        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "packet sender - starting";
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f67157a = new e();

        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "packet sender - sending packets (time trigger)";
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f67158a = new f();

        f() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "packet sender - packet send failed";
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f67159a = new g();

        g() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "packet sender - started";
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f67160a = new h();

        h() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "packet sender - stopping";
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f67161a = new i();

        i() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "packet sender - stopped";
        }
    }

    public w(List packets, gg.y scheduler) {
        AbstractC6492s.i(packets, "packets");
        AbstractC6492s.i(scheduler, "scheduler");
        this.f67149a = scheduler;
        this.f67151c = new AtomicBoolean(false);
        this.f67152d = Yg.n.b(new b(packets));
    }

    private final List b() {
        return (List) this.f67152d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(w this$0, DatagramSocket socket) throws IOException {
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(socket, "$socket");
        AbstractC8424a.c(e.f67157a);
        for (DatagramPacket datagramPacket : this$0.b()) {
            if (socket.isClosed()) {
                this$0.e();
                return;
            } else {
                try {
                    socket.send(datagramPacket);
                } catch (IOException e10) {
                    AbstractC8424a.d(f.f67158a, e10);
                }
            }
        }
    }

    public final void c(final DatagramSocket socket) {
        AbstractC6492s.i(socket, "socket");
        if (this.f67151c.get()) {
            return;
        }
        AbstractC8424a.c(d.f67156a);
        y.c cVarC = this.f67149a.c();
        AbstractC6492s.h(cVarC, "scheduler.createWorker()");
        this.f67150b = cVarC;
        cVarC.d(new Runnable() { // from class: z7.v
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                w.d(this.f67146a, socket);
            }
        }, 0L, 1000L, TimeUnit.MILLISECONDS);
        this.f67151c.set(true);
        AbstractC8424a.c(g.f67159a);
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        AbstractC8424a.c(c.f67155a);
        e();
    }

    public final void e() {
        AbstractC8424a.c(h.f67160a);
        y.c cVar = this.f67150b;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f67150b = null;
        this.f67151c.set(false);
        AbstractC8424a.c(i.f67161a);
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return !this.f67151c.get();
    }
}
