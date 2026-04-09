package s7;

import Zg.AbstractC3689v;
import Zg.d0;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import kotlin.jvm.internal.AbstractC6492s;
import r7.C7577a;

/* loaded from: classes3.dex */
public final class j extends AbstractC7915b {

    /* renamed from: b, reason: collision with root package name */
    private final String f61376b;

    /* renamed from: c, reason: collision with root package name */
    private C7916c f61377c;

    /* renamed from: d, reason: collision with root package name */
    private final SortedSet f61378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C7916c identification) {
        super(null);
        AbstractC6492s.i(identification, "identification");
        this.f61376b = identification.a();
        this.f61377c = identification;
        this.f61378d = d0.d(new C7577a[0]);
    }

    @Override // s7.AbstractC7915b
    public Set c() {
        return this.f61378d;
    }

    public final void f(AbstractC7914a connection, int i10) {
        AbstractC6492s.i(connection, "connection");
        this.f61378d.add(new C7577a(i10, connection));
    }

    public String g() {
        return this.f61376b;
    }

    public final C7922i h() {
        return new C7922i(g(), AbstractC3689v.n1(c()), b());
    }

    public final void i(C7920g result, int i10) {
        AbstractC6492s.i(result, "result");
        this.f61377c.f(result.c());
        f(result.a(), i10);
        Iterator it = result.b().iterator();
        while (it.hasNext()) {
            a((InterfaceC7921h) it.next(), i10);
        }
    }
}
