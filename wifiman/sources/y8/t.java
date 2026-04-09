package y8;

import Yg.J;
import Zg.AbstractC3689v;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class t implements r {

    /* renamed from: a, reason: collision with root package name */
    private final gg.i f66495a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedList f66496b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f66497c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5912b f66498d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f66499e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f66500f;

    static final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(J it) {
            List listI1;
            AbstractC6492s.i(it, "it");
            LinkedList linkedList = t.this.f66496b;
            t tVar = t.this;
            synchronized (linkedList) {
                listI1 = AbstractC3689v.i1(tVar.f66496b);
            }
            return listI1;
        }
    }

    static final class b implements kg.n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f66503a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ dd.i f66504b;

            public a(t tVar, dd.i iVar) {
                this.f66503a = tVar;
                this.f66504b = iVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    synchronized (this.f66503a.f66496b) {
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis() - 35000;
                            Iterator it = this.f66503a.f66496b.iterator();
                            AbstractC6492s.h(it, "iterator(...)");
                            while (it.hasNext() && ((Wc.c) it.next()).c() < jCurrentTimeMillis) {
                                it.remove();
                            }
                            this.f66503a.f66496b.add(new Wc.c(System.currentTimeMillis(), this.f66504b.e()));
                        } finally {
                        }
                    }
                    this.f66503a.f66497c.h(J.f24997a);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(dd.i it) {
            AbstractC6492s.i(it, "it");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(t.this, it));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            LinkedList linkedList = t.this.f66496b;
            t tVar = t.this;
            synchronized (linkedList) {
                tVar.f66496b.add(new Wc.c(System.currentTimeMillis(), null));
                J j10 = J.f24997a;
            }
        }
    }

    public t(Zc.c internetLatencyService, ad.d dnsLatencyService) {
        AbstractC6492s.i(internetLatencyService, "internetLatencyService");
        AbstractC6492s.i(dnsLatencyService, "dnsLatencyService");
        this.f66495a = internetLatencyService.a();
        this.f66496b = new LinkedList();
        Fg.a aVarK2 = Fg.a.k2(J.f24997a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f66497c = aVarK2;
        AbstractC5912b abstractC5912bC = internetLatencyService.a().t0(new b()).B(new c()).C(new InterfaceC6464a() { // from class: y8.s
            @Override // kg.InterfaceC6464a
            public final void run() {
                t.i(this.f66494a);
            }
        });
        AbstractC6492s.h(abstractC5912bC, "doOnTerminate(...)");
        this.f66498d = abstractC5912bC;
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).N0(new a()).U0(abstractC5912bC).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f66499e = iVarI2;
        this.f66500f = dnsLatencyService.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(t tVar) {
        synchronized (tVar.f66496b) {
            tVar.f66496b.add(new Wc.c(System.currentTimeMillis(), null));
            J j10 = J.f24997a;
        }
    }

    @Override // y8.r
    public gg.i a() {
        return this.f66499e;
    }

    @Override // y8.r
    public gg.i c() {
        return this.f66495a;
    }

    @Override // y8.r
    public gg.i e() {
        return this.f66500f;
    }
}
