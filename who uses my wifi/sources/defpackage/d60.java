package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d60 {
    public final boolean a;
    public gu b;
    public u50 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final ay0 i;

    public d60(b60 b60Var) {
        new AtomicReference(null);
        this.a = true;
        this.b = new gu();
        u50 u50Var = u50.g;
        this.c = u50Var;
        this.h = new ArrayList();
        this.d = new WeakReference(b60Var);
        this.i = new ay0(u50Var);
    }

    public final void a(a60 a60Var) {
        y50 nnVar;
        Object obj;
        b60 b60Var;
        c("addObserver");
        u50 u50Var = this.c;
        u50 u50Var2 = u50.f;
        if (u50Var != u50Var2) {
            u50Var2 = u50.g;
        }
        c60 c60Var = new c60();
        HashMap map = f60.a;
        boolean z = a60Var instanceof y50;
        boolean z2 = a60Var instanceof sr;
        int i = 2;
        Object obj2 = null;
        if (z && z2) {
            nnVar = new nn((sr) a60Var, (y50) a60Var, i);
        } else if (z2) {
            nnVar = new nn((sr) a60Var, obj2, i);
        } else if (z) {
            nnVar = (y50) a60Var;
        } else {
            Class<?> cls = a60Var.getClass();
            if (f60.b(cls) == 2) {
                Object obj3 = f60.b.get(cls);
                i30.j(obj3);
                List list = (List) obj3;
                if (list.size() == 1) {
                    f60.a((Constructor) list.get(0), a60Var);
                    throw null;
                }
                int size = list.size();
                vy[] vyVarArr = new vy[size];
                if (size > 0) {
                    f60.a((Constructor) list.get(0), a60Var);
                    throw null;
                }
                nnVar = new un0(i, vyVarArr);
            } else {
                nnVar = new nn(a60Var);
            }
        }
        c60Var.b = nnVar;
        c60Var.a = u50Var2;
        gu guVar = this.b;
        ls0 ls0VarA = guVar.a(a60Var);
        if (ls0VarA != null) {
            obj = ls0VarA.g;
        } else {
            HashMap map2 = guVar.j;
            ls0 ls0Var = new ls0(a60Var, c60Var);
            guVar.i++;
            ls0 ls0Var2 = guVar.g;
            if (ls0Var2 == null) {
                guVar.f = ls0Var;
                guVar.g = ls0Var;
            } else {
                ls0Var2.h = ls0Var;
                ls0Var.i = ls0Var2;
                guVar.g = ls0Var;
            }
            map2.put(a60Var, ls0Var);
            obj = null;
        }
        if (((c60) obj) == null && (b60Var = (b60) this.d.get()) != null) {
            i = (this.e != 0 || this.f) ? 1 : 0;
            u50 u50VarB = b(a60Var);
            this.e++;
            while (c60Var.a.compareTo(u50VarB) < 0 && this.b.j.containsKey(a60Var)) {
                u50 u50Var3 = c60Var.a;
                ArrayList arrayList = this.h;
                arrayList.add(u50Var3);
                r50 r50Var = t50.Companion;
                u50 u50Var4 = c60Var.a;
                r50Var.getClass();
                i30.m(u50Var4, "state");
                int iOrdinal = u50Var4.ordinal();
                t50 t50Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : t50.ON_RESUME : t50.ON_START : t50.ON_CREATE;
                if (t50Var == null) {
                    throw new IllegalStateException("no event up from " + c60Var.a);
                }
                c60Var.a(b60Var, t50Var);
                arrayList.remove(arrayList.size() - 1);
                u50VarB = b(a60Var);
            }
            if (i == 0) {
                h();
            }
            this.e--;
        }
    }

    public final u50 b(a60 a60Var) {
        HashMap map = this.b.j;
        ls0 ls0Var = map.containsKey(a60Var) ? ((ls0) map.get(a60Var)).i : null;
        u50 u50Var = ls0Var != null ? ((c60) ls0Var.g).a : null;
        ArrayList arrayList = this.h;
        u50 u50Var2 = arrayList.isEmpty() ? null : (u50) arrayList.get(arrayList.size() - 1);
        u50 u50Var3 = this.c;
        i30.m(u50Var3, "state1");
        if (u50Var == null || u50Var.compareTo(u50Var3) >= 0) {
            u50Var = u50Var3;
        }
        return (u50Var2 == null || u50Var2.compareTo(u50Var) >= 0) ? u50Var : u50Var2;
    }

    public final void c(String str) {
        if (this.a) {
            j8.T().D.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(ex0.h("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(t50 t50Var) {
        i30.m(t50Var, "event");
        c("handleLifecycleEvent");
        e(t50Var.a());
    }

    public final void e(u50 u50Var) {
        if (this.c == u50Var) {
            return;
        }
        b60 b60Var = (b60) this.d.get();
        u50 u50Var2 = this.c;
        i30.m(u50Var2, "current");
        u50 u50Var3 = u50.g;
        u50 u50Var4 = u50.f;
        if (u50Var2 == u50Var3 && u50Var == u50Var4) {
            throw new IllegalStateException(("State must be at least '" + u50.h + "' to be moved to '" + u50Var + "' in component " + b60Var).toString());
        }
        if (u50Var2 == u50Var4 && u50Var2 != u50Var) {
            throw new IllegalStateException(("State is '" + u50Var4 + "' and cannot be moved to `" + u50Var + "` in component " + b60Var).toString());
        }
        this.c = u50Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        h();
        this.f = false;
        if (this.c == u50Var4) {
            this.b = new gu();
        }
    }

    public final void f(a60 a60Var) {
        c("removeObserver");
        this.b.b(a60Var);
    }

    public final void g() {
        c("setCurrentState");
        e(u50.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.g = false;
        r12.i.F(r12.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d60.h():void");
    }
}
