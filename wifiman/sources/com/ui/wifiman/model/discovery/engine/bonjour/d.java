package com.ui.wifiman.model.discovery.engine.bonjour;

import Zg.AbstractC3689v;
import Zg.U;
import com.ui.wifiman.model.discovery.engine.bonjour.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class d implements c.g {

    /* renamed from: b, reason: collision with root package name */
    private final Map f42696b;

    /* renamed from: c, reason: collision with root package name */
    private final c.n f42697c;

    public d() {
        List listB = c.g.f42654a.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(listB, 10)), 16));
        for (Object obj : listB) {
            linkedHashMap.put(((c.n) obj).getId(), obj);
        }
        this.f42696b = linkedHashMap;
        this.f42697c = c.g.f42654a.a();
    }

    @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.g
    public c a(String serviceId, Map txt) {
        c cVarA;
        AbstractC6492s.i(serviceId, "serviceId");
        AbstractC6492s.i(txt, "txt");
        c.n nVar = (c.n) this.f42696b.get(serviceId);
        if ((nVar == null || (cVarA = nVar.a(txt)) == null) && (cVarA = this.f42697c.a(txt)) == null) {
            throw new IllegalStateException("Fallback bonjour service parser should always return non null value");
        }
        return cVarA;
    }
}
