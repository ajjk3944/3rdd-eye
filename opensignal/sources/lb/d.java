package lb;

import androidx.media3.common.i0;
import c9.l;
import io.sentry.android.core.e0;
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
import qb.v;

/* loaded from: classes.dex */
public final class d extends eb.c {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f15085o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f15086p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f15087q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f15088r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f15089s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f15090t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f15091u = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: v, reason: collision with root package name */
    public static final c f15092v = new c(1, 30.0f, 1);

    /* renamed from: w, reason: collision with root package name */
    public static final l f15093w = new l(15);

    /* renamed from: n, reason: collision with root package name */
    public final XmlPullParserFactory f15094n;

    public d() throws XmlPullParserException {
        super(0);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f15094n = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    public static g n(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean o(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static l p(XmlPullParser xmlPullParser, l lVar) throws eb.g, NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return lVar;
        }
        Matcher matcher = f15091u.matcher(attributeValue);
        if (!matcher.matches()) {
            e0.p("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
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
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Invalid cell resolution ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append(i11);
            throw new eb.g(sb2.toString());
        } catch (NumberFormatException unused) {
            e0.p("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return lVar;
        }
    }

    public static void q(String str, g gVar) throws eb.g {
        Matcher matcher;
        String strGroup;
        int i10 = v.f20828a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f15087q;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                int length2 = strArrSplit.length;
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("Invalid number of entries for fontSize: ");
                sb2.append(length2);
                sb2.append(".");
                throw new eb.g(sb2.toString());
            }
            matcher = pattern.matcher(strArrSplit[1]);
            e0.p("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new eb.g(c7.a.k(str.length() + 36, "Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                gVar.j = 3;
                break;
            case "em":
                gVar.j = 2;
                break;
            case "px":
                gVar.j = 1;
                break;
            default:
                throw new eb.g(c7.a.k(strGroup.length() + 30, "Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        gVar.k = Float.parseFloat(strGroup2);
    }

    public static c r(XmlPullParser xmlPullParser) throws eb.g, NumberFormatException {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = v.f20828a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new eb.g("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        c cVar = f15092v;
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
        return new c(i12, i10 * f10, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, c9.l r21, androidx.media3.common.i0 r22, java.util.HashMap r23, java.util.HashMap r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.d.s(org.xmlpull.v1.XmlPullParser, java.util.HashMap, c9.l, androidx.media3.common.i0, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lb.e t(org.xmlpull.v1.XmlPullParser r21, lb.e r22, java.util.HashMap r23, lb.c r24) throws eb.g, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.d.t(org.xmlpull.v1.XmlPullParser, lb.e, java.util.HashMap, lb.c):lb.e");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04bd  */
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
    public static lb.g u(org.xmlpull.v1.XmlPullParser r18, lb.g r19) {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.d.u(org.xmlpull.v1.XmlPullParser, lb.g):lb.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long v(java.lang.String r13, lb.c r14) throws eb.g, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.d.v(java.lang.String, lb.c):long");
    }

    public static i0 w(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strT = qb.b.t(xmlPullParser, "extent");
        if (strT == null) {
            return null;
        }
        Matcher matcher = f15090t.matcher(strT);
        if (!matcher.matches()) {
            e0.p("TtmlDecoder", strT.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(strT) : new String("Ignoring non-pixel tts extent: "));
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
            e0.p("TtmlDecoder", strT.length() != 0 ? "Ignoring malformed tts extent: ".concat(strT) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // eb.c
    public final eb.e f(byte[] bArr, int i10, boolean z10) throws XmlPullParserException, eb.g, NumberFormatException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f15094n.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            i0 i0VarW = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            c cVar = f15092v;
            l lVar = f15093w;
            int i11 = 0;
            c cVarR = cVar;
            cj.a aVar = null;
            l lVarP = lVar;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                e eVar = (e) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            cVarR = r(xmlPullParserNewPullParser);
                            lVarP = p(xmlPullParserNewPullParser, lVar);
                            i0VarW = w(xmlPullParserNewPullParser);
                        }
                        c cVar2 = cVarR;
                        l lVar2 = lVarP;
                        if (o(name)) {
                            if ("head".equals(name)) {
                                s(xmlPullParserNewPullParser, map, lVar2, i0VarW, map2, map3);
                            } else {
                                try {
                                    e eVarT = t(xmlPullParserNewPullParser, eVar, map2, cVar2);
                                    arrayDeque.push(eVarT);
                                    if (eVar != null) {
                                        if (eVar.f15105m == null) {
                                            eVar.f15105m = new ArrayList();
                                        }
                                        eVar.f15105m.add(eVarT);
                                    }
                                } catch (eb.g e4) {
                                    qb.b.J("TtmlDecoder", "Suppressing parser error", e4);
                                }
                            }
                            lVarP = lVar2;
                            cVarR = cVar2;
                        } else {
                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                            if (strValueOf.length() != 0) {
                                "Ignoring unsupported tag: ".concat(strValueOf);
                            }
                        }
                        i11++;
                        lVarP = lVar2;
                        cVarR = cVar2;
                    } else if (eventType == 4) {
                        eVar.getClass();
                        e eVarA = e.a(xmlPullParserNewPullParser.getText());
                        if (eVar.f15105m == null) {
                            eVar.f15105m = new ArrayList();
                        }
                        eVar.f15105m.add(eVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            e eVar2 = (e) arrayDeque.peek();
                            eVar2.getClass();
                            aVar = new cj.a(eVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
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
            throw new eb.g("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new eb.g("Unable to decode source", e11);
        }
    }
}
