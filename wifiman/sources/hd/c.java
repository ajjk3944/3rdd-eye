package hd;

import Bc.a;
import Yg.J;
import Zg.AbstractC3689v;
import gg.AbstractC5912b;
import gg.i;
import hd.AbstractC5975a;
import hd.c;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import je.AbstractC6317r;
import je.u;
import kg.InterfaceC6465b;
import kg.InterfaceC6466c;
import kg.n;
import kg.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class c implements AbstractC5975a.c {

    /* renamed from: g, reason: collision with root package name */
    public static final b f48595g = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private Fg.a f48596a;

    /* renamed from: b, reason: collision with root package name */
    private LinkedBlockingQueue f48597b;

    /* renamed from: c, reason: collision with root package name */
    private final i f48598c;

    /* renamed from: d, reason: collision with root package name */
    private final i f48599d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5912b f48600e;

    /* renamed from: f, reason: collision with root package name */
    private final i f48601f;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC6317r f48602a;

        /* renamed from: b, reason: collision with root package name */
        private final a.b f48603b;

        public a(AbstractC6317r wifi, a.b cell) {
            AbstractC6492s.i(wifi, "wifi");
            AbstractC6492s.i(cell, "cell");
            this.f48602a = wifi;
            this.f48603b = cell;
        }

        public final AbstractC5975a.d a() {
            AbstractC6317r abstractC6317r = this.f48602a;
            if (!(abstractC6317r instanceof AbstractC6317r.a) && !(abstractC6317r instanceof AbstractC6317r.b.C1875b)) {
                if (abstractC6317r instanceof AbstractC6317r.b.a) {
                    return new AbstractC5975a.d.AbstractC1799a.b((AbstractC6317r.b.a) abstractC6317r);
                }
                throw new NoWhenBranchMatchedException();
            }
            a.b bVar = this.f48603b;
            if (bVar instanceof a.b.AbstractC0054a.AbstractC0056b) {
                return new AbstractC5975a.d.AbstractC1799a.C1800a((a.b.AbstractC0054a.AbstractC0056b) bVar);
            }
            if ((bVar instanceof a.b.AbstractC0054a.c) || (bVar instanceof a.b.AbstractC0054a.C0055a) || (bVar instanceof a.b.AbstractC0059b)) {
                return AbstractC5975a.d.b.f48593a;
            }
            throw new NoWhenBranchMatchedException();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f48602a, aVar.f48602a) && AbstractC6492s.d(this.f48603b, aVar.f48603b);
        }

        public int hashCode() {
            return (this.f48602a.hashCode() * 31) + this.f48603b.hashCode();
        }

        public String toString() {
            return "CombinedConnectionState(wifi=" + this.f48602a + ", cell=" + this.f48603b + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: hd.c$c, reason: collision with other inner class name */
    static final class C1801c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1801c f48604a = new C1801c();

        C1801c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a apply(AbstractC6317r wifiConnection, a.b simState) {
            AbstractC6492s.i(wifiConnection, "wifiConnection");
            AbstractC6492s.i(simState, "simState");
            return new a(wifiConnection, simState);
        }
    }

    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(J it) {
            AbstractC6492s.i(it, "it");
            return AbstractC3689v.i1(c.this.f48597b);
        }
    }

    static final class e implements InterfaceC6466c {

        /* renamed from: a, reason: collision with root package name */
        public static final e f48606a = new e();

        e() {
        }

        @Override // kg.InterfaceC6466c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean a(AbstractC6317r previous, AbstractC6317r current) {
            AbstractC6492s.i(previous, "previous");
            AbstractC6492s.i(current, "current");
            return ((previous instanceof AbstractC6317r.b.a) && (current instanceof AbstractC6317r.b.a)) ? AbstractC6492s.d(((AbstractC6317r.b.a) previous).h(), ((AbstractC6317r.b.a) current).h()) : AbstractC6492s.d(previous, current);
        }
    }

    static final class f implements p {
        f() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            return c.this.h(it);
        }
    }

    public c(u wifiConnectionService, Bc.a cellularSignalService) {
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        AbstractC6492s.i(cellularSignalService, "cellularSignalService");
        Fg.a aVarK2 = Fg.a.k2(J.f24997a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f48596a = aVarK2;
        this.f48597b = new LinkedBlockingQueue();
        i iVarM0 = wifiConnectionService.a().X(e.f48606a).m0(new f());
        AbstractC6492s.h(iVarM0, "filter(...)");
        this.f48598c = iVarM0;
        i iVarW = i.v(iVarM0, cellularSignalService.a(), C1801c.f48604a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f48599d = iVarW;
        AbstractC5912b abstractC5912bE0 = I5.b.b(iVarW, null, 1, null).r1(new InterfaceC6465b() { // from class: hd.b
            @Override // kg.InterfaceC6465b
            public final Object apply(Object obj, Object obj2) {
                return c.i(this.f48594a, (c.a) obj, (c.a) obj2);
            }
        }).o1(1).i2().E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f48600e = abstractC5912bE0;
        i iVarI2 = this.f48596a.U0(abstractC5912bE0).e1().Y0(Gg.a.a(), false, 1).N0(new d()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f48601f = iVarI2;
    }

    private final AbstractC5975a f(AbstractC5975a.d dVar, AbstractC5975a.d dVar2) {
        AbstractC5975a c1798a;
        if (dVar2 instanceof AbstractC5975a.d.AbstractC1799a.b) {
            if (dVar instanceof AbstractC5975a.d.AbstractC1799a.b) {
                AbstractC5975a.d.AbstractC1799a.b bVar = (AbstractC5975a.d.AbstractC1799a.b) dVar;
                AbstractC5975a.d.AbstractC1799a.b bVar2 = (AbstractC5975a.d.AbstractC1799a.b) dVar2;
                if (!AbstractC6492s.d(bVar.a().i(), bVar2.a().i())) {
                    return new AbstractC5975a.AbstractC1797a.b(0L, dVar, bVar2, 1, null);
                }
                if (AbstractC6492s.d(bVar.a().c(), bVar2.a().c())) {
                    return null;
                }
                return new AbstractC5975a.AbstractC1797a.c(0L, bVar, bVar2, 1, null);
            }
            if (!(dVar instanceof AbstractC5975a.d.AbstractC1799a.C1800a) && !(dVar instanceof AbstractC5975a.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c1798a = new AbstractC5975a.AbstractC1797a.b(0L, dVar, (AbstractC5975a.d.AbstractC1799a.b) dVar2, 1, null);
        } else {
            if (!(dVar2 instanceof AbstractC5975a.d.AbstractC1799a.C1800a)) {
                if (!(dVar2 instanceof AbstractC5975a.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (dVar instanceof AbstractC5975a.d.b) {
                    return null;
                }
                if (!(dVar instanceof AbstractC5975a.d.AbstractC1799a.C1800a) && !(dVar instanceof AbstractC5975a.d.AbstractC1799a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC5975a.b bVar3 = new AbstractC5975a.b(0L, (AbstractC5975a.d.AbstractC1799a) dVar, 1, null);
                return bVar3;
            }
            if (!(dVar instanceof AbstractC5975a.d.b) && !(dVar instanceof AbstractC5975a.d.AbstractC1799a.b)) {
                if (dVar instanceof AbstractC5975a.d.AbstractC1799a.C1800a) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            c1798a = new AbstractC5975a.AbstractC1797a.C1798a(0L, dVar, (AbstractC5975a.d.AbstractC1799a.C1800a) dVar2, 1, null);
        }
        return c1798a;
    }

    private final void g(AbstractC5975a abstractC5975a) {
        this.f48597b.add(abstractC5975a);
        this.f48596a.h(J.f24997a);
        Z7.b.h("AP_ROAMING - NEW EVENT - " + abstractC5975a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h(AbstractC6317r abstractC6317r) {
        if ((abstractC6317r instanceof AbstractC6317r.a) || (abstractC6317r instanceof AbstractC6317r.b.C1875b)) {
            return true;
        }
        if (!(abstractC6317r instanceof AbstractC6317r.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC6317r.b.a aVar = (AbstractC6317r.b.a) abstractC6317r;
        return (aVar.c() == null || aVar.h() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a i(c cVar, a previous, a current) {
        AbstractC6492s.i(previous, "previous");
        AbstractC6492s.i(current, "current");
        AbstractC5975a abstractC5975aF = cVar.f(previous.a(), current.a());
        if (abstractC5975aF != null) {
            cVar.g(abstractC5975aF);
        }
        return current;
    }

    @Override // hd.AbstractC5975a.c
    public i a() {
        return this.f48601f;
    }

    @Override // hd.AbstractC5975a.c
    public AbstractC5912b b() {
        return this.f48600e;
    }
}
