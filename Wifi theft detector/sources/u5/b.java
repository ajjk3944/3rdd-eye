package u5;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import o5.g;
import q5.e;
import t5.h;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24519a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f24520b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f24521c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f24522d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f24523e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f24524f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f24525g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f24526h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final Map f24527i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    public boolean f24528j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final e f24529a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f24530b = new ArrayList();

        public a(e eVar, String str) {
            this.f24529a = eVar;
            b(str);
        }

        public e a() {
            return this.f24529a;
        }

        public void b(String str) {
            this.f24530b.add(str);
        }

        public ArrayList c() {
            return this.f24530b;
        }
    }

    public View a(String str) {
        return (View) this.f24521c.get(str);
    }

    public final Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f24527i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f24527i.containsKey(view)) {
            return (Boolean) this.f24527i.get(view);
        }
        Map map = this.f24527i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public final String c(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue() && !z10) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f24522d.addAll(hashSet);
        return null;
    }

    public void d() {
        this.f24519a.clear();
        this.f24520b.clear();
        this.f24521c.clear();
        this.f24522d.clear();
        this.f24523e.clear();
        this.f24524f.clear();
        this.f24525g.clear();
        this.f24528j = false;
        this.f24526h.clear();
    }

    public final void e(g gVar) {
        Iterator it = gVar.o().iterator();
        while (it.hasNext()) {
            f((e) it.next(), gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(e eVar, g gVar) {
        View view = (View) eVar.c().get();
        if (view == null) {
            return;
        }
        a aVar = (a) this.f24520b.get(view);
        if (aVar != null) {
            aVar.b(gVar.s());
        } else {
            this.f24520b.put(view, new a(eVar, gVar.s()));
        }
    }

    public String g(String str) {
        return (String) this.f24525g.get(str);
    }

    public HashSet h() {
        return this.f24524f;
    }

    public a i(View view) {
        a aVar = (a) this.f24520b.get(view);
        if (aVar != null) {
            this.f24520b.remove(view);
        }
        return aVar;
    }

    public String j(View view) {
        if (this.f24519a.size() == 0) {
            return null;
        }
        String str = (String) this.f24519a.get(view);
        if (str != null) {
            this.f24519a.remove(view);
        }
        return str;
    }

    public HashSet k() {
        return this.f24523e;
    }

    public boolean l(String str) {
        return this.f24526h.contains(str);
    }

    public com.iab.omid.library.mmadbridge.walking.c m(View view) {
        return this.f24522d.contains(view) ? com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW : this.f24528j ? com.iab.omid.library.mmadbridge.walking.c.OBSTRUCTION_VIEW : com.iab.omid.library.mmadbridge.walking.c.UNDERLYING_VIEW;
    }

    public void n() {
        this.f24528j = true;
    }

    public void o() {
        q5.c cVarE = q5.c.e();
        if (cVarE != null) {
            for (g gVar : cVarE.a()) {
                View viewN = gVar.n();
                if (gVar.q()) {
                    String strS = gVar.s();
                    if (viewN != null) {
                        boolean zE = h.e(viewN);
                        if (zE) {
                            this.f24526h.add(strS);
                        }
                        String strC = c(viewN, zE);
                        if (strC == null) {
                            this.f24523e.add(strS);
                            this.f24519a.put(viewN, strS);
                            e(gVar);
                        } else if (strC != "noWindowFocus") {
                            this.f24524f.add(strS);
                            this.f24521c.put(strS, viewN);
                            this.f24525g.put(strS, strC);
                        }
                    } else {
                        this.f24524f.add(strS);
                        this.f24525g.put(strS, "noAdView");
                    }
                }
            }
        }
    }

    public boolean p(View view) {
        if (!this.f24527i.containsKey(view)) {
            return true;
        }
        this.f24527i.put(view, Boolean.TRUE);
        return false;
    }
}
