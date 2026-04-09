package com.mbridge.msdk.config.component.common.express.operator;

import android.os.Build;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f13171b = Arrays.asList("==", "!=", ">=", "<=", ">", "<");

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f13172a;

    public e(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f13172a = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(java.lang.String r5, java.lang.Object r6, java.util.List<java.lang.Object> r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            if (r7 == 0) goto Lf
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto Lf
            java.lang.Object r7 = r7.get(r0)
            goto L10
        Lf:
            r7 = r1
        L10:
            r5.getClass()
            int r2 = r5.hashCode()
            r3 = -1
            switch(r2) {
                case 60: goto L54;
                case 62: goto L49;
                case 1084: goto L3e;
                case 1921: goto L33;
                case 1952: goto L28;
                case 1983: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = r3
            goto L5d
        L1d:
            java.lang.String r0 = ">="
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 5
            goto L5d
        L28:
            java.lang.String r0 = "=="
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L31
            goto L1b
        L31:
            r0 = 4
            goto L5d
        L33:
            java.lang.String r0 = "<="
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L3c
            goto L1b
        L3c:
            r0 = 3
            goto L5d
        L3e:
            java.lang.String r0 = "!="
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L47
            goto L1b
        L47:
            r0 = 2
            goto L5d
        L49:
            java.lang.String r0 = ">"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L52
            goto L1b
        L52:
            r0 = 1
            goto L5d
        L54:
            java.lang.String r2 = "<"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5d
            goto L1b
        L5d:
            switch(r0) {
                case 0: goto L7f;
                case 1: goto L79;
                case 2: goto L73;
                case 3: goto L6d;
                case 4: goto L67;
                case 5: goto L61;
                default: goto L60;
            }
        L60:
            goto L84
        L61:
            com.mbridge.msdk.config.component.common.express.operator.u r1 = new com.mbridge.msdk.config.component.common.express.operator.u
            r1.<init>()
            goto L84
        L67:
            com.mbridge.msdk.config.component.common.express.operator.v r1 = new com.mbridge.msdk.config.component.common.express.operator.v
            r1.<init>()
            goto L84
        L6d:
            com.mbridge.msdk.config.component.common.express.operator.w r1 = new com.mbridge.msdk.config.component.common.express.operator.w
            r1.<init>()
            goto L84
        L73:
            com.mbridge.msdk.config.component.common.express.operator.x r1 = new com.mbridge.msdk.config.component.common.express.operator.x
            r1.<init>()
            goto L84
        L79:
            com.mbridge.msdk.config.component.common.express.operator.y r1 = new com.mbridge.msdk.config.component.common.express.operator.y
            r1.<init>()
            goto L84
        L7f:
            com.mbridge.msdk.config.component.common.express.operator.z r1 = new com.mbridge.msdk.config.component.common.express.operator.z
            r1.<init>()
        L84:
            if (r1 != 0) goto L8b
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.c()
            return r5
        L8b:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = r4.a(r5, r6, r7, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.e.b(java.lang.String, java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean c(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean d(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) <= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean e(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean f(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) < 0);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f13171b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.equals(comparable2));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, Object obj2, BiFunction<Comparable<Object>, Comparable<Object>, Boolean> biFunction) {
        Object objValueOf;
        Object objValueOf2;
        if (obj != null && obj2 != null) {
            if (obj.getClass().equals(obj2.getClass())) {
                objValueOf = obj;
                objValueOf2 = obj2;
            } else {
                Object[] objArrA = a(obj, obj2);
                if (objArrA != null) {
                    objValueOf = objArrA[0];
                    objValueOf2 = objArrA[1];
                } else {
                    q0.b("ComparisonOperator", "Type conversion failed for comparison: " + obj.getClass().getSimpleName() + " vs " + obj2.getClass().getSimpleName());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
            }
            if ((objValueOf instanceof Comparable) && (objValueOf2 instanceof Comparable)) {
                try {
                    objValueOf = Integer.valueOf(Integer.parseInt(String.valueOf(obj)));
                    objValueOf2 = Integer.valueOf(Integer.parseInt(String.valueOf(obj2)));
                } catch (Exception unused) {
                }
                try {
                    Comparable<Object> comparable = (Comparable) objValueOf;
                    Comparable<Object> comparable2 = (Comparable) objValueOf2;
                    if (Build.VERSION.SDK_INT >= 24) {
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(biFunction.apply(comparable, comparable2));
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(comparable, comparable2, str));
                } catch (Exception e10) {
                    q0.b("ComparisonOperator", e10.getMessage(), e10);
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(obj, obj2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean b(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(!comparable.equals(comparable2));
    }

    private Number b(String str) {
        if (str != null && !str.trim().isEmpty()) {
            try {
                if (str.contains(".")) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private Boolean a(Object obj, Object obj2, String str) {
        str.getClass();
        if (str.equals("!=")) {
            return Boolean.valueOf(obj != obj2);
        }
        if (str.equals("==")) {
            return Boolean.valueOf(obj == obj2);
        }
        return null;
    }

    private Boolean a(Comparable<Object> comparable, Comparable<Object> comparable2, String str) {
        str.getClass();
        switch (str) {
            case "<":
                return Boolean.valueOf(comparable.compareTo(comparable2) < 0);
            case ">":
                return Boolean.valueOf(comparable.compareTo(comparable2) > 0);
            case "!=":
                return Boolean.valueOf(comparable.compareTo(comparable2) != 0);
            case "<=":
                return Boolean.valueOf(comparable.compareTo(comparable2) <= 0);
            case "==":
                return Boolean.valueOf(comparable.compareTo(comparable2) == 0);
            case ">=":
                return Boolean.valueOf(comparable.compareTo(comparable2) >= 0);
            default:
                return null;
        }
    }

    private Object[] a(Object obj, Object obj2) {
        try {
            if (a(obj) && a(obj2)) {
                return a((Number) obj, (Number) obj2);
            }
            if (a(obj) && (obj2 instanceof String)) {
                Number number = (Number) obj;
                Number numberB = b((String) obj2);
                if (numberB != null) {
                    return a(number, numberB);
                }
                return null;
            }
            if ((obj instanceof String) && a(obj2)) {
                Number numberB2 = b((String) obj);
                Number number2 = (Number) obj2;
                if (numberB2 != null) {
                    return a(numberB2, number2);
                }
                return null;
            }
            if ((obj instanceof String) && (obj2 instanceof String)) {
                return new Object[]{obj, obj2};
            }
            if ((obj instanceof Boolean) && (obj2 instanceof Boolean)) {
                return new Object[]{obj, obj2};
            }
            if ((obj instanceof Boolean) && (obj2 instanceof String)) {
                Boolean bool = (Boolean) obj;
                Boolean boolA = a((String) obj2);
                if (boolA != null) {
                    return new Object[]{bool, boolA};
                }
                return null;
            }
            if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                return null;
            }
            Boolean boolA2 = a((String) obj);
            Boolean bool2 = (Boolean) obj2;
            if (boolA2 != null) {
                return new Object[]{boolA2, bool2};
            }
            return null;
        } catch (Exception e10) {
            q0.b("ComparisonOperator", "Type conversion error: " + e10.getMessage(), e10);
            return null;
        }
    }

    private boolean a(Object obj) {
        return obj instanceof Number;
    }

    private Boolean a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.toLowerCase().trim();
        if (!"true".equals(strTrim) && !"1".equals(strTrim) && !"yes".equals(strTrim)) {
            if ("false".equals(strTrim) || MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(strTrim) || "no".equals(strTrim)) {
                return Boolean.FALSE;
            }
            return null;
        }
        return Boolean.TRUE;
    }

    private Object[] a(Number number, Number number2) {
        if (a(number) && a(number2)) {
            return new Object[]{Long.valueOf(number.longValue()), Long.valueOf(number2.longValue())};
        }
        return new Object[]{Double.valueOf(number.doubleValue()), Double.valueOf(number2.doubleValue())};
    }

    private boolean a(Number number) {
        return (number instanceof Integer) || (number instanceof Long) || (number instanceof Short) || (number instanceof Byte);
    }
}
