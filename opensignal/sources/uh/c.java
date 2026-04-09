package uh;

import ch.n;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nh.h;
import sm.m;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: h, reason: collision with root package name */
    public final om.f f23562h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23563i;

    public c(q3.a aVar, qm.c cVar, String str, h hVar, m mVar, om.f fVar, String str2, wh.a aVar2) {
        super(aVar, cVar, str, hVar, mVar, aVar2);
        this.f23562h = fVar;
        this.f23563i = str2;
    }

    @Override // dt.w
    public final String e(String str, String str2) {
        int length;
        qm.c cVar = (qm.c) this.f7548c;
        String strE = super.e(str, str2);
        n.b("YouTubeHtmlResourceGetter", "makeRequestAndGetResponse() called with: videoId = [" + str + "], urlFormat = [" + str2 + "]");
        om.f fVar = this.f23562h;
        fVar.getClass();
        n.b("YoutubeConsentParser", "parse() called");
        fVar.f19555g = new HashMap();
        if (strE != null) {
            Matcher matcher = ((Pattern) fVar.f19554d).matcher(strE);
            while (matcher.find()) {
                n.b("YoutubeConsentParser", "extractParams() Found new response: = [" + matcher.group() + "]");
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                n.b("YoutubeConsentParser", h0.b.o("extractParams() new attribute key: = [", strGroup, "]"));
                n.b("YoutubeConsentParser", "extractParams() new attribute value: = [" + strGroup2 + "]");
                ((HashMap) fVar.f19555g).put(strGroup, strGroup2);
            }
        }
        n.b("YoutubeConsentParser", (HashMap) fVar.f19555g);
        if (((HashMap) fVar.f19555g).isEmpty()) {
            return strE;
        }
        n.b("YouTubeHtmlResourceGetter", "Redirect to the consent page detected");
        HashMap map = (HashMap) fVar.f19555g;
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                sb2.append((String) entry.getKey());
                sb2.append("=");
                sb2.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e4) {
            n.e("YouTubeHtmlResourceGetter", e4);
        }
        String string = sb2.toString();
        try {
            length = string.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException e10) {
            n.e("YouTubeHtmlResourceGetter", e10);
            length = 0;
        }
        HashMap map2 = new HashMap();
        map2.put("Content-Type", "application/x-www-form-urlencoded");
        map2.put("User-Agent", "Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36");
        map2.put("charset", "UTF-8");
        map2.put("Content-Length", Integer.toString(length));
        cVar.K();
        return cVar.I(this.f23563i, string, map2);
    }
}
