package com.mbridge.msdk.config.component.common.express.node;

import java.util.Map;

/* loaded from: classes3.dex */
public class j extends d {

    /* renamed from: a, reason: collision with root package name */
    d f13164a;

    /* renamed from: b, reason: collision with root package name */
    String f13165b;

    public j(d dVar, String str) {
        this.f13164a = dVar;
        this.f13165b = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (eVar == com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
            com.mbridge.msdk.config.component.common.express.entities.a aVar3 = (com.mbridge.msdk.config.component.common.express.entities.a) this.f13164a.a(dVar, eVar, aVar);
            aVar2.a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) aVar3.b()).b(aVar3.a()));
            aVar2.a(this.f13165b);
            return aVar2;
        }
        Object objA = this.f13164a.a(dVar, eVar, aVar);
        if (objA instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objA).b(this.f13165b);
        }
        if (objA instanceof Map) {
            return ((Map) objA).get(this.f13165b);
        }
        return null;
    }
}
