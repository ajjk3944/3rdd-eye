package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class r extends t {

    /* renamed from: l, reason: collision with root package name */
    public k.b f3537l = new k.b();

    @Override // androidx.lifecycle.LiveData
    public void g() {
        Iterator it = this.f3537l.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.z.a(((Map.Entry) it.next()).getValue());
            throw null;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void h() {
        Iterator it = this.f3537l.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.z.a(((Map.Entry) it.next()).getValue());
            throw null;
        }
    }
}
