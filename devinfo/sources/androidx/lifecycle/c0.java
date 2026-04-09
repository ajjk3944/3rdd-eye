package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 extends t {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1108b;

    /* renamed from: c, reason: collision with root package name */
    public r.a f1109c;

    /* renamed from: d, reason: collision with root package name */
    public s f1110d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f1111e;

    /* renamed from: f, reason: collision with root package name */
    public int f1112f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1113h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1114i;
    public final al.i1 j;

    public c0(a0 a0Var, boolean z3) {
        this.f1186a = new i1();
        this.f1108b = z3;
        this.f1109c = new r.a();
        s sVar = s.f1181b;
        this.f1110d = sVar;
        this.f1114i = new ArrayList();
        this.f1111e = new WeakReference(a0Var);
        this.j = al.z0.b(sVar);
    }

    @Override // androidx.lifecycle.t
    public final void a(z zVar) {
        y jVar;
        Object obj;
        a0 a0Var;
        nk.k.e(zVar, "observer");
        d("addObserver");
        s sVar = this.f1110d;
        s sVar2 = s.f1180a;
        if (sVar != sVar2) {
            sVar2 = s.f1181b;
        }
        b0 b0Var = new b0();
        HashMap map = e0.f1126a;
        boolean z3 = zVar instanceof y;
        boolean z10 = zVar instanceof h;
        if (z3 && z10) {
            jVar = new j((h) zVar, (y) zVar);
        } else if (z10) {
            jVar = new j((h) zVar, (y) null);
        } else if (z3) {
            jVar = (y) zVar;
        } else {
            Class<?> cls = zVar.getClass();
            if (e0.b(cls) == 2) {
                Object obj2 = e0.f1127b.get(cls);
                nk.k.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    e0.a((Constructor) list.get(0), zVar);
                    throw null;
                }
                int size = list.size();
                m[] mVarArr = new m[size];
                if (size > 0) {
                    e0.a((Constructor) list.get(0), zVar);
                    throw null;
                }
                jVar = new e(i, mVarArr);
            } else {
                jVar = new j(zVar);
            }
        }
        b0Var.f1100b = jVar;
        b0Var.f1099a = sVar2;
        r.a aVar = this.f1109c;
        r.c cVarA = aVar.a(zVar);
        if (cVarA != null) {
            obj = cVarA.f32476b;
        } else {
            HashMap map2 = aVar.f32471e;
            r.c cVar = new r.c(zVar, b0Var);
            aVar.f32485d++;
            r.c cVar2 = aVar.f32483b;
            if (cVar2 == null) {
                aVar.f32482a = cVar;
                aVar.f32483b = cVar;
            } else {
                cVar2.f32477c = cVar;
                cVar.f32478d = cVar2;
                aVar.f32483b = cVar;
            }
            map2.put(zVar, cVar);
            obj = null;
        }
        if (((b0) obj) == null && (a0Var = (a0) this.f1111e.get()) != null) {
            i = (this.f1112f != 0 || this.g) ? 1 : 0;
            s sVarC = c(zVar);
            this.f1112f++;
            while (b0Var.f1099a.compareTo(sVarC) < 0 && this.f1109c.f32471e.containsKey(zVar)) {
                s sVar3 = b0Var.f1099a;
                ArrayList arrayList = this.f1114i;
                arrayList.add(sVar3);
                p pVar = r.Companion;
                s sVar4 = b0Var.f1099a;
                pVar.getClass();
                nk.k.e(sVar4, "state");
                int iOrdinal = sVar4.ordinal();
                r rVar = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : r.ON_RESUME : r.ON_START : r.ON_CREATE;
                if (rVar == null) {
                    throw new IllegalStateException("no event up from " + b0Var.f1099a);
                }
                b0Var.a(a0Var, rVar);
                arrayList.remove(arrayList.size() - 1);
                sVarC = c(zVar);
            }
            if (i == 0) {
                h();
            }
            this.f1112f--;
        }
    }

    @Override // androidx.lifecycle.t
    public final void b(z zVar) {
        nk.k.e(zVar, "observer");
        d("removeObserver");
        this.f1109c.c(zVar);
    }

    public final s c(z zVar) {
        HashMap map = this.f1109c.f32471e;
        r.c cVar = map.containsKey(zVar) ? ((r.c) map.get(zVar)).f32478d : null;
        s sVar = cVar != null ? ((b0) cVar.f32476b).f1099a : null;
        ArrayList arrayList = this.f1114i;
        s sVar2 = arrayList.isEmpty() ? null : (s) je.u.p(1, arrayList);
        s sVar3 = this.f1110d;
        nk.k.e(sVar3, "state1");
        if (sVar == null || sVar.compareTo(sVar3) >= 0) {
            sVar = sVar3;
        }
        return (sVar2 == null || sVar2.compareTo(sVar) >= 0) ? sVar : sVar2;
    }

    public final void d(String str) {
        if (this.f1108b && !q.a.G().H()) {
            throw new IllegalStateException(d.h.t("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(r rVar) {
        nk.k.e(rVar, "event");
        d("handleLifecycleEvent");
        f(rVar.a());
    }

    public final void f(s sVar) {
        if (this.f1110d == sVar) {
            return;
        }
        a0 a0Var = (a0) this.f1111e.get();
        s sVar2 = this.f1110d;
        nk.k.e(sVar2, "current");
        s sVar3 = s.f1181b;
        s sVar4 = s.f1180a;
        if (sVar2 == sVar3 && sVar == sVar4) {
            throw new IllegalStateException(("State must be at least '" + s.f1182c + "' to be moved to '" + sVar + "' in component " + a0Var).toString());
        }
        if (sVar2 == sVar4 && sVar2 != sVar) {
            throw new IllegalStateException(("State is '" + sVar4 + "' and cannot be moved to `" + sVar + "` in component " + a0Var).toString());
        }
        this.f1110d = sVar;
        if (this.g || this.f1112f != 0) {
            this.f1113h = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.f1110d == sVar4) {
            this.f1109c = new r.a();
        }
    }

    public final void g() {
        d("setCurrentState");
        f(s.f1182c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r12.f1113h = false;
        r0 = r12.f1110d;
        r1 = r12.j;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r0 = bl.c.f2285b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r1.j(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.c0.h():void");
    }
}
