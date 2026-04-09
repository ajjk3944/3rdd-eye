package e6;

import a6.e;
import android.view.View;
import androidx.appcompat.app.z;
import d6.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import y5.f;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20971a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20972b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20973c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f20974d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f20975e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f20976f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f20977g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Map f20978h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f20979i;

    public static class a {
        public abstract e a();

        public abstract ArrayList b();
    }

    public View a(String str) {
        return (View) this.f20973c.get(str);
    }

    public final String b(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (f(view).booleanValue()) {
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
        this.f20974d.addAll(hashSet);
        return null;
    }

    public void c() {
        this.f20971a.clear();
        this.f20972b.clear();
        this.f20973c.clear();
        this.f20974d.clear();
        this.f20975e.clear();
        this.f20976f.clear();
        this.f20977g.clear();
        this.f20979i = false;
    }

    public final void d(e eVar, f fVar) {
        throw null;
    }

    public final void e(f fVar) {
        Iterator it = fVar.j().iterator();
        while (it.hasNext()) {
            z.a(it.next());
            d(null, fVar);
        }
    }

    public final Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f20978h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f20978h.containsKey(view)) {
            return (Boolean) this.f20978h.get(view);
        }
        Map map = this.f20978h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String g(String str) {
        return (String) this.f20977g.get(str);
    }

    public HashSet h() {
        return this.f20976f;
    }

    public a i(View view) {
        return (a) this.f20972b.get(view);
    }

    public HashSet j() {
        return this.f20975e;
    }

    public String k(View view) {
        if (this.f20971a.size() == 0) {
            return null;
        }
        String str = (String) this.f20971a.get(view);
        if (str != null) {
            this.f20971a.remove(view);
        }
        return str;
    }

    public void l() {
        this.f20979i = true;
    }

    public com.iab.omid.library.unity3d.walking.c m(View view) {
        return this.f20974d.contains(view) ? com.iab.omid.library.unity3d.walking.c.PARENT_VIEW : this.f20979i ? com.iab.omid.library.unity3d.walking.c.OBSTRUCTION_VIEW : com.iab.omid.library.unity3d.walking.c.UNDERLYING_VIEW;
    }

    public void n() {
        a6.c cVarE = a6.c.e();
        if (cVarE != null) {
            for (f fVar : cVarE.a()) {
                View viewH = fVar.h();
                if (fVar.m()) {
                    String strO = fVar.o();
                    if (viewH != null) {
                        String strB = b(viewH);
                        if (strB == null) {
                            this.f20975e.add(strO);
                            this.f20971a.put(viewH, strO);
                            e(fVar);
                        } else if (strB != "noWindowFocus") {
                            this.f20976f.add(strO);
                            this.f20973c.put(strO, viewH);
                            this.f20977g.put(strO, strB);
                        }
                    } else {
                        this.f20976f.add(strO);
                        this.f20977g.put(strO, "noAdView");
                    }
                }
            }
        }
    }

    public boolean o(View view) {
        if (!this.f20978h.containsKey(view)) {
            return true;
        }
        this.f20978h.put(view, Boolean.TRUE);
        return false;
    }
}
