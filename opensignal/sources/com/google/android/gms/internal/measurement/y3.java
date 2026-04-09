package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import com.survicate.surveys.entities.models.QuestionValidationState;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.question.rating.SurveyPointRatingSettings;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class y3 {

    /* renamed from: a, reason: collision with root package name */
    public static p.v2 f5267a;

    public y3() {
        new ConcurrentHashMap();
    }

    public static final lq.h A(Class cls) {
        lq.j jVar = lq.j.SYNCHRONIZED;
        br.l.e(jVar, "mode");
        return kc.f.E(jVar, new pp.c(16, cls));
    }

    public static final boolean C(rr.m0 m0Var) {
        br.l.e(m0Var, "<this>");
        return m0Var.b() == null;
    }

    public static String D(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e4) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(c7.a.d(name.length() + 1, hexString));
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String string2 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e4);
                    String name2 = e4.getClass().getName();
                    StringBuilder sbS = c7.a.s(name2.length() + c7.a.d(9, string2), "<", string2, " threw ", name2);
                    sbS.append(">");
                    string = sbS.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = str.indexOf("%s", i12)) != -1) {
            sb3.append((CharSequence) str, i12, iIndexOf);
            sb3.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb3.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb3.append(", ");
                sb3.append(objArr[i13]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static final rt.f E(ArrayList arrayList) {
        rt.f fVar = new rt.f();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            at.n nVar = (at.n) next;
            if (nVar != null && nVar != at.m.f2303b) {
                fVar.add(next);
            }
        }
        return fVar;
    }

    public static final z0.m F(n0.p pVar, z0.m mVar) {
        pVar.S(439770924);
        if (!mVar.b(z0.i.f26493d)) {
            pVar.O(1219399079, null, 0, null);
            mVar = (z0.m) mVar.a(new gv.a(8, pVar), z0.j.f26494a);
            pVar.o(false);
        }
        pVar.o(false);
        return mVar;
    }

    public static final int G(hr.d dVar) {
        fr.a aVar = fr.d.f9050a;
        br.l.e(dVar, "range");
        int i10 = dVar.f10863a;
        if (dVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + dVar);
        }
        int i11 = dVar.f10864d;
        if (i11 < Integer.MAX_VALUE) {
            return fr.d.f9050a.c(i10, i11 + 1);
        }
        if (i10 <= Integer.MIN_VALUE) {
            return fr.d.f9050a.b();
        }
        return fr.d.f9050a.c(i10 - 1, i11) + 1;
    }

    public static final long H(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !tt.l.r0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i10++;
                } else if (length - i11 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!tt.s.n0(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(tt.l.t0(1, str));
    }

    public static qs.g I(qs.g gVar, String str, String str2, int i10) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z10 = (i10 & 4) != 0;
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if (!gVar.f21036d) {
            String strC = gVar.c();
            if (tt.s.n0(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return qs.g.e(str2.concat(tt.l.J0(strC, str)));
                }
                if (!z10) {
                    return gVar;
                }
                String strJ0 = tt.l.J0(strC, str);
                if (strJ0.length() != 0 && xu.l.G(0, strJ0)) {
                    if (strJ0.length() != 1 && xu.l.G(1, strJ0)) {
                        Iterator it = new hr.d(0, strJ0.length() - 1, 1).iterator();
                        while (true) {
                            hr.c cVar = (hr.c) it;
                            if (!cVar.f10868g) {
                                next = null;
                                break;
                            }
                            next = cVar.next();
                            if (!xu.l.G(((Number) next).intValue(), strJ0)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strJ0.substring(0, iIntValue);
                            br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String strB0 = xu.l.b0(strSubstring);
                            String strSubstring2 = strJ0.substring(iIntValue);
                            br.l.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            strJ0 = strB0.concat(strSubstring2);
                        } else {
                            strJ0 = xu.l.b0(strJ0);
                        }
                    } else if (strJ0.length() != 0 && 'A' <= (cCharAt2 = strJ0.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strJ0.substring(1);
                        br.l.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        strJ0 = lowerCase + strSubstring3;
                    }
                }
                if (qs.g.f(strJ0)) {
                    return qs.g.e(strJ0);
                }
            }
        }
        return null;
    }

    public static long J(a5.v vVar, int i10, int i11) {
        vVar.E(i10);
        if (vVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iG = vVar.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i11 || (iG & 32) == 0 || vVar.t() < 7 || vVar.a() < 7 || (vVar.t() & 16) != 16) {
            return -9223372036854775807L;
        }
        vVar.e(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ht.x K(ht.x r7, java.util.ArrayList r8) {
        /*
            java.util.List r0 = r7.L()
            r0.size()
            r8.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = mq.p.a0(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L19:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r8.next()
            nt.e r1 = (nt.e) r1
            r1.getClass()
            ht.x r3 = r1.f18560c
            ht.x r4 = r1.f18559b
            rr.r0 r1 = r1.f18558a
            jt.l r5 = jt.d.f13840a
            r5.b(r4, r3)
            boolean r5 = br.l.a(r4, r3)
            if (r5 != 0) goto L91
            ht.d1 r5 = r1.N()
            ht.d1 r6 = ht.d1.IN_VARIANCE
            if (r5 != r6) goto L43
            goto L91
        L43:
            boolean r5 = or.h.E(r4)
            if (r5 == 0) goto L5f
            ht.d1 r5 = r1.N()
            if (r5 == r6) goto L5f
            ht.g0 r2 = new ht.g0
            ht.d1 r4 = ht.d1.OUT_VARIANCE
            ht.d1 r1 = r1.N()
            if (r4 != r1) goto L5b
            ht.d1 r4 = ht.d1.INVARIANT
        L5b:
            r2.<init>(r3, r4)
            goto L96
        L5f:
            if (r3 == 0) goto L8b
            boolean r2 = or.h.x(r3)
            if (r2 == 0) goto L7b
            boolean r2 = r3.c0()
            if (r2 == 0) goto L7b
            ht.g0 r2 = new ht.g0
            ht.d1 r1 = r1.N()
            if (r6 != r1) goto L77
            ht.d1 r6 = ht.d1.INVARIANT
        L77:
            r2.<init>(r4, r6)
            goto L96
        L7b:
            ht.g0 r2 = new ht.g0
            ht.d1 r4 = ht.d1.OUT_VARIANCE
            ht.d1 r1 = r1.N()
            if (r4 != r1) goto L87
            ht.d1 r4 = ht.d1.INVARIANT
        L87:
            r2.<init>(r3, r4)
            goto L96
        L8b:
            r7 = 140(0x8c, float:1.96E-43)
            or.h.a(r7)
            throw r2
        L91:
            ht.g0 r2 = new ht.g0
            r2.<init>(r4)
        L96:
            r0.add(r2)
            goto L19
        L9b:
            r8 = 6
            ht.x r7 = ht.c.o(r7, r0, r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.y3.K(ht.x, java.util.ArrayList):ht.x");
    }

    public static void N(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.s2.a(view, charSequence);
            return;
        }
        p.u2 u2Var = p.u2.G;
        if (u2Var != null && u2Var.f20183a == view) {
            p.u2.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p.u2(view, charSequence);
            return;
        }
        p.u2 u2Var2 = p.u2.H;
        if (u2Var2 != null && u2Var2.f20183a == view) {
            u2Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final long P(int i10, ut.c cVar) {
        br.l.e(cVar, "unit");
        return cVar.compareTo(ut.c.SECONDS) <= 0 ? q(b4.n(i10, cVar, ut.c.NANOSECONDS)) : Q(i10, cVar);
    }

    public static final long Q(long j, ut.c cVar) {
        br.l.e(cVar, "unit");
        ut.c cVar2 = ut.c.NANOSECONDS;
        long jN = b4.n(4611686018426999999L, cVar2, cVar);
        return ((-jN) > j || j > jN) ? o(vc.e.i(b4.m(j, cVar, ut.c.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : q(b4.n(j, cVar, cVar2));
    }

    public static int S(byte[] bArr, int i10, v4 v4Var) {
        int i11 = i10 + 1;
        byte b2 = bArr[i10];
        if (b2 < 0) {
            return T(b2, bArr, i11, v4Var);
        }
        v4Var.f5229a = b2;
        return i11;
    }

    public static int T(int i10, byte[] bArr, int i11, v4 v4Var) {
        byte b2 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b2 >= 0) {
            v4Var.f5229a = i13 | (b2 << 7);
            return i12;
        }
        int i14 = i13 | ((b2 & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            v4Var.f5229a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            v4Var.f5229a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            v4Var.f5229a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                v4Var.f5229a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int U(byte[] bArr, int i10, v4 v4Var) {
        long j = bArr[i10];
        int i11 = i10 + 1;
        if (j >= 0) {
            v4Var.f5230b = j;
            return i11;
        }
        int i12 = i10 + 2;
        byte b2 = bArr[i11];
        long j7 = (j & 127) | ((b2 & 127) << 7);
        int i13 = 7;
        while (b2 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j7 |= (r10 & 127) << i13;
            b2 = bArr[i12];
            i12 = i14;
        }
        v4Var.f5230b = j7;
        return i12;
    }

    public static int V(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static long W(int i10, byte[] bArr) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    public static int X(byte[] bArr, int i10, v4 v4Var) throws q5 {
        int iS = S(bArr, i10, v4Var);
        int i11 = v4Var.f5229a;
        if (i11 < 0) {
            throw new q5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            v4Var.f5231c = "";
            return iS;
        }
        int i12 = u6.f5218a;
        int length = bArr.length;
        if ((((length - iS) - i11) | iS | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iS), Integer.valueOf(i11)));
        }
        int i13 = iS + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (iS < i13) {
            byte b2 = bArr[iS];
            if (b2 < 0) {
                break;
            }
            iS++;
            cArr[i14] = (char) b2;
            i14++;
        }
        while (iS < i13) {
            int i15 = iS + 1;
            byte b10 = bArr[iS];
            if (b10 >= 0) {
                cArr[i14] = (char) b10;
                i14++;
                iS = i15;
                while (iS < i13) {
                    byte b11 = bArr[iS];
                    if (b11 >= 0) {
                        iS++;
                        cArr[i14] = (char) b11;
                        i14++;
                    }
                }
            } else {
                if (b10 >= -32) {
                    if (b10 >= -16) {
                        if (i15 >= i13 - 2) {
                            throw new q5("Protocol message had invalid UTF-8.");
                        }
                        byte b12 = bArr[i15];
                        int i16 = iS + 3;
                        byte b13 = bArr[iS + 2];
                        iS += 4;
                        byte b14 = bArr[i16];
                        if (!dr.a.N(b12)) {
                            if ((((b12 + 112) + (b10 << 28)) >> 30) == 0 && !dr.a.N(b13) && !dr.a.N(b14)) {
                                int i17 = ((b12 & 63) << 12) | ((b10 & 7) << 18) | ((b13 & 63) << 6) | (b14 & 63);
                                cArr[i14] = (char) ((i17 >>> 10) + 55232);
                                cArr[i14 + 1] = (char) ((i17 & 1023) + 56320);
                                i14 += 2;
                            }
                        }
                        throw new q5("Protocol message had invalid UTF-8.");
                    }
                    if (i15 >= i13 - 1) {
                        throw new q5("Protocol message had invalid UTF-8.");
                    }
                    int i18 = i14 + 1;
                    int i19 = iS + 2;
                    byte b15 = bArr[i15];
                    iS += 3;
                    byte b16 = bArr[i19];
                    if (!dr.a.N(b15)) {
                        if (b10 == -32) {
                            if (b15 >= -96) {
                                b10 = -32;
                            }
                        }
                        if (b10 == -19) {
                            if (b15 < -96) {
                                b10 = -19;
                            }
                        }
                        if (!dr.a.N(b16)) {
                            cArr[i14] = (char) (((b15 & 63) << 6) | ((b10 & 15) << 12) | (b16 & 63));
                            i14 = i18;
                        }
                    }
                    throw new q5("Protocol message had invalid UTF-8.");
                }
                if (i15 >= i13) {
                    throw new q5("Protocol message had invalid UTF-8.");
                }
                int i20 = i14 + 1;
                iS += 2;
                byte b17 = bArr[i15];
                if (b10 < -62 || dr.a.N(b17)) {
                    throw new q5("Protocol message had invalid UTF-8.");
                }
                cArr[i14] = (char) ((b17 & 63) | ((b10 & 31) << 6));
                i14 = i20;
            }
        }
        v4Var.f5231c = new String(cArr, 0, i14);
        return i13;
    }

    public static int Y(byte[] bArr, int i10, v4 v4Var) throws q5 {
        int iS = S(bArr, i10, v4Var);
        int i11 = v4Var.f5229a;
        if (i11 < 0) {
            throw new q5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iS) {
            throw new q5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            v4Var.f5231c = y4.f5268g;
            return iS;
        }
        v4Var.f5231c = y4.d(bArr, iS, i11);
        return iS + i11;
    }

    public static int Z(Object obj, j6 j6Var, byte[] bArr, int i10, int i11, v4 v4Var) throws q5 {
        int iT = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iT = T(i12, bArr, iT, v4Var);
            i12 = v4Var.f5229a;
        }
        int i13 = iT;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new q5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = v4Var.f5232d + 1;
        v4Var.f5232d = i14;
        if (i14 >= 100) {
            throw new q5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        j6Var.g(obj, bArr, i13, i15, v4Var);
        v4Var.f5232d--;
        v4Var.f5231c = obj;
        return i15;
    }

    public static final long a(String str) throws NumberFormatException {
        ut.c cVar;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i10 = ut.a.f23695r;
        char cCharAt2 = str.charAt(0);
        int i11 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z10 = i11 > 0 && tt.l.Q0(str, '-');
        if (length <= i11) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i11) != 'P') {
            throw new IllegalArgumentException();
        }
        int i12 = i11 + 1;
        if (i12 == length) {
            throw new IllegalArgumentException();
        }
        ut.c cVar2 = null;
        long jG = 0;
        boolean z11 = false;
        while (i12 < length) {
            if (str.charAt(i12) != 'T') {
                int i13 = i12;
                while (i13 < str.length() && (('0' <= (cCharAt = str.charAt(i13)) && cCharAt < ':') || tt.l.r0("+-.", cCharAt))) {
                    i13++;
                }
                String strSubstring = str.substring(i12, i13);
                br.l.d(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i12;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i14 = length2 + 1;
                if (z11) {
                    if (cCharAt3 == 'H') {
                        cVar = ut.c.HOURS;
                    } else if (cCharAt3 == 'M') {
                        cVar = ut.c.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        cVar = ut.c.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    cVar = ut.c.DAYS;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iA0 = tt.l.A0(strSubstring, '.', 0, 6);
                if (cVar != ut.c.SECONDS || iA0 <= 0) {
                    jG = ut.a.g(jG, Q(H(strSubstring), cVar));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iA0);
                    br.l.d(strSubstring2, "substring(...)");
                    long jG2 = ut.a.g(jG, Q(H(strSubstring2), cVar));
                    String strSubstring3 = strSubstring.substring(iA0);
                    br.l.d(strSubstring3, "substring(...)");
                    double d6 = Double.parseDouble(strSubstring3);
                    double dL = b4.l(d6, cVar, ut.c.NANOSECONDS);
                    if (Double.isNaN(dL)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jG3 = dr.a.G(dL);
                    jG = ut.a.g(jG2, (-4611686018426999999L > jG3 || jG3 >= 4611686018427000000L) ? p(dr.a.G(b4.l(d6, cVar, ut.c.MILLISECONDS))) : q(jG3));
                }
                cVar2 = cVar;
                i12 = i14;
            } else {
                if (z11 || (i12 = i12 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z11 = true;
            }
        }
        return z10 ? ut.a.i(jG) : jG;
    }

    public static int a0(Object obj, j6 j6Var, byte[] bArr, int i10, int i11, int i12, v4 v4Var) throws q5 {
        c6 c6Var = (c6) j6Var;
        int i13 = v4Var.f5232d + 1;
        v4Var.f5232d = i13;
        if (i13 >= 100) {
            throw new q5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iS = c6Var.s(obj, bArr, i10, i11, i12, v4Var);
        v4Var.f5232d--;
        v4Var.f5231c = obj;
        return iS;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.List r6, d4.j r7, rq.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof d4.d
            if (r0 == 0) goto L13
            r0 = r8
            d4.d r0 = (d4.d) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            d4.d r0 = new d4.d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6789y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f6788x
            java.io.Serializable r7 = r0.f6787r
            br.w r7 = (br.w) r7
            lf.t1.G(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f6787r
            java.util.List r6 = (java.util.List) r6
            lf.t1.G(r8)
            goto L5c
        L42:
            lf.t1.G(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            d4.f r2 = new d4.f
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f6787r = r8
            r0.B = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            br.w r7 = new br.w
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            ar.k r8 = (ar.k) r8
            r0.f6787r = r7     // Catch: java.lang.Throwable -> L30
            r0.f6788x = r6     // Catch: java.lang.Throwable -> L30
            r0.B = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.f2917a
            if (r2 != 0) goto L85
            r7.f2917a = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            ir.f0.c(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f2917a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            lq.b0 r1 = lq.b0.f15562a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.y3.b(java.util.List, d4.j, rq.c):java.lang.Object");
    }

    public static int b0(int i10, byte[] bArr, int i11, int i12, n5 n5Var, v4 v4Var) {
        i5 i5Var = (i5) n5Var;
        int iS = S(bArr, i11, v4Var);
        i5Var.d(v4Var.f5229a);
        while (iS < i12) {
            int iS2 = S(bArr, iS, v4Var);
            if (i10 != v4Var.f5229a) {
                break;
            }
            iS = S(bArr, iS2, v4Var);
            i5Var.d(v4Var.f5229a);
        }
        return iS;
    }

    public static final nt.a c(ht.x xVar) {
        ht.d1 d1VarB;
        nt.e eVar;
        br.l.e(xVar, "type");
        if (ht.c.j(xVar)) {
            nt.a aVarC = c(ht.c.k(xVar));
            nt.a aVarC2 = c(ht.c.y(xVar));
            return new nt.a(ht.c.g(ht.e.j(ht.c.k((ht.x) aVarC.f18554a), ht.c.y((ht.x) aVarC2.f18554a)), xVar), ht.c.g(ht.e.j(ht.c.k((ht.x) aVarC.f18555b), ht.c.y((ht.x) aVarC2.f18555b)), xVar));
        }
        ht.m0 m0VarZ = xVar.Z();
        if (xVar.Z() instanceof us.b) {
            br.l.c(m0VarZ, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            ht.p0 p0VarA = ((us.b) m0VarZ).a();
            ht.x xVarB = p0VarA.b();
            br.l.d(xVarB, "typeProjection.type");
            ht.x xVarH = ht.a1.h(xVarB, xVar.c0());
            int i10 = nt.b.f18556a[p0VarA.a().ordinal()];
            if (i10 == 2) {
                ht.b0 b0VarO = se.b.A(xVar).o();
                br.l.d(b0VarO, "type.builtIns.nullableAnyType");
                return new nt.a(xVarH, b0VarO);
            }
            if (i10 == 3) {
                return new nt.a(ht.a1.h(se.b.A(xVar).n(), xVar.c0()), xVarH);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + p0VarA);
        }
        if (xVar.L().isEmpty() || xVar.L().size() != m0VarZ.o().size()) {
            return new nt.a(xVar, xVar);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listL = xVar.L();
        List listO = m0VarZ.o();
        br.l.d(listO, "typeConstructor.parameters");
        Iterator it = mq.o.W0(listL, listO).iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        nt.e eVar2 = (nt.e) it2.next();
                        eVar2.getClass();
                        if (!jt.d.f13840a.b(eVar2.f18559b, eVar2.f18560c)) {
                            break;
                        }
                    }
                    z10 = false;
                }
                return new nt.a(z10 ? se.b.A(xVar).n() : K(xVar, arrayList), K(xVar, arrayList2));
            }
            lq.l lVar = (lq.l) it.next();
            ht.p0 p0Var = (ht.p0) lVar.f15571a;
            rr.r0 r0Var = (rr.r0) lVar.f15572d;
            br.l.d(r0Var, "typeParameter");
            ht.d1 d1VarN = r0Var.N();
            if (d1VarN == null) {
                ht.x0.a(35);
                throw null;
            }
            if (p0Var == null) {
                ht.x0.a(36);
                throw null;
            }
            ht.x0 x0Var = ht.x0.f10954b;
            if (p0Var.c()) {
                d1VarB = ht.d1.OUT_VARIANCE;
                if (d1VarB == null) {
                    ht.x0.a(37);
                    throw null;
                }
            } else {
                d1VarB = ht.x0.b(d1VarN, p0Var.a());
            }
            int i11 = nt.b.f18556a[d1VarB.ordinal()];
            if (i11 == 1) {
                ht.x xVarB2 = p0Var.b();
                br.l.d(xVarB2, "type");
                ht.x xVarB3 = p0Var.b();
                br.l.d(xVarB3, "type");
                eVar = new nt.e(r0Var, xVarB2, xVarB3);
            } else if (i11 == 2) {
                ht.x xVarB4 = p0Var.b();
                br.l.d(xVarB4, "type");
                ht.b0 b0VarO2 = xs.d.e(r0Var).o();
                br.l.d(b0VarO2, "typeParameter.builtIns.nullableAnyType");
                eVar = new nt.e(r0Var, xVarB4, b0VarO2);
            } else {
                if (i11 != 3) {
                    throw new bf.n();
                }
                ht.b0 b0VarN = xs.d.e(r0Var).n();
                ht.x xVarB5 = p0Var.b();
                br.l.d(xVarB5, "type");
                eVar = new nt.e(r0Var, b0VarN, xVarB5);
            }
            if (p0Var.c()) {
                arrayList.add(eVar);
                arrayList2.add(eVar);
            } else {
                nt.a aVarC3 = c(eVar.f18559b);
                ht.x xVar2 = (ht.x) aVarC3.f18554a;
                ht.x xVar3 = (ht.x) aVarC3.f18555b;
                nt.a aVarC4 = c(eVar.f18560c);
                ht.x xVar4 = (ht.x) aVarC4.f18554a;
                ht.x xVar5 = (ht.x) aVarC4.f18555b;
                rr.r0 r0Var2 = eVar.f18558a;
                nt.e eVar3 = new nt.e(r0Var2, xVar3, xVar4);
                nt.e eVar4 = new nt.e(r0Var2, xVar2, xVar5);
                arrayList.add(eVar3);
                arrayList2.add(eVar4);
            }
        }
    }

    public static int c0(byte[] bArr, int i10, n5 n5Var, v4 v4Var) throws q5 {
        i5 i5Var = (i5) n5Var;
        int iS = S(bArr, i10, v4Var);
        int i11 = v4Var.f5229a + iS;
        while (iS < i11) {
            iS = S(bArr, iS, v4Var);
            i5Var.d(v4Var.f5229a);
        }
        if (iS == i11) {
            return iS;
        }
        throw new q5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static QuestionValidationState d(SurveyPointRatingSettings surveyPointRatingSettings, boolean z10, boolean z11, boolean z12, boolean z13) {
        br.l.e(surveyPointRatingSettings, "pointSettings");
        boolean zIsMandatory = surveyPointRatingSettings.getIsMandatory();
        boolean z14 = z10 || !zIsMandatory;
        boolean z15 = z11 && z10;
        boolean z16 = z12 || !(z15 && br.l.a(surveyPointRatingSettings.isCommentMandatory(), Boolean.TRUE));
        DisclaimerSettings disclaimerSettings = surveyPointRatingSettings.getDisclaimerSettings();
        boolean z17 = disclaimerSettings == null || z13 || !disclaimerSettings.getCheckboxVisible() || !disclaimerSettings.getCheckboxRequired();
        DisclaimerSettings disclaimerSettings2 = surveyPointRatingSettings.getDisclaimerSettings();
        return new QuestionValidationState(z14 && z16 && z17, (!zIsMandatory || z15 || (disclaimerSettings2 != null && disclaimerSettings2.getCheckboxVisible())) ? false : true);
    }

    public static int d0(j6 j6Var, int i10, byte[] bArr, int i11, int i12, n5 n5Var, v4 v4Var) throws q5 {
        h5 h5VarZza = j6Var.zza();
        j6 j6Var2 = j6Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        v4 v4Var2 = v4Var;
        int iZ = Z(h5VarZza, j6Var2, bArr2, i11, i13, v4Var2);
        j6Var2.f(h5VarZza);
        v4Var2.f5231c = h5VarZza;
        n5Var.add(h5VarZza);
        while (iZ < i13) {
            v4 v4Var3 = v4Var2;
            int i14 = i13;
            int iS = S(bArr2, iZ, v4Var3);
            if (i10 != v4Var3.f5229a) {
                break;
            }
            byte[] bArr3 = bArr2;
            j6 j6Var3 = j6Var2;
            h5 h5VarZza2 = j6Var3.zza();
            iZ = Z(h5VarZza2, j6Var3, bArr3, iS, i14, v4Var3);
            j6Var2 = j6Var3;
            bArr2 = bArr3;
            i13 = i14;
            v4Var2 = v4Var3;
            j6Var2.f(h5VarZza2);
            v4Var2.f5231c = h5VarZza2;
            n5Var.add(h5VarZza2);
        }
        return iZ;
    }

    public static ClassLoader e(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }

    public static int e0(int i10, byte[] bArr, int i11, int i12, n6 n6Var, v4 v4Var) throws q5 {
        if ((i10 >>> 3) == 0) {
            throw new q5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iU = U(bArr, i11, v4Var);
            n6Var.d(i10, Long.valueOf(v4Var.f5230b));
            return iU;
        }
        if (i13 == 1) {
            n6Var.d(i10, Long.valueOf(W(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iS = S(bArr, i11, v4Var);
            int i14 = v4Var.f5229a;
            if (i14 < 0) {
                throw new q5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iS) {
                throw new q5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                n6Var.d(i10, y4.f5268g);
            } else {
                n6Var.d(i10, y4.d(bArr, iS, i14));
            }
            return iS + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new q5("Protocol message contained an invalid tag (zero).");
            }
            n6Var.d(i10, Integer.valueOf(V(i11, bArr)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        n6 n6VarA = n6.a();
        int i16 = v4Var.f5232d + 1;
        v4Var.f5232d = i16;
        if (i16 >= 100) {
            throw new q5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iS2 = S(bArr, i11, v4Var);
            int i18 = v4Var.f5229a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iS2;
                break;
            }
            i11 = e0(i18, bArr, iS2, i12, n6VarA, v4Var);
            i17 = i18;
        }
        v4Var.f5232d--;
        if (i11 > i12 || i17 != i15) {
            throw new q5("Failed to parse the message.");
        }
        n6Var.d(i10, n6VarA);
        return i11;
    }

    public static final sr.h f(sr.h hVar, sr.h hVar2) {
        br.l.e(hVar, "first");
        br.l.e(hVar2, "second");
        return hVar.isEmpty() ? hVar2 : hVar2.isEmpty() ? hVar : new sr.i(new sr.h[]{hVar, hVar2});
    }

    public static int f0(int i10, byte[] bArr, int i11, int i12, v4 v4Var) throws q5 {
        if ((i10 >>> 3) == 0) {
            throw new q5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return U(bArr, i11, v4Var);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return S(bArr, i11, v4Var) + v4Var.f5229a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new q5("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = S(bArr, i11, v4Var);
            i15 = v4Var.f5229a;
            if (i15 == i14) {
                break;
            }
            i11 = f0(i15, bArr, i11, i12, v4Var);
        }
        if (i11 > i12 || i15 != i14) {
            throw new q5("Failed to parse the message.");
        }
        return i11;
    }

    public static final double g(int i10, int i11, int i12, int i13, m8.g gVar) {
        double d6 = i12 / i10;
        double d10 = i13 / i11;
        int i14 = c8.j.f3349a[gVar.ordinal()];
        if (i14 == 1) {
            return Math.max(d6, d10);
        }
        if (i14 == 2) {
            return Math.min(d6, d10);
        }
        throw new bf.n();
    }

    public static final Collection h(Collection collection, Collection collection2) {
        br.l.e(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static void n(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (bf.j jVar : (Set) it2.next()) {
                        for (bf.l lVar : jVar.f2722a.f2705c) {
                            if (lVar.f2729c == 0) {
                                Set<bf.j> set = (Set) map.get(new bf.k(lVar.f2727a, lVar.f2728b == 2));
                                if (set != null) {
                                    for (bf.j jVar2 : set) {
                                        jVar.f2723b.add(jVar2);
                                        jVar2.f2724c.add(jVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    bf.j jVar3 = (bf.j) it4.next();
                    if (jVar3.f2724c.isEmpty()) {
                        hashSet2.add(jVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    bf.j jVar4 = (bf.j) hashSet2.iterator().next();
                    hashSet2.remove(jVar4);
                    i10++;
                    Iterator it5 = jVar4.f2723b.iterator();
                    while (it5.hasNext()) {
                        bf.j jVar5 = (bf.j) it5.next();
                        jVar5.f2724c.remove(jVar4);
                        if (jVar5.f2724c.isEmpty()) {
                            hashSet2.add(jVar5);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    bf.j jVar6 = (bf.j) it6.next();
                    if (!jVar6.f2724c.isEmpty() && !jVar6.f2723b.isEmpty()) {
                        arrayList2.add(jVar6.f2722a);
                    }
                }
                throw new bf.m("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            bf.c cVar = (bf.c) it.next();
            bf.j jVar7 = new bf.j(cVar);
            for (bf.u uVar : cVar.f2704b) {
                boolean z10 = cVar.f2707e == 0;
                bf.k kVar = new bf.k(uVar, !z10);
                if (!map.containsKey(kVar)) {
                    map.put(kVar, new HashSet());
                }
                Set set2 = (Set) map.get(kVar);
                if (!set2.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + uVar + ".");
                }
                set2.add(jVar7);
            }
        }
    }

    public static final long o(long j) {
        long j7 = (j << 1) + 1;
        int i10 = ut.a.f23695r;
        int i11 = ut.b.f23697a;
        return j7;
    }

    public static final long p(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? o(vc.e.i(j, -4611686018427387903L, 4611686018427387903L)) : q(j * 1000000);
    }

    public static final long q(long j) {
        long j7 = j << 1;
        int i10 = ut.a.f23695r;
        int i11 = ut.b.f23697a;
        return j7;
    }

    public static Object s(Class cls) {
        ir.d dVarH = ir.f0.H(cls);
        jv.a aVar = lv.a.f15967b;
        if (aVar == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        Object objA = aVar.f13863a.b().a(null, dVarH, null);
        if (objA != null) {
            return objA;
        }
        jv.a aVar2 = lv.a.f15967b;
        if (aVar2 != null) {
            return aVar2.f13863a.b().a(null, dVarH, null);
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static a2.a t(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new a2.a(a2.e.b(view));
        }
        return null;
    }

    public static final int v(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i19 + i11;
            }
        }
        return i11;
    }

    public static final js.s w(ls.g0 g0Var, ns.f fVar, h7.h0 h0Var, boolean z10, boolean z11, boolean z12) {
        br.l.e(g0Var, "proto");
        br.l.e(fVar, "nameResolver");
        rs.o oVar = os.k.f19781d;
        br.l.d(oVar, "propertySignature");
        os.e eVar = (os.e) a.a.o(g0Var, oVar);
        if (eVar != null) {
            if (z10) {
                rs.g gVar = ps.i.f20642a;
                ps.d dVarB = ps.i.b(g0Var, fVar, h0Var, z12);
                if (dVarB != null) {
                    return e5.w(dVarB);
                }
            } else if (z11 && (eVar.f19753d & 2) == 2) {
                os.c cVar = eVar.f19755r;
                br.l.d(cVar, "signature.syntheticMethod");
                return new js.s(fVar.getString(cVar.f19743g).concat(fVar.getString(cVar.f19744r)));
            }
        }
        return null;
    }

    public static final int y(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public abstract boolean B();

    public abstract void L(boolean z10);

    public abstract void M(boolean z10);

    public abstract void O(ee.v vVar, float f10);

    public abstract TransformationMethod R(TransformationMethod transformationMethod);

    public abstract Typeface i(Context context, j3.e eVar, Resources resources, int i10);

    public abstract Typeface j(Context context, q3.i[] iVarArr, int i10);

    public Typeface k(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface l(Context context, InputStream inputStream) {
        File fileH = b4.H(context);
        if (fileH == null) {
            return null;
        }
        try {
            if (b4.p(fileH, inputStream)) {
                return Typeface.createFromFile(fileH.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileH.delete();
        }
    }

    public Typeface m(Context context, Resources resources, int i10, String str, int i11) {
        File fileH = b4.H(context);
        if (fileH == null) {
            return null;
        }
        try {
            if (b4.o(fileH, resources, i10)) {
                return Typeface.createFromFile(fileH.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileH.delete();
        }
    }

    public q3.i r(q3.i[] iVarArr, int i10) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        q3.i iVar = null;
        int i12 = Integer.MAX_VALUE;
        for (q3.i iVar2 : iVarArr) {
            int iAbs = (Math.abs(iVar2.f20706c - i11) * 2) + (iVar2.f20707d == z10 ? 0 : 1);
            if (iVar == null || i12 > iAbs) {
                iVar = iVar2;
                i12 = iAbs;
            }
        }
        return iVar;
    }

    public abstract InputFilter[] u(InputFilter[] inputFilterArr);

    public abstract float z(ee.v vVar);
}
