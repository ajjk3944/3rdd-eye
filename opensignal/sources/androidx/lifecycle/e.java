package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1494a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1495d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1496g;

    public e(DefaultLifecycleObserver defaultLifecycleObserver, t tVar) {
        br.l.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f1495d = defaultLifecycleObserver;
        this.f1496g = tVar;
    }

    @Override // androidx.lifecycle.t
    public final void b(v vVar, m mVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f1494a) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f1495d;
                switch (d.f1493a[mVar.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(vVar);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(vVar);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(vVar);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(vVar);
                        break;
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        defaultLifecycleObserver.onStop(vVar);
                        break;
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        defaultLifecycleObserver.onDestroy(vVar);
                        break;
                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new bf.n();
                }
                t tVar = (t) this.f1496g;
                if (tVar != null) {
                    tVar.b(vVar, mVar);
                    return;
                }
                return;
            case 1:
                if (mVar == m.ON_START) {
                    ((o) this.f1495d).m1(this);
                    ((io.sentry.t) this.f1496g).I();
                    return;
                }
                return;
            default:
                HashMap map = ((a) this.f1496g).f1471a;
                List list = (List) map.get(mVar);
                Object obj = this.f1495d;
                a.a(list, vVar, mVar, obj);
                a.a((List) map.get(m.ON_ANY), vVar, mVar, obj);
                return;
        }
    }

    public e(u uVar) {
        this.f1495d = uVar;
        c cVar = c.f1481c;
        Class<?> cls = uVar.getClass();
        a aVar = (a) cVar.f1482a.get(cls);
        this.f1496g = aVar == null ? cVar.a(cls, null) : aVar;
    }

    public e(o oVar, io.sentry.t tVar) {
        this.f1495d = oVar;
        this.f1496g = tVar;
    }
}
