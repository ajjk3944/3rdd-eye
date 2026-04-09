package h9;

import android.graphics.Matrix;
import android.util.Xml;
import com.google.android.gms.internal.measurement.h4;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public bm.d f10317a;

    /* renamed from: b, reason: collision with root package name */
    public m1 f10318b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10319c;

    /* renamed from: d, reason: collision with root package name */
    public int f10320d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10321e;

    /* renamed from: f, reason: collision with root package name */
    public a3 f10322f;

    /* renamed from: g, reason: collision with root package name */
    public StringBuilder f10323g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10324h;

    /* renamed from: i, reason: collision with root package name */
    public StringBuilder f10325i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x046b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void D(h9.i1 r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.c3.D(h9.i1, java.lang.String, java.lang.String):void");
    }

    public static int b(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    public static int d(float f10, float f11, float f12) {
        float f13 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f11 / 100.0f;
        float f16 = f12 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        float f17 = f16 >= 0.0f ? f16 > 1.0f ? 1.0f : f16 : 0.0f;
        float f18 = f17 <= 0.5f ? (f15 + 1.0f) * f17 : (f17 + f15) - (f15 * f17);
        float f19 = (f17 * 2.0f) - f18;
        return b(e(f19, f18, f14 - 2.0f) * 256.0f) | (b(e(f19, f18, f14 + 2.0f) * 256.0f) << 16) | (b(e(f19, f18, f14) * 256.0f) << 8);
    }

    public static float e(float f10, float f11, float f12) {
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        return f12 < 1.0f ? c7.a.a(f11, f10, f12, f10) : f12 < 3.0f ? f11 : f12 < 4.0f ? c7.a.a(4.0f, f12, f11 - f10, f10) : f10;
    }

    public static void f(k1 k1Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (t2.f10493b[h0.b.d(attributes, i10)]) {
                case 21:
                    b5.m mVar = new b5.m(strTrim);
                    HashSet hashSet = new HashSet();
                    while (!mVar.v()) {
                        String strE = mVar.E();
                        if (strE.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(strE.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        mVar.K();
                    }
                    k1Var.d(hashSet);
                    break;
                case 22:
                    k1Var.h(strTrim);
                    break;
                case 23:
                    b5.m mVar2 = new b5.m(strTrim);
                    HashSet hashSet2 = new HashSet();
                    while (!mVar2.v()) {
                        String strE2 = mVar2.E();
                        int iIndexOf = strE2.indexOf(45);
                        if (iIndexOf != -1) {
                            strE2 = strE2.substring(0, iIndexOf);
                        }
                        hashSet2.add(new Locale(strE2, "", "").getLanguage());
                        mVar2.K();
                    }
                    k1Var.j(hashSet2);
                    break;
                case 24:
                    b5.m mVar3 = new b5.m(strTrim);
                    HashSet hashSet3 = new HashSet();
                    while (!mVar3.v()) {
                        hashSet3.add(mVar3.E());
                        mVar3.K();
                    }
                    k1Var.i(hashSet3);
                    break;
                case 25:
                    ArrayList arrayListQ = q(strTrim);
                    k1Var.g(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                    break;
            }
        }
    }

    public static void g(o1 o1Var, Attributes attributes) throws s2 {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                o1Var.f10433c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    o1Var.f10434d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new s2(c7.a.p("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    o1Var.f10434d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(h9.f0 r4, org.xml.sax.Attributes r5) throws h9.s2 {
        /*
            r0 = 0
        L1:
            int r1 = r5.getLength()
            if (r0 >= r1) goto L79
            java.lang.String r1 = r5.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = h9.t2.f10493b
            int r3 = h0.b.d(r5, r0)
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L5c
            switch(r2) {
                case 32: goto L3a;
                case 33: goto L33;
                case 34: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L76
        L1e:
            h9.g0 r2 = h9.g0.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L25
            r4.k = r2     // Catch: java.lang.IllegalArgumentException -> L25
            goto L76
        L25:
            h9.s2 r4 = new h9.s2
            java.lang.String r5 = "Invalid spreadMethod attribute. \""
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r5 = h0.b.o(r5, r1, r0)
            r4.<init>(r5)
            throw r4
        L33:
            android.graphics.Matrix r1 = z(r1)
            r4.j = r1
            goto L76
        L3a:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L47
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.f10336i = r1
            goto L76
        L47:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L54
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.f10336i = r1
            goto L76
        L54:
            h9.s2 r4 = new h9.s2
            java.lang.String r5 = "Invalid value for attribute gradientUnits"
            r4.<init>(r5)
            throw r4
        L5c:
            java.lang.String r2 = ""
            java.lang.String r3 = r5.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L74
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r5.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L76
        L74:
            r4.f10337l = r1
        L76:
            int r0 = r0 + 1
            goto L1
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.c3.h(h9.f0, org.xml.sax.Attributes):void");
    }

    public static void i(u0 u0Var, Attributes attributes, String str) throws s2 {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (z2.fromString(attributes.getLocalName(i10)) == z2.points) {
                b5.m mVar = new b5.m(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                mVar.K();
                while (!mVar.v()) {
                    float fB = mVar.B();
                    if (Float.isNaN(fB)) {
                        throw new s2(h0.b.o("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    mVar.J();
                    float fB2 = mVar.B();
                    if (Float.isNaN(fB2)) {
                        throw new s2(h0.b.o("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    mVar.J();
                    arrayList.add(Float.valueOf(fB));
                    arrayList.add(Float.valueOf(fB2));
                }
                u0Var.f10497o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    u0Var.f10497o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    public static void j(o1 o1Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = t2.f10493b[h0.b.d(attributes, i10)];
                if (i11 == 45) {
                    b5.m mVar = new b5.m(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strF = mVar.F(':', false);
                        mVar.K();
                        if (!mVar.s(':')) {
                            break;
                        }
                        mVar.K();
                        String strF2 = mVar.F(';', true);
                        if (strF2 == null) {
                            break;
                        }
                        mVar.K();
                        if (mVar.v() || mVar.s(';')) {
                            if (o1Var.f10436f == null) {
                                o1Var.f10436f = new i1();
                            }
                            D(o1Var.f10436f, strF, strF2);
                            mVar.K();
                        }
                    }
                } else if (i11 != 46) {
                    if (o1Var.f10435e == null) {
                        o1Var.f10435e = new i1();
                    }
                    D(o1Var.f10435e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    e eVar = new e(strTrim);
                    ArrayList arrayList = null;
                    while (!eVar.v()) {
                        String strE = eVar.E();
                        if (strE != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strE);
                            eVar.K();
                        }
                    }
                    o1Var.f10437g = arrayList;
                }
            }
        }
    }

    public static void k(d2 d2Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = t2.f10493b[h0.b.d(attributes, i10)];
            if (i11 == 1) {
                d2Var.f10326n = t(strTrim);
            } else if (i11 == 2) {
                d2Var.f10327o = t(strTrim);
            } else if (i11 == 19) {
                d2Var.f10328p = t(strTrim);
            } else if (i11 == 20) {
                d2Var.f10329q = t(strTrim);
            }
        }
    }

    public static void l(j0 j0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (z2.fromString(attributes.getLocalName(i10)) == z2.transform) {
                j0Var.k(z(attributes.getValue(i10)));
            }
        }
    }

    public static void m(u1 u1Var, Attributes attributes) throws s2 {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = t2.f10493b[h0.b.d(attributes, i10)];
            if (i11 == 7) {
                x(u1Var, strTrim);
            } else if (i11 != 87) {
                continue;
            } else {
                b5.m mVar = new b5.m(strTrim);
                mVar.K();
                float fB = mVar.B();
                mVar.J();
                float fB2 = mVar.B();
                mVar.J();
                float fB3 = mVar.B();
                mVar.J();
                float fB4 = mVar.B();
                if (Float.isNaN(fB) || Float.isNaN(fB2) || Float.isNaN(fB3) || Float.isNaN(fB4)) {
                    throw new s2("Invalid viewBox definition - should have four numbers");
                }
                if (fB3 < 0.0f) {
                    throw new s2("Invalid viewBox. width cannot be negative");
                }
                if (fB4 < 0.0f) {
                    throw new s2("Invalid viewBox. height cannot be negative");
                }
                u1Var.f10498o = new f1.a(fB, fB2, fB3, fB4);
            }
        }
    }

    public static b0 n(String str) throws s2 {
        long j;
        int i10;
        if (str.charAt(0) == '#') {
            int length = str.length();
            t tVar = null;
            if (1 < length) {
                long j7 = 0;
                int i11 = 1;
                while (i11 < length) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt >= 'A' && cCharAt <= 'F') {
                            j = j7 * 16;
                            i10 = cCharAt - 'A';
                        } else {
                            if (cCharAt < 'a' || cCharAt > 'f') {
                                break;
                            }
                            j = j7 * 16;
                            i10 = cCharAt - 'a';
                        }
                        j7 = j + i10 + 10;
                    } else {
                        j7 = (j7 * 16) + (cCharAt - '0');
                    }
                    if (j7 > 4294967295L) {
                        break;
                    }
                    i11++;
                }
                if (i11 != 1) {
                    tVar = new t(i11, j7);
                }
            }
            if (tVar == null) {
                throw new s2("Bad hex colour value: ".concat(str));
            }
            long j10 = tVar.f10478b;
            int i12 = tVar.f10477a;
            if (i12 == 4) {
                int i13 = (int) j10;
                int i14 = i13 & 3840;
                int i15 = i13 & 240;
                int i16 = i13 & 15;
                return new b0(i16 | (i14 << 8) | (-16777216) | (i14 << 12) | (i15 << 8) | (i15 << 4) | (i16 << 4));
            }
            if (i12 != 5) {
                if (i12 == 7) {
                    return new b0(((int) j10) | (-16777216));
                }
                if (i12 != 9) {
                    throw new s2("Bad hex colour value: ".concat(str));
                }
                int i17 = (int) j10;
                return new b0((i17 >>> 8) | (i17 << 24));
            }
            int i18 = (int) j10;
            int i19 = 61440 & i18;
            int i20 = i18 & 3840;
            int i21 = i18 & 240;
            int i22 = i18 & 15;
            return new b0((i22 << 24) | (i22 << 28) | (i19 << 8) | (i19 << 4) | (i20 << 4) | i20 | i21 | (i21 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            b5.m mVar = new b5.m(str.substring(zStartsWith ? 5 : 4));
            mVar.K();
            float fB = mVar.B();
            if (!Float.isNaN(fB) && mVar.s('%')) {
                fB = (fB * 256.0f) / 100.0f;
            }
            float fJ = mVar.j(fB);
            if (!Float.isNaN(fJ) && mVar.s('%')) {
                fJ = (fJ * 256.0f) / 100.0f;
            }
            float fJ2 = mVar.j(fJ);
            if (!Float.isNaN(fJ2) && mVar.s('%')) {
                fJ2 = (fJ2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                mVar.K();
                if (Float.isNaN(fJ2) || !mVar.s(')')) {
                    throw new s2("Bad rgb() colour value: ".concat(str));
                }
                return new b0((b(fB) << 16) | (-16777216) | (b(fJ) << 8) | b(fJ2));
            }
            float fJ3 = mVar.j(fJ2);
            mVar.K();
            if (Float.isNaN(fJ3) || !mVar.s(')')) {
                throw new s2("Bad rgba() colour value: ".concat(str));
            }
            return new b0((b(fJ3 * 256.0f) << 24) | (b(fB) << 16) | (b(fJ) << 8) | b(fJ2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) v2.f10500a.get(lowerCase);
            if (num != null) {
                return new b0(num.intValue());
            }
            throw new s2("Invalid colour keyword: ".concat(lowerCase));
        }
        b5.m mVar2 = new b5.m(str.substring(zStartsWith2 ? 5 : 4));
        mVar2.K();
        float fB2 = mVar2.B();
        float fJ4 = mVar2.j(fB2);
        if (!Float.isNaN(fJ4)) {
            mVar2.s('%');
        }
        float fJ5 = mVar2.j(fJ4);
        if (!Float.isNaN(fJ5)) {
            mVar2.s('%');
        }
        if (!zStartsWith2) {
            mVar2.K();
            if (Float.isNaN(fJ5) || !mVar2.s(')')) {
                throw new s2("Bad hsl() colour value: ".concat(str));
            }
            return new b0(d(fB2, fJ4, fJ5) | (-16777216));
        }
        float fJ6 = mVar2.j(fJ5);
        mVar2.K();
        if (Float.isNaN(fJ6) || !mVar2.s(')')) {
            throw new s2("Bad hsla() colour value: ".concat(str));
        }
        return new b0((b(fJ6 * 256.0f) << 24) | d(fB2, fJ4, fJ5));
    }

    public static float o(int i10, String str) throws s2 {
        float fA = new u().a(str, 0, i10);
        if (Float.isNaN(fA)) {
            throw new s2(c7.a.p("Invalid float value: ", str));
        }
        return fA;
    }

    public static float p(String str) throws s2 {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        throw new s2("Invalid float value (empty string)");
    }

    public static ArrayList q(String str) {
        b5.m mVar = new b5.m(str);
        ArrayList arrayList = null;
        do {
            String strD = mVar.D();
            if (strD == null) {
                strD = mVar.F(',', true);
            }
            if (strD == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strD);
            mVar.J();
        } while (!mVar.v());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static l0 s(String str) throws s2 {
        if (str.length() == 0) {
            throw new s2("Invalid length value (empty string)");
        }
        int length = str.length();
        f2 f2VarValueOf = f2.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            f2VarValueOf = f2.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                f2VarValueOf = f2.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new s2("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new l0(o(length, str), f2VarValueOf);
        } catch (NumberFormatException e4) {
            throw new s2("Invalid length value: ".concat(str), e4);
        }
    }

    public static ArrayList t(String str) throws s2 {
        if (str.length() == 0) {
            throw new s2("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        b5.m mVar = new b5.m(str);
        mVar.K();
        while (!mVar.v()) {
            float fB = mVar.B();
            if (Float.isNaN(fB)) {
                StringBuilder sb2 = new StringBuilder("Invalid length list value: ");
                String str2 = (String) mVar.f2460r;
                int i10 = mVar.f2457a;
                while (!mVar.v() && !b5.m.y(str2.charAt(mVar.f2457a))) {
                    mVar.f2457a++;
                }
                String strSubstring = str2.substring(i10, mVar.f2457a);
                mVar.f2457a = i10;
                sb2.append(strSubstring);
                throw new s2(sb2.toString());
            }
            f2 f2VarG = mVar.G();
            if (f2VarG == null) {
                f2VarG = f2.px;
            }
            arrayList.add(new l0(fB, f2VarG));
            mVar.J();
        }
        return arrayList;
    }

    public static l0 u(b5.m mVar) {
        return mVar.t("auto") ? new l0(0.0f) : mVar.C();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f10 = 0.0f;
            if (fP < 0.0f) {
                fP = f10;
            } else {
                f10 = 1.0f;
                if (fP > 1.0f) {
                    fP = f10;
                }
            }
            return Float.valueOf(fP);
        } catch (s2 unused) {
            return null;
        }
    }

    public static r1 w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        r1 r1VarN = b0.f10307g;
        r1 r1Var = c0.f10313a;
        r1 r1Var2 = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return r1VarN;
            }
            if (str.equals("currentColor")) {
                return r1Var;
            }
            try {
                return n(str);
            } catch (s2 unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new q0(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    r1VarN = r1Var;
                } else {
                    try {
                        r1VarN = n(strTrim2);
                    } catch (s2 unused2) {
                        r1VarN = null;
                    }
                }
            }
            r1Var2 = r1VarN;
        }
        return new q0(strTrim, r1Var2);
    }

    public static void x(s1 s1Var, String str) throws s2 {
        w wVar;
        b5.m mVar = new b5.m(str);
        mVar.K();
        String strE = mVar.E();
        if ("defer".equals(strE)) {
            mVar.K();
            strE = mVar.E();
        }
        v vVar = (v) u2.f10499a.get(strE);
        mVar.K();
        if (mVar.v()) {
            wVar = null;
        } else {
            String strE2 = mVar.E();
            strE2.getClass();
            if (strE2.equals("meet")) {
                wVar = w.meet;
            } else {
                if (!strE2.equals("slice")) {
                    throw new s2("Invalid preserveAspectRatio definition: ".concat(str));
                }
                wVar = w.slice;
            }
        }
        s1Var.f10476n = new x(vVar, wVar);
    }

    public static HashMap y(b5.m mVar) {
        HashMap map = new HashMap();
        mVar.K();
        String strF = mVar.F('=', false);
        while (strF != null) {
            mVar.s('=');
            map.put(strF, mVar.D());
            mVar.K();
            strF = mVar.F('=', false);
        }
        return map;
    }

    public static Matrix z(String str) throws s2 {
        Matrix matrix = new Matrix();
        b5.m mVar = new b5.m(str);
        mVar.K();
        while (!mVar.v()) {
            String str2 = (String) mVar.f2460r;
            String strSubstring = null;
            if (!mVar.v()) {
                int i10 = mVar.f2457a;
                int iCharAt = str2.charAt(i10);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = mVar.h();
                    }
                }
                int i11 = mVar.f2457a;
                while (b5.m.y(iCharAt)) {
                    iCharAt = mVar.h();
                }
                if (iCharAt == 40) {
                    mVar.f2457a++;
                    strSubstring = str2.substring(i10, i11);
                } else {
                    mVar.f2457a = i10;
                }
            }
            if (strSubstring == null) {
                throw new s2("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    mVar.K();
                    float fB = mVar.B();
                    mVar.J();
                    float fB2 = mVar.B();
                    mVar.J();
                    float fB3 = mVar.B();
                    mVar.J();
                    float fB4 = mVar.B();
                    mVar.J();
                    float fB5 = mVar.B();
                    mVar.J();
                    float fB6 = mVar.B();
                    mVar.K();
                    if (!Float.isNaN(fB6) && mVar.s(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{fB, fB3, fB5, fB2, fB4, fB6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new s2("Invalid transform list: ".concat(str));
                    }
                    break;
                case "rotate":
                    mVar.K();
                    float fB7 = mVar.B();
                    float fH = mVar.H();
                    float fH2 = mVar.H();
                    mVar.K();
                    if (Float.isNaN(fB7) || !mVar.s(')')) {
                        throw new s2("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fH)) {
                        matrix.preRotate(fB7);
                        break;
                    } else if (!Float.isNaN(fH2)) {
                        matrix.preRotate(fB7, fH, fH2);
                        break;
                    } else {
                        throw new s2("Invalid transform list: ".concat(str));
                    }
                case "scale":
                    mVar.K();
                    float fB8 = mVar.B();
                    float fH3 = mVar.H();
                    mVar.K();
                    if (!Float.isNaN(fB8) && mVar.s(')')) {
                        if (!Float.isNaN(fH3)) {
                            matrix.preScale(fB8, fH3);
                            break;
                        } else {
                            matrix.preScale(fB8, fB8);
                            break;
                        }
                    } else {
                        throw new s2("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewX":
                    mVar.K();
                    float fB9 = mVar.B();
                    mVar.K();
                    if (!Float.isNaN(fB9) && mVar.s(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(fB9)), 0.0f);
                        break;
                    } else {
                        throw new s2("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    mVar.K();
                    float fB10 = mVar.B();
                    mVar.K();
                    if (!Float.isNaN(fB10) && mVar.s(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fB10)));
                        break;
                    } else {
                        throw new s2("Invalid transform list: ".concat(str));
                    }
                    break;
                case "translate":
                    mVar.K();
                    float fB11 = mVar.B();
                    float fH4 = mVar.H();
                    mVar.K();
                    if (!Float.isNaN(fB11) && mVar.s(')')) {
                        if (!Float.isNaN(fH4)) {
                            matrix.preTranslate(fB11, fH4);
                            break;
                        } else {
                            matrix.preTranslate(fB11, 0.0f);
                            break;
                        }
                    } else {
                        throw new s2("Invalid transform list: ".concat(str));
                    }
                default:
                    throw new s2(h0.b.o("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (mVar.v()) {
                return matrix;
            }
            mVar.J();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            y2 y2Var = new y2(this);
            xMLReader.setContentHandler(y2Var);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", y2Var);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e4) {
            throw new s2("Stream error", e4);
        } catch (ParserConfigurationException e10) {
            throw new s2("XML parser problem", e10);
        } catch (SAXException e11) {
            throw new s2("SVG parse error", e11);
        }
    }

    public final void B(InputStream inputStream) throws XmlPullParserException, ParserConfigurationException, SAXException, IOException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                b3 b3Var = new b3();
                b3Var.f10309a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        E();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        b5.m mVar = new b5.m(xmlPullParserNewPullParser.getText());
                        String strE = mVar.E();
                        y(mVar);
                        strE.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((j1) this.f10317a.f2826d) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                io.sentry.android.core.e0.p("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        F(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, b3Var);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        H(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        G(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (XmlPullParserException e4) {
                throw new s2("XML parser problem", e4);
            }
        } catch (IOException e10) {
            throw new s2("Stream error", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0345, code lost:
    
        io.sentry.android.core.e0.d("SVGParser", "Bad path coords for " + ((char) r5) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0358 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(org.xml.sax.Attributes r25) throws h9.s2 {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.c3.C(org.xml.sax.Attributes):void");
    }

    public final void E() {
        bm.d dVar = new bm.d(24);
        dVar.f2826d = null;
        dVar.f2827g = new p(0);
        dVar.f2828r = new HashMap();
        this.f10317a = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:659:0x033c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0539, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(java.lang.String r17, java.lang.String r18, java.lang.String r19, org.xml.sax.Attributes r20) throws h9.s2 {
        /*
            Method dump skipped, instructions count: 3088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.c3.F(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void G(String str) {
        if (this.f10319c) {
            return;
        }
        if (this.f10321e) {
            if (this.f10323g == null) {
                this.f10323g = new StringBuilder(str.length());
            }
            this.f10323g.append(str);
        } else if (this.f10324h) {
            if (this.f10325i == null) {
                this.f10325i = new StringBuilder(str.length());
            }
            this.f10325i.append(str);
        } else if (this.f10318b instanceof b2) {
            a(str);
        }
    }

    public final void H(char[] cArr, int i10, int i11) {
        if (this.f10319c) {
            return;
        }
        if (this.f10321e) {
            if (this.f10323g == null) {
                this.f10323g = new StringBuilder(i11);
            }
            this.f10323g.append(cArr, i10, i11);
        } else if (this.f10324h) {
            if (this.f10325i == null) {
                this.f10325i = new StringBuilder(i11);
            }
            this.f10325i.append(cArr, i10, i11);
        } else if (this.f10318b instanceof b2) {
            a(new String(cArr, i10, i11));
        }
    }

    public final void a(String str) {
        l1 l1Var = (l1) this.f10318b;
        int size = l1Var.f10401i.size();
        q1 q1Var = size == 0 ? null : (q1) l1Var.f10401i.get(size - 1);
        if (q1Var instanceof e2) {
            e2 e2Var = (e2) q1Var;
            e2Var.f10334c = w.g.j(new StringBuilder(), e2Var.f10334c, str);
        } else {
            m1 m1Var = this.f10318b;
            e2 e2Var2 = new e2();
            e2Var2.f10334c = str;
            m1Var.m(e2Var2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.f10319c) {
            int i10 = this.f10320d - 1;
            this.f10320d = i10;
            if (i10 == 0) {
                this.f10319c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = t2.f10492a[a3.fromString(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 22:
                    case 23:
                        this.f10321e = false;
                        if (this.f10323g != null) {
                            a3 a3Var = this.f10322f;
                            if (a3Var == a3.title || a3Var == a3.desc) {
                                this.f10317a.getClass();
                            }
                            this.f10323g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.f10325i;
                        if (sb2 != null) {
                            this.f10324h = false;
                            String string = sb2.toString();
                            g gVar = g.screen;
                            s sVar = s.Document;
                            h4 h4Var = new h4();
                            h4Var.f5055a = false;
                            h4Var.f5056d = gVar;
                            h4Var.f5057g = sVar;
                            bm.d dVar = this.f10317a;
                            e eVar = new e(string);
                            eVar.K();
                            ((p) dVar.f2827g).b(h4Var.f(eVar));
                            this.f10325i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.f10318b = ((q1) this.f10318b).f10462b;
        }
    }
}
