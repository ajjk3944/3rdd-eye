package v6;

import a5.v;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f23891a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f23892b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f23893c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f23894d;

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
        f23893c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        h0.b.z(255, 255, 255, map2, "bg_white");
        h0.b.z(0, 255, 0, map2, "bg_lime");
        h0.b.z(0, 255, 255, map2, "bg_cyan");
        h0.b.z(255, 0, 0, map2, "bg_red");
        h0.b.z(255, 255, 0, map2, "bg_yellow");
        h0.b.z(255, 0, 255, map2, "bg_magenta");
        h0.b.z(0, 0, 255, map2, "bg_blue");
        h0.b.z(0, 0, 0, map2, "bg_black");
        f23894d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r17, v6.e r18, java.util.List r19, android.text.SpannableStringBuilder r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.g.a(java.lang.String, v6.e, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = (b) list.get(i10);
            String str2 = eVar.f23885a;
            Set set = eVar.f23888d;
            String str3 = eVar.f23887c;
            if (bVar.f23864a.isEmpty() && bVar.f23865b.isEmpty() && bVar.f23866c.isEmpty() && bVar.f23867d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = b.a(bVar.f23867d, b.a(bVar.f23865b, b.a(bVar.f23864a, 0, 1073741824, str), 2, str2), 4, str3);
                size = (iA == -1 || !set.containsAll(bVar.f23866c)) ? 0 : iA + (bVar.f23866c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new f(size, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void c(List list, String str, e eVar) {
        ArrayList arrayListB = b(list, str, eVar);
        for (int i10 = 0; i10 < arrayListB.size() && ((f) arrayListB.get(i10)).f23890d.f23877p == -1; i10++) {
        }
    }

    public static c d(String str, Matcher matcher, v vVar, ArrayList arrayList) {
        nb.g gVar = new nb.g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            gVar.f17473a = i.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            gVar.f17474b = i.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, gVar);
            StringBuilder sb2 = new StringBuilder();
            vVar.getClass();
            String strH = vVar.h(ne.g.f17524c);
            while (!TextUtils.isEmpty(strH)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strH.trim());
                strH = vVar.h(ne.g.f17524c);
            }
            gVar.f17475c = f(str, sb2.toString(), arrayList);
            return new c(gVar.b().a(), gVar.f17473a, gVar.f17474b);
        } catch (NumberFormatException unused) {
            a5.a.B("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r18, nb.g r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.g.e(java.lang.String, nb.g):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.g.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, nb.g gVar) {
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
                    a5.a.B("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f17479g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            gVar.f17477e = i.b(str);
            gVar.f17478f = 0;
        } else {
            gVar.f17477e = Integer.parseInt(str);
            gVar.f17478f = 1;
        }
    }
}
