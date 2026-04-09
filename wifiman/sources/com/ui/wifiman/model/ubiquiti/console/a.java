package com.ui.wifiman.model.ubiquiti.console;

import Rd.a;
import W7.c;
import Yg.m;
import Yg.s;
import Zg.AbstractC3689v;
import Zg.U;
import com.ui.common.semver.SemVer;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.console.e;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.i;
import h9.C5969a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import sh.AbstractC7978m;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;
import xa.o;

/* loaded from: classes4.dex */
public final class a implements Qd.e {

    /* renamed from: a, reason: collision with root package name */
    private final Nb.e f43696a;

    /* renamed from: b, reason: collision with root package name */
    private final m f43697b;

    /* renamed from: c, reason: collision with root package name */
    private final i f43698c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.ui.wifiman.model.ubiquiti.console.a$a, reason: collision with other inner class name */
    private static final class EnumC1494a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC1494a[] $VALUES;

        /* renamed from: id, reason: collision with root package name */
        private final String f43699id;
        public static final EnumC1494a UNSUPPORTED = new EnumC1494a("UNSUPPORTED", 0, "unsupported");
        public static final EnumC1494a DISABLED = new EnumC1494a("DISABLED", 1, "disabled");
        public static final EnumC1494a ENABLED = new EnumC1494a("ENABLED", 2, "enabled");
        public static final EnumC1494a ENABLED_NETWORK_VERSION_UNSUPPORTED = new EnumC1494a("ENABLED_NETWORK_VERSION_UNSUPPORTED", 3, "networkVersion");
        public static final EnumC1494a ENABLED_PERMISSIONS_DENIED = new EnumC1494a("ENABLED_PERMISSIONS_DENIED", 4, "insufficient_permission");

        private static final /* synthetic */ EnumC1494a[] $values() {
            return new EnumC1494a[]{UNSUPPORTED, DISABLED, ENABLED, ENABLED_NETWORK_VERSION_UNSUPPORTED, ENABLED_PERMISSIONS_DENIED};
        }

        static {
            EnumC1494a[] enumC1494aArr$values = $values();
            $VALUES = enumC1494aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC1494aArr$values);
        }

        private EnumC1494a(String str, int i10, String str2) {
            this.f43699id = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1494a valueOf(String str) {
            return (EnumC1494a) Enum.valueOf(EnumC1494a.class, str);
        }

        public static EnumC1494a[] values() {
            return (EnumC1494a[]) $VALUES.clone();
        }

        public final String getId() {
            return this.f43699id;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43700a;

        static {
            int[] iArr = new int[EnumC1494a.values().length];
            try {
                iArr[EnumC1494a.UNSUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1494a.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1494a.ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1494a.ENABLED_PERMISSIONS_DENIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1494a.ENABLED_NETWORK_VERSION_UNSUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f43700a = iArr;
        }
    }

    public static final class c implements InterfaceC5915e {
        public c() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("ConsolesManager - clearing consoles", null, 2, null);
                a.this.f43696a.clear();
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            List list = (List) sVar.a();
            InterfaceC8290a interfaceC8290a = (InterfaceC8290a) sVar.c();
            List list2 = list;
            a aVar = a.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(aVar.i((Nb.d) it.next(), interfaceC8290a));
            }
            return arrayList;
        }
    }

    public static final class e implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f43703a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f43704b;

        public e(UUID uuid, a aVar) {
            this.f43703a = uuid;
            this.f43704b = aVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("ConsolesManager - clearing consoles for other accounts then " + b.a.f(this.f43703a), null, 2, null);
                Nb.e eVar = this.f43704b.f43696a;
                String string = this.f43703a.toString();
                AbstractC6492s.h(string, "toString(...)");
                eVar.d(string);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class f implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f43705a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f43706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f43707c;

        public f(List list, a aVar, UUID uuid) {
            this.f43705a = list;
            this.f43706b = aVar;
            this.f43707c = uuid;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("ConsolesManager - caching consoles " + this.f43705a.size(), null, 2, null);
                Nb.e eVar = this.f43706b.f43696a;
                List list = this.f43705a;
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f43706b.j((com.ui.wifiman.model.ubiquiti.console.e) it.next(), this.f43707c));
                }
                eVar.c(arrayList);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public a(Nb.e consoleCacheDao, o productCatalog) {
        AbstractC6492s.i(consoleCacheDao, "consoleCacheDao");
        AbstractC6492s.i(productCatalog, "productCatalog");
        this.f43696a = consoleCacheDao;
        this.f43697b = Yg.n.b(new InterfaceC6824a() { // from class: Qd.f
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return com.ui.wifiman.model.ubiquiti.console.a.l();
            }
        });
        i iVarI2 = Ag.c.f753a.a(consoleCacheDao.a(), productCatalog.b()).N0(new d()).e1().X0(Gg.a.a()).F1(Gg.a.d()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43698c = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ui.wifiman.model.ubiquiti.console.e i(Nb.d r20, wa.InterfaceC8290a r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.ubiquiti.console.a.i(Nb.d, wa.a):com.ui.wifiman.model.ubiquiti.console.e");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Nb.d j(com.ui.wifiman.model.ubiquiti.console.e eVar, UUID uuid) {
        EnumC1494a enumC1494a;
        SemVer semVerB;
        c.a aVarB;
        c.a aVarB2;
        String strF = eVar.f();
        C5969a c5969aI = eVar.i();
        String strD = c5969aI != null ? c5969aI.d("") : null;
        String string = uuid.toString();
        AbstractC6492s.h(string, "toString(...)");
        SemVer semVerE = eVar.e();
        String string2 = semVerE != null ? semVerE.toString() : null;
        String strK = eVar.k();
        W7.c cVarG = eVar.g();
        Float fValueOf = (cVarG == null || (aVarB2 = cVarG.b()) == null) ? null : Float.valueOf((float) aVarB2.a());
        W7.c cVarG2 = eVar.g();
        Float fValueOf2 = (cVarG2 == null || (aVarB = cVarG2.b()) == null) ? null : Float.valueOf((float) aVarB.b());
        String strH = eVar.h();
        Boolean boolD = eVar.d();
        String strJ = eVar.j();
        InterfaceC8439a.d dVarM = eVar.m();
        String strMo3getId2jxHnRY = dVarM != null ? dVarM.mo3getId2jxHnRY() : null;
        Boolean boolO = eVar.o();
        e.a.b bVarL = eVar.l();
        String string3 = (bVarL == null || (semVerB = bVarL.b()) == null) ? null : semVerB.toString();
        e.a.b bVarL2 = eVar.l();
        Rd.a aVarA = bVarL2 != null ? bVarL2.a() : null;
        if (aVarA instanceof a.C0705a) {
            enumC1494a = EnumC1494a.DISABLED;
        } else if (aVarA instanceof a.c) {
            enumC1494a = EnumC1494a.UNSUPPORTED;
        } else if (aVarA instanceof a.b.C0706a) {
            enumC1494a = EnumC1494a.ENABLED;
        } else if (aVarA instanceof a.b.AbstractC0707b.C0708a) {
            enumC1494a = EnumC1494a.ENABLED_PERMISSIONS_DENIED;
        } else if (aVarA instanceof a.b.AbstractC0707b.C0709b) {
            enumC1494a = EnumC1494a.ENABLED_NETWORK_VERSION_UNSUPPORTED;
        } else {
            if (aVarA != null) {
                throw new NoWhenBranchMatchedException();
            }
            enumC1494a = null;
        }
        return new Nb.d(strF, string, string2, strK, strD, fValueOf2, fValueOf, strH, boolD, strJ, strMo3getId2jxHnRY, boolO, string3, enumC1494a != null ? enumC1494a.getId() : null);
    }

    private final Map k() {
        return (Map) this.f43697b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map l() {
        InterfaceC5826a entries = EnumC1494a.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(((EnumC1494a) obj).getId(), obj);
        }
        return linkedHashMap;
    }

    @Override // Qd.e
    public i a() {
        return this.f43698c;
    }

    @Override // Qd.e
    public AbstractC5912b b(UUID accountId) {
        AbstractC6492s.i(accountId, "accountId");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new e(accountId, this));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912bR.W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    @Override // Qd.e
    public AbstractC5912b c(List consoles, UUID accountId) {
        AbstractC6492s.i(consoles, "consoles");
        AbstractC6492s.i(accountId, "accountId");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new f(consoles, this, accountId));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912bR.W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    @Override // Qd.e
    public AbstractC5912b d() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new c());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912bR.W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }
}
