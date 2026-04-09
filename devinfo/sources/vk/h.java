package vk;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f36288a;

    public h(String str) {
        Pattern patternCompile = Pattern.compile(str);
        nk.k.d(patternCompile, "compile(...)");
        this.f36288a = patternCompile;
    }

    public final uk.e a(String str) {
        if (str.length() >= 0) {
            return new uk.e(new c0.p(11, this, str), g.f36287i);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }

    public final f b(int i4, String str) {
        nk.k.e(str, "input");
        Matcher matcherRegion = this.f36288a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i4, str.length());
        if (matcherRegion.lookingAt()) {
            return new f(matcherRegion, str);
        }
        return null;
    }

    public final String c(String str) {
        nk.k.e(str, "input");
        String strReplaceAll = this.f36288a.matcher(str).replaceAll("");
        nk.k.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f36288a.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }
}
