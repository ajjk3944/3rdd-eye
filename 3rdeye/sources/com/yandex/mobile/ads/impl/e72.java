package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
import com.singular.sdk.internal.SingularParamsBase;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
public final class e72 extends jy1 {

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f26709n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f26710o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f26711p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q, reason: collision with root package name */
    static final Pattern f26712q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    static final Pattern f26713r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f26714s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f26715t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u, reason: collision with root package name */
    private static final b f26716u = new b(30.0f, 1, 1);

    /* renamed from: v, reason: collision with root package name */
    private static final a f26717v = new a(15);

    /* renamed from: m, reason: collision with root package name */
    private final XmlPullParserFactory f26718m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int f26719a;

        public a(int i) {
            this.f26719a = i;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final float f26720a;

        /* renamed from: b, reason: collision with root package name */
        final int f26721b;

        /* renamed from: c, reason: collision with root package name */
        final int f26722c;

        public b(float f10, int i, int i10) {
            this.f26720a = f10;
            this.f26721b = i;
            this.f26722c = i10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        final int f26723a;

        /* renamed from: b, reason: collision with root package name */
        final int f26724b;

        public c(int i, int i10) {
            this.f26723a = i;
            this.f26724b = i10;
        }
    }

    public e72() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f26718m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    private static i72 a(i72 i72Var) {
        return i72Var == null ? new i72() : i72Var;
    }

    private static Layout.Alignment b(String str) {
        String strB = xf.b(str);
        strB.getClass();
        switch (strB) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.jy1
    public final b32 a(byte[] bArr, int i, boolean z10) throws XmlPullParserException, NumberFormatException, IOException, d32 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f26718m.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new g72("", -3.4028235E38f, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION));
            c cVarB = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i10 = 0;
            b bVarA = f26716u;
            a aVarA = f26717v;
            j72 j72Var = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                f72 f72Var = (f72) arrayDeque.peek();
                if (i10 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarA = a(xmlPullParserNewPullParser);
                            aVarA = a(xmlPullParserNewPullParser, f26717v);
                            cVarB = b(xmlPullParserNewPullParser);
                        }
                        a aVar = aVarA;
                        b bVar = bVarA;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                a(xmlPullParserNewPullParser, map, aVar, cVarB, map2, map3);
                            } else {
                                try {
                                    f72 f72VarA = a(xmlPullParserNewPullParser, f72Var, map2, bVar);
                                    arrayDeque.push(f72VarA);
                                    if (f72Var != null) {
                                        f72Var.a(f72VarA);
                                    }
                                } catch (d32 e4) {
                                    rs0.b("TtmlDecoder", "Suppressing parser error", e4);
                                }
                            }
                            aVarA = aVar;
                            bVarA = bVar;
                        } else {
                            rs0.c("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        aVarA = aVar;
                        bVarA = bVar;
                        i10++;
                    } else if (eventType == 4) {
                        f72Var.getClass();
                        f72Var.a(f72.a(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            f72 f72Var2 = (f72) arrayDeque.peek();
                            f72Var2.getClass();
                            j72Var = new j72(f72Var2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (j72Var != null) {
                return j72Var;
            }
            throw new d32("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new d32("Unable to decode source", e11);
        }
    }

    private static c b(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strA = sk2.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f26714s.matcher(strA);
        if (!matcher.matches()) {
            rs0.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strA));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new c(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            rs0.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strA));
            return null;
        }
    }

    private static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(SingularParamsBase.Constants.PLATFORM_KEY) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) throws NumberFormatException, d32 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f26715t.matcher(attributeValue);
        if (!matcher.matches()) {
            rs0.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i10 = Integer.parseInt(strGroup2);
            if (i == 0 || i10 == 0) {
                throw new d32("Invalid cell resolution " + i + " " + i10);
            }
            return new a(i10);
        } catch (NumberFormatException unused) {
            rs0.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    private static void a(String str, i72 i72Var) throws d32 {
        Matcher matcher;
        String strGroup;
        int i = s82.f32899a;
        String[] strArrSplit = str.split("\\s+", -1);
        if (strArrSplit.length == 1) {
            matcher = f26711p.matcher(str);
        } else if (strArrSplit.length == 2) {
            matcher = f26711p.matcher(strArrSplit[1]);
            rs0.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new d32(B4.i.j(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
        }
        if (matcher.matches()) {
            strGroup = matcher.group(3);
            strGroup.getClass();
            switch (strGroup) {
                case "%":
                    i72Var.c(3);
                    break;
                case "em":
                    i72Var.c(2);
                    break;
                case "px":
                    i72Var.c(1);
                    break;
                default:
                    throw new d32(C1154e9.i("Invalid unit for fontSize: '", strGroup, "'."));
            }
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            i72Var.a(Float.parseFloat(strGroup2));
            return;
        }
        throw new d32(C1154e9.i("Invalid expression for fontSize: '", str, "'."));
    }

    private static b a(XmlPullParser xmlPullParser) throws NumberFormatException, d32 {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i10 = s82.f32899a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new d32("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        b bVar = f26716u;
        int i11 = bVar.f26721b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f26722c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(i * f10, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0266 A[LOOP:0: B:3:0x000a->B:106:0x0266, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, com.yandex.mobile.ads.impl.e72.a r22, com.yandex.mobile.ads.impl.e72.c r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e72.a(org.xmlpull.v1.XmlPullParser, java.util.HashMap, com.yandex.mobile.ads.impl.e72$a, com.yandex.mobile.ads.impl.e72$c, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.impl.f72 a(org.xmlpull.v1.XmlPullParser r23, com.yandex.mobile.ads.impl.f72 r24, java.util.HashMap r25, com.yandex.mobile.ads.impl.e72.b r26) throws java.lang.NumberFormatException, com.yandex.mobile.ads.impl.d32 {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e72.a(org.xmlpull.v1.XmlPullParser, com.yandex.mobile.ads.impl.f72, java.util.HashMap, com.yandex.mobile.ads.impl.e72$b):com.yandex.mobile.ads.impl.f72");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.impl.i72 a(org.xmlpull.v1.XmlPullParser r16, com.yandex.mobile.ads.impl.i72 r17) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e72.a(org.xmlpull.v1.XmlPullParser, com.yandex.mobile.ads.impl.i72):com.yandex.mobile.ads.impl.i72");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long a(java.lang.String r13, com.yandex.mobile.ads.impl.e72.b r14) throws java.lang.NumberFormatException, com.yandex.mobile.ads.impl.d32 {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e72.a(java.lang.String, com.yandex.mobile.ads.impl.e72$b):long");
    }
}
