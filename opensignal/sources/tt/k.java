package tt;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f23008a;

    public k(String str) {
        Pattern patternCompile = Pattern.compile(str);
        br.l.d(patternCompile, "compile(...)");
        this.f23008a = patternCompile;
    }

    public final boolean a(String str) {
        br.l.e(str, "input");
        return this.f23008a.matcher(str).matches();
    }

    public final String b(String str, ar.k kVar) {
        br.l.e(str, "input");
        Matcher matcher = this.f23008a.matcher(str);
        br.l.d(matcher, "matcher(...)");
        j jVar = !matcher.find(0) ? null : new j(matcher, str);
        if (jVar == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        do {
            Matcher matcher2 = jVar.f23004a;
            sb2.append((CharSequence) str, i10, vc.e.T(matcher2.start(), matcher2.end()).f10863a);
            sb2.append((CharSequence) kVar.a(jVar));
            i10 = vc.e.T(matcher2.start(), matcher2.end()).f10864d + 1;
            CharSequence charSequence = jVar.f23005b;
            int iEnd = matcher2.end() + (matcher2.end() != matcher2.start() ? 0 : 1);
            if (iEnd <= charSequence.length()) {
                Matcher matcher3 = matcher2.pattern().matcher(charSequence);
                br.l.d(matcher3, "matcher(...)");
                jVar = !matcher3.find(iEnd) ? null : new j(matcher3, charSequence);
            } else {
                jVar = null;
            }
            if (i10 >= length) {
                break;
            }
        } while (jVar != null);
        if (i10 < length) {
            sb2.append((CharSequence) str, i10, length);
        }
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final String c(String str, String str2) {
        br.l.e(str, "input");
        String strReplaceAll = this.f23008a.matcher(str).replaceAll(str2);
        br.l.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f23008a.toString();
        br.l.d(string, "toString(...)");
        return string;
    }
}
