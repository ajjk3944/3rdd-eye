package nb;

import android.text.TextUtils;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f17482a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f17483b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f17484c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f17485d;

    static {
        HashMap map = new HashMap();
        h0.b.z(255, 255, 255, map, "white");
        h0.b.z(0, 255, 0, map, "lime");
        h0.b.z(0, 255, 255, map, "cyan");
        h0.b.z(255, 0, 0, map, "red");
        h0.b.z(255, 255, 0, map, "yellow");
        h0.b.z(255, 0, 255, map, "magenta");
        h0.b.z(0, 0, 255, map, "blue");
        h0.b.z(0, 0, 0, map, "black");
        f17484c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        h0.b.z(255, 255, 255, map2, "bg_white");
        h0.b.z(0, 255, 0, map2, "bg_lime");
        h0.b.z(0, 255, 255, map2, "bg_cyan");
        h0.b.z(255, 0, 0, map2, "bg_red");
        h0.b.z(255, 255, 0, map2, "bg_yellow");
        h0.b.z(255, 0, 255, map2, "bg_magenta");
        h0.b.z(0, 0, 255, map2, "bg_blue");
        h0.b.z(0, 0, 0, map2, "bg_black");
        f17485d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r19, nb.e r20, java.util.List r21, android.text.SpannableStringBuilder r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.h.a(java.lang.String, nb.e, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = (b) list.get(i10);
            String str2 = eVar.f17467a;
            Set set = eVar.f17470d;
            String str3 = eVar.f17469c;
            if (bVar.f17446a.isEmpty() && bVar.f17447b.isEmpty() && bVar.f17448c.isEmpty() && bVar.f17449d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = b.a(bVar.f17449d, b.a(bVar.f17447b, b.a(bVar.f17446a, 0, 1073741824, str), 2, str2), 4, str3);
                size = (iA == -1 || !set.containsAll(bVar.f17448c)) ? 0 : iA + (bVar.f17448c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new f(size, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList arrayListB = b(list, str, eVar);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            int i11 = ((f) arrayListB.get(i10)).f17472d.f17459p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, fb.f fVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            gVar.f17473a = j.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            gVar.f17474b = j.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, gVar);
            StringBuilder sb2 = new StringBuilder();
            String strE = fVar.e();
            while (!TextUtils.isEmpty(strE)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strE.trim());
                strE = fVar.e();
            }
            gVar.f17475c = f(str, sb2.toString(), arrayList);
            return new c(gVar.a().a(), gVar.f17473a, gVar.f17474b);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(matcher.group());
            e0.p("WebvttCueParser", strValueOf.length() != 0 ? "Skipping cue with bad header: ".concat(strValueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r18, nb.g r19) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.h.e(java.lang.String, nb.g):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.h.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, g gVar) {
        String strSubstring;
        int i10;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            i10 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    e0.p("WebvttCueParser", strSubstring.length() != 0 ? "Invalid anchor value: ".concat(strSubstring) : new String("Invalid anchor value: "));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f17479g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            gVar.f17477e = j.a(str);
            gVar.f17478f = 0;
        } else {
            gVar.f17477e = Integer.parseInt(str);
            gVar.f17478f = 1;
        }
    }
}
