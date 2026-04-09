package dd;

import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.Q;
import android.net.Network;
import b8.AbstractC4075b;
import cd.InterfaceC4240a;
import gg.C;
import gg.InterfaceC5910A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import sh.AbstractC7978m;

/* renamed from: dd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5349c implements InterfaceC5347a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4240a f45989a;

    /* renamed from: b, reason: collision with root package name */
    private final Yc.c f45990b;

    /* renamed from: dd.c$a */
    public static final class a implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(z.a(new LinkedList(), new LinkedList()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: dd.c$b */
    static final class b implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45992b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f45993c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f45994d;

        /* renamed from: dd.c$b$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45995a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5349c f45996b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f45997c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LinkedList f45998d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ LinkedList f45999e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f46000f;

            /* renamed from: dd.c$b$a$a, reason: collision with other inner class name */
            static final class C1717a implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final C1717a f46001a = new C1717a();

                C1717a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final s apply(InterfaceC4240a.d it) {
                    AbstractC6492s.i(it, "it");
                    return z.a(it, Boolean.TRUE);
                }
            }

            /* renamed from: dd.c$b$a$b, reason: collision with other inner class name */
            static final class C1718b implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ int f46002a;

                C1718b(int i10) {
                    this.f46002a = i10;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(gg.i it) {
                    AbstractC6492s.i(it, "it");
                    return it.R(this.f46002a, TimeUnit.MILLISECONDS);
                }
            }

            /* renamed from: dd.c$b$a$c, reason: collision with other inner class name */
            static final class C1719c implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LinkedList f46003a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AbstractC5349c f46004b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f46005c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LinkedList f46006d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ int f46007e;

                C1719c(LinkedList linkedList, AbstractC5349c abstractC5349c, String str, LinkedList linkedList2, int i10) {
                    this.f46003a = linkedList;
                    this.f46004b = abstractC5349c;
                    this.f46005c = str;
                    this.f46006d = linkedList2;
                    this.f46007e = i10;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final i apply(s sVar) {
                    i iVarF;
                    AbstractC6492s.i(sVar, "<destruct>");
                    InterfaceC4240a.d dVar = (InterfaceC4240a.d) sVar.a();
                    boolean zBooleanValue = ((Boolean) sVar.c()).booleanValue();
                    LinkedList linkedList = this.f46003a;
                    AbstractC5349c abstractC5349c = this.f46004b;
                    String str = this.f46005c;
                    LinkedList linkedList2 = this.f46006d;
                    int i10 = this.f46007e;
                    synchronized (linkedList) {
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis() - 35000;
                            Iterator it = linkedList.iterator();
                            AbstractC6492s.h(it, "iterator(...)");
                            while (it.hasNext()) {
                                if (((Wc.c) it.next()).c() < jCurrentTimeMillis) {
                                    it.remove();
                                }
                            }
                            linkedList.add(new Wc.c(0L, dVar.d(), 1, null));
                            iVarF = abstractC5349c.f(str, dVar.c(), linkedList, linkedList2, i10, zBooleanValue);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return iVarF;
                }
            }

            a(String str, AbstractC5349c abstractC5349c, int i10, LinkedList linkedList, LinkedList linkedList2, int i11) {
                this.f45995a = str;
                this.f45996b = abstractC5349c;
                this.f45997c = i10;
                this.f45998d = linkedList;
                this.f45999e = linkedList2;
                this.f46000f = i11;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(C6556a c6556a) {
                gg.i iVarN1;
                AbstractC6492s.i(c6556a, "<destruct>");
                Network network = (Network) c6556a.a();
                if (network != null) {
                    inet.ipaddr.e eVar = new inet.ipaddr.e(this.f45995a);
                    if (eVar.p()) {
                        iVarN1 = InterfaceC4240a.C1181a.a(this.f45996b.f45989a, new InterfaceC4240a.b.C1182a(eVar), null, 0, this.f45997c, 0L, network, 20, null).N0(C1717a.f46001a);
                    } else {
                        iVarN1 = gg.i.K0(z.a(new InterfaceC4240a.d(null, 0, 0, new InterfaceC4240a.c.AbstractC1183a.d("'" + this.f45995a + "' is not a valid hostname")), Boolean.FALSE));
                    }
                } else {
                    iVarN1 = gg.i.K0(z.a(new InterfaceC4240a.d(null, 0, 0, new InterfaceC4240a.c.AbstractC1183a.C1184a("network unavailable")), Boolean.FALSE)).n1(new C1718b(this.f45997c));
                }
                return iVarN1.N0(new C1719c(this.f45998d, this.f45996b, this.f45995a, this.f45999e, this.f46000f)).z1(new i(this.f45995a, null, null, null, null, null, AbstractC3689v.l()));
            }
        }

        b(String str, int i10, int i11) {
            this.f45992b = str;
            this.f45993c = i10;
            this.f45994d = i11;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            return AbstractC5349c.this.f45990b.e().I1(new a(this.f45992b, AbstractC5349c.this, this.f45993c, (LinkedList) sVar.a(), (LinkedList) sVar.c(), this.f45994d));
        }
    }

    /* renamed from: dd.c$c, reason: collision with other inner class name */
    static final class C1720c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46008a;

        C1720c(String str) {
            this.f46008a = str;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("HOST " + this.f46008a + " status subscribed", null, 2, null);
        }
    }

    public AbstractC5349c(InterfaceC4240a icmp, Yc.c networkHandle) {
        AbstractC6492s.i(icmp, "icmp");
        AbstractC6492s.i(networkHandle, "networkHandle");
        this.f45989a = icmp;
        this.f45990b = networkHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i f(String str, inet.ipaddr.g gVar, List list, LinkedList linkedList, int i10, boolean z10) {
        AbstractC4075b abstractC4075bA;
        Wc.c cVar;
        InterfaceC4240a.c cVar2;
        ArrayList<InterfaceC4240a.c> arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis() - i10;
        int i11 = 0;
        Iterator it = AbstractC7978m.p(list.size() - 1, 0).iterator();
        while (it.hasNext()) {
            Wc.c cVar3 = (Wc.c) list.get(((Q) it).d());
            if (cVar3.c() >= jCurrentTimeMillis && (cVar2 = (InterfaceC4240a.c) cVar3.d()) != null) {
                arrayList.add(cVar2);
            }
        }
        b8.d dVarB = null;
        Boolean bool = null;
        int iA = 0;
        for (InterfaceC4240a.c cVar4 : arrayList) {
            if (cVar4 instanceof InterfaceC4240a.c.b) {
                i11++;
                bool = Boolean.TRUE;
                iA += ((InterfaceC4240a.c.b) cVar4).a();
            } else {
                if (!(cVar4 instanceof InterfaceC4240a.c.AbstractC1183a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
            }
        }
        if (!z10) {
            bool = Boolean.FALSE;
        }
        Boolean bool2 = bool;
        AbstractC4075b abstractC4075bA2 = (!z10 || i11 <= 0) ? null : AbstractC4075b.f33002a.a(iA / i11);
        linkedList.add(new Wc.c(0L, abstractC4075bA2, 1, null));
        if (!z10 || (cVar = (Wc.c) AbstractC3689v.D0(list)) == null) {
            abstractC4075bA = null;
        } else {
            Object objD = cVar.d();
            InterfaceC4240a.c.b bVar = objD instanceof InterfaceC4240a.c.b ? (InterfaceC4240a.c.b) objD : null;
            abstractC4075bA = bVar != null ? AbstractC4075b.f33002a.a(bVar.a()) : null;
        }
        if (!z10) {
            dVarB = b8.d.f33007a.c();
        } else if (!arrayList.isEmpty()) {
            dVarB = b8.d.f33007a.b(1.0f - (i11 / arrayList.size()));
        }
        return new i(str, gVar, bool2, abstractC4075bA2, abstractC4075bA, dVarB, AbstractC3689v.i1(linkedList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str) {
        Z7.b.h("HOST " + str + " status finished", null, 2, null);
    }

    @Override // dd.InterfaceC5347a
    public gg.i a(final String host, int i10, int i11) {
        AbstractC6492s.i(host, "host");
        gg.z zVarI = gg.z.i(new a());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarZ = zVarI.w(new b(host, i11, i10)).g0(new C1720c(host)).Z(new InterfaceC6464a() { // from class: dd.b
            @Override // kg.InterfaceC6464a
            public final void run() {
                AbstractC5349c.g(host);
            }
        });
        AbstractC6492s.h(iVarZ, "doFinally(...)");
        return iVarZ;
    }
}
