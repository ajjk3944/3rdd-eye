package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;

/* loaded from: classes3.dex */
public class g extends d {

    /* renamed from: a, reason: collision with root package name */
    d f13160a;

    /* renamed from: b, reason: collision with root package name */
    d f13161b;

    public g(d dVar, d dVar2) {
        this.f13160a = dVar;
        this.f13161b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f13160a.a(dVar, eVar, aVar);
        Object objA2 = this.f13161b.a(dVar, eVar, aVar);
        HashMap map = new HashMap();
        map.put(objA, objA2);
        return map;
    }
}
