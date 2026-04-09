package db;

import android.util.Base64;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.y0;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pb.p0;
import qb.v;

/* loaded from: classes.dex */
public final class p implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f7292a;

    /* renamed from: d, reason: collision with root package name */
    public final l f7293d;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f7270g = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f7282r = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f7289x = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f7291y = Pattern.compile("SUBTITLES=\"(.+?)\"");
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
    public static final Pattern f7264a0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f7265b0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: c0, reason: collision with root package name */
    public static final Pattern f7266c0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f7267d0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f7268e0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f7269f0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f7271g0 = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f7272h0 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f7273i0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f7274j0 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f7275k0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f7276l0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f7277m0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f7278n0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f7279o0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f7280p0 = a("AUTOSELECT");

    /* renamed from: q0, reason: collision with root package name */
    public static final Pattern f7281q0 = a("DEFAULT");

    /* renamed from: r0, reason: collision with root package name */
    public static final Pattern f7283r0 = a("FORCED");

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f7284s0 = a("INDEPENDENT");

    /* renamed from: t0, reason: collision with root package name */
    public static final Pattern f7285t0 = a("GAP");

    /* renamed from: u0, reason: collision with root package name */
    public static final Pattern f7286u0 = a("PRECISE");

    /* renamed from: v0, reason: collision with root package name */
    public static final Pattern f7287v0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: w0, reason: collision with root package name */
    public static final Pattern f7288w0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: x0, reason: collision with root package name */
    public static final Pattern f7290x0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public p(f fVar, l lVar) {
        this.f7292a = fVar;
        this.f7293d = lVar;
    }

    public static Pattern a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 9);
        sb2.append(str);
        sb2.append("=(NO|YES)");
        return Pattern.compile(sb2.toString());
    }

    public static DrmInitData b(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i10];
            schemeDataArr2[i10] = new DrmInitData.SchemeData(schemeData.f4100d, schemeData.f4101g, schemeData.f4102r, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    public static DrmInitData.SchemeData c(String str, String str2, HashMap map) throws y0 {
        String strI = i(str, f7269f0, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f7271g0;
        if (zEquals) {
            String strJ = j(str, pattern, map);
            return new DrmInitData.SchemeData(com.google.android.exoplayer2.h.f4169d, null, "video/mp4", Base64.decode(strJ.substring(strJ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = com.google.android.exoplayer2.h.f4169d;
            int i10 = v.f20828a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(ne.g.f17524c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strJ2 = j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strJ2.substring(strJ2.indexOf(44)), 0);
        UUID uuid2 = com.google.android.exoplayer2.h.f4170e;
        return new DrmInitData.SchemeData(uuid2, null, "video/mp4", ja.p.a(uuid2, null, bArrDecode));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static db.f d(db.o r36, java.lang.String r37) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: db.p.d(db.o, java.lang.String):db.f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0619  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static db.l e(db.f r110, db.l r111, db.o r112, java.lang.String r113) throws db.n, com.google.android.exoplayer2.y0, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2153
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: db.p.e(db.f, db.l, db.o, java.lang.String):db.l");
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

    public static long h(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return j;
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

    public static String j(String str, Pattern pattern, Map map) throws y0 {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        String strPattern = pattern.pattern();
        StringBuilder sb2 = new StringBuilder(c7.a.d(c7.a.d(19, strPattern), str));
        sb2.append("Couldn't match ");
        sb2.append(strPattern);
        sb2.append(" in ");
        sb2.append(str);
        throw y0.b(null, sb2.toString());
    }

    public static String k(String str, Map map) {
        Matcher matcher = f7290x0.matcher(str);
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x0074, TryCatch #2 {all -> 0x0074, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:9:0x0028, B:34:0x006d, B:35:0x0073, B:12:0x002f, B:14:0x0035, B:18:0x003f, B:20:0x0047, B:23:0x0054, B:25:0x005a, B:29:0x0061, B:30:0x0066, B:38:0x0077, B:40:0x007d, B:43:0x0088, B:45:0x0090, B:49:0x00a6, B:51:0x00ae, B:53:0x00b6, B:55:0x00be, B:57:0x00c6, B:59:0x00ce, B:61:0x00d6, B:63:0x00de, B:66:0x00e7, B:67:0x00eb), top: B:86:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x004e A[SYNTHETIC] */
    @Override // pb.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object parse(android.net.Uri r9, java.io.InputStream r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: db.p.parse(android.net.Uri, java.io.InputStream):java.lang.Object");
    }
}
