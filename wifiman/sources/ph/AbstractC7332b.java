package ph;

import kotlin.jvm.internal.AbstractC6492s;
import th.l;

/* renamed from: ph.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7332b implements d {

    /* renamed from: a, reason: collision with root package name */
    private Object f58041a;

    public AbstractC7332b(Object obj) {
        this.f58041a = obj;
    }

    @Override // ph.d, ph.c
    public Object a(Object obj, l property) {
        AbstractC6492s.i(property, "property");
        return this.f58041a;
    }

    @Override // ph.d
    public void b(Object obj, l property, Object obj2) {
        AbstractC6492s.i(property, "property");
        Object obj3 = this.f58041a;
        if (d(property, obj3, obj2)) {
            this.f58041a = obj2;
            c(property, obj3, obj2);
        }
    }

    protected void c(l property, Object obj, Object obj2) {
        AbstractC6492s.i(property, "property");
    }

    protected boolean d(l property, Object obj, Object obj2) {
        AbstractC6492s.i(property, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f58041a + ')';
    }
}
