package q5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static c f24053c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24054a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24055b = new ArrayList();

    public static c e() {
        return f24053c;
    }

    public Collection a() {
        return Collections.unmodifiableCollection(this.f24055b);
    }

    public void b(o5.g gVar) {
        this.f24054a.add(gVar);
    }

    public Collection c() {
        return Collections.unmodifiableCollection(this.f24054a);
    }

    public void d(o5.g gVar) {
        boolean zG = g();
        this.f24054a.remove(gVar);
        this.f24055b.remove(gVar);
        if (!zG || g()) {
            return;
        }
        i.d().f();
    }

    public void f(o5.g gVar) {
        boolean zG = g();
        this.f24055b.add(gVar);
        if (zG) {
            return;
        }
        i.d().e();
    }

    public boolean g() {
        return this.f24055b.size() > 0;
    }
}
