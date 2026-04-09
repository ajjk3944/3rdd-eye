package com.mbridge.msdk.config.component.mat;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class MatCpt extends a {

    /* renamed from: h, reason: collision with root package name */
    ArrayList<Map<String, Object>> f13563h;

    /* renamed from: i, reason: collision with root package name */
    d f13564i;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f13092f = "920001";
        Object obj = map.get(c.a("118"));
        if (obj instanceof List) {
            this.f13563h = (ArrayList) obj;
        }
        this.f13564i = new d();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0018 A[SYNTHETIC] */
    @Override // com.mbridge.msdk.config.component.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r10 = this;
            super.d()
            java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> r0 = r10.f13563h
            if (r0 == 0) goto L9b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            goto L9b
        Lf:
            java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> r0 = r10.f13563h
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r2
        L18:
            if (r4 >= r1) goto L84
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "142"
            java.lang.String r6 = com.mbridge.msdk.config.component.common.util.c.a(r6)
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "118"
            java.lang.String r7 = com.mbridge.msdk.config.component.common.util.c.a(r7)
            java.lang.Object r7 = r5.get(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "143"
            java.lang.String r8 = com.mbridge.msdk.config.component.common.util.c.a(r8)
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.mbridge.msdk.config.component.common.express.d r8 = r10.f13564i
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a r9 = r10.f13090d
            java.lang.Object r6 = r8.a(r6, r9)
            boolean r8 = r6 instanceof java.lang.Integer
            if (r8 == 0) goto L64
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r8 = 1
            if (r6 != r8) goto L62
            goto L72
        L62:
            r8 = r2
            goto L72
        L64:
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto L62
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "1"
            boolean r8 = r6.equals(r8)
        L72:
            if (r8 == 0) goto L18
            com.mbridge.msdk.config.component.common.express.d r3 = r10.f13564i
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a r6 = r10.f13090d
            java.lang.Object r3 = r3.a(r7, r6)
            java.lang.String r6 = "N"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L18
        L84:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "data"
            java.lang.String r1 = com.mbridge.msdk.config.component.common.util.c.a(r1)
            r0.put(r1, r3)
            java.lang.String r1 = "920002"
            com.mbridge.msdk.config.component.base.b r0 = r10.a(r1, r0)
            r10.a(r0)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.mat.MatCpt.d():void");
    }
}
