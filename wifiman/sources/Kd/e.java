package Kd;

import Kd.a;
import Zg.AbstractC3689v;
import ac.C3785b;
import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.console.e;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.f;
import gg.i;
import gg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import org.conscrypt.PSKKeyManager;
import ua.InterfaceC8153a;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;
import xa.o;

/* loaded from: classes4.dex */
public final class e implements Kd.d {

    /* renamed from: a, reason: collision with root package name */
    private final ac.e f10657a;

    /* renamed from: b, reason: collision with root package name */
    private final o f10658b;

    /* renamed from: c, reason: collision with root package name */
    private final i f10659c;

    static final class a implements InterfaceC6465b {
        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List results, InterfaceC8290a catalog) {
            AbstractC6492s.i(results, "results");
            AbstractC6492s.i(catalog, "catalog");
            List list = results;
            e eVar = e.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(eVar.h((C3785b) it.next(), catalog));
            }
            return arrayList;
        }
    }

    public static final class b implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10662b;

        public b(String str) {
            this.f10662b = str;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                e.this.f10657a.b(this.f10662b);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class c implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10664b;

        public c(String str) {
            this.f10664b = str;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            String strB;
            try {
                C3785b c3785bD = e.this.f10657a.d(this.f10664b);
                String strB2 = (c3785bD == null || (strB = c3785bD.b()) == null) ? null : TeleportTunnel.d.b(strB);
                interfaceC5910A.onSuccess(new C6556a(strB2 != null ? TeleportTunnel.d.a(strB2) : null));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public static final class d implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Kd.a f10666b;

        public d(Kd.a aVar) {
            this.f10666b = aVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                e.this.f10657a.c(e.this.i(this.f10666b));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: Kd.e$e, reason: collision with other inner class name */
    static final class C0429e implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10668b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.C0428a f10669c;

        /* renamed from: Kd.e$e$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f10670a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f10671b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC8290a f10672c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a.C0428a f10673d;

            public a(e eVar, String str, InterfaceC8290a interfaceC8290a, a.C0428a c0428a) {
                this.f10670a = eVar;
                this.f10671b = str;
                this.f10672c = interfaceC8290a;
                this.f10673d = c0428a;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                Kd.a aVarH;
                try {
                    C3785b c3785b = this.f10670a.f10657a.get(this.f10671b);
                    if (c3785b != null) {
                        e eVar = this.f10670a;
                        AbstractC6492s.f(this.f10672c);
                        aVarH = eVar.h(c3785b, this.f10672c);
                    } else {
                        aVarH = null;
                    }
                    if (aVarH != null) {
                        this.f10670a.f10657a.c(this.f10670a.i(Kd.a.b(aVarH, null, null, null, this.f10673d, 7, null)));
                    } else {
                        Z7.b.e("Can't update teleport tunnel console since no Teleport tunnel found with " + TeleportTunnel.d.f(this.f10671b), null, null, 6, null);
                    }
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        C0429e(String str, a.C0428a c0428a) {
            this.f10668b = str;
            this.f10669c = c0428a;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f apply(InterfaceC8290a catalog) {
            AbstractC6492s.i(catalog, "catalog");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(e.this, this.f10668b, catalog, this.f10669c));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR.W(Gg.a.d());
        }
    }

    public e(ac.e dao, o productCatalog) {
        AbstractC6492s.i(dao, "dao");
        AbstractC6492s.i(productCatalog, "productCatalog");
        this.f10657a = dao;
        this.f10658b = productCatalog;
        i iVarX0 = i.v(dao.a(), productCatalog.b(), new a()).F1(Gg.a.d()).X0(Gg.a.a());
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        this.f10659c = iVarX0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Kd.a h(C3785b c3785b, InterfaceC8290a interfaceC8290a) {
        UUID uuidB;
        InterfaceC8439a.d dVar;
        UUID uuid;
        String strB = TeleportTunnel.d.b(c3785b.b());
        String strL = c3785b.l();
        TeleportCloud.b.a aVar = null;
        TeleportCloud.e.b bVar = strL != null ? new TeleportCloud.e.b(strL) : null;
        String strM = c3785b.m();
        if (strM != null) {
            UUID uuidFromString = UUID.fromString(strM);
            AbstractC6492s.h(uuidFromString, "fromString(...)");
            uuidB = b.a.b(uuidFromString);
        } else {
            uuidB = null;
        }
        String strD = e.b.d(c3785b.a());
        String strI = c3785b.i();
        String strJ = c3785b.j();
        String strN = c3785b.n();
        String strK = c3785b.k();
        if (strK != null) {
            InterfaceC8439a.d dVar2 = (InterfaceC8439a.d) interfaceC8290a.c(InterfaceC8153a.C2195a.c(strK));
            if (dVar2 == null) {
                dVar2 = (InterfaceC8439a.d) interfaceC8290a.d(strK);
            }
            dVar = dVar2;
        } else {
            dVar = null;
        }
        String strE = c3785b.e();
        Integer numC = c3785b.c();
        String strG = c3785b.g();
        if (c3785b.f() == null || c3785b.h() == null) {
            uuid = uuidB;
        } else {
            Double dF = c3785b.f();
            AbstractC6492s.f(dF);
            double dDoubleValue = dF.doubleValue();
            Double dH = c3785b.h();
            AbstractC6492s.f(dH);
            uuid = uuidB;
            aVar = new TeleportCloud.b.a(dDoubleValue, dH.doubleValue());
        }
        return new Kd.a(strB, bVar, uuid, new a.C0428a(strD, strI, strJ, strN, dVar, strE, numC, aVar, strG, null), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3785b i(Kd.a aVar) {
        String strG = aVar.g();
        TeleportCloud.e.b bVarE = aVar.e();
        String strA = bVarE != null ? bVarE.a() : null;
        String strB = aVar.c().b();
        UUID uuidF = aVar.f();
        String string = uuidF != null ? uuidF.toString() : null;
        String strG2 = aVar.c().g();
        String strH = aVar.c().h();
        String strJ = aVar.c().j();
        InterfaceC8439a.d dVarI = aVar.c().i();
        String strMo3getId2jxHnRY = dVarI != null ? dVarI.mo3getId2jxHnRY() : null;
        String strD = aVar.c().d();
        Integer numC = aVar.c().c();
        String strF = aVar.c().f();
        TeleportCloud.b.a aVarE = aVar.c().e();
        Double dValueOf = aVarE != null ? Double.valueOf(aVarE.a()) : null;
        TeleportCloud.b.a aVarE2 = aVar.c().e();
        return new C3785b(strG, strB, string, strA, strG2, strH, strJ, strMo3getId2jxHnRY, null, strD, numC, dValueOf, aVarE2 != null ? Double.valueOf(aVarE2.b()) : null, strF, PSKKeyManager.MAX_KEY_LENGTH_BYTES, null);
    }

    @Override // Kd.d
    public AbstractC5912b a(Kd.a record) {
        AbstractC6492s.i(record, "record");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new d(record));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // Kd.d
    public AbstractC5912b b(String id2) {
        AbstractC6492s.i(id2, "id");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(id2));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // Kd.d
    public z c(String id2) {
        AbstractC6492s.i(id2, "id");
        z zVarI = z.i(new c(id2));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        return zVarE;
    }

    @Override // Kd.d
    public AbstractC5912b d(String id2, a.C0428a console) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(console, "console");
        AbstractC5912b abstractC5912bL = this.f10658b.b().o0().t(new C0429e(id2, console)).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // Kd.d
    public i getAll() {
        return this.f10659c;
    }
}
