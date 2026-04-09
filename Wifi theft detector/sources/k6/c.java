package k6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static c f21863c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21864a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21865b = new ArrayList();

    public static c e() {
        return f21863c;
    }

    public Collection a() {
        return Collections.unmodifiableCollection(this.f21865b);
    }

    public void b(i6.h hVar) {
        this.f21864a.add(hVar);
    }

    public Collection c() {
        return Collections.unmodifiableCollection(this.f21864a);
    }

    public void d(i6.h hVar) {
        boolean zG = g();
        this.f21864a.remove(hVar);
        this.f21865b.remove(hVar);
        if (!zG || g()) {
            return;
        }
        i.d().f();
    }

    public void f(i6.h hVar) {
        boolean zG = g();
        this.f21865b.add(hVar);
        if (zG) {
            return;
        }
        i.d().e();
    }

    public boolean g() {
        return this.f21865b.size() > 0;
    }
}
