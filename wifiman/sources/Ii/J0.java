package Ii;

import Ii.InterfaceC3091y0;
import dh.AbstractC5376a;
import dh.InterfaceC5380e;
import java.util.concurrent.CancellationException;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public final class J0 extends AbstractC5376a implements InterfaceC3091y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final J0 f9271b = new J0();

    private J0() {
        super(InterfaceC3091y0.f9363O);
    }

    @Override // Ii.InterfaceC3091y0
    public InterfaceC3082u attachChild(InterfaceC3086w interfaceC3086w) {
        return K0.f9274a;
    }

    @Override // Ii.InterfaceC3091y0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // Ii.InterfaceC3091y0
    public CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // Ii.InterfaceC3091y0
    public InterfaceC8780j getChildren() {
        return AbstractC8783m.i();
    }

    @Override // Ii.InterfaceC3091y0
    public Si.a getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Ii.InterfaceC3091y0
    public InterfaceC3091y0 getParent() {
        return null;
    }

    @Override // Ii.InterfaceC3091y0
    public InterfaceC3052e0 invokeOnCompletion(InterfaceC6835l interfaceC6835l) {
        return K0.f9274a;
    }

    @Override // Ii.InterfaceC3091y0
    public boolean isActive() {
        return true;
    }

    @Override // Ii.InterfaceC3091y0
    public boolean isCancelled() {
        return false;
    }

    @Override // Ii.InterfaceC3091y0
    public boolean isCompleted() {
        return false;
    }

    @Override // Ii.InterfaceC3091y0
    public Object join(InterfaceC5380e interfaceC5380e) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Ii.InterfaceC3091y0
    public InterfaceC3091y0 plus(InterfaceC3091y0 interfaceC3091y0) {
        return InterfaceC3091y0.a.f(this, interfaceC3091y0);
    }

    @Override // Ii.InterfaceC3091y0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // Ii.InterfaceC3091y0
    public void cancel(CancellationException cancellationException) {
    }

    @Override // Ii.InterfaceC3091y0
    public InterfaceC3052e0 invokeOnCompletion(boolean z10, boolean z11, InterfaceC6835l interfaceC6835l) {
        return K0.f9274a;
    }

    @Override // Ii.InterfaceC3091y0
    public /* synthetic */ boolean cancel(Throwable th2) {
        return false;
    }
}
