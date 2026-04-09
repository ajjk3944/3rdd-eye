package U7;

import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;

/* compiled from: InterstitialManager.kt */
/* loaded from: classes3.dex */
public final class d implements InterfaceC1771d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f12505b;

    public d(f fVar) {
        this.f12505b = fVar;
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStart(InterfaceC1790x interfaceC1790x) {
        f fVar = this.f12505b;
        Boolean bool = fVar.f12517l;
        fVar.f12517l = Boolean.TRUE;
        if (bool != null) {
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            fVar.f12518m = lValueOf;
            va.a.f47104a.a("[InterstitialManager] lastHotStartTime = " + lValueOf, new Object[0]);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStop(InterfaceC1790x interfaceC1790x) {
        this.f12505b.f12517l = Boolean.FALSE;
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onCreate(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onDestroy(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onPause(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onResume(InterfaceC1790x interfaceC1790x) {
    }
}
