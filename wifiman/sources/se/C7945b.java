package se;

import Yg.s;
import com.ubnt.usurvey.a;
import com.ui.common.semver.SemVer;
import com.ui.wifiman.model.ubiquiti.firmware.UbiquitiFirmwareClient;
import com.ui.wifiman.model.ubiquiti.firmware.a;
import com.ui.wifiman.model.wmw.g;
import gg.D;
import gg.i;
import java.util.Iterator;
import java.util.List;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* renamed from: se.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7945b implements InterfaceC7944a {

    /* renamed from: a, reason: collision with root package name */
    private final i f61465a;

    /* renamed from: b, reason: collision with root package name */
    private final i f61466b;

    /* renamed from: se.b$a */
    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f61467a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            UbiquitiFirmwareClient ubiquitiFirmwareClient = (UbiquitiFirmwareClient) sVar.a();
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            return ubiquitiFirmwareClient.a(((Boolean) objC).booleanValue() ? a.EnumC1501a.INTERNAL : a.EnumC1501a.PROD, "WiFiMan-Wizard");
        }
    }

    /* renamed from: se.b$b, reason: collision with other inner class name */
    static final class C2151b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2151b f61468a = new C2151b();

        C2151b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List firmwares) {
            Object next;
            AbstractC6492s.i(firmwares, "firmwares");
            Iterator it = firmwares.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    SemVer semVerA = ((com.ui.wifiman.model.ubiquiti.firmware.a) next).a();
                    do {
                        Object next2 = it.next();
                        SemVer semVerA2 = ((com.ui.wifiman.model.ubiquiti.firmware.a) next2).a();
                        if (semVerA.compareTo(semVerA2) < 0) {
                            next = next2;
                            semVerA = semVerA2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            com.ui.wifiman.model.ubiquiti.firmware.a aVar = (com.ui.wifiman.model.ubiquiti.firmware.a) next;
            return new C6556a(aVar != null ? new g.b(aVar) : null);
        }
    }

    /* renamed from: se.b$c */
    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f61469a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof UbiquitiFirmwareClient.Error)) {
                return i.k0(error);
            }
            Z7.b.h("Failed to fetch latest available firmwares", null, 2, null);
            return i.K0(new C6556a(null));
        }
    }

    /* renamed from: se.b$d */
    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f61470a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(com.ubnt.usurvey.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.t());
        }
    }

    public C7945b(Wd.f fwService, a.b appConfigurationManager) {
        AbstractC6492s.i(fwService, "fwService");
        AbstractC6492s.i(appConfigurationManager, "appConfigurationManager");
        i iVarW = appConfigurationManager.b().N0(d.f61470a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f61465a = iVarW;
        i iVarF1 = Ag.c.f753a.a(fwService.getClient(), iVarW).N1(a.f61467a).N0(C2151b.f61468a).f1(c.f61469a);
        AbstractC6492s.h(iVarF1, "onErrorResumeNext(...)");
        this.f61466b = iVarF1;
    }

    @Override // se.InterfaceC7944a
    public i a() {
        return this.f61466b;
    }
}
