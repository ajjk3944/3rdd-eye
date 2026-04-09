package g1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final j2.n f24286a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24288c;

    /* renamed from: h, reason: collision with root package name */
    public ca.b f24292h;

    /* renamed from: i, reason: collision with root package name */
    public t f24293i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f24287b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final bl.z f24289d = new bl.z(5, this);

    /* renamed from: e, reason: collision with root package name */
    public final b7.u f24290e = new b7.u(7, this);

    /* renamed from: f, reason: collision with root package name */
    public final w0.e f24291f = new w0.e(new t[16]);
    public final Object g = new Object();
    public long j = -1;

    public u(j2.n nVar) {
        this.f24286a = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        boolean z3;
        Set set;
        Set set2;
        synchronized (this.g) {
            z3 = this.f24288c;
        }
        if (z3) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            AtomicReference atomicReference = this.f24287b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List listSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        u0.r.b("Unexpected notification");
                        throw new ac.m();
                    }
                    List list2 = (List) obj;
                    Set set3 = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        listSubList = list2.get(1);
                    } else if (list2.size() > 2) {
                        listSubList = list2.subList(1, list2.size());
                    }
                    set2 = set3;
                    list = listSubList;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z10;
            }
            synchronized (this.g) {
                w0.e eVar = this.f24291f;
                Object[] objArr = eVar.f36397a;
                int i4 = eVar.f36399c;
                for (int i10 = 0; i10 < i4; i10++) {
                    z10 = ((t) objArr[i10]).a(set) || z10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r24, mk.c r25, mk.a r26) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.u.b(java.lang.Object, mk.c, mk.a):void");
    }
}
