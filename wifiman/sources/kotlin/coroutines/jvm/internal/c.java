package kotlin.coroutines.jvm.internal;

import dh.InterfaceC5380e;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
public final class c implements InterfaceC5380e {

    /* renamed from: a, reason: collision with root package name */
    public static final c f51674a = new c();

    private c() {
    }

    @Override // dh.InterfaceC5380e
    public InterfaceC5384i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // dh.InterfaceC5380e
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
