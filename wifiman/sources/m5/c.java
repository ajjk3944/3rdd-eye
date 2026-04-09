package m5;

import F4.q;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f53142a;

    /* renamed from: b, reason: collision with root package name */
    private final d f53143b;

    c(Set set, d dVar) {
        this.f53142a = e(set);
        this.f53143b = dVar;
    }

    public static F4.c c() {
        return F4.c.e(i.class).b(q.m(f.class)).e(new F4.g() { // from class: m5.b
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return c.d(dVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(F4.d dVar) {
        return new c(dVar.g(f.class), d.a());
    }

    private static String e(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.b());
            sb2.append('/');
            sb2.append(fVar.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // m5.i
    public String a() {
        if (this.f53143b.b().isEmpty()) {
            return this.f53142a;
        }
        return this.f53142a + ' ' + e(this.f53143b.b());
    }
}
