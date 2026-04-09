package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class pp1 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str) {
        return "audio".equals(k(str));
    }

    public static boolean b(String str) {
        return "video".equals(k(str));
    }

    public static boolean c(String str) {
        return "image".equals(k(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean d(String str, String str2) {
        tg0 tg0VarJ;
        int iB;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                }
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm") || str2 == null || (tg0VarJ = j(str2)) == null || (iB = tg0VarJ.b()) == 0 || iB == 16) {
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                }
                break;
        }
        return false;
    }

    public static boolean e(String str, String str2) {
        String strF;
        tg0 tg0VarJ;
        String string = null;
        if (str != null) {
            String str3 = v23.a;
            String[] strArrSplit = TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
            StringBuilder sb = new StringBuilder();
            for (String str4 : strArrSplit) {
                if (str4 == null) {
                    strF = null;
                } else {
                    String strD = um.D(str4.trim());
                    if (strD.startsWith("avc1") || strD.startsWith("avc3")) {
                        strF = "video/avc";
                    } else if (strD.startsWith("hev1") || strD.startsWith("hvc1")) {
                        strF = "video/hevc";
                    } else if (strD.startsWith("dvav") || strD.startsWith("dva1") || strD.startsWith("dvhe") || strD.startsWith("dvh1")) {
                        strF = "video/dolby-vision";
                    } else if (strD.startsWith("av01")) {
                        strF = "video/av01";
                    } else if (strD.startsWith("vp9") || strD.startsWith("vp09")) {
                        strF = "video/x-vnd.on2.vp9";
                    } else if (strD.startsWith("vp8") || strD.startsWith("vp08")) {
                        strF = "video/x-vnd.on2.vp8";
                    } else if (strD.startsWith("mp4a")) {
                        strF = (!strD.startsWith("mp4a.") || (tg0VarJ = j(strD)) == null) ? null : f(tg0VarJ.a);
                        if (strF == null) {
                            strF = "audio/mp4a-latm";
                        }
                    } else if (strD.startsWith("mha1")) {
                        strF = "audio/mha1";
                    } else if (strD.startsWith("mhm1")) {
                        strF = "audio/mhm1";
                    } else if (strD.startsWith("ac-3") || strD.startsWith("dac3")) {
                        strF = "audio/ac3";
                    } else if (strD.startsWith("ec-3") || strD.startsWith("dec3")) {
                        strF = "audio/eac3";
                    } else if (strD.startsWith("ec+3")) {
                        strF = "audio/eac3-joc";
                    } else if (strD.startsWith("ac-4") || strD.startsWith("dac4")) {
                        strF = "audio/ac4";
                    } else if (strD.startsWith("dtsc")) {
                        strF = "audio/vnd.dts";
                    } else if (strD.startsWith("dtse")) {
                        strF = "audio/vnd.dts.hd;profile=lbr";
                    } else if (strD.startsWith("dtsh") || strD.startsWith("dtsl")) {
                        strF = "audio/vnd.dts.hd";
                    } else if (strD.startsWith("dtsx")) {
                        strF = "audio/vnd.dts.uhd;profile=p2";
                    } else if (strD.startsWith("opus")) {
                        strF = "audio/opus";
                    } else if (strD.startsWith("vorbis")) {
                        strF = "audio/vorbis";
                    } else if (strD.startsWith("flac")) {
                        strF = "audio/flac";
                    } else if (strD.startsWith("stpp")) {
                        strF = "application/ttml+xml";
                    } else if (strD.startsWith("wvtt")) {
                        strF = "text/vtt";
                    } else if (strD.contains("cea708")) {
                        strF = "application/cea-708";
                    } else if (strD.contains("eia608") || strD.contains("cea608")) {
                        strF = "application/cea-608";
                    } else {
                        ArrayList arrayList = a;
                        if (arrayList.size() > 0) {
                            arrayList.get(0).getClass();
                            throw new ClassCastException();
                        }
                        strF = null;
                    }
                }
                if (str2.equals(strF)) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str4);
                }
            }
            if (sb.length() > 0) {
                string = sb.toString();
            }
        }
        return string != null;
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if ("text".equals(k(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (c(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = r3.hashCode()
            r1 = 8
            r2 = 0
            switch(r0) {
                case -2123537834: goto L8a;
                case -1365340241: goto L81;
                case -1095064472: goto L77;
                case -53558318: goto L60;
                case 187078296: goto L56;
                case 187078297: goto L4b;
                case 550520934: goto L40;
                case 1504578661: goto L36;
                case 1504831518: goto L2b;
                case 1504891608: goto L20;
                case 1505942594: goto L17;
                case 1556697186: goto Lc;
                default: goto La;
            }
        La:
            goto L95
        Lc:
            java.lang.String r4 = "audio/true-hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 14
            return r3
        L17:
            java.lang.String r4 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            return r1
        L20:
            java.lang.String r4 = "audio/opus"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 20
            return r3
        L2b:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 9
            return r3
        L36:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 6
            return r3
        L40:
            java.lang.String r4 = "audio/vnd.dts.uhd;profile=p2"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 30
            return r3
        L4b:
            java.lang.String r4 = "audio/ac4"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 17
            return r3
        L56:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 5
            return r3
        L60:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L95
            if (r4 != 0) goto L6b
            return r2
        L6b:
            tg0 r3 = j(r4)
            if (r3 != 0) goto L72
            return r2
        L72:
            int r3 = r3.b()
            return r3
        L77:
            java.lang.String r4 = "audio/vnd.dts"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 7
            return r3
        L81:
            java.lang.String r4 = "audio/vnd.dts.hd;profile=lbr"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            return r1
        L8a:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 18
            return r3
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp1.h(java.lang.String, java.lang.String):int");
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        String strD = um.D(str);
        switch (strD.hashCode()) {
            case -1833600100:
                return strD.equals("video/x-mvhevc") ? "video/mv-hevc" : strD;
            case -1007807498:
                return strD.equals("audio/x-flac") ? "audio/flac" : strD;
            case -979095690:
                return strD.equals("application/x-mpegurl") ? "application/x-mpegURL" : strD;
            case -586683234:
                return strD.equals("audio/x-wav") ? "audio/wav" : strD;
            case -432836268:
                return strD.equals("audio/mpeg-l1") ? "audio/mpeg-L1" : strD;
            case -432836267:
                return strD.equals("audio/mpeg-l2") ? "audio/mpeg-L2" : strD;
            case 187090231:
                return strD.equals("audio/mp3") ? "audio/mpeg" : strD;
            default:
                return strD;
        }
    }

    public static tg0 j(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new tg0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String k(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
