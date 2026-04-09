package o6;

import android.view.View;
import androidx.appcompat.app.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import k6.e;
import n6.h;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23690a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23691b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23692c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f23693d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f23694e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f23695f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f23696g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f23697h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final Map f23698i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    public boolean f23699j;

    public static class a {
        public abstract e a();

        public abstract ArrayList b();
    }

    public View a(String str) {
        return (View) this.f23692c.get(str);
    }

    public final Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f23698i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f23698i.containsKey(view)) {
            return (Boolean) this.f23698i.get(view);
        }
        Map map = this.f23698i;
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
        this.f23693d.addAll(hashSet);
        return null;
    }

    public void d() {
        this.f23690a.clear();
        this.f23691b.clear();
        this.f23692c.clear();
        this.f23693d.clear();
        this.f23694e.clear();
        this.f23695f.clear();
        this.f23696g.clear();
        this.f23699j = false;
        this.f23697h.clear();
    }

    public final void e(i6.h hVar) {
        Iterator it = hVar.m().iterator();
        while (it.hasNext()) {
            z.a(it.next());
            f(null, hVar);
        }
    }

    public final void f(e eVar, i6.h hVar) {
        throw null;
    }

    public String g(String str) {
        return (String) this.f23696g.get(str);
    }

    public HashSet h() {
        return this.f23695f;
    }

    public a i(View view) {
        return (a) this.f23691b.get(view);
    }

    public String j(View view) {
        if (this.f23690a.size() == 0) {
            return null;
        }
        String str = (String) this.f23690a.get(view);
        if (str != null) {
            this.f23690a.remove(view);
        }
        return str;
    }

    public HashSet k() {
        return this.f23694e;
    }

    public boolean l(String str) {
        return this.f23697h.contains(str);
    }

    public com.iab.omid.library.vungle.walking.c m(View view) {
        return this.f23693d.contains(view) ? com.iab.omid.library.vungle.walking.c.PARENT_VIEW : this.f23699j ? com.iab.omid.library.vungle.walking.c.OBSTRUCTION_VIEW : com.iab.omid.library.vungle.walking.c.UNDERLYING_VIEW;
    }

    public void n() {
        this.f23699j = true;
    }

    public void o() {
        k6.c cVarE = k6.c.e();
        if (cVarE != null) {
            for (i6.h hVar : cVarE.a()) {
                View viewL = hVar.l();
                if (hVar.o()) {
                    String strJ = hVar.j();
                    if (viewL != null) {
                        boolean zE = h.e(viewL);
                        if (zE) {
                            this.f23697h.add(strJ);
                        }
                        String strC = c(viewL, zE);
                        if (strC == null) {
                            this.f23694e.add(strJ);
                            this.f23690a.put(viewL, strJ);
                            e(hVar);
                        } else if (strC != "noWindowFocus") {
                            this.f23695f.add(strJ);
                            this.f23692c.put(strJ, viewL);
                            this.f23696g.put(strJ, strC);
                        }
                    } else {
                        this.f23695f.add(strJ);
                        this.f23696g.put(strJ, "noAdView");
                    }
                }
            }
        }
    }

    public boolean p(View view) {
        if (!this.f23698i.containsKey(view)) {
            return true;
        }
        this.f23698i.put(view, Boolean.TRUE);
        return false;
    }
}
