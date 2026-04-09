package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nn implements y50 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public /* synthetic */ nn(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.y50
    public final void a(b60 b60Var, t50 t50Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f) {
            case 0:
                sr srVar = (sr) this.g;
                switch (mn.a[t50Var.ordinal()]) {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 3:
                        (Build.VERSION.SDK_INT >= 28 ? lh.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new vr(0), 500L);
                        srVar.f.f(srVar);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new rg();
                }
                y50 y50Var = (y50) this.h;
                if (y50Var != null) {
                    y50Var.a(b60Var, t50Var);
                    return;
                }
                return;
            case 1:
                if (t50Var == t50.ON_START) {
                    ((d60) this.g).f(this);
                    ((vq2) this.h).r();
                    return;
                }
                return;
            default:
                jf jfVar = (jf) this.h;
                a60 a60Var = (a60) this.g;
                HashMap map = jfVar.a;
                jf.a((List) map.get(t50Var), b60Var, t50Var, a60Var);
                jf.a((List) map.get(t50.ON_ANY), b60Var, t50Var, a60Var);
                return;
        }
    }

    public nn(a60 a60Var) {
        this.f = 2;
        this.g = a60Var;
        lf lfVar = lf.c;
        Class<?> cls = a60Var.getClass();
        jf jfVar = (jf) lfVar.a.get(cls);
        this.h = jfVar == null ? lfVar.a(cls, null) : jfVar;
    }
}
