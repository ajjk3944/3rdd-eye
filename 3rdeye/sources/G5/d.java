package G5;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final B7.d f1914a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f1915b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1916c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1917d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1918e;

    /* renamed from: f, reason: collision with root package name */
    public final e f1919f;

    public d(B7.d dVar, WebView webView, String str, List list, e eVar) {
        ArrayList arrayList = new ArrayList();
        this.f1916c = arrayList;
        this.f1917d = new HashMap();
        this.f1914a = dVar;
        this.f1915b = webView;
        this.f1918e = str;
        this.f1919f = eVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                this.f1917d.put(UUID.randomUUID().toString(), kVar);
            }
        }
    }
}
