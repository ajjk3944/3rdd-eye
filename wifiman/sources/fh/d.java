package Fh;

import Gh.B;
import Gh.q;
import Jh.InterfaceC3126u;
import Qh.u;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* loaded from: classes4.dex */
public final class d implements InterfaceC3126u {

    /* renamed from: a, reason: collision with root package name */
    private final ClassLoader f6671a;

    public d(ClassLoader classLoader) {
        AbstractC6492s.i(classLoader, "classLoader");
        this.f6671a = classLoader;
    }

    @Override // Jh.InterfaceC3126u
    public u a(Zh.c fqName, boolean z10) {
        AbstractC6492s.i(fqName, "fqName");
        return new B(fqName);
    }

    @Override // Jh.InterfaceC3126u
    public Set b(Zh.c packageFqName) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        return null;
    }

    @Override // Jh.InterfaceC3126u
    public Qh.g c(InterfaceC3126u.a request) {
        AbstractC6492s.i(request, "request");
        Zh.b bVarA = request.a();
        Zh.c cVarF = bVarA.f();
        String strB = bVarA.g().b();
        AbstractC6492s.h(strB, "asString(...)");
        String strK = t.K(strB, '.', '$', false, 4, null);
        if (!cVarF.d()) {
            strK = cVarF.b() + '.' + strK;
        }
        Class clsA = e.a(this.f6671a, strK);
        if (clsA != null) {
            return new q(clsA);
        }
        return null;
    }
}
