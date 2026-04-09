package o5;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContextType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f23653a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f23654b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23655c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f23656d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23657e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23658f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23659g;

    /* renamed from: h, reason: collision with root package name */
    public final AdSessionContextType f23660h;

    public d(e eVar, WebView webView, String str, List list, String str2, String str3, AdSessionContextType adSessionContextType) {
        ArrayList arrayList = new ArrayList();
        this.f23655c = arrayList;
        this.f23656d = new HashMap();
        this.f23653a = eVar;
        this.f23654b = webView;
        this.f23657e = str;
        this.f23660h = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                this.f23656d.put(UUID.randomUUID().toString(), fVar);
            }
        }
        this.f23659g = str2;
        this.f23658f = str3;
    }

    public static d a(e eVar, WebView webView, String str, String str2) {
        t5.g.c(eVar, "Partner is null");
        t5.g.c(webView, "WebView is null");
        if (str2 != null) {
            t5.g.d(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(eVar, webView, null, null, str, str2, AdSessionContextType.HTML);
    }

    public static d b(e eVar, String str, List list, String str2, String str3) {
        t5.g.c(eVar, "Partner is null");
        t5.g.c(str, "OM SDK JS script content is null");
        t5.g.c(list, "VerificationScriptResources is null");
        if (str3 != null) {
            t5.g.d(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(eVar, null, str, list, str2, str3, AdSessionContextType.NATIVE);
    }

    public AdSessionContextType c() {
        return this.f23660h;
    }

    public String d() {
        return this.f23659g;
    }

    public String e() {
        return this.f23658f;
    }

    public Map f() {
        return Collections.unmodifiableMap(this.f23656d);
    }

    public String g() {
        return this.f23657e;
    }

    public e h() {
        return this.f23653a;
    }

    public List i() {
        return Collections.unmodifiableList(this.f23655c);
    }

    public WebView j() {
        return this.f23654b;
    }
}
