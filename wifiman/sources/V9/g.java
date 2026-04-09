package V9;

import U9.C3621h;
import Yg.J;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class g extends f {

    /* renamed from: e, reason: collision with root package name */
    private final C3621h f23288e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6824a f23289f;

    public g(C3621h activityController, InterfaceC6824a onCreateAccountClicked) {
        AbstractC6492s.i(activityController, "activityController");
        AbstractC6492s.i(onCreateAccountClicked, "onCreateAccountClicked");
        this.f23288e = activityController;
        this.f23289f = onCreateAccountClicked;
    }

    @Override // V9.f
    public Object H(InterfaceC5380e interfaceC5380e) {
        this.f23288e.e0(C3621h.a.InterfaceC0821a.C0822a.f22210a);
        return J.f24997a;
    }

    @Override // V9.f
    public Object e0(InterfaceC5380e interfaceC5380e) {
        this.f23288e.e0(C3621h.a.InterfaceC0821a.C0822a.f22210a);
        return J.f24997a;
    }

    @Override // V9.f
    public Object f0(InterfaceC5380e interfaceC5380e) {
        this.f23289f.invoke();
        return J.f24997a;
    }
}
