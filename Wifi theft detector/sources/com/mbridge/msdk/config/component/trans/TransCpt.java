package com.mbridge.msdk.config.component.trans;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class TransCpt extends a {

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.trans.model.a f13739h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f13740i;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "911001";
        if (this.f13087a.containsKey(c.a("50")) && (this.f13087a.get(c.a("50")) instanceof Map)) {
            this.f13740i = (Map) this.f13087a.get(c.a("50"));
        }
        this.f13739h = new com.mbridge.msdk.config.component.trans.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objA = new d().a(this.f13739h.a(), this.f13090d);
        HashMap map = new HashMap();
        if (objA != null) {
            map.put(c.a("500"), objA);
        }
        a(a("911002", map));
    }
}
