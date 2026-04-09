package we;

import android.os.Bundle;
import cc.s;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.i1;
import et.d;
import java.util.concurrent.ConcurrentHashMap;
import oh.p;
import om.f;
import y9.u;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f24484c;

    /* renamed from: a, reason: collision with root package name */
    public final u f24485a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f24486b;

    public c(u uVar) {
        s.h(uVar);
        this.f24485a = uVar;
        this.f24486b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (xe.a.a(str) && xe.a.b(str2, bundle) && xe.a.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            i1 i1Var = (i1) this.f24485a.f25996d;
            i1Var.c(new c1(i1Var, str, str2, bundle, true));
        }
    }

    public final d b(String str, io.sentry.internal.debugmeta.c cVar) {
        if (xe.a.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f24486b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                u uVar = this.f24485a;
                Object fVar = zEquals ? new f(uVar, cVar) : "clx".equals(str) ? new p(uVar, cVar) : null;
                if (fVar != null) {
                    concurrentHashMap.put(str, fVar);
                    return new d();
                }
            }
        }
        return null;
    }
}
