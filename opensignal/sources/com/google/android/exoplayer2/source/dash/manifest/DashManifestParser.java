package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import cb.a;
import cb.c;
import cb.d;
import cb.e;
import cb.f;
import cb.g;
import cb.i;
import cb.n;
import cb.o;
import cb.p;
import cb.q;
import cb.s;
import cb.t;
import cb.u;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.y0;
import g4.j;
import io.sentry.android.core.e0;
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
import pb.p0;
import qb.b;
import qb.m;
import qb.v;
import xu.l;

/* loaded from: classes.dex */
public class DashManifestParser extends DefaultHandler implements p0 {
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

    private long addSegmentTimelineElementsToList(List<p> list, long j, long j7, int i10, long j10) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = v.f20828a;
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
        b.j(i10 == i11);
        return i10;
    }

    private static String checkLanguageConsistency(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        b.j(str.equals(str2));
        return str;
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (schemeData.f4103x == null) {
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList.size()) {
                        DrmInitData.SchemeData schemeData2 = arrayList.get(i10);
                        if (schemeData2.f4103x != null && schemeData.f4103x == null) {
                            UUID uuid = schemeData.f4100d;
                            schemeData2.getClass();
                            UUID uuid2 = h.f4166a;
                            UUID uuid3 = schemeData2.f4100d;
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
        if (m.h(str)) {
            if (str2 != null) {
                String[] strArrJ = v.J(str2);
                int length = strArrJ.length;
                while (i10 < length) {
                    String strC = m.c(strArrJ[i10]);
                    if (strC != null && m.h(strC)) {
                        return strC;
                    }
                    i10++;
                }
            }
            return null;
        }
        if (m.j(str)) {
            if (str2 != null) {
                String[] strArrJ2 = v.J(str2);
                int length2 = strArrJ2.length;
                while (i10 < length2) {
                    String strC2 = m.c(strArrJ2[i10]);
                    if (strC2 != null && m.j(strC2)) {
                        return strC2;
                    }
                    i10++;
                }
            }
            return null;
        }
        if (m.i(str)) {
            if (!"application/x-rawcc".equals(str)) {
                return str;
            }
            if (str2 != null) {
                String[] strArrJ3 = v.J(str2);
                int length3 = strArrJ3.length;
                while (i10 < length3) {
                    String strC3 = m.c(strArrJ3[i10]);
                    if (strC3 != null && m.i(strC3)) {
                        return strC3;
                    }
                    i10++;
                }
            }
        } else if ("application/mp4".equals(str)) {
            String strC4 = m.c(str2);
            return "text/vtt".equals(strC4) ? "application/x-mp4-vtt" : strC4;
        }
        return null;
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
            String str = eVar.f3552a;
            String str2 = eVar.f3553b;
            if ("urn:scte:dash:cc:cea-608:2015".equals(str) && str2 != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str2);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                e0.p(TAG, str2.length() != 0 ? "Unable to parse CEA-608 channel number from: ".concat(str2) : new String("Unable to parse CEA-608 channel number from: "));
            }
        }
        return -1;
    }

    public static int parseCea708AccessibilityChannel(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f3552a;
            String str2 = eVar.f3553b;
            if ("urn:scte:dash:cc:cea-708:2015".equals(str) && str2 != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str2);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                e0.p(TAG, str2.length() != 0 ? "Unable to parse CEA-708 service block number from: ".concat(str2) : new String("Unable to parse CEA-708 service block number from: "));
            }
        }
        return -1;
    }

    public static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) throws y0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : v.E(attributeValue);
    }

    public static e parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", null);
        String string3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!b.y(xmlPullParser, str));
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = v.f20835h.matcher(attributeValue);
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
            String str = eVar.f3552a;
            String str2 = eVar.f3553b;
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
            if (l.o("http://dashif.org/guidelines/last-segment-number", eVar.f3552a)) {
                return Long.parseLong(eVar.f3553b);
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
        } while (!b.y(xmlPullParser, str));
        return text;
    }

    public a buildAdaptationSet(int i10, int i11, List<Representation> list, List<e> list2, List<e> list3, List<e> list4) {
        return new a(i10, i11, list, list2, list3, list4);
    }

    public EventMessage buildEvent(String str, String str2, long j, long j7, byte[] bArr) {
        return new EventMessage(str, str2, j7, j, bArr);
    }

    public f buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new f(str, str2, jArr, eventMessageArr);
    }

    public Format buildFormat(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<e> list, List<e> list2, String str4, List<e> list3, List<e> list4) {
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
        g0 g0Var = new g0();
        g0Var.f4142a = str;
        g0Var.j = str2;
        g0Var.k = sampleMimeType;
        g0Var.f4149h = str5;
        g0Var.f4148g = i14;
        g0Var.f4145d = selectionFlagsFromRoleDescriptors;
        g0Var.f4146e = roleFlagsFromRoleDescriptors;
        g0Var.f4144c = str3;
        if (m.j(sampleMimeType)) {
            g0Var.f4155p = i10;
            g0Var.f4156q = i11;
            g0Var.f4157r = f10;
        } else if (m.h(sampleMimeType)) {
            g0Var.f4163x = i12;
            g0Var.f4164y = i13;
        } else if (m.i(sampleMimeType)) {
            g0Var.C = "application/cea-608".equals(sampleMimeType) ? parseCea608AccessibilityChannel(list2) : "application/cea-708".equals(sampleMimeType) ? parseCea708AccessibilityChannel(list2) : -1;
        }
        return new Format(g0Var);
    }

    public c buildMediaPresentationDescription(long j, long j7, long j10, boolean z10, long j11, long j12, long j13, long j14, cb.h hVar, u uVar, s sVar, Uri uri, List<g> list) {
        return new c(j, j7, j10, z10, j11, j12, j13, j14, hVar, uVar, sVar, uri, list);
    }

    public g buildPeriod(String str, long j, List<a> list, List<f> list2, e eVar) {
        return new g(str, j, list, list2);
    }

    public i buildRangedUri(String str, long j, long j7) {
        return new i(str, j, j7);
    }

    public Representation buildRepresentation(d dVar, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<e> arrayList2) {
        g0 g0VarD = dVar.f3545a.d();
        if (str != null) {
            g0VarD.f4143b = str;
        }
        String str3 = dVar.f3548d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList arrayList3 = dVar.f3549e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            filterRedundantIncompleteSchemeDatas(arrayList3);
            g0VarD.f4153n = new DrmInitData(str2, arrayList3);
        }
        ArrayList arrayList4 = dVar.f3550f;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(dVar.f3551g, new Format(g0VarD), dVar.f3546b, dVar.f3547c, arrayList4);
    }

    public n buildSegmentList(i iVar, long j, long j7, long j10, long j11, List<p> list, long j12, List<i> list2, long j13, long j14) {
        return new n(iVar, j, j7, j10, j11, list, j12, list2, h.c(j13), h.c(j14));
    }

    public o buildSegmentTemplate(i iVar, long j, long j7, long j10, long j11, long j12, List<p> list, long j13, t tVar, t tVar2, long j14, long j15) {
        return new o(iVar, j, j7, j10, j11, j12, list, j13, tVar, tVar2, h.c(j14), h.c(j15));
    }

    public p buildSegmentTimelineElement(long j, long j7) {
        return new p(j, j7);
    }

    public q buildSingleSegmentBase(i iVar, long j, long j7, long j10, long j11) {
        return new q(iVar, j, j7, j10, j11);
    }

    public u buildUtcTimingElement(String str, String str2) {
        return new u(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x032d A[LOOP:0: B:3:0x0090->B:73:0x032d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e7 A[EDGE_INSN: B:74:0x02e7->B:67:0x02e7 BREAK  A[LOOP:0: B:3:0x0090->B:73:0x032d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cb.a parseAdaptationSet(org.xmlpull.v1.XmlPullParser r43, java.util.List<cb.b> r44, cb.r r45, long r46, long r48, long r50, long r52, long r54) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseAdaptationSet(org.xmlpull.v1.XmlPullParser, java.util.List, cb.r, long, long, long, long, long):cb.a");
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
                case -1352850286: goto L35;
                case -1138141449: goto L2a;
                case -986633423: goto L1f;
                case 2036691300: goto L14;
                default: goto L12;
            }
        L12:
            r0 = r2
            goto L3f
        L14:
            java.lang.String r1 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L12
        L1d:
            r0 = 3
            goto L3f
        L1f:
            java.lang.String r1 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            goto L12
        L28:
            r0 = 2
            goto L3f
        L2a:
            java.lang.String r1 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L33
            goto L12
        L33:
            r0 = 1
            goto L3f
        L35:
            java.lang.String r1 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L12
        L3e:
            r0 = 0
        L3f:
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L48;
                case 2: goto L43;
                case 3: goto L48;
                default: goto L42;
            }
        L42:
            goto L53
        L43:
            int r2 = parseMpegChannelConfiguration(r4)
            goto L53
        L48:
            int r2 = parseDolbyChannelConfiguration(r4)
            goto L53
        L4d:
            java.lang.String r0 = "value"
            int r2 = parseInt(r4, r0, r2)
        L53:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = qb.b.y(r4, r0)
            if (r0 == 0) goto L53
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseAudioChannelConfiguration(org.xmlpull.v1.XmlPullParser):int");
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

    public List<cb.b> parseBaseUrl(XmlPullParser xmlPullParser, List<cb.b> list) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 1;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = parseText(xmlPullParser, "BaseURL");
        if (attributeValue3 == null) {
            attributeValue3 = text;
        }
        if (text != null && b.v(text)[0] != -1) {
            return oe.s.o(new cb.b(text, i10, i11, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            cb.b bVar = list.get(i12);
            arrayList.add(new cb.b(b.F(bVar.f3530a, text), bVar.f3532c, bVar.f3533d, bVar.f3531b));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.UUID] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> parseContentProtection(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseContentProtection(org.xmlpull.v1.XmlPullParser):android.util.Pair");
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
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        long j7 = parseLong(xmlPullParser, "id", 0L);
        long j10 = parseLong(xmlPullParser, "duration", -9223372036854775807L);
        long j11 = parseLong(xmlPullParser, "presentationTime", 0L);
        long jH = v.H(j10, 1000L, j);
        long jH2 = v.H(j11, 1000000L, j);
        String string = parseString(xmlPullParser, "messageData", null);
        byte[] eventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jH2);
        if (string != null) {
            eventObject = string.getBytes(ne.g.f17524c);
        }
        return Pair.create(lValueOf, buildEvent(str, str2, j7, jH, eventObject));
    }

    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, ne.g.f17524c.name());
        xmlPullParser.nextToken();
        while (!b.y(xmlPullParser, "Event")) {
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
                case j.STRING_FIELD_NUMBER /* 5 */:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
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
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (b.z(xmlPullParser, "Event")) {
                j = j7;
                str = string2;
                str2 = string;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(parseEvent(xmlPullParser2, str2, str, j, byteArrayOutputStream));
            } else {
                j = j7;
                str = string2;
                str2 = string;
                xmlPullParser2 = xmlPullParser;
                maybeSkipTag(xmlPullParser2);
            }
            if (b.y(xmlPullParser2, "EventStream")) {
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

    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4 A[LOOP:0: B:20:0x0085->B:78:0x01b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cb.c parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser r38, cb.b r39) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser, cb.b):cb.c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    public Pair<g, Long> parsePeriod(XmlPullParser xmlPullParser, List<cb.b> list, long j, long j7, long j10, long j11) throws XmlPullParserException, IOException, NumberFormatException {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<cb.b> list2;
        long j12;
        String str;
        long j13;
        Object obj;
        o oVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j14;
        XmlPullParser xmlPullParser2;
        long j15;
        long j16;
        long j17;
        o segmentList;
        long j18;
        e eVar;
        long j19;
        List<cb.b> list3;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        long duration = parseDuration(xmlPullParser3, "start", j);
        long j20 = j10 != -9223372036854775807L ? j10 + duration : -9223372036854775807L;
        long duration2 = parseDuration(xmlPullParser3, "duration", -9223372036854775807L);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long availabilityTimeOffsetUs = j7;
        long j21 = -9223372036854775807L;
        long j22 = -9223372036854775807L;
        boolean z10 = false;
        o oVar2 = null;
        e descriptor = null;
        ?? arrayList7 = new ArrayList();
        while (true) {
            xmlPullParser3.next();
            if (b.z(xmlPullParser3, "BaseURL")) {
                if (!z10) {
                    availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, availabilityTimeOffsetUs);
                    z10 = true;
                }
                arrayList7.addAll(parseBaseUrl(xmlPullParser, list));
                j17 = availabilityTimeOffsetUs;
                obj = obj2;
                j18 = j21;
                segmentList = oVar2;
                list2 = arrayList7;
                str = attributeValue;
                j14 = j22;
                arrayList3 = arrayList5;
                j16 = duration2;
                arrayList4 = arrayList6;
                eVar = descriptor;
                xmlPullParser2 = xmlPullParser3;
            } else {
                if (b.z(xmlPullParser3, "AdaptationSet")) {
                    if (arrayList7.isEmpty()) {
                        list2 = arrayList7;
                        j19 = j21;
                        list3 = list;
                    } else {
                        list3 = arrayList7;
                        j19 = j21;
                        list2 = list3;
                    }
                    arrayList = arrayList5;
                    long j23 = duration2;
                    str = attributeValue;
                    arrayList2 = arrayList6;
                    long j24 = availabilityTimeOffsetUs;
                    j13 = j19;
                    j12 = j24;
                    duration2 = j23;
                    arrayList.add(dashManifestParser.parseAdaptationSet(xmlPullParser3, list3, oVar2, j23, j24, j19, j20, j11));
                } else {
                    arrayList = arrayList5;
                    String str2 = attributeValue;
                    arrayList2 = arrayList6;
                    long j25 = j21;
                    list2 = arrayList7;
                    j12 = availabilityTimeOffsetUs;
                    str = str2;
                    j13 = j25;
                    if (b.z(xmlPullParser3, "EventStream")) {
                        arrayList2.add(parseEventStream(xmlPullParser));
                    } else {
                        if (b.z(xmlPullParser3, "SegmentBase")) {
                            obj = null;
                            j17 = j12;
                            j18 = j13;
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            j14 = -9223372036854775807L;
                            xmlPullParser2 = xmlPullParser3;
                            segmentList = dashManifestParser.parseSegmentBase(xmlPullParser3, null);
                        } else if (b.z(xmlPullParser3, "SegmentList")) {
                            long j26 = j20;
                            long availabilityTimeOffsetUs2 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                            obj = null;
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            j14 = -9223372036854775807L;
                            j20 = j26;
                            segmentList = dashManifestParser.parseSegmentList(xmlPullParser3, null, j26, duration2, j12, availabilityTimeOffsetUs2, j11);
                            j18 = availabilityTimeOffsetUs2;
                            j17 = j12;
                            xmlPullParser2 = xmlPullParser3;
                        } else {
                            obj = null;
                            oVar = oVar2;
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            j14 = -9223372036854775807L;
                            if (b.z(xmlPullParser3, "SegmentTemplate")) {
                                long j27 = j20;
                                long availabilityTimeOffsetUs3 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                                f0 f0Var = h0.f19336d;
                                long j28 = duration2;
                                o segmentTemplate = dashManifestParser.parseSegmentTemplate(xmlPullParser3, null, u0.f19383x, j27, j28, j12, availabilityTimeOffsetUs3, j11);
                                xmlPullParser2 = xmlPullParser3;
                                j16 = j28;
                                j20 = j27;
                                j17 = j12;
                                segmentList = segmentTemplate;
                                j18 = availabilityTimeOffsetUs3;
                                eVar = descriptor;
                            } else {
                                xmlPullParser2 = xmlPullParser3;
                                j15 = j12;
                                j16 = duration2;
                                if (b.z(xmlPullParser2, "AssetIdentifier")) {
                                    descriptor = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser2);
                                }
                                j17 = j15;
                                j18 = j13;
                                eVar = descriptor;
                                segmentList = oVar;
                            }
                        }
                        j16 = duration2;
                        eVar = descriptor;
                    }
                }
                long j29 = j12;
                xmlPullParser2 = xmlPullParser3;
                j15 = j29;
                oVar = oVar2;
                j16 = duration2;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                j14 = -9223372036854775807L;
                obj = null;
                j17 = j15;
                j18 = j13;
                eVar = descriptor;
                segmentList = oVar;
            }
            if (b.y(xmlPullParser2, "Period")) {
                return Pair.create(buildPeriod(str, duration, arrayList3, arrayList4, eVar), Long.valueOf(j16));
            }
            dashManifestParser = this;
            descriptor = eVar;
            xmlPullParser3 = xmlPullParser2;
            duration2 = j16;
            oVar2 = segmentList;
            arrayList7 = list2;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            availabilityTimeOffsetUs = j17;
            j22 = j14;
            attributeValue = str;
            obj2 = obj;
            j21 = j18;
        }
    }

    public cb.h parseProgramInformation(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String string = parseString(xmlPullParser, "moreInformationURL", null);
        String string2 = parseString(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (b.z(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (b.z(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (b.z(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str = strNextText2;
            String str2 = strNextText;
            String str3 = strNextText3;
            if (b.y(xmlPullParser, "ProgramInformation")) {
                return new cb.h(str2, str, str3, string, string2);
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

    /* JADX WARN: Removed duplicated region for block: B:56:0x0202 A[LOOP:0: B:3:0x006c->B:56:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3 A[EDGE_INSN: B:57:0x01a3->B:45:0x01a3 BREAK  A[LOOP:0: B:3:0x006c->B:56:0x0202], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cb.d parseRepresentation(org.xmlpull.v1.XmlPullParser r33, java.util.List<cb.b> r34, java.lang.String r35, java.lang.String r36, int r37, int r38, float r39, int r40, int r41, java.lang.String r42, java.util.List<cb.e> r43, java.util.List<cb.e> r44, java.util.List<cb.e> r45, java.util.List<cb.e> r46, cb.r r47, long r48, long r50, long r52, long r54, long r56) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseRepresentation(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, cb.r, long, long, long, long, long):cb.d");
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<e> list) {
        int tvaAudioPurposeCsValue;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            String str = eVar.f3552a;
            String str2 = eVar.f3553b;
            if (l.o("urn:mpeg:dash:role:2011", str)) {
                tvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(str2);
            } else if (l.o("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f3552a)) {
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
            if (l.o("http://dashif.org/guidelines/trickmode", list.get(i11).f3552a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public int parseRoleFlagsFromRoleDescriptors(List<e> list) {
        int roleFlagsFromDashRoleScheme = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (l.o("urn:mpeg:dash:role:2011", eVar.f3552a)) {
                roleFlagsFromDashRoleScheme |= parseRoleFlagsFromDashRoleScheme(eVar.f3553b);
            }
        }
        return roleFlagsFromDashRoleScheme;
    }

    public q parseSegmentBase(XmlPullParser xmlPullParser, q qVar) throws XmlPullParserException, NumberFormatException, IOException {
        long j = parseLong(xmlPullParser, "timescale", qVar != null ? qVar.f3588b : 1L);
        long j7 = parseLong(xmlPullParser, "presentationTimeOffset", qVar != null ? qVar.f3589c : 0L);
        long j10 = qVar != null ? qVar.f3585d : 0L;
        long j11 = qVar != null ? qVar.f3586e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
        }
        long j12 = j11;
        i initialization = qVar != null ? qVar.f3587a : null;
        while (true) {
            xmlPullParser.next();
            if (b.z(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
            i iVar = initialization;
            if (b.y(xmlPullParser, "SegmentBase")) {
                return buildSingleSegmentBase(iVar, j, j7, j10, j12);
            }
            initialization = iVar;
        }
    }

    public n parseSegmentList(XmlPullParser xmlPullParser, n nVar, long j, long j7, long j10, long j11, long j12) throws XmlPullParserException, IOException {
        long j13;
        long j14 = parseLong(xmlPullParser, "timescale", nVar != null ? nVar.f3588b : 1L);
        long j15 = parseLong(xmlPullParser, "presentationTimeOffset", nVar != null ? nVar.f3589c : 0L);
        long j16 = parseLong(xmlPullParser, "duration", nVar != null ? nVar.f3577e : -9223372036854775807L);
        long j17 = parseLong(xmlPullParser, "startNumber", nVar != null ? nVar.f3576d : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j10, j11);
        List<i> arrayList = null;
        i initialization = null;
        List<p> segmentTimeline = null;
        while (true) {
            xmlPullParser.next();
            if (b.z(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
                j13 = j14;
            } else if (b.z(xmlPullParser, "SegmentTimeline")) {
                j13 = j14;
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j13, j7);
            } else {
                j13 = j14;
                if (b.z(xmlPullParser, "SegmentURL")) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(parseSegmentUrl(xmlPullParser));
                } else {
                    maybeSkipTag(xmlPullParser);
                }
            }
            if (b.y(xmlPullParser, "SegmentList")) {
                break;
            }
            j14 = j13;
        }
        if (nVar != null) {
            if (initialization == null) {
                initialization = nVar.f3587a;
            }
            if (segmentTimeline == null) {
                segmentTimeline = nVar.f3578f;
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
        long j14 = parseLong(xmlPullParser, "timescale", oVar != null ? oVar.f3588b : 1L);
        long j15 = parseLong(xmlPullParser, "presentationTimeOffset", oVar != null ? oVar.f3589c : 0L);
        long j16 = parseLong(xmlPullParser, "duration", oVar != null ? oVar.f3577e : -9223372036854775807L);
        long j17 = parseLong(xmlPullParser, "startNumber", oVar != null ? oVar.f3576d : 1L);
        long lastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j10, j11);
        t urlTemplate = dashManifestParser.parseUrlTemplate(xmlPullParser, "media", oVar != null ? oVar.k : null);
        t urlTemplate2 = dashManifestParser.parseUrlTemplate(xmlPullParser, "initialization", oVar != null ? oVar.j : null);
        i initialization = null;
        List<p> segmentTimeline = null;
        while (true) {
            xmlPullParser.next();
            if (b.z(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
                j13 = j14;
            } else if (b.z(xmlPullParser, "SegmentTimeline")) {
                j13 = j14;
                segmentTimeline = dashManifestParser.parseSegmentTimeline(xmlPullParser, j13, j7);
            } else {
                j13 = j14;
                maybeSkipTag(xmlPullParser);
            }
            if (b.y(xmlPullParser, "SegmentTemplate")) {
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
                initialization = oVar.f3587a;
            }
            if (segmentTimeline == null) {
                segmentTimeline = oVar.f3578f;
            }
        }
        return buildSegmentTemplate(initialization, j13, j15, j17, lastSegmentNumberSupplementalProperty, j16, segmentTimeline, finalAvailabilityTimeOffset, urlTemplate2, urlTemplate, j12, j);
    }

    public List<p> parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j7) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jAddSegmentTimelineElementsToList = 0;
        long j10 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (b.z(xmlPullParser, "S")) {
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
        } while (!b.y(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j10, i10, v.H(j7, j, 1000L));
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
        if (str.equals("forced_subtitle")) {
            return 2;
        }
        return !str.equals("main") ? 0 : 1;
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<e> list) {
        int selectionFlagsFromDashRoleScheme = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (l.o("urn:mpeg:dash:role:2011", eVar.f3552a)) {
                selectionFlagsFromDashRoleScheme |= parseSelectionFlagsFromDashRoleScheme(eVar.f3553b);
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
            if (b.z(xmlPullParser, "Latency")) {
                j = parseLong(xmlPullParser, "target", -9223372036854775807L);
                j7 = parseLong(xmlPullParser, "min", -9223372036854775807L);
                j10 = parseLong(xmlPullParser, "max", -9223372036854775807L);
            } else if (b.z(xmlPullParser, "PlaybackRate")) {
                f10 = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f11 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j11 = j;
            long j12 = j7;
            long j13 = j10;
            float f12 = f10;
            float f13 = f11;
            if (b.y(xmlPullParser, "ServiceDescription")) {
                return new s(j11, j12, j13, f12, f13);
            }
            j = j11;
            j7 = j12;
            j10 = j13;
            f10 = f12;
            f11 = f13;
        }
    }

    public int parseTvaAudioPurposeCsValue(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

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
                String strValueOf = String.valueOf(strArr[i10]);
                String strValueOf2 = String.valueOf(attributeValue.substring(length));
                strArr[i10] = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                String strValueOf3 = String.valueOf(strArr[i10]);
                String strValueOf4 = String.valueOf(attributeValue.substring(length, iIndexOf));
                strArr[i10] = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i10] = String.valueOf(strArr[i10]).concat("$");
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
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x")) {
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
                            throw new IllegalArgumentException(attributeValue.length() != 0 ? "Invalid template: ".concat(attributeValue) : new String("Invalid template: "));
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

    @Override // pb.p0
    public c parse(Uri uri, InputStream inputStream) throws XmlPullParserException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() != 2 || !"MPD".equals(xmlPullParserNewPullParser.getName())) {
                throw y0.b(null, "inputStream does not contain a valid media presentation description");
            }
            String string = uri.toString();
            return parseMediaPresentationDescription(xmlPullParserNewPullParser, new cb.b(string, 1, 1, string));
        } catch (XmlPullParserException e4) {
            throw y0.b(e4, null);
        }
    }
}
