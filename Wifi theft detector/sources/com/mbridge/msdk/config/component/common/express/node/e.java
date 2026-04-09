package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class e extends d {

    /* renamed from: a, reason: collision with root package name */
    d f13155a;

    /* renamed from: b, reason: collision with root package name */
    String f13156b;

    /* renamed from: c, reason: collision with root package name */
    List<d> f13157c;

    public e(d dVar, String str, List<d> list) {
        this.f13155a = dVar;
        this.f13156b = str;
        this.f13157c = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f13157c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList(com.mbridge.msdk.config.component.common.util.c.a("876"), com.mbridge.msdk.config.component.common.util.c.a("877"), com.mbridge.msdk.config.component.common.util.c.a("878")).contains(this.f13156b)) {
            arrayList.add(new com.mbridge.msdk.config.component.common.express.operator.parts.b(dVar, eVar, this.f13157c.get(0), aVar));
            for (int i10 = 1; i10 < this.f13157c.size(); i10++) {
                arrayList.add(this.f13157c.get(i10).a(dVar, eVar, aVar));
            }
        } else {
            Iterator<d> it = this.f13157c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(dVar, eVar, aVar));
            }
        }
        return dVar.a(this.f13155a.a(dVar, eVar, aVar), arrayList, this.f13156b, aVar);
    }
}
