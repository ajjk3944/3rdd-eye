package com.mbridge.msdk.config.component.common.express.node;

/* loaded from: classes3.dex */
public class i extends d {

    /* renamed from: a, reason: collision with root package name */
    String f13163a;

    public i(String str) {
        this.f13163a = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objSubstring;
        if (this.f13163a.startsWith("$")) {
            objSubstring = com.mbridge.msdk.config.component.common.express.c.a(this.f13163a, aVar);
        } else if (this.f13163a.startsWith("\\") && this.f13163a.endsWith("\\\"")) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13163a.substring(1, r2.length() - 2));
            sb.append("\"");
            objSubstring = sb.toString();
        } else if (this.f13163a.startsWith("\"") && this.f13163a.endsWith("\"")) {
            String str = this.f13163a;
            objSubstring = str.substring(1, str.length() - 1);
        } else {
            objSubstring = this.f13163a;
        }
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return objSubstring;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        aVar2.a(aVar);
        aVar2.a(this.f13163a.substring(1));
        return aVar2;
    }
}
