package R9;

import Q9.j;
import androidx.lifecycle.InterfaceC4007e;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.N;
import hg.C6042b;
import hg.InterfaceC6043c;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class a extends N implements InterfaceC4007e {

    /* renamed from: b, reason: collision with root package name */
    public j f19592b;

    /* renamed from: c, reason: collision with root package name */
    private final C6042b f19593c = new C6042b();

    /* renamed from: d, reason: collision with root package name */
    private final C6042b f19594d = new C6042b();

    @Override // androidx.lifecycle.N
    protected void W() {
        super.W();
        this.f19594d.d();
    }

    public j X() {
        j jVar = this.f19592b;
        if (jVar != null) {
            return jVar;
        }
        AbstractC6492s.v("viewRouter");
        return null;
    }

    public void Y() {
    }

    public void Z() {
    }

    public void a0() {
    }

    public void b0(j jVar) {
        AbstractC6492s.i(jVar, "<set-?>");
        this.f19592b = jVar;
    }

    protected final void c0(InterfaceC6043c disposable) {
        AbstractC6492s.i(disposable, "disposable");
        this.f19594d.a(disposable);
    }

    protected final void d0(InterfaceC6043c disposable) {
        AbstractC6492s.i(disposable, "disposable");
        this.f19593c.a(disposable);
    }

    @Override // androidx.lifecycle.InterfaceC4007e
    public void onStop(InterfaceC4017o owner) {
        AbstractC6492s.i(owner, "owner");
        super.onStop(owner);
        a0();
        this.f19593c.d();
    }
}
