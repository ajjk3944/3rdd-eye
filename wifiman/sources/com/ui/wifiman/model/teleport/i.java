package com.ui.wifiman.model.teleport;

import Fd.C;
import Fd.D;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import com.ui.wifiman.model.teleport.session.TeleportSession;
import com.ui.wifiman.model.ubiquiti.console.e;
import gg.AbstractC5912b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class i implements C {

    /* renamed from: a, reason: collision with root package name */
    private final D f43313a;

    /* renamed from: b, reason: collision with root package name */
    private final k f43314b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f43315c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f43316d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f43317e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5912b f43318f;

    static final class a implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f43319a = new a();

        /* renamed from: com.ui.wifiman.model.teleport.i$a$a, reason: collision with other inner class name */
        public static final class C1452a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((e.b) obj).n(), ((e.b) obj2).n());
            }
        }

        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List a(l9.C6556a r18, java.util.List r19, java.util.List r20) {
            /*
                Method dump skipped, instructions count: 355
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.teleport.i.a.a(l9.a, java.util.List, java.util.List):java.util.List");
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43320a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            return AbstractC3689v.X0(it, h.f43292a.a());
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f43321a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            com.ui.wifiman.model.ubiquiti.console.b bVarD;
            gg.i iVarA;
            AbstractC6492s.i(c6556a, "<destruct>");
            Ld.e eVar = (Ld.e) c6556a.a();
            return (eVar == null || (bVarD = eVar.d()) == null || (iVarA = bVarD.a()) == null) ? gg.i.K0(AbstractC3689v.l()) : iVarA;
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f43322a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List consoleList) {
            Object next;
            AbstractC6492s.i(consoleList, "consoleList");
            Iterator it = consoleList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((h) next).C()) {
                    break;
                }
            }
            return new C6556a(next);
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43323a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(List consoles) {
            AbstractC6492s.i(consoles, "consoles");
            List list = consoles;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(e.b.a(((h) it.next()).j()));
            }
            return AbstractC3689v.n1(arrayList);
        }
    }

    static final class f implements kg.n {

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(Boolean.valueOf(((h) obj2).h()), Boolean.valueOf(((h) obj).h()));
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(List consoles) {
            Object next;
            AbstractC6492s.i(consoles, "consoles");
            List list = consoles;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((h) next).C()) {
                    break;
                }
            }
            if (next != null || consoles.isEmpty()) {
                return AbstractC5912b.m();
            }
            Comparator comparatorThenComparing = new a().thenComparing(h.f43292a.a());
            AbstractC6492s.h(comparatorThenComparing, "thenComparing(...)");
            String strJ = ((h) AbstractC3689v.q0(AbstractC3689v.X0(list, comparatorThenComparing))).j();
            Z7.b.h("There is currently no main console set, but there are Ubiquiti Consoles available. Setting $" + strJ + " as main console", null, 2, null);
            return i.this.f43313a.b(strJ);
        }
    }

    public i(TeleportSession teleportSession, D teleportManager, k teleportStatusService, Ld.f cloudSessionService) {
        AbstractC6492s.i(teleportSession, "teleportSession");
        AbstractC6492s.i(teleportManager, "teleportManager");
        AbstractC6492s.i(teleportStatusService, "teleportStatusService");
        AbstractC6492s.i(cloudSessionService, "cloudSessionService");
        this.f43313a = teleportManager;
        this.f43314b = teleportStatusService;
        gg.i iVarI1 = cloudSessionService.a().I1(c.f43321a);
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f43315c = iVarI1;
        gg.i iVarI2 = gg.i.u(teleportSession.c(), teleportStatusService.getAll(), iVarI1, a.f43319a).N0(b.f43320a).e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43316d = iVarI2;
        gg.i iVarI22 = getAll().N0(d.f43322a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43317e = iVarI22;
        AbstractC5912b abstractC5912bE0 = getAll().Y(e.f43323a).L1(new f()).c0().h1().i2().E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f43318f = abstractC5912bE0;
    }

    @Override // Fd.C
    public gg.i a() {
        return this.f43317e;
    }

    @Override // Fd.C
    public AbstractC5912b b() {
        return this.f43318f;
    }

    @Override // Fd.C
    public gg.i getAll() {
        return this.f43316d;
    }
}
