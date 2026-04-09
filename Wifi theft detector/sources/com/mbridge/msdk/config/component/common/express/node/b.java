package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes3.dex */
public class b extends d {

    /* renamed from: d, reason: collision with root package name */
    private static final Set<String> f13148d = l.a(new Object[]{"=", "+=", "-=", "*=", "/=", "%="});

    /* renamed from: a, reason: collision with root package name */
    String f13149a;

    /* renamed from: b, reason: collision with root package name */
    d f13150b;

    /* renamed from: c, reason: collision with root package name */
    d f13151c;

    public b(String str, d dVar, d dVar2) {
        this.f13149a = str;
        this.f13150b = dVar;
        this.f13151c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f13150b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object objA2 = this.f13151c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objA2);
        return dVar.a(objA, arrayList, this.f13149a, aVar);
    }
}
