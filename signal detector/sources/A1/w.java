package A1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0292n;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C0657Of;
import com.google.android.gms.internal.ads.C1119eq;
import com.google.android.gms.internal.ads.C1120er;
import com.google.android.gms.internal.ads.C1174fq;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.G5;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.RF;
import com.google.android.gms.internal.ads.S7;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.T7;
import com.google.android.gms.internal.ads.Xu;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import q.C2786d;
import q2.C2841s;
import q2.C2852x0;
import u2.AbstractC2953c;

/* loaded from: classes.dex */
public final class w implements H1.i, BD {

    /* renamed from: e, reason: collision with root package name */
    public static volatile w f137e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138a;

    /* renamed from: b, reason: collision with root package name */
    public Object f139b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f140c;

    /* renamed from: d, reason: collision with root package name */
    public Object f141d;

    public w(Xu xu, Su su, boolean z6) {
        this.f138a = 9;
        this.f141d = xu;
        this.f139b = su;
        this.f140c = z6;
    }

    public static w b(Context context) {
        if (f137e == null) {
            synchronized (w.class) {
                try {
                    if (f137e == null) {
                        f137e = new w(context.getApplicationContext(), 0);
                    }
                } finally {
                }
            }
        }
        return f137e;
    }

    public boolean a(D1.c cVar) {
        boolean z6 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f141d).remove(cVar);
        if (!((HashSet) this.f139b).remove(cVar) && !zRemove) {
            z6 = false;
        }
        if (z6) {
            cVar.clear();
        }
        return z6;
    }

    public void c() {
        F0.g gVar = (F0.g) this.f141d;
        C0300w c0300wJ = gVar.j();
        if (c0300wJ.f5259d != EnumC0292n.f5244b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0300wJ.a(new F0.b(0, gVar));
        F0.f fVar = (F0.f) this.f139b;
        fVar.getClass();
        if (fVar.f1435a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0300wJ.a(new F0.c(0, fVar));
        fVar.f1435a = true;
        this.f140c = true;
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        Su su = (Su) this.f139b;
        su.b(true);
        Xu xu = (Xu) this.f141d;
        xu.a(su);
        if (this.f140c) {
            xu.h();
        }
    }

    public void e(Bundle bundle) {
        if (!this.f140c) {
            c();
        }
        C0300w c0300wJ = ((F0.g) this.f141d).j();
        if (c0300wJ.f5259d.compareTo(EnumC0292n.f5246d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0300wJ.f5259d).toString());
        }
        F0.f fVar = (F0.f) this.f139b;
        if (!fVar.f1435a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (fVar.f1436b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        fVar.f1439e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        fVar.f1436b = true;
    }

    public void f(Bundle bundle) {
        F0.f fVar = (F0.f) this.f139b;
        fVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) fVar.f1439e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        q.f fVar2 = (q.f) fVar.f1438d;
        fVar2.getClass();
        C2786d c2786d = new C2786d(fVar2);
        fVar2.f22903c.put(c2786d, Boolean.FALSE);
        while (c2786d.hasNext()) {
            Map.Entry entry = (Map.Entry) c2786d.next();
            bundle2.putBundle((String) entry.getKey(), ((F0.e) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public synchronized void g() {
        ((C0657Of) this.f139b).b(null);
    }

    @Override // H1.i
    public Object get() {
        if (this.f140c) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        R3.b.c("Glide registry");
        this.f140c = true;
        try {
            return R3.b.f((com.bumptech.glide.b) this.f141d, (ArrayList) this.f139b);
        } finally {
            this.f140c = false;
            Trace.endSection();
        }
    }

    public void h(Context context) {
        synchronized (this.f141d) {
            try {
                if (!this.f140c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        u2.k.h("Can not cast Context to Application");
                        return;
                    }
                    if (((S7) this.f139b) == null) {
                        this.f139b = new S7();
                    }
                    S7 s7 = (S7) this.f139b;
                    if (!s7.i) {
                        application.registerActivityLifecycleCallbacks(s7);
                        if (context instanceof Activity) {
                            s7.d((Activity) context);
                        }
                        s7.f11131b = application;
                        s7.f11138j = ((Long) C2841s.f23267e.f23270c.a(H9.f8817r1)).longValue();
                        s7.i = true;
                    }
                    this.f140c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(c3.h hVar) {
        synchronized (this.f141d) {
            try {
                if (((ArrayDeque) this.f139b) == null) {
                    this.f139b = new ArrayDeque();
                }
                ((ArrayDeque) this.f139b).add(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void j(int i) {
        if (this.f140c) {
            return;
        }
        this.f140c = true;
        r(new C2852x0(i, C1120er.c(i, ((C1119eq) this.f141d).f13986a), "undefined", null, null));
    }

    public void k(c3.j jVar) {
        c3.h hVar;
        synchronized (this.f141d) {
            if (((ArrayDeque) this.f139b) != null && !this.f140c) {
                this.f140c = true;
                while (true) {
                    synchronized (this.f141d) {
                        try {
                            hVar = (c3.h) ((ArrayDeque) this.f139b).poll();
                            if (hVar == null) {
                                this.f140c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    hVar.b(jVar);
                }
            }
        }
    }

    public void l(T7 t7) {
        synchronized (this.f141d) {
            try {
                if (((S7) this.f139b) == null) {
                    this.f139b = new S7();
                }
                ((S7) this.f139b).a(t7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void m(int i, String str) {
        try {
            if (this.f140c) {
                return;
            }
            this.f140c = true;
            if (str == null) {
                str = C1120er.c(i, ((C1119eq) this.f141d).f13986a);
            }
            r(new C2852x0(i, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    public void n(T7 t7) {
        synchronized (this.f141d) {
            try {
                S7 s7 = (S7) this.f139b;
                if (s7 == null) {
                    return;
                }
                s7.b(t7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Activity o() {
        synchronized (this.f141d) {
            try {
                S7 s7 = (S7) this.f139b;
                if (s7 == null) {
                    return null;
                }
                return s7.f11130a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void p(C2852x0 c2852x0) {
        if (this.f140c) {
            return;
        }
        this.f140c = true;
        r(c2852x0);
    }

    public Application q() {
        synchronized (this.f141d) {
            try {
                S7 s7 = (S7) this.f139b;
                if (s7 == null) {
                    return null;
                }
                return s7.f11131b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void r(C2852x0 c2852x0) {
        int i = 1;
        if (true == ((Boolean) C2841s.f23267e.f23270c.a(H9.p6)).booleanValue()) {
            i = 3;
        }
        ((C0657Of) this.f139b).c(new C1174fq(i, c2852x0));
    }

    public boolean s() {
        synchronized (this.f141d) {
            try {
                S7 s7 = (S7) this.f139b;
                if (s7 == null) {
                    return false;
                }
                return s7.f11133d.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f138a) {
            case 1:
                return super.toString() + "{numRequests=" + ((Set) this.f141d).size() + ", isPaused=" + this.f140c + "}";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        Su su = (Su) this.f139b;
        if (su.c()) {
            Xu xu = (Xu) this.f141d;
            su.d(th);
            su.b(false);
            xu.a(su);
            if (this.f140c) {
                xu.h();
            }
        }
    }

    public w(G5 g52) {
        this.f138a = 5;
        this.f141d = g52.A();
        this.f140c = g52.B();
        this.f139b = g52.C();
        g52.D();
    }

    public w(C1120er c1120er, C1119eq c1119eq, C0657Of c0657Of) {
        this.f138a = 8;
        this.f141d = c1119eq;
        this.f139b = c0657Of;
        this.f140c = false;
    }

    public w(int i) {
        this.f138a = i;
        switch (i) {
            case 3:
                this.f141d = new Object();
                break;
            case 6:
                this.f141d = new Object();
                this.f139b = null;
                this.f140c = false;
                break;
            case 7:
                this.f139b = AbstractC2953c.f23792b;
                break;
            case 10:
                this.f141d = new ArrayList();
                this.f139b = RF.f10876b;
                this.f140c = false;
                break;
            default:
                this.f141d = Collections.newSetFromMap(new WeakHashMap());
                this.f139b = new HashSet();
                break;
        }
    }

    public w(F0.g gVar) {
        this.f138a = 2;
        this.f141d = gVar;
        this.f139b = new F0.f();
    }

    public w(Context context, int i) {
        Object vVar;
        this.f138a = i;
        switch (i) {
            case 7:
                ExecutorService executorService = AbstractC2953c.f23792b;
                this.f139b = executorService;
                executorService.execute(new CD(this, 6, context));
                break;
            default:
                this.f139b = new HashSet();
                H1.h hVar = new H1.h(new n(context, 0));
                o oVar = new o(this);
                if (Build.VERSION.SDK_INT >= 24) {
                    vVar = new s(hVar, oVar);
                } else {
                    vVar = new v(context, hVar, oVar);
                }
                this.f141d = vVar;
                break;
        }
    }

    public w(com.bumptech.glide.b bVar, ArrayList arrayList, T2.g gVar) {
        this.f138a = 4;
        this.f141d = bVar;
        this.f139b = arrayList;
    }
}
