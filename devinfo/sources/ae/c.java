package ae;

import android.os.Bundle;
import bf.f;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.k1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f353c;

    /* renamed from: a, reason: collision with root package name */
    public final o7.d f354a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f355b;

    public c(o7.d dVar) {
        y.h(dVar);
        this.f354a = dVar;
        this.f355b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!be.a.f2142c.contains(str) && be.a.a(bundle, str2) && be.a.b(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            k1 k1Var = (k1) this.f354a.f30421b;
            k1Var.c(new e1(k1Var, str, str2, bundle, true));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f b(String str, y4.a aVar) {
        jf.c cVar;
        if (!be.a.f2142c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f355b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                o7.d dVar = this.f354a;
                if (zEquals) {
                    y4.a aVar2 = new y4.a();
                    aVar2.f37324b = aVar;
                    dVar.o(new be.b(0, aVar2));
                    aVar2.f37323a = new HashSet();
                    cVar = aVar2;
                } else {
                    cVar = "clx".equals(str) ? new jf.c(dVar, aVar) : null;
                }
                if (cVar != null) {
                    concurrentHashMap.put(str, cVar);
                    return new f(2);
                }
            }
        }
        return null;
    }
}
