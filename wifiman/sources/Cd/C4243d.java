package cd;

import android.net.Network;
import cd.InterfaceC4240a;
import com.marsounjan.icmp4a.Icmp;
import com.marsounjan.icmp4a.d;
import com.marsounjan.icmp4a.i;
import ee.AbstractC5456b;
import gg.i;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.n;
import kg.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: cd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4243d implements InterfaceC4240a {

    /* renamed from: a, reason: collision with root package name */
    private final com.marsounjan.icmp4a.a f33945a = new com.marsounjan.icmp4a.a();

    /* renamed from: cd.d$a */
    private static abstract class a {

        /* renamed from: cd.d$a$a, reason: collision with other inner class name */
        public static final class C1186a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Icmp.Error f33946a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1186a(Icmp.Error error) {
                super(null);
                AbstractC6492s.i(error, "error");
                this.f33946a = error;
            }

            public final Icmp.Error a() {
                return this.f33946a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1186a) && AbstractC6492s.d(this.f33946a, ((C1186a) obj).f33946a);
            }

            public int hashCode() {
                return this.f33946a.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.f33946a + ")";
            }
        }

        /* renamed from: cd.d$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Icmp.d f33947a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Icmp.d stats) {
                super(null);
                AbstractC6492s.i(stats, "stats");
                this.f33947a = stats;
            }

            public final Icmp.d a() {
                return this.f33947a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f33947a, ((b) obj).f33947a);
            }

            public int hashCode() {
                return this.f33947a.hashCode();
            }

            public String toString() {
                return "Success(stats=" + this.f33947a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: cd.d$b */
    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33948a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a apply(Icmp.d it) {
            AbstractC6492s.i(it, "it");
            return new a.b(it);
        }
    }

    /* renamed from: cd.d$c */
    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f33949a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            return it instanceof Icmp.Error ? i.K0(new a.C1186a((Icmp.Error) it)) : i.k0(it);
        }
    }

    /* renamed from: cd.d$d, reason: collision with other inner class name */
    static final class C1187d implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f33950a;

        C1187d(long j10) {
            this.f33950a = j10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(i it) {
            AbstractC6492s.i(it, "it");
            return it.S(this.f33950a * 2, TimeUnit.MILLISECONDS, Gg.a.d());
        }
    }

    /* renamed from: cd.d$e */
    static final class e implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f33951a = new e();

        e() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4240a.d apply(InterfaceC4240a.d dVar, a result) {
            InterfaceC4240a.c bVar;
            InterfaceC4240a.c eVar;
            AbstractC6492s.i(result, "result");
            if (!(result instanceof a.b)) {
                if (!(result instanceof a.C1186a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int iF = dVar.f() + 1;
                a.C1186a c1186a = (a.C1186a) result;
                Icmp.Error errorA = c1186a.a();
                if (errorA instanceof Icmp.Error.UnknownHost) {
                    bVar = new InterfaceC4240a.c.AbstractC1183a.d(((Icmp.Error.UnknownHost) c1186a.a()).getMessage());
                } else {
                    if (!(errorA instanceof Icmp.Error.ProtocolException) && !(errorA instanceof Icmp.Error.SocketException)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String message = c1186a.a().getMessage();
                    if (message == null) {
                        message = "Internal error";
                    }
                    bVar = new InterfaceC4240a.c.AbstractC1183a.b(message);
                }
                return InterfaceC4240a.d.b(dVar, null, iF, 0, bVar, 5, null);
            }
            a.b bVar2 = (a.b) result;
            inet.ipaddr.g gVarA = AbstractC5456b.a(bVar2.a().a());
            int iF2 = dVar.f() + 1;
            int iE = dVar.e() + 1;
            Icmp.c cVarB = bVar2.a().b();
            if (cVarB instanceof Icmp.c.b) {
                eVar = new InterfaceC4240a.c.b((int) ((Icmp.c.b) cVarB).a());
            } else if (cVarB instanceof Icmp.c.a.C1229c) {
                Icmp.c.a.C1229c c1229c = (Icmp.c.a.C1229c) cVarB;
                eVar = new InterfaceC4240a.c.AbstractC1183a.C1185c(c1229c.a(), c1229c.b());
            } else if (cVarB instanceof Icmp.c.a.b) {
                eVar = new InterfaceC4240a.c.AbstractC1183a.C1184a(((Icmp.c.a.b) cVarB).a());
            } else {
                if (!(cVarB instanceof Icmp.c.a.C1228a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Icmp.c.a.C1228a c1228a = (Icmp.c.a.C1228a) cVarB;
                K5.a aVarA = c1228a.a();
                if (!(aVarA instanceof d.b.a) && !(aVarA instanceof d.b.C1240d) && !(aVarA instanceof d.b.e) && !(aVarA instanceof d.b.c) && !(aVarA instanceof d.b.f) && !(aVarA instanceof i.b.a) && !(aVarA instanceof i.b.c) && !(aVarA instanceof i.b.d) && !(aVarA instanceof i.b.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = new InterfaceC4240a.c.AbstractC1183a.e(c1228a.b());
            }
            return dVar.a(gVarA, iF2, iE, eVar);
        }
    }

    /* renamed from: cd.d$f */
    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4240a.b f33952a;

        f(InterfaceC4240a.b bVar) {
            this.f33952a = bVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("IcmpPing [" + this.f33952a + "] - subscribed", null, 2, null);
        }
    }

    /* renamed from: cd.d$g */
    static final class g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4240a.b f33953a;

        g(InterfaceC4240a.b bVar) {
            this.f33953a = bVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC4240a.d dVar) {
            Z7.b.h("IcmpPing [" + this.f33953a + "] - " + dVar, null, 2, null);
        }
    }

    /* renamed from: cd.d$h */
    static final class h implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4240a.b f33954a;

        h(InterfaceC4240a.b bVar) {
            this.f33954a = bVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("IcmpPing [" + this.f33954a + "] - error", it.getCause(), null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4240a.d d() {
        return new InterfaceC4240a.d(null, 0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC4240a.b bVar) {
        Z7.b.h("IcmpPing [" + bVar + "] - completed", null, 2, null);
    }

    @Override // cd.InterfaceC4240a
    public gg.i a(final InterfaceC4240a.b destination, Integer num, int i10, long j10, long j11, Network network) {
        AbstractC6492s.i(destination, "destination");
        if (!(destination instanceof InterfaceC4240a.b.C1182a)) {
            throw new NoWhenBranchMatchedException();
        }
        com.marsounjan.icmp4a.a aVar = this.f33945a;
        String strG = ((InterfaceC4240a.b.C1182a) destination).a().g();
        AbstractC6492s.h(strG, "getHost(...)");
        gg.i iVarA0 = Qi.i.c(Icmp.a.a(aVar, strG, num, 0L, i10, j10, network, 4, null), null, 1, null).N0(b.f33948a).f1(c.f33949a).n1(new C1187d(j10)).s1(new q() { // from class: cd.b
            @Override // kg.q
            public final Object get() {
                return C4243d.d();
            }
        }, e.f33951a).F1(Gg.a.d()).e1().Y0(Gg.a.a(), false, 1).g0(new f(destination)).f0(new g(destination)).d0(new h(destination)).a0(new InterfaceC6464a() { // from class: cd.c
            @Override // kg.InterfaceC6464a
            public final void run() {
                C4243d.e(destination);
            }
        });
        AbstractC6492s.h(iVarA0, "doOnComplete(...)");
        return iVarA0;
    }
}
