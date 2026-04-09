package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import com.yandex.mobile.ads.impl.me2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ee2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26816a;

    /* renamed from: b, reason: collision with root package name */
    private final yf2 f26817b;

    /* renamed from: c, reason: collision with root package name */
    private final dg2 f26818c;

    public ee2(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f26816a = context.getApplicationContext();
        this.f26817b = new yf2();
        this.f26818c = new dg2();
    }

    public final void a(List<String> rawUrls, Map<String, String> macros) {
        kotlin.jvm.internal.l.f(rawUrls, "rawUrls");
        ArrayList arrayList = new ArrayList(C2092m.T(rawUrls, 10));
        for (String url : rawUrls) {
            boolean z10 = macros != null;
            if (z10) {
                this.f26817b.getClass();
                kotlin.jvm.internal.l.f(url, "url");
                kotlin.jvm.internal.l.f(macros, "macros");
                for (Map.Entry<String, String> entry : macros.entrySet()) {
                    url = y9.n.X(url, entry.getKey(), entry.getValue());
                }
            } else if (z10) {
                throw new b9.j();
            }
            arrayList.add(url);
        }
        this.f26818c.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!kotlin.jvm.internal.l.b((String) next, "about:blank")) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            me2.a aVar = me2.f30361c;
            Context applicationContext = this.f26816a;
            kotlin.jvm.internal.l.e(applicationContext, "applicationContext");
            aVar.a(applicationContext).a(str);
        }
    }
}
