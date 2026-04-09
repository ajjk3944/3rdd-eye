package k5;

import a5.d0;
import android.util.Base64;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.k0;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class o implements r5.p {

    /* renamed from: a, reason: collision with root package name */
    public final l f14129a;

    /* renamed from: d, reason: collision with root package name */
    public final i f14130d;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f14107g = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f14119r = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f14126x = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f14128y = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern B = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern D = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern F = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern G = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern H = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern I = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern J = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern K = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern M = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern N = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern O = a("CAN-SKIP-DATERANGES");
    public static final Pattern P = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern Q = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern R = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern S = a("CAN-BLOCK-RELOAD");
    public static final Pattern T = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern U = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern V = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern W = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern X = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern Z = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f14101a0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f14102b0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: c0, reason: collision with root package name */
    public static final Pattern f14103c0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f14104d0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f14105e0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f14106f0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f14108g0 = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f14109h0 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f14110i0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f14111j0 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f14112k0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f14113l0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f14114m0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f14115n0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f14116o0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f14117p0 = a("AUTOSELECT");

    /* renamed from: q0, reason: collision with root package name */
    public static final Pattern f14118q0 = a("DEFAULT");

    /* renamed from: r0, reason: collision with root package name */
    public static final Pattern f14120r0 = a("FORCED");

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f14121s0 = a("INDEPENDENT");

    /* renamed from: t0, reason: collision with root package name */
    public static final Pattern f14122t0 = a("GAP");

    /* renamed from: u0, reason: collision with root package name */
    public static final Pattern f14123u0 = a("PRECISE");

    /* renamed from: v0, reason: collision with root package name */
    public static final Pattern f14124v0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: w0, reason: collision with root package name */
    public static final Pattern f14125w0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: x0, reason: collision with root package name */
    public static final Pattern f14127x0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.f14129a = lVar;
        this.f14130d = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData b(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i10];
            schemeDataArr2[i10] = new DrmInitData.SchemeData(schemeData.f1545d, schemeData.f1546g, schemeData.f1547r, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    public static DrmInitData.SchemeData c(String str, String str2, HashMap map) throws k0 {
        String strI = i(str, f14106f0, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f14108g0;
        if (zEquals) {
            String strJ = j(str, pattern, map);
            return new DrmInitData.SchemeData(androidx.media3.common.j.f1704d, null, "video/mp4", Base64.decode(strJ.substring(strJ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = androidx.media3.common.j.f1704d;
            int i10 = d0.f105a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(ne.g.f17524c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strJ2 = j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strJ2.substring(strJ2.indexOf(44)), 0);
        UUID uuid2 = androidx.media3.common.j.f1705e;
        return new DrmInitData.SchemeData(uuid2, null, "video/mp4", l6.n.a(uuid2, null, bArrDecode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k5.i d(k5.l r110, k5.i r111, db.o r112, java.lang.String r113) throws androidx.media3.common.k0, java.lang.NumberFormatException, k5.n {
        /*
            Method dump skipped, instructions count: 2215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.o.d(k5.l, k5.i, db.o, java.lang.String):k5.i");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0376  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k5.l e(db.o r36, java.lang.String r37) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.o.e(db.o, java.lang.String):k5.l");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) throws k0 {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        throw k0.b(null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String k(String str, Map map) {
        Matcher matcher = f14127x0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0099, TryCatch #3 {all -> 0x0099, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0083, B:45:0x009c, B:47:0x00a4, B:49:0x00ac, B:51:0x00b4, B:53:0x00bc, B:55:0x00c4, B:57:0x00cc, B:59:0x00d4, B:62:0x00dd, B:63:0x00e1, B:71:0x0107, B:72:0x010d, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:86:0x000f }] */
    @Override // r5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object parse(android.net.Uri r7, java.io.InputStream r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.o.parse(android.net.Uri, java.io.InputStream):java.lang.Object");
    }
}
