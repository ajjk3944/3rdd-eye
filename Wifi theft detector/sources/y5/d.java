package y5;

import android.webkit.WebView;
import androidx.appcompat.app.z;
import com.iab.omid.library.unity3d.adsession.AdSessionContextType;
import d6.g;
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
    public final e f25134a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f25135b;

    /* renamed from: c, reason: collision with root package name */
    public final List f25136c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f25137d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25138e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25139f;

    /* renamed from: g, reason: collision with root package name */
    public final String f25140g;

    /* renamed from: h, reason: collision with root package name */
    public final AdSessionContextType f25141h;

    public d(e eVar, WebView webView, String str, List list, String str2, String str3, AdSessionContextType adSessionContextType) {
        ArrayList arrayList = new ArrayList();
        this.f25136c = arrayList;
        this.f25137d = new HashMap();
        this.f25134a = eVar;
        this.f25135b = webView;
        this.f25138e = str;
        this.f25141h = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z.a(it.next());
                this.f25137d.put(UUID.randomUUID().toString(), null);
            }
        }
        this.f25140g = str2;
        this.f25139f = str3;
    }

    public static d a(e eVar, WebView webView, String str, String str2) {
        g.c(eVar, "Partner is null");
        g.c(webView, "WebView is null");
        if (str2 != null) {
            g.d(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(eVar, webView, null, null, str, str2, AdSessionContextType.HTML);
    }

    public static d b(e eVar, WebView webView, String str, String str2) {
        g.c(eVar, "Partner is null");
        g.c(webView, "WebView is null");
        if (str2 != null) {
            g.d(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(eVar, webView, null, null, str, str2, AdSessionContextType.JAVASCRIPT);
    }

    public AdSessionContextType c() {
        return this.f25141h;
    }

    public String d() {
        return this.f25140g;
    }

    public String e() {
        return this.f25139f;
    }

    public Map f() {
        return Collections.unmodifiableMap(this.f25137d);
    }

    public String g() {
        return this.f25138e;
    }

    public e h() {
        return this.f25134a;
    }

    public List i() {
        return Collections.unmodifiableList(this.f25136c);
    }

    public WebView j() {
        return this.f25135b;
    }
}
