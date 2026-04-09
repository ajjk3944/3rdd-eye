package G5;

import Z1.m;
import Z1.n;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import m0.C5316i;
import o2.C5413d;
import p2.t;
import t4.C5606d;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1910a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1911b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1912c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1913d;

    public c(f fVar, h hVar, j jVar, j jVar2) {
        this.f1912c = fVar;
        this.f1913d = hVar;
        this.f1910a = jVar;
        if (jVar2 == null) {
            this.f1911b = j.NONE;
        } else {
            this.f1911b = jVar2;
        }
    }

    public static c a(f fVar, h hVar, j jVar, j jVar2) {
        C5606d.e(fVar, "CreativeType is null");
        C5606d.e(hVar, "ImpressionType is null");
        C5606d.e(jVar, "Impression owner is null");
        if (jVar == j.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (fVar == f.DEFINED_BY_JAVASCRIPT && jVar == j.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (hVar == h.DEFINED_BY_JAVASCRIPT && jVar == j.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new c(fVar, hVar, jVar, jVar2);
    }

    public void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C5316i) this.f1911b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public c(C5413d c5413d, C5413d c5413d2, C5413d c5413d3, t tVar) {
        this.f1910a = c5413d;
        this.f1911b = c5413d2;
        this.f1912c = c5413d3;
        this.f1913d = tVar;
    }

    public c(Context context, e2.c cVar) {
        Object mVar;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "context.applicationContext");
        Z1.a aVar = new Z1.a(applicationContext, cVar);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext2, "context.applicationContext");
        Z1.c cVar2 = new Z1.c(applicationContext2, cVar);
        Context applicationContext3 = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext3, "context.applicationContext");
        String str = Z1.l.f14004a;
        if (Build.VERSION.SDK_INT >= 24) {
            mVar = new Z1.k(applicationContext3, cVar);
        } else {
            mVar = new m(applicationContext3, cVar);
        }
        Context applicationContext4 = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext4, "context.applicationContext");
        n nVar = new n(applicationContext4, cVar);
        this.f1910a = aVar;
        this.f1911b = cVar2;
        this.f1912c = mVar;
        this.f1913d = nVar;
    }

    public c() {
        this.f1910a = new K0.d(10);
        this.f1911b = new C5316i();
        this.f1912c = new ArrayList();
        this.f1913d = new HashSet();
    }
}
