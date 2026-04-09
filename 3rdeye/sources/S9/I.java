package S9;

import R9.C1565b;
import R9.C1567d;
import java.util.LinkedHashMap;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes3.dex */
public final class I extends F {

    /* renamed from: g, reason: collision with root package name */
    public String f12028g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12029h;

    @Override // S9.F, S9.AbstractC1571c
    public final R9.i W() {
        return new R9.z(this.f12020f);
    }

    @Override // S9.F, S9.AbstractC1571c
    public final void X(R9.i element, String key) {
        kotlin.jvm.internal.l.f(key, "key");
        kotlin.jvm.internal.l.f(element, "element");
        if (!this.f12029h) {
            LinkedHashMap linkedHashMap = this.f12020f;
            String str = this.f12028g;
            if (str == null) {
                kotlin.jvm.internal.l.l("tag");
                throw null;
            }
            linkedHashMap.put(str, element);
            this.f12029h = true;
            return;
        }
        if (element instanceof R9.C) {
            this.f12028g = ((R9.C) element).c();
            this.f12029h = false;
        } else {
            if (element instanceof R9.z) {
                throw E.u.g(R9.B.f11774b);
            }
            if (!(element instanceof C1565b)) {
                throw new b9.j();
            }
            throw E.u.g(C1567d.f11787b);
        }
    }
}
