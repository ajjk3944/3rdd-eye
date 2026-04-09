package m;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    HashSet<o> f2955a = new HashSet<>(2);

    /* renamed from: b, reason: collision with root package name */
    int f2956b = 0;

    public void a(o oVar) {
        this.f2955a.add(oVar);
    }

    public void b() {
        this.f2956b = 1;
        Iterator<o> it = this.f2955a.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public void c() {
        this.f2956b = 0;
        Iterator<o> it = this.f2955a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public boolean d() {
        return this.f2956b == 1;
    }

    public void e() {
        this.f2956b = 0;
        this.f2955a.clear();
    }

    public void f() {
    }
}
