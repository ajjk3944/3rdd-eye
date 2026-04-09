package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2175yL {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f17712a;

    static {
        char[] cArr = new char[80];
        f17712a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            OK ok = QK.f10609b;
            sb.append(AbstractC0582Jp.g(new OK(((String) obj).getBytes(AbstractC1528mL.f15610a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof QK) {
            sb.append(": \"");
            sb.append(AbstractC0582Jp.g((QK) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1096eL) {
            sb.append(" {");
            b((AbstractC1096eL) obj, sb, i + 2);
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i6 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i6, "key", entry.getKey());
        a(sb, i6, "value", entry.getValue());
        sb.append("\n");
        c(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.google.android.gms.internal.ads.AbstractC1096eL r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2175yL.b(com.google.android.gms.internal.ads.eL, java.lang.StringBuilder, int):void");
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i3 = 80;
            if (i <= 80) {
                i3 = i;
            }
            sb.append(f17712a, 0, i3);
            i -= i3;
        }
    }
}
