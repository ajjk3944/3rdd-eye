package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o11;
import com.yandex.mobile.ads.impl.xj0;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
final class tk2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f33661a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f33662b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f33663c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static o11 a(String str) throws IOException {
        try {
            return b(str);
        } catch (yf1 | NumberFormatException | XmlPullParserException unused) {
            rs0.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static o11 b(String str) throws XmlPullParserException, IOException, NumberFormatException {
        long j4;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!sk2.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw yf1.a("Couldn't find xmp metadata", (Exception) null);
        }
        xj0<o11.a> xj0VarH = xj0.h();
        long j10 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (sk2.c(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f33661a;
                int i = 0;
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break loop0;
                    }
                    String strA = sk2.a(xmlPullParserNewPullParser, strArr[i10]);
                    if (strA == null) {
                        i10++;
                    } else if (Integer.parseInt(strA) == 1) {
                        String[] strArr2 = f33662b;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 4) {
                                break;
                            }
                            String strA2 = sk2.a(xmlPullParserNewPullParser, strArr2[i11]);
                            if (strA2 != null) {
                                j4 = Long.parseLong(strA2);
                                if (j4 == -1) {
                                    break;
                                }
                            } else {
                                i11++;
                            }
                        }
                        j4 = -9223372036854775807L;
                        String[] strArr3 = f33663c;
                        while (true) {
                            if (i >= 2) {
                                xj0VarH = xj0.h();
                                break;
                            }
                            String strA3 = sk2.a(xmlPullParserNewPullParser, strArr3[i]);
                            if (strA3 != null) {
                                xj0VarH = xj0.a(new o11.a("image/jpeg", 0L, 0L), new o11.a("video/mp4", Long.parseLong(strA3), 0L));
                                break;
                            }
                            i++;
                        }
                        j10 = j4;
                    }
                }
                return null;
            }
            if (sk2.c(xmlPullParserNewPullParser, "Container:Directory")) {
                xj0VarH = a(xmlPullParserNewPullParser, "Container", "Item");
            } else if (sk2.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                xj0VarH = a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!sk2.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (xj0VarH.isEmpty()) {
            return null;
        }
        return new o11(j10, xj0VarH);
    }

    private static xj0<o11.a> a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = xj0.f35328d;
        xj0.a aVar = new xj0.a();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (sk2.c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = sk2.a(xmlPullParser, strConcat3);
                String strA2 = sk2.a(xmlPullParser, strConcat4);
                String strA3 = sk2.a(xmlPullParser, strConcat5);
                String strA4 = sk2.a(xmlPullParser, strConcat6);
                if (strA != null && strA2 != null) {
                    aVar.b(new o11.a(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
                } else {
                    return xj0.h();
                }
            }
        } while (!sk2.b(xmlPullParser, strConcat2));
        return aVar.a();
    }
}
