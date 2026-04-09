package s6;

import android.net.Uri;
import b9.C1992A;
import c9.C2099t;
import d7.C4280c;
import java.util.List;

/* compiled from: VariableAndConstantController.kt */
/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: b, reason: collision with root package name */
    public final k f46100b;

    /* renamed from: c, reason: collision with root package name */
    public final B7.e f46101c;

    public j(k kVar, B7.e eVar) {
        this.f46100b = kVar;
        this.f46101c = eVar;
    }

    @Override // s6.k
    public final Z6.d a(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        return this.f46100b.a(name);
    }

    @Override // s6.k
    public final j6.d b(List names, p9.l observer) {
        kotlin.jvm.internal.l.f(names, "names");
        kotlin.jvm.internal.l.f(observer, "observer");
        return this.f46100b.b(names, observer);
    }

    @Override // s6.k
    public final void e(Z6.d dVar) {
        this.f46100b.e(dVar);
    }

    @Override // s6.k
    public final void g() {
        this.f46100b.g();
    }

    @Override // a7.u
    /* renamed from: get */
    public final Object mo0get(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        Object objMo0get = this.f46101c.mo0get(name);
        if (objMo0get instanceof Uri) {
            String value = objMo0get.toString();
            kotlin.jvm.internal.l.f(value, "value");
            objMo0get = new C4280c(value);
        }
        return objMo0get == null ? this.f46100b.mo0get(name) : objMo0get;
    }

    @Override // s6.k
    public final /* synthetic */ List h() {
        return C2099t.f18581b;
    }

    @Override // s6.k
    public final void k() {
        this.f46100b.k();
    }

    @Override // s6.k
    public final void l(A7.d owner, p9.l<? super Z6.d, C1992A> lVar) {
        kotlin.jvm.internal.l.f(owner, "owner");
        this.f46100b.l(owner, lVar);
    }

    @Override // s6.k
    public final j6.d o(String name, Q6.c cVar, boolean z10, p9.l<? super Z6.d, C1992A> observer) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(observer, "observer");
        return this.f46100b.o(name, cVar, z10, observer);
    }
}
