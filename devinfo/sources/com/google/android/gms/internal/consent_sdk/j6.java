package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class j6 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f19385a;

    static {
        char[] cArr = new char[80];
        f19385a = cArr;
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
            p5 p5Var = p5.f19462c;
            sb2.append(f0.b(new p5(((String) obj).getBytes(a6.f19264a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof p5) {
            sb2.append(": \"");
            sb2.append(f0.b((p5) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof w5) {
            sb2.append(" {");
            c((w5) obj, sb2, i4 + 2);
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
            sb2.append(f19385a, 0, i10);
            i4 -= i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(com.google.android.gms.internal.consent_sdk.w5 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.j6.c(com.google.android.gms.internal.consent_sdk.w5, java.lang.StringBuilder, int):void");
    }
}
