package androidx.media3.exoplayer.dash.manifest;

import a5.a;
import a5.d0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.j;
import androidx.media3.common.j0;
import androidx.media3.common.k0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import h5.b;
import h5.c;
import h5.d;
import h5.e;
import h5.f;
import h5.g;
import h5.h;
import h5.i;
import h5.k;
import h5.m;
import h5.n;
import h5.o;
import h5.s;
import h5.t;
import h5.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oe.f0;
import oe.h0;
import oe.u0;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import r5.p;
import xu.l;

/* loaded from: classes.dex */
public class DashManifestParser extends DefaultHandler implements p {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    private long addSegmentTimelineElementsToList(List<h5.p> list, long j, long j7, int i10, long j10) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = d0.f105a;
            i11 = (int) ((((j10 - j) + j7) - 1) / j7);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            list.add(buildSegmentTimelineElement(j, j7));
            j += j7;
        }
        return j;
    }

    private static int checkContentTypeConsistency(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        a.i(i10 == i11);
        return i10;
    }

    private static String checkLanguageConsistency(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        a.i(str.equals(str2));
        return str;
    }

    private static void fillInClearKeyInformation(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i10);
            if (j.f1703c.equals(schemeData.f1545d) && (str = schemeData.f1546g) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i11);
            if (j.f1702b.equals(schemeData2.f1545d) && schemeData2.f1546g == null) {
                arrayList.set(i11, new DrmInitData.SchemeData(j.f1703c, str, schemeData2.f1547r, schemeData2.f1548x));
            }
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (schemeData.f1548x == null) {
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList.size()) {
                        DrmInitData.SchemeData schemeData2 = arrayList.get(i10);
                        if (schemeData2.f1548x != null && schemeData.f1548x == null) {
                            UUID uuid = schemeData.f1545d;
                            schemeData2.getClass();
                            UUID uuid2 = j.f1701a;
                            UUID uuid3 = schemeData2.f1545d;
                            if (uuid2.equals(uuid3) || uuid.equals(uuid3)) {
                                arrayList.remove(size);
                                break;
                            }
                        }
                        i10++;
                    }
                }
            }
        }
    }

    private static long getFinalAvailabilityTimeOffset(long j, long j7) {
        if (j7 != -9223372036854775807L) {
            j = j7;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    private static String getSampleMimeType(String str, String str2) {
        int i10 = 0;
        if (j0.h(str)) {
            if (str2 == null) {
                return null;
            }
            String[] strArrO = d0.O(str2);
            int length = strArrO.length;
            while (i10 < length) {
                String strC = j0.c(strArrO[i10]);
                if (strC != null && j0.h(strC)) {
                    return strC;
                }
                i10++;
            }
            return null;
        }
        if (!j0.j(str)) {
            if (j0.i(str) || "image".equals(j0.f(str))) {
                return str;
            }
            if (!"application/mp4".equals(str)) {
                return null;
            }
            String strC2 = j0.c(str2);
            return "text/vtt".equals(strC2) ? "application/x-mp4-vtt" : strC2;
        }
        if (str2 == null) {
            return null;
        }
        String[] strArrO2 = d0.O(str2);
        int length2 = strArrO2.length;
        while (i10 < length2) {
            String strC3 = j0.c(strArrO2[i10]);
            if (strC3 != null && j0.j(strC3)) {
                return strC3;
            }
            i10++;
        }
        return null;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    public static int parseCea608AccessibilityChannel(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f9925a;
            String str2 = eVar.f9926b;
            if ("urn:scte:dash:cc:cea-608:2015".equals(str) && str2 != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str2);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                a.B(TAG, "Unable to parse CEA-608 channel number from: " + str2);
            }
        }
        return -1;
    }

    public static int parseCea708AccessibilityChannel(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f9925a;
            String str2 = eVar.f9926b;
            if ("urn:scte:dash:cc:cea-708:2015".equals(str) && str2 != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str2);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                a.B(TAG, "Unable to parse CEA-708 service block number from: " + str2);
            }
        }
        return -1;
    }

    public static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) throws k0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : d0.J(attributeValue);
    }

    public static e parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", null);
        String string3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!a.u(xmlPullParser, str));
        return new e(string, string2, string3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r4 = r4.getAttributeValue(r0, r1)
            r0 = -1
            if (r4 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r4 = xu.l.a0(r4)
            r4.getClass()
            int r1 = r4.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case 1596796: goto L3e;
                case 2937391: goto L33;
                case 3094035: goto L28;
                case 3133436: goto L1d;
                default: goto L1b;
            }
        L1b:
            r4 = r0
            goto L48
        L1d:
            java.lang.String r1 = "fa01"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L26
            goto L1b
        L26:
            r4 = 3
            goto L48
        L28:
            java.lang.String r1 = "f801"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L31
            goto L1b
        L31:
            r4 = r2
            goto L48
        L33:
            java.lang.String r1 = "a000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3c
            goto L1b
        L3c:
            r4 = r3
            goto L48
        L3e:
            java.lang.String r1 = "4000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L47
            goto L1b
        L47:
            r4 = 0
        L48:
            switch(r4) {
                case 0: goto L52;
                case 1: goto L51;
                case 2: goto L4f;
                case 3: goto L4c;
                default: goto L4b;
            }
        L4b:
            return r0
        L4c:
            r4 = 8
            return r4
        L4f:
            r4 = 6
            return r4
        L51:
            return r2
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser):int");
    }

    public static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int i10 = parseInt(xmlPullParser, "value", -1);
        if (i10 <= 0 || i10 >= 33) {
            return -1;
        }
        return i10;
    }

    public static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    public static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = d0.f111g.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d6 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d10 = d6 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d11 = d10 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d12 = d11 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d13 = d12 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j7 = (long) ((d13 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j7 : j7;
    }

    public static String parseEac3SupplementalProperties(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f9925a;
            String str2 = eVar.f9926b;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(str2)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(str2)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float parseFloat(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    public static float parseFrameRate(XmlPullParser xmlPullParser, float f10) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
            if (matcher.matches()) {
                int i10 = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i10 / Integer.parseInt(r2) : i10;
            }
        }
        return f10;
    }

    public static int parseInt(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    public static long parseLastSegmentNumberSupplementalProperty(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (l.o("http://dashif.org/guidelines/last-segment-number", eVar.f9925a)) {
                return Long.parseLong(eVar.f9926b);
            }
        }
        return -1L;
    }

    public static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int i10 = parseInt(xmlPullParser, "value", -1);
        if (i10 >= 0) {
            int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
        }
        return -1;
    }

    public static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String parseText(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!a.u(xmlPullParser, str));
        return text;
    }

    public h5.a buildAdaptationSet(int i10, int i11, List<h5.l> list, List<e> list2, List<e> list3, List<e> list4) {
        return new h5.a(i10, i11, list, list2, list3, list4);
    }

    public EventMessage buildEvent(String str, String str2, long j, long j7, byte[] bArr) {
        return new EventMessage(str, str2, j7, j, bArr);
    }

    public f buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new f(str, str2, jArr, eventMessageArr);
    }

    public r buildFormat(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<e> list, List<e> list2, String str4, List<e> list3, List<e> list4) {
        String str5 = str4;
        String sampleMimeType = getSampleMimeType(str2, str5);
        if ("audio/eac3".equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if ("audio/eac3-joc".equals(sampleMimeType)) {
                str5 = "ec+3";
            }
        }
        int selectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int roleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> tileCountFromProperties = parseTileCountFromProperties(list3);
        q qVar = new q();
        qVar.f1734a = str;
        qVar.j = str2;
        qVar.k = sampleMimeType;
        qVar.f1741h = str5;
        qVar.f1740g = i14;
        qVar.f1737d = selectionFlagsFromRoleDescriptors;
        qVar.f1738e = roleFlagsFromRoleDescriptors;
        qVar.f1736c = str3;
        int cea708AccessibilityChannel = -1;
        qVar.D = tileCountFromProperties != null ? ((Integer) tileCountFromProperties.first).intValue() : -1;
        qVar.E = tileCountFromProperties != null ? ((Integer) tileCountFromProperties.second).intValue() : -1;
        if (j0.j(sampleMimeType)) {
            qVar.f1747p = i10;
            qVar.f1748q = i11;
            qVar.f1749r = f10;
        } else if (j0.h(sampleMimeType)) {
            qVar.f1755x = i12;
            qVar.f1756y = i13;
        } else if (j0.i(sampleMimeType)) {
            if ("application/cea-608".equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea608AccessibilityChannel(list2);
            } else if ("application/cea-708".equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea708AccessibilityChannel(list2);
            }
            qVar.C = cea708AccessibilityChannel;
        } else if ("image".equals(j0.f(sampleMimeType))) {
            qVar.f1747p = i10;
            qVar.f1748q = i11;
        }
        return new r(qVar);
    }

    public c buildMediaPresentationDescription(long j, long j7, long j10, boolean z10, long j11, long j12, long j13, long j14, h hVar, u uVar, s sVar, Uri uri, List<g> list) {
        return new c(j, j7, j10, z10, j11, j12, j13, j14, hVar, uVar, sVar, uri, list);
    }

    public g buildPeriod(String str, long j, List<h5.a> list, List<f> list2, e eVar) {
        return new g(str, j, list, list2);
    }

    public i buildRangedUri(String str, long j, long j7) {
        return new i(str, j, j7);
    }

    public h5.l buildRepresentation(d dVar, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<e> arrayList2) {
        q qVarA = dVar.f9919a.a();
        if (str != null) {
            qVarA.f1735b = str;
        }
        String str3 = dVar.f9922d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList arrayList3 = dVar.f9923e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            qVarA.f1745n = new DrmInitData(str2, arrayList3);
        }
        ArrayList arrayList4 = dVar.f9924f;
        arrayList4.addAll(arrayList2);
        r rVar = new r(qVarA);
        h0 h0Var = dVar.f9920b;
        h5.r rVar2 = dVar.f9921c;
        if (rVar2 instanceof h5.q) {
            return new k(rVar, h0Var, (h5.q) rVar2, arrayList4);
        }
        if (rVar2 instanceof m) {
            return new h5.j(rVar, h0Var, (m) rVar2, arrayList4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public n buildSegmentList(i iVar, long j, long j7, long j10, long j11, List<h5.p> list, long j12, List<i> list2, long j13, long j14) {
        return new n(iVar, j, j7, j10, j11, list, j12, list2, d0.G(j13), d0.G(j14));
    }

    public o buildSegmentTemplate(i iVar, long j, long j7, long j10, long j11, long j12, List<h5.p> list, long j13, t tVar, t tVar2, long j14, long j15) {
        return new o(iVar, j, j7, j10, j11, j12, list, j13, tVar, tVar2, d0.G(j14), d0.G(j15));
    }

    public h5.p buildSegmentTimelineElement(long j, long j7) {
        return new h5.p(j, j7);
    }

    public h5.q buildSingleSegmentBase(i iVar, long j, long j7, long j10, long j11) {
        return new h5.q(iVar, j, j7, j10, j11);
    }

    public u buildUtcTimingElement(String str, String str2) {
        return new u(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x036a A[LOOP:0: B:3:0x0090->B:74:0x036a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0324 A[EDGE_INSN: B:75:0x0324->B:68:0x0324 BREAK  A[LOOP:0: B:3:0x0090->B:74:0x036a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h5.a parseAdaptationSet(org.xmlpull.v1.XmlPullParser r44, java.util.List<h5.b> r45, h5.r r46, long r47, long r49, long r51, long r53, long r55, boolean r57) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseAdaptationSet(org.xmlpull.v1.XmlPullParser, java.util.List, h5.r, long, long, long, long, long, boolean):h5.a");
    }

    public void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int parseAudioChannelConfiguration(org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = parseString(r4, r0, r1)
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -2128649360: goto L56;
                case -1352850286: goto L4b;
                case -1138141449: goto L40;
                case -986633423: goto L35;
                case -79006963: goto L2a;
                case 312179081: goto L1f;
                case 2036691300: goto L14;
                default: goto L12;
            }
        L12:
            r0 = r2
            goto L60
        L14:
            java.lang.String r1 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L12
        L1d:
            r0 = 6
            goto L60
        L1f:
            java.lang.String r1 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            goto L12
        L28:
            r0 = 5
            goto L60
        L2a:
            java.lang.String r1 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L33
            goto L12
        L33:
            r0 = 4
            goto L60
        L35:
            java.lang.String r1 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L12
        L3e:
            r0 = 3
            goto L60
        L40:
            java.lang.String r1 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L49
            goto L12
        L49:
            r0 = 2
            goto L60
        L4b:
            java.lang.String r1 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L54
            goto L12
        L54:
            r0 = 1
            goto L60
        L56:
            java.lang.String r1 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5f
            goto L12
        L5f:
            r0 = 0
        L60:
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L73;
                case 2: goto L6e;
                case 3: goto L69;
                case 4: goto L7a;
                case 5: goto L64;
                case 6: goto L6e;
                default: goto L63;
            }
        L63:
            goto L7e
        L64:
            int r2 = parseDtsxChannelConfiguration(r4)
            goto L7e
        L69:
            int r2 = parseMpegChannelConfiguration(r4)
            goto L7e
        L6e:
            int r2 = parseDolbyChannelConfiguration(r4)
            goto L7e
        L73:
            java.lang.String r0 = "value"
            int r2 = parseInt(r4, r0, r2)
            goto L7e
        L7a:
            int r2 = parseDtsChannelConfiguration(r4)
        L7e:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = a5.a.u(r4, r0)
            if (r0 == 0) goto L7e
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseAudioChannelConfiguration(org.xmlpull.v1.XmlPullParser):int");
    }

    public long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List<b> parseBaseUrl(XmlPullParser xmlPullParser, List<b> list, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = parseText(xmlPullParser, "BaseURL");
        if (text != null && a.s(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return oe.s.o(new b(text, i10, i11, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = list.get(i12);
            String strY = a.y(bVar.f9904a, text);
            String str = attributeValue3 == null ? strY : attributeValue3;
            if (z10) {
                i10 = bVar.f9906c;
                i11 = bVar.f9907d;
                str = bVar.f9905b;
            }
            arrayList.add(new b(strY, i10, i11, str));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0153  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<java.lang.String, androidx.media3.common.DrmInitData.SchemeData> parseContentProtection(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseContentProtection(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, long j7, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        long j10 = parseLong(xmlPullParser, "id", 0L);
        long j11 = parseLong(xmlPullParser, "duration", -9223372036854775807L);
        long j12 = parseLong(xmlPullParser, "presentationTime", 0L);
        long jM = d0.M(j11, 1000L, j);
        long jM2 = d0.M(j12 - j7, 1000000L, j);
        String string = parseString(xmlPullParser, "messageData", null);
        byte[] eventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jM2);
        if (string != null) {
            eventObject = string.getBytes(ne.g.f17524c);
        }
        return Pair.create(lValueOf, buildEvent(str, str2, j10, jM, eventObject));
    }

    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, ne.g.f17524c.name());
        xmlPullParser.nextToken();
        while (!a.u(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public f parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", "");
        long j7 = parseLong(xmlPullParser, "timescale", 1L);
        long j10 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (a.v(xmlPullParser, "Event")) {
                j = j7;
                str = string2;
                str2 = string;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(parseEvent(xmlPullParser2, str2, str, j, j10, byteArrayOutputStream));
            } else {
                j = j7;
                str = string2;
                str2 = string;
                xmlPullParser2 = xmlPullParser;
                maybeSkipTag(xmlPullParser2);
            }
            if (a.u(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            string = str2;
            string2 = str;
            j7 = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            eventMessageArr[i10] = (EventMessage) pair.second;
        }
        return buildEventStream(str2, str, j, jArr, eventMessageArr);
    }

    public i parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", "range");
    }

    public String parseLabel(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return parseText(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01dd A[LOOP:0: B:24:0x00a5->B:81:0x01dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0199 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h5.c parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser r41, android.net.Uri r42) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser, android.net.Uri):h5.c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17 */
    public Pair<g, Long> parsePeriod(XmlPullParser xmlPullParser, List<b> list, long j, long j7, long j10, long j11, boolean z10) throws XmlPullParserException, IOException, NumberFormatException {
        List<b> list2;
        long availabilityTimeOffsetUs;
        h5.r rVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j12;
        Object obj;
        long j13;
        XmlPullParser xmlPullParser2;
        long j14;
        long j15;
        h5.r segmentTemplate;
        long j16;
        e eVar;
        long j17;
        h5.r rVar2;
        boolean z11;
        long j18;
        List<b> list3;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        long duration = parseDuration(xmlPullParser3, "start", j);
        long j19 = j10 != -9223372036854775807L ? j10 + duration : -9223372036854775807L;
        long duration2 = parseDuration(xmlPullParser3, "duration", -9223372036854775807L);
        ArrayList arrayList3 = new ArrayList();
        long j20 = -9223372036854775807L;
        ArrayList arrayList4 = new ArrayList();
        boolean z12 = false;
        e descriptor = null;
        long availabilityTimeOffsetUs2 = j7;
        ArrayList arrayList5 = arrayList3;
        h5.r rVar3 = null;
        long j21 = -9223372036854775807L;
        ?? arrayList6 = new ArrayList();
        while (true) {
            xmlPullParser3.next();
            if (a.v(xmlPullParser3, "BaseURL")) {
                if (!z12) {
                    availabilityTimeOffsetUs2 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, availabilityTimeOffsetUs2);
                    z12 = true;
                }
                arrayList6.addAll(dashManifestParser.parseBaseUrl(xmlPullParser3, list, z10));
                arrayList2 = arrayList5;
                j16 = availabilityTimeOffsetUs2;
                arrayList = arrayList4;
                z11 = z12;
                j12 = j20;
                obj = null;
                j13 = duration2;
                list2 = arrayList6;
                eVar = descriptor;
                xmlPullParser2 = xmlPullParser3;
                rVar2 = rVar3;
                j18 = j21;
                j15 = j19;
            } else {
                ArrayList arrayList7 = arrayList5;
                if (a.v(xmlPullParser3, "AdaptationSet")) {
                    if (arrayList6.isEmpty()) {
                        list2 = arrayList6;
                        list3 = list;
                    } else {
                        list3 = arrayList6;
                        list2 = list3;
                    }
                    ArrayList arrayList8 = arrayList4;
                    long j22 = availabilityTimeOffsetUs2;
                    long j23 = j19;
                    long j24 = duration2;
                    h5.a adaptationSet = dashManifestParser.parseAdaptationSet(xmlPullParser3, list3, rVar3, j24, j22, j21, j23, j11, z10);
                    j19 = j23;
                    availabilityTimeOffsetUs = j21;
                    arrayList7.add(adaptationSet);
                    rVar = rVar3;
                    j13 = j24;
                    arrayList = arrayList8;
                    obj = null;
                    xmlPullParser2 = xmlPullParser3;
                    j14 = j22;
                    arrayList2 = arrayList7;
                    j12 = -9223372036854775807L;
                } else {
                    list2 = arrayList6;
                    ArrayList arrayList9 = arrayList4;
                    long j25 = availabilityTimeOffsetUs2;
                    availabilityTimeOffsetUs = j21;
                    if (a.v(xmlPullParser3, "EventStream")) {
                        arrayList9.add(parseEventStream(xmlPullParser));
                        rVar = rVar3;
                        j13 = duration2;
                        arrayList = arrayList9;
                        arrayList2 = arrayList7;
                        j12 = -9223372036854775807L;
                        obj = null;
                        xmlPullParser2 = xmlPullParser3;
                        j14 = j25;
                    } else {
                        if (a.v(xmlPullParser3, "SegmentBase")) {
                            segmentTemplate = dashManifestParser.parseSegmentBase(xmlPullParser3, null);
                            j16 = j25;
                            obj = null;
                            arrayList = arrayList9;
                            arrayList2 = arrayList7;
                            j12 = -9223372036854775807L;
                            j15 = j19;
                            j13 = duration2;
                            eVar = descriptor;
                            xmlPullParser2 = xmlPullParser3;
                        } else if (a.v(xmlPullParser3, "SegmentList")) {
                            long j26 = j19;
                            long j27 = duration2;
                            long availabilityTimeOffsetUs3 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                            arrayList = arrayList9;
                            arrayList2 = arrayList7;
                            j12 = -9223372036854775807L;
                            h5.r segmentList = dashManifestParser.parseSegmentList(xmlPullParser3, null, j26, j27, j25, availabilityTimeOffsetUs3, j11);
                            j16 = j25;
                            obj = null;
                            j15 = j26;
                            j13 = j27;
                            eVar = descriptor;
                            xmlPullParser2 = xmlPullParser3;
                            j17 = availabilityTimeOffsetUs3;
                            rVar2 = segmentList;
                            z11 = z12;
                            j18 = j17;
                        } else {
                            rVar = rVar3;
                            arrayList = arrayList9;
                            arrayList2 = arrayList7;
                            j12 = -9223372036854775807L;
                            if (a.v(xmlPullParser3, "SegmentTemplate")) {
                                availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                                f0 f0Var = h0.f19336d;
                                obj = null;
                                segmentTemplate = dashManifestParser.parseSegmentTemplate(xmlPullParser3, null, u0.f19383x, j19, duration2, j25, availabilityTimeOffsetUs, j11);
                                j13 = duration2;
                                xmlPullParser2 = xmlPullParser3;
                                j15 = j19;
                                j16 = j25;
                                eVar = descriptor;
                            } else {
                                obj = null;
                                j13 = duration2;
                                xmlPullParser2 = xmlPullParser3;
                                j14 = j25;
                                j15 = j19;
                                if (a.v(xmlPullParser2, "AssetIdentifier")) {
                                    descriptor = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser2);
                                }
                                j16 = j14;
                                eVar = descriptor;
                                j17 = availabilityTimeOffsetUs;
                                rVar2 = rVar;
                                z11 = z12;
                                j18 = j17;
                            }
                        }
                        j17 = availabilityTimeOffsetUs;
                        rVar2 = segmentTemplate;
                        z11 = z12;
                        j18 = j17;
                    }
                }
                j15 = j19;
                j16 = j14;
                eVar = descriptor;
                j17 = availabilityTimeOffsetUs;
                rVar2 = rVar;
                z11 = z12;
                j18 = j17;
            }
            if (a.u(xmlPullParser2, "Period")) {
                return Pair.create(buildPeriod(attributeValue, duration, arrayList2, arrayList, eVar), Long.valueOf(j13));
            }
            dashManifestParser = this;
            xmlPullParser3 = xmlPullParser2;
            j19 = j15;
            rVar3 = rVar2;
            j21 = j18;
            arrayList6 = list2;
            arrayList5 = arrayList2;
            descriptor = eVar;
            z12 = z11;
            duration2 = j13;
            j20 = j12;
            availabilityTimeOffsetUs2 = j16;
            arrayList4 = arrayList;
        }
    }

    public String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public h parseProgramInformation(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String string = parseString(xmlPullParser, "moreInformationURL", null);
        String string2 = parseString(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (a.v(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (a.v(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (a.v(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str = strNextText2;
            String str2 = strNextText;
            String str3 = strNextText3;
            if (a.u(xmlPullParser, "ProgramInformation")) {
                return new h(str2, str, str3, string, string2);
            }
            strNextText = str2;
            strNextText2 = str;
            strNextText3 = str3;
        }
    }

    public i parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j7 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j7 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return buildRangedUri(attributeValue, j, j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x022a A[LOOP:0: B:3:0x006c->B:57:0x022a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c7 A[EDGE_INSN: B:58:0x01c7->B:46:0x01c7 BREAK  A[LOOP:0: B:3:0x006c->B:57:0x022a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h5.d parseRepresentation(org.xmlpull.v1.XmlPullParser r33, java.util.List<h5.b> r34, java.lang.String r35, java.lang.String r36, int r37, int r38, float r39, int r40, int r41, java.lang.String r42, java.util.List<h5.e> r43, java.util.List<h5.e> r44, java.util.List<h5.e> r45, java.util.List<h5.e> r46, h5.r r47, long r48, long r50, long r52, long r54, long r56, boolean r58) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parseRepresentation(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, h5.r, long, long, long, long, long, boolean):h5.d");
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<e> list) {
        int tvaAudioPurposeCsValue;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            String str = eVar.f9925a;
            String str2 = eVar.f9926b;
            if (l.o("urn:mpeg:dash:role:2011", str)) {
                tvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(str2);
            } else if (l.o("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f9925a)) {
                tvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(str2);
            }
            i10 |= tvaAudioPurposeCsValue;
        }
        return i10;
    }

    public int parseRoleFlagsFromDashRoleScheme(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public int parseRoleFlagsFromProperties(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (l.o("http://dashif.org/guidelines/trickmode", list.get(i11).f9925a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public int parseRoleFlagsFromRoleDescriptors(List<e> list) {
        int roleFlagsFromDashRoleScheme = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (l.o("urn:mpeg:dash:role:2011", eVar.f9925a)) {
                roleFlagsFromDashRoleScheme |= parseRoleFlagsFromDashRoleScheme(eVar.f9926b);
            }
        }
        return roleFlagsFromDashRoleScheme;
    }

    public h5.q parseSegmentBase(XmlPullParser xmlPullParser, h5.q qVar) throws XmlPullParserException, NumberFormatException, IOException {
        long j = parseLong(xmlPullParser, "timescale", qVar != null ? qVar.f9964b : 1L);
        long j7 = parseLong(xmlPullParser, "presentationTimeOffset", qVar != null ? qVar.f9965c : 0L);
        long j10 = qVar != null ? qVar.f9961d : 0L;
        long j11 = qVar != null ? qVar.f9962e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
        }
        long j12 = j11;
        i initialization = qVar != null ? qVar.f9963a : null;
        while (true) {
            xmlPullParser.next();
            if (a.v(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
            i iVar = initialization;
            if (a.u(xmlPullParser, "SegmentBase")) {
                return buildSingleSegmentBase(iVar, j, j7, j10, j12);
            }
            initialization = iVar;
        }
    }

    public n parseSegmentList(XmlPullParser xmlPullParser, n nVar, long j, long j7, long j10, long j11, long j12) throws XmlPullParserException, IOException {
        long j13;
        long j14 = parseLong(xmlPullParser, "timescale", nVar != null ? nVar.f9964b : 1L);
        long j15 = parseLong(xmlPullParser, "presentationTimeOffset", nVar != null ? nVar.f9965c : 0L);
        long j16 = parseLong(xmlPullParser, "duration", nVar != null ? nVar.f9953e : -9223372036854775807L);
        long j17 = parseLong(xmlPullParser, "startNumber", nVar != null ? nVar.f9952d : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j10, j11);
        List<i> arrayList = null;
        i initialization = null;
        List<h5.p> segmentTimeline = null;
        while (true) {
            xmlPullParser.next();
            if (a.v(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
                j13 = j14;
            } else if (a.v(xmlPullParser, "SegmentTimeline")) {
                j13 = j14;
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j13, j7);
            } else {
                j13 = j14;
                if (a.v(xmlPullParser, "SegmentURL")) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(parseSegmentUrl(xmlPullParser));
                } else {
                    maybeSkipTag(xmlPullParser);
                }
            }
            if (a.u(xmlPullParser, "SegmentList")) {
                break;
            }
            j14 = j13;
        }
        if (nVar != null) {
            if (initialization == null) {
                initialization = nVar.f9963a;
            }
            if (segmentTimeline == null) {
                segmentTimeline = nVar.f9954f;
            }
            if (arrayList == null) {
                arrayList = nVar.j;
            }
        }
        return buildSegmentList(initialization, j13, j15, j17, j16, segmentTimeline, finalAvailabilityTimeOffset, arrayList, j12, j);
    }

    public o parseSegmentTemplate(XmlPullParser xmlPullParser, o oVar, List<e> list, long j, long j7, long j10, long j11, long j12) throws XmlPullParserException, IOException {
        long j13;
        DashManifestParser dashManifestParser = this;
        long j14 = parseLong(xmlPullParser, "timescale", oVar != null ? oVar.f9964b : 1L);
        long j15 = parseLong(xmlPullParser, "presentationTimeOffset", oVar != null ? oVar.f9965c : 0L);
        long j16 = parseLong(xmlPullParser, "duration", oVar != null ? oVar.f9953e : -9223372036854775807L);
        long j17 = parseLong(xmlPullParser, "startNumber", oVar != null ? oVar.f9952d : 1L);
        long lastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j10, j11);
        t urlTemplate = dashManifestParser.parseUrlTemplate(xmlPullParser, "media", oVar != null ? oVar.k : null);
        t urlTemplate2 = dashManifestParser.parseUrlTemplate(xmlPullParser, "initialization", oVar != null ? oVar.j : null);
        i initialization = null;
        List<h5.p> segmentTimeline = null;
        while (true) {
            xmlPullParser.next();
            if (a.v(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
                j13 = j14;
            } else if (a.v(xmlPullParser, "SegmentTimeline")) {
                j13 = j14;
                segmentTimeline = dashManifestParser.parseSegmentTimeline(xmlPullParser, j13, j7);
            } else {
                j13 = j14;
                maybeSkipTag(xmlPullParser);
            }
            if (a.u(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            dashManifestParser = this;
            finalAvailabilityTimeOffset = finalAvailabilityTimeOffset;
            lastSegmentNumberSupplementalProperty = lastSegmentNumberSupplementalProperty;
            j17 = j17;
            j15 = j15;
            j14 = j13;
        }
        if (oVar != null) {
            if (initialization == null) {
                initialization = oVar.f9963a;
            }
            if (segmentTimeline == null) {
                segmentTimeline = oVar.f9954f;
            }
        }
        return buildSegmentTemplate(initialization, j13, j15, j17, lastSegmentNumberSupplementalProperty, j16, segmentTimeline, finalAvailabilityTimeOffset, urlTemplate2, urlTemplate, j12, j);
    }

    public List<h5.p> parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j7) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jAddSegmentTimelineElementsToList = 0;
        long j10 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (a.v(xmlPullParser, "S")) {
                long j11 = parseLong(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    ArrayList arrayList2 = arrayList;
                    jAddSegmentTimelineElementsToList = addSegmentTimelineElementsToList(arrayList2, jAddSegmentTimelineElementsToList, j10, i10, j11);
                    arrayList = arrayList2;
                }
                if (j11 != -9223372036854775807L) {
                    jAddSegmentTimelineElementsToList = j11;
                }
                j10 = parseLong(xmlPullParser, "d", -9223372036854775807L);
                i10 = parseInt(xmlPullParser, "r", 0);
                z10 = true;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!a.u(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j10, i10, d0.M(j7, j, 1000L));
        }
        return arrayList;
    }

    public i parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    public int parseSelectionFlagsFromDashRoleScheme(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<e> list) {
        int selectionFlagsFromDashRoleScheme = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (l.o("urn:mpeg:dash:role:2011", eVar.f9925a)) {
                selectionFlagsFromDashRoleScheme |= parseSelectionFlagsFromDashRoleScheme(eVar.f9926b);
            }
        }
        return selectionFlagsFromDashRoleScheme;
    }

    public s parseServiceDescription(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        float f10 = -3.4028235E38f;
        float f11 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (a.v(xmlPullParser, "Latency")) {
                j = parseLong(xmlPullParser, "target", -9223372036854775807L);
                j7 = parseLong(xmlPullParser, "min", -9223372036854775807L);
                j10 = parseLong(xmlPullParser, "max", -9223372036854775807L);
            } else if (a.v(xmlPullParser, "PlaybackRate")) {
                f10 = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f11 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j11 = j;
            long j12 = j7;
            long j13 = j10;
            float f12 = f10;
            float f13 = f11;
            if (a.u(xmlPullParser, "ServiceDescription")) {
                return new s(j11, j12, j13, f12, f13);
            }
            j = j11;
            j7 = j12;
            j10 = j13;
            f10 = f12;
            f11 = f13;
        }
    }

    public Pair<Integer, Integer> parseTileCountFromProperties(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ((l.o("http://dashif.org/thumbnail_tile", eVar.f9925a) || l.o("http://dashif.org/guidelines/thumbnail_tile", eVar.f9925a)) && (str = eVar.f9926b) != null) {
                int i11 = d0.f105a;
                String[] strArrSplit = str.split("x", -1);
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int parseTvaAudioPurposeCsValue(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00c6. Please report as an issue. */
    public t parseUrlTemplate(XmlPullParser xmlPullParser, String str, t tVar) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return tVar;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i10 = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i10] = strArr[i10] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                strArr[i10] = strArr[i10] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i10] = w.g.j(new StringBuilder(), strArr[i10], "$");
                length += 2;
            } else {
                int i11 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i11);
                String strSubstring2 = attributeValue.substring(i11, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i10] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i10] = 2;
                            break;
                        case "Time":
                            iArr[i10] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i10] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i10] = strSubstring;
                }
                i10++;
                strArr[i10] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new t(strArr, iArr, strArr2, i10);
    }

    public u parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // r5.p
    public c parse(Uri uri, InputStream inputStream) throws XmlPullParserException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return parseMediaPresentationDescription(xmlPullParserNewPullParser, uri);
            }
            throw k0.b(null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e4) {
            throw k0.b(e4, null);
        }
    }
}
