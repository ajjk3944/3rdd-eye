package iu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import mq.w;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12982a;

    /* renamed from: b, reason: collision with root package name */
    public List f12983b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12984c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f12985d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12986e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12987f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12988g;

    public a(String str) {
        br.l.e(str, "serialName");
        this.f12982a = str;
        this.f12983b = w.f16945a;
        this.f12984c = new ArrayList();
        this.f12985d = new HashSet();
        this.f12986e = new ArrayList();
        this.f12987f = new ArrayList();
        this.f12988g = new ArrayList();
    }

    public static void a(a aVar, String str, e eVar) {
        aVar.getClass();
        br.l.e(str, "elementName");
        br.l.e(eVar, "descriptor");
        if (!aVar.f12985d.add(str)) {
            StringBuilder sbU = c7.a.u("Element with name '", str, "' is already registered in ");
            sbU.append(aVar.f12982a);
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        aVar.f12984c.add(str);
        aVar.f12986e.add(eVar);
        aVar.f12987f.add(w.f16945a);
        aVar.f12988g.add(false);
    }
}
