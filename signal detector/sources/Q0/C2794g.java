package q0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.InterfaceC0287i;
import androidx.lifecycle.InterfaceC0298u;
import androidx.lifecycle.Q;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import c5.C0410g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: q0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2794g implements InterfaceC0298u, b0, InterfaceC0287i, F0.g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22964a;

    /* renamed from: b, reason: collision with root package name */
    public v f22965b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f22966c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0292n f22967d;

    /* renamed from: e, reason: collision with root package name */
    public final o f22968e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22969f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f22970g;

    /* renamed from: h, reason: collision with root package name */
    public final C0300w f22971h = new C0300w(this);
    public final A1.w i = new A1.w(this);

    /* renamed from: j, reason: collision with root package name */
    public boolean f22972j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0292n f22973k;

    public C2794g(Context context, v vVar, Bundle bundle, EnumC0292n enumC0292n, o oVar, String str, Bundle bundle2) {
        this.f22964a = context;
        this.f22965b = vVar;
        this.f22966c = bundle;
        this.f22967d = enumC0292n;
        this.f22968e = oVar;
        this.f22969f = str;
        this.f22970g = bundle2;
        C0410g c0410g = new C0410g(new C0.y(4, this));
        this.f22973k = EnumC0292n.f5244b;
    }

    public final Bundle a() {
        Bundle bundle = this.f22966c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b(EnumC0292n enumC0292n) {
        q5.i.e(enumC0292n, "maxState");
        this.f22973k = enumC0292n;
        e();
    }

    @Override // androidx.lifecycle.InterfaceC0287i
    public final n0.d c() {
        n0.d dVar = new n0.d(0);
        Context applicationContext = this.f22964a.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = dVar.f22143a;
        if (application != null) {
            linkedHashMap.put(Y.f5231e, application);
        }
        linkedHashMap.put(Q.f5209a, this);
        linkedHashMap.put(Q.f5210b, this);
        Bundle bundleA = a();
        if (bundleA != null) {
            linkedHashMap.put(Q.f5211c, bundleA);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.b0
    public final a0 d() {
        if (!this.f22972j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f22971h.f5259d == EnumC0292n.f5243a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        o oVar = this.f22968e;
        if (oVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f22969f;
        q5.i.e(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = oVar.f23003b;
        a0 a0Var = (a0) linkedHashMap.get(str);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0();
        linkedHashMap.put(str, a0Var2);
        return a0Var2;
    }

    public final void e() {
        if (!this.f22972j) {
            A1.w wVar = this.i;
            wVar.c();
            this.f22972j = true;
            if (this.f22968e != null) {
                Q.e(this);
            }
            wVar.e(this.f22970g);
        }
        int iOrdinal = this.f22967d.ordinal();
        int iOrdinal2 = this.f22973k.ordinal();
        C0300w c0300w = this.f22971h;
        if (iOrdinal < iOrdinal2) {
            c0300w.g(this.f22967d);
        } else {
            c0300w.g(this.f22973k);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof C2794g)) {
            C2794g c2794g = (C2794g) obj;
            Bundle bundle = c2794g.f22966c;
            if (q5.i.a(this.f22969f, c2794g.f22969f) && q5.i.a(this.f22965b, c2794g.f22965b) && q5.i.a(this.f22971h, c2794g.f22971h) && q5.i.a((F0.f) this.i.f139b, (F0.f) c2794g.i.f139b)) {
                Bundle bundle2 = this.f22966c;
                if (q5.i.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    if (setKeySet.isEmpty()) {
                        return true;
                    }
                    for (String str : setKeySet) {
                        if (!q5.i.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // F0.g
    public final F0.f f() {
        return (F0.f) this.i.f139b;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f22965b.hashCode() + (this.f22969f.hashCode() * 31);
        Bundle bundle = this.f22966c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((F0.f) this.i.f139b).hashCode() + ((this.f22971h.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // androidx.lifecycle.InterfaceC0298u
    public final C0300w j() {
        return this.f22971h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2794g.class.getSimpleName());
        sb.append("(" + this.f22969f + ')');
        sb.append(" destination=");
        sb.append(this.f22965b);
        String string = sb.toString();
        q5.i.d(string, "sb.toString()");
        return string;
    }
}
