package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f20109a;

    static {
        char[] cArr = new char[80];
        f20109a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        b(i4, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            g1 g1Var = g1.f20131c;
            sb2.append(a.a.x(new g1(((String) obj).getBytes(u1.f20233a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof g1) {
            sb2.append(": \"");
            sb2.append(a.a.x((g1) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof p1) {
            sb2.append(" {");
            c((p1) obj, sb2, i4 + 2);
            sb2.append("\n");
            b(i4, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i11 = i4 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb2, i11, "key", entry.getKey());
        a(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        b(i4, sb2);
        sb2.append("}");
    }

    public static void b(int i4, StringBuilder sb2) {
        while (i4 > 0) {
            int i10 = 80;
            if (i4 <= 80) {
                i10 = i4;
            }
            sb2.append(f20109a, 0, i10);
            i4 -= i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(com.google.android.gms.internal.play_billing.p1 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.e2.c(com.google.android.gms.internal.play_billing.p1, java.lang.StringBuilder, int):void");
    }
}
