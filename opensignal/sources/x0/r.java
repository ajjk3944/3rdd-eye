package x0;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final y1.p f24738a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24740c;

    /* renamed from: h, reason: collision with root package name */
    public s9.g f24745h;

    /* renamed from: i, reason: collision with root package name */
    public q f24746i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f24739b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final au.v f24741d = new au.v(6, this);

    /* renamed from: e, reason: collision with root package name */
    public final cg.j f24742e = new cg.j(16, this);

    /* renamed from: f, reason: collision with root package name */
    public final p0.e f24743f = new p0.e(new q[16]);

    /* renamed from: g, reason: collision with root package name */
    public final Object f24744g = new Object();
    public long j = -1;

    public r(y1.p pVar) {
        this.f24738a = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        boolean z10;
        Set set;
        Set set2;
        synchronized (this.f24744g) {
            z10 = this.f24740c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = this.f24739b;
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
                        n0.q.d("Unexpected notification");
                        throw new bf.n();
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
                return z11;
            }
            synchronized (this.f24744g) {
                p0.e eVar = this.f24743f;
                Object[] objArr = eVar.f20230a;
                int i10 = eVar.f20232g;
                for (int i11 = 0; i11 < i10; i11++) {
                    z11 = ((q) objArr[i11]).b(set) || z11;
                }
            }
        }
    }
}
