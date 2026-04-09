package Q9;

import b9.C1992A;
import c9.C2078B;
import java.util.Locale;
import z9.C5870a;

/* compiled from: Primitives.kt */
/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f11534a;

    static {
        b9.l lVar = new b9.l(kotlin.jvm.internal.x.a(String.class), C0.f11399a);
        b9.l lVar2 = new b9.l(kotlin.jvm.internal.x.a(Character.TYPE), C1550q.f11524a);
        b9.l lVar3 = new b9.l(kotlin.jvm.internal.x.a(char[].class), C1548p.f11522c);
        b9.l lVar4 = new b9.l(kotlin.jvm.internal.x.a(Double.TYPE), C1562z.f11544a);
        b9.l lVar5 = new b9.l(kotlin.jvm.internal.x.a(double[].class), C1561y.f11543c);
        b9.l lVar6 = new b9.l(kotlin.jvm.internal.x.a(Float.TYPE), G.f11421a);
        b9.l lVar7 = new b9.l(kotlin.jvm.internal.x.a(float[].class), F.f11415c);
        b9.l lVar8 = new b9.l(kotlin.jvm.internal.x.a(Long.TYPE), Y.f11465a);
        b9.l lVar9 = new b9.l(kotlin.jvm.internal.x.a(long[].class), X.f11464c);
        b9.l lVar10 = new b9.l(kotlin.jvm.internal.x.a(b9.v.class), P0.f11446a);
        b9.l lVar11 = new b9.l(kotlin.jvm.internal.x.a(b9.w.class), O0.f11444c);
        b9.l lVar12 = new b9.l(kotlin.jvm.internal.x.a(Integer.TYPE), Q.f11448a);
        b9.l lVar13 = new b9.l(kotlin.jvm.internal.x.a(int[].class), P.f11445c);
        b9.l lVar14 = new b9.l(kotlin.jvm.internal.x.a(b9.t.class), M0.f11437a);
        b9.l lVar15 = new b9.l(kotlin.jvm.internal.x.a(b9.u.class), L0.f11435c);
        b9.l lVar16 = new b9.l(kotlin.jvm.internal.x.a(Short.TYPE), B0.f11393a);
        b9.l lVar17 = new b9.l(kotlin.jvm.internal.x.a(short[].class), A0.f11387c);
        b9.l lVar18 = new b9.l(kotlin.jvm.internal.x.a(b9.y.class), S0.f11454a);
        b9.l lVar19 = new b9.l(kotlin.jvm.internal.x.a(b9.z.class), R0.f11452c);
        b9.l lVar20 = new b9.l(kotlin.jvm.internal.x.a(Byte.TYPE), C1538k.f11497a);
        b9.l lVar21 = new b9.l(kotlin.jvm.internal.x.a(byte[].class), C1536j.f11494c);
        b9.l lVar22 = new b9.l(kotlin.jvm.internal.x.a(b9.r.class), J0.f11428a);
        b9.l lVar23 = new b9.l(kotlin.jvm.internal.x.a(b9.s.class), I0.f11426c);
        b9.l lVar24 = new b9.l(kotlin.jvm.internal.x.a(Boolean.TYPE), C1532h.f11487a);
        b9.l lVar25 = new b9.l(kotlin.jvm.internal.x.a(boolean[].class), C1530g.f11484c);
        kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.x.a(C1992A.class);
        kotlin.jvm.internal.l.f(C1992A.f18074a, "<this>");
        b9.l lVar26 = new b9.l(eVarA, T0.f11458b);
        b9.l lVar27 = new b9.l(kotlin.jvm.internal.x.a(Void.class), C1531g0.f11485a);
        kotlin.jvm.internal.e eVarA2 = kotlin.jvm.internal.x.a(C5870a.class);
        int i = C5870a.f48496e;
        f11534a = C2078B.o(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, lVar19, lVar20, lVar21, lVar22, lVar23, lVar24, lVar25, lVar26, lVar27, new b9.l(eVarA2, A.f11385a));
    }

    public static final String a(String str) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            String strValueOf2 = String.valueOf(cCharAt);
            kotlin.jvm.internal.l.d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            strValueOf = strValueOf2.toUpperCase(locale);
            kotlin.jvm.internal.l.e(strValueOf, "toUpperCase(...)");
            if (strValueOf.length() <= 1) {
                strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
            } else if (cCharAt != 329) {
                char cCharAt2 = strValueOf.charAt(0);
                String strSubstring = strValueOf.substring(1);
                kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                String lowerCase = strSubstring.toLowerCase(locale);
                kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
                strValueOf = cCharAt2 + lowerCase;
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.l.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        return sb.toString();
    }
}
