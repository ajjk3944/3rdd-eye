package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p.C2767b;
import q.C2783a;
import q.C2785c;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300w {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f5256a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5257b = true;

    /* renamed from: c, reason: collision with root package name */
    public C2783a f5258c = new C2783a();

    /* renamed from: d, reason: collision with root package name */
    public EnumC0292n f5259d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f5260e;

    /* renamed from: f, reason: collision with root package name */
    public int f5261f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5262g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5263h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final C5.o f5264j;

    public C0300w(InterfaceC0298u interfaceC0298u) {
        EnumC0292n enumC0292n = EnumC0292n.f5244b;
        this.f5259d = enumC0292n;
        this.i = new ArrayList();
        this.f5260e = new WeakReference(interfaceC0298u);
        this.f5264j = new C5.o(enumC0292n);
    }

    public final void a(InterfaceC0297t interfaceC0297t) {
        InterfaceC0296s bVar;
        Object obj;
        InterfaceC0298u interfaceC0298u;
        q5.i.e(interfaceC0297t, "observer");
        c("addObserver");
        EnumC0292n enumC0292n = this.f5259d;
        EnumC0292n enumC0292n2 = EnumC0292n.f5243a;
        if (enumC0292n != enumC0292n2) {
            enumC0292n2 = EnumC0292n.f5244b;
        }
        C0299v c0299v = new C0299v();
        HashMap map = AbstractC0302y.f5266a;
        boolean z6 = interfaceC0297t instanceof InterfaceC0296s;
        boolean z7 = interfaceC0297t instanceof InterfaceC0283e;
        int i = 2;
        if (z6 && z7) {
            bVar = new R0.b((InterfaceC0283e) interfaceC0297t, (InterfaceC0296s) interfaceC0297t);
        } else if (z7) {
            bVar = new R0.b((InterfaceC0283e) interfaceC0297t, (InterfaceC0296s) null);
        } else if (z6) {
            bVar = (InterfaceC0296s) interfaceC0297t;
        } else {
            Class<?> cls = interfaceC0297t.getClass();
            if (AbstractC0302y.b(cls) == 2) {
                Object obj2 = AbstractC0302y.f5267b.get(cls);
                q5.i.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0302y.a((Constructor) list.get(0), interfaceC0297t);
                    throw null;
                }
                int size = list.size();
                InterfaceC0286h[] interfaceC0286hArr = new InterfaceC0286h[size];
                if (size > 0) {
                    AbstractC0302y.a((Constructor) list.get(0), interfaceC0297t);
                    throw null;
                }
                bVar = new F0.b(i, interfaceC0286hArr);
            } else {
                bVar = new R0.b(interfaceC0297t);
            }
        }
        c0299v.f5255b = bVar;
        c0299v.f5254a = enumC0292n2;
        C2783a c2783a = this.f5258c;
        C2785c c2785cA = c2783a.a(interfaceC0297t);
        if (c2785cA != null) {
            obj = c2785cA.f22895b;
        } else {
            HashMap map2 = c2783a.f22890e;
            C2785c c2785c = new C2785c(interfaceC0297t, c0299v);
            c2783a.f22904d++;
            C2785c c2785c2 = c2783a.f22902b;
            if (c2785c2 == null) {
                c2783a.f22901a = c2785c;
                c2783a.f22902b = c2785c;
            } else {
                c2785c2.f22896c = c2785c;
                c2785c.f22897d = c2785c2;
                c2783a.f22902b = c2785c;
            }
            map2.put(interfaceC0297t, c2785c);
            obj = null;
        }
        if (((C0299v) obj) == null && (interfaceC0298u = (InterfaceC0298u) this.f5260e.get()) != null) {
            boolean z8 = this.f5261f != 0 || this.f5262g;
            EnumC0292n enumC0292nB = b(interfaceC0297t);
            this.f5261f++;
            while (c0299v.f5254a.compareTo(enumC0292nB) < 0 && this.f5258c.f22890e.containsKey(interfaceC0297t)) {
                EnumC0292n enumC0292n3 = c0299v.f5254a;
                ArrayList arrayList = this.i;
                arrayList.add(enumC0292n3);
                C0289k c0289k = EnumC0291m.Companion;
                EnumC0292n enumC0292n4 = c0299v.f5254a;
                c0289k.getClass();
                q5.i.e(enumC0292n4, "state");
                int iOrdinal = enumC0292n4.ordinal();
                EnumC0291m enumC0291m = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0291m.ON_RESUME : EnumC0291m.ON_START : EnumC0291m.ON_CREATE;
                if (enumC0291m == null) {
                    throw new IllegalStateException("no event up from " + c0299v.f5254a);
                }
                c0299v.a(interfaceC0298u, enumC0291m);
                arrayList.remove(arrayList.size() - 1);
                enumC0292nB = b(interfaceC0297t);
            }
            if (!z8) {
                h();
            }
            this.f5261f--;
        }
    }

    public final EnumC0292n b(InterfaceC0297t interfaceC0297t) {
        C0299v c0299v;
        HashMap map = this.f5258c.f22890e;
        C2785c c2785c = map.containsKey(interfaceC0297t) ? ((C2785c) map.get(interfaceC0297t)).f22897d : null;
        EnumC0292n enumC0292n = (c2785c == null || (c0299v = (C0299v) c2785c.f22895b) == null) ? null : c0299v.f5254a;
        ArrayList arrayList = this.i;
        EnumC0292n enumC0292n2 = arrayList.isEmpty() ? null : (EnumC0292n) arrayList.get(arrayList.size() - 1);
        EnumC0292n enumC0292n3 = this.f5259d;
        q5.i.e(enumC0292n3, "state1");
        if (enumC0292n == null || enumC0292n.compareTo(enumC0292n3) >= 0) {
            enumC0292n = enumC0292n3;
        }
        return (enumC0292n2 == null || enumC0292n2.compareTo(enumC0292n) >= 0) ? enumC0292n : enumC0292n2;
    }

    public final void c(String str) {
        if (this.f5257b) {
            C2767b.F().i.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(A.f.m("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(EnumC0291m enumC0291m) {
        q5.i.e(enumC0291m, "event");
        c("handleLifecycleEvent");
        e(enumC0291m.a());
    }

    public final void e(EnumC0292n enumC0292n) {
        EnumC0292n enumC0292n2 = this.f5259d;
        if (enumC0292n2 == enumC0292n) {
            return;
        }
        EnumC0292n enumC0292n3 = EnumC0292n.f5244b;
        EnumC0292n enumC0292n4 = EnumC0292n.f5243a;
        if (enumC0292n2 == enumC0292n3 && enumC0292n == enumC0292n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0292n + ", but was " + this.f5259d + " in component " + this.f5260e.get()).toString());
        }
        this.f5259d = enumC0292n;
        if (this.f5262g || this.f5261f != 0) {
            this.f5263h = true;
            return;
        }
        this.f5262g = true;
        h();
        this.f5262g = false;
        if (this.f5259d == enumC0292n4) {
            this.f5258c = new C2783a();
        }
    }

    public final void f(InterfaceC0297t interfaceC0297t) {
        q5.i.e(interfaceC0297t, "observer");
        c("removeObserver");
        this.f5258c.b(interfaceC0297t);
    }

    public final void g(EnumC0292n enumC0292n) {
        q5.i.e(enumC0292n, "state");
        c("setCurrentState");
        e(enumC0292n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f5263h = false;
        r12.f5264j.J(r12.f5259d);
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
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0300w.h():void");
    }
}
