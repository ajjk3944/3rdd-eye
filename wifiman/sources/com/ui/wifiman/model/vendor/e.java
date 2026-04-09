package com.ui.wifiman.model.vendor;

import F7.C2812a;
import com.ui.wifiman.model.vendor.d;
import fh.InterfaceC5826a;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import h9.C5969a;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class e implements d.b {

    /* renamed from: a, reason: collision with root package name */
    private final z f43983a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f43984b;

    public static final class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2812a.InterfaceC0239a f43985a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f43986b;

        a(C2812a.InterfaceC0239a interfaceC0239a, e eVar) {
            this.f43985a = interfaceC0239a;
            this.f43986b = eVar;
        }

        @Override // com.ui.wifiman.model.vendor.d.a
        public d a(C5969a mac) {
            AbstractC6492s.i(mac, "mac");
            String strA = this.f43985a.a(mac.d(":"));
            if (strA != null) {
                return this.f43986b.b(strA);
            }
            return null;
        }
    }

    public static final class b implements C {
        public b() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                Z7.b.h("OUI lookup db LOAD start", null, 2, null);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C2812a.InterfaceC0239a interfaceC0239aA = C2812a.f6027a.a();
                Z7.b.h("OUI lookup db LOAD ended. Took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms", null, 2, null);
                interfaceC5910A.onSuccess(new a(interfaceC0239aA, e.this));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public e() {
        z zVarI = z.i(new b());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.O(Gg.a.d()).e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f43983a = zVarE;
        InterfaceC5826a<d.EnumC1510d> entries = d.EnumC1510d.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (d.EnumC1510d enumC1510d : entries) {
            for (String str : enumC1510d.getNames()) {
                Locale US = Locale.US;
                AbstractC6492s.h(US, "US");
                String lowerCase = str.toLowerCase(US);
                AbstractC6492s.h(lowerCase, "toLowerCase(...)");
                linkedHashMap.put(lowerCase, enumC1510d);
            }
        }
        this.f43984b = linkedHashMap;
    }

    @Override // com.ui.wifiman.model.vendor.d.b
    public z a() {
        return this.f43983a;
    }

    @Override // com.ui.wifiman.model.vendor.d.b
    public d b(String vendor) {
        AbstractC6492s.i(vendor, "vendor");
        Map map = this.f43984b;
        Locale US = Locale.US;
        AbstractC6492s.h(US, "US");
        String lowerCase = vendor.toLowerCase(US);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        d.EnumC1510d enumC1510d = (d.EnumC1510d) map.get(lowerCase);
        return enumC1510d != null ? new d.c(enumC1510d) : new d.e(vendor, null, 2, null);
    }
}
