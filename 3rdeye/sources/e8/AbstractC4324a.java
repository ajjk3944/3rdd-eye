package e8;

import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import e.AbstractC4292c;
import x2.AbstractActivityC5757a;

/* compiled from: BasePermissionRequester.kt */
/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4324a implements InterfaceC1771d {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC5757a f37760b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37761c;

    public AbstractC4324a(AbstractActivityC5757a abstractActivityC5757a) {
        this.f37760b = abstractActivityC5757a;
        abstractActivityC5757a.getLifecycle().addObserver(this);
    }

    public abstract AbstractC4292c<?> a();

    public abstract void b();

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onDestroy(InterfaceC1790x interfaceC1790x) {
        a().d();
        interfaceC1790x.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onCreate(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onPause(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onResume(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final /* synthetic */ void onStart(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStop(InterfaceC1790x interfaceC1790x) {
    }
}
