package ui;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class e extends AbstractC8175a {

    /* renamed from: a, reason: collision with root package name */
    private c f63079a;

    protected e(c arrayMap) {
        AbstractC6492s.i(arrayMap, "arrayMap");
        this.f63079a = arrayMap;
    }

    @Override // ui.AbstractC8175a
    protected final c b() {
        return this.f63079a;
    }

    @Override // ui.AbstractC8175a
    protected final void f(String keyQualifiedName, Object value) {
        AbstractC6492s.i(keyQualifiedName, "keyQualifiedName");
        AbstractC6492s.i(value, "value");
        int iD = e().d(keyQualifiedName);
        int iB = this.f63079a.b();
        if (iB == 0) {
            this.f63079a = new o(value, iD);
            return;
        }
        if (iB == 1) {
            c cVar = this.f63079a;
            AbstractC6492s.g(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            o oVar = (o) cVar;
            if (oVar.f() == iD) {
                this.f63079a = new o(value, iD);
                return;
            } else {
                d dVar = new d();
                this.f63079a = dVar;
                dVar.e(oVar.f(), oVar.g());
            }
        }
        this.f63079a.e(iD, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        i iVar = i.f63092a;
        AbstractC6492s.g(iVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(iVar);
    }
}
