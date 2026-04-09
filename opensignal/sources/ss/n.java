package ss;

import ir.v;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public Object f22248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f22249b;

    public n(Object obj, o oVar) {
        this.f22249b = oVar;
        this.f22248a = obj;
    }

    public final Object a(v vVar, Object obj) {
        br.l.e(vVar, "property");
        return this.f22248a;
    }

    public final void b(v vVar, Object obj) {
        br.l.e(vVar, "property");
        br.l.e(vVar, "property");
        if (this.f22249b.f22250a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.f22248a = obj;
        br.l.e(vVar, "property");
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f22248a + ')';
    }
}
