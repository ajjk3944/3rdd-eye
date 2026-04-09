package i6;

import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.AdSessionContextType;
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
    public final e f21608a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f21609b;

    /* renamed from: c, reason: collision with root package name */
    public final List f21610c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f21611d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21612e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21613f;

    /* renamed from: g, reason: collision with root package name */
    public final String f21614g;

    /* renamed from: h, reason: collision with root package name */
    public final AdSessionContextType f21615h;

    public d(e eVar, WebView webView, String str, List list, String str2, String str3, AdSessionContextType adSessionContextType, f fVar) {
        ArrayList arrayList = new ArrayList();
        this.f21610c = arrayList;
        this.f21611d = new HashMap();
        this.f21608a = eVar;
        this.f21609b = webView;
        this.f21612e = str;
        this.f21615h = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                this.f21611d.put(UUID.randomUUID().toString(), gVar);
            }
        }
        this.f21614g = str2;
        this.f21613f = str3;
    }

    public static d a(e eVar, WebView webView, String str, String str2) {
        n6.g.d(eVar, "Partner is null");
        n6.g.d(webView, "WebView is null");
        if (str2 != null) {
            n6.g.e(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(eVar, webView, null, null, str, str2, AdSessionContextType.HTML, null);
    }

    public static d b(e eVar, String str, List list, String str2, String str3) {
        return c(eVar, str, list, str2, str3, null);
    }

    public static d c(e eVar, String str, List list, String str2, String str3, f fVar) {
        n6.g.d(eVar, "Partner is null");
        n6.g.d(str, "OM SDK JS script content is null");
        n6.g.d(list, "VerificationScriptResources is null");
        if (str3 != null) {
            n6.g.e(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(eVar, null, str, list, str2, str3, AdSessionContextType.NATIVE, fVar);
    }

    public AdSessionContextType d() {
        return this.f21615h;
    }

    public String e() {
        return this.f21614g;
    }

    public String f() {
        return this.f21613f;
    }

    public Map g() {
        return Collections.unmodifiableMap(this.f21611d);
    }

    public String h() {
        return this.f21612e;
    }

    public e i() {
        return this.f21608a;
    }

    public f j() {
        return null;
    }

    public List k() {
        return Collections.unmodifiableList(this.f21610c);
    }

    public WebView l() {
        return this.f21609b;
    }
}
