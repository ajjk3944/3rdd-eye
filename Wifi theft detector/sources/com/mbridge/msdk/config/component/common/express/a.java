package com.mbridge.msdk.config.component.common.express;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f13116a = g.a(new Map.Entry[]{f.a("=", 0), f.a("+=", 0), f.a("-=", 0), f.a("*=", 0), f.a("/=", 0), f.a("%=", 0), f.a(com.mbridge.msdk.config.component.common.util.c.a("883"), 1), f.a(com.mbridge.msdk.config.component.common.util.c.a("882"), 2), f.a("==", 3), f.a("!=", 3), f.a(">", 4), f.a("<", 4), f.a(">=", 4), f.a("<=", 4), f.a(ScarConstants.IN_SIGNAL_KEY, 4), f.a("IN", 4), f.a(Marker.ANY_NON_NULL_MARKER, 5), f.a("-", 5), f.a(Marker.ANY_MARKER, 6), f.a("/", 6), f.a("%", 6)});

    /* renamed from: b, reason: collision with root package name */
    private List<String> f13117b;

    /* renamed from: c, reason: collision with root package name */
    private int f13118c;

    private List<String> b(String str) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\"') {
                sb.append(cCharAt);
                z10 = !z10;
            } else if (z10) {
                sb.append(cCharAt);
            } else if (Character.isWhitespace(cCharAt)) {
                if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            } else if ("().,!><=|&+-*/%{}[]:".indexOf(cCharAt) >= 0) {
                if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if ((cCharAt == '!' || cCharAt == '=' || cCharAt == '>' || cCharAt == '<' || cCharAt == '+' || cCharAt == '-' || cCharAt == '*' || cCharAt == '/' || cCharAt == '%') && (i10 = i11 + 1) < length && str.charAt(i10) == '=') {
                    arrayList.add(cCharAt + "=");
                    i11 = i10;
                } else {
                    arrayList.add(String.valueOf(cCharAt));
                }
            } else {
                sb.append(cCharAt);
            }
            i11++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    private com.mbridge.msdk.config.component.common.express.node.d c(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        if (!this.f13117b.get(this.f13118c).equals("(")) {
            return a(dVar, z10);
        }
        this.f13118c++;
        com.mbridge.msdk.config.component.common.express.node.d dVarB = b(dVar, true);
        int i10 = this.f13118c + 1;
        this.f13118c = i10;
        return i10 > this.f13117b.size() - 1 ? dVarB : b(dVarB, false);
    }

    public com.mbridge.msdk.config.component.common.express.node.d a(String str) {
        this.f13117b = b(str);
        this.f13118c = 0;
        return b(null, false);
    }

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, int i10, boolean z10) {
        String str;
        Integer num;
        com.mbridge.msdk.config.component.common.express.node.d cVar;
        com.mbridge.msdk.config.component.common.express.node.d dVarC = c(dVar, z10);
        while (this.f13118c < this.f13117b.size() && (num = this.f13116a.get((str = this.f13117b.get(this.f13118c)))) != null && num.intValue() >= i10) {
            int i11 = this.f13118c + 1;
            this.f13118c = i11;
            if (i11 > this.f13117b.size() - 1) {
                break;
            }
            com.mbridge.msdk.config.component.common.express.node.d dVarA = a(dVar, num.intValue() + 1, z10);
            if (str.matches("=|\\+=|-=|\\*=|/=|%=")) {
                cVar = new com.mbridge.msdk.config.component.common.express.node.b(str, dVarC, dVarA);
            } else {
                cVar = new com.mbridge.msdk.config.component.common.express.node.c(str, dVarC, dVarA);
            }
            dVarC = cVar;
        }
        return dVarC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f2, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010a, code lost:
    
        r14 = new com.mbridge.msdk.config.component.common.express.node.i(r4 + r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 1417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.a.a(com.mbridge.msdk.config.component.common.express.node.d, boolean):com.mbridge.msdk.config.component.common.express.node.d");
    }

    private com.mbridge.msdk.config.component.common.express.node.d b(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        return a(dVar, 0, z10);
    }
}
