package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1152a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1153b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1154c;

    public j(h hVar, y yVar) {
        nk.k.e(hVar, "defaultLifecycleObserver");
        this.f1153b = hVar;
        this.f1154c = yVar;
    }

    @Override // androidx.lifecycle.y
    public final void g(a0 a0Var, r rVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f1152a) {
            case 0:
                h hVar = (h) this.f1153b;
                switch (i.f1145a[rVar.ordinal()]) {
                    case 1:
                        hVar.e(a0Var);
                        break;
                    case 2:
                        hVar.onStart(a0Var);
                        break;
                    case 3:
                        hVar.c(a0Var);
                        break;
                    case 4:
                        hVar.m(a0Var);
                        break;
                    case 5:
                        hVar.onStop(a0Var);
                        break;
                    case 6:
                        hVar.onDestroy(a0Var);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new ac.m();
                }
                y yVar = (y) this.f1154c;
                if (yVar != null) {
                    yVar.g(a0Var, rVar);
                    return;
                }
                return;
            case 1:
                if (rVar == r.ON_START) {
                    ((t) this.f1153b).b(this);
                    ((yb.i) this.f1154c).R();
                    return;
                }
                return;
            default:
                HashMap map = ((b) this.f1154c).f1097a;
                List list = (List) map.get(rVar);
                Object obj = this.f1153b;
                b.a(list, a0Var, rVar, obj);
                b.a((List) map.get(r.ON_ANY), a0Var, rVar, obj);
                return;
        }
    }

    public j(z zVar) {
        this.f1153b = zVar;
        d dVar = d.f1117c;
        Class<?> cls = zVar.getClass();
        b bVar = (b) dVar.f1118a.get(cls);
        this.f1154c = bVar == null ? dVar.a(cls, null) : bVar;
    }

    public j(t tVar, yb.i iVar) {
        this.f1153b = tVar;
        this.f1154c = iVar;
    }
}
