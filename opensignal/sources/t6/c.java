package t6;

import a5.d0;
import androidx.media3.common.i0;
import c9.l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class c extends eb.c {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f22406o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f22407p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f22408q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f22409r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f22410s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f22411t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f22412u = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: v, reason: collision with root package name */
    public static final lb.c f22413v = new lb.c(1, 30.0f, 1);

    /* renamed from: w, reason: collision with root package name */
    public static final l f22414w = new l(15);

    /* renamed from: n, reason: collision with root package name */
    public final XmlPullParserFactory f22415n;

    public c() throws XmlPullParserException {
        super(1);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f22415n = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    public static f n(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean o(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static l p(XmlPullParser xmlPullParser, l lVar) throws NumberFormatException, n6.d {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return lVar;
        }
        Matcher matcher = f22412u.matcher(attributeValue);
        if (!matcher.matches()) {
            a5.a.B("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return lVar;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 != 0 && i11 != 0) {
                return new l(i11);
            }
            throw new n6.d("Invalid cell resolution " + i10 + " " + i11);
        } catch (NumberFormatException unused) {
            a5.a.B("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return lVar;
        }
    }

    public static void q(String str, f fVar) throws n6.d {
        Matcher matcher;
        String strGroup;
        int i10 = d0.f105a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f22408q;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new n6.d(h0.b.i(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            a5.a.B("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new n6.d(h0.b.o("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                fVar.j = 3;
                break;
            case "em":
                fVar.j = 2;
                break;
            case "px":
                fVar.j = 1;
                break;
            default:
                throw new n6.d(h0.b.o("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        fVar.k = Float.parseFloat(strGroup2);
    }

    public static lb.c r(XmlPullParser xmlPullParser) throws NumberFormatException, n6.d {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = d0.f105a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new n6.d("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        lb.c cVar = f22413v;
        int i12 = cVar.f15083b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = cVar.f15084c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new lb.c(i12, i10 * f10, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, c9.l r21, androidx.media3.common.i0 r22, java.util.HashMap r23, java.util.HashMap r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.c.s(org.xmlpull.v1.XmlPullParser, java.util.HashMap, c9.l, androidx.media3.common.i0, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t6.d t(org.xmlpull.v1.XmlPullParser r21, t6.d r22, java.util.HashMap r23, lb.c r24) throws java.lang.NumberFormatException, n6.d {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.c.t(org.xmlpull.v1.XmlPullParser, t6.d, java.util.HashMap, lb.c):t6.d");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t6.f u(org.xmlpull.v1.XmlPullParser r18, t6.f r19) {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.c.u(org.xmlpull.v1.XmlPullParser, t6.f):t6.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long v(java.lang.String r13, lb.c r14) throws java.lang.NumberFormatException, n6.d {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.c.v(java.lang.String, lb.c):long");
    }

    public static i0 w(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strQ = a5.a.q(xmlPullParser, "extent");
        if (strQ == null) {
            return null;
        }
        Matcher matcher = f22411t.matcher(strQ);
        if (!matcher.matches()) {
            a5.a.B("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strQ));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new i0(i10, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            a5.a.B("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strQ));
            return null;
        }
    }

    @Override // eb.c
    public final n6.b h(byte[] bArr, int i10, boolean z10) throws XmlPullParserException, NumberFormatException, IOException, n6.d {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f22415n.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            i0 i0VarW = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            lb.c cVar = f22413v;
            l lVar = f22414w;
            int i11 = 0;
            lb.c cVarR = cVar;
            cj.a aVar = null;
            l lVarP = lVar;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    HashMap map4 = map;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            cVarR = r(xmlPullParserNewPullParser);
                            lVarP = p(xmlPullParserNewPullParser, lVar);
                            i0VarW = w(xmlPullParserNewPullParser);
                        }
                        lb.c cVar2 = cVarR;
                        l lVar2 = lVarP;
                        if (!o(name)) {
                            xmlPullParserNewPullParser.getName();
                            a5.a.t();
                            i11++;
                            map = map4;
                        } else if ("head".equals(name)) {
                            map = map4;
                            s(xmlPullParserNewPullParser, map, lVar2, i0VarW, map2, map3);
                        } else {
                            map = map4;
                            try {
                                d dVarT = t(xmlPullParserNewPullParser, dVar, map2, cVar2);
                                arrayDeque.push(dVarT);
                                if (dVar != null) {
                                    if (dVar.f22426m == null) {
                                        dVar.f22426m = new ArrayList();
                                    }
                                    dVar.f22426m.add(dVarT);
                                }
                            } catch (n6.d e4) {
                                a5.a.C("TtmlDecoder", "Suppressing parser error", e4);
                                i11++;
                            }
                        }
                        lVarP = lVar2;
                        cVarR = cVar2;
                    } else {
                        map = map4;
                        if (eventType == 4) {
                            dVar.getClass();
                            d dVarA = d.a(xmlPullParserNewPullParser.getText());
                            if (dVar.f22426m == null) {
                                dVar.f22426m = new ArrayList();
                            }
                            dVar.f22426m.add(dVarA);
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                d dVar2 = (d) arrayDeque.peek();
                                dVar2.getClass();
                                aVar = new cj.a(dVar2, map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (aVar != null) {
                return aVar;
            }
            throw new n6.d("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new n6.d("Unable to decode source", e11);
        }
    }
}
