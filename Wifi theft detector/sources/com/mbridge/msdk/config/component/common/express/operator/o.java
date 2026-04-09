package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f13189a;

    public o(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f13189a = cVar;
    }

    private Object a(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" and (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append(" )");
        return sb.toString();
    }

    private Object b() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String());
    }

    private Object c(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" group by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[PHI: r2
  0x0030: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v12 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object d(java.lang.String r5, java.lang.Object r6, java.util.List<java.lang.Object> r7) {
        /*
            r4 = this;
            r5 = 0
            if (r6 == 0) goto Lcb
            if (r7 != 0) goto L7
            goto Lcb
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.<init>(r6)
            int r6 = r7.size()
            r1 = 2
            java.lang.String r2 = ""
            if (r6 != r1) goto L30
            r6 = 0
            java.lang.Object r6 = r7.get(r6)
            if (r6 == 0) goto L24
            java.lang.String r2 = java.lang.String.valueOf(r6)
        L24:
            r6 = 1
            java.lang.Object r6 = r7.get(r6)
            boolean r7 = r6 instanceof java.util.Map
            if (r7 == 0) goto L30
            java.util.Map r6 = (java.util.Map) r6
            goto L31
        L30:
            r6 = r5
        L31:
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            if (r7 != 0) goto Lc6
            if (r6 != 0) goto L3b
            goto Lc6
        L3b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = " insert into "
            r5.append(r7)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = " ("
            r5.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = " VALUES ("
            r7.<init>(r1)
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.get(r2)
            r5.append(r2)
            if (r3 != 0) goto L80
            java.lang.String r2 = "NULL"
            r7.append(r2)
            goto L9b
        L80:
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L88
            r7.append(r3)
            goto L9b
        L88:
            java.lang.String r2 = "'"
            r7.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r4.a(r3)
            r7.append(r3)
            r7.append(r2)
        L9b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laa
            java.lang.String r2 = ","
            r5.append(r2)
            r7.append(r2)
            goto L65
        Laa:
            java.lang.String r2 = " )"
            r5.append(r2)
            r7.append(r2)
            goto L65
        Lb3:
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            java.lang.String r5 = r7.toString()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        Lc6:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r5)
            return r5
        Lcb:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.o.d(java.lang.String, java.lang.Object, java.util.List):java.lang.Object");
    }

    private Object e(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" limit");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private Object f(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" or (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append(" )");
        return sb.toString();
    }

    private Object g(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" order by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.a("829")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b()) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("830")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(j(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("831")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("832")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(l(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("833")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("834")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(f(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("835")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(g(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("836")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("837")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a()) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("838")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("839")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(d(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.a("840")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(e(str, obj, list)) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e10) {
            q0.b("SQLOperator", e10.getMessage(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Object j(String str, Object obj, List<Object> list) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder("select");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[PHI: r2
  0x0030: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object k(java.lang.String r4, java.lang.Object r5, java.util.List<java.lang.Object> r6) {
        /*
            r3 = this;
            r4 = 0
            if (r5 == 0) goto L85
            if (r6 != 0) goto L7
            goto L85
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.<init>(r5)
            int r5 = r6.size()
            r1 = 2
            java.lang.String r2 = ""
            if (r5 != r1) goto L30
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            if (r5 == 0) goto L24
            java.lang.String r2 = java.lang.String.valueOf(r5)
        L24:
            r5 = 1
            java.lang.Object r5 = r6.get(r5)
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L30
            java.util.Map r5 = (java.util.Map) r5
            goto L31
        L30:
            r5 = r4
        L31:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L80
            if (r5 != 0) goto L3a
            goto L80
        L3a:
            java.lang.String r4 = "update "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = " set"
            r0.append(r4)
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L4f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r6 = r5.get(r6)
            r0.append(r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4f
            java.lang.String r6 = ","
            r0.append(r6)
            goto L4f
        L7b:
            java.lang.String r4 = r0.toString()
            return r4
        L80:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r4 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r4)
            return r4
        L85:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r4 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.o.k(java.lang.String, java.lang.Object, java.util.List):java.lang.Object");
    }

    private Object l(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" where");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a i(String str, Object obj, List<Object> list) {
        return b(str) ? h(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object b(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" from");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private Object a() {
        return new StringBuilder(" delete ");
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.a("829")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("830")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("831")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("832")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("833")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("834")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("835")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("836")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("837")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("838")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("839")) || str.equals(com.mbridge.msdk.config.component.common.util.c.a("840"));
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("'", "''");
    }
}
