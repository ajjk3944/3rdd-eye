package ou;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.y3;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(pu.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
            }
        }
    }

    public static void b(String str, String str2) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(pu.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                sb2.append(pu.b.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static int c(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static r d(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listK = mq.w.f16945a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        l lVarC = l.f19924b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        h0.Companion.getClass();
        h0 h0VarA = g0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listK2 = peerCertificates != null ? pu.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listK = pu.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new r(h0VarA, lVarC, listK, new q(1, listK2));
    }

    public static v e(String str) {
        br.l.e(str, "<this>");
        Matcher matcher = v.f19976c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(h0.b.g('\"', "No subtype found for: \"", str).toString());
        }
        String strGroup = matcher.group(1);
        br.l.d(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        br.l.d(locale, "US");
        br.l.d(strGroup.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        br.l.d(strGroup2, "typeSubtype.group(2)");
        br.l.d(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = v.f19977d.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                br.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                throw new IllegalArgumentException(h0.b.r(sb2, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (tt.s.n0(strGroup4, "'", false) && tt.s.f0(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    br.l.d(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new v(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static String f(t tVar) {
        br.l.e(tVar, "url");
        cv.j jVar = cv.j.f6715r;
        return sm.m.m(tVar.f19974h).c("MD5").e();
    }

    public static s g(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr2[i11];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i11] = tt.l.a1(str).toString();
        }
        int iV = y3.v(0, strArr2.length - 1, 2);
        if (iV >= 0) {
            while (true) {
                String str2 = strArr2[i10];
                String str3 = strArr2[i10 + 1];
                a(str2);
                b(str3, str2);
                if (i10 == iV) {
                    break;
                }
                i10 += 2;
            }
        }
        return new s(strArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ou.h h(ou.s r26) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ou.d.h(ou.s):ou.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long i(int r14, java.lang.String r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ou.d.i(int, java.lang.String):long");
    }

    public static int j(cv.z zVar) throws IOException {
        byte bQ;
        try {
            cv.g gVar = zVar.f6754d;
            zVar.g0(1L);
            long j = 0;
            while (true) {
                long j7 = j + 1;
                if (!zVar.S(j7)) {
                    break;
                }
                bQ = gVar.q(j);
                if ((bQ < 48 || bQ > 57) && (j != 0 || bQ != 45)) {
                    break;
                }
                j = j7;
            }
            if (j == 0) {
                b4.g(16);
                String string = Integer.toString(bQ, 16);
                br.l.d(string, "toString(...)");
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long jL = gVar.L();
            String strZ = zVar.z(Long.MAX_VALUE);
            if (jL >= 0 && jL <= 2147483647L && strZ.length() <= 0) {
                return (int) jL;
            }
            throw new IOException("expected an int but was \"" + jL + strZ + '\"');
        } catch (NumberFormatException e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public static Set k(s sVar) {
        int size = sVar.size();
        TreeSet treeSet = null;
        for (int i10 = 0; i10 < size; i10++) {
            if ("Vary".equalsIgnoreCase(sVar.b(i10))) {
                String strD = sVar.d(i10);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    br.l.d(comparator, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = tt.l.O0(strD, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(tt.l.a1((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? mq.y.f16947a : treeSet;
    }
}
