package a6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static c f159c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f160a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f161b = new ArrayList();

    public static c e() {
        return f159c;
    }

    public Collection a() {
        return Collections.unmodifiableCollection(this.f161b);
    }

    public void b(y5.f fVar) {
        this.f160a.add(fVar);
    }

    public Collection c() {
        return Collections.unmodifiableCollection(this.f160a);
    }

    public void d(y5.f fVar) {
        boolean zG = g();
        this.f160a.remove(fVar);
        this.f161b.remove(fVar);
        if (!zG || g()) {
            return;
        }
        h.d().f();
    }

    public void f(y5.f fVar) {
        boolean zG = g();
        this.f161b.add(fVar);
        if (zG) {
            return;
        }
        h.d().e();
    }

    public boolean g() {
        return this.f161b.size() > 0;
    }
}
