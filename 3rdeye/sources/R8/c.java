package r8;

import kotlin.jvm.internal.l;
import va.a;
import y9.n;
import y9.r;

/* compiled from: TimberLogger.kt */
/* loaded from: classes3.dex */
public final class c extends a.c {

    /* renamed from: b, reason: collision with root package name */
    public final String f45830b;

    public c(Object thisRef, String str) {
        l.f(thisRef, "thisRef");
        if (str == null) {
            String simpleName = thisRef.getClass().getSimpleName();
            if (n.T(simpleName, "Impl")) {
                simpleName = simpleName.substring(0, simpleName.length() - 4);
                l.e(simpleName, "substring(...)");
            }
            str = simpleName.length() > 23 ? r.z0(23, n.X(n.X(n.X(n.X(simpleName, "Fragment", "Frag"), "ViewModel", "VM"), "Controller", "Ctrl"), "Manager", "Mgr")) : simpleName;
        }
        this.f45830b = str;
    }

    @Override // va.a.c
    public final void i(String str, int i, String message, Throwable th) {
        l.f(message, "message");
        a.b bVar = va.a.f47104a;
        if (str == null) {
            str = this.f45830b;
        }
        bVar.o(str);
        bVar.h(i, th, message, new Object[0]);
    }
}
